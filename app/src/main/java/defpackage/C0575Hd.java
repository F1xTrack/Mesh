package defpackage;

/* renamed from: Hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575Hd {
    public static final C0575Hd c = new C0575Hd(C6496pe.j, 0);
    public final C6496pe a;
    public final int b;

    public C0575Hd(C6496pe c6496pe, int i) {
        if (c6496pe == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.a = c6496pe;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0575Hd)) {
            return false;
        }
        C0575Hd c0575Hd = (C0575Hd) obj;
        return this.a.equals(c0575Hd.a) && this.b == c0575Hd.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return AbstractC1705Vq.j(sb, this.b, "}");
    }
}
