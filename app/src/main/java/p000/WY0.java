package p000;

/* loaded from: classes.dex */
public final class WY0 {

    /* renamed from: a */
    public final String f13252a;

    /* renamed from: b */
    public final String f13253b;

    /* renamed from: c */
    public final int f13254c;

    /* renamed from: d */
    public final long f13255d;

    /* renamed from: e */
    public final C0454HC f13256e;

    /* renamed from: f */
    public final String f13257f;

    /* renamed from: g */
    public final String f13258g;

    public WY0(String str, String str2, int i, long j, C0454HC c0454hc, String str3, String str4) {
        O90.m5968f(str, "sessionId");
        O90.m5968f(str2, "firstSessionId");
        O90.m5968f(str4, "firebaseAuthenticationToken");
        this.f13252a = str;
        this.f13253b = str2;
        this.f13254c = i;
        this.f13255d = j;
        this.f13256e = c0454hc;
        this.f13257f = str3;
        this.f13258g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WY0)) {
            return false;
        }
        WY0 wy0 = (WY0) obj;
        return O90.m5963a(this.f13252a, wy0.f13252a) && O90.m5963a(this.f13253b, wy0.f13253b) && this.f13254c == wy0.f13254c && this.f13255d == wy0.f13255d && O90.m5963a(this.f13256e, wy0.f13256e) && O90.m5963a(this.f13257f, wy0.f13257f) && O90.m5963a(this.f13258g, wy0.f13258g);
    }

    public final int hashCode() {
        int iM8586e = (AbstractC1374Vq.m8586e(this.f13252a.hashCode() * 31, 31, this.f13253b) + this.f13254c) * 31;
        long j = this.f13255d;
        return this.f13258g.hashCode() + AbstractC1374Vq.m8586e((this.f13256e.hashCode() + ((iM8586e + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f13257f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f13252a);
        sb.append(", firstSessionId=");
        sb.append(this.f13253b);
        sb.append(", sessionIndex=");
        sb.append(this.f13254c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f13255d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f13256e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f13257f);
        sb.append(", firebaseAuthenticationToken=");
        return F91.m2539v(sb, this.f13258g, ')');
    }
}
