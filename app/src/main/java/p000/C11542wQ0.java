package p000;

/* renamed from: wQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11542wQ0 extends CQ0 {

    /* renamed from: a */
    public final String f44861a;

    /* renamed from: b */
    public final Throwable f44862b;

    public C11542wQ0() {
        super("Remote configuration not received yet", null);
        this.f44861a = "Remote configuration not received yet";
        this.f44862b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11542wQ0)) {
            return false;
        }
        C11542wQ0 c11542wQ0 = (C11542wQ0) obj;
        return O90.m5963a(this.f44861a, c11542wQ0.f44861a) && O90.m5963a(this.f44862b, c11542wQ0.f44862b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f44862b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f44861a;
    }

    public final int hashCode() {
        int iHashCode = this.f44861a.hashCode() * 31;
        Throwable th = this.f44862b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "FailedToReceiveRemoteConfig(message=" + this.f44861a + ", cause=" + this.f44862b + ')';
    }

    public C11542wQ0(String str, Throwable th) {
        super(str, th);
        this.f44861a = str;
        this.f44862b = th;
    }
}
