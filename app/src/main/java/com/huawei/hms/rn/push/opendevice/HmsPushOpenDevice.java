package com.huawei.hms.rn.push.opendevice;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.opendevice.OpenDevice;
import com.huawei.hms.rn.push.logger.HMSLogger;
import com.huawei.hms.rn.push.utils.ActivityUtils;
import com.huawei.hms.rn.push.utils.ResultUtils;
import com.huawei.hms.support.api.opendevice.OdidResult;
import defpackage.I30;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HmsPushOpenDevice extends ReactContextBaseJavaModule {
    private static volatile ReactApplicationContext context;
    private final String TAG;

    public HmsPushOpenDevice(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "HmsPushOpenDevice";
        setContext(reactApplicationContext);
    }

    public static ReactApplicationContext getContext() {
        return context;
    }

    public static /* synthetic */ void lambda$getOdid$0(Promise promise, OdidResult odidResult) {
        HMSLogger.getInstance(getContext()).sendSingleEvent("getOdid");
        ResultUtils.handleResult(true, odidResult.getId(), promise);
    }

    public static /* synthetic */ void lambda$getOdid$1(Promise promise, Exception exc) {
        HMSLogger.getInstance(getContext()).sendSingleEvent("getOdid");
        ResultUtils.handleResult(false, exc.getLocalizedMessage(), promise);
    }

    public static void setContext(ReactApplicationContext reactApplicationContext) {
        context = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.TAG;
    }

    @ReactMethod
    public void getOdid(Promise promise) {
        HMSLogger.getInstance(getContext()).startMethodExecutionTimer("getOdid");
        Task odid = OpenDevice.getOpenDeviceClient(ActivityUtils.getRealActivity(getCurrentActivity(), getContext())).getOdid();
        odid.c(new I30(6, promise));
        odid.b(new I30(7, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }
}
