package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* renamed from: io.appmetrica.analytics.impl.ed */
/* loaded from: classes2.dex */
public final class C5097ed {

    /* renamed from: a */
    public final C4782Re f31590a;

    /* renamed from: b */
    public final NativeCrashClientModule f31591b;

    /* renamed from: c */
    public final C5584y0 f31592c;

    /* renamed from: d */
    public C5559x0 f31593d;

    public C5097ed(C4782Re c4782Re) {
        this.f31590a = c4782Re;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f31591b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f31592c = new C5584y0();
    }
}
