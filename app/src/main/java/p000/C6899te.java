package p000;

/* renamed from: te */
/* loaded from: classes.dex */
public final class C6899te extends AbstractC9885jT0 {

    /* renamed from: b */
    public final String f43179b;

    /* renamed from: c */
    public final String f43180c;

    /* renamed from: d */
    public final String f43181d;

    /* renamed from: e */
    public final String f43182e;

    /* renamed from: f */
    public final long f43183f;

    public C6899te(String str, String str2, String str3, String str4, long j) {
        this.f43179b = str;
        this.f43180c = str2;
        this.f43181d = str3;
        this.f43182e = str4;
        this.f43183f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9885jT0)) {
            return false;
        }
        AbstractC9885jT0 abstractC9885jT0 = (AbstractC9885jT0) obj;
        if (this.f43179b.equals(((C6899te) abstractC9885jT0).f43179b)) {
            C6899te c6899te = (C6899te) abstractC9885jT0;
            if (this.f43180c.equals(c6899te.f43180c) && this.f43181d.equals(c6899te.f43181d) && this.f43182e.equals(c6899te.f43182e) && this.f43183f == c6899te.f43183f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f43179b.hashCode() ^ 1000003) * 1000003) ^ this.f43180c.hashCode()) * 1000003) ^ this.f43181d.hashCode()) * 1000003) ^ this.f43182e.hashCode()) * 1000003;
        long j = this.f43183f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f43179b);
        sb.append(", variantId=");
        sb.append(this.f43180c);
        sb.append(", parameterKey=");
        sb.append(this.f43181d);
        sb.append(", parameterValue=");
        sb.append(this.f43182e);
        sb.append(", templateVersion=");
        return AbstractC0852NX.m5760i(sb, this.f43183f, "}");
    }
}
