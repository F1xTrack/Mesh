package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Bj */
/* loaded from: classes2.dex */
public class C0109Bj implements InterfaceC6326kr {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f981d = AtomicLongFieldUpdater.newUpdater(C0109Bj.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f982e = AtomicLongFieldUpdater.newUpdater(C0109Bj.class, "receivers$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f983f = AtomicLongFieldUpdater.newUpdater(C0109Bj.class, "bufferEnd$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f984g = AtomicLongFieldUpdater.newUpdater(C0109Bj.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f985h = AtomicReferenceFieldUpdater.newUpdater(C0109Bj.class, Object.class, "sendSegment$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f986i = AtomicReferenceFieldUpdater.newUpdater(C0109Bj.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f987j = AtomicReferenceFieldUpdater.newUpdater(C0109Bj.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f988k = AtomicReferenceFieldUpdater.newUpdater(C0109Bj.class, Object.class, "_closeCause$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f989l = AtomicReferenceFieldUpdater.newUpdater(C0109Bj.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b */
    public final int f990b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final InterfaceC6497nZ f991c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C0109Bj(int i, InterfaceC6497nZ interfaceC6497nZ) {
        this.f990b = i;
        this.f991c = interfaceC6497nZ;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C6578or c6578or = AbstractC0235Dj.f2187a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f983f.get(this);
        C6578or c6578or2 = new C6578or(0L, null, this, 3);
        this.sendSegment$volatile = c6578or2;
        this.receiveSegment$volatile = c6578or2;
        if (m835t()) {
            c6578or2 = AbstractC0235Dj.f2187a;
            O90.m5966d(c6578or2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c6578or2;
        this._closeCause$volatile = AbstractC0235Dj.f2205s;
    }

    /* renamed from: c */
    public static final C6578or m813c(C0109Bj c0109Bj, long j, C6578or c6578or) {
        Object objM5972j;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        C6578or c6578or2 = AbstractC0235Dj.f2187a;
        C0172Cj c0172Cj = C0172Cj.f1593a;
        loop0: while (true) {
            objM5972j = O90.m5972j(c6578or, j, c0172Cj);
            if (!HR1.m3426c(objM5972j)) {
                KX0 kx0M3425b = HR1.m3425b(objM5972j);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f985h;
                    KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(c0109Bj);
                    if (kx0.f6149c >= kx0M3425b.f6149c) {
                        break loop0;
                    }
                    if (!kx0M3425b.m4667j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0109Bj, kx0, kx0M3425b)) {
                        if (atomicReferenceFieldUpdater.get(c0109Bj) != kx0) {
                            if (kx0M3425b.m4663f()) {
                                kx0M3425b.m23887e();
                            }
                        }
                    }
                    if (kx0.m4663f()) {
                        kx0.m23887e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM3426c = HR1.m3426c(objM5972j);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f982e;
        if (zM3426c) {
            c0109Bj.m825i();
            if (c6578or.f6149c * AbstractC0235Dj.f2188b >= atomicLongFieldUpdater2.get(c0109Bj)) {
                return null;
            }
            c6578or.m23885b();
            return null;
        }
        C6578or c6578or3 = (C6578or) HR1.m3425b(objM5972j);
        long j4 = c6578or3.f6149c;
        if (j4 <= j) {
            return c6578or3;
        }
        long j5 = AbstractC0235Dj.f2188b * j4;
        do {
            atomicLongFieldUpdater = f981d;
            j2 = atomicLongFieldUpdater.get(c0109Bj);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c0109Bj, j2, j3 + (((int) (j2 >> 60)) << 60)));
        if (j4 * AbstractC0235Dj.f2188b >= atomicLongFieldUpdater2.get(c0109Bj)) {
            return null;
        }
        c6578or3.m23885b();
        return null;
    }

    /* renamed from: d */
    public static final void m814d(C0109Bj c0109Bj, AbstractC11986zv1 abstractC11986zv1, C0619Jp c0619Jp) {
        InterfaceC6497nZ interfaceC6497nZ = c0109Bj.f991c;
        if (interfaceC6497nZ != null) {
            QI1.m6628a(interfaceC6497nZ, abstractC11986zv1, c0619Jp.f5712e);
        }
        c0619Jp.resumeWith(RQ1.m7015b(c0109Bj.m831o()));
    }

    /* renamed from: e */
    public static final int m815e(C0109Bj c0109Bj, C6578or c6578or, int i, Object obj, long j, Object obj2, boolean z) {
        c6578or.m23563n(i, obj);
        if (z) {
            return c0109Bj.m818A(c6578or, i, obj, j, obj2, z);
        }
        Object objM23561l = c6578or.m23561l(i);
        if (objM23561l == null) {
            if (c0109Bj.m823g(j)) {
                if (c6578or.m23560k(null, i, AbstractC0235Dj.f2190d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c6578or.m23560k(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objM23561l instanceof InterfaceC10564om1) {
            c6578or.m23563n(i, null);
            if (c0109Bj.m839x(objM23561l, obj)) {
                c6578or.m23564o(i, AbstractC0235Dj.f2195i);
                return 0;
            }
            C7190yG c7190yG = AbstractC0235Dj.f2197k;
            if (c6578or.f39306f.getAndSet((i * 2) + 1, c7190yG) != c7190yG) {
                c6578or.m23562m(i, true);
            }
            return 5;
        }
        return c0109Bj.m818A(c6578or, i, obj, j, obj2, z);
    }

    /* renamed from: q */
    public static void m816q(C0109Bj c0109Bj) {
        c0109Bj.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f984g;
        if ((atomicLongFieldUpdater.addAndGet(c0109Bj, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0109Bj) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* renamed from: y */
    public static boolean m817y(Object obj) {
        if (obj instanceof InterfaceC0493Hp) {
            O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC0235Dj.m1857a((InterfaceC0493Hp) obj, C8313Tf1.f11463a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: A */
    public final int m818A(C6578or c6578or, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM23561l = c6578or.m23561l(i);
            if (objM23561l == null) {
                if (!m823g(j) || z) {
                    if (z) {
                        if (c6578or.m23560k(null, i, AbstractC0235Dj.f2196j)) {
                            c6578or.m4666i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c6578or.m23560k(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (c6578or.m23560k(null, i, AbstractC0235Dj.f2190d)) {
                    return 1;
                }
            } else {
                if (objM23561l != AbstractC0235Dj.f2191e) {
                    C7190yG c7190yG = AbstractC0235Dj.f2197k;
                    if (objM23561l == c7190yG) {
                        c6578or.m23563n(i, null);
                        return 5;
                    }
                    if (objM23561l == AbstractC0235Dj.f2194h) {
                        c6578or.m23563n(i, null);
                        return 5;
                    }
                    if (objM23561l == AbstractC0235Dj.f2198l) {
                        c6578or.m23563n(i, null);
                        m825i();
                        return 4;
                    }
                    c6578or.m23563n(i, null);
                    if (objM23561l instanceof C10692pm1) {
                        objM23561l = ((C10692pm1) objM23561l).f40392a;
                    }
                    if (m839x(objM23561l, obj)) {
                        c6578or.m23564o(i, AbstractC0235Dj.f2195i);
                        return 0;
                    }
                    if (c6578or.f39306f.getAndSet((i * 2) + 1, c7190yG) == c7190yG) {
                        return 5;
                    }
                    c6578or.m23562m(i, true);
                    return 5;
                }
                if (c6578or.m23560k(objM23561l, i, AbstractC0235Dj.f2190d)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: B */
    public final void m819B(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (m835t()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f983f;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = AbstractC0235Dj.f2189c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f984g;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x00f0, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00f2, code lost:
    
        m814d(r26, r27, r5);
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
    
        r21.m23885b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0147, code lost:
    
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01bc, code lost:
    
        r1.m4421A();
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
    @Override // p000.InterfaceC8738aY0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo820a(p000.AbstractC11986zv1 r27, p000.AbstractC1571Yy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.mo820a(zv1, Yy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return r1;
     */
    @Override // p000.InterfaceC8738aY0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo821b(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.mo821b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: f */
    public final C0046Aj m822f() {
        return new C0046Aj(3, this, C0109Bj.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* renamed from: g */
    public final boolean m823g(long j) {
        return j < f983f.get(this) || j < f982e.get(this) + ((long) this.f990b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x008f, code lost:
    
        r1 = (p000.C6578or) ((p000.AbstractC6648pw) p000.AbstractC6648pw.f40441b.get(r1));
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C6578or m824h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.m824h(long):or");
    }

    /* renamed from: i */
    public final void m825i() {
        m833r(f981d.get(this), false);
    }

    /* renamed from: j */
    public final void m826j(long j) {
        C6838sg c6838sgM6629b;
        C6578or c6578or = (C6578or) f986i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f982e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f990b + j2, f983f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = AbstractC0235Dj.f2188b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c6578or.f6149c != j4) {
                    C6578or c6578orM828l = m828l(j4, c6578or);
                    if (c6578orM828l == null) {
                        continue;
                    } else {
                        c6578or = c6578orM828l;
                    }
                }
                Object objM840z = m840z(c6578or, i, j2, null);
                if (objM840z != AbstractC0235Dj.f2201o) {
                    c6578or.m23885b();
                    InterfaceC6497nZ interfaceC6497nZ = this.f991c;
                    if (interfaceC6497nZ != null && (c6838sgM6629b = QI1.m6629b(interfaceC6497nZ, objM840z, null)) != null) {
                        throw c6838sgM6629b;
                    }
                } else if (j2 < m832p()) {
                    c6578or.m23885b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0195, code lost:
    
        m816q(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0198, code lost:
    
        return;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m827k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.m827k():void");
    }

    /* renamed from: l */
    public final C6578or m828l(long j, C6578or c6578or) {
        Object objM5972j;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        C6578or c6578or2 = AbstractC0235Dj.f2187a;
        C0172Cj c0172Cj = C0172Cj.f1593a;
        loop0: while (true) {
            objM5972j = O90.m5972j(c6578or, j, c0172Cj);
            if (!HR1.m3426c(objM5972j)) {
                KX0 kx0M3425b = HR1.m3425b(objM5972j);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f986i;
                    KX0 kx0 = (KX0) atomicReferenceFieldUpdater.get(this);
                    if (kx0.f6149c >= kx0M3425b.f6149c) {
                        break loop0;
                    }
                    if (!kx0M3425b.m4667j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, kx0, kx0M3425b)) {
                        if (atomicReferenceFieldUpdater.get(this) != kx0) {
                            if (kx0M3425b.m4663f()) {
                                kx0M3425b.m23887e();
                            }
                        }
                    }
                    if (kx0.m4663f()) {
                        kx0.m23887e();
                    }
                }
            } else {
                break;
            }
        }
        if (HR1.m3426c(objM5972j)) {
            m825i();
            if (c6578or.f6149c * AbstractC0235Dj.f2188b >= m832p()) {
                return null;
            }
            c6578or.m23885b();
            return null;
        }
        C6578or c6578or3 = (C6578or) HR1.m3425b(objM5972j);
        boolean zM835t = m835t();
        long j3 = c6578or3.f6149c;
        if (!zM835t && j <= f983f.get(this) / AbstractC0235Dj.f2188b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f987j;
                KX0 kx02 = (KX0) atomicReferenceFieldUpdater2.get(this);
                if (kx02.f6149c >= j3 || !c6578or3.m4667j()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, kx02, c6578or3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != kx02) {
                        if (c6578or3.m4663f()) {
                            c6578or3.m23887e();
                        }
                    }
                }
                if (kx02.m4663f()) {
                    kx02.m23887e();
                }
            }
        }
        if (j3 <= j) {
            return c6578or3;
        }
        long j4 = AbstractC0235Dj.f2188b * j3;
        do {
            atomicLongFieldUpdater = f982e;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (j3 * AbstractC0235Dj.f2188b >= m832p()) {
            return null;
        }
        c6578or3.m23885b();
        return null;
    }

    /* renamed from: m */
    public final Throwable m829m() {
        return (Throwable) f988k.get(this);
    }

    /* renamed from: n */
    public final Throwable m830n() {
        Throwable thM829m = m829m();
        return thM829m == null ? new C0182Ct("Channel was closed") : thM829m;
    }

    /* renamed from: o */
    public final Throwable m831o() {
        Throwable thM829m = m829m();
        return thM829m == null ? new C0245Dt("Channel was closed") : thM829m;
    }

    /* renamed from: p */
    public final long m832p() {
        return f981d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x00c6, code lost:
    
        r0 = (p000.C6578or) ((p000.AbstractC6648pw) p000.AbstractC6648pw.f40441b.get(r0));
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m833r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.m833r(long, boolean):boolean");
    }

    /* renamed from: s */
    public boolean mo834s() {
        return false;
    }

    /* renamed from: t */
    public final boolean m835t() {
        long j = f983f.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x018e, code lost:
    
        r3 = (p000.C6578or) r3.m23886c();
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0011, code lost:
    
        continue;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m836u(long r5, p000.C6578or r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f6149c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            pw r0 = r7.m23886c()
            or r0 = (p000.C6578or) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo4662d()
            if (r5 == 0) goto L22
            pw r5 = r7.m23886c()
            or r5 = (p000.C6578or) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000.C0109Bj.f987j
            java.lang.Object r6 = r5.get(r4)
            KX0 r6 = (p000.KX0) r6
            long r0 = r6.f6149c
            long r2 = r7.f6149c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m4667j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m4663f()
            if (r5 == 0) goto L49
            r6.m23887e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m4663f()
            if (r5 == 0) goto L22
            r7.m23887e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0109Bj.m836u(long, or):void");
    }

    /* renamed from: v */
    public final Object m837v(AbstractC11986zv1 abstractC11986zv1, AbstractC1571Yy abstractC1571Yy) {
        C6838sg c6838sgM6629b;
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(abstractC1571Yy));
        c0619Jp.m4439s();
        InterfaceC6497nZ interfaceC6497nZ = this.f991c;
        if (interfaceC6497nZ == null || (c6838sgM6629b = QI1.m6629b(interfaceC6497nZ, abstractC11986zv1, null)) == null) {
            c0619Jp.resumeWith(RQ1.m7015b(m831o()));
        } else {
            I02.m3687a(c6838sgM6629b, m831o());
            c0619Jp.resumeWith(RQ1.m7015b(c6838sgM6629b));
        }
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }

    /* renamed from: w */
    public final void m838w(InterfaceC10564om1 interfaceC10564om1, boolean z) {
        if (interfaceC10564om1 instanceof InterfaceC0493Hp) {
            ((InterfaceC1382Vy) interfaceC10564om1).resumeWith(RQ1.m7015b(z ? m830n() : m831o()));
            return;
        }
        if (!(interfaceC10564om1 instanceof C7282zj)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC10564om1).toString());
        }
        C7282zj c7282zj = (C7282zj) interfaceC10564om1;
        C0619Jp c0619Jp = c7282zj.f46954b;
        O90.m5965c(c0619Jp);
        c7282zj.f46954b = null;
        c7282zj.f46953a = AbstractC0235Dj.f2198l;
        Throwable thM829m = c7282zj.f46955c.m829m();
        if (thM829m == null) {
            c0619Jp.resumeWith(Boolean.FALSE);
        } else {
            c0619Jp.resumeWith(RQ1.m7015b(thM829m));
        }
    }

    /* renamed from: x */
    public final boolean m839x(Object obj, Object obj2) {
        if (!(obj instanceof C7282zj)) {
            if (obj instanceof InterfaceC0493Hp) {
                O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return AbstractC0235Dj.m1857a((InterfaceC0493Hp) obj, obj2, this.f991c != null ? m822f() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C7282zj c7282zj = (C7282zj) obj;
        C0619Jp c0619Jp = c7282zj.f46954b;
        O90.m5965c(c0619Jp);
        c7282zj.f46954b = null;
        c7282zj.f46953a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC6497nZ interfaceC6497nZ = c7282zj.f46955c.f991c;
        return AbstractC0235Dj.m1857a(c0619Jp, bool, interfaceC6497nZ != null ? new C7219yj(interfaceC6497nZ, 0, obj2) : null);
    }

    /* renamed from: z */
    public final Object m840z(C6578or c6578or, int i, long j, Object obj) {
        Object objM23561l = c6578or.m23561l(i);
        AtomicReferenceArray atomicReferenceArray = c6578or.f39306f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f981d;
        if (objM23561l == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0235Dj.f2200n;
                }
                if (c6578or.m23560k(objM23561l, i, obj)) {
                    m827k();
                    return AbstractC0235Dj.f2199m;
                }
            }
        } else if (objM23561l == AbstractC0235Dj.f2190d && c6578or.m23560k(objM23561l, i, AbstractC0235Dj.f2195i)) {
            m827k();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c6578or.m23563n(i, null);
            return obj2;
        }
        while (true) {
            Object objM23561l2 = c6578or.m23561l(i);
            if (objM23561l2 == null || objM23561l2 == AbstractC0235Dj.f2191e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c6578or.m23560k(objM23561l2, i, AbstractC0235Dj.f2194h)) {
                        m827k();
                        return AbstractC0235Dj.f2201o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0235Dj.f2200n;
                    }
                    if (c6578or.m23560k(objM23561l2, i, obj)) {
                        m827k();
                        return AbstractC0235Dj.f2199m;
                    }
                }
            } else if (objM23561l2 != AbstractC0235Dj.f2190d) {
                C7190yG c7190yG = AbstractC0235Dj.f2196j;
                if (objM23561l2 == c7190yG) {
                    return AbstractC0235Dj.f2201o;
                }
                if (objM23561l2 == AbstractC0235Dj.f2194h) {
                    return AbstractC0235Dj.f2201o;
                }
                if (objM23561l2 == AbstractC0235Dj.f2198l) {
                    m827k();
                    return AbstractC0235Dj.f2201o;
                }
                if (objM23561l2 != AbstractC0235Dj.f2193g && c6578or.m23560k(objM23561l2, i, AbstractC0235Dj.f2192f)) {
                    boolean z = objM23561l2 instanceof C10692pm1;
                    if (z) {
                        objM23561l2 = ((C10692pm1) objM23561l2).f40392a;
                    }
                    if (m817y(objM23561l2)) {
                        c6578or.m23564o(i, AbstractC0235Dj.f2195i);
                        m827k();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c6578or.m23563n(i, null);
                        return obj3;
                    }
                    c6578or.m23564o(i, c7190yG);
                    c6578or.m4666i();
                    if (z) {
                        m827k();
                    }
                    return AbstractC0235Dj.f2201o;
                }
            } else if (c6578or.m23560k(objM23561l2, i, AbstractC0235Dj.f2195i)) {
                m827k();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c6578or.m23563n(i, null);
                return obj4;
            }
        }
    }
}
