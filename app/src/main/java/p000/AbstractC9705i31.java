package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: i31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9705i31 {

    /* renamed from: a */
    public static final ArrayList f28788a;

    /* renamed from: b */
    public static final ArrayList f28789b;

    /* renamed from: c */
    public static final Object f28790c;

    /* renamed from: d */
    public static final LinkedHashMap f28791d;

    /* renamed from: e */
    public static final Set f28792e;

    /* renamed from: f */
    public static final Set f28793f;

    /* renamed from: g */
    public static final C9193e31 f28794g;

    /* renamed from: h */
    public static final Object f28795h;

    /* renamed from: i */
    public static final LinkedHashMap f28796i;

    /* renamed from: j */
    public static final ArrayList f28797j;

    /* renamed from: k */
    public static final LinkedHashMap f28798k;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM4175F = AbstractC0576J8.m4175F(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(setM4175F));
        for (String str : setM4175F) {
            String strM24758c = EnumC11057sd0.BOOLEAN.m24758c();
            O90.m5967e(strM24758c, "getDesc(...)");
            arrayList.add(C7460Cv0.m1460k0("java/util/Collection", str, "Ljava/util/Collection;", strM24758c));
        }
        f28788a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C9193e31) it.next()).f26523e);
        }
        f28789b = arrayList2;
        ArrayList arrayList3 = f28788a;
        ArrayList arrayList4 = new ArrayList(AbstractC7293zu.m26586k(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C9193e31) it2.next()).f26520b.m7801b());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC11057sd0 enumC11057sd0 = EnumC11057sd0.BOOLEAN;
        String strM24758c2 = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c2, "getDesc(...)");
        C9193e31 c9193e31M1460k0 = C7460Cv0.m1460k0(strConcat, "contains", "Ljava/lang/Object;", strM24758c2);
        EnumC9577h31 enumC9577h31 = EnumC9577h31.f28207d;
        Pair pair = new Pair(c9193e31M1460k0, enumC9577h31);
        String strConcat2 = "java/util/".concat("Collection");
        String strM24758c3 = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c3, "getDesc(...)");
        Pair pair2 = new Pair(C7460Cv0.m1460k0(strConcat2, "remove", "Ljava/lang/Object;", strM24758c3), enumC9577h31);
        String strConcat3 = "java/util/".concat("Map");
        String strM24758c4 = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c4, "getDesc(...)");
        Pair pair3 = new Pair(C7460Cv0.m1460k0(strConcat3, "containsKey", "Ljava/lang/Object;", strM24758c4), enumC9577h31);
        String strConcat4 = "java/util/".concat("Map");
        String strM24758c5 = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c5, "getDesc(...)");
        Pair pair4 = new Pair(C7460Cv0.m1460k0(strConcat4, "containsValue", "Ljava/lang/Object;", strM24758c5), enumC9577h31);
        String strConcat5 = "java/util/".concat("Map");
        String strM24758c6 = enumC11057sd0.m24758c();
        O90.m5967e(strM24758c6, "getDesc(...)");
        Pair pair5 = new Pair(C7460Cv0.m1460k0(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM24758c6), enumC9577h31);
        Pair pair6 = new Pair(C7460Cv0.m1460k0("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC9577h31.f28208e);
        C9193e31 c9193e31M1460k02 = C7460Cv0.m1460k0("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC9577h31 enumC9577h312 = EnumC9577h31.f28205b;
        Pair pair7 = new Pair(c9193e31M1460k02, enumC9577h312);
        Pair pair8 = new Pair(C7460Cv0.m1460k0("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC9577h312);
        String strConcat6 = "java/util/".concat("List");
        EnumC11057sd0 enumC11057sd02 = EnumC11057sd0.INT;
        String strM24758c7 = enumC11057sd02.m24758c();
        O90.m5967e(strM24758c7, "getDesc(...)");
        C9193e31 c9193e31M1460k03 = C7460Cv0.m1460k0(strConcat6, "indexOf", "Ljava/lang/Object;", strM24758c7);
        EnumC9577h31 enumC9577h313 = EnumC9577h31.f28206c;
        Pair pair9 = new Pair(c9193e31M1460k03, enumC9577h313);
        String strConcat7 = "java/util/".concat("List");
        String strM24758c8 = enumC11057sd02.m24758c();
        O90.m5967e(strM24758c8, "getDesc(...)");
        Map mapM24780h = AbstractC11077sn0.m24780h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(C7460Cv0.m1460k0(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strM24758c8), enumC9577h313));
        f28790c = mapM24780h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(mapM24780h.size()));
        for (Map.Entry entry : mapM24780h.entrySet()) {
            linkedHashMap.put(((C9193e31) entry.getKey()).f26523e, entry.getValue());
        }
        f28791d = linkedHashMap;
        LinkedHashSet linkedHashSetM25452c = AbstractC11433vZ0.m25452c(f28790c.keySet(), f28788a);
        ArrayList arrayList5 = new ArrayList(AbstractC7293zu.m26586k(linkedHashSetM25452c));
        Iterator it3 = linkedHashSetM25452c.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C9193e31) it3.next()).f26520b);
        }
        f28792e = AbstractC7167xu.m25987g0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC7293zu.m26586k(linkedHashSetM25452c));
        Iterator it4 = linkedHashSetM25452c.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C9193e31) it4.next()).f26523e);
        }
        f28793f = AbstractC7167xu.m25987g0(arrayList6);
        EnumC11057sd0 enumC11057sd03 = EnumC11057sd0.INT;
        String strM24758c9 = enumC11057sd03.m24758c();
        O90.m5967e(strM24758c9, "getDesc(...)");
        C9193e31 c9193e31M1460k04 = C7460Cv0.m1460k0("java/util/List", "removeAt", strM24758c9, "Ljava/lang/Object;");
        f28794g = c9193e31M1460k04;
        String strConcat8 = "java/lang/".concat("Number");
        String strM24758c10 = EnumC11057sd0.BYTE.m24758c();
        O90.m5967e(strM24758c10, "getDesc(...)");
        Pair pair10 = new Pair(C7460Cv0.m1460k0(strConcat8, "toByte", "", strM24758c10), C8340Tt0.m7798e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strM24758c11 = EnumC11057sd0.SHORT.m24758c();
        O90.m5967e(strM24758c11, "getDesc(...)");
        Pair pair11 = new Pair(C7460Cv0.m1460k0(strConcat9, "toShort", "", strM24758c11), C8340Tt0.m7798e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strM24758c12 = enumC11057sd03.m24758c();
        O90.m5967e(strM24758c12, "getDesc(...)");
        Pair pair12 = new Pair(C7460Cv0.m1460k0(strConcat10, "toInt", "", strM24758c12), C8340Tt0.m7798e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strM24758c13 = EnumC11057sd0.LONG.m24758c();
        O90.m5967e(strM24758c13, "getDesc(...)");
        Pair pair13 = new Pair(C7460Cv0.m1460k0(strConcat11, "toLong", "", strM24758c13), C8340Tt0.m7798e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strM24758c14 = EnumC11057sd0.FLOAT.m24758c();
        O90.m5967e(strM24758c14, "getDesc(...)");
        Pair pair14 = new Pair(C7460Cv0.m1460k0(strConcat12, "toFloat", "", strM24758c14), C8340Tt0.m7798e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strM24758c15 = EnumC11057sd0.DOUBLE.m24758c();
        O90.m5967e(strM24758c15, "getDesc(...)");
        Pair pair15 = new Pair(C7460Cv0.m1460k0(strConcat13, "toDouble", "", strM24758c15), C8340Tt0.m7798e("doubleValue"));
        Pair pair16 = new Pair(c9193e31M1460k04, C8340Tt0.m7798e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strM24758c16 = enumC11057sd03.m24758c();
        O90.m5967e(strM24758c16, "getDesc(...)");
        String strM24758c17 = EnumC11057sd0.CHAR.m24758c();
        O90.m5967e(strM24758c17, "getDesc(...)");
        Map mapM24780h2 = AbstractC11077sn0.m24780h(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(C7460Cv0.m1460k0(strConcat14, "get", strM24758c16, strM24758c17), C8340Tt0.m7798e("charAt")));
        f28795h = mapM24780h2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC11205tn0.m24983b(mapM24780h2.size()));
        for (Map.Entry entry2 : mapM24780h2.entrySet()) {
            linkedHashMap2.put(((C9193e31) entry2.getKey()).f26523e, entry2.getValue());
        }
        f28796i = linkedHashMap2;
        ?? r0 = f28795h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            C9193e31 c9193e31 = (C9193e31) entry3.getKey();
            C8340Tt0 c8340Tt0 = (C8340Tt0) entry3.getValue();
            String str2 = c9193e31.f26519a;
            String str3 = c9193e31.f26521c;
            String str4 = c9193e31.f26522d;
            O90.m5968f(str2, "classInternalName");
            O90.m5968f(c8340Tt0, "name");
            String str5 = c8340Tt0 + '(' + str3 + ')' + str4;
            O90.m5968f(str5, "jvmDescriptor");
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set setKeySet = f28795h.keySet();
        ArrayList arrayList7 = new ArrayList(AbstractC7293zu.m26586k(setKeySet));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((C9193e31) it5.next()).f26520b);
        }
        f28797j = arrayList7;
        Set<Map.Entry> setEntrySet = f28795h.entrySet();
        ArrayList arrayList8 = new ArrayList(AbstractC7293zu.m26586k(setEntrySet));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList8.add(new Pair(((C9193e31) entry4.getKey()).f26520b, entry4.getValue()));
        }
        int iM24983b = AbstractC11205tn0.m24983b(AbstractC7293zu.m26586k(arrayList8));
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM24983b);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((C8340Tt0) pair17.f36703b, (C8340Tt0) pair17.f36702a);
        }
        f28798k = linkedHashMap3;
    }
}
