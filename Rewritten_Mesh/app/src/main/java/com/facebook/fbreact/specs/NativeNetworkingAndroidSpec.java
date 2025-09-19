package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Networking";

    public NativeNetworkingAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void abortRequest(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void clearCookies(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void sendRequest(String str, String str2, double d, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d2, boolean z2);
}
