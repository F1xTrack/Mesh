package p000;

/* renamed from: ge */
/* loaded from: classes.dex */
public final class C4129ge extends AbstractC9949jz0 {

    /* renamed from: a */
    public final C4066fe f27897a;

    /* renamed from: b */
    public final C4066fe f27898b;

    /* renamed from: c */
    public final C4066fe f27899c;

    /* renamed from: d */
    public final C4066fe f27900d;

    public C4129ge(C4066fe c4066fe, C4066fe c4066fe2, C4066fe c4066fe3, C4066fe c4066fe4) {
        if (c4066fe == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f27897a = c4066fe;
        if (c4066fe2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f27898b = c4066fe2;
        this.f27899c = c4066fe3;
        this.f27900d = c4066fe4;
    }

    /* renamed from: a */
    public final AbstractC9821iz0 m18591a() {
        return this.f27899c;
    }

    /* renamed from: b */
    public final AbstractC9821iz0 m18592b() {
        return this.f27898b;
    }

    /* renamed from: c */
    public final AbstractC9821iz0 m18593c() {
        return this.f27900d;
    }

    /* renamed from: d */
    public final AbstractC9821iz0 m18594d() {
        return this.f27897a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9949jz0)) {
            return false;
        }
        C4129ge c4129ge = (C4129ge) ((AbstractC9949jz0) obj);
        if (this.f27897a.equals(c4129ge.f27897a)) {
            if (this.f27898b.equals(c4129ge.f27898b)) {
                C4066fe c4066fe = c4129ge.f27899c;
                C4066fe c4066fe2 = this.f27899c;
                if (c4066fe2 != null ? c4066fe2.equals(c4066fe) : c4066fe == null) {
                    C4066fe c4066fe3 = c4129ge.f27900d;
                    C4066fe c4066fe4 = this.f27900d;
                    if (c4066fe4 == null) {
                        if (c4066fe3 == null) {
                            return true;
                        }
                    } else if (c4066fe4.equals(c4066fe3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f27897a.hashCode() ^ 1000003) * 1000003) ^ this.f27898b.hashCode()) * 1000003;
        C4066fe c4066fe = this.f27899c;
        int iHashCode2 = (iHashCode ^ (c4066fe == null ? 0 : c4066fe.hashCode())) * 1000003;
        C4066fe c4066fe2 = this.f27900d;
        return iHashCode2 ^ (c4066fe2 != null ? c4066fe2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f27897a + ", imageCaptureOutputSurface=" + this.f27898b + ", imageAnalysisOutputSurface=" + this.f27899c + ", postviewOutputSurface=" + this.f27900d + "}";
    }
}
