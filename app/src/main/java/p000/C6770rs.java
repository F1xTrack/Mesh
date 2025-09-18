package p000;

/* renamed from: rs */
/* loaded from: classes2.dex */
public final class C6770rs {

    /* renamed from: a */
    public final InterfaceC8392Ut0 f41935a;

    /* renamed from: b */
    public final TE0 f41936b;

    /* renamed from: c */
    public final AbstractC6902th f41937c;

    /* renamed from: d */
    public final W21 f41938d;

    public C6770rs(InterfaceC8392Ut0 interfaceC8392Ut0, TE0 te0, AbstractC6902th abstractC6902th, W21 w21) {
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(te0, "classProto");
        O90.m5968f(w21, "sourceElement");
        this.f41935a = interfaceC8392Ut0;
        this.f41936b = te0;
        this.f41937c = abstractC6902th;
        this.f41938d = w21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6770rs)) {
            return false;
        }
        C6770rs c6770rs = (C6770rs) obj;
        return O90.m5963a(this.f41935a, c6770rs.f41935a) && O90.m5963a(this.f41936b, c6770rs.f41936b) && O90.m5963a(this.f41937c, c6770rs.f41937c) && O90.m5963a(this.f41938d, c6770rs.f41938d);
    }

    public final int hashCode() {
        return this.f41938d.hashCode() + ((this.f41937c.hashCode() + ((this.f41936b.hashCode() + (this.f41935a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f41935a + ", classProto=" + this.f41936b + ", metadataVersion=" + this.f41937c + ", sourceElement=" + this.f41938d + ')';
    }
}
