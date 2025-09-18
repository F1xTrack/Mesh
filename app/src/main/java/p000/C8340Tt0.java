package p000;

/* renamed from: Tt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8340Tt0 implements Comparable {

    /* renamed from: a */
    public final String f11577a;

    /* renamed from: b */
    public final boolean f11578b;

    public C8340Tt0(String str, boolean z) {
        if (str == null) {
            m7796a(0);
            throw null;
        }
        this.f11577a = str;
        this.f11578b = z;
    }

    /* renamed from: a */
    public static /* synthetic */ void m7796a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: d */
    public static C8340Tt0 m7797d(String str) {
        if (str != null) {
            return str.startsWith("<") ? m7800g(str) : m7798e(str);
        }
        m7796a(9);
        throw null;
    }

    /* renamed from: e */
    public static C8340Tt0 m7798e(String str) {
        if (str != null) {
            return new C8340Tt0(str, false);
        }
        m7796a(5);
        throw null;
    }

    /* renamed from: f */
    public static boolean m7799f(String str) {
        if (str == null) {
            m7796a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static C8340Tt0 m7800g(String str) {
        if (str == null) {
            m7796a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C8340Tt0(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    /* renamed from: b */
    public final String m7801b() {
        String str = this.f11577a;
        if (str != null) {
            return str;
        }
        m7796a(1);
        throw null;
    }

    /* renamed from: c */
    public final String m7802c() {
        if (this.f11578b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM7801b = m7801b();
        if (strM7801b != null) {
            return strM7801b;
        }
        m7796a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11577a.compareTo(((C8340Tt0) obj).f11577a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8340Tt0)) {
            return false;
        }
        C8340Tt0 c8340Tt0 = (C8340Tt0) obj;
        return this.f11578b == c8340Tt0.f11578b && this.f11577a.equals(c8340Tt0.f11577a);
    }

    public final int hashCode() {
        return (this.f11577a.hashCode() * 31) + (this.f11578b ? 1 : 0);
    }

    public final String toString() {
        return this.f11577a;
    }
}
