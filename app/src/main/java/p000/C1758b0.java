package p000;

/* renamed from: b0 */
/* loaded from: classes.dex */
public final class C1758b0 extends AbstractC8971cM1 {
    @Override // p000.AbstractC8971cM1
    /* renamed from: a */
    public final boolean mo9190a(AbstractC6336l0 abstractC6336l0, C1384W c1384w, C1384W c1384w2) {
        synchronized (abstractC6336l0) {
            try {
                if (abstractC6336l0.f36800b != c1384w) {
                    return false;
                }
                abstractC6336l0.f36800b = c1384w2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: b */
    public final boolean mo9191b(AbstractC6336l0 abstractC6336l0, Object obj, Object obj2) {
        synchronized (abstractC6336l0) {
            try {
                if (abstractC6336l0.f36799a != obj) {
                    return false;
                }
                abstractC6336l0.f36799a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: c */
    public final boolean mo9192c(AbstractC6336l0 abstractC6336l0, C6210j0 c6210j0, C6210j0 c6210j02) {
        synchronized (abstractC6336l0) {
            try {
                if (abstractC6336l0.f36801c != c6210j0) {
                    return false;
                }
                abstractC6336l0.f36801c = c6210j02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: e */
    public final C1384W mo9193e(AbstractC6336l0 abstractC6336l0) {
        C1384W c1384w;
        C1384W c1384w2 = C1384W.f12911d;
        synchronized (abstractC6336l0) {
            c1384w = abstractC6336l0.f36800b;
            if (c1384w != c1384w2) {
                abstractC6336l0.f36800b = c1384w2;
            }
        }
        return c1384w;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: f */
    public final C6210j0 mo9194f(AbstractC6336l0 abstractC6336l0) {
        C6210j0 c6210j0;
        C6210j0 c6210j02 = C6210j0.f34836c;
        synchronized (abstractC6336l0) {
            c6210j0 = abstractC6336l0.f36801c;
            if (c6210j0 != c6210j02) {
                abstractC6336l0.f36801c = c6210j02;
            }
        }
        return c6210j0;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: g */
    public final void mo9195g(C6210j0 c6210j0, C6210j0 c6210j02) {
        c6210j0.f34838b = c6210j02;
    }

    @Override // p000.AbstractC8971cM1
    /* renamed from: h */
    public final void mo9196h(C6210j0 c6210j0, Thread thread) {
        c6210j0.f34837a = thread;
    }
}
