package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* renamed from: FI */
/* loaded from: classes2.dex */
public final class C0334FI extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f3145e;

    /* renamed from: f */
    public final /* synthetic */ C0460HI f3146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334FI(C0460HI c0460hi, int i) {
        super(0);
        this.f3145e = i;
        this.f3146f = c0460hi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Object next;
        C7003vI c7003vI;
        Object c11123t80;
        Z01 z01;
        ?? arrayList;
        C0460HI c0460hi = this.f3146f;
        switch (this.f3145e) {
            case 0:
                return AbstractC11306uZ1.m25209b(c0460hi);
            case 1:
                return AbstractC7167xu.m25982b0(((C7129xI) c0460hi.f4211l.f12662c).f45522e.mo48j(c0460hi.f4221v));
            case 2:
                TE0 te0 = c0460hi.f4204e;
                if (!((te0.f11230c & 4) == 4)) {
                    return null;
                }
                InterfaceC0873Ns interfaceC0873NsMo1770c = c0460hi.m3343u().mo1770c(CB1.m1002b((InterfaceC8392Ut0) c0460hi.f4211l.f12663d, te0.f11233f), EnumC11985zv0.f47100g);
                if (interfaceC0873NsMo1770c instanceof InterfaceC6976us) {
                    return (InterfaceC6976us) interfaceC0873NsMo1770c;
                }
                return null;
            case 3:
                List list = c0460hi.f4204e.f11243p;
                O90.m5967e(list, "getConstructorList(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC1605ZV.f14938n.m8799c(((VE0) obj).f12454d).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1361Vd c1361Vd = c0460hi.f4211l;
                    if (!zHasNext) {
                        return AbstractC7167xu.m25968N(AbstractC7167xu.m25968N(arrayList3, AbstractC7230yu.m26276g(c0460hi.mo1432V())), ((C7129xI) c1361Vd.f12662c).f45531n.mo7647j(c0460hi));
                    }
                    VE0 ve0 = (VE0) it.next();
                    C9547gq0 c9547gq0 = (C9547gq0) c1361Vd.f12668i;
                    O90.m5965c(ve0);
                    arrayList3.add(c9547gq0.m18665d(ve0, false));
                }
            case 4:
                C0460HI c0460hi2 = this.f3146f;
                if (!c0460hi2.f4210k.m893a()) {
                    List list2 = c0460hi2.f4204e.f11243p;
                    O90.m5967e(list2, "getConstructorList(...)");
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!AbstractC1605ZV.f14938n.m8799c(((VE0) next).f12454d).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    VE0 ve02 = (VE0) next;
                    return ve02 != null ? ((C9547gq0) c0460hi2.f4211l.f12668i).m18665d(ve02, true) : null;
                }
                C3919dI c3919dI = new C3919dI(c0460hi2, null, S20.f10539b, true, 1, W21.f12940O0);
                List listEmptyList = Collections.emptyList();
                int i = AbstractC6814sI.f42360a;
                EnumC0118Bs enumC0118Bs = EnumC0118Bs.f1062c;
                EnumC0118Bs enumC0118Bs2 = c0460hi2.f4210k;
                if (enumC0118Bs2 == enumC0118Bs || enumC0118Bs2.m893a()) {
                    c7003vI = AbstractC7066wI.f44760a;
                    if (c7003vI == null) {
                        AbstractC6814sI.m24689a(49);
                        throw null;
                    }
                } else if (AbstractC6814sI.m24705q(c0460hi2)) {
                    c7003vI = AbstractC7066wI.f44760a;
                    if (c7003vI == null) {
                        AbstractC6814sI.m24689a(51);
                        throw null;
                    }
                } else if (AbstractC6814sI.m24699k(c0460hi2)) {
                    c7003vI = AbstractC7066wI.f44769j;
                    if (c7003vI == null) {
                        AbstractC6814sI.m24689a(52);
                        throw null;
                    }
                } else {
                    c7003vI = AbstractC7066wI.f44764e;
                    if (c7003vI == null) {
                        AbstractC6814sI.m24689a(53);
                        throw null;
                    }
                }
                c3919dI.m24075M1(listEmptyList, c7003vI);
                c3919dI.f1432h = c0460hi2.mo1492m();
                return c3919dI;
            case 5:
                c0460hi.getClass();
                EnumC10575os0 enumC10575os0 = EnumC10575os0.f39324c;
                C0779MN c0779mn = C0779MN.f7117a;
                EnumC10575os0 enumC10575os02 = c0460hi.f4208i;
                if (enumC10575os02 != enumC10575os0) {
                    return c0779mn;
                }
                List<Integer> list3 = c0460hi.f4204e.f11248u;
                O90.m5965c(list3);
                if (list3.isEmpty()) {
                    if (enumC10575os02 != enumC10575os0) {
                        return c0779mn;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    InterfaceC0140CD interfaceC0140CD = c0460hi.f4216q;
                    if (interfaceC0140CD instanceof InterfaceC11993zz0) {
                        WS1.m8762a(c0460hi, linkedHashSet, ((InterfaceC11993zz0) interfaceC0140CD).mo2748d0(), false);
                    }
                    WS1.m8762a(c0460hi, linkedHashSet, c0460hi.mo1486I0(), true);
                    return AbstractC7167xu.m25977W(linkedHashSet, new C8774aq0(6));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Integer num : list3) {
                    C1361Vd c1361Vd2 = c0460hi.f4211l;
                    C7129xI c7129xI = (C7129xI) c1361Vd2.f12662c;
                    O90.m5965c(num);
                    InterfaceC6976us interfaceC6976usM25826b = c7129xI.m25826b(CB1.m1001a((InterfaceC8392Ut0) c1361Vd2.f12663d, num.intValue()));
                    if (interfaceC6976usM25826b != null) {
                        arrayList4.add(interfaceC6976usM25826b);
                    }
                }
                return arrayList4;
            default:
                if (!c0460hi.isInline() && !c0460hi.mo1430K()) {
                    return null;
                }
                C1361Vd c1361Vd3 = c0460hi.f4211l;
                InterfaceC8392Ut0 interfaceC8392Ut0 = (InterfaceC8392Ut0) c1361Vd3.f12663d;
                C1367Vj c1367Vj = new C1367Vj(1, (C8569Yd1) c1361Vd3.f12667h, 1);
                C1367Vj c1367Vj2 = new C1367Vj(1, c0460hi, 2);
                TE0 te02 = c0460hi.f4204e;
                O90.m5968f(te02, "<this>");
                O90.m5968f(interfaceC8392Ut0, "nameResolver");
                C10226m71 c10226m71 = (C10226m71) c1361Vd3.f12661b;
                O90.m5968f(c10226m71, "typeTable");
                if (te02.f11253z.size() > 0) {
                    List list4 = te02.f11253z;
                    O90.m5967e(list4, "getMultiFieldValueClassUnderlyingNameList(...)");
                    List<Integer> list5 = list4;
                    ArrayList arrayList5 = new ArrayList(AbstractC7293zu.m26586k(list5));
                    for (Integer num2 : list5) {
                        O90.m5965c(num2);
                        arrayList5.add(CB1.m1002b(interfaceC8392Ut0, num2.intValue()));
                    }
                    Pair pair = new Pair(Integer.valueOf(te02.f11222C.size()), Integer.valueOf(te02.f11221B.size()));
                    if (pair.equals(new Pair(Integer.valueOf(arrayList5.size()), 0))) {
                        List list6 = te02.f11222C;
                        O90.m5967e(list6, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                        List<Integer> list7 = list6;
                        arrayList = new ArrayList(AbstractC7293zu.m26586k(list7));
                        for (Integer num3 : list7) {
                            O90.m5965c(num3);
                            arrayList.add(c10226m71.m22681h(num3.intValue()));
                        }
                    } else {
                        if (!pair.equals(new Pair(0, Integer.valueOf(arrayList5.size())))) {
                            throw new IllegalStateException(("class " + CB1.m1002b(interfaceC8392Ut0, te02.f11232e) + " has illegal multi-field value class representation").toString());
                        }
                        arrayList = te02.f11221B;
                    }
                    O90.m5965c(arrayList);
                    Iterable iterable = (Iterable) arrayList;
                    ArrayList arrayList6 = new ArrayList(AbstractC7293zu.m26586k(iterable));
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(c1367Vj.invoke(it3.next()));
                    }
                    c11123t80 = new C9681ht0(AbstractC7167xu.m25989i0(arrayList5, arrayList6));
                } else if ((te02.f11230c & 8) == 8) {
                    C8340Tt0 c8340Tt0M1002b = CB1.m1002b(interfaceC8392Ut0, te02.f11250w);
                    int i2 = te02.f11230c;
                    AF0 af0M22681h = (i2 & 16) == 16 ? te02.f11251x : (i2 & 32) == 32 ? c10226m71.m22681h(te02.f11252y) : null;
                    if ((af0M22681h == null || (z01 = (Z01) c1367Vj.invoke(af0M22681h)) == null) && (z01 = (Z01) c1367Vj2.invoke(c8340Tt0M1002b)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + CB1.m1002b(interfaceC8392Ut0, te02.f11232e) + " with property " + c8340Tt0M1002b).toString());
                    }
                    c11123t80 = new C11123t80(c8340Tt0M1002b, z01);
                } else {
                    c11123t80 = null;
                }
                if (c11123t80 != null) {
                    return c11123t80;
                }
                if (c0460hi.f4205f.m24967a(1, 5, 1)) {
                    return null;
                }
                C6707qs c6707qsMo1432V = c0460hi.mo1432V();
                if (c6707qsMo1432V == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + c0460hi).toString());
                }
                List listMo1221f0 = c6707qsMo1432V.mo1221f0();
                O90.m5967e(listMo1221f0, "getValueParameters(...)");
                C8340Tt0 name = ((C8473Wh1) AbstractC7167xu.m25955A(listMo1221f0)).getName();
                O90.m5967e(name, "getName(...)");
                X01 x01M3342B = c0460hi.m3342B(name);
                if (x01M3342B != null) {
                    return new C11123t80(name, x01M3342B);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + c0460hi).toString());
        }
    }
}
