package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C8499Wu1;
import p000.T81;

/* loaded from: classes.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* renamed from: a */
    private Context f18872a;

    /* renamed from: b */
    private TOption f18873b;

    /* renamed from: c */
    private Context f18874c;

    /* renamed from: d */
    private AbstractClientBuilder<?, TOption> f18875d;

    /* renamed from: e */
    private String f18876e;

    /* renamed from: f */
    private String f18877f;

    /* renamed from: g */
    private SubAppInfo f18878g;

    /* renamed from: h */
    private WeakReference<Activity> f18879h;

    /* renamed from: i */
    private int f18880i;

    /* renamed from: j */
    private int f18881j = 1;

    /* renamed from: k */
    private boolean f18882k = false;

    /* renamed from: l */
    private String f18883l;

    /* renamed from: m */
    private boolean f18884m;

    /* renamed from: n */
    private RequestManager f18885n;

    /* renamed from: com.huawei.hms.common.HuaweiApi$1 */
    public class RunnableC20541 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HuaweiApi f18886a;

        /* renamed from: b */
        final /* synthetic */ T81 f18887b;

        public RunnableC20541(HuaweiApi huaweiApi, T81 t81) {
            huaweiApi = huaweiApi;
            t81 = t81;
        }

        @Override // java.lang.Runnable
        public void run() {
            HuaweiApi.this.m11567a((HuaweiApi<?>) huaweiApi, t81);
        }
    }

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* renamed from: b */
        private final AnyClient f18890b;

        /* renamed from: d */
        private final HuaweiApi<OptionsT> f18892d;

        /* renamed from: e */
        private ResolveClientBean f18893e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* renamed from: a */
        private final Queue<TaskApiCallbackWrapper> f18889a = new LinkedList();

        /* renamed from: c */
        private ConnectionResult f18891c = null;

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$1 */
        public class C20551 implements AnyClient.CallBack {

            /* renamed from: a */
            private AtomicBoolean f18894a = new AtomicBoolean(true);

            /* renamed from: b */
            final /* synthetic */ TaskApiCallWrapper f18895b;

            public C20551(TaskApiCallWrapper taskApiCallWrapper) {
                taskApiCallWrapper = taskApiCallWrapper;
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
                if (!(iMessageEntity instanceof ResponseHeader)) {
                    HMSLog.m12620e("HuaweiApi", "header is not instance of ResponseHeader");
                    return;
                }
                ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                if (responseHeader.getErrorCode() == 11) {
                    RequestHandler.this.m11586a();
                    HMSLog.m12622i("HuaweiApi", "unbind service");
                }
                if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                    HMSLog.m12620e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                }
                if (this.f18894a.compareAndSet(true, false)) {
                    HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f18892d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f18892d.getKitSdkVersion()));
                }
                taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f18890b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2 */
        public class C20562 implements AnyClient.CallBack {

            /* renamed from: a */
            final /* synthetic */ TaskApiCallbackWrapper f18897a;

            /* renamed from: b */
            final /* synthetic */ RequestHeader f18898b;

            /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2$1 */
            public class AnonymousClass1 implements Runnable {
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.f18889a.remove(taskApiCallbackWrapper);
                }
            }

            public C20562(TaskApiCallbackWrapper taskApiCallbackWrapper, RequestHeader requestHeader) {
                taskApiCallbackWrapper = taskApiCallbackWrapper;
                requestHeader = requestHeader;
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
                AnyClient.CallBack callBackM11590b = taskApiCallbackWrapper.m11590b();
                if (callBackM11590b != null) {
                    callBackM11590b.onCallback(iMessageEntity, str);
                }
                RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        RequestHandler.this.f18889a.remove(taskApiCallbackWrapper);
                    }
                });
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$3 */
        public class RunnableC20573 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ConnectionResult f18901a;

            public RunnableC20573(ConnectionResult connectionResult) {
                connectionResult = connectionResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.m11580b(connectionResult);
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$4 */
        public class RunnableC20584 implements Runnable {
            public RunnableC20584() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.m11579b();
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$5 */
        public class RunnableC20595 implements Runnable {
            public RunnableC20595() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.m11583c();
            }
        }

        public RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.f18892d = huaweiApi;
            this.f18890b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.f18890b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.m12622i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f18893e);
            this.f18893e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                public RunnableC20584() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m11579b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            HMSLog.m12622i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f18893e);
            this.f18893e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3

                /* renamed from: a */
                final /* synthetic */ ConnectionResult f18901a;

                public RunnableC20573(ConnectionResult connectionResult2) {
                    connectionResult = connectionResult2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m11580b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.m12622i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f18893e);
            this.f18893e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                public RunnableC20595() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.m11583c();
                }
            });
        }

        public void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.m11589a().getTaskApiCall().getTransactionId(), this);
            this.f18889a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.m11589a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.f18892d).f18874c == null ? this.f18892d.getContext() : ((HuaweiApi) this.f18892d).f18874c).getPackageName();
            if (((HuaweiApi) this.f18892d).f18874c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.f18892d;
                huaweiApi.m11570b(((HuaweiApi) huaweiApi).f18874c);
            }
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f18892d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f18892d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f18890b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.m11589a().getTaskApiCall();
            requestHeader.setTransactionId(m11575a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f18892d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f18892d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f18890b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2

                /* renamed from: a */
                final /* synthetic */ TaskApiCallbackWrapper f18897a;

                /* renamed from: b */
                final /* synthetic */ RequestHeader f18898b;

                /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2$1 */
                public class AnonymousClass1 implements Runnable {
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        RequestHandler.this.f18889a.remove(taskApiCallbackWrapper);
                    }
                }

                public C20562(TaskApiCallbackWrapper taskApiCallbackWrapper2, RequestHeader requestHeader2) {
                    taskApiCallbackWrapper = taskApiCallbackWrapper2;
                    requestHeader = requestHeader2;
                }

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBackM11590b = taskApiCallbackWrapper.m11590b();
                    if (callBackM11590b != null) {
                        callBackM11590b.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f18889a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        /* renamed from: b */
        private TaskApiCallbackWrapper m11578b(TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* renamed from: a */
                private AtomicBoolean f18894a = new AtomicBoolean(true);

                /* renamed from: b */
                final /* synthetic */ TaskApiCallWrapper f18895b;

                public C20551(TaskApiCallWrapper taskApiCallWrapper2) {
                    taskApiCallWrapper = taskApiCallWrapper2;
                }

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.m12620e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.m11586a();
                        HMSLog.m12622i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.m12620e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f18894a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f18892d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f18892d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f18890b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* renamed from: c */
        public void m11583c() {
            HMSLog.m12622i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.m12622i("HuaweiApi", "run queue size = " + this.f18889a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                m11577a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.f18889a.iterator();
            while (it2.hasNext()) {
                m11577a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f18889a.clear();
            this.f18891c = null;
            this.f18890b.disconnect();
        }

        /* renamed from: b */
        public void m11580b(ConnectionResult connectionResult) {
            this.f18891c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z = true;
            while (it.hasNext()) {
                TaskApiCallWrapper taskApiCallWrapperM11589a = it.next().m11589a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + m11574a(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(taskApiCallWrapperM11589a.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.f18892d.getContext(), responseHeader, String.valueOf(this.f18892d.getKitSdkVersion()));
                if (this.f18891c.getResolution() != null && z) {
                    responseHeader.setParcelable(this.f18891c.getResolution());
                    if (Util.isAvailableLibExist(this.f18892d.getContext()) && this.f18891c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.f18891c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                taskApiCallWrapperM11589a.getTaskApiCall().onResponse(this.f18890b, responseHeader, null, taskApiCallWrapperM11589a.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f18889a.clear();
            this.f18891c = null;
            this.f18890b.disconnect();
        }

        /* renamed from: a */
        public void m11588a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.m12622i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper taskApiCallbackWrapperM11578b = m11578b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.f18892d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.f18890b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.f18892d).f18872a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.f18890b.isConnected() && !((HuaweiApi) this.f18892d).f18884m && ((BaseHmsClient) this.f18890b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f18890b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f18890b.disconnect();
                }
            }
            if (this.f18890b.isConnected()) {
                HMSLog.m12622i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f18890b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f18890b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(taskApiCallbackWrapperM11578b);
                return;
            }
            HMSLog.m12622i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperM11578b);
            ConnectionResult connectionResult = this.f18891c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.m12622i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f18891c.getErrorCode());
                onConnectionFailed(this.f18891c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.f18890b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            m11587a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), taskApiCallbackWrapperM11578b);
        }

        /* renamed from: b */
        public void m11579b() {
            this.f18891c = null;
            this.f18889a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        /* renamed from: a */
        private String m11575a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f18892d.getAppID(), str2) : str;
        }

        /* renamed from: a */
        public synchronized void m11587a(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.f18890b.isConnected()) {
                HMSLog.m12617d("HuaweiApi", "client is connected");
                return;
            }
            if (this.f18890b.isConnecting()) {
                HMSLog.m12617d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f18892d.getActivity() != null) {
                if (this.f18893e == null) {
                    this.f18893e = new ResolveClientBean(this.f18890b, i);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f18893e)) {
                    HMSLog.m12622i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f18893e);
            }
            this.f18890b.connect(i);
        }

        /* renamed from: a */
        public void m11586a() {
            this.f18890b.disconnect();
        }

        /* renamed from: a */
        private void m11577a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper taskApiCallWrapperM11589a = taskApiCallbackWrapper.m11589a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(taskApiCallWrapperM11589a.getTaskApiCall().getTransactionId());
            taskApiCallWrapperM11589a.getTaskApiCall().onResponse(this.f18890b, responseHeader, null, taskApiCallWrapperM11589a.getTaskCompletionSource());
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0051, code lost:
        
            if (r9 != 10) goto L55;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String m11574a(com.huawei.hms.api.ConnectionResult r9) {
            /*
                r8 = this;
                com.huawei.hms.common.HuaweiApi<OptionsT extends com.huawei.hms.api.Api$ApiOptions> r0 = r8.f18892d
                android.content.Context r0 = r0.getContext()
                boolean r0 = com.huawei.hms.utils.Util.isAvailableLibExist(r0)
                java.lang.String r1 = "get update result, but has other error codes"
                java.lang.String r2 = "internal error"
                java.lang.String r3 = "application configuration error, please developer check configuration"
                java.lang.String r4 = "unknown errorReason"
                r5 = 10
                r6 = 8
                r7 = -1
                if (r0 == 0) goto L49
                int r9 = r9.getErrorCode()
                if (r9 == r7) goto L54
                r0 = 3
                if (r9 == r0) goto L46
                if (r9 == r6) goto L44
                if (r9 == r5) goto L42
                r0 = 13
                if (r9 == r0) goto L3f
                r0 = 21
                if (r9 == r0) goto L3c
                switch(r9) {
                    case 25: goto L39;
                    case 26: goto L36;
                    case 27: goto L33;
                    default: goto L31;
                }
            L31:
                r1 = r4
                goto L54
            L33:
                java.lang.String r1 = "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while"
                goto L54
            L36:
                java.lang.String r1 = "update failed, because no activity incoming, can't pop update page"
                goto L54
            L39:
                java.lang.String r1 = "failed to get update result"
                goto L54
            L3c:
                java.lang.String r1 = "device is too old to be support"
                goto L54
            L3f:
                java.lang.String r1 = "update cancelled"
                goto L54
            L42:
                r1 = r3
                goto L54
            L44:
                r1 = r2
                goto L54
            L46:
                java.lang.String r1 = "HuaWei Mobile Service is disabled"
                goto L54
            L49:
                int r9 = r9.getErrorCode()
                if (r9 == r7) goto L54
                if (r9 == r6) goto L44
                if (r9 == r5) goto L42
                goto L31
            L54:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.RequestHandler.m11574a(com.huawei.hms.api.ConnectionResult):java.lang.String");
        }
    }

    public static class TaskApiCallbackWrapper {

        /* renamed from: a */
        private final TaskApiCallWrapper f18905a;

        /* renamed from: b */
        private final AnyClient.CallBack f18906b;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f18905a = taskApiCallWrapper;
            this.f18906b = callBack;
        }

        /* renamed from: a */
        public TaskApiCallWrapper m11589a() {
            return this.f18905a;
        }

        /* renamed from: b */
        public AnyClient.CallBack m11590b() {
            return this.f18906b;
        }
    }

    /* renamed from: com.huawei.hms.common.HuaweiApi$a */
    public static class RunnableC2060a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* renamed from: a */
        private final HuaweiApi<OptionsT> f18907a;

        /* renamed from: b */
        private final TaskApiCallWrapper f18908b;

        public RunnableC2060a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f18907a = huaweiApi;
            this.f18908b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0053 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m11591a(com.huawei.hms.common.HuaweiApi.RequestHandler r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                java.lang.String r0 = "HuaweiApi"
                r1 = 0
                com.huawei.hms.common.internal.AnyClient r8 = r8.getClient()     // Catch: java.lang.Throwable -> L36
                com.huawei.hms.common.internal.ResponseHeader r2 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.Throwable -> L33
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L33
                r3 = 1
                r4 = 907135001(0x3611c819, float:2.1723156E-6)
                r2.<init>(r3, r4, r9)     // Catch: java.lang.Throwable -> L33
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
                r9.<init>()     // Catch: java.lang.Throwable -> L2f
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2f
                com.huawei.hms.common.internal.TaskApiCallWrapper r3 = r7.f18908b     // Catch: java.lang.Throwable -> L2c
                T81 r3 = r3.getTaskCompletionSource()     // Catch: java.lang.Throwable -> L2c
                com.huawei.hms.common.internal.TaskApiCallWrapper r4 = r7.f18908b     // Catch: java.lang.Throwable -> L2a
                com.huawei.hms.common.internal.TaskApiCall r1 = r4.getTaskApiCall()     // Catch: java.lang.Throwable -> L2a
                goto L51
            L2a:
                r4 = move-exception
                goto L3c
            L2c:
                r4 = move-exception
                r3 = r1
                goto L3c
            L2f:
                r4 = move-exception
                r9 = r1
                r3 = r9
                goto L3c
            L33:
                r9 = move-exception
                r4 = r9
                goto L39
            L36:
                r8 = move-exception
                r4 = r8
                r8 = r1
            L39:
                r9 = r1
                r2 = r9
                r3 = r2
            L3c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "<notifyCpException> "
                r5.<init>(r6)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.huawei.hms.support.log.HMSLog.m12620e(r0, r4)
            L51:
                if (r8 == 0) goto L5f
                if (r2 == 0) goto L5f
                if (r9 == 0) goto L5f
                if (r3 == 0) goto L5f
                if (r1 == 0) goto L5f
                r1.onResponse(r8, r2, r9, r3)
                goto L64
            L5f:
                java.lang.String r8 = "<notifyCpException> isNotify is false, Can not notify CP."
                com.huawei.hms.support.log.HMSLog.m12620e(r0, r8)
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.HuaweiApi.RunnableC2060a.m11591a(com.huawei.hms.common.HuaweiApi$RequestHandler, java.lang.Throwable):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f18907a);
            try {
                requestHandler.m11588a(this.f18908b);
            } catch (Throwable th) {
                HMSLog.m12621e("HuaweiApi", "sendRequest has exception", th);
                m11591a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f18879h = new WeakReference<>(activity);
        m11566a(activity, api, toption, abstractClientBuilder, i, null);
    }

    @Deprecated
    public Task disconnectService() {
        T81 t81 = new T81();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1

            /* renamed from: a */
            final /* synthetic */ HuaweiApi f18886a;

            /* renamed from: b */
            final /* synthetic */ T81 f18887b;

            public RunnableC20541(HuaweiApi this, T81 t812) {
                huaweiApi = this;
                t81 = t812;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.m11567a((HuaweiApi<?>) huaweiApi, t81);
            }
        });
        return t812.f11181a;
    }

    public <TResult, TClient extends AnyClient> Task doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.f18882k = true;
        if (taskApiCall != null) {
            HiAnalyticsInnerClient.reportEntryClient(this.f18872a, taskApiCall.getUri(), TextUtils.isEmpty(this.f18878g.getSubAppID()) ? this.f18877f : this.f18878g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
            if (this.f18885n == null) {
                this.f18885n = RequestManager.getInstance();
            }
            return m11564a(taskApiCall);
        }
        HMSLog.m12620e("HuaweiApi", "in doWrite:taskApiCall is null");
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        ApiException apiException = new ApiException(Status.FAILURE);
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = apiException;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
        return c8499Wu1;
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.f18879h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.f18881j;
    }

    public String getAppID() {
        return this.f18877f;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f18875d.buildClient(this.f18872a, getClientSetting(), requestHandler, requestHandler);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f18872a.getPackageName(), this.f18872a.getClass().getName(), getScopes(), this.f18876e, null, this.f18878g);
        if (!this.f18884m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f18872a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = PackageConstants.SERVICES_PACKAGE;
            }
            this.f18883l = hMSPackageNameForMultiService;
            HMSLog.m12622i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.f18883l);
        }
        clientSettings.setInnerHmsPkg(this.f18883l);
        clientSettings.setUseInnerHms(this.f18884m);
        WeakReference<Activity> weakReference = this.f18879h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f18872a;
    }

    public int getKitSdkVersion() {
        return this.f18880i;
    }

    public TOption getOption() {
        return this.f18873b;
    }

    public List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.f18878g.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.f18881j = i;
    }

    public void setHostContext(Context context) {
        this.f18874c = context;
    }

    public void setInnerHms() {
        this.f18883l = this.f18872a.getPackageName();
        this.f18884m = true;
        HMSLog.m12622i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.f18883l);
    }

    public void setKitSdkVersion(int i) {
        this.f18880i = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m12622i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f18878g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.m12620e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.m12620e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m12620e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f18876e)) {
            HMSLog.m12620e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.f18882k) {
            HMSLog.m12620e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f18878g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* renamed from: b */
    public void m11570b(Context context) {
        String appId = Util.getAppId(context);
        this.f18876e = appId;
        this.f18877f = appId;
    }

    /* renamed from: a */
    private void m11566a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.f18872a = context.getApplicationContext();
        this.f18873b = toption;
        this.f18875d = abstractClientBuilder;
        m11570b(context);
        this.f18878g = new SubAppInfo("");
        this.f18880i = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f18876e)) {
                HMSLog.m12620e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.m12622i("HuaweiApi", "subAppId is ".concat(str));
                this.f18878g = new SubAppInfo(str);
            }
        }
        m11565a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f18879h = new WeakReference<>(activity);
        m11566a(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f18879h = new WeakReference<>(activity);
        m11566a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    /* renamed from: a */
    private void m11565a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m11566a(context, api, toption, abstractClientBuilder, i, null);
    }

    /* renamed from: a */
    public void m11567a(HuaweiApi<?> huaweiApi, T81 t81) {
        HMSLog.m12622i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            t81.m7577b(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.m12623w("HuaweiApi", "disconnect the binder failed for:" + e.getMessage());
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m11566a(context, api, toption, abstractClientBuilder, i, str);
    }

    /* renamed from: a */
    private <TResult, TClient extends AnyClient> Task m11564a(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        T81 t81 = new T81();
        RequestManager.getHandler().post(new RunnableC2060a(this, new TaskApiCallWrapper(taskApiCall, t81)));
        return t81.f11181a;
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        m11566a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
