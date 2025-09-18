package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Si */
/* loaded from: classes2.dex */
public final class C4810Si implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f30745a;

    /* renamed from: b */
    public final /* synthetic */ String f30746b;

    public C4810Si(PluginErrorDetails pluginErrorDetails, String str) {
        this.f30745a = pluginErrorDetails;
        this.f30746b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.getPluginExtension().reportError(this.f30745a, this.f30746b);
    }
}
