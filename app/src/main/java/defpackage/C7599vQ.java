package defpackage;

/* renamed from: vQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7599vQ {
    public final long a;
    public final long b;

    public C7599vQ(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }

    public C7599vQ(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }
}
