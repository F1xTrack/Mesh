package p000;

/* renamed from: vQ */
/* loaded from: classes.dex */
public final class C7011vQ {

    /* renamed from: a */
    public final long f44371a;

    /* renamed from: b */
    public final long f44372b;

    public C7011vQ(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    public final String toString() {
        return this.f44371a + "/" + this.f44372b;
    }

    public C7011vQ(long j, long j2) {
        if (j2 == 0) {
            this.f44371a = 0L;
            this.f44372b = 1L;
        } else {
            this.f44371a = j;
            this.f44372b = j2;
        }
    }
}
