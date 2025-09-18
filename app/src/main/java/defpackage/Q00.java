package defpackage;

/* loaded from: classes2.dex */
public final class Q00 {
    public final int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public Q00(int i, float f, float f2, float f3, float f4) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q00)) {
            return false;
        }
        Q00 q00 = (Q00) obj;
        return this.a == q00.a && Float.compare(this.b, q00.b) == 0 && Float.compare(this.c, q00.c) == 0 && Float.compare(this.d, q00.d) == 0 && Float.compare(this.e, q00.e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) + ((Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (this.a * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PointerData(pointerId=" + this.a + ", x=" + this.b + ", y=" + this.c + ", absoluteX=" + this.d + ", absoluteY=" + this.e + ")";
    }
}
