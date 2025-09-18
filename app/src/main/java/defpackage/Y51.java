package defpackage;

/* loaded from: classes.dex */
public final class Y51 implements Comparable {
    public final long a;
    public final byte[] b;

    public Y51(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((Y51) obj).a);
    }
}
