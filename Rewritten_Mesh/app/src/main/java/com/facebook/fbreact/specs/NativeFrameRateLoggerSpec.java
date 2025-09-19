package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FrameRateLogger";

    public NativeFrameRateLoggerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void beginScroll();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void endScroll();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setContext(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setGlobalOptions(ReadableMap readableMap);
}
