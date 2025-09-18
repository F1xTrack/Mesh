package defpackage;

/* renamed from: xQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7980xQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7980xQ0(String str) {
        super(str, null);
        O90.f(str, "message");
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7980xQ0)) {
            return false;
        }
        C7980xQ0 c7980xQ0 = (C7980xQ0) obj;
        return O90.a(this.a, c7980xQ0.a) && O90.a(this.b, c7980xQ0.b);
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
        return "RemoteConfigCastException(message=" + this.a + ", cause=" + this.b + ')';
    }
}
