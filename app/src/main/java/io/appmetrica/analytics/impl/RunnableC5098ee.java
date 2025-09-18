package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ee */
/* loaded from: classes2.dex */
public final class RunnableC5098ee implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31594a;

    /* renamed from: b */
    public final /* synthetic */ String f31595b;

    /* renamed from: c */
    public final /* synthetic */ PluginErrorDetails f31596c;

    /* renamed from: d */
    public final /* synthetic */ C5123fe f31597d;

    public RunnableC5098ee(C5123fe c5123fe, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f31597d = c5123fe;
        this.f31594a = str;
        this.f31595b = str2;
        this.f31596c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4707Oa) this.f31597d.f31687d.get()).getPluginExtension().reportError(this.f31594a, this.f31595b, this.f31596c);
    }
}
