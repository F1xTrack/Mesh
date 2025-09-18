package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: bS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8854bS0 implements QD0 {

    /* renamed from: a */
    public final ExecutorService f17029a;

    /* renamed from: b */
    public final C1339VH f17030b;

    /* renamed from: c */
    public final QD0 f17031c;

    /* renamed from: d */
    public final boolean f17032d;

    /* renamed from: e */
    public final C10065kt0 f17033e;

    public C8854bS0(ExecutorService executorService, C1339VH c1339vh, QD0 qd0, boolean z, C10065kt0 c10065kt0) {
        executorService.getClass();
        this.f17029a = executorService;
        c1339vh.getClass();
        this.f17030b = c1339vh;
        this.f17031c = qd0;
        c10065kt0.getClass();
        this.f17033e = c10065kt0;
        this.f17032d = z;
    }

    @Override // p000.QD0
    /* renamed from: a */
    public final void mo312a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        this.f17031c.mo312a(new C8726aS0(this, abstractC1237Tf, rd0, this.f17032d, this.f17033e), rd0);
    }
}
