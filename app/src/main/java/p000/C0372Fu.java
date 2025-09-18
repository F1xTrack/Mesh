package p000;

import java.util.Arrays;

/* renamed from: Fu */
/* loaded from: classes.dex */
public final class C0372Fu {

    /* renamed from: h */
    public static final C0372Fu f3463h = new C0372Fu(1, 2, 3, -1, -1, null);

    /* renamed from: a */
    public final int f3464a;

    /* renamed from: b */
    public final int f3465b;

    /* renamed from: c */
    public final int f3466c;

    /* renamed from: d */
    public final byte[] f3467d;

    /* renamed from: e */
    public final int f3468e;

    /* renamed from: f */
    public final int f3469f;

    /* renamed from: g */
    public int f3470g;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
    }

    public C0372Fu(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f3464a = i;
        this.f3465b = i2;
        this.f3466c = i3;
        this.f3467d = bArr;
        this.f3468e = i4;
        this.f3469f = i5;
    }

    /* renamed from: a */
    public static String m2816a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? AbstractC11153tN0.m24909u(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    /* renamed from: b */
    public static String m2817b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? AbstractC11153tN0.m24909u(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    /* renamed from: c */
    public static String m2818c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? AbstractC11153tN0.m24909u(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    /* renamed from: e */
    public static boolean m2819e(C0372Fu c0372Fu) {
        int i;
        int i2;
        int i3;
        int i4;
        if (c0372Fu == null) {
            return true;
        }
        int i5 = c0372Fu.f3464a;
        return (i5 == -1 || i5 == 1 || i5 == 2) && ((i = c0372Fu.f3465b) == -1 || i == 2) && (((i2 = c0372Fu.f3466c) == -1 || i2 == 3) && c0372Fu.f3467d == null && (((i3 = c0372Fu.f3469f) == -1 || i3 == 8) && ((i4 = c0372Fu.f3468e) == -1 || i4 == 8)));
    }

    /* renamed from: f */
    public static int m2820f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: g */
    public static int m2821g(int i) {
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

    /* renamed from: d */
    public final boolean m2822d() {
        return (this.f3464a == -1 || this.f3465b == -1 || this.f3466c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0372Fu.class != obj.getClass()) {
            return false;
        }
        C0372Fu c0372Fu = (C0372Fu) obj;
        return this.f3464a == c0372Fu.f3464a && this.f3465b == c0372Fu.f3465b && this.f3466c == c0372Fu.f3466c && Arrays.equals(this.f3467d, c0372Fu.f3467d) && this.f3468e == c0372Fu.f3468e && this.f3469f == c0372Fu.f3469f;
    }

    public final int hashCode() {
        if (this.f3470g == 0) {
            this.f3470g = ((((Arrays.hashCode(this.f3467d) + ((((((527 + this.f3464a) * 31) + this.f3465b) * 31) + this.f3466c) * 31)) * 31) + this.f3468e) * 31) + this.f3469f;
        }
        return this.f3470g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m2817b(this.f3464a));
        sb.append(", ");
        sb.append(m2816a(this.f3465b));
        sb.append(", ");
        sb.append(m2818c(this.f3466c));
        sb.append(", ");
        sb.append(this.f3467d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f3468e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f3469f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC1374Vq.m8593l(sb, str2, ")");
    }
}
