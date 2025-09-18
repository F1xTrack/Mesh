package p000;

/* renamed from: xd */
/* loaded from: classes.dex */
public final class C7150xd {

    /* renamed from: a */
    public final int f45712a;

    /* renamed from: b */
    public final String f45713b;

    /* renamed from: c */
    public final int f45714c;

    /* renamed from: d */
    public final int f45715d;

    /* renamed from: e */
    public final int f45716e;

    /* renamed from: f */
    public final int f45717f;

    public C7150xd(int i, String str, int i2, int i3, int i4, int i5) {
        this.f45712a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f45713b = str;
        this.f45714c = i2;
        this.f45715d = i3;
        this.f45716e = i4;
        this.f45717f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7150xd)) {
            return false;
        }
        C7150xd c7150xd = (C7150xd) obj;
        return this.f45712a == c7150xd.f45712a && this.f45713b.equals(c7150xd.f45713b) && this.f45714c == c7150xd.f45714c && this.f45715d == c7150xd.f45715d && this.f45716e == c7150xd.f45716e && this.f45717f == c7150xd.f45717f;
    }

    public final int hashCode() {
        return ((((((((((this.f45712a ^ 1000003) * 1000003) ^ this.f45713b.hashCode()) * 1000003) ^ this.f45714c) * 1000003) ^ this.f45715d) * 1000003) ^ this.f45716e) * 1000003) ^ this.f45717f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f45712a);
        sb.append(", mediaType=");
        sb.append(this.f45713b);
        sb.append(", bitrate=");
        sb.append(this.f45714c);
        sb.append(", sampleRate=");
        sb.append(this.f45715d);
        sb.append(", channels=");
        sb.append(this.f45716e);
        sb.append(", profile=");
        return AbstractC1374Vq.m8591j(sb, this.f45717f, "}");
    }
}
