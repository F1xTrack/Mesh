package defpackage;

/* loaded from: classes.dex */
public final class U4 extends Enum {
    public static final C5806m12 a;
    public static final U4 b;
    public static final U4 c;
    public static final U4 d;
    public static final U4 e;
    public static final /* synthetic */ U4[] f;

    static {
        U4 u4 = new U4("OPACITY", 0);
        b = u4;
        U4 u42 = new U4("SCALE_X", 1);
        c = u42;
        U4 u43 = new U4("SCALE_Y", 2);
        d = u43;
        U4 u44 = new U4("SCALE_XY", 3);
        e = u44;
        U4[] u4Arr = {u4, u42, u43, u44};
        f = u4Arr;
        F02.c(u4Arr);
        a = new C5806m12(7);
    }

    public static U4 valueOf(String str) {
        return (U4) Enum.valueOf(U4.class, str);
    }

    public static U4[] values() {
        return (U4[]) f.clone();
    }
}
