package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ub0 */
/* loaded from: classes2.dex */
public final class C7442ub0 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final C0074As e;
    public static final KX f;
    public static final C0074As g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static final HashMap k;
    public static final HashMap l;
    public static final HashMap m;
    public static final List n;

    static {
        StringBuilder sb = new StringBuilder();
        GZ gz = GZ.c;
        sb.append(gz.a.a.toString());
        sb.append('.');
        sb.append(gz.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        HZ hz = HZ.c;
        sb2.append(hz.a.a.toString());
        sb2.append('.');
        sb2.append(hz.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        JZ jz = JZ.c;
        sb3.append(jz.a.a.toString());
        sb3.append('.');
        sb3.append(jz.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        IZ iz = IZ.c;
        sb4.append(iz.a.a.toString());
        sb4.append('.');
        sb4.append(iz.b);
        d = sb4.toString();
        C0074As c0074AsJ = C0074As.j(new KX("kotlin.jvm.functions.FunctionN"));
        e = c0074AsJ;
        f = c0074AsJ.b();
        g = C5626l41.n;
        d(Class.class);
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        C0074As c0074AsJ2 = C0074As.j(AbstractC6390p41.A);
        KX kx = AbstractC6390p41.I;
        KX kxG = c0074AsJ2.g();
        KX kxG2 = c0074AsJ2.g();
        O90.e(kxG2, "getPackageFqName(...)");
        C7251tb0 c7251tb0 = new C7251tb0(d(Iterable.class), c0074AsJ2, new C0074As(kxG, AbstractC7715w12.e(kx, kxG2), false));
        C0074As c0074AsJ3 = C0074As.j(AbstractC6390p41.z);
        KX kx2 = AbstractC6390p41.H;
        KX kxG3 = c0074AsJ3.g();
        KX kxG4 = c0074AsJ3.g();
        O90.e(kxG4, "getPackageFqName(...)");
        C7251tb0 c7251tb02 = new C7251tb0(d(Iterator.class), c0074AsJ3, new C0074As(kxG3, AbstractC7715w12.e(kx2, kxG4), false));
        C0074As c0074AsJ4 = C0074As.j(AbstractC6390p41.B);
        KX kx3 = AbstractC6390p41.J;
        KX kxG5 = c0074AsJ4.g();
        KX kxG6 = c0074AsJ4.g();
        O90.e(kxG6, "getPackageFqName(...)");
        C7251tb0 c7251tb03 = new C7251tb0(d(Collection.class), c0074AsJ4, new C0074As(kxG5, AbstractC7715w12.e(kx3, kxG6), false));
        C0074As c0074AsJ5 = C0074As.j(AbstractC6390p41.C);
        KX kx4 = AbstractC6390p41.K;
        KX kxG7 = c0074AsJ5.g();
        KX kxG8 = c0074AsJ5.g();
        O90.e(kxG8, "getPackageFqName(...)");
        C7251tb0 c7251tb04 = new C7251tb0(d(List.class), c0074AsJ5, new C0074As(kxG7, AbstractC7715w12.e(kx4, kxG8), false));
        C0074As c0074AsJ6 = C0074As.j(AbstractC6390p41.E);
        KX kx5 = AbstractC6390p41.M;
        KX kxG9 = c0074AsJ6.g();
        KX kxG10 = c0074AsJ6.g();
        O90.e(kxG10, "getPackageFqName(...)");
        C7251tb0 c7251tb05 = new C7251tb0(d(Set.class), c0074AsJ6, new C0074As(kxG9, AbstractC7715w12.e(kx5, kxG10), false));
        C0074As c0074AsJ7 = C0074As.j(AbstractC6390p41.D);
        KX kx6 = AbstractC6390p41.L;
        KX kxG11 = c0074AsJ7.g();
        KX kxG12 = c0074AsJ7.g();
        O90.e(kxG12, "getPackageFqName(...)");
        C7251tb0 c7251tb06 = new C7251tb0(d(ListIterator.class), c0074AsJ7, new C0074As(kxG11, AbstractC7715w12.e(kx6, kxG12), false));
        KX kx7 = AbstractC6390p41.F;
        C0074As c0074AsJ8 = C0074As.j(kx7);
        KX kx8 = AbstractC6390p41.N;
        KX kxG13 = c0074AsJ8.g();
        KX kxG14 = c0074AsJ8.g();
        O90.e(kxG14, "getPackageFqName(...)");
        C7251tb0 c7251tb07 = new C7251tb0(d(Map.class), c0074AsJ8, new C0074As(kxG13, AbstractC7715w12.e(kx8, kxG14), false));
        C0074As c0074AsD = C0074As.j(kx7).d(AbstractC6390p41.G.f());
        KX kx9 = AbstractC6390p41.O;
        KX kxG15 = c0074AsD.g();
        KX kxG16 = c0074AsD.g();
        O90.e(kxG16, "getPackageFqName(...)");
        List<C7251tb0> listF = AbstractC8259yu.f(c7251tb0, c7251tb02, c7251tb03, c7251tb04, c7251tb05, c7251tb06, c7251tb07, new C7251tb0(d(Map.Entry.class), c0074AsD, new C0074As(kxG15, AbstractC7715w12.e(kx9, kxG16), false)));
        n = listF;
        c(Object.class, AbstractC6390p41.a);
        c(String.class, AbstractC6390p41.f);
        c(CharSequence.class, AbstractC6390p41.e);
        a(d(Throwable.class), C0074As.j(AbstractC6390p41.k));
        c(Cloneable.class, AbstractC6390p41.c);
        c(Number.class, AbstractC6390p41.i);
        a(d(Comparable.class), C0074As.j(AbstractC6390p41.l));
        c(Enum.class, AbstractC6390p41.j);
        a(d(Annotation.class), C0074As.j(AbstractC6390p41.s));
        for (C7251tb0 c7251tb08 : listF) {
            C0074As c0074As = c7251tb08.a;
            C0074As c0074As2 = c7251tb08.b;
            a(c0074As, c0074As2);
            C0074As c0074As3 = c7251tb08.c;
            b(c0074As3.b(), c0074As);
            l.put(c0074As3, c0074As2);
            m.put(c0074As2, c0074As3);
            KX kxB = c0074As2.b();
            KX kxB2 = c0074As3.b();
            MX mxI = c0074As3.b().i();
            O90.e(mxI, "toUnsafe(...)");
            j.put(mxI, kxB);
            MX mxI2 = kxB.i();
            O90.e(mxI2, "toUnsafe(...)");
            k.put(mxI2, kxB2);
        }
        for (EnumC7066sd0 enumC7066sd0 : EnumC7066sd0.values()) {
            C0074As c0074AsJ9 = C0074As.j(enumC7066sd0.e());
            EnumC6988sD0 enumC6988sD0D = enumC7066sd0.d();
            O90.e(enumC6988sD0D, "getPrimitiveType(...)");
            a(c0074AsJ9, C0074As.j(AbstractC6581q41.l.c(enumC6988sD0D.a)));
        }
        for (C0074As c0074As4 : C2414bv.a) {
            a(C0074As.j(new KX("kotlin.jvm.internal." + c0074As4.i().b() + "CompanionObject")), c0074As4.d(AbstractC5431k31.b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a(C0074As.j(new KX(AbstractC7209tN0.u(i2, "kotlin.jvm.functions.Function"))), new C0074As(AbstractC6581q41.l, C1559Tt0.e("Function" + i2)));
            b(new KX(b + i2), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            IZ iz2 = IZ.c;
            b(new KX((iz2.a.a.toString() + '.' + iz2.b) + i3), g);
        }
        KX kxG17 = AbstractC6390p41.b.g();
        O90.e(kxG17, "toSafe(...)");
        b(kxG17, d(Void.class));
    }

    public static void a(C0074As c0074As, C0074As c0074As2) {
        MX mxI = c0074As.b().i();
        O90.e(mxI, "toUnsafe(...)");
        h.put(mxI, c0074As2);
        b(c0074As2.b(), c0074As);
    }

    public static void b(KX kx, C0074As c0074As) {
        MX mxI = kx.i();
        O90.e(mxI, "toUnsafe(...)");
        i.put(mxI, c0074As);
    }

    public static void c(Class cls, MX mx) {
        KX kxG = mx.g();
        O90.e(kxG, "toSafe(...)");
        a(d(cls), C0074As.j(kxG));
    }

    public static C0074As d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? C0074As.j(new KX(cls.getCanonicalName())) : d(declaringClass).d(C1559Tt0.e(cls.getSimpleName()));
    }

    public static boolean e(MX mx, String str) {
        Integer numF;
        String str2 = mx.a;
        if (str2 == null) {
            MX.a(4);
            throw null;
        }
        String strS = AbstractC7538v51.S(str2, str, "");
        if (strS.length() > 0) {
            return (strS.length() <= 0 || !HS1.c(strS.charAt(0), '0', false)) && (numF = C51.f(strS)) != null && numF.intValue() >= 23;
        }
        return false;
    }

    public static C0074As f(MX mx) {
        boolean zE = e(mx, a);
        C0074As c0074As = e;
        if (zE || e(mx, c)) {
            return c0074As;
        }
        boolean zE2 = e(mx, b);
        C0074As c0074As2 = g;
        return (zE2 || e(mx, d)) ? c0074As2 : (C0074As) i.get(mx);
    }
}
