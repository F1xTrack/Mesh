package defpackage;

/* renamed from: od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6302od extends MA {
    public final String a;
    public final String b;

    public C6302od(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MA)) {
            return false;
        }
        MA ma = (MA) obj;
        return this.a.equals(((C6302od) ma).a) && this.b.equals(((C6302od) ma).b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return AbstractC1705Vq.l(sb, this.b, "}");
    }
}
