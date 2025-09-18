package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4552fe implements IPluginReporter {
    public final C4624ie a = new C4624ie();
    public final C4647je b = new C4647je();
    public final IHandlerExecutor c = C4805q4.h().e().a();
    public final Provider d;

    public C4552fe(Provider<Oa> provider) {
        this.d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C4624ie c4624ie = this.a;
        c4624ie.a.a(pluginErrorDetails);
        if (c4624ie.c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            this.b.getClass();
            this.c.execute(new RunnableC4503de(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.a.a.a(pluginErrorDetails);
        this.b.getClass();
        this.c.execute(new RunnableC4478ce(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a.b.a(str);
        this.b.getClass();
        this.c.execute(new RunnableC4528ee(this, str, str2, pluginErrorDetails));
    }
}
