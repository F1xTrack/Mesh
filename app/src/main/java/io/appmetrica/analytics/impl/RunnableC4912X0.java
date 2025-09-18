package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.X0 */
/* loaded from: classes2.dex */
public final class RunnableC4912X0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f30996a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30997b;

    public RunnableC4912X0(C5185i1 c5185i1, Activity activity) {
        this.f30997b = c5185i1;
        this.f30996a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1 c5185i1 = this.f30997b;
        C4979Zj c4979Zj = c5185i1.f31887h;
        Activity activity = this.f30996a;
        InterfaceC4491Fa interfaceC4491Fa = c5185i1.m20557d().f31104a;
        if (activity != null) {
            c4979Zj.f31214f.m20661a(activity);
        }
        if (c4979Zj.f31213e.m20986a(activity, EnumC5383q.RESUMED)) {
            interfaceC4491Fa.mo19402a(activity);
        }
    }
}
