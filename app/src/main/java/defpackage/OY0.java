package defpackage;

/* loaded from: classes.dex */
public final class OY0 {
    public final WY0 a;
    public final C2267b8 b;

    public OY0(WY0 wy0, C2267b8 c2267b8) {
        this.a = wy0;
        this.b = c2267b8;
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
        return this.a.equals(oy0.a) && this.b.equals(oy0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (RP.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + RP.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
