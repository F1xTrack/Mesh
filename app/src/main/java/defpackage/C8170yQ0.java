package defpackage;

/* renamed from: yQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8170yQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    public C8170yQ0() {
        super("RemoteConfigClient instance already exist", null);
        this.a = "RemoteConfigClient instance already exist";
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8170yQ0)) {
            return false;
        }
        C8170yQ0 c8170yQ0 = (C8170yQ0) obj;
        return O90.a(this.a, c8170yQ0.a) && O90.a(this.b, c8170yQ0.b);
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
        return "RemoteConfigClientAlreadyExist(message=" + this.a + ", cause=" + this.b + ')';
    }
}
