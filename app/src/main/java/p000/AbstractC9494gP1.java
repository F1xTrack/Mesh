package p000;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: gP1 */
/* loaded from: classes.dex */
public abstract class AbstractC9494gP1 {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* renamed from: a */
    public static C0181Cs m18519a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            O90.m5967e(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new C0181Cs(C0055As.m358j(AbstractC10604p41.f39806d.m5393g()), i);
            }
            EnumC11005sD0 enumC11005sD0M24759d = EnumC11057sd0.m24757b(cls.getName()).m24759d();
            O90.m5967e(enumC11005sD0M24759d, "getPrimitiveType(...)");
            return i > 0 ? new C0181Cs(C0055As.m358j((C0664KX) enumC11005sD0M24759d.f42317d.getValue()), i - 1) : new C0181Cs(C0055As.m358j((C0664KX) enumC11005sD0M24759d.f42316c.getValue()), i);
        }
        C0055As c0055AsM8433a = VO0.m8433a(cls);
        String str = C11309ub0.f43758a;
        C0055As c0055As = (C0055As) C11309ub0.f43765h.get(c0055AsM8433a.m359b().m4661i());
        if (c0055As != null) {
            c0055AsM8433a = c0055As;
        }
        return new C0181Cs(c0055AsM8433a, i);
    }

    /* renamed from: b */
    public static void m18520b(InterfaceC7430Cg0 interfaceC7430Cg0, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        O90.m5967e(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                O90.m5965c(objInvoke);
                C8340Tt0 c8340Tt0M7798e = C8340Tt0.m7798e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC7430Cg0.mo1265n(c8340Tt0M7798e, m18519a((Class) objInvoke));
                } else if (AbstractC11794yP0.f46252a.contains(enclosingClass)) {
                    interfaceC7430Cg0.mo1264l(c8340Tt0M7798e, objInvoke);
                } else {
                    List list = VO0.f12536a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        O90.m5965c(enclosingClass);
                        interfaceC7430Cg0.mo1267p(c8340Tt0M7798e, VO0.m8433a(enclosingClass), C8340Tt0.m7798e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        O90.m5967e(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) AbstractC0576J8.m4198y(interfaces);
                        O90.m5965c(cls2);
                        InterfaceC7430Cg0 interfaceC7430Cg0Mo1268r = interfaceC7430Cg0.mo1268r(VO0.m8433a(cls2), c8340Tt0M7798e);
                        if (interfaceC7430Cg0Mo1268r != null) {
                            m18520b(interfaceC7430Cg0Mo1268r, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC7482Dg0 interfaceC7482Dg0Mo1266o = interfaceC7430Cg0.mo1266o(c8340Tt0M7798e);
                        if (interfaceC7482Dg0Mo1266o != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C0055As c0055AsM8433a = VO0.m8433a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    O90.m5966d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    interfaceC7482Dg0Mo1266o.mo1749i0(c0055AsM8433a, C8340Tt0.m7798e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    O90.m5966d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    interfaceC7482Dg0Mo1266o.mo1747U0(m18519a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC7430Cg0 interfaceC7430Cg0Mo1751r = interfaceC7482Dg0Mo1266o.mo1751r(VO0.m8433a(componentType));
                                    if (interfaceC7430Cg0Mo1751r != null) {
                                        O90.m5966d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        m18520b(interfaceC7430Cg0Mo1751r, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC7482Dg0Mo1266o.mo1748e0(obj4);
                                }
                            }
                            interfaceC7482Dg0Mo1266o.mo1750k();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC7430Cg0.mo1263k();
    }

    /* renamed from: c */
    public static C1178Sj m18521c(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C9461g90 c9461g90 = new C9461g90(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(c9461g90));
        Iterator it = c9461g90.iterator();
        while (((C9333f90) it).f27092c) {
            ((C9333f90) it).m18193a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrM25981a0 = AbstractC7167xu.m25981a0(arrayList);
        return new C1178Sj(Arrays.copyOf(iArrM25981a0, iArrM25981a0.length));
    }
}
