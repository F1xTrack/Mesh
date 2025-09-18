package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes2.dex */
public final class Ti implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;

    public Ti(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
