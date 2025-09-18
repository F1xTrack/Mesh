package p000;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class J80 {

    /* renamed from: e */
    public static final J80 f5351e = new J80(0, 0, 0, 0);

    /* renamed from: a */
    public final int f5352a;

    /* renamed from: b */
    public final int f5353b;

    /* renamed from: c */
    public final int f5354c;

    /* renamed from: d */
    public final int f5355d;

    public J80(int i, int i2, int i3, int i4) {
        this.f5352a = i;
        this.f5353b = i2;
        this.f5354c = i3;
        this.f5355d = i4;
    }

    /* renamed from: a */
    public static J80 m4200a(J80 j80, J80 j802) {
        return m4201b(Math.max(j80.f5352a, j802.f5352a), Math.max(j80.f5353b, j802.f5353b), Math.max(j80.f5354c, j802.f5354c), Math.max(j80.f5355d, j802.f5355d));
    }

    /* renamed from: b */
    public static J80 m4201b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f5351e : new J80(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static J80 m4202c(Insets insets) {
        return m4201b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: d */
    public final Insets m4203d() {
        return I80.m3761a(this.f5352a, this.f5353b, this.f5354c, this.f5355d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J80.class != obj.getClass()) {
            return false;
        }
        J80 j80 = (J80) obj;
        return this.f5355d == j80.f5355d && this.f5352a == j80.f5352a && this.f5354c == j80.f5354c && this.f5353b == j80.f5353b;
    }

    public final int hashCode() {
        return (((((this.f5352a * 31) + this.f5353b) * 31) + this.f5354c) * 31) + this.f5355d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f5352a);
        sb.append(", top=");
        sb.append(this.f5353b);
        sb.append(", right=");
        sb.append(this.f5354c);
        sb.append(", bottom=");
        return AbstractC7222ym.m26235l(sb, this.f5355d, '}');
    }
}
