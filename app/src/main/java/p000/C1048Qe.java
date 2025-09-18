package p000;

/* renamed from: Qe */
/* loaded from: classes.dex */
public final class C1048Qe {

    /* renamed from: a */
    public final int f9705a;

    /* renamed from: b */
    public final C11502w60 f9706b;

    public C1048Qe(int i, C11502w60 c11502w60) {
        this.f9705a = i;
        this.f9706b = c11502w60;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1048Qe)) {
            return false;
        }
        C1048Qe c1048Qe = (C1048Qe) obj;
        return this.f9705a == c1048Qe.f9705a && this.f9706b.equals(c1048Qe.f9706b);
    }

    public final int hashCode() {
        return ((this.f9705a ^ 1000003) * 1000003) ^ this.f9706b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f9705a + ", imageCaptureException=" + this.f9706b + "}";
    }
}
