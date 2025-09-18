package defpackage;

/* renamed from: nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6111nd extends NA {
    public final C6302od a;
    public final String b;
    public final String c;
    public final long d;

    public C6111nd(C6302od c6302od, String str, String str2, long j) {
        this.a = c6302od;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NA)) {
            return false;
        }
        C6111nd c6111nd = (C6111nd) ((NA) obj);
        if (this.a.equals(c6111nd.a)) {
            if (this.b.equals(c6111nd.b) && this.c.equals(c6111nd.c) && this.d == c6111nd.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return NX.i(sb, this.d, "}");
    }
}
