package p000;

/* renamed from: oe */
/* loaded from: classes.dex */
public final class C6565oe {

    /* renamed from: a */
    public final C6630pe f39148a;

    /* renamed from: b */
    public final int f39149b;

    public C6565oe(C6630pe c6630pe, int i) {
        if (c6630pe == null) {
            throw new NullPointerException("Null quality");
        }
        this.f39148a = c6630pe;
        this.f39149b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6565oe)) {
            return false;
        }
        C6565oe c6565oe = (C6565oe) obj;
        return this.f39148a.equals(c6565oe.f39148a) && this.f39149b == c6565oe.f39149b;
    }

    public final int hashCode() {
        return ((this.f39148a.hashCode() ^ 1000003) * 1000003) ^ this.f39149b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.f39148a);
        sb.append(", aspectRatio=");
        return AbstractC1374Vq.m8591j(sb, this.f39149b, "}");
    }
}
