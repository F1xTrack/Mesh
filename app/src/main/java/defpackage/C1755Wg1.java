package defpackage;

/* renamed from: Wg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1755Wg1 extends YZ1 {
    public final long a;

    public C1755Wg1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1755Wg1)) {
            return false;
        }
        long j = ((C1755Wg1) obj).a;
        int i = C6251oM.d;
        return this.a == j;
    }

    public final int hashCode() {
        int i = C6251oM.d;
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Snapshot(minUpdateInterval=" + ((Object) C6251oM.e(this.a)) + ')';
    }
}
