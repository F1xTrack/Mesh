package defpackage;

/* renamed from: Dl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0288Dl0 extends C0132Bl0 {
    public static final C0288Dl0 d = new C0288Dl0(1, 0);

    public C0288Dl0(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.C0132Bl0
    public final boolean equals(Object obj) {
        if (obj instanceof C0288Dl0) {
            if (!isEmpty() || !((C0288Dl0) obj).isEmpty()) {
                C0288Dl0 c0288Dl0 = (C0288Dl0) obj;
                if (this.a == c0288Dl0.a) {
                    if (this.b == c0288Dl0.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C0132Bl0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.C0132Bl0
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.C0132Bl0
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
