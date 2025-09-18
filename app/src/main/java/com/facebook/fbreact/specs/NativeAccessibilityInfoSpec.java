package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void announceForAccessibility(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public void getRecommendedTimeoutMillis(double d, Callback callback) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void isReduceMotionEnabled(Callback callback);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void isTouchExplorationEnabled(Callback callback);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setAccessibilityFocus(double d);
}
