package p000;

/* renamed from: Ud */
/* loaded from: classes.dex */
public final class C1298Ud {

    /* renamed from: a */
    public final InterfaceC7902Li0 f11934a;

    /* renamed from: b */
    public final C0165Cc f11935b;

    public C1298Ud(InterfaceC7902Li0 interfaceC7902Li0, C0165Cc c0165Cc) {
        if (interfaceC7902Li0 == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f11934a = interfaceC7902Li0;
        if (c0165Cc == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f11935b = c0165Cc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1298Ud)) {
            return false;
        }
        C1298Ud c1298Ud = (C1298Ud) obj;
        return this.f11934a.equals(c1298Ud.f11934a) && this.f11935b.equals(c1298Ud.f11935b);
    }

    public final int hashCode() {
        return ((this.f11934a.hashCode() ^ 1000003) * 1000003) ^ this.f11935b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f11934a + ", cameraId=" + this.f11935b + "}";
    }
}
