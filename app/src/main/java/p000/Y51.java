package p000;

/* loaded from: classes.dex */
public final class Y51 implements Comparable {

    /* renamed from: a */
    public final long f14157a;

    /* renamed from: b */
    public final byte[] f14158b;

    public Y51(long j, byte[] bArr) {
        this.f14157a = j;
        this.f14158b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f14157a, ((Y51) obj).f14157a);
    }
}
