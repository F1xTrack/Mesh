package p000;

/* renamed from: Bp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7396Bp0 {

    /* renamed from: a */
    public final C7604Fp0 f1042a;

    /* renamed from: b */
    public final long f1043b;

    /* renamed from: c */
    public final long f1044c;

    /* renamed from: d */
    public final long f1045d;

    /* renamed from: e */
    public final long f1046e;

    /* renamed from: f */
    public final boolean f1047f;

    /* renamed from: g */
    public final boolean f1048g;

    /* renamed from: h */
    public final boolean f1049h;

    /* renamed from: i */
    public final boolean f1050i;

    public C7396Bp0(C7604Fp0 c7604Fp0, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        YN1.m9278c(!z4 || z2);
        YN1.m9278c(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        YN1.m9278c(z5);
        this.f1042a = c7604Fp0;
        this.f1043b = j;
        this.f1044c = j2;
        this.f1045d = j3;
        this.f1046e = j4;
        this.f1047f = z;
        this.f1048g = z2;
        this.f1049h = z3;
        this.f1050i = z4;
    }

    /* renamed from: a */
    public final C7396Bp0 m882a(long j) {
        if (j == this.f1044c) {
            return this;
        }
        return new C7396Bp0(this.f1042a, this.f1043b, j, this.f1045d, this.f1046e, this.f1047f, this.f1048g, this.f1049h, this.f1050i);
    }

    /* renamed from: b */
    public final C7396Bp0 m883b(long j) {
        if (j == this.f1043b) {
            return this;
        }
        return new C7396Bp0(this.f1042a, j, this.f1044c, this.f1045d, this.f1046e, this.f1047f, this.f1048g, this.f1049h, this.f1050i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7396Bp0.class != obj.getClass()) {
            return false;
        }
        C7396Bp0 c7396Bp0 = (C7396Bp0) obj;
        return this.f1043b == c7396Bp0.f1043b && this.f1044c == c7396Bp0.f1044c && this.f1045d == c7396Bp0.f1045d && this.f1046e == c7396Bp0.f1046e && this.f1047f == c7396Bp0.f1047f && this.f1048g == c7396Bp0.f1048g && this.f1049h == c7396Bp0.f1049h && this.f1050i == c7396Bp0.f1050i && AbstractC7485Dh1.m1812a(this.f1042a, c7396Bp0.f1042a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f1042a.hashCode() + 527) * 31) + ((int) this.f1043b)) * 31) + ((int) this.f1044c)) * 31) + ((int) this.f1045d)) * 31) + ((int) this.f1046e)) * 31) + (this.f1047f ? 1 : 0)) * 31) + (this.f1048g ? 1 : 0)) * 31) + (this.f1049h ? 1 : 0)) * 31) + (this.f1050i ? 1 : 0);
    }
}
