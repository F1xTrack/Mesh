package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* renamed from: Fs */
/* loaded from: classes2.dex */
public final class C0370Fs implements InterfaceC8412Vd0, InterfaceC6644ps {

    /* renamed from: b */
    public static final Map f3453b;

    /* renamed from: c */
    public static final HashMap f3454c;

    /* renamed from: d */
    public static final LinkedHashMap f3455d;

    /* renamed from: a */
    public final Class f3456a;

    static {
        int i = 0;
        List listM26275f = AbstractC7230yu.m26275f(InterfaceC6434mZ.class, InterfaceC6497nZ.class, Function2.class, InterfaceC6625pZ.class, InterfaceC6688qZ.class, InterfaceC0854NZ.class, InterfaceC6751rZ.class, InterfaceC0854NZ.class, InterfaceC6831sZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(listM26275f));
        for (Object obj : listM26275f) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f3453b = AbstractC11077sn0.m24786n(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        O90.m5967e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            O90.m5965c(str);
            sb.append(AbstractC11374v51.m25346U('.', str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f3453b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f3454c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC11374v51.m25346U('.', str2, str2));
        }
        f3455d = linkedHashMap;
    }

    public C0370Fs(Class cls) {
        O90.m5968f(cls, "jClass");
        this.f3456a = cls;
    }

    @Override // p000.InterfaceC8412Vd0
    /* renamed from: a */
    public final String mo2806a() {
        String str;
        Class cls = this.f3456a;
        O90.m5968f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = f3454c;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // p000.InterfaceC6644ps
    /* renamed from: b */
    public final Class mo2807b() {
        return this.f3456a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0370Fs) && P22.m6214c(this).equals(P22.m6214c((InterfaceC8412Vd0) obj));
    }

    @Override // p000.InterfaceC8412Vd0
    /* renamed from: f */
    public final String mo2808f() {
        String str;
        Class cls = this.f3456a;
        O90.m5968f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f3455d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC11374v51.m25344S(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC11374v51.m25345T(simpleName);
        }
        return AbstractC11374v51.m25344S(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // p000.InterfaceC8412Vd0
    /* renamed from: g */
    public final Collection mo2809g() {
        throw new C1131Rz();
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        throw new C1131Rz();
    }

    public final int hashCode() {
        return P22.m6214c(this).hashCode();
    }

    @Override // p000.InterfaceC8412Vd0
    /* renamed from: j */
    public final boolean mo2810j(Object obj) {
        Class clsM6214c = this.f3456a;
        O90.m5968f(clsM6214c, "jClass");
        Map map = f3453b;
        O90.m5966d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsM6214c);
        if (num != null) {
            return AbstractC10036ke1.m22233h(num.intValue(), obj);
        }
        if (clsM6214c.isPrimitive()) {
            clsM6214c = P22.m6214c(P22.m6216e(clsM6214c));
        }
        return clsM6214c.isInstance(obj);
    }

    public final String toString() {
        return this.f3456a.toString() + " (Kotlin reflection is not available)";
    }
}
