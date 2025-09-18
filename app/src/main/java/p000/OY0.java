package p000;

/* loaded from: classes.dex */
public final class OY0 {

    /* renamed from: a */
    public final WY0 f8481a;

    /* renamed from: b */
    public final C1766b8 f8482b;

    public OY0(WY0 wy0, C1766b8 c1766b8) {
        this.f8481a = wy0;
        this.f8482b = c1766b8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OY0)) {
            return false;
        }
        OY0 oy0 = (OY0) obj;
        oy0.getClass();
        return this.f8481a.equals(oy0.f8481a) && this.f8482b.equals(oy0.f8482b);
    }

    public final int hashCode() {
        return this.f8482b.hashCode() + ((this.f8481a.hashCode() + (EnumC1095RP.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC1095RP.SESSION_START + ", sessionData=" + this.f8481a + ", applicationInfo=" + this.f8482b + ')';
    }
}
