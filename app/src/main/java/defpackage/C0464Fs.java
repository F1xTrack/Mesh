package defpackage;

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

/* renamed from: Fs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0464Fs implements InterfaceC1667Vd0, InterfaceC6538ps {
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;
    public final Class a;

    static {
        int i = 0;
        List listF = AbstractC8259yu.f(InterfaceC5908mZ.class, InterfaceC6099nZ.class, Function2.class, InterfaceC6481pZ.class, InterfaceC6672qZ.class, NZ.class, InterfaceC6862rZ.class, NZ.class, InterfaceC7053sZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(listF));
        for (Object obj : listF) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = AbstractC7096sn0.n(arrayList);
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
        O90.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            O90.c(str);
            sb.append(AbstractC7538v51.U('.', str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AbstractC7538v51.U('.', str2, str2));
        }
        d = linkedHashMap;
    }

    public C0464Fs(Class cls) {
        O90.f(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.InterfaceC1667Vd0
    public final String a() {
        String str;
        Class cls = this.a;
        O90.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = c;
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

    @Override // defpackage.InterfaceC6538ps
    public final Class b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0464Fs) && P22.c(this).equals(P22.c((InterfaceC1667Vd0) obj));
    }

    @Override // defpackage.InterfaceC1667Vd0
    public final String f() {
        String str;
        Class cls = this.a;
        O90.f(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = d;
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
            return AbstractC7538v51.S(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC7538v51.T(simpleName);
        }
        return AbstractC7538v51.S(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // defpackage.InterfaceC1667Vd0
    public final Collection g() {
        throw new C1420Rz();
    }

    @Override // defpackage.InterfaceC1199Pd0
    public final List getAnnotations() {
        throw new C1420Rz();
    }

    public final int hashCode() {
        return P22.c(this).hashCode();
    }

    @Override // defpackage.InterfaceC1667Vd0
    public final boolean j(Object obj) {
        Class clsC = this.a;
        O90.f(clsC, "jClass");
        Map map = b;
        O90.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsC);
        if (num != null) {
            return AbstractC5543ke1.h(num.intValue(), obj);
        }
        if (clsC.isPrimitive()) {
            clsC = P22.c(P22.e(clsC));
        }
        return clsC.isInstance(obj);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
