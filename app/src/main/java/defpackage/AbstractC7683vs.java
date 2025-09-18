package defpackage;

/* renamed from: vs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7683vs extends D {
    public final CD e;
    public final W21 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7683vs(Z41 z41, CD cd, C1559Tt0 c1559Tt0, W21 w21) {
        super(z41, c1559Tt0);
        if (z41 == null) {
            r(0);
            throw null;
        }
        if (cd == null) {
            r(1);
            throw null;
        }
        if (c1559Tt0 == null) {
            r(2);
            throw null;
        }
        this.e = cd;
        this.f = w21;
    }

    public static /* synthetic */ void r(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.ED
    public final W21 e() {
        W21 w21 = this.f;
        if (w21 != null) {
            return w21;
        }
        r(5);
        throw null;
    }

    @Override // defpackage.CD
    public final CD i() {
        CD cd = this.e;
        if (cd != null) {
            return cd;
        }
        r(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
