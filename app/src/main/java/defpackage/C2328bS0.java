package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: bS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2328bS0 implements QD0 {
    public final ExecutorService a;
    public final VH b;
    public final QD0 c;
    public final boolean d;
    public final C5587kt0 e;

    public C2328bS0(ExecutorService executorService, VH vh, QD0 qd0, boolean z, C5587kt0 c5587kt0) {
        executorService.getClass();
        this.a = executorService;
        vh.getClass();
        this.b = vh;
        this.c = qd0;
        c5587kt0.getClass();
        this.e = c5587kt0;
        this.d = z;
    }

    @Override // defpackage.QD0
    public final void a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        this.c.a(new C2137aS0(this, abstractC1516Tf, rd0, this.d, this.e), rd0);
    }
}
