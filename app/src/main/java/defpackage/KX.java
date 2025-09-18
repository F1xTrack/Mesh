package defpackage;

/* loaded from: classes2.dex */
public final class KX {
    public static final KX c = new KX("");
    public final MX a;
    public transient KX b;

    public KX(String str) {
        if (str != null) {
            this.a = new MX(this, str);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
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

    public static KX j(C1559Tt0 c1559Tt0) {
        if (c1559Tt0 == null) {
            a(14);
            throw null;
        }
        if (c1559Tt0 != null) {
            return new KX(new MX(c1559Tt0.b(), c.i(), c1559Tt0));
        }
        MX.a(17);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        MX.a(4);
        throw null;
    }

    public final KX c(C1559Tt0 c1559Tt0) {
        if (c1559Tt0 != null) {
            return new KX(this.a.b(c1559Tt0), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final KX e() {
        KX kx = this.b;
        if (kx != null) {
            if (kx != null) {
                return kx;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        MX mx = this.a;
        MX mx2 = mx.c;
        if (mx2 == null) {
            if (mx.a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            mx.c();
            mx2 = mx.c;
            if (mx2 == null) {
                MX.a(8);
                throw null;
            }
        }
        KX kx2 = new KX(mx2);
        this.b = kx2;
        return kx2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KX) && this.a.equals(((KX) obj).a);
    }

    public final C1559Tt0 f() {
        C1559Tt0 c1559Tt0F = this.a.f();
        if (c1559Tt0F != null) {
            return c1559Tt0F;
        }
        a(9);
        throw null;
    }

    public final C1559Tt0 g() {
        C1559Tt0 c1559Tt0F;
        MX mx = this.a;
        if (mx.a.isEmpty()) {
            c1559Tt0F = MX.e;
            if (c1559Tt0F == null) {
                MX.a(12);
                throw null;
            }
        } else {
            c1559Tt0F = mx.f();
            if (c1559Tt0F == null) {
                MX.a(13);
                throw null;
            }
        }
        return c1559Tt0F;
    }

    public final boolean h(C1559Tt0 c1559Tt0) {
        if (c1559Tt0 == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = c1559Tt0.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final MX i() {
        MX mx = this.a;
        if (mx != null) {
            return mx;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public KX(MX mx) {
        if (mx != null) {
            this.a = mx;
        } else {
            a(2);
            throw null;
        }
    }

    public KX(MX mx, KX kx) {
        this.a = mx;
        this.b = kx;
    }
}
