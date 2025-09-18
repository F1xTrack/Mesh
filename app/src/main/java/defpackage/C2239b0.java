package defpackage;

/* renamed from: b0 */
/* loaded from: classes.dex */
public final class C2239b0 extends AbstractC2501cM1 {
    @Override // defpackage.AbstractC2501cM1
    public final boolean a(AbstractC5608l0 abstractC5608l0, W w, W w2) {
        synchronized (abstractC5608l0) {
            try {
                if (abstractC5608l0.b != w) {
                    return false;
                }
                abstractC5608l0.b = w2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean b(AbstractC5608l0 abstractC5608l0, Object obj, Object obj2) {
        synchronized (abstractC5608l0) {
            try {
                if (abstractC5608l0.a != obj) {
                    return false;
                }
                abstractC5608l0.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC2501cM1
    public final boolean c(AbstractC5608l0 abstractC5608l0, C5226j0 c5226j0, C5226j0 c5226j02) {
        synchronized (abstractC5608l0) {
            try {
                if (abstractC5608l0.c != c5226j0) {
                    return false;
                }
                abstractC5608l0.c = c5226j02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC2501cM1
    public final W e(AbstractC5608l0 abstractC5608l0) {
        W w;
        W w2 = W.d;
        synchronized (abstractC5608l0) {
            w = abstractC5608l0.b;
            if (w != w2) {
                abstractC5608l0.b = w2;
            }
        }
        return w;
    }

    @Override // defpackage.AbstractC2501cM1
    public final C5226j0 f(AbstractC5608l0 abstractC5608l0) {
        C5226j0 c5226j0;
        C5226j0 c5226j02 = C5226j0.c;
        synchronized (abstractC5608l0) {
            c5226j0 = abstractC5608l0.c;
            if (c5226j0 != c5226j02) {
                abstractC5608l0.c = c5226j02;
            }
        }
        return c5226j0;
    }

    @Override // defpackage.AbstractC2501cM1
    public final void g(C5226j0 c5226j0, C5226j0 c5226j02) {
        c5226j0.b = c5226j02;
    }

    @Override // defpackage.AbstractC2501cM1
    public final void h(C5226j0 c5226j0, Thread thread) {
        c5226j0.a = thread;
    }
}
