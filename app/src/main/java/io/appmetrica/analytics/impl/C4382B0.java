package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import p000.O90;
import p000.RunnableC6720r4;
import p000.RunnableC6757rf;
import p000.RunnableC8339Ts1;

/* renamed from: io.appmetrica.analytics.impl.B0 */
/* loaded from: classes2.dex */
public final class C4382B0 {

    /* renamed from: a */
    public final IHandlerExecutor f29883a = C5388q4.m20928h().m20935e().m20407a();

    /* renamed from: b */
    public final C5334o0 f29884b;

    /* renamed from: c */
    public final C5173he f29885c;

    /* renamed from: d */
    public final C5248ke f29886d;

    public C4382B0() {
        C5334o0 c5334o0 = new C5334o0();
        this.f29884b = c5334o0;
        this.f29885c = new C5173he(c5334o0);
        this.f29886d = new C5248ke();
    }

    /* renamed from: a */
    public final void m19217a(PluginErrorDetails pluginErrorDetails) {
        C5173he c5173he = this.f29885c;
        c5173he.f31858a.mo19211a(null);
        c5173he.f31859b.mo19211a(pluginErrorDetails);
        C5248ke c5248ke = this.f29886d;
        O90.m5965c(pluginErrorDetails);
        c5248ke.getClass();
        this.f29883a.execute(new RunnableC6720r4(this, 11, pluginErrorDetails));
    }

    /* renamed from: a */
    public final void m19218a(PluginErrorDetails pluginErrorDetails, String str) {
        C5173he c5173he = this.f29885c;
        c5173he.f31858a.mo19211a(null);
        c5173he.f31859b.mo19211a(pluginErrorDetails);
        if (c5173he.f31861d.mo19211a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f32232a) {
            C5248ke c5248ke = this.f29886d;
            O90.m5965c(pluginErrorDetails);
            c5248ke.getClass();
            this.f29883a.execute(new RunnableC8339Ts1(this, pluginErrorDetails, str, 5));
        }
    }

    /* renamed from: a */
    public final void m19219a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C5173he c5173he = this.f29885c;
        c5173he.f31858a.mo19211a(null);
        c5173he.f31860c.mo19211a(str);
        C5248ke c5248ke = this.f29886d;
        O90.m5965c(str);
        c5248ke.getClass();
        this.f29883a.execute(new RunnableC6757rf(this, str, str2, pluginErrorDetails, 0));
    }

    /* renamed from: a */
    public static final void m19215a(C4382B0 c4382b0, PluginErrorDetails pluginErrorDetails, String str) {
        c4382b0.f29884b.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        O90.m5965c(c5309n0);
        C4947Yb c4947YbMo21002j = c5309n0.m20789k().mo21002j();
        O90.m5965c(c4947YbMo21002j);
        c4947YbMo21002j.f31104a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    /* renamed from: a */
    public static final void m19216a(C4382B0 c4382b0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        c4382b0.f29884b.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        O90.m5965c(c5309n0);
        C4947Yb c4947YbMo21002j = c5309n0.m20789k().mo21002j();
        O90.m5965c(c4947YbMo21002j);
        c4947YbMo21002j.f31104a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    /* renamed from: a */
    public static final void m19214a(C4382B0 c4382b0, PluginErrorDetails pluginErrorDetails) {
        c4382b0.f29884b.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        O90.m5965c(c5309n0);
        C4947Yb c4947YbMo21002j = c5309n0.m20789k().mo21002j();
        O90.m5965c(c4947YbMo21002j);
        c4947YbMo21002j.f31104a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
