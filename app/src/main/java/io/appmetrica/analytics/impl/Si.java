package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes2.dex */
public final class Si implements Na {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;

    public Si(PluginErrorDetails pluginErrorDetails, String str) {
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.getPluginExtension().reportError(this.a, this.b);
    }
}
