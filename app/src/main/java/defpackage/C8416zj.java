package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: zj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8416zj implements InterfaceC6331om1 {
    public Object a = AbstractC0281Dj.p;
    public C0767Jp b;
    public final /* synthetic */ C0125Bj c;

    public C8416zj(C0125Bj c0125Bj) {
        this.c = c0125Bj;
    }

    public final Object a(AbstractC4286i71 abstractC4286i71) {
        C6344or c6344or;
        Boolean bool;
        C6344or c6344or2;
        boolean z = false;
        Object obj = this.a;
        if (obj == AbstractC0281Dj.p || obj == AbstractC0281Dj.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0125Bj.i;
            C0125Bj c0125Bj = this.c;
            C6344or c6344or3 = (C6344or) atomicReferenceFieldUpdater.get(c0125Bj);
            while (true) {
                c0125Bj.getClass();
                if (c0125Bj.r(C0125Bj.d.get(c0125Bj), true)) {
                    this.a = AbstractC0281Dj.l;
                    Throwable thM = c0125Bj.m();
                    if (thM != null) {
                        int i = X31.a;
                        throw thM;
                    }
                } else {
                    long andIncrement = C0125Bj.e.getAndIncrement(c0125Bj);
                    long j = AbstractC0281Dj.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (c6344or3.c != j2) {
                        C6344or c6344orL = c0125Bj.l(j2, c6344or3);
                        if (c6344orL == null) {
                            continue;
                        } else {
                            c6344or = c6344orL;
                        }
                    } else {
                        c6344or = c6344or3;
                    }
                    Object objZ = c0125Bj.z(c6344or, i2, andIncrement, null);
                    C8139yG c8139yG = AbstractC0281Dj.m;
                    if (objZ == c8139yG) {
                        throw new IllegalStateException("unreachable");
                    }
                    C8139yG c8139yG2 = AbstractC0281Dj.o;
                    if (objZ == c8139yG2) {
                        if (andIncrement < c0125Bj.p()) {
                            c6344or.b();
                        }
                        c6344or3 = c6344or;
                    } else {
                        if (objZ == AbstractC0281Dj.n) {
                            C0125Bj c0125Bj2 = this.c;
                            C0767Jp c0767JpB = AbstractC7627vZ0.b(AbstractC6383p22.b(abstractC4286i71));
                            try {
                                this.b = c0767JpB;
                                C6344or c6344or4 = c6344or;
                                Object objZ2 = c0125Bj2.z(c6344or, i2, andIncrement, this);
                                if (objZ2 == c8139yG) {
                                    b(c6344or4, i2);
                                } else {
                                    C8226yj c8226yj = null;
                                    InterfaceC6099nZ interfaceC6099nZ = c0125Bj2.c;
                                    if (objZ2 == c8139yG2) {
                                        if (andIncrement < c0125Bj2.p()) {
                                            c6344or4.b();
                                        }
                                        C6344or c6344or5 = (C6344or) C0125Bj.i.get(c0125Bj2);
                                        while (true) {
                                            if (c0125Bj2.r(C0125Bj.d.get(c0125Bj2), true)) {
                                                C0767Jp c0767Jp = this.b;
                                                O90.c(c0767Jp);
                                                this.b = null;
                                                this.a = AbstractC0281Dj.l;
                                                Throwable thM2 = c0125Bj.m();
                                                if (thM2 == null) {
                                                    c0767Jp.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0767Jp.resumeWith(RQ1.b(thM2));
                                                }
                                            } else {
                                                long andIncrement2 = C0125Bj.e.getAndIncrement(c0125Bj2);
                                                long j3 = AbstractC0281Dj.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (c6344or5.c != j4) {
                                                    C6344or c6344orL2 = c0125Bj2.l(j4, c6344or5);
                                                    if (c6344orL2 != null) {
                                                        c6344or2 = c6344orL2;
                                                    }
                                                } else {
                                                    c6344or2 = c6344or5;
                                                }
                                                Object objZ3 = c0125Bj2.z(c6344or2, i3, andIncrement2, this);
                                                if (objZ3 == AbstractC0281Dj.m) {
                                                    b(c6344or2, i3);
                                                    break;
                                                }
                                                if (objZ3 == AbstractC0281Dj.o) {
                                                    if (andIncrement2 < c0125Bj2.p()) {
                                                        c6344or2.b();
                                                    }
                                                    c6344or5 = c6344or2;
                                                } else {
                                                    if (objZ3 == AbstractC0281Dj.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c6344or2.b();
                                                    this.a = objZ3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (interfaceC6099nZ != null) {
                                                        c8226yj = new C8226yj(interfaceC6099nZ, 0, objZ3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c6344or4.b();
                                        this.a = objZ2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (interfaceC6099nZ != null) {
                                            c8226yj = new C8226yj(interfaceC6099nZ, 0, objZ2);
                                        }
                                    }
                                    c0767JpB.e(bool, c8226yj);
                                }
                                Object objR = c0767JpB.r();
                                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                                return objR;
                            } catch (Throwable th) {
                                c0767JpB.A();
                                throw th;
                            }
                        }
                        c6344or.b();
                        this.a = objZ;
                    }
                }
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC6331om1
    public final void b(KX0 kx0, int i) {
        C0767Jp c0767Jp = this.b;
        if (c0767Jp != null) {
            c0767Jp.b(kx0, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        C8139yG c8139yG = AbstractC0281Dj.p;
        if (obj == c8139yG) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = c8139yG;
        if (obj != AbstractC0281Dj.l) {
            return obj;
        }
        Throwable thN = this.c.n();
        int i = X31.a;
        throw thN;
    }
}
