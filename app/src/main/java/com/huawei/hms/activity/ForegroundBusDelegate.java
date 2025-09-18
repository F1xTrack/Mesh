package com.huawei.hms.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    public static final String HMS_FOREGROUND_REQ_BODY = "HMS_FOREGROUND_REQ_BODY";
    public static final String HMS_FOREGROUND_REQ_HEADER = "HMS_FOREGROUND_REQ_HEADER";
    public static final String HMS_FOREGROUND_REQ_INNER = "HMS_FOREGROUND_REQ_INNER";
    public static final String HMS_FOREGROUND_RESP_HEADER = "HMS_FOREGROUND_RESP_HEADER";
    public static final String INNER_PKG_NAME = "INNER_PACKAGE_NAME";

    /* renamed from: a */
    private RequestHeader f18694a;

    /* renamed from: b */
    private String f18695b;

    /* renamed from: c */
    private ForegroundInnerHeader f18696c = new ForegroundInnerHeader();

    /* renamed from: d */
    private ResponseHeader f18697d;

    /* renamed from: e */
    private WeakReference<Activity> f18698e;

    /* renamed from: f */
    private boolean f18699f;

    /* renamed from: com.huawei.hms.activity.ForegroundBusDelegate$b */
    public class C2017b implements AvailableAdapter.AvailableCallBack {
        private C2017b() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0) {
                ForegroundBusDelegate.this.m11401h();
            } else {
                HMSLog.m12622i("ForegroundBusDelegate", "version check failed");
                ForegroundBusDelegate.this.m11389a(0, "apk version is invalid");
            }
        }
    }

    /* renamed from: b */
    private BusResponseCallback m11394b(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    /* renamed from: c */
    private void m11396c() {
        if (this.f18694a != null) {
            m11393a(HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED);
        }
    }

    /* renamed from: d */
    private void m11397d() {
        m11393a(HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY);
    }

    /* renamed from: e */
    private void m11398e() {
        if (m11400g() == null) {
            HMSLog.m12620e("ForegroundBusDelegate", "checkMinVersion failed, activity must not be null.");
            m11389a(0, "checkMinVersion failed, activity must not be null.");
            return;
        }
        if (this.f18699f) {
            m11401h();
            return;
        }
        if (!Util.isAvailableLibExist(m11400g().getApplicationContext())) {
            if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(m11400g().getApplicationContext(), this.f18696c.getApkVersion()) == 0) {
                m11401h();
                return;
            } else {
                HMSLog.m12620e("ForegroundBusDelegate", "checkMinVersion failed, and no available lib exists.");
                m11389a(0, "apk version is invalid");
                return;
            }
        }
        C2017b c2017b = new C2017b();
        AvailableAdapter availableAdapter = new AvailableAdapter(this.f18696c.getApkVersion());
        int iIsHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(m11400g());
        if (iIsHuaweiMobileServicesAvailable == 0) {
            c2017b.onComplete(iIsHuaweiMobileServicesAvailable);
        } else if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable)) {
            m11390a(m11400g(), availableAdapter, c2017b);
        } else {
            c2017b.onComplete(iIsHuaweiMobileServicesAvailable);
        }
    }

    /* renamed from: f */
    private void m11399f() {
        Activity activityM11400g = m11400g();
        if (activityM11400g == null || activityM11400g.isFinishing()) {
            return;
        }
        activityM11400g.finish();
    }

    /* renamed from: g */
    private Activity m11400g() {
        WeakReference<Activity> weakReference = this.f18698e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m11401h() {
        HMSLog.m12622i("ForegroundBusDelegate", "startApkHubActivity");
        Activity activityM11400g = m11400g();
        if (activityM11400g == null) {
            HMSLog.m12620e("ForegroundBusDelegate", "startApkHubActivity but activity is null");
            return;
        }
        String packageName = this.f18699f ? activityM11400g.getPackageName() : HMSPackageManager.getInstance(activityM11400g.getApplicationContext()).getHMSPackageNameForMultiService();
        if (TextUtils.isEmpty(packageName)) {
            HMSLog.m12620e("ForegroundBusDelegate", "hmsPackageName is null, Service is invalid.");
            m11389a(0, "hmsPackageName is null, Service is invalid.");
            return;
        }
        Intent intent = new Intent(this.f18696c.getAction());
        intent.putExtra(HMS_FOREGROUND_REQ_BODY, this.f18695b);
        try {
            intent.setPackage(packageName);
        } catch (IllegalArgumentException unused) {
            HMSLog.m12620e("ForegroundBusDelegate", "IllegalArgumentException when startApkHubActivity intent.setPackage");
        }
        intent.putExtra(BridgeActivity.EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activityM11400g));
        intent.setClassName(packageName, "com.huawei.hms.core.activity.UiJumpActivity");
        intent.putExtra(HMS_FOREGROUND_REQ_HEADER, this.f18694a.toJson());
        intent.putExtra("intent.extra.hms.core.DELEGATE_NAME", "com.huawei.hms.core.activity.ForegroundBus");
        try {
            m11395b();
            activityM11400g.startActivityForResult(intent, 431057);
        } catch (ActivityNotFoundException e) {
            HMSLog.m12621e("ForegroundBusDelegate", "Launch sign in Intent failed. hms is probably being updated：", e);
            m11389a(0, "launch bus intent failed");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 431057;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.m12620e("ForegroundBusDelegate", "activity is null");
            m11389a(0, "activity is null");
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.m12620e("ForegroundBusDelegate", "activity is finishing");
            m11389a(0, "activity is finishing");
            return;
        }
        this.f18698e = new WeakReference<>(activity);
        try {
            Intent intent = activity.getIntent();
            if (intent == null) {
                m11389a(0, "intent is invalid");
                return;
            }
            String stringExtra = intent.getStringExtra(HMS_FOREGROUND_REQ_HEADER);
            RequestHeader requestHeader = new RequestHeader();
            this.f18694a = requestHeader;
            if (!requestHeader.fromJson(stringExtra)) {
                m11389a(0, "header is invalid");
                return;
            }
            this.f18695b = intent.getStringExtra(HMS_FOREGROUND_REQ_BODY);
            ForegroundInnerHeader foregroundInnerHeader = this.f18696c;
            if (foregroundInnerHeader == null) {
                m11389a(0, "inner header is invalid");
                return;
            }
            foregroundInnerHeader.fromJson(intent.getStringExtra(HMS_FOREGROUND_REQ_INNER));
            if (TextUtils.isEmpty(this.f18694a.getApiName())) {
                m11389a(0, "action is invalid");
                return;
            }
            m11387a();
            if (!TextUtils.isEmpty(intent.getStringExtra(INNER_PKG_NAME))) {
                HMSLog.m12622i("ForegroundBusDelegate", "isUseInnerHms: true");
                this.f18699f = true;
            }
            m11398e();
        } catch (Throwable th) {
            HMSLog.m12620e("ForegroundBusDelegate", "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
            m11389a(0, "ForegroundBusDelegate getStringExtra error:" + th.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        m11396c();
        this.f18698e = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) throws IllegalArgumentException {
        String stringExtra;
        if (i != 431057) {
            return false;
        }
        if (intent != null && intent.hasExtra(HMS_FOREGROUND_RESP_HEADER)) {
            try {
                stringExtra = intent.getStringExtra(HMS_FOREGROUND_RESP_HEADER);
            } catch (Throwable unused) {
                HMSLog.m12623w("ForegroundBusDelegate", "exception occur, HMS_FOREGROUND_RESP_HEADER get failed.");
                stringExtra = "";
            }
            ResponseHeader responseHeader = new ResponseHeader();
            this.f18697d = responseHeader;
            JsonUtil.jsonToEntity(stringExtra, responseHeader);
        }
        m11397d();
        BusResponseCallback busResponseCallbackM11394b = m11394b(this.f18696c.getResponseCallbackKey());
        if (busResponseCallbackM11394b == null) {
            m11388a(i2, intent);
            return true;
        }
        BusResponseResult busResponseResultSucceedReturn = busResponseCallbackM11394b.succeedReturn(this.f18698e.get(), i2, intent);
        if (busResponseResultSucceedReturn == null) {
            m11388a(i2, intent);
            return true;
        }
        m11388a(busResponseResultSucceedReturn.getCode(), busResponseResultSucceedReturn.getIntent());
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }

    /* renamed from: b */
    private void m11395b() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f18694a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f18694a.getKitSdkVersion())));
        if (m11400g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m11400g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_START_CORE_ACTIVITY, mapFromForegroundRequestHeader);
        }
    }

    /* renamed from: a */
    private void m11388a(int i, Intent intent) {
        HMSLog.m12622i("ForegroundBusDelegate", "succeedReturn");
        Activity activityM11400g = m11400g();
        if (activityM11400g == null) {
            return;
        }
        activityM11400g.setResult(i, IntentUtil.modifyIntentBehaviorsSafe(intent));
        m11399f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11389a(int i, String str) {
        BusResponseResult busResponseResultInnerError;
        HMSLog.m12620e("ForegroundBusDelegate", str);
        Activity activityM11400g = m11400g();
        if (activityM11400g == null) {
            return;
        }
        BusResponseCallback busResponseCallbackM11394b = m11394b(this.f18696c.getResponseCallbackKey());
        if (busResponseCallbackM11394b == null || (busResponseResultInnerError = busResponseCallbackM11394b.innerError(this.f18698e.get(), i, str)) == null) {
            activityM11400g.setResult(0);
        } else {
            activityM11400g.setResult(busResponseResultInnerError.getCode(), IntentUtil.modifyIntentBehaviorsSafe(busResponseResultInnerError.getIntent()));
        }
        m11399f();
    }

    /* renamed from: a */
    private static void m11390a(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.m12622i("ForegroundBusDelegate", "null activity, could not start resolution intent");
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }

    /* renamed from: a */
    private void m11387a() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f18694a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f18694a.getKitSdkVersion())));
        if (m11400g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m11400g().getApplicationContext(), HiAnalyticsConstant.HMS_SDK_BASE_ACTIVITY_STARTED, mapFromForegroundRequestHeader);
        }
    }

    /* renamed from: a */
    private void m11393a(String str) {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.f18694a);
        mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapFromForegroundRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(this.f18694a.getKitSdkVersion())));
        ResponseHeader responseHeader = this.f18697d;
        if (responseHeader != null) {
            mapFromForegroundRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
            mapFromForegroundRequestHeader.put("result", String.valueOf(this.f18697d.getErrorCode()));
        }
        if (m11400g() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(m11400g().getApplicationContext(), str, mapFromForegroundRequestHeader);
        }
    }
}
