package p000;

/* renamed from: wc */
/* loaded from: classes.dex */
public final class C7086wc {

    /* renamed from: a */
    public final int f44993a;

    /* renamed from: b */
    public final long f44994b;

    public C7086wc(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f44993a = i;
        this.f44994b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7086wc)) {
            return false;
        }
        C7086wc c7086wc = (C7086wc) obj;
        return AbstractC7222ym.m26226c(this.f44993a, c7086wc.f44993a) && this.f44994b == c7086wc.f44994b;
    }

    public final int hashCode() {
        int iM26247x = (AbstractC7222ym.m26247x(this.f44993a) ^ 1000003) * 1000003;
        long j = this.f44994b;
        return iM26247x ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f44993a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return AbstractC0852NX.m5760i(sb, this.f44994b, "}");
    }
}
