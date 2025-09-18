package defpackage;

/* renamed from: Cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182Cc {
    public final String a;
    public final C0887Ld b;

    public C0182Cc(String str, C0887Ld c0887Ld) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.a = str;
        if (c0887Ld == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.b = c0887Ld;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0182Cc)) {
            return false;
        }
        C0182Cc c0182Cc = (C0182Cc) obj;
        return this.a.equals(c0182Cc.a) && this.b.equals(c0182Cc.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
