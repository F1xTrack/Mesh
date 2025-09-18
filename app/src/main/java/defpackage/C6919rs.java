package defpackage;

/* renamed from: rs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6919rs {
    public final InterfaceC1637Ut0 a;
    public final TE0 b;
    public final AbstractC7268th c;
    public final W21 d;

    public C6919rs(InterfaceC1637Ut0 interfaceC1637Ut0, TE0 te0, AbstractC7268th abstractC7268th, W21 w21) {
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(te0, "classProto");
        O90.f(w21, "sourceElement");
        this.a = interfaceC1637Ut0;
        this.b = te0;
        this.c = abstractC7268th;
        this.d = w21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6919rs)) {
            return false;
        }
        C6919rs c6919rs = (C6919rs) obj;
        return O90.a(this.a, c6919rs.a) && O90.a(this.b, c6919rs.b) && O90.a(this.c, c6919rs.c) && O90.a(this.d, c6919rs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
