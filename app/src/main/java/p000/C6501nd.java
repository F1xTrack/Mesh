package p000;

/* renamed from: nd */
/* loaded from: classes.dex */
public final class C6501nd extends AbstractC0829NA {

    /* renamed from: a */
    public final C6564od f38410a;

    /* renamed from: b */
    public final String f38411b;

    /* renamed from: c */
    public final String f38412c;

    /* renamed from: d */
    public final long f38413d;

    public C6501nd(C6564od c6564od, String str, String str2, long j) {
        this.f38410a = c6564od;
        this.f38411b = str;
        this.f38412c = str2;
        this.f38413d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0829NA)) {
            return false;
        }
        C6501nd c6501nd = (C6501nd) ((AbstractC0829NA) obj);
        if (this.f38410a.equals(c6501nd.f38410a)) {
            if (this.f38411b.equals(c6501nd.f38411b) && this.f38412c.equals(c6501nd.f38412c) && this.f38413d == c6501nd.f38413d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f38410a.hashCode() ^ 1000003) * 1000003) ^ this.f38411b.hashCode()) * 1000003) ^ this.f38412c.hashCode()) * 1000003;
        long j = this.f38413d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f38410a);
        sb.append(", parameterKey=");
        sb.append(this.f38411b);
        sb.append(", parameterValue=");
        sb.append(this.f38412c);
        sb.append(", templateVersion=");
        return AbstractC0852NX.m5760i(sb, this.f38413d, "}");
    }
}
