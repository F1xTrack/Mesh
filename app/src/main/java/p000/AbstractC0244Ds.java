package p000;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: Ds */
/* loaded from: classes2.dex */
public abstract class AbstractC0244Ds {

    /* renamed from: a */
    public static final String f2283a = AbstractC7167xu.m25962H(AbstractC7230yu.m26275f('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b */
    public static final LinkedHashMap f2284b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM26275f = AbstractC7230yu.m26275f("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM24880a = AbstractC11152tM1.m24880a(0, listM26275f.size() - 1, 2);
        if (iM24880a >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f2283a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM26275f.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listM26275f.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC1374Vq.m8593l(sb2, (String) listM26275f.get(i), "Array"), "[" + ((String) listM26275f.get(i2)));
                if (i == iM24880a) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f2283a + "/Unit", "V");
        m1918a(linkedHashMap, "Any", "java/lang/Object");
        m1918a(linkedHashMap, "Nothing", "java/lang/Void");
        m1918a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC7230yu.m26275f("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m1918a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC7230yu.m26275f("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m1918a(linkedHashMap, AbstractC7222ym.m26245v("collections/", str3), "java/util/" + str3);
            m1918a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m1918a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m1918a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m1918a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m1918a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strM24909u = AbstractC11153tN0.m24909u(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f2283a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m1918a(linkedHashMap, strM24909u, sb3.toString());
            m1918a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC7230yu.m26275f("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m1918a(linkedHashMap, AbstractC7222ym.m26232i(str5, ".Companion"), f2283a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f2284b = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m1918a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f2283a + '/' + str, "L" + str2 + ';');
    }

    /* renamed from: b */
    public static final String m1919b(String str) {
        O90.m5968f(str, "classId");
        String str2 = (String) f2284b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + D51.m1553l(str, '.', '$') + ';';
    }
}
