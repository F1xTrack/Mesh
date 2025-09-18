package p000;

/* renamed from: Rj */
/* loaded from: classes2.dex */
public final class C1115Rj extends AbstractC10663pY0 {

    /* renamed from: m */
    public static final C1115Rj f10401m;

    static {
        C0217DR c0217dr = new C0217DR();
        AbstractC1556Yj.m9344a(c0217dr);
        C11741y00 c11741y00 = AbstractC1556Yj.f14478a;
        O90.m5967e(c11741y00, "packageFqName");
        C11741y00 c11741y002 = AbstractC1556Yj.f14480c;
        O90.m5967e(c11741y002, "constructorAnnotation");
        C11741y00 c11741y003 = AbstractC1556Yj.f14479b;
        O90.m5967e(c11741y003, "classAnnotation");
        C11741y00 c11741y004 = AbstractC1556Yj.f14481d;
        O90.m5967e(c11741y004, "functionAnnotation");
        C11741y00 c11741y005 = AbstractC1556Yj.f14482e;
        O90.m5967e(c11741y005, "propertyAnnotation");
        C11741y00 c11741y006 = AbstractC1556Yj.f14483f;
        O90.m5967e(c11741y006, "propertyGetterAnnotation");
        C11741y00 c11741y007 = AbstractC1556Yj.f14484g;
        O90.m5967e(c11741y007, "propertySetterAnnotation");
        C11741y00 c11741y008 = AbstractC1556Yj.f14486i;
        O90.m5967e(c11741y008, "enumEntryAnnotation");
        C11741y00 c11741y009 = AbstractC1556Yj.f14485h;
        O90.m5967e(c11741y009, "compileTimeValue");
        C11741y00 c11741y0010 = AbstractC1556Yj.f14487j;
        O90.m5967e(c11741y0010, "parameterAnnotation");
        C11741y00 c11741y0011 = AbstractC1556Yj.f14488k;
        O90.m5967e(c11741y0011, "typeAnnotation");
        C11741y00 c11741y0012 = AbstractC1556Yj.f14489l;
        O90.m5967e(c11741y0012, "typeParameterAnnotation");
        f10401m = new C1115Rj(c0217dr, c11741y00, c11741y002, c11741y003, c11741y004, c11741y005, c11741y006, c11741y007, c11741y008, c11741y009, c11741y0010, c11741y0011, c11741y0012);
    }

    /* renamed from: a */
    public static String m7109a(C0664KX c0664kx) {
        String strM7801b;
        O90.m5968f(c0664kx, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(D51.m1553l(c0664kx.m4654b(), '.', '/'));
        sb.append('/');
        if (c0664kx.m4656d()) {
            strM7801b = "default-package";
        } else {
            strM7801b = c0664kx.m4658f().m7801b();
            O90.m5967e(strM7801b, "asString(...)");
        }
        sb.append(strM7801b.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
