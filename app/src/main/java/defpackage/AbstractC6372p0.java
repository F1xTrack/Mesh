package defpackage;

/* renamed from: p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6372p0 extends AbstractC6567q1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6372p0(Z41 z41, CD cd, I5 i5, C1559Tt0 c1559Tt0, EnumC4015gi1 enumC4015gi1, boolean z, int i, C0396Ev0 c0396Ev0) {
        super(z41, cd, i5, c1559Tt0, enumC4015gi1, z, i, c0396Ev0);
        if (z41 == null) {
            b1(0);
            throw null;
        }
        if (cd == null) {
            b1(1);
            throw null;
        }
        if (c0396Ev0 != null) {
        } else {
            b1(6);
            throw null;
        }
    }

    public static /* synthetic */ void b1(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.DD, defpackage.U0
    public final String toString() {
        String str = "";
        String str2 = this.g ? "reified " : "";
        if (O() != EnumC4015gi1.c) {
            str = O() + " ";
        }
        return str2 + str + getName();
    }
}
