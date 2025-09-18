package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Jp */
/* loaded from: classes2.dex */
public class C0767Jp extends AbstractC8341zK implements InterfaceC0611Hp, InterfaceC1108Nz, InterfaceC6331om1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C0767Jp.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C0767Jp.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0767Jp.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final InterfaceC1729Vy d;
    public final InterfaceC0173Bz e;

    public C0767Jp(int i, InterfaceC1729Vy interfaceC1729Vy) {
        super(i);
        this.d = interfaceC1729Vy;
        this.e = interfaceC1729Vy.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C7334u2.a;
    }

    public static Object D(InterfaceC1019Mv0 interfaceC1019Mv0, Object obj, int i, InterfaceC6481pZ interfaceC6481pZ) {
        if ((obj instanceof C6165nv) || !WZ1.a(i)) {
            return obj;
        }
        if (interfaceC6481pZ != null || (interfaceC1019Mv0 instanceof InterfaceC0143Bp)) {
            return new C5783lv(obj, interfaceC1019Mv0 instanceof InterfaceC0143Bp ? (InterfaceC0143Bp) interfaceC1019Mv0 : null, interfaceC6481pZ, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(InterfaceC1019Mv0 interfaceC1019Mv0, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC1019Mv0 + ", already has " + obj).toString());
    }

    public final void A() {
        InterfaceC1729Vy interfaceC1729Vy = this.d;
        Throwable th = null;
        C7961xK c7961xK = interfaceC1729Vy instanceof C7961xK ? (C7961xK) interfaceC1729Vy : null;
        if (c7961xK != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7961xK.h;
                Object obj = atomicReferenceFieldUpdater.get(c7961xK);
                C8139yG c8139yG = EU0.b;
                if (obj == c8139yG) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7961xK, c8139yG, this)) {
                        if (atomicReferenceFieldUpdater.get(c7961xK) != c8139yG) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7961xK, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c7961xK) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }

    public final void B(Object obj, int i, InterfaceC6481pZ interfaceC6481pZ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1019Mv0) {
                Object objD = D((InterfaceC1019Mv0) obj2, obj, i, interfaceC6481pZ);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i);
                return;
            }
            if (obj2 instanceof C1234Pp) {
                C1234Pp c1234Pp = (C1234Pp) obj2;
                c1234Pp.getClass();
                if (C1234Pp.c.compareAndSet(c1234Pp, 0, 1)) {
                    if (interfaceC6481pZ != null) {
                        l(interfaceC6481pZ, c1234Pp.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(AbstractC0485Fz abstractC0485Fz) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        InterfaceC1729Vy interfaceC1729Vy = this.d;
        C7961xK c7961xK = interfaceC1729Vy instanceof C7961xK ? (C7961xK) interfaceC1729Vy : null;
        B(c1518Tf1, (c7961xK != null ? c7961xK.d : null) == abstractC0485Fz ? 4 : this.c, null);
    }

    public final C8139yG E(Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof InterfaceC1019Mv0;
            C8139yG c8139yG = AbstractC4368iZ.b;
            if (!z) {
                boolean z2 = obj2 instanceof C5783lv;
                return null;
            }
            Object objD = D((InterfaceC1019Mv0) obj2, obj, this.c, interfaceC6481pZ);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return c8139yG;
        }
    }

    @Override // defpackage.InterfaceC0611Hp
    public final C8139yG a(Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        return E(obj, interfaceC6481pZ);
    }

    @Override // defpackage.InterfaceC6331om1
    public final void b(KX0 kx0, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(kx0);
    }

    @Override // defpackage.AbstractC8341zK
    public final void c(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC1019Mv0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C6165nv) {
                return;
            }
            if (!(obj instanceof C5783lv)) {
                C5783lv c5783lv = new C5783lv(obj, (InterfaceC0143Bp) null, (InterfaceC6481pZ) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5783lv)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C5783lv c5783lv2 = (C5783lv) obj;
            if (c5783lv2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C5783lv c5783lvA = C5783lv.a(c5783lv2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5783lvA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC0143Bp interfaceC0143Bp = c5783lv2.b;
            if (interfaceC0143Bp != null) {
                k(interfaceC0143Bp, cancellationException);
            }
            InterfaceC6481pZ interfaceC6481pZ = c5783lv2.c;
            if (interfaceC6481pZ != null) {
                l(interfaceC6481pZ, cancellationException, c5783lv2.a);
                return;
            }
            return;
        }
    }

    @Override // defpackage.AbstractC8341zK
    public final InterfaceC1729Vy d() {
        return this.d;
    }

    @Override // defpackage.InterfaceC0611Hp
    public final void e(Object obj, InterfaceC6481pZ interfaceC6481pZ) {
        B(obj, this.c, interfaceC6481pZ);
    }

    @Override // defpackage.AbstractC8341zK
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.AbstractC8341zK
    public final Object g(Object obj) {
        return obj instanceof C5783lv ? ((C5783lv) obj).a : obj;
    }

    @Override // defpackage.InterfaceC1108Nz
    public final InterfaceC1108Nz getCallerFrame() {
        InterfaceC1729Vy interfaceC1729Vy = this.d;
        if (interfaceC1729Vy instanceof InterfaceC1108Nz) {
            return (InterfaceC1108Nz) interfaceC1729Vy;
        }
        return null;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return this.e;
    }

    @Override // defpackage.InterfaceC0611Hp
    public final void i(Object obj) {
        p(this.c);
    }

    @Override // defpackage.InterfaceC0611Hp
    public final boolean isActive() {
        return g.get(this) instanceof InterfaceC1019Mv0;
    }

    @Override // defpackage.AbstractC8341zK
    public final Object j() {
        return g.get(this);
    }

    public final void k(InterfaceC0143Bp interfaceC0143Bp, Throwable th) {
        try {
            interfaceC0143Bp.a(th);
        } catch (Throwable th2) {
            AbstractC7243tY1.a(this.e, new C7074sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(InterfaceC6481pZ interfaceC6481pZ, Throwable th, Object obj) {
        InterfaceC0173Bz interfaceC0173Bz = this.e;
        try {
            interfaceC6481pZ.b(th, obj, interfaceC0173Bz);
        } catch (Throwable th2) {
            AbstractC7243tY1.a(interfaceC0173Bz, new C7074sg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(KX0 kx0, Throwable th) {
        InterfaceC0173Bz interfaceC0173Bz = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            kx0.h(i, interfaceC0173Bz);
        } catch (Throwable th2) {
            AbstractC7243tY1.a(interfaceC0173Bz, new C7074sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1019Mv0)) {
                return false;
            }
            C1234Pp c1234Pp = new C1234Pp(this, th, (obj instanceof InterfaceC0143Bp) || (obj instanceof KX0));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1234Pp)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC1019Mv0 interfaceC1019Mv0 = (InterfaceC1019Mv0) obj;
            if (interfaceC1019Mv0 instanceof InterfaceC0143Bp) {
                k((InterfaceC0143Bp) obj, th);
            } else if (interfaceC1019Mv0 instanceof KX0) {
                m((KX0) obj, th);
            }
            if (!x()) {
                o();
            }
            p(this.c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        MK mk = (MK) atomicReferenceFieldUpdater.get(this);
        if (mk == null) {
            return;
        }
        mk.a();
        atomicReferenceFieldUpdater.set(this, C0864Kv0.a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC1729Vy interfaceC1729Vy = this.d;
                boolean z = i == 4;
                if (z || !(interfaceC1729Vy instanceof C7961xK) || WZ1.a(i) != WZ1.a(this.c)) {
                    WZ1.b(this, interfaceC1729Vy, z);
                    return;
                }
                C7961xK c7961xK = (C7961xK) interfaceC1729Vy;
                AbstractC0485Fz abstractC0485Fz = c7961xK.d;
                InterfaceC0173Bz context = c7961xK.e.getContext();
                if (abstractC0485Fz.n(context)) {
                    abstractC0485Fz.l(context, this);
                    return;
                }
                KP kpA = X91.a();
                if (kpA.c >= 4294967296L) {
                    C6018n8 c6018n8 = kpA.e;
                    if (c6018n8 == null) {
                        c6018n8 = new C6018n8();
                        kpA.e = c6018n8;
                    }
                    c6018n8.i(this);
                    return;
                }
                kpA.x(true);
                try {
                    WZ1.b(this, interfaceC1729Vy, true);
                    do {
                    } while (kpA.D());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(C2548cc0 c2548cc0) {
        return c2548cc0.u();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = g.get(this);
                if (obj instanceof C6165nv) {
                    throw ((C6165nv) obj).a;
                }
                if (WZ1.a(this.c)) {
                    InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) this.e.g(C0396Ev0.e);
                    if (interfaceC1115Ob0 != null && !interfaceC1115Ob0.isActive()) {
                        CancellationException cancellationExceptionU = ((C2548cc0) interfaceC1115Ob0).u();
                        c(cancellationExceptionU);
                        throw cancellationExceptionU;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((MK) h.get(this)) == null) {
            t();
        }
        if (zX) {
            A();
        }
        return EnumC1030Mz.a;
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        Throwable thA = PS0.a(obj);
        if (thA != null) {
            obj = new C6165nv(thA, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        MK mkT = t();
        if (mkT == null || (g.get(this) instanceof InterfaceC1019Mv0)) {
            return;
        }
        mkT.a();
        h.set(this, C0864Kv0.a);
    }

    public final MK t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) this.e.g(C0396Ev0.e);
        if (interfaceC1115Ob0 == null) {
            return null;
        }
        MK mkC = M22.c(interfaceC1115Ob0, true, new C0383Er(this, 0));
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, mkC)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return mkC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC8130yD.e(this.d));
        sb.append("){");
        Object obj = g.get(this);
        sb.append(obj instanceof InterfaceC1019Mv0 ? "Active" : obj instanceof C1234Pp ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC8130yD.c(this));
        return sb.toString();
    }

    public final void u(InterfaceC6099nZ interfaceC6099nZ) {
        v(new C0065Ap(1, interfaceC6099nZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00ad, code lost:
    
        y(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.InterfaceC1019Mv0 r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C0767Jp.g
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof defpackage.C7334u2
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof defpackage.InterfaceC0143Bp
            r2 = 0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof defpackage.KX0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof defpackage.C6165nv
            if (r1 == 0) goto L57
            r0 = r7
            nv r0 = (defpackage.C6165nv) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.C6165nv.b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L53
            boolean r1 = r7 instanceof defpackage.C1234Pp
            if (r1 == 0) goto L52
            boolean r1 = r7 instanceof defpackage.C6165nv
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.a
        L43:
            boolean r0 = r10 instanceof defpackage.InterfaceC0143Bp
            if (r0 == 0) goto L4d
            Bp r10 = (defpackage.InterfaceC0143Bp) r10
            r9.k(r10, r2)
            goto L52
        L4d:
            KX0 r10 = (defpackage.KX0) r10
            r9.m(r10, r2)
        L52:
            return
        L53:
            y(r10, r7)
            throw r2
        L57:
            boolean r1 = r7 instanceof defpackage.C5783lv
            if (r1 == 0) goto L8b
            r1 = r7
            lv r1 = (defpackage.C5783lv) r1
            Bp r3 = r1.b
            if (r3 != 0) goto L87
            boolean r3 = r10 instanceof defpackage.KX0
            if (r3 == 0) goto L67
            return
        L67:
            r3 = r10
            Bp r3 = (defpackage.InterfaceC0143Bp) r3
            java.lang.Throwable r4 = r1.e
            if (r4 == 0) goto L72
            r9.k(r3, r4)
            return
        L72:
            r4 = 29
            lv r1 = defpackage.C5783lv.a(r1, r3, r2, r4)
        L78:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7f
            return
        L7f:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L78
            goto L0
        L87:
            y(r10, r7)
            throw r2
        L8b:
            boolean r1 = r10 instanceof defpackage.KX0
            if (r1 == 0) goto L90
            return
        L90:
            r3 = r10
            Bp r3 = (defpackage.InterfaceC0143Bp) r3
            lv r8 = new lv
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9e:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La5
            return
        La5:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9e
            goto L0
        Lad:
            y(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0767Jp.v(Mv0):void");
    }

    public final boolean w() {
        return g.get(this) instanceof C1234Pp;
    }

    public final boolean x() {
        if (this.c == 2) {
            InterfaceC1729Vy interfaceC1729Vy = this.d;
            O90.d(interfaceC1729Vy, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C7961xK.h.get((C7961xK) interfaceC1729Vy) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
