package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: zj */
/* loaded from: classes2.dex */
public final class C7282zj implements InterfaceC10564om1 {

    /* renamed from: a */
    public Object f46953a = AbstractC0235Dj.f2202p;

    /* renamed from: b */
    public C0619Jp f46954b;

    /* renamed from: c */
    public final /* synthetic */ C0109Bj f46955c;

    public C7282zj(C0109Bj c0109Bj) {
        this.f46955c = c0109Bj;
    }

    /* renamed from: a */
    public final Object m26519a(AbstractC9714i71 abstractC9714i71) {
        C6578or c6578or;
        Boolean bool;
        C6578or c6578or2;
        boolean z = false;
        Object obj = this.f46953a;
        if (obj == AbstractC0235Dj.f2202p || obj == AbstractC0235Dj.f2198l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0109Bj.f986i;
            C0109Bj c0109Bj = this.f46955c;
            C6578or c6578or3 = (C6578or) atomicReferenceFieldUpdater.get(c0109Bj);
            while (true) {
                c0109Bj.getClass();
                if (c0109Bj.m833r(C0109Bj.f981d.get(c0109Bj), true)) {
                    this.f46953a = AbstractC0235Dj.f2198l;
                    Throwable thM829m = c0109Bj.m829m();
                    if (thM829m != null) {
                        int i = X31.f13550a;
                        throw thM829m;
                    }
                } else {
                    long andIncrement = C0109Bj.f982e.getAndIncrement(c0109Bj);
                    long j = AbstractC0235Dj.f2188b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c6578or3.f6149c != j2) {
                        C6578or c6578orM828l = c0109Bj.m828l(j2, c6578or3);
                        if (c6578orM828l == null) {
                            continue;
                        } else {
                            c6578or = c6578orM828l;
                        }
                    } else {
                        c6578or = c6578or3;
                    }
                    Object objM840z = c0109Bj.m840z(c6578or, i2, andIncrement, null);
                    C7190yG c7190yG = AbstractC0235Dj.f2199m;
                    if (objM840z == c7190yG) {
                        throw new IllegalStateException("unreachable");
                    }
                    C7190yG c7190yG2 = AbstractC0235Dj.f2201o;
                    if (objM840z == c7190yG2) {
                        if (andIncrement < c0109Bj.m832p()) {
                            c6578or.m23885b();
                        }
                        c6578or3 = c6578or;
                    } else {
                        if (objM840z == AbstractC0235Dj.f2200n) {
                            C0109Bj c0109Bj2 = this.f46955c;
                            C0619Jp c0619JpM25451b = AbstractC11433vZ0.m25451b(AbstractC10599p22.m23595b(abstractC9714i71));
                            try {
                                this.f46954b = c0619JpM25451b;
                                C6578or c6578or4 = c6578or;
                                Object objM840z2 = c0109Bj2.m840z(c6578or, i2, andIncrement, this);
                                if (objM840z2 == c7190yG) {
                                    mo4425b(c6578or4, i2);
                                } else {
                                    C7219yj c7219yj = null;
                                    InterfaceC6497nZ interfaceC6497nZ = c0109Bj2.f991c;
                                    if (objM840z2 == c7190yG2) {
                                        if (andIncrement < c0109Bj2.m832p()) {
                                            c6578or4.m23885b();
                                        }
                                        C6578or c6578or5 = (C6578or) C0109Bj.f986i.get(c0109Bj2);
                                        while (true) {
                                            if (c0109Bj2.m833r(C0109Bj.f981d.get(c0109Bj2), true)) {
                                                C0619Jp c0619Jp = this.f46954b;
                                                O90.m5965c(c0619Jp);
                                                this.f46954b = null;
                                                this.f46953a = AbstractC0235Dj.f2198l;
                                                Throwable thM829m2 = c0109Bj.m829m();
                                                if (thM829m2 == null) {
                                                    c0619Jp.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0619Jp.resumeWith(RQ1.m7015b(thM829m2));
                                                }
                                            } else {
                                                long andIncrement2 = C0109Bj.f982e.getAndIncrement(c0109Bj2);
                                                long j3 = AbstractC0235Dj.f2188b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c6578or5.f6149c != j4) {
                                                    C6578or c6578orM828l2 = c0109Bj2.m828l(j4, c6578or5);
                                                    if (c6578orM828l2 != null) {
                                                        c6578or2 = c6578orM828l2;
                                                    }
                                                } else {
                                                    c6578or2 = c6578or5;
                                                }
                                                Object objM840z3 = c0109Bj2.m840z(c6578or2, i3, andIncrement2, this);
                                                if (objM840z3 == AbstractC0235Dj.f2199m) {
                                                    mo4425b(c6578or2, i3);
                                                    break;
                                                }
                                                if (objM840z3 == AbstractC0235Dj.f2201o) {
                                                    if (andIncrement2 < c0109Bj2.m832p()) {
                                                        c6578or2.m23885b();
                                                    }
                                                    c6578or5 = c6578or2;
                                                } else {
                                                    if (objM840z3 == AbstractC0235Dj.f2200n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c6578or2.m23885b();
                                                    this.f46953a = objM840z3;
                                                    this.f46954b = null;
                                                    bool = Boolean.TRUE;
                                                    if (interfaceC6497nZ != null) {
                                                        c7219yj = new C7219yj(interfaceC6497nZ, 0, objM840z3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c6578or4.m23885b();
                                        this.f46953a = objM840z2;
                                        this.f46954b = null;
                                        bool = Boolean.TRUE;
                                        if (interfaceC6497nZ != null) {
                                            c7219yj = new C7219yj(interfaceC6497nZ, 0, objM840z2);
                                        }
                                    }
                                    c0619JpM25451b.mo3597e(bool, c7219yj);
                                }
                                Object objM4438r = c0619JpM25451b.m4438r();
                                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                                return objM4438r;
                            } catch (Throwable th) {
                                c0619JpM25451b.m4421A();
                                throw th;
                            }
                        }
                        c6578or.m23885b();
                        this.f46953a = objM840z;
                    }
                }
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC10564om1
    /* renamed from: b */
    public final void mo4425b(KX0 kx0, int i) {
        C0619Jp c0619Jp = this.f46954b;
        if (c0619Jp != null) {
            c0619Jp.mo4425b(kx0, i);
        }
    }

    /* renamed from: c */
    public final Object m26520c() throws Throwable {
        Object obj = this.f46953a;
        C7190yG c7190yG = AbstractC0235Dj.f2202p;
        if (obj == c7190yG) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f46953a = c7190yG;
        if (obj != AbstractC0235Dj.f2198l) {
            return obj;
        }
        Throwable thM830n = this.f46955c.m830n();
        int i = X31.f13550a;
        throw thM830n;
    }
}
