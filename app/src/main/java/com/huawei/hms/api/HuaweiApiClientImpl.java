package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.CodecLookup;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.MessageCodec;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p000.AbstractC7222ym;

@Deprecated
/* loaded from: classes.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {

    /* renamed from: A */
    private static final Object f18801A = new Object();

    /* renamed from: B */
    private static final Object f18802B = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: b */
    private final Context f18804b;

    /* renamed from: c */
    private final String f18805c;

    /* renamed from: d */
    private String f18806d;

    /* renamed from: e */
    private String f18807e;

    /* renamed from: f */
    private volatile IAIDLInvoke f18808f;

    /* renamed from: g */
    private String f18809g;

    /* renamed from: h */
    private WeakReference<Activity> f18810h;

    /* renamed from: i */
    private WeakReference<Activity> f18811i;

    /* renamed from: l */
    private List<Scope> f18814l;

    /* renamed from: m */
    private List<PermissionInfo> f18815m;

    /* renamed from: n */
    private Map<Api<?>, Api.ApiOptions> f18816n;

    /* renamed from: o */
    private SubAppInfo f18817o;

    /* renamed from: s */
    private final ReentrantLock f18821s;

    /* renamed from: t */
    private final Condition f18822t;

    /* renamed from: u */
    private ConnectionResult f18823u;

    /* renamed from: v */
    private HuaweiApiClient.ConnectionCallbacks f18824v;

    /* renamed from: w */
    private HuaweiApiClient.OnConnectionFailedListener f18825w;

    /* renamed from: x */
    private Handler f18826x;

    /* renamed from: y */
    private Handler f18827y;

    /* renamed from: z */
    private CheckUpdatelistener f18828z;

    /* renamed from: a */
    private int f18803a = -1;

    /* renamed from: j */
    private boolean f18812j = false;

    /* renamed from: k */
    private AtomicInteger f18813k = new AtomicInteger(1);

    /* renamed from: p */
    private long f18818p = 0;

    /* renamed from: q */
    private int f18819q = 0;

    /* renamed from: r */
    private final Object f18820r = new Object();

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$a */
    public class C2035a implements Handler.Callback {
        public C2035a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.m12620e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f18813k.get() == 5) {
                HuaweiApiClientImpl.this.m11513c(1);
                HuaweiApiClientImpl.this.m11506b();
            }
            return true;
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$b */
    public class C2036b implements Handler.Callback {
        public C2036b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.m12620e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f18813k.get() == 2) {
                HuaweiApiClientImpl.this.m11513c(1);
                HuaweiApiClientImpl.this.m11506b();
            }
            return true;
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$c */
    public class BinderC2037c extends IAIDLCallback.Stub {

        /* renamed from: a */
        final /* synthetic */ ResultCallback f18831a;

        public BinderC2037c(ResultCallback resultCallback) {
            this.f18831a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.IAIDLCallback
        public void call(DataBuffer dataBuffer) {
            if (dataBuffer == null) {
                HMSLog.m12622i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f18831a.onResult(new BundleResult(-1, null));
                return;
            }
            MessageCodec messageCodecFind = CodecLookup.find(dataBuffer.getProtocol());
            ResponseHeader responseHeader = new ResponseHeader();
            messageCodecFind.decode(dataBuffer.header, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), dataBuffer.getBody());
            HMSLog.m12622i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f18831a.onResult(bundleResult);
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$d */
    public static class C2038d extends PendingResultImpl<Status, IMessageEntity> {
        public C2038d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a */
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e */
    public class C2039e implements ResultCallback<ResolveResult<ConnectResp>> {

        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$e$a */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ResolveResult f18834a;

            public a(ResolveResult resolveResult) {
                this.f18834a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m11504a((ResolveResult<ConnectResp>) this.f18834a);
            }
        }

        private C2039e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C2039e(HuaweiApiClientImpl huaweiApiClientImpl, C2035a c2035a) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f */
    public class C2040f implements ResultCallback<ResolveResult<DisconnectResp>> {

        /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$f$a */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ResolveResult f18837a;

            public a(ResolveResult resolveResult) {
                this.f18837a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.m11510b((ResolveResult<DisconnectResp>) this.f18837a);
            }
        }

        private C2040f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ C2040f(HuaweiApiClientImpl huaweiApiClientImpl, C2035a c2035a) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$g */
    public class C2041g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private C2041g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            HMSLog.m12622i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f18810h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.m12620e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f18812j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ C2041g(HuaweiApiClientImpl huaweiApiClientImpl, C2035a c2035a) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f18821s = reentrantLock;
        this.f18822t = reentrantLock.newCondition();
        this.f18826x = null;
        this.f18827y = null;
        this.f18828z = null;
        this.f18804b = context;
        String appId = Util.getAppId(context);
        this.f18805c = appId;
        this.f18806d = appId;
        this.f18807e = Util.getCpId(context);
    }

    /* renamed from: d */
    private DisconnectInfo m11515d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f18816n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f18814l, arrayList);
    }

    /* renamed from: e */
    private int m11516e() {
        int hmsVersion = Util.getHmsVersion(this.f18804b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int iM11517f = m11517f();
        if (m11518g()) {
            if (iM11517f < 20503000) {
                return 20503000;
            }
            return iM11517f;
        }
        if (iM11517f < 20600000) {
            return 20600000;
        }
        return iM11517f;
    }

    /* renamed from: f */
    private int m11517f() {
        Integer num;
        int iIntValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (iIntValue = num.intValue()) > i) {
                i = iIntValue;
            }
        }
        return i;
    }

    /* renamed from: g */
    private boolean m11518g() {
        Map<Api<?>, Api.ApiOptions> map = this.f18816n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m11519h() {
        Handler handler = this.f18826x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f18826x = new Handler(Looper.getMainLooper(), new C2035a());
        }
        this.f18826x.sendEmptyMessageDelayed(2, 5000L);
    }

    /* renamed from: i */
    private void m11520i() {
        synchronized (f18802B) {
            try {
                Handler handler = this.f18827y;
                if (handler != null) {
                    handler.removeMessages(3);
                } else {
                    this.f18827y = new Handler(Looper.getMainLooper(), new C2036b());
                }
                HMSLog.m12617d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f18827y.sendEmptyMessageDelayed(3, 3000L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    private void m11521j() {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, m11511c()).setResultCallback(new C2039e(this, null));
    }

    /* renamed from: k */
    private void m11522k() {
        ConnectService.disconnect(this, m11515d()).setResultCallback(new C2040f(this, null));
    }

    /* renamed from: l */
    private void m11523l() {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, m11511c()).setResultCallback(new C2039e(this, null));
    }

    /* renamed from: m */
    private void m11524m() {
        if (this.f18812j) {
            HMSLog.m12622i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f18804b) == 0) {
            ConnectService.getNotice(this, 0, "6.12.0.300").setResultCallback(new C2041g(this, null));
        }
    }

    /* renamed from: n */
    private void m11525n() {
        Util.unBindServiceCatchException(this.f18804b, this);
        this.f18808f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i, ResultCallback<BundleResult> resultCallback) {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.m12620e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.m12620e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        DataBuffer dataBuffer = new DataBuffer(str, i);
        MessageCodec messageCodecFind = CodecLookup.find(dataBuffer.getProtocol());
        dataBuffer.addBody(bundle);
        RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 61200300, getSessionId());
        requestHeader.setApiNameList(getApiNameList());
        dataBuffer.header = messageCodecFind.encode(requestHeader, new Bundle());
        try {
            getService().asyncCall(dataBuffer, new BinderC2037c(resultCallback));
            return 0;
        } catch (RemoteException e) {
            HMSLog.m12620e("HuaweiApiClientImpl", "remote exception:" + e.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (checkUpdatelistener == null) {
            HMSLog.m12620e("HuaweiApiClientImpl", "listener is null!");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
            checkUpdatelistener.onResult(-1);
            return;
        }
        this.f18828z = checkUpdatelistener;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.update.manager.CheckUpdateLegacy");
            cls.getMethod("initCheckUpdateCallBack", Object.class, Activity.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), this, activity);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.m12620e("HuaweiApiClientImpl", "invoke CheckUpdateLegacy.initCheckUpdateCallBack fail. " + e.getMessage());
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.m12622i("HuaweiApiClientImpl", "====== HMSSDK version: 61200300 ======");
        int i = this.f18813k.get();
        AbstractC7222ym.m26244u(i, "Enter connect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 3 || i == 5 || i == 2 || i == 4) {
            return;
        }
        if (activity != null) {
            this.f18810h = new WeakReference<>(activity);
            this.f18811i = new WeakReference<>(activity);
        }
        this.f18806d = TextUtils.isEmpty(this.f18805c) ? Util.getAppId(this.f18804b) : this.f18805c;
        int iM11516e = m11516e();
        HMSLog.m12622i("HuaweiApiClientImpl", "connect minVersion:" + iM11516e);
        HuaweiApiAvailability.setServicesVersionCode(iM11516e);
        int iIsHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f18804b, iM11516e);
        AbstractC7222ym.m26244u(iIsHuaweiMobileServicesAvailable, "In connect, isHuaweiMobileServicesAvailable result: ", "HuaweiApiClientImpl");
        this.f18819q = HMSPackageManager.getInstance(this.f18804b).getHmsMultiServiceVersion();
        if (iIsHuaweiMobileServicesAvailable != 0) {
            if (this.f18825w != null) {
                m11507b(iIsHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        m11513c(5);
        if (this.f18808f == null) {
            m11500a();
            return;
        }
        m11513c(2);
        m11521j();
        m11520i();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.m12622i("HuaweiApiClientImpl", "====== HMSSDK version: 61200300 ======");
        int i = this.f18813k.get();
        AbstractC7222ym.m26244u(i, "Enter forceConnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 3 || i == 5 || i == 2 || i == 4) {
            return;
        }
        this.f18806d = TextUtils.isEmpty(this.f18805c) ? Util.getAppId(this.f18804b) : this.f18805c;
        m11523l();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f18803a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f18803a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new C2038d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i = this.f18813k.get();
        AbstractC7222ym.m26244u(i, "Enter disconnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i == 2) {
            m11513c(4);
            return;
        }
        if (i == 3) {
            m11513c(4);
            m11522k();
        } else {
            if (i != 5) {
                return;
            }
            m11501a(2);
            m11513c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f18816n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f18816n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f18806d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f18823u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f18823u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f18804b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f18807e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f18804b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f18815m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f18814l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f18808f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f18809g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f18817o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f18811i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f18820r) {
            try {
                return this.f18825w == onConnectionFailedListener;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f18820r) {
            try {
                return this.f18824v == connectionCallbacks;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f18821s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                this.f18822t.await();
            }
            if (isConnected()) {
                this.f18823u = null;
                return new ConnectionResult(0, (PendingIntent) null);
            }
            ConnectionResult connectionResult = this.f18823u;
            return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, (PendingIntent) null);
        } finally {
            this.f18821s.unlock();
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f18813k.get() == 3 || this.f18813k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f18819q == 0) {
            this.f18819q = HMSPackageManager.getInstance(this.f18804b).getHmsMultiServiceVersion();
        }
        if (this.f18819q >= 20504000) {
            return innerIsConnected();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f18818p;
        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ((ResolveResult) ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS)).getStatus();
        if (status.isSuccess()) {
            this.f18818p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        AbstractC7222ym.m26244u(statusCode, "isConnected is false, statuscode:", "HuaweiApiClientImpl");
        if (statusCode == 907135004) {
            return false;
        }
        m11525n();
        m11513c(1);
        this.f18818p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i = this.f18813k.get();
        return i == 2 || i == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.m12622i("HuaweiApiClientImpl", "onPause");
    }

    public void onResult(int i) {
        this.f18828z.onResult(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.m12622i("HuaweiApiClientImpl", "onResume");
            this.f18811i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m12622i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        m11501a(2);
        this.f18808f = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f18808f != null) {
            if (this.f18813k.get() == 5) {
                m11513c(2);
                m11521j();
                m11520i();
                return;
            } else {
                if (this.f18813k.get() != 3) {
                    m11525n();
                    return;
                }
                return;
            }
        }
        HMSLog.m12620e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        m11525n();
        m11513c(1);
        if (this.f18825w != null) {
            WeakReference<Activity> weakReference = this.f18810h;
            ConnectionResult connectionResult = new ConnectionResult(10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f18810h.get(), 10));
            this.f18825w.onConnectionFailed(connectionResult);
            this.f18823u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f18808f = null;
        m11513c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f18824v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f18820r) {
            try {
                if (this.f18825w != onConnectionFailedListener) {
                    HMSLog.m12623w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
                } else {
                    this.f18825w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f18820r) {
            try {
                if (this.f18824v != connectionCallbacks) {
                    HMSLog.m12623w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
                } else {
                    this.f18824v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resetListener() {
        this.f18828z = null;
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f18816n = map;
    }

    public void setAutoLifecycleClientId(int i) {
        this.f18803a = i;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f18824v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f18825w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z) {
        this.f18812j = z;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f18815m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f18814l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.m12620e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.m12620e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f18805c) ? Util.getAppId(this.f18804b) : this.f18805c)) {
            HMSLog.m12620e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f18817o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* renamed from: c */
    public void m11513c(int i) {
        this.f18813k.set(i);
        if (i == 1 || i == 3 || i == 2) {
            this.f18821s.lock();
            try {
                this.f18822t.signalAll();
            } finally {
                this.f18821s.unlock();
            }
        }
    }

    /* renamed from: b */
    private void m11507b(int i) {
        PendingIntent resolveErrorPendingIntent;
        WeakReference<Activity> weakReference = this.f18810h;
        if (weakReference == null || weakReference.get() == null) {
            resolveErrorPendingIntent = null;
        } else {
            resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f18810h.get(), i);
            AbstractC7222ym.m26244u(i, "connect 2.0 fail: ", "HuaweiApiClientImpl");
        }
        ConnectionResult connectionResult = new ConnectionResult(i, resolveErrorPendingIntent);
        this.f18825w.onConnectionFailed(connectionResult);
        this.f18823u = connectionResult;
    }

    /* renamed from: a */
    private void m11500a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f18804b).getServiceAction());
        HMSPackageManager.getInstance(this.f18804b).refreshForMultiService();
        try {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f18804b).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                HMSLog.m12620e("HuaweiApiClientImpl", "servicePackageName is empty, Service is invalid, bind core service fail.");
                m11513c(1);
                m11506b();
                return;
            }
            intent.setPackage(hMSPackageNameForMultiService);
            synchronized (f18801A) {
                try {
                    if (this.f18804b.bindService(intent, this, 1)) {
                        m11519h();
                        return;
                    }
                    m11513c(1);
                    HMSLog.m12620e("HuaweiApiClientImpl", "In connect, bind core service fail");
                    m11506b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalArgumentException unused) {
            HMSLog.m12620e("HuaweiApiClientImpl", "IllegalArgumentException when bindCoreService intent.setPackage");
            m11513c(1);
            HMSLog.m12620e("HuaweiApiClientImpl", "In connect, bind core service fail");
            m11506b();
        }
    }

    /* renamed from: c */
    private ConnectInfo m11511c() {
        String packageSignature = new PackageManagerHelper(this.f18804b).getPackageSignature(this.f18804b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f18817o;
        return new ConnectInfo(getApiNameList(), this.f18814l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* renamed from: c */
    private void m11514c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        m11513c(3);
        this.f18823u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f18824v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f18810h != null) {
            m11524m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.m12622i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.m12622i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f18810h);
                }
            }
        }
    }

    /* renamed from: b */
    public void m11506b() {
        m11525n();
        if (this.f18825w != null) {
            int i = UIUtil.isBackground(this.f18804b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f18810h;
            ConnectionResult connectionResult = new ConnectionResult(i, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f18810h.get(), i));
            this.f18825w.onConnectionFailed(connectionResult);
            this.f18823u = connectionResult;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f18821s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f18822t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f18823u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f18823u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f18821s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    /* renamed from: b */
    public void m11510b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        m11525n();
        m11513c(1);
    }

    /* renamed from: a */
    private void m11501a(int i) {
        if (i == 2) {
            synchronized (f18801A) {
                try {
                    Handler handler = this.f18826x;
                    if (handler != null) {
                        handler.removeMessages(i);
                        this.f18826x = null;
                    }
                } finally {
                }
            }
        }
        if (i == 3) {
            synchronized (f18802B) {
                try {
                    Handler handler2 = this.f18827y;
                    if (handler2 != null) {
                        handler2.removeMessages(i);
                        this.f18827y = null;
                    }
                } finally {
                }
            }
        }
        synchronized (f18801A) {
            try {
                Handler handler3 = this.f18826x;
                if (handler3 != null) {
                    handler3.removeMessages(2);
                    this.f18826x = null;
                }
            } finally {
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i) {
        connect((Activity) null);
    }

    /* renamed from: a */
    public void m11504a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.m12622i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f18808f != null && this.f18813k.get() == 2) {
            m11501a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f18809g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f18817o;
            PendingIntent resolveErrorPendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f18806d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            AbstractC7222ym.m26244u(statusCode, "Enter onConnectionResult, connect to server result: ", "HuaweiApiClientImpl");
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                m11514c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                m11525n();
                m11513c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f18824v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            m11525n();
            m11513c(1);
            if (this.f18825w != null) {
                WeakReference<Activity> weakReference = this.f18810h;
                if (weakReference != null && weakReference.get() != null) {
                    resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f18810h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, resolveErrorPendingIntent);
                this.f18825w.onConnectionFailed(connectionResult);
                this.f18823u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.m12620e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }
}
