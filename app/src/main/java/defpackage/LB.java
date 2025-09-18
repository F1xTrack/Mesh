package defpackage;

import kotlin.Lazy;

/* loaded from: classes.dex */
public abstract class LB {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static F71 b(InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "initializer");
        return new F71(interfaceC5908mZ);
    }

    public static Lazy c(EnumC4205hi0 enumC4205hi0, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "initializer");
        int iOrdinal = enumC4205hi0.ordinal();
        if (iOrdinal == 0) {
            return new F71(interfaceC5908mZ);
        }
        C7304tt c7304tt = C7304tt.g;
        if (iOrdinal == 1) {
            YU0 yu0 = new YU0();
            yu0.a = interfaceC5908mZ;
            yu0.b = c7304tt;
            return yu0;
        }
        if (iOrdinal != 2) {
            throw new C7074sg();
        }
        C0352Eg1 c0352Eg1 = new C0352Eg1();
        c0352Eg1.a = interfaceC5908mZ;
        c0352Eg1.b = c7304tt;
        return c0352Eg1;
    }
}
