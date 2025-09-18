package defpackage;

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
public abstract class AbstractC8390za0 {
    public static final C2226aw a;

    static {
        C2511cQ c2511cQ = C2511cQ.c;
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
        boolean z = F31.a;
        a = new C2226aw(c2511cQ, new HashMap(map), new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, new ArrayList(linkedList));
    }

    public static C0893Lf a(String str, Map map) {
        String strD = d(str, map);
        if (strD == null) {
            return null;
        }
        return new C0893Lf(strD);
    }

    public static Object b(Map map, String str, Class cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException(AbstractC8235ym.k("Unexpected type of JSON object member with key ", str, ""), 0);
    }

    public static long c(String str, Map map) throws ParseException {
        Number number = (Number) b(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(AbstractC8235ym.k("JSON object member with key ", str, " is missing or null"), 0);
    }

    public static String d(String str, Map map) {
        return (String) b(map, str, String.class);
    }

    public static List e(String str, Map map) throws ParseException {
        String[] strArr;
        List list = (List) b(map, str, List.class);
        if (list == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) list.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(AbstractC8235ym.k("JSON object member with key \"", str, "\" is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public static URI f(String str, Map map) throws ParseException {
        String str2 = (String) b(map, str, String.class);
        if (str2 == null) {
            return null;
        }
        try {
            return new URI(str2);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static Map g(int i, String str) throws ParseException {
        if (str.trim().isEmpty()) {
            throw new ParseException("Invalid JSON object", 0);
        }
        if (i >= 0 && str.length() > i) {
            throw new ParseException(AbstractC8235ym.g(i, "The parsed string is longer than the max accepted size of ", " characters"), 0);
        }
        Type[] typeArr = {String.class, Object.class};
        TypeVariable[] typeParameters = Map.class.getTypeParameters();
        int length = typeParameters.length;
        if (2 != length) {
            throw new IllegalArgumentException(Map.class.getName() + " requires " + length + " type arguments, but got 2");
        }
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeArr[i2];
            Class<?> clsI = AbstractC1717Vu.i(type);
            TypeVariable typeVariable = typeParameters[i2];
            for (Type type2 : typeVariable.getBounds()) {
                if (!AbstractC1717Vu.i(type2).isAssignableFrom(clsI)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + Map.class);
                }
            }
        }
        Type typeB = AbstractC1717Vu.b(new C2238b(null, Map.class, typeArr, 0));
        AbstractC1717Vu.i(typeB);
        typeB.hashCode();
        try {
            return (Map) a.f(str, typeB);
        } catch (Exception e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String h(Map map) {
        C2226aw c2226aw = a;
        c2226aw.getClass();
        if (map == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                c2226aw.l(c2226aw.j(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C6682qc0(e);
            }
        }
        Class<?> cls = map.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            c2226aw.m(map, cls, c2226aw.j(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new C6682qc0(e2);
        }
    }
}
