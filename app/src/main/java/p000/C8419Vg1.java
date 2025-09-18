package p000;

/* renamed from: Vg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8419Vg1 extends YZ1 {

    /* renamed from: a */
    public final long f12687a;

    public C8419Vg1(long j) {
        this.f12687a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8419Vg1)) {
            return false;
        }
        long j = ((C8419Vg1) obj).f12687a;
        int i = C6547oM.f38966d;
        return this.f12687a == j;
    }

    public final int hashCode() {
        int i = C6547oM.f38966d;
        long j = this.f12687a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Default(minUpdateInterval=" + ((Object) C6547oM.m23372e(this.f12687a)) + ')';
    }
}
