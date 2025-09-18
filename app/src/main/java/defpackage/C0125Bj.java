package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Bj */
/* loaded from: classes2.dex */
public class C0125Bj implements InterfaceC5580kr {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(C0125Bj.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(C0125Bj.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(C0125Bj.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(C0125Bj.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0125Bj.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C0125Bj.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C0125Bj.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C0125Bj.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C0125Bj.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final InterfaceC6099nZ c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C0125Bj(int i2, InterfaceC6099nZ interfaceC6099nZ) {
        this.b = i2;
        this.c = interfaceC6099nZ;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C6344or c6344or = AbstractC0281Dj.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
        C6344or c6344or2 = new C6344or(0L, null, this, 3);
        this.sendSegment$volatile = c6344or2;
        this.receiveSegment$volatile = c6344or2;
        if (t()) {
            c6344or2 = AbstractC0281Dj.a;
            O90.d(c6344or2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c6344or2;
        this._closeCause$volatile = AbstractC0281Dj.s;
    }

    public static final C6344or c(C0125Bj c0125Bj, long j2, C6344or c6344or) {
        Object objJ;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        C6344or c6344or2 = AbstractC0281Dj.a;
        C0203Cj c0203Cj = C0203Cj.a;
        loop0: while (true) {
            objJ = O90.j(c6344or, j2, c0203Cj);
            if (!HR1.c(objJ)) {
                KX0 kx0B = HR1.b(objJ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(c0125Bj);
                    if (kx0.c >= kx0B.c) {
                        break loop0;
                    }
                    if (!kx0B.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0125Bj, kx0, kx0B)) {
                        if (atomicReferenceFieldUpdater.get(c0125Bj) != kx0) {
                            if (kx0B.f()) {
                                kx0B.e();
                            }
                        }
                    }
                    if (kx0.f()) {
                        kx0.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zC = HR1.c(objJ);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
        if (zC) {
            c0125Bj.i();
            if (c6344or.c * AbstractC0281Dj.b >= atomicLongFieldUpdater2.get(c0125Bj)) {
                return null;
            }
            c6344or.b();
            return null;
        }
        C6344or c6344or3 = (C6344or) HR1.b(objJ);
        long j5 = c6344or3.c;
        if (j5 <= j2) {
            return c6344or3;
        }
        long j6 = AbstractC0281Dj.b * j5;
        do {
            atomicLongFieldUpdater = d;
            j3 = atomicLongFieldUpdater.get(c0125Bj);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c0125Bj, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * AbstractC0281Dj.b >= atomicLongFieldUpdater2.get(c0125Bj)) {
            return null;
        }
        c6344or3.b();
        return null;
    }

    public static final void d(C0125Bj c0125Bj, AbstractC8454zv1 abstractC8454zv1, C0767Jp c0767Jp) {
        InterfaceC6099nZ interfaceC6099nZ = c0125Bj.c;
        if (interfaceC6099nZ != null) {
            QI1.a(interfaceC6099nZ, abstractC8454zv1, c0767Jp.e);
        }
        c0767Jp.resumeWith(RQ1.b(c0125Bj.o()));
    }

    public static final int e(C0125Bj c0125Bj, C6344or c6344or, int i2, Object obj, long j2, Object obj2, boolean z) {
        c6344or.n(i2, obj);
        if (z) {
            return c0125Bj.A(c6344or, i2, obj, j2, obj2, z);
        }
        Object objL = c6344or.l(i2);
        if (objL == null) {
            if (c0125Bj.g(j2)) {
                if (c6344or.k(null, i2, AbstractC0281Dj.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c6344or.k(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof InterfaceC6331om1) {
            c6344or.n(i2, null);
            if (c0125Bj.x(objL, obj)) {
                c6344or.o(i2, AbstractC0281Dj.i);
                return 0;
            }
            C8139yG c8139yG = AbstractC0281Dj.k;
            if (c6344or.f.getAndSet((i2 * 2) + 1, c8139yG) != c8139yG) {
                c6344or.m(i2, true);
            }
            return 5;
        }
        return c0125Bj.A(c6344or, i2, obj, j2, obj2, z);
    }

    public static void q(C0125Bj c0125Bj) {
        c0125Bj.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(c0125Bj, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0125Bj) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof InterfaceC0611Hp) {
            O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC0281Dj.a((InterfaceC0611Hp) obj, C1518Tf1.a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(C6344or c6344or, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = c6344or.l(i2);
            if (objL == null) {
                if (!g(j2) || z) {
                    if (z) {
                        if (c6344or.k(null, i2, AbstractC0281Dj.j)) {
                            c6344or.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c6344or.k(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (c6344or.k(null, i2, AbstractC0281Dj.d)) {
                    return 1;
                }
            } else {
                if (objL != AbstractC0281Dj.e) {
                    C8139yG c8139yG = AbstractC0281Dj.k;
                    if (objL == c8139yG) {
                        c6344or.n(i2, null);
                        return 5;
                    }
                    if (objL == AbstractC0281Dj.h) {
                        c6344or.n(i2, null);
                        return 5;
                    }
                    if (objL == AbstractC0281Dj.l) {
                        c6344or.n(i2, null);
                        i();
                        return 4;
                    }
                    c6344or.n(i2, null);
                    if (objL instanceof C6522pm1) {
                        objL = ((C6522pm1) objL).a;
                    }
                    if (x(objL, obj)) {
                        c6344or.o(i2, AbstractC0281Dj.i);
                        return 0;
                    }
                    if (c6344or.f.getAndSet((i2 * 2) + 1, c8139yG) == c8139yG) {
                        return 5;
                    }
                    c6344or.m(i2, true);
                    return 5;
                }
                if (c6344or.k(objL, i2, AbstractC0281Dj.d)) {
                    return 1;
                }
            }
        }
    }

    public final void B(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (t()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = AbstractC0281Dj.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x00f0, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00f2, code lost:
    
        d(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0144, code lost:
    
        r21.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0147, code lost:
    
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01bc, code lost:
    
        r1.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC2155aY0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(defpackage.AbstractC8454zv1 r27, defpackage.AbstractC1963Yy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.a(zv1, Yy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return r1;
     */
    @Override // defpackage.InterfaceC2155aY0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.b(java.lang.Object):java.lang.Object");
    }

    public final C0047Aj f() {
        return new C0047Aj(3, this, C0125Bj.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    public final boolean g(long j2) {
        return j2 < f.get(this) || j2 < e.get(this) + ((long) this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x008f, code lost:
    
        r1 = (defpackage.C6344or) ((defpackage.AbstractC6550pw) defpackage.AbstractC6550pw.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6344or h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.h(long):or");
    }

    public final void i() {
        r(d.get(this), false);
    }

    public final void j(long j2) {
        C7074sg c7074sgB;
        C6344or c6344or = (C6344or) i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.b + j3, f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = AbstractC0281Dj.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c6344or.c != j5) {
                    C6344or c6344orL = l(j5, c6344or);
                    if (c6344orL == null) {
                        continue;
                    } else {
                        c6344or = c6344orL;
                    }
                }
                Object objZ = z(c6344or, i2, j3, null);
                if (objZ != AbstractC0281Dj.o) {
                    c6344or.b();
                    InterfaceC6099nZ interfaceC6099nZ = this.c;
                    if (interfaceC6099nZ != null && (c7074sgB = QI1.b(interfaceC6099nZ, objZ, null)) != null) {
                        throw c7074sgB;
                    }
                } else if (j3 < p()) {
                    c6344or.b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0195, code lost:
    
        q(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0198, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.k():void");
    }

    public final C6344or l(long j2, C6344or c6344or) {
        Object objJ;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        C6344or c6344or2 = AbstractC0281Dj.a;
        C0203Cj c0203Cj = C0203Cj.a;
        loop0: while (true) {
            objJ = O90.j(c6344or, j2, c0203Cj);
            if (!HR1.c(objJ)) {
                KX0 kx0B = HR1.b(objJ);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(this);
                    if (kx0.c >= kx0B.c) {
                        break loop0;
                    }
                    if (!kx0B.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, kx0, kx0B)) {
                        if (atomicReferenceFieldUpdater.get(this) != kx0) {
                            if (kx0B.f()) {
                                kx0B.e();
                            }
                        }
                    }
                    if (kx0.f()) {
                        kx0.e();
                    }
                }
            } else {
                break;
            }
        }
        if (HR1.c(objJ)) {
            i();
            if (c6344or.c * AbstractC0281Dj.b >= p()) {
                return null;
            }
            c6344or.b();
            return null;
        }
        C6344or c6344or3 = (C6344or) HR1.b(objJ);
        boolean zT = t();
        long j4 = c6344or3.c;
        if (!zT && j2 <= f.get(this) / AbstractC0281Dj.b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                KX0 kx02 = (KX0) atomicReferenceFieldUpdater2.get(this);
                if (kx02.c >= j4 || !c6344or3.j()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, kx02, c6344or3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != kx02) {
                        if (c6344or3.f()) {
                            c6344or3.e();
                        }
                    }
                }
                if (kx02.f()) {
                    kx02.e();
                }
            }
        }
        if (j4 <= j2) {
            return c6344or3;
        }
        long j5 = AbstractC0281Dj.b * j4;
        do {
            atomicLongFieldUpdater = e;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * AbstractC0281Dj.b >= p()) {
            return null;
        }
        c6344or3.b();
        return null;
    }

    public final Throwable m() {
        return (Throwable) k.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new C0233Ct("Channel was closed") : thM;
    }

    public final Throwable o() {
        Throwable thM = m();
        return thM == null ? new C0311Dt("Channel was closed") : thM;
    }

    public final long p() {
        return d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x00c6, code lost:
    
        r0 = (defpackage.C6344or) ((defpackage.AbstractC6550pw) defpackage.AbstractC6550pw.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.r(long, boolean):boolean");
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j2 = f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x018e, code lost:
    
        r3 = (defpackage.C6344or) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0195, code lost:
    
        if (r3 != null) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(long r5, defpackage.C6344or r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            pw r0 = r7.c()
            or r0 = (defpackage.C6344or) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            pw r5 = r7.c()
            or r5 = (defpackage.C6344or) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C0125Bj.j
            java.lang.Object r6 = r5.get(r4)
            KX0 r6 = (defpackage.KX0) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0125Bj.u(long, or):void");
    }

    public final Object v(AbstractC8454zv1 abstractC8454zv1, AbstractC1963Yy abstractC1963Yy) {
        C7074sg c7074sgB;
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(abstractC1963Yy));
        c0767Jp.s();
        InterfaceC6099nZ interfaceC6099nZ = this.c;
        if (interfaceC6099nZ == null || (c7074sgB = QI1.b(interfaceC6099nZ, abstractC8454zv1, null)) == null) {
            c0767Jp.resumeWith(RQ1.b(o()));
        } else {
            I02.a(c7074sgB, o());
            c0767Jp.resumeWith(RQ1.b(c7074sgB));
        }
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }

    public final void w(InterfaceC6331om1 interfaceC6331om1, boolean z) {
        if (interfaceC6331om1 instanceof InterfaceC0611Hp) {
            ((InterfaceC1729Vy) interfaceC6331om1).resumeWith(RQ1.b(z ? n() : o()));
            return;
        }
        if (!(interfaceC6331om1 instanceof C8416zj)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC6331om1).toString());
        }
        C8416zj c8416zj = (C8416zj) interfaceC6331om1;
        C0767Jp c0767Jp = c8416zj.b;
        O90.c(c0767Jp);
        c8416zj.b = null;
        c8416zj.a = AbstractC0281Dj.l;
        Throwable thM = c8416zj.c.m();
        if (thM == null) {
            c0767Jp.resumeWith(Boolean.FALSE);
        } else {
            c0767Jp.resumeWith(RQ1.b(thM));
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof C8416zj)) {
            if (obj instanceof InterfaceC0611Hp) {
                O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return AbstractC0281Dj.a((InterfaceC0611Hp) obj, obj2, this.c != null ? f() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C8416zj c8416zj = (C8416zj) obj;
        C0767Jp c0767Jp = c8416zj.b;
        O90.c(c0767Jp);
        c8416zj.b = null;
        c8416zj.a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC6099nZ interfaceC6099nZ = c8416zj.c.c;
        return AbstractC0281Dj.a(c0767Jp, bool, interfaceC6099nZ != null ? new C8226yj(interfaceC6099nZ, 0, obj2) : null);
    }

    public final Object z(C6344or c6344or, int i2, long j2, Object obj) {
        Object objL = c6344or.l(i2);
        AtomicReferenceArray atomicReferenceArray = c6344or.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0281Dj.n;
                }
                if (c6344or.k(objL, i2, obj)) {
                    k();
                    return AbstractC0281Dj.m;
                }
            }
        } else if (objL == AbstractC0281Dj.d && c6344or.k(objL, i2, AbstractC0281Dj.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            c6344or.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = c6344or.l(i2);
            if (objL2 == null || objL2 == AbstractC0281Dj.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c6344or.k(objL2, i2, AbstractC0281Dj.h)) {
                        k();
                        return AbstractC0281Dj.o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0281Dj.n;
                    }
                    if (c6344or.k(objL2, i2, obj)) {
                        k();
                        return AbstractC0281Dj.m;
                    }
                }
            } else if (objL2 != AbstractC0281Dj.d) {
                C8139yG c8139yG = AbstractC0281Dj.j;
                if (objL2 == c8139yG) {
                    return AbstractC0281Dj.o;
                }
                if (objL2 == AbstractC0281Dj.h) {
                    return AbstractC0281Dj.o;
                }
                if (objL2 == AbstractC0281Dj.l) {
                    k();
                    return AbstractC0281Dj.o;
                }
                if (objL2 != AbstractC0281Dj.g && c6344or.k(objL2, i2, AbstractC0281Dj.f)) {
                    boolean z = objL2 instanceof C6522pm1;
                    if (z) {
                        objL2 = ((C6522pm1) objL2).a;
                    }
                    if (y(objL2)) {
                        c6344or.o(i2, AbstractC0281Dj.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        c6344or.n(i2, null);
                        return obj3;
                    }
                    c6344or.o(i2, c8139yG);
                    c6344or.i();
                    if (z) {
                        k();
                    }
                    return AbstractC0281Dj.o;
                }
            } else if (c6344or.k(objL2, i2, AbstractC0281Dj.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                c6344or.n(i2, null);
                return obj4;
            }
        }
    }
}
