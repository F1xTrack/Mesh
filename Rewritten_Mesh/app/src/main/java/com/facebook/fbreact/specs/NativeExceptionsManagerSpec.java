package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ExceptionsManager";

    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public void dismissRedbox() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public void reportException(ReadableMap readableMap) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d);
}
