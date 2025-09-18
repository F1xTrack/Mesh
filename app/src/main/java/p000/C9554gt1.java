package p000;

/* renamed from: gt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9554gt1 extends A12 {

    /* renamed from: a */
    public final C10436nm1 f28076a;

    public C9554gt1(C10436nm1 c10436nm1) {
        O90.m5968f(c10436nm1, "networkConfigDto");
        this.f28076a = c10436nm1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9554gt1) && O90.m5963a(this.f28076a, ((C9554gt1) obj).f28076a);
    }

    public final int hashCode() {
        return this.f28076a.hashCode();
    }

    public final String toString() {
        return "NotModified(networkConfigDto=" + this.f28076a + ')';
    }
}
