package defpackage;

/* renamed from: Xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825Xe {
    public final String a;
    public final int b;
    public final C8398zd c;

    public C1825Xe(String str, int i, C8398zd c8398zd) {
        this.a = str;
        this.b = i;
        this.c = c8398zd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1825Xe)) {
            return false;
        }
        C1825Xe c1825Xe = (C1825Xe) obj;
        if (this.a.equals(c1825Xe.a) && this.b == c1825Xe.b) {
            C8398zd c8398zd = c1825Xe.c;
            C8398zd c8398zd2 = this.c;
            if (c8398zd2 == null) {
                if (c8398zd == null) {
                    return true;
                }
            } else if (c8398zd2.equals(c8398zd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        C8398zd c8398zd = this.c;
        return iHashCode ^ (c8398zd == null ? 0 : c8398zd.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
