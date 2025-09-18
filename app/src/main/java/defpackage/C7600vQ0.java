package defpackage;

/* renamed from: vQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7600vQ0 extends CQ0 {
    public final String a;
    public final Throwable b;

    public C7600vQ0(String str, Throwable th) {
        super(str, th);
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7600vQ0)) {
            return false;
        }
        C7600vQ0 c7600vQ0 = (C7600vQ0) obj;
        return O90.a(this.a, c7600vQ0.a) && O90.a(this.b, c7600vQ0.b);
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
        return "BackgroundConfigUpdateError(message=" + this.a + ", cause=" + this.b + ')';
    }
}
