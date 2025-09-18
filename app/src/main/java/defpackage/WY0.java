package defpackage;

/* loaded from: classes.dex */
public final class WY0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final HC e;
    public final String f;
    public final String g;

    public WY0(String str, String str2, int i, long j, HC hc, String str3, String str4) {
        O90.f(str, "sessionId");
        O90.f(str2, "firstSessionId");
        O90.f(str4, "firebaseAuthenticationToken");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = hc;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WY0)) {
            return false;
        }
        WY0 wy0 = (WY0) obj;
        return O90.a(this.a, wy0.a) && O90.a(this.b, wy0.b) && this.c == wy0.c && this.d == wy0.d && O90.a(this.e, wy0.e) && O90.a(this.f, wy0.f) && O90.a(this.g, wy0.g);
    }

    public final int hashCode() {
        int iE = (AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        return this.g.hashCode() + AbstractC1705Vq.e((this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return F91.v(sb, this.g, ')');
    }
}
