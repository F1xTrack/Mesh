package defpackage;

/* renamed from: nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6168nw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C6168nw(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6168nw)) {
            return false;
        }
        C6168nw c6168nw = (C6168nw) obj;
        return Float.compare(this.a, c6168nw.a) == 0 && Float.compare(this.b, c6168nw.b) == 0 && Float.compare(this.c, c6168nw.c) == 0 && Float.compare(this.d, c6168nw.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ComputedBorderRadius(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
    }
}
