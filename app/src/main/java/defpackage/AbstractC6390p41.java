package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: p41 */
/* loaded from: classes2.dex */
public abstract class AbstractC6390p41 {
    public static final KX A;
    public static final KX B;
    public static final KX C;
    public static final KX D;
    public static final KX E;
    public static final KX F;
    public static final KX G;
    public static final KX H;
    public static final KX I;
    public static final KX J;
    public static final KX K;
    public static final KX L;
    public static final KX M;
    public static final KX N;
    public static final KX O;
    public static final MX P;
    public static final C0074As Q;
    public static final C0074As R;
    public static final C0074As S;
    public static final C0074As T;
    public static final C0074As U;
    public static final KX V;
    public static final KX W;
    public static final KX X;
    public static final KX Y;
    public static final HashSet Z;
    public static final HashSet a0;
    public static final HashMap b0;
    public static final HashMap c0;
    public static final MX d;
    public static final MX e;
    public static final MX f;
    public static final MX g;
    public static final MX h;
    public static final MX i;
    public static final MX j;
    public static final KX k;
    public static final KX l;
    public static final KX m;
    public static final KX n;
    public static final KX o;
    public static final KX p;
    public static final KX q;
    public static final KX r;
    public static final KX s;
    public static final KX t;
    public static final KX u;
    public static final KX v;
    public static final KX w;
    public static final KX x;
    public static final KX y;
    public static final KX z;
    public static final MX a = d("Any");
    public static final MX b = d("Nothing");
    public static final MX c = d("Cloneable");

    static {
        c("Suppress");
        d = d("Unit");
        e = d("CharSequence");
        f = d("String");
        g = d("Array");
        h = d("Boolean");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number");
        j = d("Enum");
        d("Function");
        k = c("Throwable");
        l = c("Comparable");
        KX kx = AbstractC6581q41.o;
        O90.e(kx.c(C1559Tt0.e("IntRange")).i(), "toUnsafe(...)");
        O90.e(kx.c(C1559Tt0.e("LongRange")).i(), "toUnsafe(...)");
        m = c("Deprecated");
        c("DeprecatedSinceKotlin");
        n = c("DeprecationLevel");
        o = c("ReplaceWith");
        p = c("ExtensionFunctionType");
        q = c("ContextFunctionTypeParams");
        KX kxC = c("ParameterName");
        r = kxC;
        C0074As.j(kxC);
        s = c("Annotation");
        KX kxA = a("Target");
        t = kxA;
        C0074As.j(kxA);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        KX kxA2 = a("Retention");
        w = kxA2;
        C0074As.j(kxA2);
        C0074As.j(a("Repeatable"));
        x = a("MustBeDocumented");
        y = c("UnsafeVariance");
        c("PublishedApi");
        AbstractC6581q41.p.c(C1559Tt0.e("AccessibleLateinitPropertyLiteral"));
        z = b("Iterator");
        A = b("Iterable");
        B = b("Collection");
        C = b("List");
        D = b("ListIterator");
        E = b("Set");
        KX kxB = b("Map");
        F = kxB;
        G = kxB.c(C1559Tt0.e("Entry"));
        H = b("MutableIterator");
        I = b("MutableIterable");
        J = b("MutableCollection");
        K = b("MutableList");
        L = b("MutableListIterator");
        M = b("MutableSet");
        KX kxB2 = b("MutableMap");
        N = kxB2;
        O = kxB2.c(C1559Tt0.e("MutableEntry"));
        P = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        MX mxE = e("KProperty");
        e("KMutableProperty");
        Q = C0074As.j(mxE.g());
        e("KDeclarationContainer");
        KX kxC2 = c("UByte");
        KX kxC3 = c("UShort");
        KX kxC4 = c("UInt");
        KX kxC5 = c("ULong");
        R = C0074As.j(kxC2);
        S = C0074As.j(kxC3);
        T = C0074As.j(kxC4);
        U = C0074As.j(kxC5);
        V = c("UByteArray");
        W = c("UShortArray");
        X = c("UIntArray");
        Y = c("ULongArray");
        int length = EnumC6988sD0.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (EnumC6988sD0 enumC6988sD0 : EnumC6988sD0.values()) {
            hashSet.add(enumC6988sD0.a);
        }
        Z = hashSet;
        int length2 = EnumC6988sD0.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (EnumC6988sD0 enumC6988sD02 : EnumC6988sD0.values()) {
            hashSet2.add(enumC6988sD02.b);
        }
        a0 = hashSet2;
        int length3 = EnumC6988sD0.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (EnumC6988sD0 enumC6988sD03 : EnumC6988sD0.values()) {
            String strB = enumC6988sD03.a.b();
            O90.e(strB, "asString(...)");
            map.put(d(strB), enumC6988sD03);
        }
        b0 = map;
        int length4 = EnumC6988sD0.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (EnumC6988sD0 enumC6988sD04 : EnumC6988sD0.values()) {
            String strB2 = enumC6988sD04.b.b();
            O90.e(strB2, "asString(...)");
            map2.put(d(strB2), enumC6988sD04);
        }
        c0 = map2;
    }

    public static KX a(String str) {
        return AbstractC6581q41.m.c(C1559Tt0.e(str));
    }

    public static KX b(String str) {
        return AbstractC6581q41.n.c(C1559Tt0.e(str));
    }

    public static KX c(String str) {
        return AbstractC6581q41.l.c(C1559Tt0.e(str));
    }

    public static MX d(String str) {
        MX mxI = c(str).i();
        O90.e(mxI, "toUnsafe(...)");
        return mxI;
    }

    public static final MX e(String str) {
        MX mxI = AbstractC6581q41.i.c(C1559Tt0.e(str)).i();
        O90.e(mxI, "toUnsafe(...)");
        return mxI;
    }
}
