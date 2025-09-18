package p000;

/* renamed from: Z0 */
/* loaded from: classes.dex */
public final class C1574Z0 extends AbstractC11024sM1 {
    @Override // p000.AbstractC11024sM1
    /* renamed from: a */
    public final boolean mo9197a(AbstractC1759b1 abstractC1759b1, C1448X0 c1448x0, C1448X0 c1448x02) {
        synchronized (abstractC1759b1) {
            try {
                if (abstractC1759b1.f16710b != c1448x0) {
                    return false;
                }
                abstractC1759b1.f16710b = c1448x02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: b */
    public final boolean mo9198b(AbstractC1759b1 abstractC1759b1, Object obj, Object obj2) {
        synchronized (abstractC1759b1) {
            try {
                if (abstractC1759b1.f16709a != obj) {
                    return false;
                }
                abstractC1759b1.f16709a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: c */
    public final boolean mo9199c(AbstractC1759b1 abstractC1759b1, C1638a1 c1638a1, C1638a1 c1638a12) {
        synchronized (abstractC1759b1) {
            try {
                if (abstractC1759b1.f16711c != c1638a1) {
                    return false;
                }
                abstractC1759b1.f16711c = c1638a12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: e */
    public final void mo9200e(C1638a1 c1638a1, C1638a1 c1638a12) {
        c1638a1.f15283b = c1638a12;
    }

    @Override // p000.AbstractC11024sM1
    /* renamed from: f */
    public final void mo9201f(C1638a1 c1638a1, Thread thread) {
        c1638a1.f15282a = thread;
    }
}
