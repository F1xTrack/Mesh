package p000;

/* renamed from: Cf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7429Cf1 implements Comparable {

    /* renamed from: a */
    public final short f1572a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return O90.m5970h(this.f1572a & 65535, ((C7429Cf1) obj).f1572a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7429Cf1) {
            return this.f1572a == ((C7429Cf1) obj).f1572a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1572a;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f1572a);
    }
}
