package p000;

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
public class C9002cc0 implements InterfaceC8044Ob0, InterfaceC9463gA0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17647a = AtomicReferenceFieldUpdater.newUpdater(C9002cc0.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17648b = AtomicReferenceFieldUpdater.newUpdater(C9002cc0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C9002cc0(boolean z) {
        this._state$volatile = z ? AbstractC9720iA1.f28871g : AbstractC9720iA1.f28870f;
    }

    /* renamed from: J */
    public static C0432Gr m10794J(C8764al0 c8764al0) {
        while (c8764al0.mo4469h()) {
            C8764al0 c8764al0M9807e = c8764al0.m9807e();
            if (c8764al0M9807e == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8764al0.f15683b;
                Object obj = atomicReferenceFieldUpdater.get(c8764al0);
                while (true) {
                    c8764al0 = (C8764al0) obj;
                    if (!c8764al0.mo4469h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c8764al0);
                }
            } else {
                c8764al0 = c8764al0M9807e;
            }
        }
        while (true) {
            c8764al0 = c8764al0.m9809g();
            if (!c8764al0.mo4469h()) {
                if (c8764al0 instanceof C0432Gr) {
                    return (C0432Gr) c8764al0;
                }
                if (c8764al0 instanceof C7824Jv0) {
                    return null;
                }
            }
        }
    }

    /* renamed from: Q */
    public static String m10795Q(Object obj) {
        if (!(obj instanceof C8746ac0)) {
            return obj instanceof InterfaceC8814b80 ? ((InterfaceC8814b80) obj).isActive() ? "Active" : "New" : obj instanceof C6519nv ? "Cancelled" : "Completed";
        }
        C8746ac0 c8746ac0 = (C8746ac0) obj;
        return c8746ac0.m9772d() ? "Cancelling" : C8746ac0.f15583b.get(c8746ac0) != 0 ? "Completing" : "Active";
    }

    /* renamed from: A */
    public boolean mo10796A(Throwable th) {
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
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10797C(p000.InterfaceC8044Ob0 r8) {
        /*
            r7 = this;
            Kv0 r0 = p000.C7876Kv0.f6390a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C9002cc0.f17648b
            if (r8 != 0) goto La
            r1.set(r7, r0)
            return
        La:
            cc0 r8 = (p000.C9002cc0) r8
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.C9002cc0.f17647a
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.m10806P(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            if (r3 == r4) goto L1c
            goto Lc
        L1c:
            Gr r3 = new Gr
            r3.<init>(r7)
            r3.f11927d = r8
        L23:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof p000.C0276EN
            if (r5 == 0) goto L45
            r5 = r4
            EN r5 = (p000.C0276EN) r5
            boolean r6 = r5.f2675a
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
            r8.m10804N(r5)
            goto L23
        L45:
            boolean r5 = r4 instanceof p000.InterfaceC8814b80
            r6 = 0
            if (r5 == 0) goto L8e
            r5 = r4
            b80 r5 = (p000.InterfaceC8814b80) r5
            Jv0 r5 = r5.mo2199c()
            if (r5 != 0) goto L5e
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            p000.O90.m5966d(r4, r5)
            Ub0 r4 = (p000.AbstractC8356Ub0) r4
            r8.m10805O(r4)
            goto L23
        L5e:
            r4 = 7
            boolean r4 = r5.m9806d(r3, r4)
            if (r4 == 0) goto L66
            goto La2
        L66:
            r4 = 3
            boolean r4 = r5.m9806d(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r5 = r8 instanceof p000.C8746ac0
            if (r5 == 0) goto L7a
            ac0 r8 = (p000.C8746ac0) r8
            java.lang.Throwable r6 = r8.m9771b()
            goto L86
        L7a:
            boolean r5 = r8 instanceof p000.C6519nv
            if (r5 == 0) goto L81
            nv r8 = (p000.C6519nv) r8
            goto L82
        L81:
            r8 = r6
        L82:
            if (r8 == 0) goto L86
            java.lang.Throwable r6 = r8.f38606a
        L86:
            r3.mo2435k(r6)
            if (r4 == 0) goto L8c
            goto La2
        L8c:
            r3 = r0
            goto La2
        L8e:
            java.lang.Object r8 = r2.get(r8)
            boolean r4 = r8 instanceof p000.C6519nv
            if (r4 == 0) goto L99
            nv r8 = (p000.C6519nv) r8
            goto L9a
        L99:
            r8 = r6
        L9a:
            if (r8 == 0) goto L9e
            java.lang.Throwable r6 = r8.f38606a
        L9e:
            r3.mo2435k(r6)
            goto L8c
        La2:
            r1.set(r7, r3)
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof p000.InterfaceC8814b80
            if (r8 != 0) goto Lb3
            r3.mo3407a()
            r1.set(r7, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9002cc0.m10797C(Ob0):void");
    }

    /* renamed from: D */
    public final InterfaceC0776MK m10798D(boolean z, AbstractC8356Ub0 abstractC8356Ub0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7876Kv0 c7876Kv0;
        boolean z2;
        boolean zM9806d;
        abstractC8356Ub0.f11927d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f17647a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C0276EN;
            c7876Kv0 = C7876Kv0.f6390a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC8814b80)) {
                    z2 = false;
                    break;
                }
                InterfaceC8814b80 interfaceC8814b80 = (InterfaceC8814b80) obj;
                C7824Jv0 c7824Jv0Mo2199c = interfaceC8814b80.mo2199c();
                if (c7824Jv0Mo2199c == null) {
                    O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m10805O((AbstractC8356Ub0) obj);
                } else {
                    if (abstractC8356Ub0.mo2434j()) {
                        C8746ac0 c8746ac0 = interfaceC8814b80 instanceof C8746ac0 ? (C8746ac0) interfaceC8814b80 : null;
                        Throwable thM9771b = c8746ac0 != null ? c8746ac0.m9771b() : null;
                        if (thM9771b != null) {
                            if (z) {
                                abstractC8356Ub0.mo2435k(thM9771b);
                            }
                            return c7876Kv0;
                        }
                        zM9806d = c7824Jv0Mo2199c.m9806d(abstractC8356Ub0, 5);
                    } else {
                        zM9806d = c7824Jv0Mo2199c.m9806d(abstractC8356Ub0, 1);
                    }
                    if (zM9806d) {
                        break;
                    }
                }
            } else {
                C0276EN c0276en = (C0276EN) obj;
                if (c0276en.f2675a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC8356Ub0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m10804N(c0276en);
            }
        }
        if (z2) {
            return abstractC8356Ub0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C6519nv c6519nv = obj2 instanceof C6519nv ? (C6519nv) obj2 : null;
            abstractC8356Ub0.mo2435k(c6519nv != null ? c6519nv.f38606a : null);
        }
        return c7876Kv0;
    }

    /* renamed from: E */
    public boolean mo4336E() {
        return this instanceof C0171Ci;
    }

    /* renamed from: F */
    public final Object m10799F(AbstractC1571Yy abstractC1571Yy) {
        Object obj;
        C8313Tf1 c8313Tf1;
        do {
            obj = f17647a.get(this);
            boolean z = obj instanceof InterfaceC8814b80;
            c8313Tf1 = C8313Tf1.f11463a;
            if (!z) {
                M22.m5248b(abstractC1571Yy.getContext());
                return c8313Tf1;
            }
        } while (m10806P(obj) < 0);
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(abstractC1571Yy));
        c0619Jp.m4439s();
        c0619Jp.m4442v(new C0052Ap(2, M22.m5249c(this, true, new C0306Er(c0619Jp, 1))));
        Object objM4438r = c0619Jp.m4438r();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        if (objM4438r != enumC0817Mz) {
            objM4438r = c8313Tf1;
        }
        return objM4438r == enumC0817Mz ? objM4438r : c8313Tf1;
    }

    /* renamed from: G */
    public final boolean m10800G(Object obj) {
        Object objM10807R;
        do {
            objM10807R = m10807R(f17647a.get(this), obj);
            if (objM10807R == AbstractC9720iA1.f28865a) {
                return false;
            }
            if (objM10807R == AbstractC9720iA1.f28866b) {
                return true;
            }
        } while (objM10807R == AbstractC9720iA1.f28867c);
        mo1298d(objM10807R);
        return true;
    }

    /* renamed from: H */
    public final Object m10801H(Object obj) {
        Object objM10807R;
        do {
            objM10807R = m10807R(f17647a.get(this), obj);
            if (objM10807R == AbstractC9720iA1.f28865a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C6519nv c6519nv = obj instanceof C6519nv ? (C6519nv) obj : null;
                throw new IllegalStateException(str, c6519nv != null ? c6519nv.f38606a : null);
            }
        } while (objM10807R == AbstractC9720iA1.f28867c);
        return objM10807R;
    }

    /* renamed from: I */
    public String mo3095I() {
        return getClass().getSimpleName();
    }

    /* renamed from: K */
    public final void m10802K(C7824Jv0 c7824Jv0, Throwable th) {
        c7824Jv0.m9806d(new C10941rj0(4), 4);
        Object obj = C8764al0.f15682a.get(c7824Jv0);
        O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C6838sg c6838sg = null;
        for (C8764al0 c8764al0M9809g = (C8764al0) obj; !c8764al0M9809g.equals(c7824Jv0); c8764al0M9809g = c8764al0M9809g.m9809g()) {
            if ((c8764al0M9809g instanceof AbstractC8356Ub0) && ((AbstractC8356Ub0) c8764al0M9809g).mo2434j()) {
                try {
                    ((AbstractC8356Ub0) c8764al0M9809g).mo2435k(th);
                } catch (Throwable th2) {
                    if (c6838sg != null) {
                        I02.m3687a(c6838sg, th2);
                    } else {
                        c6838sg = new C6838sg("Exception in completion handler " + c8764al0M9809g + " for " + this, th2);
                    }
                }
            }
        }
        if (c6838sg != null) {
            mo2466B(c6838sg);
        }
        m10813o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Y70] */
    /* renamed from: N */
    public final void m10804N(C0276EN c0276en) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7824Jv0 c7824Jv0 = new C7824Jv0();
        if (!c0276en.f2675a) {
            c7824Jv0 = new Y70(c7824Jv0);
        }
        do {
            atomicReferenceFieldUpdater = f17647a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0276en, c7824Jv0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0276en);
    }

    /* renamed from: O */
    public final void m10805O(AbstractC8356Ub0 abstractC8356Ub0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7824Jv0 c7824Jv0 = new C7824Jv0();
        abstractC8356Ub0.getClass();
        C8764al0.f15683b.set(c7824Jv0, abstractC8356Ub0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C8764al0.f15682a;
        atomicReferenceFieldUpdater2.set(c7824Jv0, abstractC8356Ub0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC8356Ub0) == abstractC8356Ub0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC8356Ub0, abstractC8356Ub0, c7824Jv0)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC8356Ub0) != abstractC8356Ub0) {
                        break;
                    }
                }
                c7824Jv0.m9808f(abstractC8356Ub0);
                break loop0;
            }
            break;
        }
        C8764al0 c8764al0M9809g = abstractC8356Ub0.m9809g();
        do {
            atomicReferenceFieldUpdater = f17647a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC8356Ub0, c8764al0M9809g)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC8356Ub0);
    }

    /* renamed from: P */
    public final int m10806P(Object obj) {
        boolean z = obj instanceof C0276EN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17647a;
        if (z) {
            if (((C0276EN) obj).f2675a) {
                return 0;
            }
            C0276EN c0276en = AbstractC9720iA1.f28871g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0276en)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof Y70)) {
            return 0;
        }
        C7824Jv0 c7824Jv0 = ((Y70) obj).f14169a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7824Jv0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* renamed from: R */
    public final Object m10807R(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC8814b80)) {
            return AbstractC9720iA1.f28865a;
        }
        if (((obj instanceof C0276EN) || (obj instanceof AbstractC8356Ub0)) && !(obj instanceof C0432Gr) && !(obj2 instanceof C6519nv)) {
            InterfaceC8814b80 interfaceC8814b80 = (InterfaceC8814b80) obj;
            Object c8942c80 = obj2 instanceof InterfaceC8814b80 ? new C8942c80((InterfaceC8814b80) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f17647a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC8814b80, c8942c80)) {
                    mo2467L(obj2);
                    m10815r(interfaceC8814b80, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC8814b80);
            return AbstractC9720iA1.f28867c;
        }
        InterfaceC8814b80 interfaceC8814b802 = (InterfaceC8814b80) obj;
        C7824Jv0 c7824Jv0M10821z = m10821z(interfaceC8814b802);
        if (c7824Jv0M10821z == null) {
            return AbstractC9720iA1.f28867c;
        }
        C8746ac0 c8746ac0 = interfaceC8814b802 instanceof C8746ac0 ? (C8746ac0) interfaceC8814b802 : null;
        if (c8746ac0 == null) {
            c8746ac0 = new C8746ac0(c7824Jv0M10821z, null);
        }
        synchronized (c8746ac0) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C8746ac0.f15583b;
                if (atomicIntegerFieldUpdater.get(c8746ac0) != 0) {
                    return AbstractC9720iA1.f28865a;
                }
                atomicIntegerFieldUpdater.set(c8746ac0, 1);
                if (c8746ac0 != interfaceC8814b802) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f17647a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC8814b802, c8746ac0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC8814b802) {
                            return AbstractC9720iA1.f28867c;
                        }
                    }
                }
                boolean zM9772d = c8746ac0.m9772d();
                C6519nv c6519nv = obj2 instanceof C6519nv ? (C6519nv) obj2 : null;
                if (c6519nv != null) {
                    c8746ac0.m9770a(c6519nv.f38606a);
                }
                Throwable thM9771b = zM9772d ? null : c8746ac0.m9771b();
                if (thM9771b != null) {
                    m10802K(c7824Jv0M10821z, thM9771b);
                }
                C0432Gr c0432GrM10794J = m10794J(c7824Jv0M10821z);
                if (c0432GrM10794J != null && m10808S(c8746ac0, c0432GrM10794J, obj2)) {
                    return AbstractC9720iA1.f28866b;
                }
                c7824Jv0M10821z.m9806d(new C10941rj0(2), 2);
                C0432Gr c0432GrM10794J2 = m10794J(c7824Jv0M10821z);
                return (c0432GrM10794J2 == null || !m10808S(c8746ac0, c0432GrM10794J2, obj2)) ? m10817t(c8746ac0, obj2) : AbstractC9720iA1.f28866b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: S */
    public final boolean m10808S(C8746ac0 c8746ac0, C0432Gr c0432Gr, Object obj) {
        while (M22.m5249c(c0432Gr.f3927e, false, new C8616Zb0(this, c8746ac0, c0432Gr, obj)) == C7876Kv0.f6390a) {
            c0432Gr = m10794J(c0432Gr);
            if (c0432Gr == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: c */
    public final InterfaceC0125Bz mo935c(InterfaceC0062Az interfaceC0062Az) {
        return AbstractC11551wU1.m25638b(this, interfaceC0062Az);
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: f */
    public final InterfaceC0125Bz mo936f(InterfaceC0125Bz interfaceC0125Bz) {
        return AbstractC11551wU1.m25639c(this, interfaceC0125Bz);
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: g */
    public final InterfaceC7298zz mo937g(InterfaceC0062Az interfaceC0062Az) {
        return AbstractC11551wU1.m25637a(this, interfaceC0062Az);
    }

    @Override // p000.InterfaceC7298zz
    public final InterfaceC0062Az getKey() {
        return C7564Ev0.f2962e;
    }

    /* renamed from: h */
    public void mo4337h(Object obj) {
        mo1298d(obj);
    }

    @Override // p000.InterfaceC8044Ob0
    public boolean isActive() {
        Object obj = f17647a.get(this);
        return (obj instanceof InterfaceC8814b80) && ((InterfaceC8814b80) obj).isActive();
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: j */
    public final Object mo938j(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    /* renamed from: k */
    public final Object m10809k(InterfaceC1382Vy interfaceC1382Vy) throws Throwable {
        Object obj;
        do {
            obj = f17647a.get(this);
            if (!(obj instanceof InterfaceC8814b80)) {
                if (obj instanceof C6519nv) {
                    throw ((C6519nv) obj).f38606a;
                }
                return AbstractC9720iA1.m18978a(obj);
            }
        } while (m10806P(obj) < 0);
        C8564Yb0 c8564Yb0 = new C8564Yb0(AbstractC10599p22.m23595b(interfaceC1382Vy), this);
        c8564Yb0.m4439s();
        c8564Yb0.m4442v(new C0052Ap(2, M22.m5249c(this, true, new C0839NK(2, c8564Yb0))));
        Object objM4438r = c8564Yb0.m4438r();
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM4438r;
    }

    /* renamed from: l */
    public final void m10810l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C8096Pb0(mo2470p(), null, this);
        }
        m10812n(cancellationException);
    }

    /* renamed from: m */
    public Object m10811m() {
        return m10819v();
    }

    /* renamed from: n */
    public final boolean m10812n(Object obj) {
        C7190yG c7190yG;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM10807R = AbstractC9720iA1.f28865a;
        if (mo6733y()) {
            do {
                Object obj2 = f17647a.get(this);
                if (obj2 instanceof InterfaceC8814b80) {
                    if (obj2 instanceof C8746ac0) {
                        C8746ac0 c8746ac0 = (C8746ac0) obj2;
                        c8746ac0.getClass();
                        if (C8746ac0.f15583b.get(c8746ac0) != 0) {
                        }
                    }
                    objM10807R = m10807R(obj2, new C6519nv(m10816s(obj), false));
                }
                objM10807R = AbstractC9720iA1.f28865a;
                break;
            } while (objM10807R == AbstractC9720iA1.f28867c);
            if (objM10807R == AbstractC9720iA1.f28866b) {
                return true;
            }
        }
        if (objM10807R == AbstractC9720iA1.f28865a) {
            Throwable thM10816s = null;
            loop1: while (true) {
                Object obj3 = f17647a.get(this);
                if (!(obj3 instanceof C8746ac0)) {
                    if (!(obj3 instanceof InterfaceC8814b80)) {
                        c7190yG = AbstractC9720iA1.f28868d;
                        break;
                    }
                    if (thM10816s == null) {
                        thM10816s = m10816s(obj);
                    }
                    InterfaceC8814b80 interfaceC8814b80 = (InterfaceC8814b80) obj3;
                    if (interfaceC8814b80.isActive()) {
                        C7824Jv0 c7824Jv0M10821z = m10821z(interfaceC8814b80);
                        if (c7824Jv0M10821z == null) {
                            continue;
                        } else {
                            C8746ac0 c8746ac02 = new C8746ac0(c7824Jv0M10821z, thM10816s);
                            do {
                                atomicReferenceFieldUpdater = f17647a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC8814b80, c8746ac02)) {
                                    m10802K(c7824Jv0M10821z, thM10816s);
                                    c7190yG = AbstractC9720iA1.f28865a;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC8814b80);
                        }
                    } else {
                        Object objM10807R2 = m10807R(obj3, new C6519nv(thM10816s, false));
                        if (objM10807R2 == AbstractC9720iA1.f28865a) {
                            throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                        }
                        if (objM10807R2 != AbstractC9720iA1.f28867c) {
                            objM10807R = objM10807R2;
                            break;
                        }
                    }
                } else {
                    synchronized (obj3) {
                        try {
                            C8746ac0 c8746ac03 = (C8746ac0) obj3;
                            c8746ac03.getClass();
                            if (C8746ac0.f15585d.get(c8746ac03) == AbstractC9720iA1.f28869e) {
                                c7190yG = AbstractC9720iA1.f28868d;
                            } else {
                                boolean zM9772d = ((C8746ac0) obj3).m9772d();
                                if (thM10816s == null) {
                                    thM10816s = m10816s(obj);
                                }
                                ((C8746ac0) obj3).m9770a(thM10816s);
                                Throwable thM9771b = zM9772d ? null : ((C8746ac0) obj3).m9771b();
                                if (thM9771b != null) {
                                    m10802K(((C8746ac0) obj3).f15586a, thM9771b);
                                }
                                c7190yG = AbstractC9720iA1.f28865a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            objM10807R = c7190yG;
        }
        if (objM10807R != AbstractC9720iA1.f28865a && objM10807R != AbstractC9720iA1.f28866b) {
            if (objM10807R == AbstractC9720iA1.f28868d) {
                return false;
            }
            mo1298d(objM10807R);
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m10813o(Throwable th) {
        if (mo4336E()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0369Fr interfaceC0369Fr = (InterfaceC0369Fr) f17648b.get(this);
        return (interfaceC0369Fr == null || interfaceC0369Fr == C7876Kv0.f6390a) ? z : interfaceC0369Fr.mo2793b(th) || z;
    }

    /* renamed from: p */
    public String mo2470p() {
        return "Job was cancelled";
    }

    /* renamed from: q */
    public boolean mo10814q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m10812n(th) && mo6732x();
    }

    /* renamed from: r */
    public final void m10815r(InterfaceC8814b80 interfaceC8814b80, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17648b;
        InterfaceC0369Fr interfaceC0369Fr = (InterfaceC0369Fr) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0369Fr != null) {
            interfaceC0369Fr.mo3407a();
            atomicReferenceFieldUpdater.set(this, C7876Kv0.f6390a);
        }
        C6838sg c6838sg = null;
        C6519nv c6519nv = obj instanceof C6519nv ? (C6519nv) obj : null;
        Throwable th = c6519nv != null ? c6519nv.f38606a : null;
        if (interfaceC8814b80 instanceof AbstractC8356Ub0) {
            try {
                ((AbstractC8356Ub0) interfaceC8814b80).mo2435k(th);
                return;
            } catch (Throwable th2) {
                mo2466B(new C6838sg("Exception in completion handler " + interfaceC8814b80 + " for " + this, th2));
                return;
            }
        }
        C7824Jv0 c7824Jv0Mo2199c = interfaceC8814b80.mo2199c();
        if (c7824Jv0Mo2199c != null) {
            c7824Jv0Mo2199c.m9806d(new C10941rj0(1), 1);
            Object obj2 = C8764al0.f15682a.get(c7824Jv0Mo2199c);
            O90.m5966d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C8764al0 c8764al0M9809g = (C8764al0) obj2; !c8764al0M9809g.equals(c7824Jv0Mo2199c); c8764al0M9809g = c8764al0M9809g.m9809g()) {
                if (c8764al0M9809g instanceof AbstractC8356Ub0) {
                    try {
                        ((AbstractC8356Ub0) c8764al0M9809g).mo2435k(th);
                    } catch (Throwable th3) {
                        if (c6838sg != null) {
                            I02.m3687a(c6838sg, th3);
                        } else {
                            c6838sg = new C6838sg("Exception in completion handler " + c8764al0M9809g + " for " + this, th3);
                        }
                    }
                }
            }
            if (c6838sg != null) {
                mo2466B(c6838sg);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: s */
    public final Throwable m10816s(Object obj) {
        CancellationException cancellationExceptionM9771b;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C9002cc0 c9002cc0 = (C9002cc0) ((InterfaceC9463gA0) obj);
        Object obj2 = f17647a.get(c9002cc0);
        if (obj2 instanceof C8746ac0) {
            cancellationExceptionM9771b = ((C8746ac0) obj2).m9771b();
        } else if (obj2 instanceof C6519nv) {
            cancellationExceptionM9771b = ((C6519nv) obj2).f38606a;
        } else {
            if (obj2 instanceof InterfaceC8814b80) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionM9771b = null;
        }
        CancellationException c8096Pb0 = cancellationExceptionM9771b instanceof CancellationException ? cancellationExceptionM9771b : null;
        if (c8096Pb0 == null) {
            c8096Pb0 = new C8096Pb0("Parent job is ".concat(m10795Q(obj2)), cancellationExceptionM9771b, c9002cc0);
        }
        return c8096Pb0;
    }

    /* renamed from: t */
    public final Object m10817t(C8746ac0 c8746ac0, Object obj) {
        Throwable thM10820w;
        C6519nv c6519nv = obj instanceof C6519nv ? (C6519nv) obj : null;
        Throwable th = c6519nv != null ? c6519nv.f38606a : null;
        synchronized (c8746ac0) {
            c8746ac0.m9772d();
            ArrayList<Throwable> arrayListM9773e = c8746ac0.m9773e(th);
            thM10820w = m10820w(c8746ac0, arrayListM9773e);
            if (thM10820w != null && arrayListM9773e.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM9773e.size()));
                for (Throwable th2 : arrayListM9773e) {
                    if (th2 != thM10820w && th2 != thM10820w && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        I02.m3687a(thM10820w, th2);
                    }
                }
            }
        }
        if (thM10820w != null && thM10820w != th) {
            obj = new C6519nv(thM10820w, false);
        }
        if (thM10820w != null && (m10813o(thM10820w) || mo10796A(thM10820w))) {
            O90.m5966d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C6519nv.f38605b.compareAndSet((C6519nv) obj, 0, 1);
        }
        mo2467L(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17647a;
        Object c8942c80 = obj instanceof InterfaceC8814b80 ? new C8942c80((InterfaceC8814b80) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c8746ac0, c8942c80) && atomicReferenceFieldUpdater.get(this) == c8746ac0) {
        }
        m10815r(c8746ac0, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo3095I() + '{' + m10795Q(f17647a.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC7187yD.m26097c(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final CancellationException m10818u() {
        CancellationException cancellationException;
        Object obj = f17647a.get(this);
        if (!(obj instanceof C8746ac0)) {
            if (obj instanceof InterfaceC8814b80) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C6519nv)) {
                return new C8096Pb0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C6519nv) obj).f38606a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C8096Pb0(mo2470p(), th, this) : cancellationException;
        }
        Throwable thM9771b = ((C8746ac0) obj).m9771b();
        if (thM9771b == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM9771b instanceof CancellationException ? (CancellationException) thM9771b : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo2470p();
        }
        return new C8096Pb0(strConcat, thM9771b, this);
    }

    /* renamed from: v */
    public final Object m10819v() throws Throwable {
        Object obj = f17647a.get(this);
        if (obj instanceof InterfaceC8814b80) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C6519nv) {
            throw ((C6519nv) obj).f38606a;
        }
        return AbstractC9720iA1.m18978a(obj);
    }

    /* renamed from: w */
    public final Throwable m10820w(C8746ac0 c8746ac0, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c8746ac0.m9772d()) {
                return new C8096Pb0(mo2470p(), null, this);
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
        if (th2 instanceof C7575Fa1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C7575Fa1)) {
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

    /* renamed from: x */
    public boolean mo6732x() {
        return true;
    }

    /* renamed from: y */
    public boolean mo6733y() {
        return this instanceof C6330kv;
    }

    /* renamed from: z */
    public final C7824Jv0 m10821z(InterfaceC8814b80 interfaceC8814b80) {
        C7824Jv0 c7824Jv0Mo2199c = interfaceC8814b80.mo2199c();
        if (c7824Jv0Mo2199c != null) {
            return c7824Jv0Mo2199c;
        }
        if (interfaceC8814b80 instanceof C0276EN) {
            return new C7824Jv0();
        }
        if (interfaceC8814b80 instanceof AbstractC8356Ub0) {
            m10805O((AbstractC8356Ub0) interfaceC8814b80);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC8814b80).toString());
    }

    /* renamed from: M */
    public void m10803M() {
    }

    /* renamed from: B */
    public void mo2466B(C6838sg c6838sg) {
        throw c6838sg;
    }

    /* renamed from: L */
    public void mo2467L(Object obj) {
    }

    /* renamed from: d */
    public void mo1298d(Object obj) {
    }
}
