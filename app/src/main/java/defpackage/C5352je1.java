package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* renamed from: je1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5352je1 {
    public static final C5352je1 a = new C5352je1();

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        O90.e(it, "iterator(...)");
        while (it.hasNext()) {
            X01 x01 = (X01) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    X01 x012 = (X01) it2.next();
                    if (x012 != x01) {
                        O90.c(x012);
                        O90.c(x01);
                        if (((Boolean) function2.invoke(x012, x01)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [Jd1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [Jd1, N9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v16, types: [X01] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Ig0, X01, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Set] */
    public final X01 b(ArrayList arrayList) {
        X01 x01;
        X01 x01E;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X01 x012 = (X01) it.next();
            if (x012.E() instanceof M90) {
                Collection collectionB = x012.E().b();
                O90.e(collectionB, "getSupertypes(...)");
                Collection<AbstractC0663Ig0> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(collection));
                for (AbstractC0663Ig0 abstractC0663Ig0 : collection) {
                    O90.c(abstractC0663Ig0);
                    X01 x01J = AbstractC4075h12.j(abstractC0663Ig0);
                    if (x012.G()) {
                        x01J = x01J.P(true);
                    }
                    arrayList3.add(x01J);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(x012);
            }
        }
        EnumC4194he1 enumC4194he1A = EnumC4194he1.a;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            enumC4194he1A = enumC4194he1A.a((AbstractC1521Tg1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            X01 x01P = (X01) it3.next();
            if (enumC4194he1A == EnumC4194he1.d) {
                if (x01P instanceof C6357ov0) {
                    C6357ov0 c6357ov0 = (C6357ov0) x01P;
                    O90.f(c6357ov0, "<this>");
                    x01P = new C6357ov0(c6357ov0.b, c6357ov0.c, c6357ov0.d, c6357ov0.e, c6357ov0.f, true);
                }
                O90.f(x01P, "<this>");
                X01 x01B0 = C0240Cv0.B0(x01P, false);
                x01P = (x01B0 == null && (x01B0 = KS1.c(x01P)) == null) ? x01P.P(false) : x01B0;
            }
            linkedHashSet.add(x01P);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((X01) it4.next()).B());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            C0733Jd1 c0733Jd1 = (C0733Jd1) it5.next();
            next = (C0733Jd1) next;
            next.getClass();
            O90.f(c0733Jd1, "other");
            if (!next.isEmpty() || !c0733Jd1.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) C0733Jd1.b.b).values();
                O90.e(collectionValues, "<get-values>(...)");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    L5 l5 = (L5) next.a.get(iIntValue);
                    L5 l52 = (L5) c0733Jd1.a.get(iIntValue);
                    if (l5 != null) {
                        if (!O90.a(l52, l5)) {
                            l5 = null;
                        }
                        l52 = l5;
                    } else if (l52 == null || !O90.a(l5, l52)) {
                        l52 = null;
                    }
                    AbstractC3970gT1.a(arrayList5, l52);
                }
                next = CC0.J0(arrayList5);
            }
        }
        C0733Jd1 c0733Jd12 = (C0733Jd1) next;
        if (linkedHashSet.size() == 1) {
            x01E = (X01) AbstractC8069xu.Q(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new C4385ie1(2, this, 0));
            arrayListA.isEmpty();
            EnumC4291i90[] enumC4291i90Arr = EnumC4291i90.a;
            if (arrayListA.isEmpty()) {
                x01 = null;
            } else {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                X01 next2 = it7.next();
                while (it7.hasNext()) {
                    X01 x013 = (X01) it7.next();
                    next2 = next2;
                    if (next2 != 0 && x013 != null) {
                        InterfaceC1200Pd1 interfaceC1200Pd1E = next2.E();
                        InterfaceC1200Pd1 interfaceC1200Pd1E2 = x013.E();
                        boolean z = interfaceC1200Pd1E instanceof C5258j90;
                        if (z && (interfaceC1200Pd1E2 instanceof C5258j90)) {
                            Set set = ((C5258j90) interfaceC1200Pd1E).a;
                            Set set2 = ((C5258j90) interfaceC1200Pd1E2).a;
                            O90.f(set, "<this>");
                            O90.f(set2, "other");
                            Set setF0 = AbstractC8069xu.f0(set);
                            AbstractC0314Du.m(setF0, set2);
                            C5258j90 c5258j90 = new C5258j90(setF0);
                            C0733Jd1.b.getClass();
                            C0733Jd1 c0733Jd13 = C0733Jd1.c;
                            O90.f(c0733Jd13, "attributes");
                            next2 = NV1.B(C5496kP.a(EnumC3765fP.c, true, "unknown integer literal type"), c0733Jd13, c5258j90, MN.a, false);
                        } else if (z) {
                            if (!((C5258j90) interfaceC1200Pd1E).a.contains(x013)) {
                                x013 = null;
                            }
                            next2 = x013;
                        } else if (!(interfaceC1200Pd1E2 instanceof C5258j90) || !((C5258j90) interfaceC1200Pd1E2).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                x01 = next2;
            }
            if (x01 != null) {
                x01E = x01;
            } else {
                InterfaceC7693vv0.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new C4385ie1(2, C7502uv0.b, 1));
                arrayListA2.isEmpty();
                x01E = arrayListA2.size() < 2 ? (X01) AbstractC8069xu.Q(arrayListA2) : new M90(linkedHashSet).e();
            }
        }
        return x01E.T(c0733Jd12);
    }
}
