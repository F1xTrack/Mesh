package defpackage;

/* renamed from: Cf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0193Cf1 implements Comparable {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return O90.h(this.a & 65535, ((C0193Cf1) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0193Cf1) {
            return this.a == ((C0193Cf1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(65535 & this.a);
    }
}
