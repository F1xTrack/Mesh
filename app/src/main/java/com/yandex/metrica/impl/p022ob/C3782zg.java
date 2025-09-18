package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.zg */
/* loaded from: classes2.dex */
public class C3782zg implements IPluginReporter {

    /* renamed from: a */
    private final InterfaceC3660uo<PluginErrorDetails> f25424a = new C3582ro(new C3556qo("Error details"));

    /* renamed from: b */
    private final InterfaceC3660uo<String> f25425b = new C3582ro(new C3530po("Error identifier"));

    /* renamed from: c */
    private final InterfaceC3660uo<Collection<StackTraceItem>> f25426c = new C3504oo("Stacktrace");

    /* renamed from: a */
    public boolean m17329a(PluginErrorDetails pluginErrorDetails, String str) {
        this.f25424a.mo14391a(pluginErrorDetails);
        return this.f25426c.mo14391a(pluginErrorDetails.getStacktrace()).m16805b();
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f25424a.mo14391a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f25424a.mo14391a(pluginErrorDetails);
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f25425b.mo14391a(str);
    }
}
