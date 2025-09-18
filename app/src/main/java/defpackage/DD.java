package defpackage;

/* loaded from: classes2.dex */
public abstract class DD extends U0 implements CD {
    public final C1559Tt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD(I5 i5, C1559Tt0 c1559Tt0) {
        super(i5);
        if (i5 == null) {
            b1(0);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(1);
            throw null;
        }
        this.c = c1559Tt0;
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String w1(CD cd) {
        try {
            String str = C5857mI.e.w(cd) + "[" + cd.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(cd)) + "]";
            if (str != null) {
                return str;
            }
            b1(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = cd.getClass().getSimpleName() + " " + cd.getName();
            if (str2 != null) {
                return str2;
            }
            b1(6);
            throw null;
        }
    }

    @Override // defpackage.CD
    public final C1559Tt0 getName() {
        C1559Tt0 c1559Tt0 = this.c;
        if (c1559Tt0 != null) {
            return c1559Tt0;
        }
        b1(2);
        throw null;
    }

    @Override // defpackage.U0
    public String toString() {
        return w1(this);
    }

    /* renamed from: a */
    public CD x1() {
        return this;
    }
}
