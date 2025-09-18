package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0852NX;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {

    /* renamed from: a */
    private CountDownLatch f19505a;

    /* renamed from: c */
    private WeakReference<ApiClient> f19507c;
    protected DatagramTransport transport = null;

    /* renamed from: b */
    private R f19506b = null;

    /* renamed from: d */
    private String f19508d = null;

    /* renamed from: e */
    private String f19509e = null;

    /* renamed from: f */
    private boolean f19510f = true;

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$a */
    public class C2248a implements DatagramTransport.InterfaceC2262a {
        public C2248a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC2262a
        /* renamed from: a */
        public void mo12574a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.m12570a(i, iMessageEntity);
            PendingResultImpl.this.f19505a.countDown();
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$b */
    public class C2249b implements DatagramTransport.InterfaceC2262a {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f19512a;

        public C2249b(AtomicBoolean atomicBoolean) {
            this.f19512a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC2262a
        /* renamed from: a */
        public void mo12574a(int i, IMessageEntity iMessageEntity) {
            if (!this.f19512a.get()) {
                PendingResultImpl.this.m12570a(i, iMessageEntity);
            }
            PendingResultImpl.this.f19505a.countDown();
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$c */
    public class C2250c implements DatagramTransport.InterfaceC2262a {

        /* renamed from: a */
        final /* synthetic */ HandlerC2251d f19514a;

        /* renamed from: b */
        final /* synthetic */ ResultCallback f19515b;

        public C2250c(HandlerC2251d handlerC2251d, ResultCallback resultCallback) {
            this.f19514a = handlerC2251d;
            this.f19515b = resultCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.support.api.transport.DatagramTransport.InterfaceC2262a
        /* renamed from: a */
        public void mo12574a(int i, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.m12570a(i, iMessageEntity);
            this.f19514a.m12575a(this.f19515b, PendingResultImpl.this.f19506b);
        }
    }

    /* renamed from: com.huawei.hms.support.api.PendingResultImpl$d */
    public static class HandlerC2251d<R extends Result> extends Handler {
        public HandlerC2251d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m12575a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m12576b(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            Pair pair = (Pair) message.obj;
            m12576b((ResultCallback) pair.first, (Result) pair.second);
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        m12572a(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.m12622i("PendingResultImpl", "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread();
        }
        HMSLog.m12620e("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() throws InterruptedException {
        HMSLog.m12622i("PendingResultImpl", "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.f19507c;
        if (weakReference == null) {
            HMSLog.m12620e("PendingResultImpl", "api is null");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f19506b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m12620e("PendingResultImpl", "client invalid");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f19506b;
        }
        if (this.f19510f) {
            m12569a(0, 1);
        }
        this.transport.send(apiClient, new C2248a());
        try {
            this.f19505a.await();
        } catch (InterruptedException unused) {
            HMSLog.m12620e("PendingResultImpl", "await in anythread InterruptedException");
            m12570a(CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.f19506b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t);

    public R onError(int i) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> type2 = type != null ? GenericTypeReflector.getType(type) : null;
        if (type2 != null) {
            try {
                R r = (R) type2.newInstance();
                this.f19506b = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                AbstractC0852NX.m5766o(e, new StringBuilder("on Error:"), "PendingResultImpl");
                return null;
            }
        }
        return this.f19506b;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.f19510f = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    /* renamed from: a */
    private void m12572a(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i) {
        HMSLog.m12622i("PendingResultImpl", "init uri:" + str);
        this.f19508d = str;
        if (apiClient == null) {
            HMSLog.m12620e("PendingResultImpl", "client is null");
            return;
        }
        this.f19507c = new WeakReference<>(apiClient);
        this.f19505a = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.m12620e("PendingResultImpl", "gen transport error:" + e.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e.getMessage(), e);
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.m12622i("PendingResultImpl", "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        HandlerC2251d handlerC2251d = new HandlerC2251d(looper);
        WeakReference<ApiClient> weakReference = this.f19507c;
        if (weakReference == null) {
            HMSLog.m12620e("PendingResultImpl", "api is null");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m12620e("PendingResultImpl", "client is invalid");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            handlerC2251d.m12575a(resultCallback, this.f19506b);
        } else {
            if (this.f19510f) {
                m12569a(0, 1);
            }
            this.transport.post(apiClient, new C2250c(handlerC2251d, resultCallback));
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("await timeout:", j, " unit:");
        sbM26239p.append(timeUnit.toString());
        HMSLog.m12622i("PendingResultImpl", sbM26239p.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return (R) awaitOnAnyThread(j, timeUnit);
        }
        HMSLog.m12622i("PendingResultImpl", "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        m12572a(apiClient, str, iMessageEntity, cls, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12570a(int i, IMessageEntity iMessageEntity) {
        Status status;
        AbstractC7222ym.m26244u(i, "setResult:", "PendingResultImpl");
        Status commonStatus = iMessageEntity instanceof AbstractMessageEntity ? ((AbstractMessageEntity) iMessageEntity).getCommonStatus() : null;
        if (i == 0) {
            this.f19506b = (R) onComplete(iMessageEntity);
        } else {
            this.f19506b = (R) onError(i);
        }
        if (this.f19510f) {
            m12569a(i, 2);
        }
        R r = this.f19506b;
        if (r == null || (status = r.getStatus()) == null || commonStatus == null) {
            return;
        }
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage();
        int statusCode2 = commonStatus.getStatusCode();
        String statusMessage2 = commonStatus.getStatusMessage();
        if (statusCode != statusCode2) {
            HMSLog.m12620e("PendingResultImpl", AbstractC7222ym.m26233j("rstStatus code (", ") is not equal commonStatus code (", statusCode, statusCode2, ")"));
            HMSLog.m12620e("PendingResultImpl", "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
            return;
        }
        if (!TextUtils.isEmpty(statusMessage) || TextUtils.isEmpty(statusMessage2)) {
            return;
        }
        HMSLog.m12622i("PendingResultImpl", AbstractC11153tN0.m24912x("rstStatus msg (", statusMessage, ") is not equal commonStatus msg (", statusMessage2, ")"));
        this.f19506b.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i) {
        m12572a(apiClient, str, iMessageEntity, getResponseType(), i);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("awaitOnAnyThread timeout:", j, " unit:");
        sbM26239p.append(timeUnit.toString());
        HMSLog.m12622i("PendingResultImpl", sbM26239p.toString());
        WeakReference<ApiClient> weakReference = this.f19507c;
        if (weakReference == null) {
            HMSLog.m12620e("PendingResultImpl", "api is null");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f19506b;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m12620e("PendingResultImpl", "client invalid");
            m12570a(CommonCode.ErrorCode.CLIENT_API_INVALID, (IMessageEntity) null);
            return this.f19506b;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.f19510f) {
            m12569a(0, 1);
        }
        this.transport.post(apiClient, new C2249b(atomicBoolean));
        try {
            if (!this.f19505a.await(j, timeUnit)) {
                atomicBoolean.set(true);
                m12570a(CommonCode.ErrorCode.EXECUTE_TIMEOUT, (IMessageEntity) null);
            }
        } catch (InterruptedException unused) {
            HMSLog.m12620e("PendingResultImpl", "awaitOnAnyThread InterruptedException");
            m12570a(CommonCode.ErrorCode.INTERNAL_ERROR, (IMessageEntity) null);
        }
        return this.f19506b;
    }

    /* renamed from: a */
    private void m12569a(int i, int i2) {
        SubAppInfo subAppInfo;
        HMSLog.m12622i("PendingResultImpl", "biReportEvent ====== ");
        ApiClient apiClient = this.f19507c.get();
        if (apiClient != null && this.f19508d != null && !HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HashMap map = new HashMap();
            map.put("package", apiClient.getPackageName());
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.12.0.300");
            if (i2 == 1) {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
            } else {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
                map.put("result", String.valueOf(i));
                R r = this.f19506b;
                if (r != null && r.getStatus() != null) {
                    map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.f19506b.getStatus().getStatusCode()));
                }
            }
            map.put("version", "0");
            String appId = Util.getAppId(apiClient.getContext());
            if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
                appId = subAppInfo.getSubAppID();
            }
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            if (TextUtils.isEmpty(this.f19509e)) {
                String id = TransactionIdCreater.getId(appId, this.f19508d);
                this.f19509e = id;
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id);
            } else {
                map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.f19509e);
                this.f19509e = null;
            }
            String[] strArrSplit = this.f19508d.split("\\.");
            if (strArrSplit.length >= 2) {
                map.put("service", strArrSplit[0]);
                map.put("apiName", strArrSplit[1]);
            }
            map.put("callTime", String.valueOf(System.currentTimeMillis()));
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
            HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, map);
            return;
        }
        HMSLog.m12620e("PendingResultImpl", "<biReportEvent> has some error.");
    }
}
