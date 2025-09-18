package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.de */
/* loaded from: classes2.dex */
public final class RunnableC4503de implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C4552fe c;

    public RunnableC4503de(C4552fe c4552fe, PluginErrorDetails pluginErrorDetails, String str) {
        this.c = c4552fe;
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Oa) this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}
