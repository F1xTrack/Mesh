package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "I18nManager";

    public NativeI18nManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC0965PK
    public abstract void allowRTL(boolean z);

    @ReactMethod
    @InterfaceC0965PK
    public abstract void forceRTL(boolean z);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC0965PK
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC0965PK
    public abstract void swapLeftAndRightInRTL(boolean z);
}
