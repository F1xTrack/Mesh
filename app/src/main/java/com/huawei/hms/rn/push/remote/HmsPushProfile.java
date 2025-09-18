package com.huawei.hms.rn.push.remote;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.push.HmsProfile;
import com.huawei.hms.rn.push.logger.HMSLogger;
import com.huawei.hms.rn.push.utils.ResultUtils;
import defpackage.J30;

/* loaded from: classes.dex */
public class HmsPushProfile extends ReactContextBaseJavaModule {
    private static volatile ReactApplicationContext context;
    private final String TAG;
    private final HMSLogger hmsLogger;
    private final HmsProfile hmsProfile;

    public HmsPushProfile(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "HmsPushProfile";
        setContext(reactApplicationContext);
        this.hmsProfile = HmsProfile.getInstance(reactApplicationContext);
        this.hmsLogger = HMSLogger.getInstance(getContext());
    }

    public static ReactApplicationContext getContext() {
        return context;
    }

    public /* synthetic */ void lambda$addProfile$0(Promise promise, Void r3) {
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
        this.hmsLogger.sendSingleEvent("addProfile");
    }

    public /* synthetic */ void lambda$addProfile$1(Promise promise, Exception exc) {
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
        this.hmsLogger.sendSingleEvent("addProfile", exc.getMessage());
    }

    public /* synthetic */ void lambda$addProfileWithSubjectId$2(Promise promise, Void r3) {
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
        this.hmsLogger.sendSingleEvent("addProfileWithSubjectId");
    }

    public /* synthetic */ void lambda$addProfileWithSubjectId$3(Promise promise, Exception exc) {
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
        this.hmsLogger.sendSingleEvent("addProfileWithSubjectId", exc.getMessage());
    }

    public /* synthetic */ void lambda$deleteProfile$4(Promise promise, Void r3) {
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
        this.hmsLogger.sendSingleEvent("deleteProfile");
    }

    public /* synthetic */ void lambda$deleteProfile$5(Promise promise, Exception exc) {
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
        this.hmsLogger.sendSingleEvent("deleteProfile", exc.getMessage());
    }

    public /* synthetic */ void lambda$deleteProfileWithSubjectId$6(Promise promise, Void r3) {
        ResultUtils.handleResult(true, Boolean.TRUE, promise);
        this.hmsLogger.sendSingleEvent("deleteProfileWithSubjectId");
    }

    public /* synthetic */ void lambda$deleteProfileWithSubjectId$7(Promise promise, Exception exc) {
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
        this.hmsLogger.sendSingleEvent("deleteProfileWithSubjectId", exc.getMessage());
    }

    public static void setContext(ReactApplicationContext reactApplicationContext) {
        context = reactApplicationContext;
    }

    @ReactMethod
    public void addProfile(int i, String str, Promise promise) {
        this.hmsLogger.startMethodExecutionTimer("addProfile");
        Task taskAddProfile = this.hmsProfile.addProfile(i, str);
        taskAddProfile.c(new J30(this, promise, 2));
        taskAddProfile.b(new J30(this, promise, 3));
    }

    @ReactMethod
    public void addProfileWithSubjectId(String str, int i, String str2, Promise promise) {
        this.hmsLogger.startMethodExecutionTimer("addProfileWithSubjectId");
        Task taskAddProfile = this.hmsProfile.addProfile(str, i, str2);
        taskAddProfile.c(new J30(this, promise, 6));
        taskAddProfile.b(new J30(this, promise, 7));
    }

    @ReactMethod
    public void deleteProfile(String str, Promise promise) {
        this.hmsLogger.startMethodExecutionTimer("deleteProfile");
        Task taskDeleteProfile = this.hmsProfile.deleteProfile(str);
        taskDeleteProfile.c(new J30(this, promise, 0));
        taskDeleteProfile.b(new J30(this, promise, 1));
    }

    @ReactMethod
    public void deleteProfileWithSubjectId(String str, String str2, Promise promise) {
        this.hmsLogger.startMethodExecutionTimer("deleteProfileWithSubjectId");
        Task taskDeleteProfile = this.hmsProfile.deleteProfile(str, str2);
        taskDeleteProfile.c(new J30(this, promise, 4));
        taskDeleteProfile.b(new J30(this, promise, 5));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.TAG;
    }

    @ReactMethod
    public void isSupportProfile(Promise promise) {
        this.hmsLogger.startMethodExecutionTimer("isSupportProfile");
        try {
            boolean zIsSupportProfile = this.hmsProfile.isSupportProfile();
            this.hmsLogger.sendSingleEvent("isSupportProfile");
            ResultUtils.handleResult(true, Boolean.valueOf(zIsSupportProfile), promise);
        } catch (Exception e) {
            HMSLogger.getInstance(getContext()).sendSingleEvent("isSupportProfile", e.getMessage());
            ResultUtils.handleResult(false, e.getLocalizedMessage(), promise);
        }
    }
}
