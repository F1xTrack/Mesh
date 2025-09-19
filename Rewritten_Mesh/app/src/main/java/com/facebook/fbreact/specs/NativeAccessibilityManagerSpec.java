package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityManager";

    public NativeAccessibilityManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    @InterfaceC0965PK
    public void announceForAccessibilityWithOptions(String str, ReadableMap readableMap) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentBoldTextState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentGrayscaleState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentInvertColorsState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC0965PK
    public void getCurrentPrefersCrossFadeTransitionsState(Callback callback, Callback callback2) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentReduceMotionState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentReduceTransparencyState(Callback callback, Callback callback2);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getCurrentVoiceOverState(Callback callback, Callback callback2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setAccessibilityContentSizeMultipliers(ReadableMap readableMap);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setAccessibilityFocus(double d);
}
