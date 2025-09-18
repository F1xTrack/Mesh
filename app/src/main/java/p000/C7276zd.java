package p000;

/* renamed from: zd */
/* loaded from: classes.dex */
public final class C7276zd {

    /* renamed from: a */
    public final int f46899a;

    /* renamed from: b */
    public final String f46900b;

    /* renamed from: c */
    public final int f46901c;

    /* renamed from: d */
    public final int f46902d;

    /* renamed from: e */
    public final int f46903e;

    /* renamed from: f */
    public final int f46904f;

    /* renamed from: g */
    public final int f46905g;

    /* renamed from: h */
    public final int f46906h;

    /* renamed from: i */
    public final int f46907i;

    /* renamed from: j */
    public final int f46908j;

    public C7276zd(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f46899a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f46900b = str;
        this.f46901c = i2;
        this.f46902d = i3;
        this.f46903e = i4;
        this.f46904f = i5;
        this.f46905g = i6;
        this.f46906h = i7;
        this.f46907i = i8;
        this.f46908j = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7276zd)) {
            return false;
        }
        C7276zd c7276zd = (C7276zd) obj;
        return this.f46899a == c7276zd.f46899a && this.f46900b.equals(c7276zd.f46900b) && this.f46901c == c7276zd.f46901c && this.f46902d == c7276zd.f46902d && this.f46903e == c7276zd.f46903e && this.f46904f == c7276zd.f46904f && this.f46905g == c7276zd.f46905g && this.f46906h == c7276zd.f46906h && this.f46907i == c7276zd.f46907i && this.f46908j == c7276zd.f46908j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f46899a ^ 1000003) * 1000003) ^ this.f46900b.hashCode()) * 1000003) ^ this.f46901c) * 1000003) ^ this.f46902d) * 1000003) ^ this.f46903e) * 1000003) ^ this.f46904f) * 1000003) ^ this.f46905g) * 1000003) ^ this.f46906h) * 1000003) ^ this.f46907i) * 1000003) ^ this.f46908j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f46899a);
        sb.append(", mediaType=");
        sb.append(this.f46900b);
        sb.append(", bitrate=");
        sb.append(this.f46901c);
        sb.append(", frameRate=");
        sb.append(this.f46902d);
        sb.append(", width=");
        sb.append(this.f46903e);
        sb.append(", height=");
        sb.append(this.f46904f);
        sb.append(", profile=");
        sb.append(this.f46905g);
        sb.append(", bitDepth=");
        sb.append(this.f46906h);
        sb.append(", chromaSubsampling=");
        sb.append(this.f46907i);
        sb.append(", hdrFormat=");
        return AbstractC1374Vq.m8591j(sb, this.f46908j, "}");
    }
}
