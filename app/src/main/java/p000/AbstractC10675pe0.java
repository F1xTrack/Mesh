package p000;

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
public abstract class AbstractC10675pe0 implements InterfaceC6644ps {

    /* renamed from: a */
    public static final C8978cQ0 f40260a = new C8978cQ0("<v#(\\d+)>");

    /* renamed from: u */
    public static Method m23825u(Class cls, String str, Class[] clsArr, Class cls2, boolean z) throws NoSuchMethodException, SecurityException {
        Class clsM22425b;
        Method methodM23825u;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodM23827x = m23827x(cls, str, clsArr, cls2);
        if (methodM23827x != null) {
            return methodM23827x;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM23825u = m23825u(superclass, str, clsArr, cls2, z)) != null) {
            return methodM23825u;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        O90.m5967e(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            O90.m5965c(cls3);
            Method methodM23825u2 = m23825u(cls3, str, clsArr, cls2, z);
            if (methodM23825u2 != null) {
                return methodM23825u2;
            }
            if (z && (clsM22425b = AbstractC10134lP1.m22425b(VO0.m8436d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM23827x2 = m23827x(clsM22425b, str, clsArr, cls2);
                if (methodM23827x2 != null) {
                    return methodM23827x2;
                }
            }
        }
        return null;
    }

    /* renamed from: w */
    public static Constructor m23826w(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static Method m23827x(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (O90.m5963a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            O90.m5967e(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (O90.m5963a(method.getName(), str) && O90.m5963a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final void m23828l(ArrayList arrayList, String str, boolean z) {
        ArrayList arrayListM23831t = m23831t(str);
        arrayList.addAll(arrayListM23831t);
        int size = (arrayListM23831t.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class cls = Integer.TYPE;
            O90.m5967e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (!z) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(DefaultConstructorMarker.class);
            arrayList.add(DefaultConstructorMarker.class);
        }
    }

    /* renamed from: m */
    public final Method m23829m(String str, String str2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodM23825u;
        O90.m5968f(str, "name");
        O90.m5968f(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) m23831t(str2).toArray(new Class[0]);
        Class clsM23832v = m23832v(AbstractC11374v51.m25361z(str2, ')', 0, false, 6) + 1, str2.length(), str2);
        Method methodM23825u2 = m23825u(mo6096r(), str, clsArr, clsM23832v, false);
        if (methodM23825u2 != null) {
            return methodM23825u2;
        }
        if (!mo6096r().isInterface() || (methodM23825u = m23825u(Object.class, str, clsArr, clsM23832v, false)) == null) {
            return null;
        }
        return methodM23825u;
    }

    /* renamed from: n */
    public abstract Collection mo3831n();

    /* renamed from: o */
    public abstract Collection mo3832o(C8340Tt0 c8340Tt0);

    /* renamed from: p */
    public abstract CE0 mo3833p(int i);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection m23830q(p000.InterfaceC10059kq0 r9, p000.EnumC10419ne0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            p000.O90.m5968f(r9, r0)
            oe0 r0 = new oe0
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = p000.AbstractC11797yQ1.m26148a(r9, r1, r2)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L1b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r9.next()
            CD r3 = (p000.InterfaceC0140CD) r3
            boolean r4 = r3 instanceof p000.InterfaceC7158xl
            if (r4 == 0) goto L56
            r4 = r3
            xl r4 = (p000.InterfaceC7158xl) r4
            vI r5 = r4.getVisibility()
            vI r6 = p000.AbstractC7066wI.f44767h
            boolean r5 = p000.O90.m5963a(r5, r6)
            if (r5 != 0) goto L56
            int r4 = r4.mo116l()
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L45
            r4 = r7
            goto L46
        L45:
            r4 = r6
        L46:
            ne0 r5 = p000.EnumC10419ne0.f38428a
            if (r10 != r5) goto L4b
            r6 = r7
        L4b:
            if (r4 != r6) goto L56
            Tf1 r4 = p000.C8313Tf1.f11463a
            java.lang.Object r3 = r3.mo421Z(r0, r4)
            Ud0 r3 = (p000.AbstractC8360Ud0) r3
            goto L57
        L56:
            r3 = r1
        L57:
            if (r3 == 0) goto L1b
            r2.add(r3)
            goto L1b
        L5d:
            java.util.List r9 = p000.AbstractC7167xu.m25982b0(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10675pe0.m23830q(kq0, ne0):java.util.Collection");
    }

    /* renamed from: r */
    public Class mo6096r() {
        Class clsMo2807b = mo2807b();
        List list = VO0.f12536a;
        O90.m5968f(clsMo2807b, "<this>");
        Class cls = (Class) VO0.f12538c.get(clsMo2807b);
        return cls == null ? mo2807b() : cls;
    }

    /* renamed from: s */
    public abstract Collection mo3834s(C8340Tt0 c8340Tt0);

    /* renamed from: t */
    public final ArrayList m23831t(String str) {
        int iM25361z;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC11374v51.m25352q("VZCBSIFJD", cCharAt)) {
                iM25361z = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new C1131Rz("Unknown type prefix in the method signature: ".concat(str), 1);
                }
                iM25361z = AbstractC11374v51.m25361z(str, ';', i, false, 4) + 1;
            }
            arrayList.add(m23832v(i, iM25361z, str));
            i = iM25361z;
        }
        return arrayList;
    }

    /* renamed from: v */
    public final Class m23832v(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'L') {
            ClassLoader classLoaderM8436d = VO0.m8436d(mo2807b());
            String strSubstring = str.substring(i + 1, i2 - 1);
            O90.m5967e(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderM8436d.loadClass(D51.m1553l(strSubstring, '/', '.'));
            O90.m5967e(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsM23832v = m23832v(i + 1, i2, str);
            C0664KX c0664kx = AbstractC7589Fh1.f3397a;
            O90.m5968f(clsM23832v, "<this>");
            return Array.newInstance((Class<?>) clsM23832v, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            O90.m5967e(cls, "TYPE");
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
        throw new C1131Rz("Unknown type prefix in the method signature: ".concat(str), 1);
    }
}
