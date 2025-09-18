package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements TurboModuleManager.ModuleProvider {
    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManager.ModuleProvider
    public final NativeModule getModule(String str) {
        return TurboModuleManager.lambda$new$0(str);
    }
}
