package p000;

/* renamed from: it1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9810it1 extends A12 {

    /* renamed from: a */
    public final C10436nm1 f34794a;

    public C9810it1(C10436nm1 c10436nm1) {
        this.f34794a = c10436nm1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9810it1) && O90.m5963a(this.f34794a, ((C9810it1) obj).f34794a);
    }

    public final int hashCode() {
        return this.f34794a.hashCode();
    }

    public final String toString() {
        return "Success(networkConfigDto=" + this.f34794a + ')';
    }
}
