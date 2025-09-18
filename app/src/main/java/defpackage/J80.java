package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class J80 {
    public static final J80 e = new J80(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public J80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static J80 a(J80 j80, J80 j802) {
        return b(Math.max(j80.a, j802.a), Math.max(j80.b, j802.b), Math.max(j80.c, j802.c), Math.max(j80.d, j802.d));
    }

    public static J80 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new J80(i, i2, i3, i4);
    }

    public static J80 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return I80.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J80.class != obj.getClass()) {
            return false;
        }
        J80 j80 = (J80) obj;
        return this.d == j80.d && this.a == j80.a && this.c == j80.c && this.b == j80.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return AbstractC8235ym.l(sb, this.d, '}');
    }
}
