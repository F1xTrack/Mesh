package defpackage;

/* renamed from: Lz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0953Lz0 {
    public final float a;
    public final float b;

    public C0953Lz0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953Lz0)) {
            return false;
        }
        C0953Lz0 c0953Lz0 = (C0953Lz0) obj;
        return Float.compare(this.a, c0953Lz0.a) == 0 && Float.compare(this.b, c0953Lz0.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "PaddingBundle(paddingStart=" + this.a + ", paddingEnd=" + this.b + ")";
    }
}
