package io.appmetrica.analytics.impl;

import defpackage.O90;
import defpackage.RunnableC1557Ts1;
import defpackage.RunnableC6769r4;
import defpackage.RunnableC6880rf;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class B0 {
    public final IHandlerExecutor a = C4805q4.h().e().a();
    public final C4753o0 b;
    public final C4600he c;
    public final C4671ke d;

    public B0() {
        C4753o0 c4753o0 = new C4753o0();
        this.b = c4753o0;
        this.c = new C4600he(c4753o0);
        this.d = new C4671ke();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        C4600he c4600he = this.c;
        c4600he.a.a(null);
        c4600he.b.a(pluginErrorDetails);
        C4671ke c4671ke = this.d;
        O90.c(pluginErrorDetails);
        c4671ke.getClass();
        this.a.execute(new RunnableC6769r4(this, 11, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        C4600he c4600he = this.c;
        c4600he.a.a(null);
        c4600he.b.a(pluginErrorDetails);
        if (c4600he.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            C4671ke c4671ke = this.d;
            O90.c(pluginErrorDetails);
            c4671ke.getClass();
            this.a.execute(new RunnableC1557Ts1(this, pluginErrorDetails, str, 5));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C4600he c4600he = this.c;
        c4600he.a.a(null);
        c4600he.c.a(str);
        C4671ke c4671ke = this.d;
        O90.c(str);
        c4671ke.getClass();
        this.a.execute(new RunnableC6880rf(this, str, str2, pluginErrorDetails, 0));
    }

    public static final void a(B0 b0, PluginErrorDetails pluginErrorDetails, String str) {
        b0.b.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        O90.c(c4729n0);
        Yb ybJ = c4729n0.k().j();
        O90.c(ybJ);
        ybJ.a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(B0 b0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        b0.b.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        O90.c(c4729n0);
        Yb ybJ = c4729n0.k().j();
        O90.c(ybJ);
        ybJ.a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(B0 b0, PluginErrorDetails pluginErrorDetails) {
        b0.b.getClass();
        C4729n0 c4729n0 = C4729n0.e;
        O90.c(c4729n0);
        Yb ybJ = c4729n0.k().j();
        O90.c(ybJ);
        ybJ.a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
