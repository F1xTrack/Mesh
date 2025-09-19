package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageLoader";

    public NativeImageLoaderAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void abortRequest(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageLoader";
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getSize(String str, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void prefetchImage(String str, double d, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void queryCache(ReadableArray readableArray, Promise promise);
}
