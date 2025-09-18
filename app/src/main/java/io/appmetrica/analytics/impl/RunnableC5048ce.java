package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ce */
/* loaded from: classes2.dex */
public final class RunnableC5048ce implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PluginErrorDetails f31412a;

    /* renamed from: b */
    public final /* synthetic */ C5123fe f31413b;

    public RunnableC5048ce(C5123fe c5123fe, PluginErrorDetails pluginErrorDetails) {
        this.f31413b = c5123fe;
        this.f31412a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4707Oa) this.f31413b.f31687d.get()).getPluginExtension().reportUnhandledException(this.f31412a);
    }
}
