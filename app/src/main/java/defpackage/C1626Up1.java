package defpackage;

/* renamed from: Up1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626Up1 implements InterfaceC1548Tp1 {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public C1626Up1(float f, float f2) {
        this.b = f;
        this.c = f2;
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

    public final void d(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.a = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }
}
