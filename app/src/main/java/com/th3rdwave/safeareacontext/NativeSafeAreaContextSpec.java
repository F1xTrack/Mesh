package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public abstract class NativeSafeAreaContextSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeSafeAreaContextSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC0965PK
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    public abstract Map<String, Object> getTypedExportedConstants();
}
