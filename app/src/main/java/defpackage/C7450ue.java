package defpackage;

/* renamed from: ue */
/* loaded from: classes.dex */
public final class C7450ue extends AbstractC5509kT0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public C7450ue(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5509kT0)) {
            return false;
        }
        AbstractC5509kT0 abstractC5509kT0 = (AbstractC5509kT0) obj;
        if (this.b.equals(((C7450ue) abstractC5509kT0).b)) {
            C7450ue c7450ue = (C7450ue) abstractC5509kT0;
            if (this.c.equals(c7450ue.c) && this.d.equals(c7450ue.d) && this.e.equals(c7450ue.e) && this.f == c7450ue.f) {
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
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return NX.i(sb, this.f, "}");
    }
}
