package defpackage;

/* loaded from: classes.dex */
public final class NY0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public NY0(String str, String str2, int i, long j) {
        O90.f(str, "sessionId");
        O90.f(str2, "firstSessionId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NY0)) {
            return false;
        }
        NY0 ny0 = (NY0) obj;
        return O90.a(this.a, ny0.a) && O90.a(this.b, ny0.b) && this.c == ny0.c && this.d == ny0.d;
    }

    public final int hashCode() {
        int iE = (AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return AbstractC7209tN0.y(sb, this.d, ')');
    }
}
