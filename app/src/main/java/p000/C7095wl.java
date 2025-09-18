package p000;

/* renamed from: wl */
/* loaded from: classes2.dex */
public final class C7095wl {

    /* renamed from: a */
    public final C0664KX f45077a;

    /* renamed from: b */
    public final C8340Tt0 f45078b;

    static {
        C0664KX.m4653j(AbstractC9961k31.f36279f);
    }

    public C7095wl(C0664KX c0664kx, C8340Tt0 c8340Tt0) {
        O90.m5968f(c0664kx, "packageName");
        this.f45077a = c0664kx;
        this.f45078b = c8340Tt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7095wl)) {
            return false;
        }
        C7095wl c7095wl = (C7095wl) obj;
        return O90.m5963a(this.f45077a, c7095wl.f45077a) && O90.m5963a(null, null) && this.f45078b.equals(c7095wl.f45078b) && O90.m5963a(null, null);
    }

    public final int hashCode() {
        return (this.f45078b.hashCode() + (this.f45077a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = D51.m1553l(this.f45077a.m4654b(), '.', '/') + "/" + this.f45078b;
        O90.m5967e(str, "toString(...)");
        return str;
    }
}
