package p000;

/* loaded from: classes2.dex */
public final class BQ0 extends CQ0 {

    /* renamed from: a */
    public final int f805a;

    /* renamed from: b */
    public final String f806b;

    /* renamed from: c */
    public final Throwable f807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQ0(int i, String str) {
        super(str, null);
        O90.m5968f(str, "message");
        this.f805a = i;
        this.f806b = str;
        this.f807c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BQ0)) {
            return false;
        }
        BQ0 bq0 = (BQ0) obj;
        return this.f805a == bq0.f805a && O90.m5963a(this.f806b, bq0.f806b) && O90.m5963a(this.f807c, bq0.f807c);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f807c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f806b;
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(this.f805a * 31, 31, this.f806b);
        Throwable th = this.f807c;
        return iM8586e + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RemoteConfigNetworkException(code=" + this.f805a + ", message=" + this.f806b + ", cause=" + this.f807c + ')';
    }
}
