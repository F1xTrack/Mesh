package com.reactnativedocumentpicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public abstract class NativeDocumentPickerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDocumentPickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void pick(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void pickDirectory(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void releaseSecureAccess(ReadableArray readableArray, Promise promise);
}
