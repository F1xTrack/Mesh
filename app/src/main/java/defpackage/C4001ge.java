package defpackage;

/* renamed from: ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4001ge extends AbstractC5414jz0 {
    public final C3810fe a;
    public final C3810fe b;
    public final C3810fe c;
    public final C3810fe d;

    public C4001ge(C3810fe c3810fe, C3810fe c3810fe2, C3810fe c3810fe3, C3810fe c3810fe4) {
        if (c3810fe == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.a = c3810fe;
        if (c3810fe2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.b = c3810fe2;
        this.c = c3810fe3;
        this.d = c3810fe4;
    }

    public final AbstractC5223iz0 a() {
        return this.c;
    }

    public final AbstractC5223iz0 b() {
        return this.b;
    }

    public final AbstractC5223iz0 c() {
        return this.d;
    }

    public final AbstractC5223iz0 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5414jz0)) {
            return false;
        }
        C4001ge c4001ge = (C4001ge) ((AbstractC5414jz0) obj);
        if (this.a.equals(c4001ge.a)) {
            if (this.b.equals(c4001ge.b)) {
                C3810fe c3810fe = c4001ge.c;
                C3810fe c3810fe2 = this.c;
                if (c3810fe2 != null ? c3810fe2.equals(c3810fe) : c3810fe == null) {
                    C3810fe c3810fe3 = c4001ge.d;
                    C3810fe c3810fe4 = this.d;
                    if (c3810fe4 == null) {
                        if (c3810fe3 == null) {
                            return true;
                        }
                    } else if (c3810fe4.equals(c3810fe3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        C3810fe c3810fe = this.c;
        int iHashCode2 = (iHashCode ^ (c3810fe == null ? 0 : c3810fe.hashCode())) * 1000003;
        C3810fe c3810fe2 = this.d;
        return iHashCode2 ^ (c3810fe2 != null ? c3810fe2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}
