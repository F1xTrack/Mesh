package defpackage;

/* renamed from: te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7259te extends AbstractC5318jT0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public C7259te(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5318jT0)) {
            return false;
        }
        AbstractC5318jT0 abstractC5318jT0 = (AbstractC5318jT0) obj;
        if (this.b.equals(((C7259te) abstractC5318jT0).b)) {
            C7259te c7259te = (C7259te) abstractC5318jT0;
            if (this.c.equals(c7259te.c) && this.d.equals(c7259te.d) && this.e.equals(c7259te.e) && this.f == c7259te.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return NX.i(sb, this.f, "}");
    }
}
