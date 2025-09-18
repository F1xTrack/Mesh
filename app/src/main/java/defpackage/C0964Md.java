package defpackage;

/* renamed from: Md, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964Md {
    public final C4192he a;
    public final int b;

    public C0964Md(C4192he c4192he, int i) {
        if (c4192he == null) {
            throw new NullPointerException("Null packet");
        }
        this.a = c4192he;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0964Md)) {
            return false;
        }
        C0964Md c0964Md = (C0964Md) obj;
        return this.a.equals(c0964Md.a) && this.b == c0964Md.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return AbstractC1705Vq.j(sb, this.b, "}");
    }
}
