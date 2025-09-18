package p000;

import java.lang.reflect.Array;
import java.util.List;

/* renamed from: wf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11572wf0 implements InterfaceC11317uf0 {

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC10293mf0[] f45015e;

    /* renamed from: a */
    public final AbstractC7742Ig0 f45016a;

    /* renamed from: b */
    public final AP0 f45017b;

    /* renamed from: c */
    public final AP0 f45018c;

    /* renamed from: d */
    public final AP0 f45019d;

    static {
        IP0 ip0 = BP0.f799a;
        f45015e = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C11572wf0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), ip0.mo3850f(new GE0(ip0.mo3846b(C11572wf0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C11572wf0(AbstractC7742Ig0 abstractC7742Ig0, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(abstractC7742Ig0, "type");
        this.f45016a = abstractC7742Ig0;
        AP0 ap0 = interfaceC6434mZ instanceof AP0 ? (AP0) interfaceC6434mZ : null;
        this.f45017b = ap0 == null ? interfaceC6434mZ != null ? AbstractC11668xP1.m25850a(null, interfaceC6434mZ) : null : ap0;
        this.f45018c = AbstractC11668xP1.m25850a(null, new C11445vf0(this, 1));
        this.f45019d = AbstractC11668xP1.m25850a(null, new C7053w5(this, 15, interfaceC6434mZ));
    }

    /* renamed from: b */
    public final InterfaceC9779ie0 m25670b(AbstractC7742Ig0 abstractC7742Ig0) {
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b;
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (!(interfaceC0873NsMo1962a instanceof InterfaceC6976us)) {
            if (interfaceC0873NsMo1962a instanceof InterfaceC10292me1) {
                return new C11826yf0(null, (InterfaceC10292me1) interfaceC0873NsMo1962a);
            }
            if (interfaceC0873NsMo1962a instanceof InterfaceC7633Gd1) {
                throw new C1131Rz("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class clsM2759k = AbstractC7589Fh1.m2759k((InterfaceC6976us) interfaceC0873NsMo1962a);
        if (clsM2759k == null) {
            return null;
        }
        if (!clsM2759k.isArray()) {
            if (AbstractC7375Be1.m787e(abstractC7742Ig0)) {
                return new C9139de0(clsM2759k);
            }
            Class cls = (Class) VO0.f12537b.get(clsM2759k);
            if (cls != null) {
                clsM2759k = cls;
            }
            return new C9139de0(clsM2759k);
        }
        AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) AbstractC7167xu.m25974T(abstractC7742Ig0.mo3800u());
        if (abstractC10804qe1 == null || (abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b()) == null) {
            return new C9139de0(clsM2759k);
        }
        InterfaceC9779ie0 interfaceC9779ie0M25670b = m25670b(abstractC7742Ig0Mo24038b);
        if (interfaceC9779ie0M25670b != null) {
            return new C9139de0(Array.newInstance((Class<?>) P22.m6213b(AbstractC9578h32.m18711a(interfaceC9779ie0M25670b)), 0).getClass());
        }
        throw new C1131Rz("Cannot determine classifier for array element type: " + this, 1);
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: e */
    public final boolean mo8537e() {
        return this.f45016a.mo3798G();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11572wf0) {
            C11572wf0 c11572wf0 = (C11572wf0) obj;
            if (O90.m5963a(this.f45016a, c11572wf0.f45016a) && O90.m5963a(mo8539i(), c11572wf0.mo8539i()) && mo8538h().equals(c11572wf0.mo8538h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        return AbstractC7589Fh1.m2752d(this.f45016a);
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: h */
    public final List mo8538h() {
        InterfaceC10293mf0 interfaceC10293mf0 = f45015e[1];
        Object objInvoke = this.f45019d.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        int iHashCode = this.f45016a.hashCode() * 31;
        InterfaceC9779ie0 interfaceC9779ie0Mo8539i = mo8539i();
        return mo8538h().hashCode() + ((iHashCode + (interfaceC9779ie0Mo8539i != null ? interfaceC9779ie0Mo8539i.hashCode() : 0)) * 31);
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: i */
    public final InterfaceC9779ie0 mo8539i() {
        InterfaceC10293mf0 interfaceC10293mf0 = f45015e[0];
        return (InterfaceC9779ie0) this.f45018c.invoke();
    }

    public final String toString() {
        C6417mI c6417mI = QP0.f9616a;
        return QP0.m6685d(this.f45016a);
    }
}
