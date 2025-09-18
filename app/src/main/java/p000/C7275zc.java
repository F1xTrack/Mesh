package p000;

/* renamed from: zc */
/* loaded from: classes.dex */
public final class C7275zc {

    /* renamed from: a */
    public final int f46889a;

    /* renamed from: b */
    public final C0039Ac f46890b;

    public C7275zc(int i, C0039Ac c0039Ac) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f46889a = i;
        this.f46890b = c0039Ac;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7275zc)) {
            return false;
        }
        C7275zc c7275zc = (C7275zc) obj;
        if (AbstractC7222ym.m26226c(this.f46889a, c7275zc.f46889a)) {
            C0039Ac c0039Ac = c7275zc.f46890b;
            C0039Ac c0039Ac2 = this.f46890b;
            if (c0039Ac2 == null) {
                if (c0039Ac == null) {
                    return true;
                }
            } else if (c0039Ac2.equals(c0039Ac)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM26247x = (AbstractC7222ym.m26247x(this.f46889a) ^ 1000003) * 1000003;
        C0039Ac c0039Ac = this.f46890b;
        return iM26247x ^ (c0039Ac == null ? 0 : c0039Ac.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.f46889a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.f46890b);
        sb.append("}");
        return sb.toString();
    }
}
