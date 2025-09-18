package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Jp */
/* loaded from: classes2.dex */
public class C0619Jp extends AbstractC7257zK implements InterfaceC0493Hp, InterfaceC0880Nz, InterfaceC10564om1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5708f = AtomicIntegerFieldUpdater.newUpdater(C0619Jp.class, "_decisionAndIndex$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5709g = AtomicReferenceFieldUpdater.newUpdater(C0619Jp.class, Object.class, "_state$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5710h = AtomicReferenceFieldUpdater.newUpdater(C0619Jp.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final InterfaceC1382Vy f5711d;

    /* renamed from: e */
    public final InterfaceC0125Bz f5712e;

    public C0619Jp(int i, InterfaceC1382Vy interfaceC1382Vy) {
        super(i);
        this.f5711d = interfaceC1382Vy;
        this.f5712e = interfaceC1382Vy.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C6924u2.f43451a;
    }

    /* renamed from: D */
    public static Object m4419D(InterfaceC7980Mv0 interfaceC7980Mv0, Object obj, int i, InterfaceC6625pZ interfaceC6625pZ) {
        if ((obj instanceof C6519nv) || !WZ1.m8819a(i)) {
            return obj;
        }
        if (interfaceC6625pZ != null || (interfaceC7980Mv0 instanceof InterfaceC0115Bp)) {
            return new C6393lv(obj, interfaceC7980Mv0 instanceof InterfaceC0115Bp ? (InterfaceC0115Bp) interfaceC7980Mv0 : null, interfaceC6625pZ, (CancellationException) null, 16);
        }
        return obj;
    }

    /* renamed from: y */
    public static void m4420y(InterfaceC7980Mv0 interfaceC7980Mv0, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC7980Mv0 + ", already has " + obj).toString());
    }

    /* renamed from: A */
    public final void m4421A() {
        InterfaceC1382Vy interfaceC1382Vy = this.f5711d;
        Throwable th = null;
        C7131xK c7131xK = interfaceC1382Vy instanceof C7131xK ? (C7131xK) interfaceC1382Vy : null;
        if (c7131xK != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7131xK.f45546h;
                Object obj = atomicReferenceFieldUpdater.get(c7131xK);
                C7190yG c7190yG = EU0.f2720b;
                if (obj == c7190yG) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7131xK, c7190yG, this)) {
                        if (atomicReferenceFieldUpdater.get(c7131xK) != c7190yG) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7131xK, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c7131xK) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m4435o();
            m4434n(th);
        }
    }

    /* renamed from: B */
    public final void m4422B(Object obj, int i, InterfaceC6625pZ interfaceC6625pZ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5709g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC7980Mv0) {
                Object objM4419D = m4419D((InterfaceC7980Mv0) obj2, obj, i, interfaceC6625pZ);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM4419D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m4444x()) {
                    m4435o();
                }
                m4436p(i);
                return;
            }
            if (obj2 instanceof C0996Pp) {
                C0996Pp c0996Pp = (C0996Pp) obj2;
                c0996Pp.getClass();
                if (C0996Pp.f9287c.compareAndSet(c0996Pp, 0, 1)) {
                    if (interfaceC6625pZ != null) {
                        m4432l(interfaceC6625pZ, c0996Pp.f38606a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* renamed from: C */
    public final void m4423C(AbstractC0377Fz abstractC0377Fz) {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        InterfaceC1382Vy interfaceC1382Vy = this.f5711d;
        C7131xK c7131xK = interfaceC1382Vy instanceof C7131xK ? (C7131xK) interfaceC1382Vy : null;
        m4422B(c8313Tf1, (c7131xK != null ? c7131xK.f45547d : null) == abstractC0377Fz ? 4 : this.f46791c, null);
    }

    /* renamed from: E */
    public final C7190yG m4424E(Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5709g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof InterfaceC7980Mv0;
            C7190yG c7190yG = AbstractC4250iZ.f29318b;
            if (!z) {
                boolean z2 = obj2 instanceof C6393lv;
                return null;
            }
            Object objM4419D = m4419D((InterfaceC7980Mv0) obj2, obj, this.f46791c, interfaceC6625pZ);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM4419D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m4444x()) {
                m4435o();
            }
            return c7190yG;
        }
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: a */
    public final C7190yG mo3596a(Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        return m4424E(obj, interfaceC6625pZ);
    }

    @Override // p000.InterfaceC10564om1
    /* renamed from: b */
    public final void mo4425b(KX0 kx0, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5708f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m4442v(kx0);
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: c */
    public final void mo4426c(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5709g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC7980Mv0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C6519nv) {
                return;
            }
            if (!(obj instanceof C6393lv)) {
                C6393lv c6393lv = new C6393lv(obj, (InterfaceC0115Bp) null, (InterfaceC6625pZ) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6393lv)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C6393lv c6393lv2 = (C6393lv) obj;
            if (c6393lv2.f37361e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C6393lv c6393lvM22598a = C6393lv.m22598a(c6393lv2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6393lvM22598a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC0115Bp interfaceC0115Bp = c6393lv2.f37358b;
            if (interfaceC0115Bp != null) {
                m4431k(interfaceC0115Bp, cancellationException);
            }
            InterfaceC6625pZ interfaceC6625pZ = c6393lv2.f37359c;
            if (interfaceC6625pZ != null) {
                m4432l(interfaceC6625pZ, cancellationException, c6393lv2.f37357a);
                return;
            }
            return;
        }
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: d */
    public final InterfaceC1382Vy mo4427d() {
        return this.f5711d;
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: e */
    public final void mo3597e(Object obj, InterfaceC6625pZ interfaceC6625pZ) {
        m4422B(obj, this.f46791c, interfaceC6625pZ);
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: f */
    public final Throwable mo4428f(Object obj) {
        Throwable thMo4428f = super.mo4428f(obj);
        if (thMo4428f != null) {
            return thMo4428f;
        }
        return null;
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: g */
    public final Object mo4429g(Object obj) {
        return obj instanceof C6393lv ? ((C6393lv) obj).f37357a : obj;
    }

    @Override // p000.InterfaceC0880Nz
    public final InterfaceC0880Nz getCallerFrame() {
        InterfaceC1382Vy interfaceC1382Vy = this.f5711d;
        if (interfaceC1382Vy instanceof InterfaceC0880Nz) {
            return (InterfaceC0880Nz) interfaceC1382Vy;
        }
        return null;
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return this.f5712e;
    }

    @Override // p000.InterfaceC0493Hp
    /* renamed from: i */
    public final void mo3598i(Object obj) {
        m4436p(this.f46791c);
    }

    @Override // p000.InterfaceC0493Hp
    public final boolean isActive() {
        return f5709g.get(this) instanceof InterfaceC7980Mv0;
    }

    @Override // p000.AbstractC7257zK
    /* renamed from: j */
    public final Object mo4430j() {
        return f5709g.get(this);
    }

    /* renamed from: k */
    public final void m4431k(InterfaceC0115Bp interfaceC0115Bp, Throwable th) {
        try {
            interfaceC0115Bp.mo324a(th);
        } catch (Throwable th2) {
            AbstractC11176tY1.m24942a(this.f5712e, new C6838sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m4432l(InterfaceC6625pZ interfaceC6625pZ, Throwable th, Object obj) {
        InterfaceC0125Bz interfaceC0125Bz = this.f5712e;
        try {
            interfaceC6625pZ.mo300b(th, obj, interfaceC0125Bz);
        } catch (Throwable th2) {
            AbstractC11176tY1.m24942a(interfaceC0125Bz, new C6838sg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final void m4433m(KX0 kx0, Throwable th) {
        InterfaceC0125Bz interfaceC0125Bz = this.f5712e;
        int i = f5708f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            kx0.mo4665h(i, interfaceC0125Bz);
        } catch (Throwable th2) {
            AbstractC11176tY1.m24942a(interfaceC0125Bz, new C6838sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final boolean m4434n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5709g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC7980Mv0)) {
                return false;
            }
            C0996Pp c0996Pp = new C0996Pp(this, th, (obj instanceof InterfaceC0115Bp) || (obj instanceof KX0));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0996Pp)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC7980Mv0 interfaceC7980Mv0 = (InterfaceC7980Mv0) obj;
            if (interfaceC7980Mv0 instanceof InterfaceC0115Bp) {
                m4431k((InterfaceC0115Bp) obj, th);
            } else if (interfaceC7980Mv0 instanceof KX0) {
                m4433m((KX0) obj, th);
            }
            if (!m4444x()) {
                m4435o();
            }
            m4436p(this.f46791c);
            return true;
        }
    }

    /* renamed from: o */
    public final void m4435o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5710h;
        InterfaceC0776MK interfaceC0776MK = (InterfaceC0776MK) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0776MK == null) {
            return;
        }
        interfaceC0776MK.mo3407a();
        atomicReferenceFieldUpdater.set(this, C7876Kv0.f6390a);
    }

    /* renamed from: p */
    public final void m4436p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5708f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC1382Vy interfaceC1382Vy = this.f5711d;
                boolean z = i == 4;
                if (z || !(interfaceC1382Vy instanceof C7131xK) || WZ1.m8819a(i) != WZ1.m8819a(this.f46791c)) {
                    WZ1.m8820b(this, interfaceC1382Vy, z);
                    return;
                }
                C7131xK c7131xK = (C7131xK) interfaceC1382Vy;
                AbstractC0377Fz abstractC0377Fz = c7131xK.f45547d;
                InterfaceC0125Bz context = c7131xK.f45548e.getContext();
                if (abstractC0377Fz.mo2868n(context)) {
                    abstractC0377Fz.mo732l(context, this);
                    return;
                }
                AbstractC0656KP abstractC0656KPM8938a = X91.m8938a();
                if (abstractC0656KPM8938a.f6063c >= 4294967296L) {
                    C6470n8 c6470n8 = abstractC0656KPM8938a.f6065e;
                    if (c6470n8 == null) {
                        c6470n8 = new C6470n8();
                        abstractC0656KPM8938a.f6065e = c6470n8;
                    }
                    c6470n8.m23084i(this);
                    return;
                }
                abstractC0656KPM8938a.m4629x(true);
                try {
                    WZ1.m8820b(this, interfaceC1382Vy, true);
                    do {
                    } while (abstractC0656KPM8938a.m4626D());
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

    /* renamed from: q */
    public Throwable mo4437q(C9002cc0 c9002cc0) {
        return c9002cc0.m10818u();
    }

    /* renamed from: r */
    public final Object m4438r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zM4444x = m4444x();
        do {
            atomicIntegerFieldUpdater = f5708f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM4444x) {
                    m4421A();
                }
                Object obj = f5709g.get(this);
                if (obj instanceof C6519nv) {
                    throw ((C6519nv) obj).f38606a;
                }
                if (WZ1.m8819a(this.f46791c)) {
                    InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) this.f5712e.mo937g(C7564Ev0.f2962e);
                    if (interfaceC8044Ob0 != null && !interfaceC8044Ob0.isActive()) {
                        CancellationException cancellationExceptionM10818u = ((C9002cc0) interfaceC8044Ob0).m10818u();
                        mo4426c(cancellationExceptionM10818u);
                        throw cancellationExceptionM10818u;
                    }
                }
                return mo4429g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0776MK) f5710h.get(this)) == null) {
            m4440t();
        }
        if (zM4444x) {
            m4421A();
        }
        return EnumC0817Mz.f7418a;
    }

    @Override // p000.InterfaceC1382Vy
    public final void resumeWith(Object obj) {
        Throwable thM6365a = PS0.m6365a(obj);
        if (thM6365a != null) {
            obj = new C6519nv(thM6365a, false);
        }
        m4422B(obj, this.f46791c, null);
    }

    /* renamed from: s */
    public final void m4439s() {
        InterfaceC0776MK interfaceC0776MKM4440t = m4440t();
        if (interfaceC0776MKM4440t == null || (f5709g.get(this) instanceof InterfaceC7980Mv0)) {
            return;
        }
        interfaceC0776MKM4440t.mo3407a();
        f5710h.set(this, C7876Kv0.f6390a);
    }

    /* renamed from: t */
    public final InterfaceC0776MK m4440t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) this.f5712e.mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 == null) {
            return null;
        }
        InterfaceC0776MK interfaceC0776MKM5249c = M22.m5249c(interfaceC8044Ob0, true, new C0306Er(this, 0));
        do {
            atomicReferenceFieldUpdater = f5710h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC0776MKM5249c)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC0776MKM5249c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo4445z());
        sb.append('(');
        sb.append(AbstractC7187yD.m26099e(this.f5711d));
        sb.append("){");
        Object obj = f5709g.get(this);
        sb.append(obj instanceof InterfaceC7980Mv0 ? "Active" : obj instanceof C0996Pp ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC7187yD.m26097c(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void m4441u(InterfaceC6497nZ interfaceC6497nZ) {
        m4442v(new C0052Ap(1, interfaceC6497nZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00ad, code lost:
    
        m4420y(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00b0, code lost:
    
        throw null;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4442v(p000.InterfaceC7980Mv0 r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0619Jp.f5709g
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof p000.C6924u2
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
            boolean r1 = r7 instanceof p000.InterfaceC0115Bp
            r2 = 0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof p000.KX0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof p000.C6519nv
            if (r1 == 0) goto L57
            r0 = r7
            nv r0 = (p000.C6519nv) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.C6519nv.f38605b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L53
            boolean r1 = r7 instanceof p000.C0996Pp
            if (r1 == 0) goto L52
            boolean r1 = r7 instanceof p000.C6519nv
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.f38606a
        L43:
            boolean r0 = r10 instanceof p000.InterfaceC0115Bp
            if (r0 == 0) goto L4d
            Bp r10 = (p000.InterfaceC0115Bp) r10
            r9.m4431k(r10, r2)
            goto L52
        L4d:
            KX0 r10 = (p000.KX0) r10
            r9.m4433m(r10, r2)
        L52:
            return
        L53:
            m4420y(r10, r7)
            throw r2
        L57:
            boolean r1 = r7 instanceof p000.C6393lv
            if (r1 == 0) goto L8b
            r1 = r7
            lv r1 = (p000.C6393lv) r1
            Bp r3 = r1.f37358b
            if (r3 != 0) goto L87
            boolean r3 = r10 instanceof p000.KX0
            if (r3 == 0) goto L67
            return
        L67:
            r3 = r10
            Bp r3 = (p000.InterfaceC0115Bp) r3
            java.lang.Throwable r4 = r1.f37361e
            if (r4 == 0) goto L72
            r9.m4431k(r3, r4)
            return
        L72:
            r4 = 29
            lv r1 = p000.C6393lv.m22598a(r1, r3, r2, r4)
        L78:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7f
            return
        L7f:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L78
            goto L0
        L87:
            m4420y(r10, r7)
            throw r2
        L8b:
            boolean r1 = r10 instanceof p000.KX0
            if (r1 == 0) goto L90
            return
        L90:
            r3 = r10
            Bp r3 = (p000.InterfaceC0115Bp) r3
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
            m4420y(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0619Jp.m4442v(Mv0):void");
    }

    /* renamed from: w */
    public final boolean m4443w() {
        return f5709g.get(this) instanceof C0996Pp;
    }

    /* renamed from: x */
    public final boolean m4444x() {
        if (this.f46791c == 2) {
            InterfaceC1382Vy interfaceC1382Vy = this.f5711d;
            O90.m5966d(interfaceC1382Vy, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C7131xK.f45546h.get((C7131xK) interfaceC1382Vy) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public String mo4445z() {
        return "CancellableContinuation";
    }
}
