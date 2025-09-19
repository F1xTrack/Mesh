package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public abstract class NativeModuleTimePickerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeModuleTimePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void dismiss(Promise promise);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void open(ReadableMap readableMap, Promise promise);
}
