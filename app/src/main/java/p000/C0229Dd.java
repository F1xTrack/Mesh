package p000;

/* renamed from: Dd */
/* loaded from: classes.dex */
public final class C0229Dd {

    /* renamed from: f */
    public static final C0229Dd f2083f = new C0229Dd(10485760, 604800000, 200, 10000, 81920);

    /* renamed from: a */
    public final long f2084a;

    /* renamed from: b */
    public final int f2085b;

    /* renamed from: c */
    public final int f2086c;

    /* renamed from: d */
    public final long f2087d;

    /* renamed from: e */
    public final int f2088e;

    public C0229Dd(long j, long j2, int i, int i2, int i3) {
        this.f2084a = j;
        this.f2085b = i;
        this.f2086c = i2;
        this.f2087d = j2;
        this.f2088e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0229Dd)) {
            return false;
        }
        C0229Dd c0229Dd = (C0229Dd) obj;
        return this.f2084a == c0229Dd.f2084a && this.f2085b == c0229Dd.f2085b && this.f2086c == c0229Dd.f2086c && this.f2087d == c0229Dd.f2087d && this.f2088e == c0229Dd.f2088e;
    }

    public final int hashCode() {
        long j = this.f2084a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2085b) * 1000003) ^ this.f2086c) * 1000003;
        long j2 = this.f2087d;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2088e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f2084a);
        sb.append(", loadBatchSize=");
        sb.append(this.f2085b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f2086c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f2087d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC1374Vq.m8591j(sb, this.f2088e, "}");
    }
}
