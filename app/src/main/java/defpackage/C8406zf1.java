package defpackage;

/* renamed from: zf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8406zf1 implements Comparable {
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return O90.h(this.a ^ Integer.MIN_VALUE, ((C8406zf1) obj).a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8406zf1) {
            return this.a == ((C8406zf1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 4294967295L);
    }
}
