package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class C5 {
    public static final KX a = new KX("javax.annotation.meta.TypeQualifierNickname");
    public static final KX b = new KX("javax.annotation.meta.TypeQualifier");
    public static final KX c = new KX("javax.annotation.meta.TypeQualifierDefault");
    public static final KX d = new KX("kotlin.annotations.jvm.UnderMigration");
    public static final List e;
    public static final Object f;
    public static final LinkedHashMap g;
    public static final Set h;

    static {
        B5 b5 = B5.c;
        List listF = AbstractC8259yu.f(B5.d, B5.b, b5, B5.f, B5.e);
        e = listF;
        KX kx = AbstractC1196Pc0.c;
        EnumC0321Dw0 enumC0321Dw0 = EnumC0321Dw0.c;
        List list = listF;
        Map mapH = AbstractC7096sn0.h(new Pair(kx, new C1892Ya0(new C0399Ew0(enumC0321Dw0), list, false)), new Pair(AbstractC1196Pc0.f, new C1892Ya0(new C0399Ew0(enumC0321Dw0), list, false)));
        f = mapH;
        g = AbstractC7096sn0.j(AbstractC7096sn0.h(new Pair(new KX("javax.annotation.ParametersAreNullableByDefault"), new C1892Ya0(new C0399Ew0(EnumC0321Dw0.b), AbstractC8259yu.e(b5))), new Pair(new KX("javax.annotation.ParametersAreNonnullByDefault"), new C1892Ya0(new C0399Ew0(enumC0321Dw0), AbstractC8259yu.e(b5)))), mapH);
        h = J8.F(new KX[]{AbstractC1196Pc0.h, AbstractC1196Pc0.i});
    }
}
