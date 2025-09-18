package defpackage;

/* renamed from: Tj1 */
/* loaded from: classes.dex */
public final class C1530Tj1 {
    public static final C1530Tj1 e = new C1530Tj1(0, 0, 0, 1.0f);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
    }

    public C1530Tj1(int i, int i2, int i3, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1530Tj1)) {
            return false;
        }
        C1530Tj1 c1530Tj1 = (C1530Tj1) obj;
        return this.a == c1530Tj1.a && this.b == c1530Tj1.b && this.c == c1530Tj1.c && this.d == c1530Tj1.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
