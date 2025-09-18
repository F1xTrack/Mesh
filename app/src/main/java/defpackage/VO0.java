package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class VO0 {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        int i = 0;
        Class cls = Boolean.TYPE;
        IP0 ip0 = BP0.a;
        List listF = AbstractC8259yu.f(ip0.b(cls), ip0.b(Byte.TYPE), ip0.b(Character.TYPE), ip0.b(Double.TYPE), ip0.b(Float.TYPE), ip0.b(Integer.TYPE), ip0.b(Long.TYPE), ip0.b(Short.TYPE));
        a = listF;
        List<InterfaceC1667Vd0> list = listF;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        for (InterfaceC1667Vd0 interfaceC1667Vd0 : list) {
            arrayList.add(new Pair(P22.c(interfaceC1667Vd0), P22.d(interfaceC1667Vd0)));
        }
        b = AbstractC7096sn0.n(arrayList);
        List<InterfaceC1667Vd0> list2 = a;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
        for (InterfaceC1667Vd0 interfaceC1667Vd02 : list2) {
            arrayList2.add(new Pair(P22.d(interfaceC1667Vd02), P22.c(interfaceC1667Vd02)));
        }
        c = AbstractC7096sn0.n(arrayList2);
        List listF2 = AbstractC8259yu.f(InterfaceC5908mZ.class, InterfaceC6099nZ.class, Function2.class, InterfaceC6481pZ.class, InterfaceC6672qZ.class, NZ.class, InterfaceC6862rZ.class, NZ.class, InterfaceC7053sZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class, NZ.class);
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(listF2));
        for (Object obj : listF2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = AbstractC7096sn0.n(arrayList3);
    }

    public static final C0074As a(Class cls) {
        C0074As c0074AsA;
        O90.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(AbstractC7209tN0.v(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(AbstractC7209tN0.v(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (c0074AsA = a(declaringClass)) == null) ? C0074As.j(new KX(cls.getName())) : c0074AsA.d(C1559Tt0.e(cls.getSimpleName()));
        }
        KX kx = new KX(cls.getName());
        return new C0074As(kx.e(), KX.j(kx.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        O90.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return D51.l(cls.getName(), '.', '/');
            }
            return "L" + D51.l(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(AbstractC7209tN0.v(cls, "Unsupported primitive type: "));
    }

    public static final List c(Type type) {
        O90.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return MN.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC4175hY0.n(new C2339bW(AbstractC4175hY0.k(type, C3808fd0.D), C3808fd0.E, C5333jY0.a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        O90.e(actualTypeArguments, "getActualTypeArguments(...)");
        return J8.D(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        O90.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        O90.e(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
