package defpackage;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC7016sM1 {
    @Override // defpackage.AbstractC7016sM1
    public final boolean a(AbstractC2243b1 abstractC2243b1, X0 x0, X0 x02) {
        synchronized (abstractC2243b1) {
            try {
                if (abstractC2243b1.b != x0) {
                    return false;
                }
                abstractC2243b1.b = x02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC7016sM1
    public final boolean b(AbstractC2243b1 abstractC2243b1, Object obj, Object obj2) {
        synchronized (abstractC2243b1) {
            try {
                if (abstractC2243b1.a != obj) {
                    return false;
                }
                abstractC2243b1.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC7016sM1
    public final boolean c(AbstractC2243b1 abstractC2243b1, C2052a1 c2052a1, C2052a1 c2052a12) {
        synchronized (abstractC2243b1) {
            try {
                if (abstractC2243b1.c != c2052a1) {
                    return false;
                }
                abstractC2243b1.c = c2052a12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC7016sM1
    public final void e(C2052a1 c2052a1, C2052a1 c2052a12) {
        c2052a1.b = c2052a12;
    }

    @Override // defpackage.AbstractC7016sM1
    public final void f(C2052a1 c2052a1, Thread thread) {
        c2052a1.a = thread;
    }
}
