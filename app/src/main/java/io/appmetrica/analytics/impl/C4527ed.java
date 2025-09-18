package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4527ed {
    public final Re a;
    public final NativeCrashClientModule b;
    public final C4992y0 c;
    public C4968x0 d;

    public C4527ed(Re re) {
        this.a = re;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.c = new C4992y0();
    }
}
