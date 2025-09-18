package defpackage;

/* renamed from: Jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731Jd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public C0731Jd(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0731Jd)) {
            return false;
        }
        C0731Jd c0731Jd = (C0731Jd) obj;
        return this.a.equals(c0731Jd.a) && this.b.equals(c0731Jd.b) && this.c.equals(c0731Jd.c) && this.d.equals(c0731Jd.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return AbstractC1705Vq.l(sb, this.d, "}");
    }
}
