package defpackage;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: l41, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5626l41 {
    public static final KX a;
    public static final KX b;
    public static final KX c;
    public static final KX d;
    public static final KX e;
    public static final KX f;
    public static final KX g;
    public static final C0074As h;
    public static final C0074As i;
    public static final C0074As j;
    public static final C0074As k;
    public static final C0074As l;
    public static final C0074As m;
    public static final C0074As n;
    public static final Set o;
    public static final Set p;
    public static final C0074As q;
    public static final C0074As r;
    public static final C0074As s;
    public static final C0074As t;

    static {
        KX kx = new KX("kotlin");
        a = kx;
        KX kxC = kx.c(C1559Tt0.e("reflect"));
        b = kxC;
        KX kxC2 = kx.c(C1559Tt0.e("collections"));
        c = kxC2;
        KX kxC3 = kx.c(C1559Tt0.e("ranges"));
        d = kxC3;
        kx.c(C1559Tt0.e(DebugImage.JVM)).c(C1559Tt0.e("internal"));
        KX kxC4 = kx.c(C1559Tt0.e("annotation"));
        e = kxC4;
        KX kxC5 = kx.c(C1559Tt0.e("internal"));
        kxC5.c(C1559Tt0.e("ir"));
        KX kxC6 = kx.c(C1559Tt0.e("coroutines"));
        f = kxC6;
        g = kx.c(C1559Tt0.e("enums"));
        kx.c(C1559Tt0.e("contracts"));
        kx.c(C1559Tt0.e("concurrent"));
        kx.c(C1559Tt0.e("test"));
        J8.F(new KX[]{kx, kxC2, kxC3, kxC4, kxC, kxC5, kxC6});
        AbstractC5817m41.a("Nothing");
        AbstractC5817m41.a("Unit");
        AbstractC5817m41.a("Any");
        AbstractC5817m41.a("Enum");
        AbstractC5817m41.a("Annotation");
        h = AbstractC5817m41.a("Array");
        C0074As c0074AsA = AbstractC5817m41.a("Boolean");
        C0074As c0074AsA2 = AbstractC5817m41.a("Char");
        C0074As c0074AsA3 = AbstractC5817m41.a("Byte");
        C0074As c0074AsA4 = AbstractC5817m41.a("Short");
        C0074As c0074AsA5 = AbstractC5817m41.a("Int");
        C0074As c0074AsA6 = AbstractC5817m41.a("Long");
        C0074As c0074AsA7 = AbstractC5817m41.a("Float");
        C0074As c0074AsA8 = AbstractC5817m41.a("Double");
        i = AbstractC5817m41.f(c0074AsA3);
        j = AbstractC5817m41.f(c0074AsA4);
        k = AbstractC5817m41.f(c0074AsA5);
        l = AbstractC5817m41.f(c0074AsA6);
        AbstractC5817m41.a("CharSequence");
        m = AbstractC5817m41.a("String");
        AbstractC5817m41.a("Throwable");
        AbstractC5817m41.a("Cloneable");
        AbstractC5817m41.e("KProperty");
        AbstractC5817m41.e("KMutableProperty");
        AbstractC5817m41.e("KProperty0");
        AbstractC5817m41.e("KMutableProperty0");
        AbstractC5817m41.e("KProperty1");
        AbstractC5817m41.e("KMutableProperty1");
        AbstractC5817m41.e("KProperty2");
        AbstractC5817m41.e("KMutableProperty2");
        n = AbstractC5817m41.e("KFunction");
        AbstractC5817m41.e("KClass");
        AbstractC5817m41.e("KCallable");
        AbstractC5817m41.e("KType");
        AbstractC5817m41.a("Comparable");
        AbstractC5817m41.a("Number");
        AbstractC5817m41.a("Function");
        Set setF = J8.F(new C0074As[]{c0074AsA, c0074AsA2, c0074AsA3, c0074AsA4, c0074AsA5, c0074AsA6, c0074AsA7, c0074AsA8});
        o = setF;
        int iB = AbstractC7287tn0.b(AbstractC8449zu.k(setF));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj : setF) {
            C1559Tt0 c1559Tt0I = ((C0074As) obj).i();
            O90.e(c1559Tt0I, "getShortClassName(...)");
            linkedHashMap.put(obj, AbstractC5817m41.d(c1559Tt0I));
        }
        AbstractC5817m41.c(linkedHashMap);
        Set setF2 = J8.F(new C0074As[]{i, j, k, l});
        p = setF2;
        int iB2 = AbstractC7287tn0.b(AbstractC8449zu.k(setF2));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj2 : setF2) {
            C1559Tt0 c1559Tt0I2 = ((C0074As) obj2).i();
            O90.e(c1559Tt0I2, "getShortClassName(...)");
            linkedHashMap2.put(obj2, AbstractC5817m41.d(c1559Tt0I2));
        }
        AbstractC5817m41.c(linkedHashMap2);
        AbstractC7627vZ0.d(AbstractC7627vZ0.c(o, p), m);
        KX kx2 = f;
        C1559Tt0 c1559Tt0E = C1559Tt0.e("Continuation");
        if (kx2 == null) {
            C0074As.a(3);
            throw null;
        }
        KX.j(c1559Tt0E);
        AbstractC5817m41.b("Iterator");
        AbstractC5817m41.b("Iterable");
        AbstractC5817m41.b("Collection");
        AbstractC5817m41.b("List");
        AbstractC5817m41.b("ListIterator");
        AbstractC5817m41.b("Set");
        C0074As c0074AsB = AbstractC5817m41.b("Map");
        AbstractC5817m41.b("MutableIterator");
        AbstractC5817m41.b("CharIterator");
        AbstractC5817m41.b("MutableIterable");
        AbstractC5817m41.b("MutableCollection");
        q = AbstractC5817m41.b("MutableList");
        AbstractC5817m41.b("MutableListIterator");
        r = AbstractC5817m41.b("MutableSet");
        C0074As c0074AsB2 = AbstractC5817m41.b("MutableMap");
        s = c0074AsB2;
        c0074AsB.d(C1559Tt0.e("Entry"));
        c0074AsB2.d(C1559Tt0.e("MutableEntry"));
        AbstractC5817m41.a("Result");
        KX kx3 = d;
        C1559Tt0 c1559Tt0E2 = C1559Tt0.e("IntRange");
        if (kx3 == null) {
            C0074As.a(3);
            throw null;
        }
        KX.j(c1559Tt0E2);
        KX.j(C1559Tt0.e("LongRange"));
        KX.j(C1559Tt0.e("CharRange"));
        KX kx4 = e;
        C1559Tt0 c1559Tt0E3 = C1559Tt0.e("AnnotationRetention");
        if (kx4 == null) {
            C0074As.a(3);
            throw null;
        }
        KX.j(c1559Tt0E3);
        KX.j(C1559Tt0.e("AnnotationTarget"));
        AbstractC5817m41.a("DeprecationLevel");
        t = new C0074As(g, C1559Tt0.e("EnumEntries"));
    }
}
