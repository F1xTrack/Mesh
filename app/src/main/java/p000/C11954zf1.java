package p000;

/* renamed from: zf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11954zf1 implements Comparable {

    /* renamed from: a */
    public final int f46925a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return O90.m5970h(this.f46925a ^ Integer.MIN_VALUE, ((C11954zf1) obj).f46925a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11954zf1) {
            return this.f46925a == ((C11954zf1) obj).f46925a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46925a;
    }

    public final String toString() {
        return String.valueOf(this.f46925a & 4294967295L);
    }
}
