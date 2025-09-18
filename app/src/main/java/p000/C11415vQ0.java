package p000;

/* renamed from: vQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11415vQ0 extends CQ0 {

    /* renamed from: a */
    public final String f44373a;

    /* renamed from: b */
    public final Throwable f44374b;

    public C11415vQ0(String str, Throwable th) {
        super(str, th);
        this.f44373a = str;
        this.f44374b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11415vQ0)) {
            return false;
        }
        C11415vQ0 c11415vQ0 = (C11415vQ0) obj;
        return O90.m5963a(this.f44373a, c11415vQ0.f44373a) && O90.m5963a(this.f44374b, c11415vQ0.f44374b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f44374b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f44373a;
    }

    public final int hashCode() {
        int iHashCode = this.f44373a.hashCode() * 31;
        Throwable th = this.f44374b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BackgroundConfigUpdateError(message=" + this.f44373a + ", cause=" + this.f44374b + ')';
    }
}
