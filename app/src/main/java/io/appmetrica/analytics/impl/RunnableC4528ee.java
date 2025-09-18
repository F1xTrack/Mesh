package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ee */
/* loaded from: classes2.dex */
public final class RunnableC4528ee implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;
    public final /* synthetic */ C4552fe d;

    public RunnableC4528ee(C4552fe c4552fe, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.d = c4552fe;
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Oa) this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
