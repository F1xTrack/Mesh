package defpackage;

import java.util.Set;
import kotlin.Pair;

/* renamed from: wy0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7892wy0 {
    public static final C1559Tt0 a;
    public static final C1559Tt0 b;
    public static final C1559Tt0 c;
    public static final C1559Tt0 d;
    public static final C1559Tt0 e;
    public static final C1559Tt0 f;
    public static final C1559Tt0 g;
    public static final C1559Tt0 h;
    public static final C1559Tt0 i;
    public static final C1559Tt0 j;
    public static final C1559Tt0 k;
    public static final C1559Tt0 l;
    public static final C2512cQ0 m;
    public static final C1559Tt0 n;
    public static final C1559Tt0 o;
    public static final C1559Tt0 p;
    public static final C1559Tt0 q;
    public static final Set r;
    public static final Set s;
    public static final Set t;

    static {
        C1559Tt0 c1559Tt0E = C1559Tt0.e("getValue");
        a = c1559Tt0E;
        C1559Tt0 c1559Tt0E2 = C1559Tt0.e("setValue");
        b = c1559Tt0E2;
        C1559Tt0 c1559Tt0E3 = C1559Tt0.e("provideDelegate");
        c = c1559Tt0E3;
        C1559Tt0 c1559Tt0E4 = C1559Tt0.e("equals");
        d = c1559Tt0E4;
        C1559Tt0.e("hashCode");
        C1559Tt0 c1559Tt0E5 = C1559Tt0.e("compareTo");
        e = c1559Tt0E5;
        C1559Tt0 c1559Tt0E6 = C1559Tt0.e("contains");
        f = c1559Tt0E6;
        g = C1559Tt0.e("invoke");
        h = C1559Tt0.e("iterator");
        i = C1559Tt0.e("get");
        C1559Tt0 c1559Tt0E7 = C1559Tt0.e("set");
        j = c1559Tt0E7;
        k = C1559Tt0.e("next");
        l = C1559Tt0.e("hasNext");
        C1559Tt0.e("toString");
        m = new C2512cQ0("component\\d+");
        C1559Tt0 c1559Tt0E8 = C1559Tt0.e("and");
        C1559Tt0 c1559Tt0E9 = C1559Tt0.e("or");
        C1559Tt0 c1559Tt0E10 = C1559Tt0.e("xor");
        C1559Tt0 c1559Tt0E11 = C1559Tt0.e("inv");
        C1559Tt0 c1559Tt0E12 = C1559Tt0.e("shl");
        C1559Tt0 c1559Tt0E13 = C1559Tt0.e("shr");
        C1559Tt0 c1559Tt0E14 = C1559Tt0.e("ushr");
        C1559Tt0 c1559Tt0E15 = C1559Tt0.e("inc");
        n = c1559Tt0E15;
        C1559Tt0 c1559Tt0E16 = C1559Tt0.e("dec");
        o = c1559Tt0E16;
        C1559Tt0 c1559Tt0E17 = C1559Tt0.e("plus");
        C1559Tt0 c1559Tt0E18 = C1559Tt0.e("minus");
        C1559Tt0 c1559Tt0E19 = C1559Tt0.e("not");
        C1559Tt0 c1559Tt0E20 = C1559Tt0.e("unaryMinus");
        C1559Tt0 c1559Tt0E21 = C1559Tt0.e("unaryPlus");
        C1559Tt0 c1559Tt0E22 = C1559Tt0.e("times");
        C1559Tt0 c1559Tt0E23 = C1559Tt0.e("div");
        C1559Tt0 c1559Tt0E24 = C1559Tt0.e("mod");
        C1559Tt0 c1559Tt0E25 = C1559Tt0.e("rem");
        C1559Tt0 c1559Tt0E26 = C1559Tt0.e("rangeTo");
        p = c1559Tt0E26;
        C1559Tt0 c1559Tt0E27 = C1559Tt0.e("rangeUntil");
        q = c1559Tt0E27;
        C1559Tt0 c1559Tt0E28 = C1559Tt0.e("timesAssign");
        C1559Tt0 c1559Tt0E29 = C1559Tt0.e("divAssign");
        C1559Tt0 c1559Tt0E30 = C1559Tt0.e("modAssign");
        C1559Tt0 c1559Tt0E31 = C1559Tt0.e("remAssign");
        C1559Tt0 c1559Tt0E32 = C1559Tt0.e("plusAssign");
        C1559Tt0 c1559Tt0E33 = C1559Tt0.e("minusAssign");
        J8.F(new C1559Tt0[]{c1559Tt0E15, c1559Tt0E16, c1559Tt0E21, c1559Tt0E20, c1559Tt0E19, c1559Tt0E11});
        r = J8.F(new C1559Tt0[]{c1559Tt0E21, c1559Tt0E20, c1559Tt0E19, c1559Tt0E11});
        Set setF = J8.F(new C1559Tt0[]{c1559Tt0E22, c1559Tt0E17, c1559Tt0E18, c1559Tt0E23, c1559Tt0E24, c1559Tt0E25, c1559Tt0E26, c1559Tt0E27});
        s = setF;
        AbstractC7627vZ0.c(AbstractC7627vZ0.c(setF, J8.F(new C1559Tt0[]{c1559Tt0E8, c1559Tt0E9, c1559Tt0E10, c1559Tt0E11, c1559Tt0E12, c1559Tt0E13, c1559Tt0E14})), J8.F(new C1559Tt0[]{c1559Tt0E4, c1559Tt0E6, c1559Tt0E5}));
        Set setF2 = J8.F(new C1559Tt0[]{c1559Tt0E28, c1559Tt0E29, c1559Tt0E30, c1559Tt0E31, c1559Tt0E32, c1559Tt0E33});
        t = setF2;
        J8.F(new C1559Tt0[]{c1559Tt0E, c1559Tt0E2, c1559Tt0E3});
        AbstractC7096sn0.h(new Pair(c1559Tt0E24, c1559Tt0E25), new Pair(c1559Tt0E30, c1559Tt0E31));
        AbstractC7627vZ0.c(AbstractC7627vZ0.e(c1559Tt0E7), setF2);
    }
}
