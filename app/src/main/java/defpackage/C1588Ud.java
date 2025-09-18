package defpackage;

/* renamed from: Ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588Ud {
    public final InterfaceC0903Li0 a;
    public final C0182Cc b;

    public C1588Ud(InterfaceC0903Li0 interfaceC0903Li0, C0182Cc c0182Cc) {
        if (interfaceC0903Li0 == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.a = interfaceC0903Li0;
        if (c0182Cc == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.b = c0182Cc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1588Ud)) {
            return false;
        }
        C1588Ud c1588Ud = (C1588Ud) obj;
        return this.a.equals(c1588Ud.a) && this.b.equals(c1588Ud.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
