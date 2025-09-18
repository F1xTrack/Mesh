package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class MX {
    public static final C1559Tt0 e = C1559Tt0.g("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final LX g = new LX(0);
    public final String a;
    public transient KX b;
    public transient MX c;
    public transient C1559Tt0 d;

    public MX(KX kx, String str) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (kx == null) {
            a(1);
            throw null;
        }
        this.a = str;
        this.b = kx;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final MX b(C1559Tt0 c1559Tt0) {
        String strB;
        if (c1559Tt0 == null) {
            a(9);
            throw null;
        }
        String str = this.a;
        if (str.isEmpty()) {
            strB = c1559Tt0.b();
        } else {
            strB = str + "." + c1559Tt0.b();
        }
        return new MX(strB, this, c1559Tt0);
    }

    public final void c() {
        String str = this.a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = C1559Tt0.d(str.substring(iLastIndexOf + 1));
            this.c = new MX(str.substring(0, iLastIndexOf));
        } else {
            this.d = C1559Tt0.d(str);
            this.c = KX.c.i();
        }
    }

    public final boolean d() {
        if (this.b == null) {
            String str = this.a;
            if (str == null) {
                a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final List e() {
        List listEmptyList;
        String str = this.a;
        if (str.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            String[] strArrSplit = f.split(str);
            O90.f(strArrSplit, "<this>");
            O90.f(g, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(C1559Tt0.d(str2));
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MX) && this.a.equals(((MX) obj).a);
    }

    public final C1559Tt0 f() {
        C1559Tt0 c1559Tt0 = this.d;
        if (c1559Tt0 != null) {
            if (c1559Tt0 != null) {
                return c1559Tt0;
            }
            a(10);
            throw null;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        C1559Tt0 c1559Tt02 = this.d;
        if (c1559Tt02 != null) {
            return c1559Tt02;
        }
        a(11);
        throw null;
    }

    public final KX g() {
        KX kx = this.b;
        if (kx == null) {
            KX kx2 = new KX(this);
            this.b = kx2;
            return kx2;
        }
        if (kx != null) {
            return kx;
        }
        a(5);
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strB = this.a;
        if (strB.isEmpty()) {
            strB = e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(18);
        throw null;
    }

    public MX(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public MX(String str, MX mx, C1559Tt0 c1559Tt0) {
        if (str != null) {
            this.a = str;
            this.c = mx;
            this.d = c1559Tt0;
            return;
        }
        a(3);
        throw null;
    }
}
