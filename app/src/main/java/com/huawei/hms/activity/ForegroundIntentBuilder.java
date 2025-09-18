package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import p000.AbstractC0852NX;

/* loaded from: classes.dex */
public class ForegroundIntentBuilder {

    /* renamed from: a */
    private Activity f18701a;

    /* renamed from: b */
    private RequestHeader f18702b;

    /* renamed from: c */
    private String f18703c;

    /* renamed from: d */
    private ForegroundInnerHeader f18704d;

    /* renamed from: e */
    private String f18705e;

    /* renamed from: f */
    private Context f18706f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.f18701a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.f18702b = requestHeader;
        requestHeader.setSdkVersion(61200300);
        this.f18703c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.f18704d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f18701a, ForegroundBusDelegate.class.getName());
        Context context = this.f18706f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f18706f);
        } else {
            packageName = this.f18701a.getPackageName();
            appId = Util.getAppId(this.f18701a);
        }
        if (this.f18702b.getAppID() == null) {
            this.f18702b.setAppID(appId + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        } else {
            RequestHeader requestHeader = this.f18702b;
            StringBuilder sbM5762k = AbstractC0852NX.m5762k(appId, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sbM5762k.append(this.f18702b.getAppID());
            requestHeader.setAppID(sbM5762k.toString());
        }
        if (TextUtils.isEmpty(this.f18702b.getTransactionId())) {
            RequestHeader requestHeader2 = this.f18702b;
            requestHeader2.setTransactionId(TransactionIdCreater.getId(requestHeader2.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.f18702b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.f18702b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f18703c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.f18704d.toJson());
        if (!TextUtils.isEmpty(this.f18705e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.f18705e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.f18702b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i) {
        this.f18702b.setApiLevel(i);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f18706f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.f18705e = this.f18701a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i) {
        this.f18702b.setKitSdkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i) {
        this.f18704d.setApkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f18703c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.f18704d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.f18702b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.f18702b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.f18702b.setTransactionId(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.f18704d.setResponseCallbackKey(str);
        return this;
    }
}
