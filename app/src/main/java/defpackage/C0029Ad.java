package defpackage;

/* renamed from: Ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029Ad {
    public final Object a;
    public final EnumC7370uD0 b;
    public final C6114ne c;

    public C0029Ad(Object obj, EnumC7370uD0 enumC7370uD0, C6114ne c6114ne) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = enumC7370uD0;
        this.c = c6114ne;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0029Ad)) {
            return false;
        }
        C0029Ad c0029Ad = (C0029Ad) obj;
        c0029Ad.getClass();
        if (this.a.equals(c0029Ad.a) && this.b.equals(c0029Ad.b)) {
            C6114ne c6114ne = c0029Ad.c;
            C6114ne c6114ne2 = this.c;
            if (c6114ne2 == null) {
                if (c6114ne == null) {
                    return true;
                }
            } else if (c6114ne2.equals(c6114ne)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        C6114ne c6114ne = this.c;
        return (iHashCode ^ (c6114ne == null ? 0 : c6114ne.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
