package p000;

/* renamed from: Hd */
/* loaded from: classes.dex */
public final class C0481Hd {

    /* renamed from: c */
    public static final C0481Hd f4376c = new C0481Hd(C6630pe.f40254j, 0);

    /* renamed from: a */
    public final C6630pe f4377a;

    /* renamed from: b */
    public final int f4378b;

    public C0481Hd(C6630pe c6630pe, int i) {
        if (c6630pe == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f4377a = c6630pe;
        this.f4378b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0481Hd)) {
            return false;
        }
        C0481Hd c0481Hd = (C0481Hd) obj;
        return this.f4377a.equals(c0481Hd.f4377a) && this.f4378b == c0481Hd.f4378b;
    }

    public final int hashCode() {
        return ((this.f4377a.hashCode() ^ 1000003) * 1000003) ^ this.f4378b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.f4377a);
        sb.append(", fallbackRule=");
        return AbstractC1374Vq.m8591j(sb, this.f4378b, "}");
    }
}
