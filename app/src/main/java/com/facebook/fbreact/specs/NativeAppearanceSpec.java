package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeAppearanceSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Appearance";

    public NativeAppearanceSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    @InterfaceC0965PK
    public abstract String getColorScheme();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Appearance";
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC0965PK
    public void setColorScheme(String str) {
    }
}
