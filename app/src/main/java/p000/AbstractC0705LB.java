package p000;

import kotlin.Lazy;

/* renamed from: LB */
/* loaded from: classes.dex */
public abstract class AbstractC0705LB {

    /* renamed from: a */
    public static final int[] f6529a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f6530b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f6531c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f6532d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f6533e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f6534f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m4914a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f6530b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f6534f[i3]) * 2;
        }
        int i5 = f6533e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: b */
    public static F71 m4915b(InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC6434mZ, "initializer");
        return new F71(interfaceC6434mZ);
    }

    /* renamed from: c */
    public static Lazy m4916c(EnumC9659hi0 enumC9659hi0, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC6434mZ, "initializer");
        int iOrdinal = enumC9659hi0.ordinal();
        if (iOrdinal == 0) {
            return new F71(interfaceC6434mZ);
        }
        C6914tt c6914tt = C6914tt.f43396g;
        if (iOrdinal == 1) {
            YU0 yu0 = new YU0();
            yu0.f14316a = interfaceC6434mZ;
            yu0.f14317b = c6914tt;
            return yu0;
        }
        if (iOrdinal != 2) {
            throw new C6838sg();
        }
        C7535Eg1 c7535Eg1 = new C7535Eg1();
        c7535Eg1.f2837a = interfaceC6434mZ;
        c7535Eg1.f2838b = c6914tt;
        return c7535Eg1;
    }
}
