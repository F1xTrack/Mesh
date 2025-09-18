package com.huawei.hms.rn.push.remote;

import android.app.PendingIntent;
import android.content.Intent;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.logger.HMSLogger;
import com.huawei.hms.rn.push.utils.ActivityUtils;
import com.huawei.hms.rn.push.utils.ResultUtils;
import defpackage.C1167Os1;
import defpackage.I30;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HmsPushInstanceId extends ReactContextBaseJavaModule {
    private static volatile ReactApplicationContext context;
    private final String TAG;

    public HmsPushInstanceId(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "HmsPushInstanceId";
        setContext(reactApplicationContext);
    }

    public static ReactApplicationContext getContext() {
        return context;
    }

    public static /* synthetic */ void lambda$getAAID$0(Promise promise, AAIDResult aAIDResult) {
        HMSLogger.getInstance(getContext()).sendSingleEvent("getAAID");
        ResultUtils.handleResult(true, aAIDResult.getId(), promise);
    }

    public static /* synthetic */ void lambda$getAAID$1(Promise promise, Exception exc) {
        HMSLogger.getInstance(getContext()).sendSingleEvent("getAAID", exc.getMessage());
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
    }

    public static void setContext(ReactApplicationContext reactApplicationContext) {
        context = reactApplicationContext;
    }

    @ReactMethod
    public void deleteAAID(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("deleteAAID");
        try {
            HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).deleteAAID();
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteAAID");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } catch (ApiException e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteAAID", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void deleteToken(String str, Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("deleteToken");
        try {
            String string = C1167Os1.c(getContext()).getString(Core.CLIENT_APP_ID);
            String str2 = "HCM";
            if (str == null) {
                str = "HCM";
            }
            if (!str.trim().isEmpty()) {
                str2 = str;
            }
            HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).deleteToken(string, str2);
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteToken");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } catch (ApiException e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteToken", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void deleteTokenWithSubjectId(String str, Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("deleteTokenWithSubjectId");
        try {
            HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).deleteToken(str);
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteTokenWithSubjectId");
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        } catch (ApiException e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("deleteTokenWithSubjectId", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void getAAID(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getAAID");
        Task aaid = HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getAAID();
        aaid.c(new I30(0, promise));
        aaid.b(new I30(1, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @ReactMethod
    public void getCreationTime(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getCreationTime");
        try {
            String str = HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getCreationTime() + "";
            HMSLogger.getInstance(getContext()).sendSingleEvent("getCreationTime");
            ResultUtils.handleResult(true, str, promise);
        } catch (Exception e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("getCreationTime", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void getId(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getId");
        try {
            String id = HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getId();
            HMSLogger.getInstance(getContext()).sendSingleEvent("getId");
            ResultUtils.handleResult(true, id, promise);
        } catch (Exception e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("getId", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.TAG;
    }

    @ReactMethod
    public void getToken(String str, Promise promise) throws PendingIntent.CanceledException {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getToken");
        try {
            String string = C1167Os1.c(getContext()).getString(Core.CLIENT_APP_ID);
            String str2 = "HCM";
            if (str == null) {
                str = "HCM";
            }
            if (!str.trim().isEmpty()) {
                str2 = str;
            }
            String token = HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getToken(string, str2);
            HMSLogger.getInstance(getContext()).sendSingleEvent("getToken");
            ResultUtils.handleResult(true, token, promise);
        } catch (ApiException e) {
            if (e instanceof ResolvableApiException) {
                ResolvableApiException resolvableApiException = (ResolvableApiException) e;
                PendingIntent resolution = resolvableApiException.getResolution();
                if (resolution != null) {
                    try {
                        resolution.send();
                    } catch (PendingIntent.CanceledException unused) {
                        HMSLogger.getInstance(getContext()).sendSingleEvent("getToken," + e.getMessage());
                    }
                } else {
                    Intent resolutionIntent = resolvableApiException.getResolutionIntent();
                    if (resolutionIntent != null) {
                        HMSLogger.getInstance(getContext()).sendSingleEvent("has resolution by intent");
                        resolutionIntent.setFlags(268435456);
                        getContext().startActivity(resolutionIntent);
                    }
                }
            }
            HMSLogger.getInstance(getContext()).sendSingleEvent("getToken", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @ReactMethod
    public void getTokenWithSubjectId(String str, Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getTokenWithSubjectId");
        try {
            String token = HmsInstanceId.getInstance(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getToken(str);
            HMSLogger.getInstance(getContext()).sendSingleEvent("getTokenWithSubjectId");
            ResultUtils.handleResult(true, token, promise);
        } catch (ApiException e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("getTokenWithSubjectId", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }
}
