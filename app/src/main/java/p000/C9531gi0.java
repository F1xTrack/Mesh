package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: gi0 */
/* loaded from: classes2.dex */
public final class C9531gi0 extends AbstractC11725xs0 {

    /* renamed from: a */
    public final AbstractC11725xs0 f27941a;

    /* renamed from: b */
    public final C11571we1 f27942b;

    /* renamed from: c */
    public C11571we1 f27943c;

    /* renamed from: d */
    public ArrayList f27944d;

    /* renamed from: e */
    public ArrayList f27945e;

    /* renamed from: f */
    public C0496Hs f27946f;

    public C9531gi0(AbstractC11725xs0 abstractC11725xs0, C11571we1 c11571we1) {
        this.f27941a = abstractC11725xs0;
        this.f27942b = c11571we1;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005b  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m18602r(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9531gi0.m18602r(int):void");
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: A */
    public final boolean mo1427A() {
        return this.f27941a.mo1427A();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: I0 */
    public final InterfaceC10059kq0 mo1486I0() {
        InterfaceC10059kq0 interfaceC10059kq0Mo1486I0 = this.f27941a.mo1486I0();
        if (interfaceC10059kq0Mo1486I0 != null) {
            return interfaceC10059kq0Mo1486I0;
        }
        m18602r(28);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J */
    public final Collection mo1428J() {
        Collection collectionMo1428J = this.f27941a.mo1428J();
        if (collectionMo1428J != null) {
            return collectionMo1428J;
        }
        m18602r(31);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: J0 */
    public final AbstractC8057Oh1 mo1429J0() {
        AbstractC8057Oh1 abstractC8057Oh1Mo1429J0 = this.f27941a.mo1429J0();
        if (abstractC8057Oh1Mo1429J0 == null) {
            return null;
        }
        boolean z = abstractC8057Oh1Mo1429J0 instanceof C11123t80;
        C11571we1 c11571we1 = this.f27942b;
        if (z) {
            C11123t80 c11123t80 = (C11123t80) abstractC8057Oh1Mo1429J0;
            X01 x01 = (X01) c11123t80.f42882b;
            if (x01 != null && !c11571we1.f45011a.mo7050e()) {
                x01 = (X01) m18603t().m25667i(x01, EnumC9532gi1.f27947c);
            }
            return new C11123t80(c11123t80.f42881a, x01);
        }
        if (!(abstractC8057Oh1Mo1429J0 instanceof C9681ht0)) {
            throw new C6838sg();
        }
        ArrayList<Pair> arrayList = ((C9681ht0) abstractC8057Oh1Mo1429J0).f28648a;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        for (Pair pair : arrayList) {
            C8340Tt0 c8340Tt0 = (C8340Tt0) pair.f36702a;
            X01 x012 = (X01) ((Z01) pair.f36703b);
            if (x012 != null && !c11571we1.f45011a.mo7050e()) {
                x012 = (X01) m18603t().m25667i(x012, EnumC9532gi1.f27947c);
            }
            arrayList2.add(new Pair(c8340Tt0, x012));
        }
        return new C9681ht0(arrayList2);
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: K */
    public final boolean mo1430K() {
        return this.f27941a.mo1430K();
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: M */
    public final boolean mo111M() {
        return this.f27941a.mo111M();
    }

    @Override // p000.InterfaceC0936Os
    /* renamed from: N */
    public final boolean mo1431N() {
        return this.f27941a.mo1431N();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: O0 */
    public final InterfaceC10059kq0 mo1487O0() {
        AbstractC6940uI.m25156i(AbstractC6814sI.m24692d(this.f27941a));
        return mo1437n(C8054Og0.f8561a);
    }

    @Override // p000.InterfaceC8902bq0
    /* renamed from: Q0 */
    public final boolean mo112Q0() {
        return this.f27941a.mo112Q0();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: S0 */
    public final List mo1488S0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18602r(17);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: V */
    public final C6707qs mo1432V() {
        return this.f27941a.mo1432V();
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: W */
    public final InterfaceC10059kq0 mo1433W() {
        InterfaceC10059kq0 interfaceC10059kq0Mo1433W = this.f27941a.mo1433W();
        if (interfaceC10059kq0Mo1433W != null) {
            return interfaceC10059kq0Mo1433W;
        }
        m18602r(15);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: X0 */
    public final boolean mo1434X0() {
        return this.f27941a.mo1434X0();
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2854q(this, obj);
    }

    @Override // p000.AbstractC11725xs0, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC6976us mo2089x1() {
        InterfaceC6976us interfaceC6976usMo2089x1 = this.f27941a.mo2089x1();
        if (interfaceC6976usMo2089x1 != null) {
            return interfaceC6976usMo2089x1;
        }
        m18602r(21);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: a1 */
    public final C10937rh0 mo1489a1() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.R51
    /* renamed from: b */
    public final InterfaceC0266ED mo114b(C11571we1 c11571we1) {
        if (c11571we1 != null) {
            return c11571we1.f45011a.mo7050e() ? this : new C9531gi0(this, C11571we1.m25663e(c11571we1.m25665f(), m18603t().m25665f()));
        }
        m18602r(23);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: c0 */
    public final InterfaceC10059kq0 mo1490c0(AbstractC11316ue1 abstractC11316ue1) {
        AbstractC6940uI.m25156i(AbstractC6814sI.m24692d(this));
        return mo1491k(abstractC11316ue1, C8054Og0.f8561a);
    }

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return W21.f12940O0;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC8902bq0
    /* renamed from: f */
    public final EnumC10575os0 mo115f() {
        EnumC10575os0 enumC10575os0Mo115f = this.f27941a.mo115f();
        if (enumC10575os0Mo115f != null) {
            return enumC10575os0Mo115f;
        }
        m18602r(26);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: g */
    public final Collection mo1435g() {
        Collection<C6707qs> collectionMo1435g = this.f27941a.mo1435g();
        ArrayList arrayList = new ArrayList(collectionMo1435g.size());
        for (C6707qs c6707qs : collectionMo1435g) {
            C6707qs c6707qs2 = c6707qs;
            c6707qs2.getClass();
            C0099BZ c0099bzM1216E1 = c6707qs2.m1216E1(C11571we1.f45010b);
            c0099bzM1216E1.f884e = c6707qs.mo2089x1();
            c0099bzM1216E1.mo770y(c6707qs2.mo115f());
            c0099bzM1216E1.mo768w(c6707qs2.getVisibility());
            c0099bzM1216E1.mo761o(c6707qs2.mo116l());
            c0099bzM1216E1.f892m = false;
            arrayList.add(((C6707qs) c0099bzM1216E1.f903x.mo1214B1(c0099bzM1216E1)).mo114b(m18603t()));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC6595p5
    public final InterfaceC0510I5 getAnnotations() {
        InterfaceC0510I5 annotations = this.f27941a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m18602r(19);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    public final C8340Tt0 getName() {
        C8340Tt0 name = this.f27941a.getName();
        if (name != null) {
            return name;
        }
        m18602r(20);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI visibility = this.f27941a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m18602r(27);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        InterfaceC0140CD interfaceC0140CDMo423i = this.f27941a.mo423i();
        if (interfaceC0140CDMo423i != null) {
            return interfaceC0140CDMo423i;
        }
        m18602r(22);
        throw null;
    }

    @Override // p000.InterfaceC8902bq0
    public final boolean isExternal() {
        return this.f27941a.isExternal();
    }

    @Override // p000.InterfaceC6976us
    public final boolean isInline() {
        return this.f27941a.isInline();
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: k */
    public final InterfaceC10059kq0 mo1491k(AbstractC11316ue1 abstractC11316ue1, C8054Og0 c8054Og0) {
        InterfaceC10059kq0 interfaceC10059kq0Mo1491k = this.f27941a.mo1491k(abstractC11316ue1, c8054Og0);
        if (!this.f27942b.f45011a.mo7050e()) {
            return new T51(interfaceC10059kq0Mo1491k, m18603t());
        }
        if (interfaceC10059kq0Mo1491k != null) {
            return interfaceC10059kq0Mo1491k;
        }
        m18602r(7);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: l */
    public final EnumC0118Bs mo1436l() {
        EnumC0118Bs enumC0118BsMo1436l = this.f27941a.mo1436l();
        if (enumC0118BsMo1436l != null) {
            return enumC0118BsMo1436l;
        }
        m18602r(25);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0873Ns
    /* renamed from: m */
    public final X01 mo1492m() {
        C7789Jd1 c7789Jd1M1005J0;
        List listM786d = AbstractC7375Be1.m786d(mo1439v().getParameters());
        InterfaceC0510I5 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C7789Jd1.f5652b.getClass();
            c7789Jd1M1005J0 = C7789Jd1.f5653c;
        } else {
            CC0 cc0 = C7789Jd1.f5652b;
            List listM26274e = AbstractC7230yu.m26274e(new C0699L5(annotations));
            cc0.getClass();
            c7789Jd1M1005J0 = CC0.m1005J0(listM26274e);
        }
        return NV1.m5727B(mo1487O0(), c7789Jd1M1005J0, mo1439v(), listM786d, false);
    }

    @Override // p000.AbstractC11725xs0
    /* renamed from: n */
    public final InterfaceC10059kq0 mo1437n(C8054Og0 c8054Og0) {
        InterfaceC10059kq0 interfaceC10059kq0Mo1437n = this.f27941a.mo1437n(c8054Og0);
        if (!this.f27942b.f45011a.mo7050e()) {
            return new T51(interfaceC10059kq0Mo1437n, m18603t());
        }
        if (interfaceC10059kq0Mo1437n != null) {
            return interfaceC10059kq0Mo1437n;
        }
        m18602r(14);
        throw null;
    }

    @Override // p000.InterfaceC6976us, p000.InterfaceC0936Os
    /* renamed from: o */
    public final List mo1438o() {
        m18603t();
        ArrayList arrayList = this.f27945e;
        if (arrayList != null) {
            return arrayList;
        }
        m18602r(30);
        throw null;
    }

    /* renamed from: t */
    public final C11571we1 m18603t() {
        if (this.f27943c == null) {
            C11571we1 c11571we1 = this.f27942b;
            if (c11571we1.f45011a.mo7050e()) {
                this.f27943c = c11571we1;
            } else {
                List parameters = this.f27941a.mo1439v().getParameters();
                this.f27944d = new ArrayList(parameters.size());
                this.f27943c = HZ1.m3511g(parameters, c11571we1.m25665f(), this, this.f27944d);
                ArrayList arrayList = this.f27944d;
                O90.m5968f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC10292me1) obj).mo22919v0()) {
                        arrayList2.add(obj);
                    }
                }
                this.f27945e = arrayList2;
            }
        }
        return this.f27943c;
    }

    @Override // p000.InterfaceC0873Ns
    /* renamed from: v */
    public final InterfaceC8101Pd1 mo1439v() {
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = this.f27941a.mo1439v();
        if (this.f27942b.f45011a.mo7050e()) {
            if (interfaceC8101Pd1Mo1439v != null) {
                return interfaceC8101Pd1Mo1439v;
            }
            m18602r(0);
            throw null;
        }
        if (this.f27946f == null) {
            C11571we1 c11571we1M18603t = m18603t();
            Collection collectionMo5276b = interfaceC8101Pd1Mo1439v.mo5276b();
            ArrayList arrayList = new ArrayList(collectionMo5276b.size());
            Iterator it = collectionMo5276b.iterator();
            while (it.hasNext()) {
                arrayList.add(c11571we1M18603t.m25667i((AbstractC7742Ig0) it.next(), EnumC9532gi1.f27947c));
            }
            this.f27946f = new C0496Hs(this, this.f27944d, arrayList, C8582Yk0.f14497e);
        }
        C0496Hs c0496Hs = this.f27946f;
        if (c0496Hs != null) {
            return c0496Hs;
        }
        m18602r(1);
        throw null;
    }

    @Override // p000.InterfaceC6976us
    /* renamed from: w */
    public final boolean mo1440w() {
        return this.f27941a.mo1440w();
    }
}
