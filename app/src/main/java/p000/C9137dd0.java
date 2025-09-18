package p000;

/* renamed from: dd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9137dd0 {

    /* renamed from: a */
    public final String f26169a;

    public C9137dd0(String str) {
        if (str != null) {
            this.f26169a = str;
        } else {
            m17714a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17714a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static C9137dd0 m17715b(C0055As c0055As) {
        C0664KX c0664kxM363g = c0055As.m363g();
        String strReplace = c0055As.m364h().m4654b().replace('.', '$');
        if (c0664kxM363g.m4656d()) {
            return new C9137dd0(strReplace);
        }
        return new C9137dd0(c0664kxM363g.m4654b().replace('.', '/') + "/" + strReplace);
    }

    /* renamed from: c */
    public static C9137dd0 m17716c(C0664KX c0664kx) {
        if (c0664kx != null) {
            return new C9137dd0(c0664kx.m4654b().replace('.', '/'));
        }
        m17714a(2);
        throw null;
    }

    /* renamed from: d */
    public static C9137dd0 m17717d(String str) {
        if (str != null) {
            return new C9137dd0(str);
        }
        m17714a(0);
        throw null;
    }

    /* renamed from: e */
    public final String m17718e() {
        String str = this.f26169a;
        if (str != null) {
            return str;
        }
        m17714a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9137dd0.class != obj.getClass()) {
            return false;
        }
        return this.f26169a.equals(((C9137dd0) obj).f26169a);
    }

    public final int hashCode() {
        return this.f26169a.hashCode();
    }

    public final String toString() {
        return this.f26169a;
    }
}
