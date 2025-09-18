package p000;

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
public final class C9908je1 {

    /* renamed from: a */
    public static final C9908je1 f35304a = new C9908je1();

    /* renamed from: a */
    public static ArrayList m22084a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        O90.m5967e(it, "iterator(...)");
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
                        O90.m5965c(x012);
                        O90.m5965c(x01);
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
    /* renamed from: b */
    public final X01 m22085b(ArrayList arrayList) {
        X01 x01;
        X01 x01M5277e;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X01 x012 = (X01) it.next();
            if (x012.mo3797E() instanceof M90) {
                Collection collectionMo5276b = x012.mo3797E().mo5276b();
                O90.m5967e(collectionMo5276b, "getSupertypes(...)");
                Collection<AbstractC7742Ig0> collection = collectionMo5276b;
                ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(collection));
                for (AbstractC7742Ig0 abstractC7742Ig0 : collection) {
                    O90.m5965c(abstractC7742Ig0);
                    X01 x01M18698j = AbstractC9572h12.m18698j(abstractC7742Ig0);
                    if (x012.mo3798G()) {
                        x01M18698j = x01M18698j.mo250P(true);
                    }
                    arrayList3.add(x01M18698j);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(x012);
            }
        }
        EnumC9652he1 enumC9652he1Mo17724a = EnumC9652he1.f28496a;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            enumC9652he1Mo17724a = enumC9652he1Mo17724a.mo17724a((AbstractC8315Tg1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            X01 x01Mo250P = (X01) it3.next();
            if (enumC9652he1Mo17724a == EnumC9652he1.f28499d) {
                if (x01Mo250P instanceof C10581ov0) {
                    C10581ov0 c10581ov0 = (C10581ov0) x01Mo250P;
                    O90.m5968f(c10581ov0, "<this>");
                    x01Mo250P = new C10581ov0(c10581ov0.f39354b, c10581ov0.f39355c, c10581ov0.f39356d, c10581ov0.f39357e, c10581ov0.f39358f, true);
                }
                O90.m5968f(x01Mo250P, "<this>");
                X01 x01M1456B0 = C7460Cv0.m1456B0(x01Mo250P, false);
                x01Mo250P = (x01M1456B0 == null && (x01M1456B0 = KS1.m4647c(x01Mo250P)) == null) ? x01Mo250P.mo250P(false) : x01M1456B0;
            }
            linkedHashSet.add(x01Mo250P);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((X01) it4.next()).mo3796B());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            C7789Jd1 c7789Jd1 = (C7789Jd1) it5.next();
            next = (C7789Jd1) next;
            next.getClass();
            O90.m5968f(c7789Jd1, "other");
            if (!next.isEmpty() || !c7789Jd1.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) C7789Jd1.f5652b.f1250b).values();
                O90.m5967e(collectionValues, "<get-values>(...)");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    C0699L5 c0699l5 = (C0699L5) next.f7533a.get(iIntValue);
                    C0699L5 c0699l52 = (C0699L5) c7789Jd1.f7533a.get(iIntValue);
                    if (c0699l5 != null) {
                        if (!O90.m5963a(c0699l52, c0699l5)) {
                            c0699l5 = null;
                        }
                        c0699l52 = c0699l5;
                    } else if (c0699l52 == null || !O90.m5963a(c0699l5, c0699l52)) {
                        c0699l52 = null;
                    }
                    AbstractC9502gT1.m18571a(arrayList5, c0699l52);
                }
                next = CC0.m1005J0(arrayList5);
            }
        }
        C7789Jd1 c7789Jd12 = (C7789Jd1) next;
        if (linkedHashSet.size() == 1) {
            x01M5277e = (X01) AbstractC7167xu.m25971Q(linkedHashSet);
        } else {
            ArrayList arrayListM22084a = m22084a(linkedHashSet, new C9780ie1(2, this, 0));
            arrayListM22084a.isEmpty();
            EnumC9717i90[] enumC9717i90Arr = EnumC9717i90.f28840a;
            if (arrayListM22084a.isEmpty()) {
                x01 = null;
            } else {
                Iterator it7 = arrayListM22084a.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                X01 next2 = it7.next();
                while (it7.hasNext()) {
                    X01 x013 = (X01) it7.next();
                    next2 = next2;
                    if (next2 != 0 && x013 != null) {
                        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E = next2.mo3797E();
                        InterfaceC8101Pd1 interfaceC8101Pd1Mo3797E2 = x013.mo3797E();
                        boolean z = interfaceC8101Pd1Mo3797E instanceof C9845j90;
                        if (z && (interfaceC8101Pd1Mo3797E2 instanceof C9845j90)) {
                            Set set = ((C9845j90) interfaceC8101Pd1Mo3797E).f34944a;
                            Set set2 = ((C9845j90) interfaceC8101Pd1Mo3797E2).f34944a;
                            O90.m5968f(set, "<this>");
                            O90.m5968f(set2, "other");
                            Set setM25986f0 = AbstractC7167xu.m25986f0(set);
                            AbstractC0246Du.m1920m(setM25986f0, set2);
                            C9845j90 c9845j90 = new C9845j90(setM25986f0);
                            C7789Jd1.f5652b.getClass();
                            C7789Jd1 c7789Jd13 = C7789Jd1.f5653c;
                            O90.m5968f(c7789Jd13, "attributes");
                            next2 = NV1.m5727B(C6298kP.m22195a(EnumC4051fP.f27177c, true, "unknown integer literal type"), c7789Jd13, c9845j90, C0779MN.f7117a, false);
                        } else if (z) {
                            if (!((C9845j90) interfaceC8101Pd1Mo3797E).f34944a.contains(x013)) {
                                x013 = null;
                            }
                            next2 = x013;
                        } else if (!(interfaceC8101Pd1Mo3797E2 instanceof C9845j90) || !((C9845j90) interfaceC8101Pd1Mo3797E2).f34944a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                x01 = next2;
            }
            if (x01 != null) {
                x01M5277e = x01;
            } else {
                InterfaceC11477vv0.f44603b.getClass();
                ArrayList arrayListM22084a2 = m22084a(arrayListM22084a, new C9780ie1(2, C11349uv0.f44021b, 1));
                arrayListM22084a2.isEmpty();
                x01M5277e = arrayListM22084a2.size() < 2 ? (X01) AbstractC7167xu.m25971Q(arrayListM22084a2) : new M90(linkedHashSet).m5277e();
            }
        }
        return x01M5277e.mo252T(c7789Jd12);
    }
}
