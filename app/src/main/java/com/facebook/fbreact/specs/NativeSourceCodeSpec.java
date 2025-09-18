package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p000.InterfaceC0965PK;

/* loaded from: classes.dex */
public abstract class NativeSourceCodeSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "SourceCode";

    public NativeSourceCodeSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

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
}
