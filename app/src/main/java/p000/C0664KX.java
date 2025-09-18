package p000;

/* renamed from: KX */
/* loaded from: classes2.dex */
public final class C0664KX {

    /* renamed from: c */
    public static final C0664KX f6145c = new C0664KX("");

    /* renamed from: a */
    public final C0789MX f6146a;

    /* renamed from: b */
    public transient C0664KX f6147b;

    public C0664KX(String str) {
        if (str != null) {
            this.f6146a = new C0789MX(this, str);
        } else {
            m4652a(1);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4652a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: j */
    public static C0664KX m4653j(C8340Tt0 c8340Tt0) {
        if (c8340Tt0 == null) {
            m4652a(14);
            throw null;
        }
        if (c8340Tt0 != null) {
            return new C0664KX(new C0789MX(c8340Tt0.m7801b(), f6145c.m4661i(), c8340Tt0));
        }
        C0789MX.m5387a(17);
        throw null;
    }

    /* renamed from: b */
    public final String m4654b() {
        String str = this.f6146a.f7212a;
        if (str != null) {
            return str;
        }
        C0789MX.m5387a(4);
        throw null;
    }

    /* renamed from: c */
    public final C0664KX m4655c(C8340Tt0 c8340Tt0) {
        if (c8340Tt0 != null) {
            return new C0664KX(this.f6146a.m5388b(c8340Tt0), this);
        }
        m4652a(8);
        throw null;
    }

    /* renamed from: d */
    public final boolean m4656d() {
        return this.f6146a.f7212a.isEmpty();
    }

    /* renamed from: e */
    public final C0664KX m4657e() {
        C0664KX c0664kx = this.f6147b;
        if (c0664kx != null) {
            if (c0664kx != null) {
                return c0664kx;
            }
            m4652a(6);
            throw null;
        }
        if (m4656d()) {
            throw new IllegalStateException("root");
        }
        C0789MX c0789mx = this.f6146a;
        C0789MX c0789mx2 = c0789mx.f7214c;
        if (c0789mx2 == null) {
            if (c0789mx.f7212a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            c0789mx.m5389c();
            c0789mx2 = c0789mx.f7214c;
            if (c0789mx2 == null) {
                C0789MX.m5387a(8);
                throw null;
            }
        }
        C0664KX c0664kx2 = new C0664KX(c0789mx2);
        this.f6147b = c0664kx2;
        return c0664kx2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0664KX) && this.f6146a.equals(((C0664KX) obj).f6146a);
    }

    /* renamed from: f */
    public final C8340Tt0 m4658f() {
        C8340Tt0 c8340Tt0M5392f = this.f6146a.m5392f();
        if (c8340Tt0M5392f != null) {
            return c8340Tt0M5392f;
        }
        m4652a(9);
        throw null;
    }

    /* renamed from: g */
    public final C8340Tt0 m4659g() {
        C8340Tt0 c8340Tt0M5392f;
        C0789MX c0789mx = this.f6146a;
        if (c0789mx.f7212a.isEmpty()) {
            c8340Tt0M5392f = C0789MX.f7209e;
            if (c8340Tt0M5392f == null) {
                C0789MX.m5387a(12);
                throw null;
            }
        } else {
            c8340Tt0M5392f = c0789mx.m5392f();
            if (c8340Tt0M5392f == null) {
                C0789MX.m5387a(13);
                throw null;
            }
        }
        return c8340Tt0M5392f;
    }

    /* renamed from: h */
    public final boolean m4660h(C8340Tt0 c8340Tt0) {
        if (c8340Tt0 == null) {
            m4652a(12);
            throw null;
        }
        String str = this.f6146a.f7212a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strM7801b = c8340Tt0.m7801b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strM7801b.length());
        }
        return str.regionMatches(0, strM7801b, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f6146a.f7212a.hashCode();
    }

    /* renamed from: i */
    public final C0789MX m4661i() {
        C0789MX c0789mx = this.f6146a;
        if (c0789mx != null) {
            return c0789mx;
        }
        m4652a(5);
        throw null;
    }

    public final String toString() {
        return this.f6146a.toString();
    }

    public C0664KX(C0789MX c0789mx) {
        if (c0789mx != null) {
            this.f6146a = c0789mx;
        } else {
            m4652a(2);
            throw null;
        }
    }

    public C0664KX(C0789MX c0789mx, C0664KX c0664kx) {
        this.f6146a = c0789mx;
        this.f6147b = c0664kx;
    }
}
