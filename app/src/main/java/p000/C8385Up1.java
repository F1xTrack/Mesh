package p000;

/* renamed from: Up1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8385Up1 implements InterfaceC8333Tp1 {

    /* renamed from: a */
    public float f12157a;

    /* renamed from: b */
    public final float f12158b;

    /* renamed from: c */
    public final float f12159c;

    /* renamed from: d */
    public float f12160d;

    public C8385Up1(float f, float f2) {
        this.f12158b = f;
        this.f12159c = f2;
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: a */
    public final float mo6388a() {
        return this.f12158b;
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: b */
    public final float mo6389b() {
        return this.f12159c;
    }

    @Override // p000.InterfaceC8333Tp1
    /* renamed from: c */
    public final float mo6390c() {
        return this.f12157a;
    }

    /* renamed from: d */
    public final void m8186d(float f) {
        float f2 = this.f12158b;
        float f3 = this.f12159c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.f12157a = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.f12160d = f4;
    }
}
