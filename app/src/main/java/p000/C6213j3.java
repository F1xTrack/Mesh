package p000;

/* renamed from: j3 */
/* loaded from: classes.dex */
public final class C6213j3 {

    /* renamed from: a */
    public final long f34864a;

    /* renamed from: b */
    public final long f34865b;

    public C6213j3(long j, long j2) {
        this.f34864a = j;
        this.f34865b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6213j3)) {
            return false;
        }
        C6213j3 c6213j3 = (C6213j3) obj;
        return this.f34864a == c6213j3.f34864a && this.f34865b == c6213j3.f34865b;
    }

    public final int hashCode() {
        return (((int) this.f34864a) * 31) + ((int) this.f34865b);
    }
}
