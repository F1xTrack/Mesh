package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.fe */
/* loaded from: classes2.dex */
public final class C5123fe implements IPluginReporter {

    /* renamed from: a */
    public final C5198ie f31684a = new C5198ie();

    /* renamed from: b */
    public final C5223je f31685b = new C5223je();

    /* renamed from: c */
    public final IHandlerExecutor f31686c = C5388q4.m20928h().m20935e().m20407a();

    /* renamed from: d */
    public final Provider f31687d;

    public C5123fe(Provider<InterfaceC4707Oa> provider) {
        this.f31687d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C5198ie c5198ie = this.f31684a;
        c5198ie.f31935a.mo19211a(pluginErrorDetails);
        if (c5198ie.f31937c.mo19211a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f32232a) {
            this.f31685b.getClass();
            this.f31686c.execute(new RunnableC5073de(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f31684a.f31935a.mo19211a(pluginErrorDetails);
        this.f31685b.getClass();
        this.f31686c.execute(new RunnableC5048ce(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f31684a.f31936b.mo19211a(str);
        this.f31685b.getClass();
        this.f31686c.execute(new RunnableC5098ee(this, str, str2, pluginErrorDetails));
    }
}
