package p000;

/* renamed from: aD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8696aD0 extends AbstractC7362Ay0 {

    /* renamed from: a */
    public final Object f15396a;

    public C8696aD0(Object obj) {
        this.f15396a = obj;
    }

    @Override // p000.AbstractC7362Ay0
    /* renamed from: a */
    public final Object mo419a() {
        return this.f15396a;
    }

    @Override // p000.AbstractC7362Ay0
    /* renamed from: b */
    public final boolean mo420b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8696aD0) {
            return this.f15396a.equals(((C8696aD0) obj).f15396a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15396a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f15396a + ")";
    }
}
