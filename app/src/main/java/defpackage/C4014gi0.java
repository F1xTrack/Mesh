package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: gi0 */
/* loaded from: classes2.dex */
public final class C4014gi0 extends AbstractC8064xs0 {
    public final AbstractC8064xs0 a;
    public final C7833we1 b;
    public C7833we1 c;
    public ArrayList d;
    public ArrayList e;
    public C0620Hs f;

    public C4014gi0(AbstractC8064xs0 abstractC8064xs0, C7833we1 c7833we1) {
        this.a = abstractC8064xs0;
        this.b = c7833we1;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void r(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4014gi0.r(int):void");
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 I0() {
        InterfaceC5578kq0 interfaceC5578kq0I0 = this.a.I0();
        if (interfaceC5578kq0I0 != null) {
            return interfaceC5578kq0I0;
        }
        r(28);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection J() {
        Collection collectionJ = this.a.J();
        if (collectionJ != null) {
            return collectionJ;
        }
        r(31);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final AbstractC1134Oh1 J0() {
        AbstractC1134Oh1 abstractC1134Oh1J0 = this.a.J0();
        if (abstractC1134Oh1J0 == null) {
            return null;
        }
        boolean z = abstractC1134Oh1J0 instanceof C7164t80;
        C7833we1 c7833we1 = this.b;
        if (z) {
            C7164t80 c7164t80 = (C7164t80) abstractC1134Oh1J0;
            X01 x01 = (X01) c7164t80.b;
            if (x01 != null && !c7833we1.a.e()) {
                x01 = (X01) t().i(x01, EnumC4015gi1.c);
            }
            return new C7164t80(c7164t80.a, x01);
        }
        if (!(abstractC1134Oh1J0 instanceof C4238ht0)) {
            throw new C7074sg();
        }
        ArrayList<Pair> arrayList = ((C4238ht0) abstractC1134Oh1J0).a;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        for (Pair pair : arrayList) {
            C1559Tt0 c1559Tt0 = (C1559Tt0) pair.a;
            X01 x012 = (X01) ((Z01) pair.b);
            if (x012 != null && !c7833we1.a.e()) {
                x012 = (X01) t().i(x012, EnumC4015gi1.c);
            }
            arrayList2.add(new Pair(c1559Tt0, x012));
        }
        return new C4238ht0(arrayList2);
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean K() {
        return this.a.K();
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return this.a.M();
    }

    @Override // defpackage.InterfaceC1165Os
    public final boolean N() {
        return this.a.N();
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 O0() {
        AbstractC7384uI.i(AbstractC7002sI.d(this.a));
        return n(C1130Og0.a);
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return this.a.Q0();
    }

    @Override // defpackage.InterfaceC7492us
    public final List S0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        r(17);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6729qs V() {
        return this.a.V();
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 W() {
        InterfaceC5578kq0 interfaceC5578kq0W = this.a.W();
        if (interfaceC5578kq0W != null) {
            return interfaceC5578kq0W;
        }
        r(15);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean X0() {
        return this.a.X0();
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.q(this, obj);
    }

    @Override // defpackage.AbstractC8064xs0, defpackage.CD
    /* renamed from: a */
    public final InterfaceC7492us x1() {
        InterfaceC7492us interfaceC7492usX1 = this.a.x1();
        if (interfaceC7492usX1 != null) {
            return interfaceC7492usX1;
        }
        r(21);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final C6887rh0 a1() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.R51
    public final ED b(C7833we1 c7833we1) {
        if (c7833we1 != null) {
            return c7833we1.a.e() ? this : new C4014gi0(this, C7833we1.e(c7833we1.f(), t().f()));
        }
        r(23);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final InterfaceC5578kq0 c0(AbstractC7452ue1 abstractC7452ue1) {
        AbstractC7384uI.i(AbstractC7002sI.d(this));
        return k(abstractC7452ue1, C1130Og0.a);
    }

    @Override // defpackage.ED
    public final W21 e() {
        return W21.O0;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        EnumC6348os0 enumC6348os0F = this.a.f();
        if (enumC6348os0F != null) {
            return enumC6348os0F;
        }
        r(26);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final Collection g() {
        Collection<C6729qs> collectionG = this.a.g();
        ArrayList arrayList = new ArrayList(collectionG.size());
        for (C6729qs c6729qs : collectionG) {
            C6729qs c6729qs2 = c6729qs;
            c6729qs2.getClass();
            BZ bzE1 = c6729qs2.E1(C7833we1.b);
            bzE1.e = c6729qs.x1();
            bzE1.y(c6729qs2.f());
            bzE1.w(c6729qs2.getVisibility());
            bzE1.o(c6729qs2.l());
            bzE1.m = false;
            arrayList.add(((C6729qs) bzE1.x.B1(bzE1)).b(t()));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC6391p5
    public final I5 getAnnotations() {
        I5 annotations = this.a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        r(19);
        throw null;
    }

    @Override // defpackage.CD
    public final C1559Tt0 getName() {
        C1559Tt0 name = this.a.getName();
        if (name != null) {
            return name;
        }
        r(20);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI visibility = this.a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        r(27);
        throw null;
    }

    @Override // defpackage.CD
    public final CD i() {
        CD cdI = this.a.i();
        if (cdI != null) {
            return cdI;
        }
        r(22);
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return this.a.isExternal();
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 k(AbstractC7452ue1 abstractC7452ue1, C1130Og0 c1130Og0) {
        InterfaceC5578kq0 interfaceC5578kq0K = this.a.k(abstractC7452ue1, c1130Og0);
        if (!this.b.a.e()) {
            return new T51(interfaceC5578kq0K, t());
        }
        if (interfaceC5578kq0K != null) {
            return interfaceC5578kq0K;
        }
        r(7);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final EnumC0152Bs l() {
        EnumC0152Bs enumC0152BsL = this.a.l();
        if (enumC0152BsL != null) {
            return enumC0152BsL;
        }
        r(25);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1087Ns
    public final X01 m() {
        C0733Jd1 c0733Jd1J0;
        List listD = AbstractC0112Be1.d(v().getParameters());
        I5 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C0733Jd1.b.getClass();
            c0733Jd1J0 = C0733Jd1.c;
        } else {
            CC0 cc0 = C0733Jd1.b;
            List listE = AbstractC8259yu.e(new L5(annotations));
            cc0.getClass();
            c0733Jd1J0 = CC0.J0(listE);
        }
        return NV1.B(O0(), c0733Jd1J0, v(), listD, false);
    }

    @Override // defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 n(C1130Og0 c1130Og0) {
        InterfaceC5578kq0 interfaceC5578kq0N = this.a.n(c1130Og0);
        if (!this.b.a.e()) {
            return new T51(interfaceC5578kq0N, t());
        }
        if (interfaceC5578kq0N != null) {
            return interfaceC5578kq0N;
        }
        r(14);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us, defpackage.InterfaceC1165Os
    public final List o() {
        t();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        r(30);
        throw null;
    }

    public final C7833we1 t() {
        if (this.c == null) {
            C7833we1 c7833we1 = this.b;
            if (c7833we1.a.e()) {
                this.c = c7833we1;
            } else {
                List parameters = this.a.v().getParameters();
                this.d = new ArrayList(parameters.size());
                this.c = HZ1.g(parameters, c7833we1.f(), this, this.d);
                ArrayList arrayList = this.d;
                O90.f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC5925me1) obj).v0()) {
                        arrayList2.add(obj);
                    }
                }
                this.e = arrayList2;
            }
        }
        return this.c;
    }

    @Override // defpackage.InterfaceC1087Ns
    public final InterfaceC1200Pd1 v() {
        InterfaceC1200Pd1 interfaceC1200Pd1V = this.a.v();
        if (this.b.a.e()) {
            if (interfaceC1200Pd1V != null) {
                return interfaceC1200Pd1V;
            }
            r(0);
            throw null;
        }
        if (this.f == null) {
            C7833we1 c7833we1T = t();
            Collection collectionB = interfaceC1200Pd1V.b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                arrayList.add(c7833we1T.i((AbstractC0663Ig0) it.next(), EnumC4015gi1.c));
            }
            this.f = new C0620Hs(this, this.d, arrayList, C1922Yk0.e);
        }
        C0620Hs c0620Hs = this.f;
        if (c0620Hs != null) {
            return c0620Hs;
        }
        r(1);
        throw null;
    }

    @Override // defpackage.InterfaceC7492us
    public final boolean w() {
        return this.a.w();
    }
}
