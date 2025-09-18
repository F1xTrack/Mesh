package defpackage;

/* renamed from: wQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7790wQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    public C7790wQ0() {
        super("Remote configuration not received yet", null);
        this.a = "Remote configuration not received yet";
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7790wQ0)) {
            return false;
        }
        C7790wQ0 c7790wQ0 = (C7790wQ0) obj;
        return O90.a(this.a, c7790wQ0.a) && O90.a(this.b, c7790wQ0.b);
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
        return "FailedToReceiveRemoteConfig(message=" + this.a + ", cause=" + this.b + ')';
    }

    public C7790wQ0(String str, Throwable th) {
        super(str, th);
        this.a = str;
        this.b = th;
    }
}
