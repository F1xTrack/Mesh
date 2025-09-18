package p000;

/* renamed from: Dl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7492Dl0 extends C7388Bl0 {

    /* renamed from: d */
    public static final C7492Dl0 f2231d = new C7492Dl0(1, 0);

    public C7492Dl0(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // p000.C7388Bl0
    public final boolean equals(Object obj) {
        if (obj instanceof C7492Dl0) {
            if (!isEmpty() || !((C7492Dl0) obj).isEmpty()) {
                C7492Dl0 c7492Dl0 = (C7492Dl0) obj;
                if (this.f1009a == c7492Dl0.f1009a) {
                    if (this.f1010b == c7492Dl0.f1010b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.C7388Bl0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f1009a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.f1010b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // p000.C7388Bl0
    public final boolean isEmpty() {
        return this.f1009a > this.f1010b;
    }

    @Override // p000.C7388Bl0
    public final String toString() {
        return this.f1009a + ".." + this.f1010b;
    }
}
