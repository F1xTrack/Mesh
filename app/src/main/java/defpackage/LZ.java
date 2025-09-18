package defpackage;

/* loaded from: classes2.dex */
public final class LZ {
    public final KZ a;
    public final int b;

    public LZ(KZ kz, int i) {
        this.a = kz;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LZ)) {
            return false;
        }
        LZ lz = (LZ) obj;
        return O90.a(this.a, lz.a) && this.b == lz.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return AbstractC8235ym.l(sb, this.b, ')');
    }
}
