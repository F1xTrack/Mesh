package p000;

/* renamed from: Xe */
/* loaded from: classes.dex */
public final class C1488Xe {

    /* renamed from: a */
    public final String f13886a;

    /* renamed from: b */
    public final int f13887b;

    /* renamed from: c */
    public final C7276zd f13888c;

    public C1488Xe(String str, int i, C7276zd c7276zd) {
        this.f13886a = str;
        this.f13887b = i;
        this.f13888c = c7276zd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1488Xe)) {
            return false;
        }
        C1488Xe c1488Xe = (C1488Xe) obj;
        if (this.f13886a.equals(c1488Xe.f13886a) && this.f13887b == c1488Xe.f13887b) {
            C7276zd c7276zd = c1488Xe.f13888c;
            C7276zd c7276zd2 = this.f13888c;
            if (c7276zd2 == null) {
                if (c7276zd == null) {
                    return true;
                }
            } else if (c7276zd2.equals(c7276zd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13886a.hashCode() ^ 1000003) * 1000003) ^ this.f13887b) * 1000003;
        C7276zd c7276zd = this.f13888c;
        return iHashCode ^ (c7276zd == null ? 0 : c7276zd.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f13886a + ", profile=" + this.f13887b + ", compatibleVideoProfile=" + this.f13888c + "}";
    }
}
