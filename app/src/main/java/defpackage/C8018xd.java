package defpackage;

/* renamed from: xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8018xd {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public C8018xd(int i, String str, int i2, int i3, int i4, int i5) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8018xd)) {
            return false;
        }
        C8018xd c8018xd = (C8018xd) obj;
        return this.a == c8018xd.a && this.b.equals(c8018xd.b) && this.c == c8018xd.c && this.d == c8018xd.d && this.e == c8018xd.e && this.f == c8018xd.f;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return AbstractC1705Vq.j(sb, this.f, "}");
    }
}
