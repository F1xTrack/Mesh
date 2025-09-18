package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: MX */
/* loaded from: classes2.dex */
public final class C0789MX {

    /* renamed from: e */
    public static final C8340Tt0 f7209e = C8340Tt0.m7800g("<root>");

    /* renamed from: f */
    public static final Pattern f7210f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final C0726LX f7211g = new C0726LX(0);

    /* renamed from: a */
    public final String f7212a;

    /* renamed from: b */
    public transient C0664KX f7213b;

    /* renamed from: c */
    public transient C0789MX f7214c;

    /* renamed from: d */
    public transient C8340Tt0 f7215d;

    public C0789MX(C0664KX c0664kx, String str) {
        if (str == null) {
            m5387a(0);
            throw null;
        }
        if (c0664kx == null) {
            m5387a(1);
            throw null;
        }
        this.f7212a = str;
        this.f7213b = c0664kx;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5387a(int i) {
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

    /* renamed from: b */
    public final C0789MX m5388b(C8340Tt0 c8340Tt0) {
        String strM7801b;
        if (c8340Tt0 == null) {
            m5387a(9);
            throw null;
        }
        String str = this.f7212a;
        if (str.isEmpty()) {
            strM7801b = c8340Tt0.m7801b();
        } else {
            strM7801b = str + "." + c8340Tt0.m7801b();
        }
        return new C0789MX(strM7801b, this, c8340Tt0);
    }

    /* renamed from: c */
    public final void m5389c() {
        String str = this.f7212a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f7215d = C8340Tt0.m7797d(str.substring(iLastIndexOf + 1));
            this.f7214c = new C0789MX(str.substring(0, iLastIndexOf));
        } else {
            this.f7215d = C8340Tt0.m7797d(str);
            this.f7214c = C0664KX.f6145c.m4661i();
        }
    }

    /* renamed from: d */
    public final boolean m5390d() {
        if (this.f7213b == null) {
            String str = this.f7212a;
            if (str == null) {
                m5387a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final List m5391e() {
        List listEmptyList;
        String str = this.f7212a;
        if (str.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            String[] strArrSplit = f7210f.split(str);
            O90.m5968f(strArrSplit, "<this>");
            O90.m5968f(f7211g, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(C8340Tt0.m7797d(str2));
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m5387a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0789MX) && this.f7212a.equals(((C0789MX) obj).f7212a);
    }

    /* renamed from: f */
    public final C8340Tt0 m5392f() {
        C8340Tt0 c8340Tt0 = this.f7215d;
        if (c8340Tt0 != null) {
            if (c8340Tt0 != null) {
                return c8340Tt0;
            }
            m5387a(10);
            throw null;
        }
        if (this.f7212a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        m5389c();
        C8340Tt0 c8340Tt02 = this.f7215d;
        if (c8340Tt02 != null) {
            return c8340Tt02;
        }
        m5387a(11);
        throw null;
    }

    /* renamed from: g */
    public final C0664KX m5393g() {
        C0664KX c0664kx = this.f7213b;
        if (c0664kx == null) {
            C0664KX c0664kx2 = new C0664KX(this);
            this.f7213b = c0664kx2;
            return c0664kx2;
        }
        if (c0664kx != null) {
            return c0664kx;
        }
        m5387a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f7212a.hashCode();
    }

    public final String toString() {
        String strM7801b = this.f7212a;
        if (strM7801b.isEmpty()) {
            strM7801b = f7209e.m7801b();
        }
        if (strM7801b != null) {
            return strM7801b;
        }
        m5387a(18);
        throw null;
    }

    public C0789MX(String str) {
        if (str != null) {
            this.f7212a = str;
        } else {
            m5387a(2);
            throw null;
        }
    }

    public C0789MX(String str, C0789MX c0789mx, C8340Tt0 c8340Tt0) {
        if (str != null) {
            this.f7212a = str;
            this.f7214c = c0789mx;
            this.f7215d = c8340Tt0;
            return;
        }
        m5387a(3);
        throw null;
    }
}
