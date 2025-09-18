package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pe0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6497pe0 implements InterfaceC6538ps {
    public static final C2512cQ0 a = new C2512cQ0("<v#(\\d+)>");

    public static Method u(Class cls, String str, Class[] clsArr, Class cls2, boolean z) throws NoSuchMethodException, SecurityException {
        Class clsB;
        Method methodU;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodX = x(cls, str, clsArr, cls2);
        if (methodX != null) {
            return methodX;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodU = u(superclass, str, clsArr, cls2, z)) != null) {
            return methodU;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        O90.e(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            O90.c(cls3);
            Method methodU2 = u(cls3, str, clsArr, cls2, z);
            if (methodU2 != null) {
                return methodU2;
            }
            if (z && (clsB = AbstractC5689lP1.b(VO0.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodX2 = x(clsB, str, clsArr, cls2);
                if (methodX2 != null) {
                    return methodX2;
                }
            }
        }
        return null;
    }

    public static Constructor w(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method x(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (O90.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            O90.e(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (O90.a(method.getName(), str) && O90.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void l(ArrayList arrayList, String str, boolean z) {
        ArrayList arrayListT = t(str);
        arrayList.addAll(arrayListT);
        int size = (arrayListT.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            O90.e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(DefaultConstructorMarker.class);
            arrayList.add(DefaultConstructorMarker.class);
        }
    }

    public final Method m(String str, String str2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodU;
        O90.f(str, "name");
        O90.f(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) t(str2).toArray(new Class[0]);
        Class clsV = v(AbstractC7538v51.z(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method methodU2 = u(r(), str, clsArr, clsV, false);
        if (methodU2 != null) {
            return methodU2;
        }
        if (!r().isInterface() || (methodU = u(Object.class, str, clsArr, clsV, false)) == null) {
            return null;
        }
        return methodU;
    }

    public abstract Collection n();

    public abstract Collection o(C1559Tt0 c1559Tt0);

    public abstract CE0 p(int i);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection q(defpackage.InterfaceC5578kq0 r9, defpackage.EnumC6115ne0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            defpackage.O90.f(r9, r0)
            oe0 r0 = new oe0
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = defpackage.AbstractC8171yQ1.a(r9, r1, r2)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L1b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r9.next()
            CD r3 = (defpackage.CD) r3
            boolean r4 = r3 instanceof defpackage.InterfaceC8042xl
            if (r4 == 0) goto L56
            r4 = r3
            xl r4 = (defpackage.InterfaceC8042xl) r4
            vI r5 = r4.getVisibility()
            vI r6 = defpackage.AbstractC7765wI.h
            boolean r5 = defpackage.O90.a(r5, r6)
            if (r5 != 0) goto L56
            int r4 = r4.l()
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L45
            r4 = r7
            goto L46
        L45:
            r4 = r6
        L46:
            ne0 r5 = defpackage.EnumC6115ne0.a
            if (r10 != r5) goto L4b
            r6 = r7
        L4b:
            if (r4 != r6) goto L56
            Tf1 r4 = defpackage.C1518Tf1.a
            java.lang.Object r3 = r3.Z(r0, r4)
            Ud0 r3 = (defpackage.AbstractC1589Ud0) r3
            goto L57
        L56:
            r3 = r1
        L57:
            if (r3 == 0) goto L1b
            r2.add(r3)
            goto L1b
        L5d:
            java.util.List r9 = defpackage.AbstractC8069xu.b0(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6497pe0.q(kq0, ne0):java.util.Collection");
    }

    public Class r() {
        Class clsB = b();
        List list = VO0.a;
        O90.f(clsB, "<this>");
        Class cls = (Class) VO0.c.get(clsB);
        return cls == null ? b() : cls;
    }

    public abstract Collection s(C1559Tt0 c1559Tt0);

    public final ArrayList t(String str) {
        int iZ;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC7538v51.q("VZCBSIFJD", cCharAt)) {
                iZ = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new C1420Rz("Unknown type prefix in the method signature: ".concat(str), 1);
                }
                iZ = AbstractC7538v51.z(str, ';', i, false, 4) + 1;
            }
            arrayList.add(v(i, iZ, str));
            i = iZ;
        }
        return arrayList;
    }

    public final Class v(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = VO0.d(b());
            String strSubstring = str.substring(i + 1, i2 - 1);
            O90.e(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(D51.l(strSubstring, '/', '.'));
            O90.e(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsV = v(i + 1, i2, str);
            KX kx = AbstractC0433Fh1.a;
            O90.f(clsV, "<this>");
            return Array.newInstance((Class<?>) clsV, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            O90.e(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new C1420Rz("Unknown type prefix in the method signature: ".concat(str), 1);
    }
}
