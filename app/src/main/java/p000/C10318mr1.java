package p000;

/* renamed from: mr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10318mr1 extends AbstractC10702pr1 {

    /* renamed from: a */
    public final String f37968a;

    /* renamed from: b */
    public final Throwable f37969b;

    public C10318mr1(String str, Throwable th) {
        O90.m5968f(str, "arbiter");
        this.f37968a = str;
        this.f37969b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10318mr1)) {
            return false;
        }
        C10318mr1 c10318mr1 = (C10318mr1) obj;
        return O90.m5963a(this.f37968a, c10318mr1.f37968a) && O90.m5963a(this.f37969b, c10318mr1.f37969b);
    }

    public final int hashCode() {
        int iHashCode = this.f37968a.hashCode() * 31;
        Throwable th = this.f37969b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoResponseFromArbiter(arbiter=" + this.f37968a + ", exception=" + this.f37969b + ')';
    }
}
