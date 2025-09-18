package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: uB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7363uB {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    static {
        new C7363uB("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i = AbstractC0277Dh1.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public C7363uB(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            YN1.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public final C7172tB a() {
        C7172tB c7172tB = new C7172tB();
        c7172tB.a = this.a;
        c7172tB.b = this.d;
        c7172tB.c = this.b;
        c7172tB.d = this.c;
        c7172tB.e = this.e;
        c7172tB.f = this.f;
        c7172tB.g = this.g;
        c7172tB.h = this.h;
        c7172tB.i = this.i;
        c7172tB.j = this.n;
        c7172tB.k = this.o;
        c7172tB.l = this.j;
        c7172tB.m = this.k;
        c7172tB.n = this.l;
        c7172tB.o = this.m;
        c7172tB.p = this.p;
        c7172tB.q = this.q;
        return c7172tB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7363uB.class != obj.getClass()) {
            return false;
        }
        C7363uB c7363uB = (C7363uB) obj;
        if (TextUtils.equals(this.a, c7363uB.a) && this.b == c7363uB.b && this.c == c7363uB.c) {
            Bitmap bitmap = c7363uB.d;
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.e == c7363uB.e && this.f == c7363uB.f && this.g == c7363uB.g && this.h == c7363uB.h && this.i == c7363uB.i && this.j == c7363uB.j && this.k == c7363uB.k && this.l == c7363uB.l && this.m == c7363uB.m && this.n == c7363uB.n && this.o == c7363uB.o && this.p == c7363uB.p && this.q == c7363uB.q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }
}
