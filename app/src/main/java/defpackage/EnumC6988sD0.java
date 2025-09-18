package defpackage;

import java.util.Set;

/* renamed from: sD0 */
/* loaded from: classes2.dex */
public final class EnumC6988sD0 extends Enum {
    public static final Set e;
    public static final EnumC6988sD0 f;
    public static final EnumC6988sD0 g;
    public static final EnumC6988sD0 h;
    public static final EnumC6988sD0 i;
    public static final EnumC6988sD0 j;
    public static final EnumC6988sD0 k;
    public static final EnumC6988sD0 l;
    public static final EnumC6988sD0 m;
    public static final /* synthetic */ EnumC6988sD0[] n;
    public final C1559Tt0 a;
    public final C1559Tt0 b;
    public final Object c;
    public final Object d;

    static {
        EnumC6988sD0 enumC6988sD0 = new EnumC6988sD0("BOOLEAN", 0, "Boolean");
        f = enumC6988sD0;
        EnumC6988sD0 enumC6988sD02 = new EnumC6988sD0("CHAR", 1, "Char");
        g = enumC6988sD02;
        EnumC6988sD0 enumC6988sD03 = new EnumC6988sD0("BYTE", 2, "Byte");
        h = enumC6988sD03;
        EnumC6988sD0 enumC6988sD04 = new EnumC6988sD0("SHORT", 3, "Short");
        i = enumC6988sD04;
        EnumC6988sD0 enumC6988sD05 = new EnumC6988sD0("INT", 4, "Int");
        j = enumC6988sD05;
        EnumC6988sD0 enumC6988sD06 = new EnumC6988sD0("FLOAT", 5, "Float");
        k = enumC6988sD06;
        EnumC6988sD0 enumC6988sD07 = new EnumC6988sD0("LONG", 6, "Long");
        l = enumC6988sD07;
        EnumC6988sD0 enumC6988sD08 = new EnumC6988sD0("DOUBLE", 7, "Double");
        m = enumC6988sD08;
        EnumC6988sD0[] enumC6988sD0Arr = {enumC6988sD0, enumC6988sD02, enumC6988sD03, enumC6988sD04, enumC6988sD05, enumC6988sD06, enumC6988sD07, enumC6988sD08};
        n = enumC6988sD0Arr;
        F02.c(enumC6988sD0Arr);
        e = J8.F(new EnumC6988sD0[]{enumC6988sD02, enumC6988sD03, enumC6988sD04, enumC6988sD05, enumC6988sD06, enumC6988sD07, enumC6988sD08});
    }

    public EnumC6988sD0(String str, int i2, String str2) {
        super(str, i2);
        this.a = C1559Tt0.e(str2);
        this.b = C1559Tt0.e(str2.concat("Array"));
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.b;
        this.c = LB.c(enumC4205hi0, new C6797rD0(this, 1));
        this.d = LB.c(enumC4205hi0, new C6797rD0(this, 0));
    }

    public static EnumC6988sD0 valueOf(String str) {
        return (EnumC6988sD0) Enum.valueOf(EnumC6988sD0.class, str);
    }

    public static EnumC6988sD0[] values() {
        return (EnumC6988sD0[]) n.clone();
    }
}
