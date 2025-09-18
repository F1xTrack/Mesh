package p000;

/* renamed from: Ue1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8363Ue1 implements Comparable {

    /* renamed from: a */
    public final byte f11955a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return O90.m5970h(this.f11955a & 255, ((C8363Ue1) obj).f11955a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8363Ue1) {
            return this.f11955a == ((C8363Ue1) obj).f11955a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11955a;
    }

    public final String toString() {
        return String.valueOf(this.f11955a & 255);
    }
}
