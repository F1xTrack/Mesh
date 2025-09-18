package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void attachGestureHandler(double d, double d2, double d3);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void createGestureHandler(String str, double d, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void dropGestureHandler(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void handleClearJSResponder();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void handleSetJSResponder(double d, boolean z);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract boolean install();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void updateGestureHandler(double d, ReadableMap readableMap);
}
