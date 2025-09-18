package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class HI extends D implements CD {
    public final TE0 e;
    public final AbstractC7268th f;
    public final W21 g;
    public final C0074As h;
    public final EnumC6348os0 i;
    public final C7575vI j;
    public final EnumC0152Bs k;
    public final C1666Vd l;
    public final AbstractC5769lq0 m;
    public final GI n;
    public final KV0 o;
    public final C6860rY0 p;
    public final CD q;
    public final C1610Uk0 r;
    public final C1688Vk0 s;
    public final C1688Vk0 t;
    public final C1610Uk0 u;
    public final PF0 v;
    public final I5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HI(C1666Vd c1666Vd, TE0 te0, InterfaceC1637Ut0 interfaceC1637Ut0, AbstractC7268th abstractC7268th, W21 w21) {
        EnumC0152Bs enumC0152Bs;
        AbstractC5769lq0 l41;
        super(((C7955xI) c1666Vd.c).a, CB1.a(interfaceC1637Ut0, te0.e).i());
        O90.f(c1666Vd, "outerContext");
        O90.f(te0, "classProto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(w21, "sourceElement");
        this.e = te0;
        this.f = abstractC7268th;
        this.g = w21;
        this.h = CB1.a(interfaceC1637Ut0, te0.e);
        this.i = C7304tt.u((EnumC5467kF0) ZV.e.c(te0.d));
        this.j = YM1.a((OF0) ZV.d.c(te0.d));
        SE0 se0 = (SE0) ZV.f.c(te0.d);
        switch (se0 == null ? -1 : UF0.b[se0.ordinal()]) {
            case 1:
                enumC0152Bs = EnumC0152Bs.a;
                break;
            case 2:
                enumC0152Bs = EnumC0152Bs.b;
                break;
            case 3:
                enumC0152Bs = EnumC0152Bs.c;
                break;
            case 4:
                enumC0152Bs = EnumC0152Bs.d;
                break;
            case 5:
                enumC0152Bs = EnumC0152Bs.e;
                break;
            case 6:
            case 7:
                enumC0152Bs = EnumC0152Bs.f;
                break;
            default:
                enumC0152Bs = EnumC0152Bs.a;
                break;
        }
        EnumC0152Bs enumC0152Bs2 = enumC0152Bs;
        this.k = enumC0152Bs2;
        List list = te0.g;
        O90.e(list, "getTypeParameterList(...)");
        GF0 gf0 = te0.E;
        O90.e(gf0, "getTypeTable(...)");
        C5826m71 c5826m71 = new C5826m71(gf0);
        C0124Bi1 c0124Bi1 = C0124Bi1.b;
        NF0 nf0 = te0.G;
        O90.e(nf0, "getVersionRequirementTable(...)");
        C1666Vd c1666VdB = c1666Vd.b(this, list, interfaceC1637Ut0, c5826m71, AbstractC7901x02.a(nf0), abstractC7268th);
        this.l = c1666VdB;
        EnumC0152Bs enumC0152Bs3 = EnumC0152Bs.c;
        C7955xI c7955xI = (C7955xI) c1666VdB.c;
        if (enumC0152Bs2 == enumC0152Bs3) {
            l41 = new L41(c7955xI.a, this, ZV.m.c(te0.d).booleanValue() || O90.a(c7955xI.s.x(), Boolean.TRUE));
        } else {
            l41 = C5387jq0.b;
        }
        this.m = l41;
        this.n = new GI(this);
        C7304tt c7304tt = KV0.d;
        Z41 z41 = c7955xI.a;
        ((C7883wv0) c7955xI.q).getClass();
        C1684Vj c1684Vj = new C1684Vj(1, this, 3);
        c7304tt.getClass();
        O90.f(z41, "storageManager");
        this.o = new KV0(this, z41, c1684Vj);
        this.p = enumC0152Bs2 == enumC0152Bs3 ? new C6860rY0(this) : null;
        CD cd = (CD) c1666Vd.e;
        this.q = cd;
        FI fi = new FI(this, 4);
        Z41 z412 = c7955xI.a;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z412;
        c1922Yk0.getClass();
        this.r = new C1610Uk0(c1922Yk0, fi);
        FI fi2 = new FI(this, 3);
        C1922Yk0 c1922Yk02 = (C1922Yk0) z412;
        c1922Yk02.getClass();
        this.s = new C1688Vk0(c1922Yk02, fi2);
        FI fi3 = new FI(this, 2);
        C1922Yk0 c1922Yk03 = (C1922Yk0) z412;
        c1922Yk03.getClass();
        new C1610Uk0(c1922Yk03, fi3);
        FI fi4 = new FI(this, 5);
        C1922Yk0 c1922Yk04 = (C1922Yk0) z412;
        c1922Yk04.getClass();
        this.t = new C1688Vk0(c1922Yk04, fi4);
        FI fi5 = new FI(this, 6);
        C1922Yk0 c1922Yk05 = (C1922Yk0) z412;
        c1922Yk05.getClass();
        this.u = new C1610Uk0(c1922Yk05, fi5);
        HI hi = cd instanceof HI ? (HI) cd : null;
        this.v = new PF0(te0, (InterfaceC1637Ut0) c1666VdB.d, (C5826m71) c1666VdB.b, w21, hi != null ? hi.v : null);
        this.w = !ZV.c.c(te0.d).booleanValue() ? S20.b : new C0941Lv0(z412, new FI(this, 1));
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return ZV.l.c(this.e.d).booleanValue();
    }

    public final X01 B(C1559Tt0 c1559Tt0) {
        Iterator it = u().e(c1559Tt0, EnumC8453zv0.g).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((CE0) next).t0() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        CE0 ce0 = (CE0) obj;
        return (X01) (ce0 != null ? ce0.getType() : null);
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection J() {
        return (Collection) this.t.invoke();
    }

    @Override // defpackage.InterfaceC7492us
    public final AbstractC1134Oh1 J0() {
        return (AbstractC1134Oh1) this.u.invoke();
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean K() {
        return ZV.k.c(this.e.d).booleanValue() && this.f.a(1, 4, 2);
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return ZV.j.c(this.e.d).booleanValue();
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return ZV.g.c(this.e.d).booleanValue();
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.D, defpackage.InterfaceC7492us
    public final List S0() {
        C1666Vd c1666Vd = this.l;
        C5826m71 c5826m71 = (C5826m71) c1666Vd.b;
        TE0 te0 = this.e;
        O90.f(te0, "<this>");
        O90.f(c5826m71, "typeTable");
        List list = te0.m;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = te0.n;
            O90.e(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(AbstractC8449zu.k(list3));
            for (Integer num : list3) {
                O90.c(num);
                arrayList.add(c5826m71.h(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C6887rh0(a1(), new C0716Iy(this, ((C1902Yd1) c1666Vd.h).g((AF0) it.next()), (C1559Tt0) null), S20.b));
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6729qs V() {
        return (C6729qs) this.r.invoke();
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 W() {
        return this.m;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean X0() {
        return ZV.h.c(this.e.d).booleanValue();
    }

    @Override // defpackage.ED
    public final W21 e() {
        return this.g;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        return this.i;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        return (Collection) this.s.invoke();
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        return this.w;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        return this.j;
    }

    @Override // defpackage.CD
    public final CD i() {
        return this.q;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return ZV.i.c(this.e.d).booleanValue();
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        if (ZV.k.c(this.e.d).booleanValue()) {
            AbstractC7268th abstractC7268th = this.f;
            int i = abstractC7268th.b;
            if (i < 1) {
                return true;
            }
            if (i <= 1) {
                int i2 = abstractC7268th.c;
                if (i2 < 4) {
                    return true;
                }
                if (i2 <= 4 && abstractC7268th.d <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        return this.k;
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        KV0 kv0 = this.o;
        AbstractC7384uI.j(kv0.a);
        return (InterfaceC5578kq0) WS1.b(kv0.c, KV0.e[0]);
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        return ((C1902Yd1) this.l.h).b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(M() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final EI u() {
        ((C7883wv0) ((C7955xI) this.l.c).q).getClass();
        KV0 kv0 = this.o;
        AbstractC7384uI.j(kv0.a);
        return (EI) ((InterfaceC5578kq0) WS1.b(kv0.c, KV0.e[0]));
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        return this.n;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return ZV.f.c(this.e.d) == SE0.COMPANION_OBJECT;
    }
}
