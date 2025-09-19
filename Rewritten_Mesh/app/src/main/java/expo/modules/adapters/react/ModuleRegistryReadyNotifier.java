package expo.modules.adapters.react;

import com.facebook.react.bridge.BaseJavaModule;
import p000.C7818Js0;

/* loaded from: classes2.dex */
public class ModuleRegistryReadyNotifier extends BaseJavaModule {
    private C7818Js0 mModuleRegistry;

    public ModuleRegistryReadyNotifier(C7818Js0 c7818Js0) {
        this.mModuleRegistry = c7818Js0;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ModuleRegistryReadyNotifier";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mModuleRegistry.m4459a();
    }
}
