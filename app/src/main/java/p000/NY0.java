package p000;

/* loaded from: classes.dex */
public final class NY0 {

    /* renamed from: a */
    public final String f7867a;

    /* renamed from: b */
    public final String f7868b;

    /* renamed from: c */
    public final int f7869c;

    /* renamed from: d */
    public final long f7870d;

    public NY0(String str, String str2, int i, long j) {
        O90.m5968f(str, "sessionId");
        O90.m5968f(str2, "firstSessionId");
        this.f7867a = str;
        this.f7868b = str2;
        this.f7869c = i;
        this.f7870d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NY0)) {
            return false;
        }
        NY0 ny0 = (NY0) obj;
        return O90.m5963a(this.f7867a, ny0.f7867a) && O90.m5963a(this.f7868b, ny0.f7868b) && this.f7869c == ny0.f7869c && this.f7870d == ny0.f7870d;
    }

    public final int hashCode() {
        int iM8586e = (AbstractC1374Vq.m8586e(this.f7867a.hashCode() * 31, 31, this.f7868b) + this.f7869c) * 31;
        long j = this.f7870d;
        return iM8586e + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.f7867a);
        sb.append(", firstSessionId=");
        sb.append(this.f7868b);
        sb.append(", sessionIndex=");
        sb.append(this.f7869c);
        sb.append(", sessionStartTimestampUs=");
        return AbstractC11153tN0.m24913y(sb, this.f7870d, ')');
    }
}
