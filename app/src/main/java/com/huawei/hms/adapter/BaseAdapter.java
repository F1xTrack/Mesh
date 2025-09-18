package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p004ui.BaseResolutionAdapter;
import com.huawei.hms.adapter.p004ui.UpdateAdapter;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.ResponseWrap;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class BaseAdapter {

    /* renamed from: a */
    private WeakReference<ApiClient> f18723a;

    /* renamed from: b */
    private WeakReference<Activity> f18724b;

    /* renamed from: c */
    private BaseCallBack f18725c;

    /* renamed from: d */
    private String f18726d;

    /* renamed from: e */
    private String f18727e;

    /* renamed from: f */
    private Parcelable f18728f;

    /* renamed from: g */
    private BaseCallBack f18729g;

    /* renamed from: h */
    private String f18730h;

    /* renamed from: i */
    private Context f18731i;

    /* renamed from: j */
    private RequestHeader f18732j = new RequestHeader();

    /* renamed from: k */
    private ResponseHeader f18733k = new ResponseHeader();

    /* renamed from: l */
    private SystemObserver f18734l;

    /* renamed from: com.huawei.hms.adapter.BaseAdapter$1 */
    public class RunnableC20201 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CoreBaseResponse f18735a;

        public RunnableC20201(CoreBaseResponse coreBaseResponse) {
            coreBaseResponse = coreBaseResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m12622i("BaseAdapter", "postResolutionTimeoutHandle handle");
            SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.f18734l);
            ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.f18730h);
            BaseCallBack baseCallBackM11432b = BaseAdapter.this.m11432b();
            if (baseCallBackM11432b == null) {
                HMSLog.m12620e("BaseAdapter", "timeoutRunnable callBack is null");
            } else {
                BaseAdapter.this.m11421a(baseCallBackM11432b, coreBaseResponse);
            }
        }
    }

    /* renamed from: com.huawei.hms.adapter.BaseAdapter$2 */
    public class C20212 implements SystemObserver {
        public C20212() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                HMSLog.m12620e("BaseAdapter", "onSolutionResult but id is null");
                BaseCallBack baseCallBackM11432b = BaseAdapter.this.m11432b();
                if (baseCallBackM11432b == null) {
                    HMSLog.m12620e("BaseAdapter", "onSolutionResult baseCallBack null");
                    return true;
                }
                baseCallBackM11432b.onError(BaseAdapter.this.m11434b(-6));
                return true;
            }
            if (!str.equals(BaseAdapter.this.f18730h)) {
                return false;
            }
            HMSLog.m12622i("BaseAdapter", "onSolutionResult + id is :".concat(str));
            BaseCallBack baseCallBackM11432b2 = BaseAdapter.this.m11432b();
            if (baseCallBackM11432b2 == null) {
                HMSLog.m12620e("BaseAdapter", "onResult baseCallBack null");
                return true;
            }
            if (intent == null) {
                HMSLog.m12620e("BaseAdapter", "onSolutionResult but data is null");
                String strM11434b = BaseAdapter.this.m11434b(-7);
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.m11418a(baseAdapter.f18731i, BaseAdapter.this.f18733k, 0L);
                baseCallBackM11432b2.onError(strM11434b);
                return true;
            }
            if (BaseAdapter.this.m11439b(intent, baseCallBackM11432b2) || BaseAdapter.this.m11430a(intent, baseCallBackM11432b2)) {
                return true;
            }
            HMSLog.m12620e("BaseAdapter", "onComplete for on activity result");
            BaseAdapter.this.m11444c(intent, baseCallBackM11432b2);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            return false;
        }
    }

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {

        /* renamed from: a */
        private AtomicBoolean f18738a = new AtomicBoolean(true);

        /* renamed from: com.huawei.hms.adapter.BaseAdapter$BaseRequestResultCallback$1 */
        public class C20221 implements AvailableAdapter.AvailableCallBack {

            /* renamed from: a */
            final /* synthetic */ BaseCallBack f18740a;

            public C20221(BaseCallBack baseCallBack) {
                baseCallBack = baseCallBack;
            }

            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                AbstractC7222ym.m26244u(i, "complete handleSolutionForHMS, result: ", "BaseAdapter");
                if (i == 0) {
                    BaseAdapter.this.m11420a(baseCallBack);
                    return;
                }
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.m11410a(i, baseAdapter.m11413a(i)).toJson());
            }
        }

        public BaseRequestResultCallback() {
        }

        /* renamed from: a */
        private void m11458a(String str, BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse, int i) {
            if (!CommonCode.Resolution.HAS_RESOLUTION_FROM_APK.equals(str)) {
                if (!"installHMS".equals(str)) {
                    BaseAdapter.this.m11421a(baseCallBack, coreBaseResponse);
                    return;
                } else {
                    HMSLog.m12622i("BaseAdapter", "has resolutin: installHMS");
                    m11457a(baseCallBack, coreBaseResponse);
                    return;
                }
            }
            Activity activityM11441c = BaseAdapter.this.m11441c();
            HMSLog.m12622i("BaseAdapter", "activity is: " + activityM11441c);
            if (activityM11441c == null || activityM11441c.isFinishing()) {
                HMSLog.m12620e("BaseAdapter", "activity null");
                BaseAdapter.this.m11421a(baseCallBack, coreBaseResponse);
                return;
            }
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f18731i)) {
                    BaseAdapter.this.m11415a(activityM11441c, pendingIntent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.m11434b(-9));
                    return;
                }
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f18731i)) {
                    BaseAdapter.this.m11415a(activityM11441c, intent, coreBaseResponse);
                    return;
                } else {
                    baseCallBack.onError(BaseAdapter.this.m11434b(-9));
                    return;
                }
            }
            if (i == 2) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseCallBack.onError(baseAdapter.m11434b(baseAdapter.f18733k.getErrorCode()));
            } else {
                HMSLog.m12620e("BaseAdapter", "hasResolution is true but NO_SOLUTION");
                baseCallBack.onError(BaseAdapter.this.m11434b(-4));
            }
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) throws IllegalArgumentException {
            HMSLog.m12622i("BaseAdapter", "BaseRequestResultCallback onResult");
            BaseCallBack baseCallBackM11432b = BaseAdapter.this.m11432b();
            if (baseCallBackM11432b == null) {
                HMSLog.m12620e("BaseAdapter", "onResult baseCallBack null");
                return;
            }
            if (resolveResult == null) {
                HMSLog.m12620e("BaseAdapter", "result null");
                baseCallBackM11432b.onError(BaseAdapter.this.m11434b(-1));
                return;
            }
            CoreBaseResponse value = resolveResult.getValue();
            if (value == null) {
                HMSLog.m12620e("BaseAdapter", "response null");
                baseCallBackM11432b.onError(BaseAdapter.this.m11434b(-1));
                return;
            }
            if (TextUtils.isEmpty(value.getJsonHeader())) {
                HMSLog.m12620e("BaseAdapter", "jsonHeader null");
                baseCallBackM11432b.onError(BaseAdapter.this.m11434b(-1));
                return;
            }
            JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.f18733k);
            if (this.f18738a.compareAndSet(true, false)) {
                BaseAdapter baseAdapter = BaseAdapter.this;
                baseAdapter.m11417a(baseAdapter.f18731i, BaseAdapter.this.f18733k);
            }
            String resolution = BaseAdapter.this.f18733k.getResolution();
            int statusCode = BaseAdapter.this.f18733k.getStatusCode();
            HMSLog.m12622i("BaseAdapter", "api is: " + BaseAdapter.this.f18733k.getApiName() + ", resolution: " + resolution + ", status_code: " + statusCode);
            m11458a(resolution, baseCallBackM11432b, value, statusCode);
        }

        /* renamed from: a */
        private void m11457a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            if (!BaseAdapter.this.m11454h()) {
                if (Util.isAvailableLibExist(BaseAdapter.this.f18731i)) {
                    Activity activityM11441c = BaseAdapter.this.m11441c();
                    if (activityM11441c != null && !activityM11441c.isFinishing()) {
                        HMSLog.m12622i("BaseAdapter", "start handleSolutionForHMS");
                        AvailableAdapter availableAdapter = new AvailableAdapter(ExceptionCode.CRASH_EXCEPTION);
                        availableAdapter.setCalledBySolutionInstallHms(true);
                        availableAdapter.startResolution(activityM11441c, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.adapter.BaseAdapter.BaseRequestResultCallback.1

                            /* renamed from: a */
                            final /* synthetic */ BaseCallBack f18740a;

                            public C20221(BaseCallBack baseCallBack2) {
                                baseCallBack = baseCallBack2;
                            }

                            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                            public void onComplete(int i) {
                                AbstractC7222ym.m26244u(i, "complete handleSolutionForHMS, result: ", "BaseAdapter");
                                if (i == 0) {
                                    BaseAdapter.this.m11420a(baseCallBack);
                                    return;
                                }
                                BaseAdapter baseAdapter = BaseAdapter.this;
                                baseCallBack.onError(baseAdapter.m11410a(i, baseAdapter.m11413a(i)).toJson());
                            }
                        });
                        return;
                    }
                    HMSLog.m12620e("BaseAdapter", "activity is null");
                    try {
                        if (BaseAdapter.this.f18731i != null && AvailableUtil.isInstallerLibExist(BaseAdapter.this.f18731i)) {
                            HMSLog.m12622i("BaseAdapter", "pass installHMS intent");
                            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(BaseAdapter.this.f18731i, UpdateAdapter.class.getName());
                            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, ExceptionCode.CRASH_EXCEPTION);
                            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                            coreBaseResponse.setIntent(intentStartBridgeActivity);
                            BaseAdapter.this.m11421a(baseCallBack2, coreBaseResponse);
                        } else {
                            HMSLog.m12622i("BaseAdapter", "pass ACTIVITY_NULL error");
                            BaseAdapter baseAdapter = BaseAdapter.this;
                            baseCallBack2.onError(baseAdapter.m11410a(-3, baseAdapter.m11413a(-3)).toJson());
                        }
                        return;
                    } catch (RuntimeException unused) {
                        HMSLog.m12620e("BaseAdapter", "handleSolutionForHms pass result failed");
                        return;
                    }
                }
                HMSLog.m12622i("BaseAdapter", "handleSolutionForHms: no Available lib exist");
                baseCallBack2.onError(BaseAdapter.this.m11434b(-9));
                return;
            }
            HMSLog.m12622i("BaseAdapter", "HMS Core exists, need to refresh bind info");
            BaseAdapter.this.m11420a(baseCallBack2);
        }
    }

    /* renamed from: com.huawei.hms.adapter.BaseAdapter$a */
    public static class C2023a extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public C2023a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* renamed from: a */
        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    public BaseAdapter(ApiClient apiClient) {
        this.f18723a = new WeakReference<>(apiClient);
        if (apiClient == null) {
            HMSLog.m12623w("BaseAdapter", "BaseAdapter constructor client is null");
            return;
        }
        this.f18731i = apiClient.getContext().getApplicationContext();
        HMSLog.m12622i("BaseAdapter", "In constructor, WeakReference is " + this.f18723a);
    }

    /* renamed from: h */
    public boolean m11454h() {
        return new PackageManagerHelper(this.f18731i).getPackageStates(HMSPackageManager.getInstance(this.f18731i).getHMSPackageName()) == PackageManagerHelper.PackageStates.ENABLED;
    }

    /* renamed from: i */
    private void m11455i() throws IllegalArgumentException {
        if (this.f18726d == null || this.f18729g == null) {
            return;
        }
        this.f18733k = null;
        this.f18733k = new ResponseHeader();
        baseRequest(m11447d(), m11449e(), m11451f(), m11408a());
    }

    /* renamed from: j */
    private void m11456j() {
        if (this.f18731i == null) {
            HMSLog.m12620e("BaseAdapter", "sendBroadcastAfterResolutionHms, context is null");
            return;
        }
        Intent intent = new Intent("com.huawei.hms.core.action.SESSION_INVALID");
        try {
            intent.setPackage(this.f18731i.getPackageName());
            this.f18731i.sendBroadcast(intent);
        } catch (IllegalArgumentException unused) {
            HMSLog.m12620e("BaseAdapter", "IllegalArgumentException when sendBroadcastAfterResolutionHms intent.setPackage");
        }
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) throws IllegalArgumentException {
        m11429a(str, str2, parcelable, baseCallBack);
        if (this.f18723a == null) {
            HMSLog.m12620e("BaseAdapter", "client is null");
            baseCallBack.onError(m11434b(-2));
            return;
        }
        this.f18725c = baseCallBack;
        JsonUtil.jsonToEntity(str, this.f18732j);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.f18732j.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.m12620e("BaseAdapter", "get uri null");
            baseCallBack.onError(m11434b(-5));
            return;
        }
        String transactionId = this.f18732j.getTransactionId();
        this.f18730h = transactionId;
        if (TextUtils.isEmpty(transactionId)) {
            HMSLog.m12620e("BaseAdapter", "get transactionId null");
            baseCallBack.onError(m11434b(-6));
            return;
        }
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("in baseRequest + uri is :", apiName, ", transactionId is : ");
        sbM26240q.append(this.f18730h);
        HMSLog.m12622i("BaseAdapter", sbM26240q.toString());
        m11416a(this.f18731i, this.f18732j);
        m11412a(this.f18723a.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    /* renamed from: d */
    private String m11447d() {
        return this.f18726d;
    }

    /* renamed from: e */
    private String m11449e() {
        return this.f18727e;
    }

    /* renamed from: f */
    private Parcelable m11451f() {
        return this.f18728f;
    }

    /* renamed from: g */
    private void m11452g() {
        this.f18734l = new SystemObserver() { // from class: com.huawei.hms.adapter.BaseAdapter.2
            public C20212() {
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onNoticeResult(int i) {
                return false;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    HMSLog.m12620e("BaseAdapter", "onSolutionResult but id is null");
                    BaseCallBack baseCallBackM11432b = BaseAdapter.this.m11432b();
                    if (baseCallBackM11432b == null) {
                        HMSLog.m12620e("BaseAdapter", "onSolutionResult baseCallBack null");
                        return true;
                    }
                    baseCallBackM11432b.onError(BaseAdapter.this.m11434b(-6));
                    return true;
                }
                if (!str.equals(BaseAdapter.this.f18730h)) {
                    return false;
                }
                HMSLog.m12622i("BaseAdapter", "onSolutionResult + id is :".concat(str));
                BaseCallBack baseCallBackM11432b2 = BaseAdapter.this.m11432b();
                if (baseCallBackM11432b2 == null) {
                    HMSLog.m12620e("BaseAdapter", "onResult baseCallBack null");
                    return true;
                }
                if (intent == null) {
                    HMSLog.m12620e("BaseAdapter", "onSolutionResult but data is null");
                    String strM11434b = BaseAdapter.this.m11434b(-7);
                    BaseAdapter baseAdapter = BaseAdapter.this;
                    baseAdapter.m11418a(baseAdapter.f18731i, BaseAdapter.this.f18733k, 0L);
                    baseCallBackM11432b2.onError(strM11434b);
                    return true;
                }
                if (BaseAdapter.this.m11439b(intent, baseCallBackM11432b2) || BaseAdapter.this.m11430a(intent, baseCallBackM11432b2)) {
                    return true;
                }
                HMSLog.m12620e("BaseAdapter", "onComplete for on activity result");
                BaseAdapter.this.m11444c(intent, baseCallBackM11432b2);
                return true;
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i) {
                return false;
            }
        };
    }

    /* renamed from: c */
    public Activity m11441c() {
        if (this.f18724b == null) {
            HMSLog.m12622i("BaseAdapter", "activityWeakReference is " + this.f18724b);
            return null;
        }
        ApiClient apiClient = this.f18723a.get();
        if (apiClient == null) {
            HMSLog.m12622i("BaseAdapter", "tmpApi is null");
            return null;
        }
        HMSLog.m12622i("BaseAdapter", "activityWeakReference has " + this.f18724b.get());
        return Util.getActiveActivity(this.f18724b.get(), apiClient.getContext());
    }

    /* renamed from: b */
    public BaseCallBack m11432b() {
        BaseCallBack baseCallBack = this.f18725c;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.m12620e("BaseAdapter", "callback null");
        return null;
    }

    /* renamed from: b */
    private void m11436b(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.f18723a = new WeakReference<>(apiClient);
        this.f18724b = new WeakReference<>(activity);
        if (activity == null) {
            HMSLog.m12623w("BaseAdapter", "BaseAdapter constructor activity is null");
            return;
        }
        this.f18731i = activity.getApplicationContext();
        HMSLog.m12622i("BaseAdapter", "In constructor, activityWeakReference is " + this.f18724b + ", activity is " + this.f18724b.get());
    }

    /* renamed from: c */
    private void m11443c(int i) {
        this.f18733k.setTransactionId(this.f18732j.getTransactionId());
        this.f18733k.setAppID(this.f18732j.getAppID());
        this.f18733k.setApiName(this.f18732j.getApiName());
        this.f18733k.setSrvName(this.f18732j.getSrvName());
        this.f18733k.setPkgName(this.f18732j.getPkgName());
        this.f18733k.setStatusCode(1);
        this.f18733k.setErrorCode(i);
        this.f18733k.setErrorReason("Core error");
    }

    /* renamed from: a */
    private PendingResult<ResolveResult<CoreBaseResponse>> m11412a(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new C2023a(apiClient, str, coreBaseRequest);
    }

    /* renamed from: a */
    public void m11420a(BaseCallBack baseCallBack) {
        HMSPackageManager.getInstance(this.f18731i).resetMultiServiceState();
        baseCallBack.onError(m11410a(11, m11413a(11)).toJson());
        m11456j();
    }

    /* renamed from: b */
    public String m11434b(int i) {
        m11443c(i);
        return this.f18733k.toJson();
    }

    /* renamed from: b */
    private void m11438b(String str) {
        this.f18727e = str;
    }

    /* renamed from: b */
    private void m11437b(BaseCallBack baseCallBack) {
        this.f18729g = baseCallBack;
    }

    /* renamed from: a */
    public void m11421a(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
        HMSLog.m12622i("BaseAdapter", "baseCallBack.onComplete");
        PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
        if (pendingIntent != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
            return;
        }
        Intent intentModifyIntentBehaviorsSafe = IntentUtil.modifyIntentBehaviorsSafe(coreBaseResponse.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intentModifyIntentBehaviorsSafe);
        } else {
            baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
        }
    }

    /* renamed from: b */
    public boolean m11439b(Intent intent, BaseCallBack baseCallBack) throws IllegalArgumentException {
        if (!intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
        AbstractC7222ym.m26244u(intExtra, "kit_update_result is ", "BaseAdapter");
        if (intExtra == 1) {
            HMSLog.m12620e("BaseAdapter", "kit update success,replay request");
            m11455i();
        } else {
            HMSLog.m12620e("BaseAdapter", "kit update failed");
            baseCallBack.onError(m11410a(-10, m11413a(intExtra)).toJson());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11444c(android.content.Intent r7, com.huawei.hms.adapter.BaseAdapter.BaseCallBack r8) throws org.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = "json_header"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "json_body"
            java.lang.String r1 = r7.getStringExtra(r1)
            java.lang.String r2 = "status_code"
            java.lang.Object r2 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r0, r2)
            java.lang.String r3 = "error_code"
            java.lang.Object r3 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r0, r3)
            java.lang.String r4 = "HMS_FOREGROUND_RES_UI"
            boolean r5 = r7.hasExtra(r4)
            if (r5 == 0) goto L35
            java.lang.String r7 = r7.getStringExtra(r4)
            java.lang.String r4 = "uiDuration"
            java.lang.Object r7 = com.huawei.hms.utils.JsonUtil.getInfoFromJsonobject(r7, r4)
            boolean r4 = r7 instanceof java.lang.Long
            if (r4 == 0) goto L35
            java.lang.Long r7 = (java.lang.Long) r7
            long r4 = r7.longValue()
            goto L37
        L35:
            r4 = 0
        L37:
            boolean r7 = r2 instanceof java.lang.Integer
            if (r7 == 0) goto L5b
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 == 0) goto L5b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r7 = r2.intValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r6.m11434b(r2)
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f18733k
            r2.setStatusCode(r7)
            android.content.Context r7 = r6.f18731i
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f18733k
            r6.m11418a(r7, r2, r4)
            goto L66
        L5b:
            r7 = -8
            r6.m11434b(r7)
            android.content.Context r7 = r6.f18731i
            com.huawei.hms.common.internal.ResponseHeader r2 = r6.f18733k
            r6.m11418a(r7, r2, r4)
        L66:
            r7 = 0
            r8.onComplete(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.BaseAdapter.m11444c(android.content.Intent, com.huawei.hms.adapter.BaseAdapter$BaseCallBack):void");
    }

    /* renamed from: a */
    public void m11415a(Activity activity, Parcelable parcelable, CoreBaseResponse coreBaseResponse) {
        HMSLog.m12622i("BaseAdapter", "startResolution");
        RequestHeader requestHeader = this.f18732j;
        if (requestHeader != null) {
            m11436b(this.f18731i, requestHeader);
        }
        if (this.f18734l == null) {
            m11452g();
        }
        SystemManager.getSystemNotifier().registerObserver(this.f18734l);
        if (Build.VERSION.SDK_INT >= 29) {
            m11427a(coreBaseResponse);
        }
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.TRANSACTION_ID, this.f18730h);
        long time = new Timestamp(System.currentTimeMillis()).getTime();
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.RESOLUTION_FLAG, time);
        ResolutionFlagUtil.getInstance().saveResolutionFlag(this.f18730h, time);
        activity.startActivity(intentStartBridgeActivity);
    }

    /* renamed from: a */
    private void m11427a(CoreBaseResponse coreBaseResponse) {
        HMSLog.m12622i("BaseAdapter", "postResolutionTimeoutHandle");
        ApkResolutionFailedManager.getInstance().postTask(this.f18730h, new Runnable() { // from class: com.huawei.hms.adapter.BaseAdapter.1

            /* renamed from: a */
            final /* synthetic */ CoreBaseResponse f18735a;

            public RunnableC20201(CoreBaseResponse coreBaseResponse2) {
                coreBaseResponse = coreBaseResponse2;
            }

            @Override // java.lang.Runnable
            public void run() {
                HMSLog.m12622i("BaseAdapter", "postResolutionTimeoutHandle handle");
                SystemManager.getSystemNotifier().unRegisterObserver(BaseAdapter.this.f18734l);
                ApkResolutionFailedManager.getInstance().removeValueOnly(BaseAdapter.this.f18730h);
                BaseCallBack baseCallBackM11432b = BaseAdapter.this.m11432b();
                if (baseCallBackM11432b == null) {
                    HMSLog.m12620e("BaseAdapter", "timeoutRunnable callBack is null");
                } else {
                    BaseAdapter.this.m11421a(baseCallBackM11432b, coreBaseResponse);
                }
            }
        });
    }

    /* renamed from: a */
    private void m11416a(Context context, RequestHeader requestHeader) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* renamed from: a */
    public void m11417a(Context context, ResponseHeader responseHeader) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f18732j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, mapFromRequestHeader);
    }

    /* renamed from: a */
    public void m11418a(Context context, ResponseHeader responseHeader, long j) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(j));
        mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f18732j.getKitSdkVersion())));
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, mapFromRequestHeader);
    }

    /* renamed from: a */
    public ResponseWrap m11410a(int i, String str) {
        m11443c(i);
        ResponseWrap responseWrap = new ResponseWrap(this.f18733k);
        responseWrap.setBody(str);
        return responseWrap;
    }

    /* renamed from: a */
    public String m11413a(int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            HMSLog.m12620e("BaseAdapter", "buildBodyStr failed: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private void m11428a(String str) {
        this.f18726d = str;
    }

    /* renamed from: a */
    private void m11419a(Parcelable parcelable) {
        this.f18728f = parcelable;
    }

    /* renamed from: a */
    private BaseCallBack m11408a() {
        return this.f18729g;
    }

    /* renamed from: a */
    private void m11429a(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        m11428a(str);
        m11438b(str2);
        m11419a(parcelable);
        m11437b(baseCallBack);
    }

    /* renamed from: a */
    public boolean m11430a(Intent intent, BaseCallBack baseCallBack) throws IllegalArgumentException {
        if (!intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            return false;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, 1001);
        if (intExtra == 1001) {
            HMSLog.m12622i("BaseAdapter", "privacy_statement_confirm_result agreed: " + intExtra + ", replay request");
            m11455i();
            return true;
        }
        AbstractC7222ym.m26244u(intExtra, "privacy_statement_confirm_result rejected: ", "BaseAdapter");
        baseCallBack.onError(m11410a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE, m11413a(CommonCode.BusInterceptor.PRIVACY_CNCEL_ERROR_CODE)).toJson());
        return true;
    }
}
