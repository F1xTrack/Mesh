package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class VO0 {

    /* renamed from: a */
    public static final List f12536a;

    /* renamed from: b */
    public static final Map f12537b;

    /* renamed from: c */
    public static final Map f12538c;

    /* renamed from: d */
    public static final Map f12539d;

    static {
        int i = 0;
        Class cls = Boolean.TYPE;
        IP0 ip0 = BP0.f799a;
        List listM26275f = AbstractC7230yu.m26275f(ip0.mo3846b(cls), ip0.mo3846b(Byte.TYPE), ip0.mo3846b(Character.TYPE), ip0.mo3846b(Double.TYPE), ip0.mo3846b(Float.TYPE), ip0.mo3846b(Integer.TYPE), ip0.mo3846b(Long.TYPE), ip0.mo3846b(Short.TYPE));
        f12536a = listM26275f;
        List<InterfaceC8412Vd0> list = listM26275f;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        for (InterfaceC8412Vd0 interfaceC8412Vd0 : list) {
            arrayList.add(new Pair(P22.m6214c(interfaceC8412Vd0), P22.m6215d(interfaceC8412Vd0)));
        }
        f12537b = AbstractC11077sn0.m24786n(arrayList);
        List<InterfaceC8412Vd0> list2 = f12536a;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
        for (InterfaceC8412Vd0 interfaceC8412Vd02 : list2) {
            arrayList2.add(new Pair(P22.m6215d(interfaceC8412Vd02), P22.m6214c(interfaceC8412Vd02)));
        }
        f12538c = AbstractC11077sn0.m24786n(arrayList2);
        List listM26275f2 = AbstractC7230yu.m26275f(InterfaceC6434mZ.class, InterfaceC6497nZ.class, Function2.class, InterfaceC6625pZ.class, InterfaceC6688qZ.class, InterfaceC0854NZ.class, InterfaceC6751rZ.class, InterfaceC0854NZ.class, InterfaceC6831sZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class, InterfaceC0854NZ.class);
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(listM26275f2));
        for (Object obj : listM26275f2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f12539d = AbstractC11077sn0.m24786n(arrayList3);
    }

    /* renamed from: a */
    public static final C0055As m8433a(Class cls) {
        C0055As c0055AsM8433a;
        O90.m5968f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24910v(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24910v(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (c0055AsM8433a = m8433a(declaringClass)) == null) ? C0055As.m358j(new C0664KX(cls.getName())) : c0055AsM8433a.m361d(C8340Tt0.m7798e(cls.getSimpleName()));
        }
        C0664KX c0664kx = new C0664KX(cls.getName());
        return new C0055As(c0664kx.m4657e(), C0664KX.m4653j(c0664kx.m4658f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final String m8434b(Class cls) {
        O90.m5968f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return D51.m1553l(cls.getName(), '.', '/');
            }
            return "L" + D51.m1553l(cls.getName(), '.', '/') + ';';
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
        throw new IllegalArgumentException(AbstractC11153tN0.m24910v(cls, "Unsupported primitive type: "));
    }

    /* renamed from: c */
    public static final List m8435c(Type type) {
        O90.m5968f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C0779MN.f7117a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC9639hY0.m18835n(new C1790bW(AbstractC9639hY0.m18832k(type, C9393fd0.f27274D), C9393fd0.f27275E, C9895jY0.f35220a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        O90.m5967e(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC0576J8.m4173D(actualTypeArguments);
    }

    /* renamed from: d */
    public static final ClassLoader m8436d(Class cls) {
        O90.m5968f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        O90.m5967e(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
