package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ce */
/* loaded from: classes2.dex */
public final class RunnableC4478ce implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ C4552fe b;

    public RunnableC4478ce(C4552fe c4552fe, PluginErrorDetails pluginErrorDetails) {
        this.b = c4552fe;
        this.a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Oa) this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}
