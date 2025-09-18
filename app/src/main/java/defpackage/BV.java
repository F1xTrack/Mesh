package defpackage;

/* loaded from: classes.dex */
public final class BV {
    public final C1091Nt0 a;
    public C5260jA b = null;

    public BV(C1091Nt0 c1091Nt0) {
        this.a = c1091Nt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BV)) {
            return false;
        }
        BV bv = (BV) obj;
        return this.a.equals(bv.a) && O90.a(this.b, bv.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C5260jA c5260jA = this.b;
        return iHashCode + (c5260jA == null ? 0 : c5260jA.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
