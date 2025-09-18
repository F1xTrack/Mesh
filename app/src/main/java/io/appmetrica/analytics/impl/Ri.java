package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes2.dex */
public final class Ri implements Na {
    public final /* synthetic */ PluginErrorDetails a;

    public Ri(PluginErrorDetails pluginErrorDetails) {
        this.a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.getPluginExtension().reportUnhandledException(this.a);
    }
}
