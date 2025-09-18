package defpackage;

/* renamed from: oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6305oe {
    public final C6496pe a;
    public final int b;

    public C6305oe(C6496pe c6496pe, int i) {
        if (c6496pe == null) {
            throw new NullPointerException("Null quality");
        }
        this.a = c6496pe;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6305oe)) {
            return false;
        }
        C6305oe c6305oe = (C6305oe) obj;
        return this.a.equals(c6305oe.a) && this.b == c6305oe.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return AbstractC1705Vq.j(sb, this.b, "}");
    }
}
