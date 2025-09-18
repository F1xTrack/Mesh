package p000;

/* renamed from: BV */
/* loaded from: classes.dex */
public final class C0095BV {

    /* renamed from: a */
    public final C8028Nt0 f844a;

    /* renamed from: b */
    public C6220jA f845b = null;

    public C0095BV(C8028Nt0 c8028Nt0) {
        this.f844a = c8028Nt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0095BV)) {
            return false;
        }
        C0095BV c0095bv = (C0095BV) obj;
        return this.f844a.equals(c0095bv.f844a) && O90.m5963a(this.f845b, c0095bv.f845b);
    }

    public final int hashCode() {
        int iHashCode = this.f844a.hashCode() * 31;
        C6220jA c6220jA = this.f845b;
        return iHashCode + (c6220jA == null ? 0 : c6220jA.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f844a + ", subscriber=" + this.f845b + ')';
    }
}
