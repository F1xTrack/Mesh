package defpackage;

/* loaded from: classes2.dex */
public final class BQ0 extends CQ0 {
    public final int a;
    public final String b;
    public final Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQ0(int i, String str) {
        super(str, null);
        O90.f(str, "message");
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BQ0)) {
            return false;
        }
        BQ0 bq0 = (BQ0) obj;
        return this.a == bq0.a && O90.a(this.b, bq0.b) && O90.a(this.c, bq0.c);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(this.a * 31, 31, this.b);
        Throwable th = this.c;
        return iE + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigNetworkException(code=" + this.a + ", message=" + this.b + ", cause=" + this.c + ')';
    }
}
