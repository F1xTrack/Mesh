package defpackage;

/* renamed from: zQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8360zQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    public C8360zQ0() {
        super("To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()", null);
        this.a = "To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()";
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8360zQ0)) {
            return false;
        }
        C8360zQ0 c8360zQ0 = (C8360zQ0) obj;
        return O90.a(this.a, c8360zQ0.a) && O90.a(this.b, c8360zQ0.b);
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
        return "RemoteConfigClientNotCreated(message=" + this.a + ", cause=" + this.b + ')';
    }
}
