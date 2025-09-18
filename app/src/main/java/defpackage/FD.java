package defpackage;

/* loaded from: classes2.dex */
public abstract class FD extends DD implements ED {
    public final CD d;
    public final W21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FD(CD cd, I5 i5, C1559Tt0 c1559Tt0, W21 w21) {
        super(i5, c1559Tt0);
        if (cd == null) {
            b1(0);
            throw null;
        }
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(2);
            throw null;
        }
        if (w21 == null) {
            b1(3);
            throw null;
        }
        this.d = cd;
        this.e = w21;
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public W21 e() {
        W21 w21 = this.e;
        if (w21 != null) {
            return w21;
        }
        b1(6);
        throw null;
    }

    public CD i() {
        CD cd = this.d;
        if (cd != null) {
            return cd;
        }
        b1(5);
        throw null;
    }

    @Override // defpackage.DD, defpackage.CD
    public ED x1() {
        return this;
    }
}
