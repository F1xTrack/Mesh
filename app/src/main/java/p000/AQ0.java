package p000;

/* loaded from: classes2.dex */
public final class AQ0 extends CQ0 {

    /* renamed from: a */
    public final String f189a;

    /* renamed from: b */
    public final Throwable f190b;

    public AQ0(Throwable th) {
        super("Initialization config failed with an error", th);
        this.f189a = "Initialization config failed with an error";
        this.f190b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AQ0)) {
            return false;
        }
        AQ0 aq0 = (AQ0) obj;
        return O90.m5963a(this.f189a, aq0.f189a) && O90.m5963a(this.f190b, aq0.f190b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f190b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f189a;
    }

    public final int hashCode() {
        int iHashCode = this.f189a.hashCode() * 31;
        Throwable th = this.f190b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigCommonException(message=" + this.f189a + ", cause=" + this.f190b + ')';
    }
}
