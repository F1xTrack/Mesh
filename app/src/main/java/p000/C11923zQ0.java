package p000;

/* renamed from: zQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11923zQ0 extends CQ0 {

    /* renamed from: a */
    public final String f46829a;

    /* renamed from: b */
    public final Throwable f46830b;

    public C11923zQ0() {
        super("To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()", null);
        this.f46829a = "To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()";
        this.f46830b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11923zQ0)) {
            return false;
        }
        C11923zQ0 c11923zQ0 = (C11923zQ0) obj;
        return O90.m5963a(this.f46829a, c11923zQ0.f46829a) && O90.m5963a(this.f46830b, c11923zQ0.f46830b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f46830b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f46829a;
    }

    public final int hashCode() {
        int iHashCode = this.f46829a.hashCode() * 31;
        Throwable th = this.f46830b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigClientNotCreated(message=" + this.f46829a + ", cause=" + this.f46830b + ')';
    }
}
