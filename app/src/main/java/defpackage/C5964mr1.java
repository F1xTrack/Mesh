package defpackage;

/* renamed from: mr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5964mr1 extends AbstractC6537pr1 {
    public final String a;
    public final Throwable b;

    public C5964mr1(String str, Throwable th) {
        O90.f(str, "arbiter");
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5964mr1)) {
            return false;
        }
        C5964mr1 c5964mr1 = (C5964mr1) obj;
        return O90.a(this.a, c5964mr1.a) && O90.a(this.b, c5964mr1.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoResponseFromArbiter(arbiter=" + this.a + ", exception=" + this.b + ')';
    }
}
