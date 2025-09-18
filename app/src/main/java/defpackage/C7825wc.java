package defpackage;

/* renamed from: wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7825wc {
    public final int a;
    public final long b;

    public C7825wc(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7825wc)) {
            return false;
        }
        C7825wc c7825wc = (C7825wc) obj;
        return AbstractC8235ym.c(this.a, c7825wc.a) && this.b == c7825wc.b;
    }

    public final int hashCode() {
        int iX = (AbstractC8235ym.x(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return iX ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return NX.i(sb, this.b, "}");
    }
}
