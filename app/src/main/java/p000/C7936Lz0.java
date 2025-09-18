package p000;

/* renamed from: Lz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7936Lz0 {

    /* renamed from: a */
    public final float f6951a;

    /* renamed from: b */
    public final float f6952b;

    public C7936Lz0(float f, float f2) {
        this.f6951a = f;
        this.f6952b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7936Lz0)) {
            return false;
        }
        C7936Lz0 c7936Lz0 = (C7936Lz0) obj;
        return Float.compare(this.f6951a, c7936Lz0.f6951a) == 0 && Float.compare(this.f6952b, c7936Lz0.f6952b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6952b) + (Float.floatToIntBits(this.f6951a) * 31);
    }

    public final String toString() {
        return "PaddingBundle(paddingStart=" + this.f6951a + ", paddingEnd=" + this.f6952b + ")";
    }
}
