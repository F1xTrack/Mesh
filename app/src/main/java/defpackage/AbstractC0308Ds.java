package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: Ds, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0308Ds {
    public static final String a = AbstractC8069xu.H(AbstractC8259yu.f('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listF = AbstractC8259yu.f("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = AbstractC7207tM1.a(0, listF.size() - 1, 2);
        if (iA >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listF.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listF.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC1705Vq.l(sb2, (String) listF.get(i), "Array"), "[" + ((String) listF.get(i2)));
                if (i == iA) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC8259yu.f("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC8259yu.f("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, AbstractC8235ym.v("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strU = AbstractC7209tN0.u(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strU, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC8259yu.f("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, AbstractC8235ym.i(str5, ".Companion"), a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        O90.f(str, "classId");
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + D51.l(str, '.', '$') + ';';
    }
}
