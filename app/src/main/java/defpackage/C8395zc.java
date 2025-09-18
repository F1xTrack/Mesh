package defpackage;

/* renamed from: zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8395zc {
    public final int a;
    public final C0026Ac b;

    public C8395zc(int i, C0026Ac c0026Ac) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.a = i;
        this.b = c0026Ac;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8395zc)) {
            return false;
        }
        C8395zc c8395zc = (C8395zc) obj;
        if (AbstractC8235ym.c(this.a, c8395zc.a)) {
            C0026Ac c0026Ac = c8395zc.b;
            C0026Ac c0026Ac2 = this.b;
            if (c0026Ac2 == null) {
                if (c0026Ac == null) {
                    return true;
                }
            } else if (c0026Ac2.equals(c0026Ac)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iX = (AbstractC8235ym.x(this.a) ^ 1000003) * 1000003;
        C0026Ac c0026Ac = this.b;
        return iX ^ (c0026Ac == null ? 0 : c0026Ac.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
