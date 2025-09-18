package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeIntentAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IntentAndroid";

    public NativeIntentAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void canOpenURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getInitialURL(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void openSettings(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void openURL(String str, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void sendIntent(String str, ReadableArray readableArray, Promise promise);
}
