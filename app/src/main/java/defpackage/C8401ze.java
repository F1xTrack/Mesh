package defpackage;

/* renamed from: ze */
/* loaded from: classes.dex */
public final class C8401ze {
    public final long a;
    public final long b;
    public final long c;

    public C8401ze(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8401ze)) {
            return false;
        }
        C8401ze c8401ze = (C8401ze) obj;
        return this.a == c8401ze.a && this.b == c8401ze.b && this.c == c8401ze.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return NX.i(sb, this.c, "}");
    }
}
