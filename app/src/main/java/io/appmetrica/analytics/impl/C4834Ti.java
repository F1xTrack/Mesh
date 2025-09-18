package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.Ti */
/* loaded from: classes2.dex */
public final class C4834Ti implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ String f30790a;

    /* renamed from: b */
    public final /* synthetic */ String f30791b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f30792c;

    public C4834Ti(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f30790a = str;
        this.f30791b = str2;
        this.f30792c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.getPluginExtension().reportError(this.f30790a, this.f30791b, this.f30792c);
    }
}
