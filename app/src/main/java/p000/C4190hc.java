package p000;

/* renamed from: hc */
/* loaded from: classes.dex */
public final class C4190hc {

    /* renamed from: a */
    public int f28472a;

    /* renamed from: b */
    public int f28473b;

    /* renamed from: c */
    public float f28474c;

    /* renamed from: d */
    public float f28475d;

    /* renamed from: e */
    public long f28476e;

    /* renamed from: f */
    public long f28477f;

    /* renamed from: g */
    public long f28478g;

    /* renamed from: h */
    public float f28479h;

    /* renamed from: i */
    public int f28480i;

    /* renamed from: a */
    public final float m18841a(long j) {
        if (j < this.f28476e) {
            return 0.0f;
        }
        long j2 = this.f28478g;
        if (j2 < 0 || j < j2) {
            return ViewOnTouchListenerC7748Ij0.m3976b((j - r0) / this.f28472a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f28479h;
        return (ViewOnTouchListenerC7748Ij0.m3976b((j - j2) / this.f28480i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
