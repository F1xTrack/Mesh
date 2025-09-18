package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: i31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4273i31 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Object c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final C3509e31 g;
    public static final Object h;
    public static final LinkedHashMap i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setF = J8.F(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(setF));
        for (String str : setF) {
            String strC = EnumC7066sd0.BOOLEAN.c();
            O90.e(strC, "getDesc(...)");
            arrayList.add(C0240Cv0.k0("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3509e31) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(AbstractC8449zu.k(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C3509e31) it2.next()).b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC7066sd0 enumC7066sd0 = EnumC7066sd0.BOOLEAN;
        String strC2 = enumC7066sd0.c();
        O90.e(strC2, "getDesc(...)");
        C3509e31 c3509e31K0 = C0240Cv0.k0(strConcat, "contains", "Ljava/lang/Object;", strC2);
        EnumC4082h31 enumC4082h31 = EnumC4082h31.d;
        Pair pair = new Pair(c3509e31K0, enumC4082h31);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = enumC7066sd0.c();
        O90.e(strC3, "getDesc(...)");
        Pair pair2 = new Pair(C0240Cv0.k0(strConcat2, "remove", "Ljava/lang/Object;", strC3), enumC4082h31);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = enumC7066sd0.c();
        O90.e(strC4, "getDesc(...)");
        Pair pair3 = new Pair(C0240Cv0.k0(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), enumC4082h31);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = enumC7066sd0.c();
        O90.e(strC5, "getDesc(...)");
        Pair pair4 = new Pair(C0240Cv0.k0(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), enumC4082h31);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = enumC7066sd0.c();
        O90.e(strC6, "getDesc(...)");
        Pair pair5 = new Pair(C0240Cv0.k0(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), enumC4082h31);
        Pair pair6 = new Pair(C0240Cv0.k0("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC4082h31.e);
        C3509e31 c3509e31K02 = C0240Cv0.k0("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC4082h31 enumC4082h312 = EnumC4082h31.b;
        Pair pair7 = new Pair(c3509e31K02, enumC4082h312);
        Pair pair8 = new Pair(C0240Cv0.k0("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC4082h312);
        String strConcat6 = "java/util/".concat("List");
        EnumC7066sd0 enumC7066sd02 = EnumC7066sd0.INT;
        String strC7 = enumC7066sd02.c();
        O90.e(strC7, "getDesc(...)");
        C3509e31 c3509e31K03 = C0240Cv0.k0(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        EnumC4082h31 enumC4082h313 = EnumC4082h31.c;
        Pair pair9 = new Pair(c3509e31K03, enumC4082h313);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = enumC7066sd02.c();
        O90.e(strC8, "getDesc(...)");
        Map mapH = AbstractC7096sn0.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(C0240Cv0.k0(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), enumC4082h313));
        c = mapH;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(mapH.size()));
        for (Map.Entry entry : mapH.entrySet()) {
            linkedHashMap.put(((C3509e31) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetC = AbstractC7627vZ0.c(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(AbstractC8449zu.k(linkedHashSetC));
        Iterator it3 = linkedHashSetC.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C3509e31) it3.next()).b);
        }
        e = AbstractC8069xu.g0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC8449zu.k(linkedHashSetC));
        Iterator it4 = linkedHashSetC.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C3509e31) it4.next()).e);
        }
        f = AbstractC8069xu.g0(arrayList6);
        EnumC7066sd0 enumC7066sd03 = EnumC7066sd0.INT;
        String strC9 = enumC7066sd03.c();
        O90.e(strC9, "getDesc(...)");
        C3509e31 c3509e31K04 = C0240Cv0.k0("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = c3509e31K04;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = EnumC7066sd0.BYTE.c();
        O90.e(strC10, "getDesc(...)");
        Pair pair10 = new Pair(C0240Cv0.k0(strConcat8, "toByte", "", strC10), C1559Tt0.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = EnumC7066sd0.SHORT.c();
        O90.e(strC11, "getDesc(...)");
        Pair pair11 = new Pair(C0240Cv0.k0(strConcat9, "toShort", "", strC11), C1559Tt0.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = enumC7066sd03.c();
        O90.e(strC12, "getDesc(...)");
        Pair pair12 = new Pair(C0240Cv0.k0(strConcat10, "toInt", "", strC12), C1559Tt0.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = EnumC7066sd0.LONG.c();
        O90.e(strC13, "getDesc(...)");
        Pair pair13 = new Pair(C0240Cv0.k0(strConcat11, "toLong", "", strC13), C1559Tt0.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = EnumC7066sd0.FLOAT.c();
        O90.e(strC14, "getDesc(...)");
        Pair pair14 = new Pair(C0240Cv0.k0(strConcat12, "toFloat", "", strC14), C1559Tt0.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = EnumC7066sd0.DOUBLE.c();
        O90.e(strC15, "getDesc(...)");
        Pair pair15 = new Pair(C0240Cv0.k0(strConcat13, "toDouble", "", strC15), C1559Tt0.e("doubleValue"));
        Pair pair16 = new Pair(c3509e31K04, C1559Tt0.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = enumC7066sd03.c();
        O90.e(strC16, "getDesc(...)");
        String strC17 = EnumC7066sd0.CHAR.c();
        O90.e(strC17, "getDesc(...)");
        Map mapH2 = AbstractC7096sn0.h(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(C0240Cv0.k0(strConcat14, "get", strC16, strC17), C1559Tt0.e("charAt")));
        h = mapH2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC7287tn0.b(mapH2.size()));
        for (Map.Entry entry2 : mapH2.entrySet()) {
            linkedHashMap2.put(((C3509e31) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        ?? r0 = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            C3509e31 c3509e31 = (C3509e31) entry3.getKey();
            C1559Tt0 c1559Tt0 = (C1559Tt0) entry3.getValue();
            String str2 = c3509e31.a;
            String str3 = c3509e31.c;
            String str4 = c3509e31.d;
            O90.f(str2, "classInternalName");
            O90.f(c1559Tt0, "name");
            String str5 = c1559Tt0 + '(' + str3 + ')' + str4;
            O90.f(str5, "jvmDescriptor");
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set setKeySet = h.keySet();
        ArrayList arrayList7 = new ArrayList(AbstractC8449zu.k(setKeySet));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((C3509e31) it5.next()).b);
        }
        j = arrayList7;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList arrayList8 = new ArrayList(AbstractC8449zu.k(setEntrySet));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList8.add(new Pair(((C3509e31) entry4.getKey()).b, entry4.getValue()));
        }
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(arrayList8));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((C1559Tt0) pair17.b, (C1559Tt0) pair17.a);
        }
        k = linkedHashMap3;
    }
}
