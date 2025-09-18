package p000;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: Qm */
/* loaded from: classes.dex */
public final class C1056Qm {

    /* renamed from: j */
    public static final long f9767j;

    /* renamed from: k */
    public static final long f9768k;

    /* renamed from: a */
    public final int f9769a;

    /* renamed from: b */
    public final ExecutorC10151lY0 f9770b;

    /* renamed from: c */
    public final C20 f9771c;

    /* renamed from: d */
    public final C6573om f9772d;

    /* renamed from: e */
    public final C0856Nb f9773e;

    /* renamed from: f */
    public final boolean f9774f;

    /* renamed from: g */
    public long f9775g = f9767j;

    /* renamed from: h */
    public final ArrayList f9776h = new ArrayList();

    /* renamed from: i */
    public final C0930Om f9777i = new C0930Om(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9767j = timeUnit.toNanos(1L);
        f9768k = timeUnit.toNanos(5L);
    }

    public C1056Qm(int i, ExecutorC10151lY0 executorC10151lY0, C20 c20, C6573om c6573om, boolean z, C0856Nb c0856Nb) {
        this.f9769a = i;
        this.f9770b = executorC10151lY0;
        this.f9771c = c20;
        this.f9772d = c6573om;
        this.f9774f = z;
        this.f9773e = c0856Nb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final InterfaceFutureC7800Jj0 m6753a(int i) {
        F70 f70 = F70.f3069c;
        if (this.f9776h.isEmpty()) {
            return f70;
        }
        F70 f702 = f70;
        if (this.f9777i.mo4405b()) {
            C1244Tm c1244Tm = new C1244Tm(null);
            C6573om c6573om = this.f9772d;
            c6573om.m23543a(c1244Tm);
            RunnableC6720r4 runnableC6720r4 = new RunnableC6720r4(c6573om, 21, c1244Tm);
            C0489Hl c0489Hl = c1244Tm.f11503b;
            c0489Hl.f4484b.mo2494d(runnableC6720r4, c6573om.f39230b);
            f702 = c0489Hl;
        }
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(f702);
        C0804Mm c0804Mm = new C0804Mm(this, i, 0);
        c1043qzM6727a.getClass();
        ExecutorC10151lY0 executorC10151lY0 = this.f9770b;
        return AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(c1043qzM6727a, c0804Mm, executorC10151lY0), new C0071B7(10, this), executorC10151lY0);
    }
}
