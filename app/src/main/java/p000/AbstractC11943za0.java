package p000;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: za0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11943za0 {

    /* renamed from: a */
    public static final C1753aw f46877a;

    static {
        C1846cQ c1846cQ = C1846cQ.f17468c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = F31.f3046a;
        f46877a = new C1753aw(c1846cQ, new HashMap(map), new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, new ArrayList(linkedList));
    }

    /* renamed from: a */
    public static C0734Lf m26467a(String str, Map map) {
        String strM26470d = m26470d(str, map);
        if (strM26470d == null) {
            return null;
        }
        return new C0734Lf(strM26470d);
    }

    /* renamed from: b */
    public static Object m26468b(Map map, String str, Class cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException(AbstractC7222ym.m26234k("Unexpected type of JSON object member with key ", str, ""), 0);
    }

    /* renamed from: c */
    public static long m26469c(String str, Map map) throws ParseException {
        Number number = (Number) m26468b(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(AbstractC7222ym.m26234k("JSON object member with key ", str, " is missing or null"), 0);
    }

    /* renamed from: d */
    public static String m26470d(String str, Map map) {
        return (String) m26468b(map, str, String.class);
    }

    /* renamed from: e */
    public static List m26471e(String str, Map map) throws ParseException {
        String[] strArr;
        List list = (List) m26468b(map, str, List.class);
        if (list == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) list.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(AbstractC7222ym.m26234k("JSON object member with key \"", str, "\" is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: f */
    public static URI m26472f(String str, Map map) throws ParseException {
        String str2 = (String) m26468b(map, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    /* renamed from: g */
    public static Map m26473g(int i, String str) throws ParseException {
        if (str.trim().isEmpty()) {
            throw new ParseException("Invalid JSON object", 0);
        }
        if (i >= 0 && str.length() > i) {
            throw new ParseException(AbstractC7222ym.m26230g(i, "The parsed string is longer than the max accepted size of ", " characters"), 0);
        }
        Type[] typeArr = {String.class, Object.class};
        TypeVariable[] typeParameters = Map.class.getTypeParameters();
        int length = typeParameters.length;
        if (2 != length) {
            throw new IllegalArgumentException(Map.class.getName() + " requires " + length + " type arguments, but got 2");
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            Class<?> clsM8624i = AbstractC1378Vu.m8624i(type);
            TypeVariable typeVariable = typeParameters[i2];
            for (Type type2 : typeVariable.getBounds()) {
                if (!AbstractC1378Vu.m8624i(type2).isAssignableFrom(clsM8624i)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + Map.class);
                }
            }
        }
        Type typeM8617b = AbstractC1378Vu.m8617b(new C1757b(null, Map.class, typeArr, 0));
        AbstractC1378Vu.m8624i(typeM8617b);
        typeM8617b.hashCode();
        try {
            return (Map) f46877a.m10387f(str, typeM8617b);
        } catch (Exception e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    /* renamed from: h */
    public static String m26474h(Map map) {
        C1753aw c1753aw = f46877a;
        c1753aw.getClass();
        if (map == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                c1753aw.m10393l(c1753aw.m10391j(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C10799qc0(e);
            }
        }
        Class<?> cls = map.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            c1753aw.m10394m(map, cls, c1753aw.m10391j(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C10799qc0(e2);
        }
    }
}
