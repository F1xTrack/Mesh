package defpackage;

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
public abstract class AbstractC3958gP1 {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    public static C0230Cs a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            O90.e(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new C0230Cs(C0074As.j(AbstractC6390p41.d.g()), i);
            }
            EnumC6988sD0 enumC6988sD0D = EnumC7066sd0.b(cls.getName()).d();
            O90.e(enumC6988sD0D, "getPrimitiveType(...)");
            return i > 0 ? new C0230Cs(C0074As.j((KX) enumC6988sD0D.d.getValue()), i - 1) : new C0230Cs(C0074As.j((KX) enumC6988sD0D.c.getValue()), i);
        }
        C0074As c0074AsA = VO0.a(cls);
        String str = C7442ub0.a;
        C0074As c0074As = (C0074As) C7442ub0.h.get(c0074AsA.b().i());
        if (c0074As != null) {
            c0074AsA = c0074As;
        }
        return new C0230Cs(c0074AsA, i);
    }

    public static void b(InterfaceC0195Cg0 interfaceC0195Cg0, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        O90.e(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                O90.c(objInvoke);
                C1559Tt0 c1559Tt0E = C1559Tt0.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC0195Cg0.n(c1559Tt0E, a((Class) objInvoke));
                } else if (AbstractC8167yP0.a.contains(enclosingClass)) {
                    interfaceC0195Cg0.l(c1559Tt0E, objInvoke);
                } else {
                    List list = VO0.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        O90.c(enclosingClass);
                        interfaceC0195Cg0.p(c1559Tt0E, VO0.a(enclosingClass), C1559Tt0.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        O90.e(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) J8.y(interfaces);
                        O90.c(cls2);
                        InterfaceC0195Cg0 interfaceC0195Cg0R = interfaceC0195Cg0.r(VO0.a(cls2), c1559Tt0E);
                        if (interfaceC0195Cg0R != null) {
                            b(interfaceC0195Cg0R, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC0273Dg0 interfaceC0273Dg0O = interfaceC0195Cg0.o(c1559Tt0E);
                        if (interfaceC0273Dg0O != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C0074As c0074AsA = VO0.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    O90.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    interfaceC0273Dg0O.i0(c0074AsA, C1559Tt0.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    O90.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    interfaceC0273Dg0O.U0(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC0195Cg0 interfaceC0195Cg0R2 = interfaceC0273Dg0O.r(VO0.a(componentType));
                                    if (interfaceC0195Cg0R2 != null) {
                                        O90.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        b(interfaceC0195Cg0R2, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC0273Dg0O.e0(obj4);
                                }
                            }
                            interfaceC0273Dg0O.k();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC0195Cg0.k();
    }

    public static C1450Sj c(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C3909g90 c3909g90 = new C3909g90(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(c3909g90));
        Iterator it = c3909g90.iterator();
        while (((C3718f90) it).c) {
            ((C3718f90) it).a();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrA0 = AbstractC8069xu.a0(arrayList);
        return new C1450Sj(Arrays.copyOf(iArrA0, iArrA0.length));
    }
}
