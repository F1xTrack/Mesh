package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.PluginErrorDetails;

/* renamed from: com.yandex.metrica.impl.ob.a7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2622a7 {
    private final K0 a;

    public C2622a7(K0 k0) {
        this.a = k0;
    }

    public final C2996p7 a(PluginErrorDetails pluginErrorDetails) {
        return C3021q7.a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.a.a(), this.a.b());
    }
}
