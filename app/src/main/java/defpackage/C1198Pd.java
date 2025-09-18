package defpackage;

/* renamed from: Pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198Pd implements InterfaceC1548Tp1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C1198Pd(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static C1198Pd d(C1626Up1 c1626Up1) {
        return new C1198Pd(c1626Up1.a, c1626Up1.b, c1626Up1.c, c1626Up1.d);
    }

    @Override // defpackage.InterfaceC1548Tp1
    public final float a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC1548Tp1
    public final float b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC1548Tp1
    public final float c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1198Pd)) {
            return false;
        }
        C1198Pd c1198Pd = (C1198Pd) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(c1198Pd.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(c1198Pd.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(c1198Pd.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(c1198Pd.d);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
