package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* renamed from: cc0 */
/* loaded from: classes2.dex */
public class C2548cc0 implements InterfaceC1115Ob0, InterfaceC3912gA0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2548cc0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C2548cc0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C2548cc0(boolean z) {
        this._state$volatile = z ? AbstractC4295iA1.g : AbstractC4295iA1.f;
    }

    public static C0539Gr J(C2194al0 c2194al0) {
        while (c2194al0.h()) {
            C2194al0 c2194al0E = c2194al0.e();
            if (c2194al0E == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2194al0.b;
                Object obj = atomicReferenceFieldUpdater.get(c2194al0);
                while (true) {
                    c2194al0 = (C2194al0) obj;
                    if (!c2194al0.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2194al0);
                }
            } else {
                c2194al0 = c2194al0E;
            }
        }
        while (true) {
            c2194al0 = c2194al0.g();
            if (!c2194al0.h()) {
                if (c2194al0 instanceof C0539Gr) {
                    return (C0539Gr) c2194al0;
                }
                if (c2194al0 instanceof C0786Jv0) {
                    return null;
                }
            }
        }
    }

    public static String Q(Object obj) {
        if (!(obj instanceof C2167ac0)) {
            return obj instanceof InterfaceC2268b80 ? ((InterfaceC2268b80) obj).isActive() ? "Active" : "New" : obj instanceof C6165nv ? "Cancelled" : "Completed";
        }
        C2167ac0 c2167ac0 = (C2167ac0) obj;
        return c2167ac0.d() ? "Cancelling" : C2167ac0.b.get(c2167ac0) != 0 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x008c, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [Gr, Ub0, al0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [MK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [Jv0, al0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(defpackage.InterfaceC1115Ob0 r8) {
        /*
            r7 = this;
            Kv0 r0 = defpackage.C0864Kv0.a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.C2548cc0.b
            if (r8 != 0) goto La
            r1.set(r7, r0)
            return
        La:
            cc0 r8 = (defpackage.C2548cc0) r8
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C2548cc0.a
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.P(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            if (r3 == r4) goto L1c
            goto Lc
        L1c:
            Gr r3 = new Gr
            r3.<init>(r7)
            r3.d = r8
        L23:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof defpackage.EN
            if (r5 == 0) goto L45
            r5 = r4
            EN r5 = (defpackage.EN) r5
            boolean r6 = r5.a
            if (r6 == 0) goto L41
        L32:
            boolean r5 = r2.compareAndSet(r8, r4, r3)
            if (r5 == 0) goto L3a
            goto La2
        L3a:
            java.lang.Object r5 = r2.get(r8)
            if (r5 == r4) goto L32
            goto L23
        L41:
            r8.N(r5)
            goto L23
        L45:
            boolean r5 = r4 instanceof defpackage.InterfaceC2268b80
            r6 = 0
            if (r5 == 0) goto L8e
            r5 = r4
            b80 r5 = (defpackage.InterfaceC2268b80) r5
            Jv0 r5 = r5.c()
            if (r5 != 0) goto L5e
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            defpackage.O90.d(r4, r5)
            Ub0 r4 = (defpackage.AbstractC1583Ub0) r4
            r8.O(r4)
            goto L23
        L5e:
            r4 = 7
            boolean r4 = r5.d(r3, r4)
            if (r4 == 0) goto L66
            goto La2
        L66:
            r4 = 3
            boolean r4 = r5.d(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r5 = r8 instanceof defpackage.C2167ac0
            if (r5 == 0) goto L7a
            ac0 r8 = (defpackage.C2167ac0) r8
            java.lang.Throwable r6 = r8.b()
            goto L86
        L7a:
            boolean r5 = r8 instanceof defpackage.C6165nv
            if (r5 == 0) goto L81
            nv r8 = (defpackage.C6165nv) r8
            goto L82
        L81:
            r8 = r6
        L82:
            if (r8 == 0) goto L86
            java.lang.Throwable r6 = r8.a
        L86:
            r3.k(r6)
            if (r4 == 0) goto L8c
            goto La2
        L8c:
            r3 = r0
            goto La2
        L8e:
            java.lang.Object r8 = r2.get(r8)
            boolean r4 = r8 instanceof defpackage.C6165nv
            if (r4 == 0) goto L99
            nv r8 = (defpackage.C6165nv) r8
            goto L9a
        L99:
            r8 = r6
        L9a:
            if (r8 == 0) goto L9e
            java.lang.Throwable r6 = r8.a
        L9e:
            r3.k(r6)
            goto L8c
        La2:
            r1.set(r7, r3)
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof defpackage.InterfaceC2268b80
            if (r8 != 0) goto Lb3
            r3.a()
            r1.set(r7, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2548cc0.C(Ob0):void");
    }

    public final MK D(boolean z, AbstractC1583Ub0 abstractC1583Ub0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0864Kv0 c0864Kv0;
        boolean z2;
        boolean zD;
        abstractC1583Ub0.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof EN;
            c0864Kv0 = C0864Kv0.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC2268b80)) {
                    z2 = false;
                    break;
                }
                InterfaceC2268b80 interfaceC2268b80 = (InterfaceC2268b80) obj;
                C0786Jv0 c0786Jv0C = interfaceC2268b80.c();
                if (c0786Jv0C == null) {
                    O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O((AbstractC1583Ub0) obj);
                } else {
                    if (abstractC1583Ub0.j()) {
                        C2167ac0 c2167ac0 = interfaceC2268b80 instanceof C2167ac0 ? (C2167ac0) interfaceC2268b80 : null;
                        Throwable thB = c2167ac0 != null ? c2167ac0.b() : null;
                        if (thB != null) {
                            if (z) {
                                abstractC1583Ub0.k(thB);
                            }
                            return c0864Kv0;
                        }
                        zD = c0786Jv0C.d(abstractC1583Ub0, 5);
                    } else {
                        zD = c0786Jv0C.d(abstractC1583Ub0, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                EN en = (EN) obj;
                if (en.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1583Ub0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                N(en);
            }
        }
        if (z2) {
            return abstractC1583Ub0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C6165nv c6165nv = obj2 instanceof C6165nv ? (C6165nv) obj2 : null;
            abstractC1583Ub0.k(c6165nv != null ? c6165nv.a : null);
        }
        return c0864Kv0;
    }

    public boolean E() {
        return this instanceof C0200Ci;
    }

    public final Object F(AbstractC1963Yy abstractC1963Yy) {
        Object obj;
        C1518Tf1 c1518Tf1;
        do {
            obj = a.get(this);
            boolean z = obj instanceof InterfaceC2268b80;
            c1518Tf1 = C1518Tf1.a;
            if (!z) {
                M22.b(abstractC1963Yy.getContext());
                return c1518Tf1;
            }
        } while (P(obj) < 0);
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(abstractC1963Yy));
        c0767Jp.s();
        c0767Jp.v(new C0065Ap(2, M22.c(this, true, new C0383Er(c0767Jp, 1))));
        Object objR = c0767Jp.r();
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        if (objR != enumC1030Mz) {
            objR = c1518Tf1;
        }
        return objR == enumC1030Mz ? objR : c1518Tf1;
    }

    public final boolean G(Object obj) {
        Object objR;
        do {
            objR = R(a.get(this), obj);
            if (objR == AbstractC4295iA1.a) {
                return false;
            }
            if (objR == AbstractC4295iA1.b) {
                return true;
            }
        } while (objR == AbstractC4295iA1.c);
        d(objR);
        return true;
    }

    public final Object H(Object obj) {
        Object objR;
        do {
            objR = R(a.get(this), obj);
            if (objR == AbstractC4295iA1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C6165nv c6165nv = obj instanceof C6165nv ? (C6165nv) obj : null;
                throw new IllegalStateException(str, c6165nv != null ? c6165nv.a : null);
            }
        } while (objR == AbstractC4295iA1.c);
        return objR;
    }

    public String I() {
        return getClass().getSimpleName();
    }

    public final void K(C0786Jv0 c0786Jv0, Throwable th) {
        c0786Jv0.d(new C6893rj0(4), 4);
        Object obj = C2194al0.a.get(c0786Jv0);
        O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C7074sg c7074sg = null;
        for (C2194al0 c2194al0G = (C2194al0) obj; !c2194al0G.equals(c0786Jv0); c2194al0G = c2194al0G.g()) {
            if ((c2194al0G instanceof AbstractC1583Ub0) && ((AbstractC1583Ub0) c2194al0G).j()) {
                try {
                    ((AbstractC1583Ub0) c2194al0G).k(th);
                } catch (Throwable th2) {
                    if (c7074sg != null) {
                        I02.a(c7074sg, th2);
                    } else {
                        c7074sg = new C7074sg("Exception in completion handler " + c2194al0G + " for " + this, th2);
                    }
                }
            }
        }
        if (c7074sg != null) {
            B(c7074sg);
        }
        o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y70] */
    public final void N(EN en) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0786Jv0 c0786Jv0 = new C0786Jv0();
        if (!en.a) {
            c0786Jv0 = new Y70(c0786Jv0);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, en, c0786Jv0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == en);
    }

    public final void O(AbstractC1583Ub0 abstractC1583Ub0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0786Jv0 c0786Jv0 = new C0786Jv0();
        abstractC1583Ub0.getClass();
        C2194al0.b.set(c0786Jv0, abstractC1583Ub0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2194al0.a;
        atomicReferenceFieldUpdater2.set(c0786Jv0, abstractC1583Ub0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC1583Ub0) == abstractC1583Ub0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1583Ub0, abstractC1583Ub0, c0786Jv0)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1583Ub0) != abstractC1583Ub0) {
                        break;
                    }
                }
                c0786Jv0.f(abstractC1583Ub0);
                break loop0;
            }
            break;
        }
        C2194al0 c2194al0G = abstractC1583Ub0.g();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1583Ub0, c2194al0G)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1583Ub0);
    }

    public final int P(Object obj) {
        boolean z = obj instanceof EN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((EN) obj).a) {
                return 0;
            }
            EN en = AbstractC4295iA1.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, en)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof Y70)) {
            return 0;
        }
        C0786Jv0 c0786Jv0 = ((Y70) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0786Jv0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object R(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC2268b80)) {
            return AbstractC4295iA1.a;
        }
        if (((obj instanceof EN) || (obj instanceof AbstractC1583Ub0)) && !(obj instanceof C0539Gr) && !(obj2 instanceof C6165nv)) {
            InterfaceC2268b80 interfaceC2268b80 = (InterfaceC2268b80) obj;
            Object c2458c80 = obj2 instanceof InterfaceC2268b80 ? new C2458c80((InterfaceC2268b80) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2268b80, c2458c80)) {
                    L(obj2);
                    r(interfaceC2268b80, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC2268b80);
            return AbstractC4295iA1.c;
        }
        InterfaceC2268b80 interfaceC2268b802 = (InterfaceC2268b80) obj;
        C0786Jv0 c0786Jv0Z = z(interfaceC2268b802);
        if (c0786Jv0Z == null) {
            return AbstractC4295iA1.c;
        }
        C2167ac0 c2167ac0 = interfaceC2268b802 instanceof C2167ac0 ? (C2167ac0) interfaceC2268b802 : null;
        if (c2167ac0 == null) {
            c2167ac0 = new C2167ac0(c0786Jv0Z, null);
        }
        synchronized (c2167ac0) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2167ac0.b;
                if (atomicIntegerFieldUpdater.get(c2167ac0) != 0) {
                    return AbstractC4295iA1.a;
                }
                atomicIntegerFieldUpdater.set(c2167ac0, 1);
                if (c2167ac0 != interfaceC2268b802) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC2268b802, c2167ac0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC2268b802) {
                            return AbstractC4295iA1.c;
                        }
                    }
                }
                boolean zD = c2167ac0.d();
                C6165nv c6165nv = obj2 instanceof C6165nv ? (C6165nv) obj2 : null;
                if (c6165nv != null) {
                    c2167ac0.a(c6165nv.a);
                }
                Throwable thB = zD ? null : c2167ac0.b();
                if (thB != null) {
                    K(c0786Jv0Z, thB);
                }
                C0539Gr c0539GrJ = J(c0786Jv0Z);
                if (c0539GrJ != null && S(c2167ac0, c0539GrJ, obj2)) {
                    return AbstractC4295iA1.b;
                }
                c0786Jv0Z.d(new C6893rj0(2), 2);
                C0539Gr c0539GrJ2 = J(c0786Jv0Z);
                return (c0539GrJ2 == null || !S(c2167ac0, c0539GrJ2, obj2)) ? t(c2167ac0, obj2) : AbstractC4295iA1.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean S(C2167ac0 c2167ac0, C0539Gr c0539Gr, Object obj) {
        while (M22.c(c0539Gr.e, false, new C1973Zb0(this, c2167ac0, c0539Gr, obj)) == C0864Kv0.a) {
            c0539Gr = J(c0539Gr);
            if (c0539Gr == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.b(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz f(InterfaceC0173Bz interfaceC0173Bz) {
        return AbstractC7803wU1.c(this, interfaceC0173Bz);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.a(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC8464zz
    public final InterfaceC0095Az getKey() {
        return C0396Ev0.e;
    }

    public void h(Object obj) {
        d(obj);
    }

    @Override // defpackage.InterfaceC1115Ob0
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof InterfaceC2268b80) && ((InterfaceC2268b80) obj).isActive();
    }

    @Override // defpackage.InterfaceC0173Bz
    public final Object j(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final Object k(InterfaceC1729Vy interfaceC1729Vy) throws Throwable {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof InterfaceC2268b80)) {
                if (obj instanceof C6165nv) {
                    throw ((C6165nv) obj).a;
                }
                return AbstractC4295iA1.a(obj);
            }
        } while (P(obj) < 0);
        C1895Yb0 c1895Yb0 = new C1895Yb0(AbstractC6383p22.b(interfaceC1729Vy), this);
        c1895Yb0.s();
        c1895Yb0.v(new C0065Ap(2, M22.c(this, true, new NK(2, c1895Yb0))));
        Object objR = c1895Yb0.r();
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objR;
    }

    public final void l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1193Pb0(p(), null, this);
        }
        n(cancellationException);
    }

    public Object m() {
        return v();
    }

    public final boolean n(Object obj) {
        C8139yG c8139yG;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objR = AbstractC4295iA1.a;
        if (y()) {
            do {
                Object obj2 = a.get(this);
                if (obj2 instanceof InterfaceC2268b80) {
                    if (obj2 instanceof C2167ac0) {
                        C2167ac0 c2167ac0 = (C2167ac0) obj2;
                        c2167ac0.getClass();
                        if (C2167ac0.b.get(c2167ac0) != 0) {
                        }
                    }
                    objR = R(obj2, new C6165nv(s(obj), false));
                }
                objR = AbstractC4295iA1.a;
                break;
            } while (objR == AbstractC4295iA1.c);
            if (objR == AbstractC4295iA1.b) {
                return true;
            }
        }
        if (objR == AbstractC4295iA1.a) {
            Throwable thS = null;
            loop1: while (true) {
                Object obj3 = a.get(this);
                if (!(obj3 instanceof C2167ac0)) {
                    if (!(obj3 instanceof InterfaceC2268b80)) {
                        c8139yG = AbstractC4295iA1.d;
                        break;
                    }
                    if (thS == null) {
                        thS = s(obj);
                    }
                    InterfaceC2268b80 interfaceC2268b80 = (InterfaceC2268b80) obj3;
                    if (interfaceC2268b80.isActive()) {
                        C0786Jv0 c0786Jv0Z = z(interfaceC2268b80);
                        if (c0786Jv0Z == null) {
                            continue;
                        } else {
                            C2167ac0 c2167ac02 = new C2167ac0(c0786Jv0Z, thS);
                            do {
                                atomicReferenceFieldUpdater = a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2268b80, c2167ac02)) {
                                    K(c0786Jv0Z, thS);
                                    c8139yG = AbstractC4295iA1.a;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC2268b80);
                        }
                    } else {
                        Object objR2 = R(obj3, new C6165nv(thS, false));
                        if (objR2 == AbstractC4295iA1.a) {
                            throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                        }
                        if (objR2 != AbstractC4295iA1.c) {
                            objR = objR2;
                            break;
                        }
                    }
                } else {
                    synchronized (obj3) {
                        try {
                            C2167ac0 c2167ac03 = (C2167ac0) obj3;
                            c2167ac03.getClass();
                            if (C2167ac0.d.get(c2167ac03) == AbstractC4295iA1.e) {
                                c8139yG = AbstractC4295iA1.d;
                            } else {
                                boolean zD = ((C2167ac0) obj3).d();
                                if (thS == null) {
                                    thS = s(obj);
                                }
                                ((C2167ac0) obj3).a(thS);
                                Throwable thB = zD ? null : ((C2167ac0) obj3).b();
                                if (thB != null) {
                                    K(((C2167ac0) obj3).a, thB);
                                }
                                c8139yG = AbstractC4295iA1.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            objR = c8139yG;
        }
        if (objR != AbstractC4295iA1.a && objR != AbstractC4295iA1.b) {
            if (objR == AbstractC4295iA1.d) {
                return false;
            }
            d(objR);
        }
        return true;
    }

    public final boolean o(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0461Fr interfaceC0461Fr = (InterfaceC0461Fr) b.get(this);
        return (interfaceC0461Fr == null || interfaceC0461Fr == C0864Kv0.a) ? z : interfaceC0461Fr.b(th) || z;
    }

    public String p() {
        return "Job was cancelled";
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && x();
    }

    public final void r(InterfaceC2268b80 interfaceC2268b80, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        InterfaceC0461Fr interfaceC0461Fr = (InterfaceC0461Fr) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0461Fr != null) {
            interfaceC0461Fr.a();
            atomicReferenceFieldUpdater.set(this, C0864Kv0.a);
        }
        C7074sg c7074sg = null;
        C6165nv c6165nv = obj instanceof C6165nv ? (C6165nv) obj : null;
        Throwable th = c6165nv != null ? c6165nv.a : null;
        if (interfaceC2268b80 instanceof AbstractC1583Ub0) {
            try {
                ((AbstractC1583Ub0) interfaceC2268b80).k(th);
                return;
            } catch (Throwable th2) {
                B(new C7074sg("Exception in completion handler " + interfaceC2268b80 + " for " + this, th2));
                return;
            }
        }
        C0786Jv0 c0786Jv0C = interfaceC2268b80.c();
        if (c0786Jv0C != null) {
            c0786Jv0C.d(new C6893rj0(1), 1);
            Object obj2 = C2194al0.a.get(c0786Jv0C);
            O90.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C2194al0 c2194al0G = (C2194al0) obj2; !c2194al0G.equals(c0786Jv0C); c2194al0G = c2194al0G.g()) {
                if (c2194al0G instanceof AbstractC1583Ub0) {
                    try {
                        ((AbstractC1583Ub0) c2194al0G).k(th);
                    } catch (Throwable th3) {
                        if (c7074sg != null) {
                            I02.a(c7074sg, th3);
                        } else {
                            c7074sg = new C7074sg("Exception in completion handler " + c2194al0G + " for " + this, th3);
                        }
                    }
                }
            }
            if (c7074sg != null) {
                B(c7074sg);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationExceptionB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C2548cc0 c2548cc0 = (C2548cc0) ((InterfaceC3912gA0) obj);
        Object obj2 = a.get(c2548cc0);
        if (obj2 instanceof C2167ac0) {
            cancellationExceptionB = ((C2167ac0) obj2).b();
        } else if (obj2 instanceof C6165nv) {
            cancellationExceptionB = ((C6165nv) obj2).a;
        } else {
            if (obj2 instanceof InterfaceC2268b80) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionB = null;
        }
        CancellationException c1193Pb0 = cancellationExceptionB instanceof CancellationException ? cancellationExceptionB : null;
        if (c1193Pb0 == null) {
            c1193Pb0 = new C1193Pb0("Parent job is ".concat(Q(obj2)), cancellationExceptionB, c2548cc0);
        }
        return c1193Pb0;
    }

    public final Object t(C2167ac0 c2167ac0, Object obj) {
        Throwable thW;
        C6165nv c6165nv = obj instanceof C6165nv ? (C6165nv) obj : null;
        Throwable th = c6165nv != null ? c6165nv.a : null;
        synchronized (c2167ac0) {
            c2167ac0.d();
            ArrayList<Throwable> arrayListE = c2167ac0.e(th);
            thW = w(c2167ac0, arrayListE);
            if (thW != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thW && th2 != thW && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        I02.a(thW, th2);
                    }
                }
            }
        }
        if (thW != null && thW != th) {
            obj = new C6165nv(thW, false);
        }
        if (thW != null && (o(thW) || A(thW))) {
            O90.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C6165nv.b.compareAndSet((C6165nv) obj, 0, 1);
        }
        L(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object c2458c80 = obj instanceof InterfaceC2268b80 ? new C2458c80((InterfaceC2268b80) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2167ac0, c2458c80) && atomicReferenceFieldUpdater.get(this) == c2167ac0) {
        }
        r(c2167ac0, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(I() + '{' + Q(a.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC8130yD.c(this));
        return sb.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object obj = a.get(this);
        if (!(obj instanceof C2167ac0)) {
            if (obj instanceof InterfaceC2268b80) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C6165nv)) {
                return new C1193Pb0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C6165nv) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C1193Pb0(p(), th, this) : cancellationException;
        }
        Throwable thB = ((C2167ac0) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = p();
        }
        return new C1193Pb0(strConcat, thB, this);
    }

    public final Object v() throws Throwable {
        Object obj = a.get(this);
        if (obj instanceof InterfaceC2268b80) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C6165nv) {
            throw ((C6165nv) obj).a;
        }
        return AbstractC4295iA1.a(obj);
    }

    public final Throwable w(C2167ac0 c2167ac0, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c2167ac0.d()) {
                return new C1193Pb0(p(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C0412Fa1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C0412Fa1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof C5592kv;
    }

    public final C0786Jv0 z(InterfaceC2268b80 interfaceC2268b80) {
        C0786Jv0 c0786Jv0C = interfaceC2268b80.c();
        if (c0786Jv0C != null) {
            return c0786Jv0C;
        }
        if (interfaceC2268b80 instanceof EN) {
            return new C0786Jv0();
        }
        if (interfaceC2268b80 instanceof AbstractC1583Ub0) {
            O((AbstractC1583Ub0) interfaceC2268b80);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2268b80).toString());
    }

    public void M() {
    }

    public void B(C7074sg c7074sg) {
        throw c7074sg;
    }

    public void L(Object obj) {
    }

    public void d(Object obj) {
    }
}
