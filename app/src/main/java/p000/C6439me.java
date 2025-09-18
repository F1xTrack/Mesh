package p000;

/* renamed from: me */
/* loaded from: classes.dex */
public final class C6439me {

    /* renamed from: a */
    public final OD0 f37809a;

    /* renamed from: b */
    public final InterfaceC9457g70 f37810b;

    public C6439me(OD0 od0, InterfaceC9457g70 interfaceC9457g70) {
        if (od0 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f37809a = od0;
        this.f37810b = interfaceC9457g70;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6439me)) {
            return false;
        }
        C6439me c6439me = (C6439me) obj;
        return this.f37809a.equals(c6439me.f37809a) && this.f37810b.equals(c6439me.f37810b);
    }

    public final int hashCode() {
        return ((this.f37809a.hashCode() ^ 1000003) * 1000003) ^ this.f37810b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f37809a + ", imageProxy=" + this.f37810b + "}";
    }
}
