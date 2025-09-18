package p000;

/* renamed from: Be */
/* loaded from: classes.dex */
public final class C0104Be {

    /* renamed from: a */
    public final C0167Ce f960a;

    /* renamed from: b */
    public final C0293Ee f961b;

    /* renamed from: c */
    public final C0230De f962c;

    public C0104Be(C0167Ce c0167Ce, C0293Ee c0293Ee, C0230De c0230De) {
        this.f960a = c0167Ce;
        this.f961b = c0293Ee;
        this.f962c = c0230De;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0104Be)) {
            return false;
        }
        C0104Be c0104Be = (C0104Be) obj;
        return this.f960a.equals(c0104Be.f960a) && this.f961b.equals(c0104Be.f961b) && this.f962c.equals(c0104Be.f962c);
    }

    public final int hashCode() {
        return ((((this.f960a.hashCode() ^ 1000003) * 1000003) ^ this.f961b.hashCode()) * 1000003) ^ this.f962c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f960a + ", osData=" + this.f961b + ", deviceData=" + this.f962c + "}";
    }
}
