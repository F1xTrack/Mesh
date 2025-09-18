package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.z0 */
/* loaded from: classes2.dex */
public final class C5609z0 implements AppMetricaPlugins {

    /* renamed from: a */
    public final C4382B0 f32899a;

    public C5609z0(C4382B0 c4382b0) {
        this.f32899a = c4382b0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f32899a.m19218a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f32899a.m19217a(pluginErrorDetails);
    }

    public C5609z0() {
        this(new C4382B0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f32899a.m19219a(str, str2, pluginErrorDetails);
    }
}
