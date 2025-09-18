package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import p000.AbstractC9487gM0;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
@Deprecated(since = "CompositeReactPackageTurboModuleManagerDelegate is deprecated and will be deleted in the future. Please use ReactPackage interface or BaseReactPackage instead.")
/* loaded from: classes.dex */
public class CompositeReactPackageTurboModuleManagerDelegate extends AbstractC9487gM0 {
    private native void addTurboModuleManagerDelegate(TurboModuleManagerDelegate turboModuleManagerDelegate);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public native HybridData initHybrid();
}
