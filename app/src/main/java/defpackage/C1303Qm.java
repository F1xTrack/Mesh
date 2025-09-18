package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: Qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303Qm {
    public static final long j;
    public static final long k;
    public final int a;
    public final ExecutorC5715lY0 b;
    public final C20 c;
    public final C6329om d;
    public final C1036Nb e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final C1147Om i = new C1147Om(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1L);
        k = timeUnit.toNanos(5L);
    }

    public C1303Qm(int i, ExecutorC5715lY0 executorC5715lY0, C20 c20, C6329om c6329om, boolean z, C1036Nb c1036Nb) {
        this.a = i;
        this.b = executorC5715lY0;
        this.c = c20;
        this.d = c6329om;
        this.f = z;
        this.e = c1036Nb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceFutureC0750Jj0 a(int i) {
        F70 f70 = F70.c;
        if (this.h.isEmpty()) {
            return f70;
        }
        F70 f702 = f70;
        if (this.i.b()) {
            C1537Tm c1537Tm = new C1537Tm(null);
            C6329om c6329om = this.d;
            c6329om.a(c1537Tm);
            RunnableC6769r4 runnableC6769r4 = new RunnableC6769r4(c6329om, 21, c1537Tm);
            C0599Hl c0599Hl = c1537Tm.b;
            c0599Hl.b.d(runnableC6769r4, c6329om.b);
            f702 = c0599Hl;
        }
        QZ qzA = QZ.a(f702);
        C0991Mm c0991Mm = new C0991Mm(this, i, 0);
        qzA.getClass();
        ExecutorC5715lY0 executorC5715lY0 = this.b;
        return AbstractC1500Sz1.r(AbstractC1500Sz1.r(qzA, c0991Mm, executorC5715lY0), new B7(10, this), executorC5715lY0);
    }
}
