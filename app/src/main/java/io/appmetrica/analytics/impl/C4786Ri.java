package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Ri */
/* loaded from: classes2.dex */
public final class C4786Ri implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f30702a;

    public C4786Ri(PluginErrorDetails pluginErrorDetails) {
        this.f30702a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.getPluginExtension().reportUnhandledException(this.f30702a);
    }
}
