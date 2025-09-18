package p000;

/* renamed from: Vn */
/* loaded from: classes2.dex */
public final class C1371Vn {

    /* renamed from: a */
    public String f12732a;

    /* renamed from: b */
    public WQ1 f12733b;

    /* renamed from: c */
    public WQ1 f12734c;

    /* renamed from: d */
    public WQ1 f12735d;

    /* renamed from: e */
    public WQ1 f12736e;

    /* renamed from: f */
    public WQ1 f12737f;

    /* renamed from: g */
    public Integer f12738g;

    /* renamed from: h */
    public Integer f12739h;

    /* renamed from: i */
    public boolean f12740i;

    /* renamed from: j */
    public EnumC9693hz0 f12741j;

    /* renamed from: k */
    public C4076fo f12742k;

    /* renamed from: l */
    public boolean f12743l;

    /* renamed from: m */
    public EnumC10926rb1 f12744m;

    /* renamed from: n */
    public final EnumC8373Uj1 f12745n;

    /* renamed from: o */
    public Double f12746o;

    /* renamed from: p */
    public float f12747p;

    /* renamed from: q */
    public boolean f12748q;

    /* renamed from: r */
    public WQ1 f12749r;

    public C1371Vn(String str, WQ1 wq1, WQ1 wq12, WQ1 wq13, WQ1 wq14, WQ1 wq15, Integer num, Integer num2, boolean z, EnumC9693hz0 enumC9693hz0, C4076fo c4076fo, boolean z2, EnumC10926rb1 enumC10926rb1, EnumC8373Uj1 enumC8373Uj1, Double d, float f, boolean z3, WQ1 wq16) {
        O90.m5968f(wq1, "preview");
        O90.m5968f(wq12, "photo");
        O90.m5968f(wq13, "video");
        O90.m5968f(wq14, "frameProcessor");
        O90.m5968f(wq15, "codeScanner");
        O90.m5968f(enumC9693hz0, "outputOrientation");
        O90.m5968f(enumC10926rb1, "torch");
        O90.m5968f(enumC8373Uj1, "videoStabilizationMode");
        O90.m5968f(wq16, "audio");
        this.f12732a = str;
        this.f12733b = wq1;
        this.f12734c = wq12;
        this.f12735d = wq13;
        this.f12736e = wq14;
        this.f12737f = wq15;
        this.f12738g = num;
        this.f12739h = num2;
        this.f12740i = z;
        this.f12741j = enumC9693hz0;
        this.f12742k = c4076fo;
        this.f12743l = z2;
        this.f12744m = enumC10926rb1;
        this.f12745n = enumC8373Uj1;
        this.f12746o = d;
        this.f12747p = f;
        this.f12748q = z3;
        this.f12749r = wq16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1371Vn)) {
            return false;
        }
        C1371Vn c1371Vn = (C1371Vn) obj;
        return O90.m5963a(this.f12732a, c1371Vn.f12732a) && O90.m5963a(this.f12733b, c1371Vn.f12733b) && O90.m5963a(this.f12734c, c1371Vn.f12734c) && O90.m5963a(this.f12735d, c1371Vn.f12735d) && O90.m5963a(this.f12736e, c1371Vn.f12736e) && O90.m5963a(this.f12737f, c1371Vn.f12737f) && O90.m5963a(this.f12738g, c1371Vn.f12738g) && O90.m5963a(this.f12739h, c1371Vn.f12739h) && this.f12740i == c1371Vn.f12740i && this.f12741j == c1371Vn.f12741j && O90.m5963a(this.f12742k, c1371Vn.f12742k) && this.f12743l == c1371Vn.f12743l && this.f12744m == c1371Vn.f12744m && this.f12745n == c1371Vn.f12745n && O90.m5963a(this.f12746o, c1371Vn.f12746o) && Float.compare(this.f12747p, c1371Vn.f12747p) == 0 && this.f12748q == c1371Vn.f12748q && O90.m5963a(this.f12749r, c1371Vn.f12749r);
    }

    public final int hashCode() {
        String str = this.f12732a;
        int iHashCode = (this.f12737f.hashCode() + ((this.f12736e.hashCode() + ((this.f12735d.hashCode() + ((this.f12734c.hashCode() + ((this.f12733b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.f12738g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f12739h;
        int iHashCode3 = (this.f12741j.hashCode() + ((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.f12740i ? 1231 : 1237)) * 31)) * 31;
        C4076fo c4076fo = this.f12742k;
        int iHashCode4 = (this.f12745n.hashCode() + ((this.f12744m.hashCode() + ((((iHashCode3 + (c4076fo == null ? 0 : c4076fo.hashCode())) * 31) + (this.f12743l ? 1231 : 1237)) * 31)) * 31)) * 31;
        Double d = this.f12746o;
        return this.f12749r.hashCode() + ((((Float.floatToIntBits(this.f12747p) + ((iHashCode4 + (d != null ? d.hashCode() : 0)) * 31)) * 31) + (this.f12748q ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "CameraConfiguration(cameraId=" + this.f12732a + ", preview=" + this.f12733b + ", photo=" + this.f12734c + ", video=" + this.f12735d + ", frameProcessor=" + this.f12736e + ", codeScanner=" + this.f12737f + ", minFps=" + this.f12738g + ", maxFps=" + this.f12739h + ", enableLocation=" + this.f12740i + ", outputOrientation=" + this.f12741j + ", format=" + this.f12742k + ", enableLowLightBoost=" + this.f12743l + ", torch=" + this.f12744m + ", videoStabilizationMode=" + this.f12745n + ", exposure=" + this.f12746o + ", zoom=" + this.f12747p + ", isActive=" + this.f12748q + ", audio=" + this.f12749r + ")";
    }
}
