package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevMenu";

    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void debugRemotely(boolean z);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void reload();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void show();
}
