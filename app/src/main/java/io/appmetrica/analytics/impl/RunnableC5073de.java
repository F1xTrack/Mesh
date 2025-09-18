package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.de */
/* loaded from: classes2.dex */
public final class RunnableC5073de implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f31486a;

    /* renamed from: b */
    public final /* synthetic */ String f31487b;

    /* renamed from: c */
    public final /* synthetic */ C5123fe f31488c;

    public RunnableC5073de(C5123fe c5123fe, PluginErrorDetails pluginErrorDetails, String str) {
        this.f31488c = c5123fe;
        this.f31486a = pluginErrorDetails;
        this.f31487b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4707Oa) this.f31488c.f31687d.get()).getPluginExtension().reportError(this.f31486a, this.f31487b);
    }
}
