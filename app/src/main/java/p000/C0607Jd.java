package p000;

/* renamed from: Jd */
/* loaded from: classes.dex */
public final class C0607Jd {

    /* renamed from: a */
    public final String f5647a;

    /* renamed from: b */
    public final String f5648b;

    /* renamed from: c */
    public final String f5649c;

    /* renamed from: d */
    public final String f5650d;

    public C0607Jd(String str, String str2, String str3, String str4) {
        this.f5647a = str;
        this.f5648b = str2;
        this.f5649c = str3;
        this.f5650d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0607Jd)) {
            return false;
        }
        C0607Jd c0607Jd = (C0607Jd) obj;
        return this.f5647a.equals(c0607Jd.f5647a) && this.f5648b.equals(c0607Jd.f5648b) && this.f5649c.equals(c0607Jd.f5649c) && this.f5650d.equals(c0607Jd.f5650d);
    }

    public final int hashCode() {
        return ((((((this.f5647a.hashCode() ^ 1000003) * 1000003) ^ this.f5648b.hashCode()) * 1000003) ^ this.f5649c.hashCode()) * 1000003) ^ this.f5650d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.f5647a);
        sb.append(", eglVersion=");
        sb.append(this.f5648b);
        sb.append(", glExtensions=");
        sb.append(this.f5649c);
        sb.append(", eglExtensions=");
        return AbstractC1374Vq.m8593l(sb, this.f5650d, "}");
    }
}
