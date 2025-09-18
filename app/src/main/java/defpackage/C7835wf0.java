package defpackage;

import java.lang.reflect.Array;
import java.util.List;

/* renamed from: wf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7835wf0 implements InterfaceC7454uf0 {
    public static final /* synthetic */ InterfaceC5927mf0[] e;
    public final AbstractC0663Ig0 a;
    public final AP0 b;
    public final AP0 c;
    public final AP0 d;

    static {
        IP0 ip0 = BP0.a;
        e = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C7835wf0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), ip0.f(new GE0(ip0.b(C7835wf0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C7835wf0(AbstractC0663Ig0 abstractC0663Ig0, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(abstractC0663Ig0, "type");
        this.a = abstractC0663Ig0;
        AP0 ap0 = interfaceC5908mZ instanceof AP0 ? (AP0) interfaceC5908mZ : null;
        this.b = ap0 == null ? interfaceC5908mZ != null ? AbstractC7978xP1.a(null, interfaceC5908mZ) : null : ap0;
        this.c = AbstractC7978xP1.a(null, new C7645vf0(this, 1));
        this.d = AbstractC7978xP1.a(null, new C7726w5(this, 15, interfaceC5908mZ));
    }

    public final InterfaceC4384ie0 b(AbstractC0663Ig0 abstractC0663Ig0) {
        AbstractC0663Ig0 abstractC0663Ig0B;
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (!(interfaceC1087NsA instanceof InterfaceC7492us)) {
            if (interfaceC1087NsA instanceof InterfaceC5925me1) {
                return new C8215yf0(null, (InterfaceC5925me1) interfaceC1087NsA);
            }
            if (interfaceC1087NsA instanceof InterfaceC0499Gd1) {
                throw new C1420Rz("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class clsK = AbstractC0433Fh1.k((InterfaceC7492us) interfaceC1087NsA);
        if (clsK == null) {
            return null;
        }
        if (!clsK.isArray()) {
            if (AbstractC0112Be1.e(abstractC0663Ig0)) {
                return new C3430de0(clsK);
            }
            Class cls = (Class) VO0.b.get(clsK);
            if (cls != null) {
                clsK = cls;
            }
            return new C3430de0(clsK);
        }
        AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) AbstractC8069xu.T(abstractC0663Ig0.u());
        if (abstractC6689qe1 == null || (abstractC0663Ig0B = abstractC6689qe1.b()) == null) {
            return new C3430de0(clsK);
        }
        InterfaceC4384ie0 interfaceC4384ie0B = b(abstractC0663Ig0B);
        if (interfaceC4384ie0B != null) {
            return new C3430de0(Array.newInstance((Class<?>) P22.b(AbstractC4083h32.a(interfaceC4384ie0B)), 0).getClass());
        }
        throw new C1420Rz("Cannot determine classifier for array element type: " + this, 1);
    }

    @Override // defpackage.InterfaceC7454uf0
    public final boolean e() {
        return this.a.G();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7835wf0) {
            C7835wf0 c7835wf0 = (C7835wf0) obj;
            if (O90.a(this.a, c7835wf0.a) && O90.a(i(), c7835wf0.i()) && h().equals(c7835wf0.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        return AbstractC0433Fh1.d(this.a);
    }

    @Override // defpackage.InterfaceC7454uf0
    public final List h() {
        InterfaceC5927mf0 interfaceC5927mf0 = e[1];
        Object objInvoke = this.d.invoke();
        O90.e(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        InterfaceC4384ie0 interfaceC4384ie0I = i();
        return h().hashCode() + ((iHashCode + (interfaceC4384ie0I != null ? interfaceC4384ie0I.hashCode() : 0)) * 31);
    }

    @Override // defpackage.InterfaceC7454uf0
    public final InterfaceC4384ie0 i() {
        InterfaceC5927mf0 interfaceC5927mf0 = e[0];
        return (InterfaceC4384ie0) this.c.invoke();
    }

    public final String toString() {
        C5857mI c5857mI = QP0.a;
        return QP0.d(this.a);
    }
}
