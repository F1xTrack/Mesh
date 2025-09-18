package p000;

/* renamed from: Pd */
/* loaded from: classes.dex */
public final class C0984Pd implements InterfaceC8333Tp1 {

    /* renamed from: a */
    public final float f9200a;

    /* renamed from: b */
    public final float f9201b;

    /* renamed from: c */
    public final float f9202c;

    /* renamed from: d */
    public final float f9203d;

    public C0984Pd(float f, float f2, float f3, float f4) {
        this.f9200a = f;
        this.f9201b = f2;
        this.f9202c = f3;
        this.f9203d = f4;
    }

    /* renamed from: d */
    public static C0984Pd m6387d(C8385Up1 c8385Up1) {
        return new C0984Pd(c8385Up1.f12157a, c8385Up1.f12158b, c8385Up1.f12159c, c8385Up1.f12160d);
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: a */
    public final float mo6388a() {
        return this.f9201b;
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: b */
    public final float mo6389b() {
        return this.f9202c;
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: c */
    public final float mo6390c() {
        return this.f9200a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0984Pd)) {
            return false;
        }
        C0984Pd c0984Pd = (C0984Pd) obj;
        return Float.floatToIntBits(this.f9200a) == Float.floatToIntBits(c0984Pd.f9200a) && Float.floatToIntBits(this.f9201b) == Float.floatToIntBits(c0984Pd.f9201b) && Float.floatToIntBits(this.f9202c) == Float.floatToIntBits(c0984Pd.f9202c) && Float.floatToIntBits(this.f9203d) == Float.floatToIntBits(c0984Pd.f9203d);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f9200a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f9201b)) * 1000003) ^ Float.floatToIntBits(this.f9202c)) * 1000003) ^ Float.floatToIntBits(this.f9203d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f9200a + ", maxZoomRatio=" + this.f9201b + ", minZoomRatio=" + this.f9202c + ", linearZoom=" + this.f9203d + "}";
    }
}
