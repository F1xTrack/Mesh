package p000;

/* renamed from: Cc */
/* loaded from: classes.dex */
public final class C0165Cc {

    /* renamed from: a */
    public final String f1472a;

    /* renamed from: b */
    public final C0732Ld f1473b;

    public C0165Cc(String str, C0732Ld c0732Ld) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f1472a = str;
        if (c0732Ld == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f1473b = c0732Ld;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0165Cc)) {
            return false;
        }
        C0165Cc c0165Cc = (C0165Cc) obj;
        return this.f1472a.equals(c0165Cc.f1472a) && this.f1473b.equals(c0165Cc.f1473b);
    }

    public final int hashCode() {
        return ((this.f1472a.hashCode() ^ 1000003) * 1000003) ^ this.f1473b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f1472a + ", cameraConfigId=" + this.f1473b + "}";
    }
}
