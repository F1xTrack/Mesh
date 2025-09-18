package defpackage;

/* renamed from: Rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1372Rj extends AbstractC6479pY0 {
    public static final C1372Rj m;

    static {
        DR dr = new DR();
        AbstractC1918Yj.a(dr);
        C8089y00 c8089y00 = AbstractC1918Yj.a;
        O90.e(c8089y00, "packageFqName");
        C8089y00 c8089y002 = AbstractC1918Yj.c;
        O90.e(c8089y002, "constructorAnnotation");
        C8089y00 c8089y003 = AbstractC1918Yj.b;
        O90.e(c8089y003, "classAnnotation");
        C8089y00 c8089y004 = AbstractC1918Yj.d;
        O90.e(c8089y004, "functionAnnotation");
        C8089y00 c8089y005 = AbstractC1918Yj.e;
        O90.e(c8089y005, "propertyAnnotation");
        C8089y00 c8089y006 = AbstractC1918Yj.f;
        O90.e(c8089y006, "propertyGetterAnnotation");
        C8089y00 c8089y007 = AbstractC1918Yj.g;
        O90.e(c8089y007, "propertySetterAnnotation");
        C8089y00 c8089y008 = AbstractC1918Yj.i;
        O90.e(c8089y008, "enumEntryAnnotation");
        C8089y00 c8089y009 = AbstractC1918Yj.h;
        O90.e(c8089y009, "compileTimeValue");
        C8089y00 c8089y0010 = AbstractC1918Yj.j;
        O90.e(c8089y0010, "parameterAnnotation");
        C8089y00 c8089y0011 = AbstractC1918Yj.k;
        O90.e(c8089y0011, "typeAnnotation");
        C8089y00 c8089y0012 = AbstractC1918Yj.l;
        O90.e(c8089y0012, "typeParameterAnnotation");
        m = new C1372Rj(dr, c8089y00, c8089y002, c8089y003, c8089y004, c8089y005, c8089y006, c8089y007, c8089y008, c8089y009, c8089y0010, c8089y0011, c8089y0012);
    }

    public static String a(KX kx) {
        String strB;
        O90.f(kx, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(D51.l(kx.b(), '.', '/'));
        sb.append('/');
        if (kx.d()) {
            strB = "default-package";
        } else {
            strB = kx.f().b();
            O90.e(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
