package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class FI extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ HI f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FI(HI hi, int i) {
        super(0);
        this.e = i;
        this.f = hi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Object next;
        C7575vI c7575vI;
        Object c7164t80;
        Z01 z01;
        ?? arrayList;
        HI hi = this.f;
        switch (this.e) {
            case 0:
                return AbstractC7437uZ1.b(hi);
            case 1:
                return AbstractC8069xu.b0(((C7955xI) hi.l.c).e.j(hi.v));
            case 2:
                TE0 te0 = hi.e;
                if (!((te0.c & 4) == 4)) {
                    return null;
                }
                InterfaceC1087Ns interfaceC1087NsC = hi.u().c(CB1.b((InterfaceC1637Ut0) hi.l.d, te0.f), EnumC8453zv0.g);
                if (interfaceC1087NsC instanceof InterfaceC7492us) {
                    return (InterfaceC7492us) interfaceC1087NsC;
                }
                return null;
            case 3:
                List list = hi.e.p;
                O90.e(list, "getConstructorList(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (ZV.n.c(((VE0) obj).d).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList2));
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1666Vd c1666Vd = hi.l;
                    if (!zHasNext) {
                        return AbstractC8069xu.N(AbstractC8069xu.N(arrayList3, AbstractC8259yu.g(hi.V())), ((C7955xI) c1666Vd.c).n.j(hi));
                    }
                    VE0 ve0 = (VE0) it.next();
                    C4038gq0 c4038gq0 = (C4038gq0) c1666Vd.i;
                    O90.c(ve0);
                    arrayList3.add(c4038gq0.d(ve0, false));
                }
            case 4:
                HI hi2 = this.f;
                if (!hi2.k.a()) {
                    List list2 = hi2.e.p;
                    O90.e(list2, "getConstructorList(...)");
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!ZV.n.c(((VE0) next).d).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    VE0 ve02 = (VE0) next;
                    return ve02 != null ? ((C4038gq0) hi2.l.i).d(ve02, true) : null;
                }
                C3363dI c3363dI = new C3363dI(hi2, null, S20.b, true, 1, W21.O0);
                List listEmptyList = Collections.emptyList();
                int i = AbstractC7002sI.a;
                EnumC0152Bs enumC0152Bs = EnumC0152Bs.c;
                EnumC0152Bs enumC0152Bs2 = hi2.k;
                if (enumC0152Bs2 == enumC0152Bs || enumC0152Bs2.a()) {
                    c7575vI = AbstractC7765wI.a;
                    if (c7575vI == null) {
                        AbstractC7002sI.a(49);
                        throw null;
                    }
                } else if (AbstractC7002sI.q(hi2)) {
                    c7575vI = AbstractC7765wI.a;
                    if (c7575vI == null) {
                        AbstractC7002sI.a(51);
                        throw null;
                    }
                } else if (AbstractC7002sI.k(hi2)) {
                    c7575vI = AbstractC7765wI.j;
                    if (c7575vI == null) {
                        AbstractC7002sI.a(52);
                        throw null;
                    }
                } else {
                    c7575vI = AbstractC7765wI.e;
                    if (c7575vI == null) {
                        AbstractC7002sI.a(53);
                        throw null;
                    }
                }
                c3363dI.M1(listEmptyList, c7575vI);
                c3363dI.h = hi2.m();
                return c3363dI;
            case 5:
                hi.getClass();
                EnumC6348os0 enumC6348os0 = EnumC6348os0.c;
                MN mn = MN.a;
                EnumC6348os0 enumC6348os02 = hi.i;
                if (enumC6348os02 != enumC6348os0) {
                    return mn;
                }
                List<Integer> list3 = hi.e.u;
                O90.c(list3);
                if (list3.isEmpty()) {
                    if (enumC6348os02 != enumC6348os0) {
                        return mn;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    CD cd = hi.q;
                    if (cd instanceof InterfaceC8465zz0) {
                        WS1.a(hi, linkedHashSet, ((InterfaceC8465zz0) cd).d0(), false);
                    }
                    WS1.a(hi, linkedHashSet, hi.I0(), true);
                    return AbstractC8069xu.W(linkedHashSet, new C2209aq0(6));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Integer num : list3) {
                    C1666Vd c1666Vd2 = hi.l;
                    C7955xI c7955xI = (C7955xI) c1666Vd2.c;
                    O90.c(num);
                    InterfaceC7492us interfaceC7492usB = c7955xI.b(CB1.a((InterfaceC1637Ut0) c1666Vd2.d, num.intValue()));
                    if (interfaceC7492usB != null) {
                        arrayList4.add(interfaceC7492usB);
                    }
                }
                return arrayList4;
            default:
                if (!hi.isInline() && !hi.K()) {
                    return null;
                }
                C1666Vd c1666Vd3 = hi.l;
                InterfaceC1637Ut0 interfaceC1637Ut0 = (InterfaceC1637Ut0) c1666Vd3.d;
                C1684Vj c1684Vj = new C1684Vj(1, (C1902Yd1) c1666Vd3.h, 1);
                C1684Vj c1684Vj2 = new C1684Vj(1, hi, 2);
                TE0 te02 = hi.e;
                O90.f(te02, "<this>");
                O90.f(interfaceC1637Ut0, "nameResolver");
                C5826m71 c5826m71 = (C5826m71) c1666Vd3.b;
                O90.f(c5826m71, "typeTable");
                if (te02.z.size() > 0) {
                    List list4 = te02.z;
                    O90.e(list4, "getMultiFieldValueClassUnderlyingNameList(...)");
                    List<Integer> list5 = list4;
                    ArrayList arrayList5 = new ArrayList(AbstractC8449zu.k(list5));
                    for (Integer num2 : list5) {
                        O90.c(num2);
                        arrayList5.add(CB1.b(interfaceC1637Ut0, num2.intValue()));
                    }
                    Pair pair = new Pair(Integer.valueOf(te02.C.size()), Integer.valueOf(te02.B.size()));
                    if (pair.equals(new Pair(Integer.valueOf(arrayList5.size()), 0))) {
                        List list6 = te02.C;
                        O90.e(list6, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                        List<Integer> list7 = list6;
                        arrayList = new ArrayList(AbstractC8449zu.k(list7));
                        for (Integer num3 : list7) {
                            O90.c(num3);
                            arrayList.add(c5826m71.h(num3.intValue()));
                        }
                    } else {
                        if (!pair.equals(new Pair(0, Integer.valueOf(arrayList5.size())))) {
                            throw new IllegalStateException(("class " + CB1.b(interfaceC1637Ut0, te02.e) + " has illegal multi-field value class representation").toString());
                        }
                        arrayList = te02.B;
                    }
                    O90.c(arrayList);
                    Iterable iterable = (Iterable) arrayList;
                    ArrayList arrayList6 = new ArrayList(AbstractC8449zu.k(iterable));
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(c1684Vj.invoke(it3.next()));
                    }
                    c7164t80 = new C4238ht0(AbstractC8069xu.i0(arrayList5, arrayList6));
                } else if ((te02.c & 8) == 8) {
                    C1559Tt0 c1559Tt0B = CB1.b(interfaceC1637Ut0, te02.w);
                    int i2 = te02.c;
                    AF0 af0H = (i2 & 16) == 16 ? te02.x : (i2 & 32) == 32 ? c5826m71.h(te02.y) : null;
                    if ((af0H == null || (z01 = (Z01) c1684Vj.invoke(af0H)) == null) && (z01 = (Z01) c1684Vj2.invoke(c1559Tt0B)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + CB1.b(interfaceC1637Ut0, te02.e) + " with property " + c1559Tt0B).toString());
                    }
                    c7164t80 = new C7164t80(c1559Tt0B, z01);
                } else {
                    c7164t80 = null;
                }
                if (c7164t80 != null) {
                    return c7164t80;
                }
                if (hi.f.a(1, 5, 1)) {
                    return null;
                }
                C6729qs c6729qsV = hi.V();
                if (c6729qsV == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + hi).toString());
                }
                List listF0 = c6729qsV.f0();
                O90.e(listF0, "getValueParameters(...)");
                C1559Tt0 name = ((C1758Wh1) AbstractC8069xu.A(listF0)).getName();
                O90.e(name, "getName(...)");
                X01 x01B = hi.B(name);
                if (x01B != null) {
                    return new C7164t80(name, x01B);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + hi).toString());
        }
    }
}
