package defpackage;

/* renamed from: Ue1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1593Ue1 implements Comparable {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return O90.h(this.a & 255, ((C1593Ue1) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1593Ue1) {
            return this.a == ((C1593Ue1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
