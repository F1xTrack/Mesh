package p000;

/* renamed from: Wg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8471Wg1 extends YZ1 {

    /* renamed from: a */
    public final long f13317a;

    public C8471Wg1(long j) {
        this.f13317a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8471Wg1)) {
            return false;
        }
        long j = ((C8471Wg1) obj).f13317a;
        int i = C6547oM.f38966d;
        return this.f13317a == j;
    }

    public final int hashCode() {
        int i = C6547oM.f38966d;
        long j = this.f13317a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Snapshot(minUpdateInterval=" + ((Object) C6547oM.m23372e(this.f13317a)) + ')';
    }
}
