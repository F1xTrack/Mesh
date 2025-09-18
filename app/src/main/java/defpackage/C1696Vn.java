package defpackage;

/* renamed from: Vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1696Vn {
    public String a;
    public WQ1 b;
    public WQ1 c;
    public WQ1 d;
    public WQ1 e;
    public WQ1 f;
    public Integer g;
    public Integer h;
    public boolean i;
    public EnumC4256hz0 j;
    public C3840fo k;
    public boolean l;
    public EnumC6870rb1 m;
    public final EnumC1608Uj1 n;
    public Double o;
    public float p;
    public boolean q;
    public WQ1 r;

    public C1696Vn(String str, WQ1 wq1, WQ1 wq12, WQ1 wq13, WQ1 wq14, WQ1 wq15, Integer num, Integer num2, boolean z, EnumC4256hz0 enumC4256hz0, C3840fo c3840fo, boolean z2, EnumC6870rb1 enumC6870rb1, EnumC1608Uj1 enumC1608Uj1, Double d, float f, boolean z3, WQ1 wq16) {
        O90.f(wq1, "preview");
        O90.f(wq12, "photo");
        O90.f(wq13, "video");
        O90.f(wq14, "frameProcessor");
        O90.f(wq15, "codeScanner");
        O90.f(enumC4256hz0, "outputOrientation");
        O90.f(enumC6870rb1, "torch");
        O90.f(enumC1608Uj1, "videoStabilizationMode");
        O90.f(wq16, "audio");
        this.a = str;
        this.b = wq1;
        this.c = wq12;
        this.d = wq13;
        this.e = wq14;
        this.f = wq15;
        this.g = num;
        this.h = num2;
        this.i = z;
        this.j = enumC4256hz0;
        this.k = c3840fo;
        this.l = z2;
        this.m = enumC6870rb1;
        this.n = enumC1608Uj1;
        this.o = d;
        this.p = f;
        this.q = z3;
        this.r = wq16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696Vn)) {
            return false;
        }
        C1696Vn c1696Vn = (C1696Vn) obj;
        return O90.a(this.a, c1696Vn.a) && O90.a(this.b, c1696Vn.b) && O90.a(this.c, c1696Vn.c) && O90.a(this.d, c1696Vn.d) && O90.a(this.e, c1696Vn.e) && O90.a(this.f, c1696Vn.f) && O90.a(this.g, c1696Vn.g) && O90.a(this.h, c1696Vn.h) && this.i == c1696Vn.i && this.j == c1696Vn.j && O90.a(this.k, c1696Vn.k) && this.l == c1696Vn.l && this.m == c1696Vn.m && this.n == c1696Vn.n && O90.a(this.o, c1696Vn.o) && Float.compare(this.p, c1696Vn.p) == 0 && this.q == c1696Vn.q && O90.a(this.r, c1696Vn.r);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode3 = (this.j.hashCode() + ((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.i ? 1231 : 1237)) * 31)) * 31;
        C3840fo c3840fo = this.k;
        int iHashCode4 = (this.n.hashCode() + ((this.m.hashCode() + ((((iHashCode3 + (c3840fo == null ? 0 : c3840fo.hashCode())) * 31) + (this.l ? 1231 : 1237)) * 31)) * 31)) * 31;
        Double d = this.o;
        return this.r.hashCode() + ((((Float.floatToIntBits(this.p) + ((iHashCode4 + (d != null ? d.hashCode() : 0)) * 31)) * 31) + (this.q ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "CameraConfiguration(cameraId=" + this.a + ", preview=" + this.b + ", photo=" + this.c + ", video=" + this.d + ", frameProcessor=" + this.e + ", codeScanner=" + this.f + ", minFps=" + this.g + ", maxFps=" + this.h + ", enableLocation=" + this.i + ", outputOrientation=" + this.j + ", format=" + this.k + ", enableLowLightBoost=" + this.l + ", torch=" + this.m + ", videoStabilizationMode=" + this.n + ", exposure=" + this.o + ", zoom=" + this.p + ", isActive=" + this.q + ", audio=" + this.r + ")";
    }
}
