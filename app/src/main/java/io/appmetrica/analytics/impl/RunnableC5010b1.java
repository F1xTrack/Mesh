package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.b1 */
/* loaded from: classes2.dex */
public final class RunnableC5010b1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f31276a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f31277b;

    public RunnableC5010b1(C5185i1 c5185i1, Activity activity) {
        this.f31277b = c5185i1;
        this.f31276a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1 c5185i1 = this.f31277b;
        C4979Zj c4979Zj = c5185i1.f31887h;
        Activity activity = this.f31276a;
        InterfaceC4491Fa interfaceC4491Fa = c5185i1.m20557d().f31104a;
        if (activity != null) {
            c4979Zj.f31214f.m20661a(activity);
        }
        if (c4979Zj.f31213e.m20986a(activity, EnumC5383q.PAUSED)) {
            interfaceC4491Fa.mo19408b(activity);
        }
    }
}
