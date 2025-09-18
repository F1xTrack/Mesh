package p000;

/* renamed from: c0 */
/* loaded from: classes.dex */
public final class C1820c0 extends AbstractC9104dM1 {
    @Override // p000.AbstractC9104dM1
    /* renamed from: a */
    public final boolean mo9444a(AbstractC6399m0 abstractC6399m0, C1447X c1447x, C1447X c1447x2) {
        synchronized (abstractC6399m0) {
            try {
                if (abstractC6399m0.f37382b != c1447x) {
                    return false;
                }
                abstractC6399m0.f37382b = c1447x2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: b */
    public final boolean mo9445b(AbstractC6399m0 abstractC6399m0, Object obj, Object obj2) {
        synchronized (abstractC6399m0) {
            try {
                if (abstractC6399m0.f37381a != obj) {
                    return false;
                }
                abstractC6399m0.f37381a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: c */
    public final boolean mo9446c(AbstractC6399m0 abstractC6399m0, C6273k0 c6273k0, C6273k0 c6273k02) {
        synchronized (abstractC6399m0) {
            try {
                if (abstractC6399m0.f37383c != c6273k0) {
                    return false;
                }
                abstractC6399m0.f37383c = c6273k02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: j */
    public final void mo9447j(C6273k0 c6273k0, C6273k0 c6273k02) {
        c6273k0.f35477b = c6273k02;
    }

    @Override // p000.AbstractC9104dM1
    /* renamed from: k */
    public final void mo9448k(C6273k0 c6273k0, Thread thread) {
        c6273k0.f35476a = thread;
    }
}
