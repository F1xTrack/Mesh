package defpackage;

/* loaded from: classes2.dex */
public final class AQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    public AQ0(Throwable th) {
        super("Initialization config failed with an error", th);
        this.a = "Initialization config failed with an error";
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AQ0)) {
            return false;
        }
        AQ0 aq0 = (AQ0) obj;
        return O90.a(this.a, aq0.a) && O90.a(this.b, aq0.b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigCommonException(message=" + this.a + ", cause=" + this.b + ')';
    }
}
