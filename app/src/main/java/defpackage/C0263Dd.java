package defpackage;

/* renamed from: Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263Dd {
    public static final C0263Dd f = new C0263Dd(10485760, 604800000, 200, 10000, 81920);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C0263Dd(long j, long j2, int i, int i2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0263Dd)) {
            return false;
        }
        C0263Dd c0263Dd = (C0263Dd) obj;
        return this.a == c0263Dd.a && this.b == c0263Dd.b && this.c == c0263Dd.c && this.d == c0263Dd.d && this.e == c0263Dd.e;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC1705Vq.j(sb, this.e, "}");
    }
}
