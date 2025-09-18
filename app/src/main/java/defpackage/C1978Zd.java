package defpackage;

/* renamed from: Zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978Zd {
    public final C1903Ye a;
    public final C7253tc b;
    public final int c;

    public C1978Zd(C1903Ye c1903Ye, C7253tc c7253tc, int i) {
        this.a = c1903Ye;
        this.b = c7253tc;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1978Zd)) {
            return false;
        }
        C1978Zd c1978Zd = (C1978Zd) obj;
        return this.a.equals(c1978Zd.a) && this.b.equals(c1978Zd.b) && this.c == c1978Zd.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return AbstractC1705Vq.j(sb, this.c, "}");
    }
}
