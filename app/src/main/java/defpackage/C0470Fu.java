package defpackage;

import java.util.Arrays;

/* renamed from: Fu */
/* loaded from: classes.dex */
public final class C0470Fu {
    public static final C0470Fu h = new C0470Fu(1, 2, 3, -1, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
    }

    public C0470Fu(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC7209tN0.u(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC7209tN0.u(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC7209tN0.u(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C0470Fu c0470Fu) {
        int i;
        int i2;
        int i3;
        int i4;
        if (c0470Fu == null) {
            return true;
        }
        int i5 = c0470Fu.a;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = c0470Fu.b) == -1 || i == 2) && (((i2 = c0470Fu.c) == -1 || i2 == 3) && c0470Fu.d == null && (((i3 = c0470Fu.f) == -1 || i3 == 8) && ((i4 = c0470Fu.e) == -1 || i4 == 8)));
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0470Fu.class != obj.getClass()) {
            return false;
        }
        C0470Fu c0470Fu = (C0470Fu) obj;
        return this.a == c0470Fu.a && this.b == c0470Fu.b && this.c == c0470Fu.c && Arrays.equals(this.d, c0470Fu.d) && this.e == c0470Fu.e && this.f == c0470Fu.f;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC1705Vq.l(sb, str2, ")");
    }
}
