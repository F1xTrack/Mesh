package p000;

/* renamed from: nw */
/* loaded from: classes.dex */
public final class C6520nw {

    /* renamed from: a */
    public final float f38613a;

    /* renamed from: b */
    public final float f38614b;

    /* renamed from: c */
    public final float f38615c;

    /* renamed from: d */
    public final float f38616d;

    public C6520nw(float f, float f2, float f3, float f4) {
        this.f38613a = f;
        this.f38614b = f2;
        this.f38615c = f3;
        this.f38616d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6520nw)) {
            return false;
        }
        C6520nw c6520nw = (C6520nw) obj;
        return Float.compare(this.f38613a, c6520nw.f38613a) == 0 && Float.compare(this.f38614b, c6520nw.f38614b) == 0 && Float.compare(this.f38615c, c6520nw.f38615c) == 0 && Float.compare(this.f38616d, c6520nw.f38616d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f38616d) + ((Float.floatToIntBits(this.f38615c) + ((Float.floatToIntBits(this.f38614b) + (Float.floatToIntBits(this.f38613a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f38613a + ", topRight=" + this.f38614b + ", bottomLeft=" + this.f38615c + ", bottomRight=" + this.f38616d + ")";
    }
}
