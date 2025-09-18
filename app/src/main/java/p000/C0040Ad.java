package p000;

/* renamed from: Ad */
/* loaded from: classes.dex */
public final class C0040Ad {

    /* renamed from: a */
    public final Object f286a;

    /* renamed from: b */
    public final EnumC11261uD0 f287b;

    /* renamed from: c */
    public final C6502ne f288c;

    public C0040Ad(Object obj, EnumC11261uD0 enumC11261uD0, C6502ne c6502ne) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f286a = obj;
        this.f287b = enumC11261uD0;
        this.f288c = c6502ne;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0040Ad)) {
            return false;
        }
        C0040Ad c0040Ad = (C0040Ad) obj;
        c0040Ad.getClass();
        if (this.f286a.equals(c0040Ad.f286a) && this.f287b.equals(c0040Ad.f287b)) {
            C6502ne c6502ne = c0040Ad.f288c;
            C6502ne c6502ne2 = this.f288c;
            if (c6502ne2 == null) {
                if (c6502ne == null) {
                    return true;
                }
            } else if (c6502ne2.equals(c6502ne)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f286a.hashCode()) * 1000003) ^ this.f287b.hashCode()) * 1000003;
        C6502ne c6502ne = this.f288c;
        return (iHashCode ^ (c6502ne == null ? 0 : c6502ne.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f286a + ", priority=" + this.f287b + ", productData=" + this.f288c + ", eventContext=null}";
    }
}
