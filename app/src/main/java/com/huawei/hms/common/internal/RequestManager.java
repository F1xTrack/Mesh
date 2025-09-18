package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;

    /* renamed from: b */
    private static volatile RequestManager f18960b;

    /* renamed from: c */
    private static Handler f18961c;

    /* renamed from: a */
    private static final Object f18959a = new Object();

    /* renamed from: d */
    private static Queue<HuaweiApi.RequestHandler> f18962d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    private static Map<String, HuaweiApi.RequestHandler> f18963e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        f18961c = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f18962d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f18961c == null) {
            return;
        }
        HMSLog.m12622i("RequestManager", "addToConnectedReqMap");
        f18961c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f18963e.put(str, requestHandler);
            }
        });
    }

    /* renamed from: b */
    private void m11623b() {
        while (!f18962d.isEmpty()) {
            HuaweiApi.RequestHandler requestHandlerPoll = f18962d.poll();
            if (requestHandlerPoll != null) {
                Object client = requestHandlerPoll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    requestHandlerPoll.onConnected();
                }
            }
        }
    }

    /* renamed from: c */
    private void m11624c() {
        HMSLog.m12622i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f18962d.isEmpty()) {
            f18962d.poll().onConnectionSuspended(1);
        }
        m11625d();
    }

    /* renamed from: d */
    private void m11625d() {
        HMSLog.m12622i("RequestManager", "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + f18963e.size());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = f18963e.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e) {
                HMSLog.m12620e("RequestManager", "NOTIFY_CONNECT_SUSPENDED Exception: " + e.getMessage());
            }
            it.remove();
        }
    }

    public static Handler getHandler() {
        return f18961c;
    }

    public static RequestManager getInstance() {
        synchronized (f18959a) {
            try {
                if (f18960b == null) {
                    HandlerThread handlerThread = new HandlerThread("RequestManager");
                    handlerThread.start();
                    f18960b = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18960b;
    }

    public static void removeReqByTransId(final String str) {
        if (f18961c == null) {
            return;
        }
        HMSLog.m12622i("RequestManager", "removeReqByTransId");
        f18961c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f18963e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.m12622i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                m11623b();
                break;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                m11622a(message);
                break;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                m11624c();
                break;
            default:
                HMSLog.m12622i("RequestManager", "handleMessage unknown msg:" + message.what);
                break;
        }
        return false;
    }

    /* renamed from: a */
    private void m11622a(Message message) {
        HMSLog.m12622i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f18962d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e) {
            HMSLog.m12620e("RequestManager", "<handleConnectFailed> handle Failed" + e.getMessage());
        }
    }
}
