package com.huawei.hms.rn.availability;

import android.content.DialogInterface;
import android.util.ArrayMap;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.api.HuaweiApiAvailability;
import defpackage.RunnableC7526v20;
import java.util.Map;

/* loaded from: classes.dex */
public class HMSAvailabilityModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public HMSAvailabilityModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public /* synthetic */ void lambda$showErrorDialogFragment$0(DialogInterface dialogInterface) {
        sendEvent(this.reactContext, "OnErrorDialogFragmentCancelled");
    }

    public /* synthetic */ void lambda$showErrorDialogFragment$1(int i, int i2, Promise promise) {
        promise.resolve(Boolean.valueOf(HuaweiApiAvailability.getInstance().showErrorDialogFragment(getCurrentActivity(), i, i2, new DialogInterface.OnCancelListener() { // from class: u20
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.lambda$showErrorDialogFragment$0(dialogInterface);
            }
        })));
    }

    private void sendEvent(ReactContext reactContext, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    @ReactMethod
    public void getApiMap(Promise promise) {
        promise.resolve(Util.mapToWM(HuaweiApiAvailability.getApiMap()));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put("HMS_CORE_APK_AVAILABLE", 0);
        arrayMap2.put("NO_HMS_CORE_APK", 1);
        arrayMap2.put("HMS_CORE_APK_OUT_OF_DATE", 2);
        arrayMap2.put("HMS_CORE_APK_UNAVAILABLE", 3);
        arrayMap2.put("APK_IS_NOT_OFFICIAL_VERSION", 9);
        arrayMap2.put("HMS_CORE_APK_TOO_OLD", 21);
        arrayMap.put("ErrorCode", arrayMap2);
        return arrayMap;
    }

    @ReactMethod
    public void getErrorString(int i, Promise promise) {
        promise.resolve(HuaweiApiAvailability.getInstance().getErrorString(i));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "HMSAvailabilityModule";
    }

    @ReactMethod
    public void getServicesVersionCode(Promise promise) {
        promise.resolve(Integer.valueOf(HuaweiApiAvailability.getServicesVersionCode()));
    }

    @ReactMethod
    public void isHuaweiMobileNoticeAvailable(Promise promise) {
        promise.resolve(Integer.valueOf(HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.reactContext)));
    }

    @ReactMethod
    public void isHuaweiMobileServicesAvailableWithParam(int i, Promise promise) {
        promise.resolve(Integer.valueOf(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.reactContext, i)));
    }

    @ReactMethod
    public void isHuaweiMobileServicesAvailableWithoutParam(Promise promise) {
        promise.resolve(Integer.valueOf(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.reactContext)));
    }

    @ReactMethod
    public void isUserResolvableError(int i, Promise promise) {
        promise.resolve(Boolean.valueOf(HuaweiApiAvailability.getInstance().isUserResolvableError(i)));
    }

    @ReactMethod
    public void resolveError(int i, int i2, Promise promise) {
        HuaweiApiAvailability.getInstance().resolveError(getCurrentActivity(), i, i2);
        promise.resolve(null);
    }

    @ReactMethod
    public void setServicesVersionCode(int i, Promise promise) {
        HuaweiApiAvailability.setServicesVersionCode(i);
        promise.resolve(null);
    }

    @ReactMethod
    public void showErrorDialogFragment(int i, int i2, Promise promise) {
        getCurrentActivity().runOnUiThread(new RunnableC7526v20(this, i, i2, promise));
    }

    @ReactMethod
    public void showErrorNotification(int i, Promise promise) {
        HuaweiApiAvailability.getInstance().showErrorNotification(getCurrentActivity(), i);
        promise.resolve(null);
    }
}
