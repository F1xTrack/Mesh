package defpackage;

/* renamed from: c0 */
/* loaded from: classes.dex */
public final class C2429c0 extends AbstractC3377dM1 {
    @Override // defpackage.AbstractC3377dM1
    public final boolean a(AbstractC5799m0 abstractC5799m0, X x, X x2) {
        synchronized (abstractC5799m0) {
            try {
                if (abstractC5799m0.b != x) {
                    return false;
                }
                abstractC5799m0.b = x2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3377dM1
    public final boolean b(AbstractC5799m0 abstractC5799m0, Object obj, Object obj2) {
        synchronized (abstractC5799m0) {
            try {
                if (abstractC5799m0.a != obj) {
                    return false;
                }
                abstractC5799m0.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3377dM1
    public final boolean c(AbstractC5799m0 abstractC5799m0, C5417k0 c5417k0, C5417k0 c5417k02) {
        synchronized (abstractC5799m0) {
            try {
                if (abstractC5799m0.c != c5417k0) {
                    return false;
                }
                abstractC5799m0.c = c5417k02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3377dM1
    public final void j(C5417k0 c5417k0, C5417k0 c5417k02) {
        c5417k0.b = c5417k02;
    }

    @Override // defpackage.AbstractC3377dM1
    public final void k(C5417k0 c5417k0, Thread thread) {
        c5417k0.a = thread;
    }
}
