package defpackage;

/* renamed from: me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5923me {
    public final OD0 a;
    public final InterfaceC3903g70 b;

    public C5923me(OD0 od0, InterfaceC3903g70 interfaceC3903g70) {
        if (od0 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = od0;
        this.b = interfaceC3903g70;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5923me)) {
            return false;
        }
        C5923me c5923me = (C5923me) obj;
        return this.a.equals(c5923me.a) && this.b.equals(c5923me.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
