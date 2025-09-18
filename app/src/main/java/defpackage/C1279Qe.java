package defpackage;

/* renamed from: Qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279Qe {
    public final int a;
    public final C7730w60 b;

    public C1279Qe(int i, C7730w60 c7730w60) {
        this.a = i;
        this.b = c7730w60;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1279Qe)) {
            return false;
        }
        C1279Qe c1279Qe = (C1279Qe) obj;
        return this.a == c1279Qe.a && this.b.equals(c1279Qe.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
