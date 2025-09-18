package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.a7 */
/* loaded from: classes2.dex */
public final class C3123a7 {

    /* renamed from: a */
    private final C2717K0 f23037a;

    public C3123a7(C2717K0 c2717k0) {
        this.f23037a = c2717k0;
    }

    /* renamed from: a */
    public final C3513p7 m15603a(PluginErrorDetails pluginErrorDetails) {
        return C3539q7.m16601a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.f23037a.m14455a(), this.f23037a.m14456b());
    }
}
