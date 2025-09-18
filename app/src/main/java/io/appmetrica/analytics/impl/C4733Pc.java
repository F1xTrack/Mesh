package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Pc */
/* loaded from: classes2.dex */
public final class C4733Pc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C4780Rc f30613a;

    /* renamed from: b */
    public final /* synthetic */ int f30614b;

    /* renamed from: c */
    public final /* synthetic */ String f30615c;

    public C4733Pc(C4780Rc c4780Rc, int i, String str) {
        this.f30613a = c4780Rc;
        this.f30614b = i;
        this.f30615c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4780Rc.m19761a(this.f30613a).mo19404a(new C4416C9(this.f30614b, this.f30615c));
    }
}
