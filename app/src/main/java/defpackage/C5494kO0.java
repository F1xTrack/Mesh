package defpackage;

/* renamed from: kO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5494kO0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C5494kO0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5494kO0)) {
            return false;
        }
        C5494kO0 c5494kO0 = (C5494kO0) obj;
        return Float.compare(this.a, c5494kO0.a) == 0 && Float.compare(this.b, c5494kO0.b) == 0 && Float.compare(this.c, c5494kO0.c) == 0 && Float.compare(this.d, c5494kO0.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Rect(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
