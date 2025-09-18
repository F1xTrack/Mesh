package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC0965PK
    public void onFastRefresh() {
    }

    @ReactMethod
    @InterfaceC0965PK
    public void openDebugger() {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void reload();

    @ReactMethod
    @InterfaceC0965PK
    public void reloadWithReason(String str) {
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void removeListeners(double d);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setHotLoadingEnabled(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setIsDebuggingRemotely(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void setProfilingEnabled(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void toggleElementInspector();
}
