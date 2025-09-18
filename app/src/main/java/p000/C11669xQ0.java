package p000;

/* renamed from: xQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11669xQ0 extends CQ0 {

    /* renamed from: a */
    public final String f45634a;

    /* renamed from: b */
    public final Throwable f45635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11669xQ0(String str) {
        super(str, null);
        O90.m5968f(str, "message");
        this.f45634a = str;
        this.f45635b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11669xQ0)) {
            return false;
        }
        C11669xQ0 c11669xQ0 = (C11669xQ0) obj;
        return O90.m5963a(this.f45634a, c11669xQ0.f45634a) && O90.m5963a(this.f45635b, c11669xQ0.f45635b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f45635b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f45634a;
    }

    public final int hashCode() {
        int iHashCode = this.f45634a.hashCode() * 31;
        Throwable th = this.f45635b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigCastException(message=" + this.f45634a + ", cause=" + this.f45635b + ')';
    }
}
