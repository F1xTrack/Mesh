package p000;

/* renamed from: ue */
/* loaded from: classes.dex */
public final class C6962ue extends AbstractC10013kT0 {

    /* renamed from: b */
    public final String f43781b;

    /* renamed from: c */
    public final String f43782c;

    /* renamed from: d */
    public final String f43783d;

    /* renamed from: e */
    public final String f43784e;

    /* renamed from: f */
    public final long f43785f;

    public C6962ue(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f43781b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f43782c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f43783d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f43784e = str4;
        this.f43785f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10013kT0)) {
            return false;
        }
        AbstractC10013kT0 abstractC10013kT0 = (AbstractC10013kT0) obj;
        if (this.f43781b.equals(((C6962ue) abstractC10013kT0).f43781b)) {
            C6962ue c6962ue = (C6962ue) abstractC10013kT0;
            if (this.f43782c.equals(c6962ue.f43782c) && this.f43783d.equals(c6962ue.f43783d) && this.f43784e.equals(c6962ue.f43784e) && this.f43785f == c6962ue.f43785f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f43781b.hashCode() ^ 1000003) * 1000003) ^ this.f43782c.hashCode()) * 1000003) ^ this.f43783d.hashCode()) * 1000003) ^ this.f43784e.hashCode()) * 1000003;
        long j = this.f43785f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f43781b);
        sb.append(", parameterKey=");
        sb.append(this.f43782c);
        sb.append(", parameterValue=");
        sb.append(this.f43783d);
        sb.append(", variantId=");
        sb.append(this.f43784e);
        sb.append(", templateVersion=");
        return AbstractC0852NX.m5760i(sb, this.f43785f, "}");
    }
}
