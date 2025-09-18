package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.adapter.InnerBinderAdapter;
import com.huawei.hms.adapter.OuterBinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    protected static final int TIMEOUT_DISCONNECTED = 6;

    /* renamed from: i */
    private static final Object f18919i = new Object();

    /* renamed from: j */
    private static final AtomicInteger f18920j = new AtomicInteger(1);

    /* renamed from: k */
    private static final AtomicInteger f18921k = new AtomicInteger(1);

    /* renamed from: l */
    private static BinderAdapter f18922l;

    /* renamed from: m */
    private static BinderAdapter f18923m;

    /* renamed from: a */
    private final Context f18924a;

    /* renamed from: b */
    private String f18925b;

    /* renamed from: c */
    private final ClientSettings f18926c;

    /* renamed from: d */
    private volatile IAIDLInvoke f18927d;

    /* renamed from: e */
    private final ConnectionCallbacks f18928e;

    /* renamed from: f */
    private final OnConnectionFailedListener f18929f;

    /* renamed from: g */
    private Handler f18930g = null;

    /* renamed from: h */
    private HuaweiApi.RequestHandler f18931h;
    protected String sessionId;

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$1 */
    public class C20631 implements BinderAdapter.BinderCallBack {

        /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$1$1 */
        public class AnonymousClass1 implements FailedBinderCallBack.BinderCallBack {
            public AnonymousClass1() {
            }

            @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
            public void binderCallBack(int i) {
                if (i != 0) {
                    BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.f18927d = null;
                }
            }
        }

        public C20631() {
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onBinderFailed(int i) {
            onBinderFailed(i, null);
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onNullBinding(ComponentName componentName) {
            BaseHmsClient.this.m11614b(1);
            BaseHmsClient.this.m11598a(10);
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HMSLog.m12622i("BaseHmsClient", "Enter onServiceConnected.");
            BaseHmsClient.this.connectedInternal(iBinder);
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onServiceDisconnected(ComponentName componentName) {
            HMSLog.m12622i("BaseHmsClient", "Enter onServiceDisconnected.");
            BaseHmsClient.this.m11614b(1);
            RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUSPENDED);
            if (BaseHmsClient.this.f18928e == null || (BaseHmsClient.this.f18928e instanceof HuaweiApi.RequestHandler)) {
                return;
            }
            BaseHmsClient.this.f18928e.onConnectionSuspended(1);
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onTimedDisconnected() {
            BaseHmsClient.this.m11614b(6);
            if (BaseHmsClient.this.f18928e == null || (BaseHmsClient.this.f18928e instanceof HuaweiApi.RequestHandler)) {
                return;
            }
            BaseHmsClient.this.f18928e.onConnectionSuspended(1);
        }

        @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
        public void onBinderFailed(int i, Intent intent) {
            if (intent == null) {
                HMSLog.m12622i("BaseHmsClient", "onBinderFailed: intent is null!");
                BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                BaseHmsClient.this.f18927d = null;
                return;
            }
            Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
            if (activeActivity == null) {
                HMSLog.m12622i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                BaseHmsClient.this.m11601a(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.f18924a, 11, intent, 67108864)));
                BaseHmsClient.this.f18927d = null;
                return;
            }
            HMSLog.m12622i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
            long time = new Timestamp(System.currentTimeMillis()).getTime();
            FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                public AnonymousClass1() {
                }

                @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                public void binderCallBack(int i2) {
                    if (i2 != 0) {
                        BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                        BaseHmsClient.this.f18927d = null;
                    }
                }
            });
            intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
            activeActivity.startActivity(intent);
        }
    }

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$2 */
    public class C20642 implements AvailableAdapter.AvailableCallBack {
        public C20642() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            BaseHmsClient.this.m11598a(i);
        }
    }

    /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$3 */
    public class C20653 implements AvailableAdapter.AvailableCallBack {
        public C20653() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0 && BaseHmsClient.this.m11608c()) {
                BaseHmsClient.this.m11613a();
            } else {
                BaseHmsClient.this.m11598a(i);
            }
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public static final class ConnectionResultWrapper {

        /* renamed from: a */
        private HuaweiApi.RequestHandler f18936a;

        /* renamed from: b */
        private ConnectionResult f18937b;

        public ConnectionResultWrapper(HuaweiApi.RequestHandler requestHandler, ConnectionResult connectionResult) {
            this.f18936a = requestHandler;
            this.f18937b = connectionResult;
        }

        public ConnectionResult getConnectionResult() {
            return this.f18937b;
        }

        public HuaweiApi.RequestHandler getRequest() {
            return this.f18936a;
        }
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.f18924a = context;
        this.f18926c = clientSettings;
        if (clientSettings != null) {
            this.f18925b = clientSettings.getAppID();
        }
        this.f18929f = onConnectionFailedListener;
        this.f18928e = connectionCallbacks;
    }

    /* renamed from: d */
    private BinderAdapter.BinderCallBack m11610d() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1

            /* renamed from: com.huawei.hms.common.internal.BaseHmsClient$1$1 */
            public class AnonymousClass1 implements FailedBinderCallBack.BinderCallBack {
                public AnonymousClass1() {
                }

                @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                public void binderCallBack(int i2) {
                    if (i2 != 0) {
                        BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                        BaseHmsClient.this.f18927d = null;
                    }
                }
            }

            public C20631() {
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i) {
                onBinderFailed(i, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.m11614b(1);
                BaseHmsClient.this.m11598a(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.m12622i("BaseHmsClient", "Enter onServiceConnected.");
                BaseHmsClient.this.connectedInternal(iBinder);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.m12622i("BaseHmsClient", "Enter onServiceDisconnected.");
                BaseHmsClient.this.m11614b(1);
                RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUSPENDED);
                if (BaseHmsClient.this.f18928e == null || (BaseHmsClient.this.f18928e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f18928e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onTimedDisconnected() {
                BaseHmsClient.this.m11614b(6);
                if (BaseHmsClient.this.f18928e == null || (BaseHmsClient.this.f18928e instanceof HuaweiApi.RequestHandler)) {
                    return;
                }
                BaseHmsClient.this.f18928e.onConnectionSuspended(1);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i, Intent intent) {
                if (intent == null) {
                    HMSLog.m12622i("BaseHmsClient", "onBinderFailed: intent is null!");
                    BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.f18927d = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.m12622i("BaseHmsClient", "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.m11601a(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.f18924a, 11, intent, 67108864)));
                    BaseHmsClient.this.f18927d = null;
                    return;
                }
                HMSLog.m12622i("BaseHmsClient", "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    public AnonymousClass1() {
                    }

                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i2) {
                        if (i2 != 0) {
                            BaseHmsClient.this.m11601a(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.f18927d = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }
        };
    }

    /* renamed from: e */
    private void m11611e() {
        HMSLog.m12623w("BaseHmsClient", "Failed to get service as interface, trying to unbind.");
        if (this.f18926c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f18923m;
            if (binderAdapter == null) {
                HMSLog.m12623w("BaseHmsClient", "mInnerBinderAdapter is null.");
                return;
            }
            binderAdapter.unBind();
        } else {
            BinderAdapter binderAdapter2 = f18922l;
            if (binderAdapter2 == null) {
                HMSLog.m12623w("BaseHmsClient", "mOuterBinderAdapter is null.");
                return;
            }
            binderAdapter2.unBind();
        }
        m11614b(1);
        m11598a(10);
    }

    /* renamed from: f */
    private void m11612f() {
        if (this.f18926c.isUseInnerHms()) {
            BinderAdapter binderAdapter = f18923m;
            if (binderAdapter != null) {
                binderAdapter.unBind();
                return;
            }
            return;
        }
        BinderAdapter binderAdapter2 = f18922l;
        if (binderAdapter2 != null) {
            binderAdapter2.unBind();
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i) {
        m11599a(i, false);
    }

    public void connectedInternal(IBinder iBinder) {
        this.f18927d = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f18927d != null) {
            onConnecting();
        } else {
            HMSLog.m12620e("BaseHmsClient", "mService is null, try to unBind.");
            m11611e();
        }
    }

    public final void connectionConnected() {
        m11614b(3);
        RequestManager.getHandler().sendEmptyMessage(RequestManager.NOTIFY_CONNECT_SUCCESS);
        ConnectionCallbacks connectionCallbacks = this.f18928e;
        if (connectionCallbacks == null || (connectionCallbacks instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        connectionCallbacks.onConnected();
    }

    public void disconnect() {
        int i = (this.f18926c.isUseInnerHms() ? f18921k : f18920j).get();
        AbstractC7222ym.m26244u(i, "Enter disconnect, Connection Status: ", "BaseHmsClient");
        if (i == 3) {
            m11612f();
            m11614b(1);
        } else {
            if (i != 5) {
                return;
            }
            m11606b();
            m11614b(1);
        }
    }

    public BinderAdapter getAdapter() {
        HMSLog.m12622i("BaseHmsClient", "getAdapter:isInner:" + this.f18926c.isUseInnerHms() + ", mInnerBinderAdapter:" + f18923m + ", mOuterBinderAdapter:" + f18922l);
        return this.f18926c.isUseInnerHms() ? f18923m : f18922l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.f18926c.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f18925b;
    }

    public ClientSettings getClientSettings() {
        return this.f18926c;
    }

    public int getConnectionStatus() {
        return (this.f18926c.isUseInnerHms() ? f18921k : f18920j).get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f18924a;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f18926c.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f18926c.getClientPackageName();
    }

    public int getRequestHmsVersionCode() {
        return getMinApkVersion();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f18927d;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.f18924a);
        return this.f18926c.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.f18926c.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return !this.f18926c.isUseInnerHms() ? f18920j.get() != 3 : f18921k.get() != 3;
    }

    public boolean isConnecting() {
        return (this.f18926c.isUseInnerHms() ? f18921k : f18920j).get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public final void setInternalRequest(HuaweiApi.RequestHandler requestHandler) {
        this.f18931h = requestHandler;
    }

    public void setService(IAIDLInvoke iAIDLInvoke) {
        this.f18927d = iAIDLInvoke;
    }

    /* renamed from: c */
    public boolean m11608c() {
        return HMSPackageManager.getInstance(this.f18924a).getHMSPackageStatesForMultiService() == PackageManagerHelper.PackageStates.ENABLED;
    }

    /* renamed from: b */
    public void m11614b(int i) {
        if (this.f18926c.isUseInnerHms()) {
            f18921k.set(i);
        } else {
            f18920j.set(i);
        }
    }

    public void connect(int i, boolean z) {
        m11599a(i, z);
    }

    /* renamed from: b */
    private void m11606b() {
        synchronized (f18919i) {
            try {
                Handler handler = this.f18930g;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.f18930g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m11613a() {
        String innerHmsPkg = this.f18926c.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        HMSLog.m12622i("BaseHmsClient", "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        m11604a(innerHmsPkg, serviceAction);
    }

    /* renamed from: a */
    private void m11604a(String str, String str2) {
        if (this.f18926c.isUseInnerHms()) {
            f18923m = InnerBinderAdapter.getInstance(this.f18924a, str2, str);
            if (isConnected()) {
                HMSLog.m12622i("BaseHmsClient", "The binder is already connected.");
                getAdapter().updateDelayTask();
                connectedInternal(getAdapter().getServiceBinder());
                return;
            } else {
                m11614b(5);
                f18923m.binder(m11610d());
                return;
            }
        }
        f18922l = OuterBinderAdapter.getInstance(this.f18924a, str2, str);
        if (isConnected()) {
            HMSLog.m12622i("BaseHmsClient", "The binder is already connected.");
            getAdapter().updateDelayTask();
            connectedInternal(getAdapter().getServiceBinder());
        } else {
            m11614b(5);
            f18922l.binder(m11610d());
        }
    }

    /* renamed from: b */
    private void m11607b(AvailableAdapter availableAdapter, int i) {
        HMSLog.m12622i("BaseHmsClient", "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            m11601a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f18924a, i, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                public C20653() {
                }

                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i2) {
                    if (i2 == 0 && BaseHmsClient.this.m11608c()) {
                        BaseHmsClient.this.m11613a();
                    } else {
                        BaseHmsClient.this.m11598a(i2);
                    }
                }
            });
        } else {
            m11598a(26);
        }
    }

    /* renamed from: a */
    private void m11599a(int i, boolean z) {
        HMSLog.m12622i("BaseHmsClient", "====== HMSSDK version: 61200300 ======");
        int i2 = (this.f18926c.isUseInnerHms() ? f18921k : f18920j).get();
        AbstractC7222ym.m26244u(i2, "Enter connect, Connection Status: ", "BaseHmsClient");
        if (z || !(i2 == 3 || i2 == 5)) {
            if (getMinApkVersion() > i) {
                i = getMinApkVersion();
            }
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "connect minVersion:", " packageName:");
            sbM26237n.append(this.f18926c.getInnerHmsPkg());
            HMSLog.m12622i("BaseHmsClient", sbM26237n.toString());
            if (this.f18924a.getPackageName().equals(this.f18926c.getInnerHmsPkg())) {
                HMSLog.m12622i("BaseHmsClient", "service packageName is same, bind core service return");
                m11613a();
                return;
            }
            if (Util.isAvailableLibExist(this.f18924a)) {
                AvailableAdapter availableAdapter = new AvailableAdapter(i);
                int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(this.f18924a);
                AbstractC7222ym.m26244u(iIsHuaweiMobileServicesAvailable, "check available result: ", "BaseHmsClient");
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    m11613a();
                    return;
                }
                if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
                    HMSLog.m12622i("BaseHmsClient", "bindCoreService3.0 fail, start resolution now.");
                    m11607b(availableAdapter, iIsHuaweiMobileServicesAvailable);
                    return;
                } else {
                    if (availableAdapter.isUserNoticeError(iIsHuaweiMobileServicesAvailable)) {
                        HMSLog.m12622i("BaseHmsClient", "bindCoreService3.0 fail, start notice now.");
                        m11600a(availableAdapter, iIsHuaweiMobileServicesAvailable);
                        return;
                    }
                    HMSLog.m12622i("BaseHmsClient", "bindCoreService3.0 fail: " + iIsHuaweiMobileServicesAvailable + " is not resolvable.");
                    m11598a(iIsHuaweiMobileServicesAvailable);
                    return;
                }
            }
            int iIsHuaweiMobileServicesAvailable2 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.f18924a, i);
            AbstractC7222ym.m26244u(iIsHuaweiMobileServicesAvailable2, "HuaweiApiAvailability check available result: ", "BaseHmsClient");
            if (iIsHuaweiMobileServicesAvailable2 == 0) {
                m11613a();
            } else {
                m11598a(iIsHuaweiMobileServicesAvailable2);
            }
        }
    }

    /* renamed from: a */
    private void m11600a(AvailableAdapter availableAdapter, int i) {
        HMSLog.m12622i("BaseHmsClient", "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i == 29) {
                i = 9;
            }
            m11601a(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.f18924a, i, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    public C20642() {
                    }

                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i2) {
                        BaseHmsClient.this.m11598a(i2);
                    }
                });
            } else {
                m11598a(26);
            }
        }
    }

    /* renamed from: a */
    public void m11598a(int i) {
        HMSLog.m12622i("BaseHmsClient", "notifyFailed result: " + i);
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        message.obj = new ConnectionResultWrapper(this.f18931h, new ConnectionResult(i));
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f18929f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i));
    }

    /* renamed from: a */
    public void m11601a(ConnectionResult connectionResult) {
        HMSLog.m12622i("BaseHmsClient", "notifyFailed result: " + connectionResult.getErrorCode());
        Message message = new Message();
        message.what = RequestManager.NOTIFY_CONNECT_FAILED;
        HuaweiApi.RequestHandler requestHandler = this.f18931h;
        this.f18931h = null;
        message.obj = new ConnectionResultWrapper(requestHandler, connectionResult);
        RequestManager.getHandler().sendMessage(message);
        OnConnectionFailedListener onConnectionFailedListener = this.f18929f;
        if (onConnectionFailedListener == null || (onConnectionFailedListener instanceof HuaweiApi.RequestHandler)) {
            return;
        }
        onConnectionFailedListener.onConnectionFailed(connectionResult);
    }
}
