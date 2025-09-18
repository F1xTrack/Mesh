package defpackage;

/* renamed from: wl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7852wl {
    public final KX a;
    public final C1559Tt0 b;

    static {
        KX.j(AbstractC5431k31.f);
    }

    public C7852wl(KX kx, C1559Tt0 c1559Tt0) {
        O90.f(kx, "packageName");
        this.a = kx;
        this.b = c1559Tt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7852wl)) {
            return false;
        }
        C7852wl c7852wl = (C7852wl) obj;
        return O90.a(this.a, c7852wl.a) && O90.a(null, null) && this.b.equals(c7852wl.b) && O90.a(null, null);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = D51.l(this.a.b(), '.', '/') + "/" + this.b;
        O90.e(str, "toString(...)");
        return str;
    }
}
