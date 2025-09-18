package p000;

/* renamed from: p0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6590p0 extends AbstractC6654q1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6590p0(Z41 z41, InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, EnumC9532gi1 enumC9532gi1, boolean z, int i, C7564Ev0 c7564Ev0) {
        super(z41, interfaceC0140CD, interfaceC0510I5, c8340Tt0, enumC9532gi1, z, i, c7564Ev0);
        if (z41 == null) {
            m23589b1(0);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m23589b1(1);
            throw null;
        }
        if (c7564Ev0 != null) {
        } else {
            m23589b1(6);
            throw null;
        }
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m23589b1(int i) {
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

    @Override // p000.AbstractC0203DD, p000.AbstractC1259U0
    public final String toString() {
        String str = "";
        String str2 = this.f40492g ? "reified " : "";
        if (mo22918O() != EnumC9532gi1.f27947c) {
            str = mo22918O() + " ";
        }
        return str2 + str + getName();
    }
}
