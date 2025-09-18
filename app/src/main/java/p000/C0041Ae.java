package p000;

/* renamed from: Ae */
/* loaded from: classes.dex */
public final class C0041Ae {

    /* renamed from: a */
    public final Throwable f298a;

    public C0041Ae(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f298a = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0041Ae)) {
            return false;
        }
        return this.f298a.equals(((C0041Ae) obj).f298a);
    }

    public final int hashCode() {
        return this.f298a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f298a + "}";
    }
}
