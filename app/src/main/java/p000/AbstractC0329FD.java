package p000;

/* renamed from: FD */
/* loaded from: classes2.dex */
public abstract class AbstractC0329FD extends AbstractC0203DD implements InterfaceC0266ED {

    /* renamed from: d */
    public final InterfaceC0140CD f3090d;

    /* renamed from: e */
    public final W21 f3091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0329FD(InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, W21 w21) {
        super(interfaceC0510I5, c8340Tt0);
        if (interfaceC0140CD == null) {
            m2554b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m2554b1(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m2554b1(2);
            throw null;
        }
        if (w21 == null) {
            m2554b1(3);
            throw null;
        }
        this.f3090d = interfaceC0140CD;
        this.f3091e = w21;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m2554b1(int i) {
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

    /* renamed from: e */
    public W21 mo422e() {
        W21 w21 = this.f3091e;
        if (w21 != null) {
            return w21;
        }
        m2554b1(6);
        throw null;
    }

    /* renamed from: i */
    public InterfaceC0140CD mo423i() {
        InterfaceC0140CD interfaceC0140CD = this.f3090d;
        if (interfaceC0140CD != null) {
            return interfaceC0140CD;
        }
        m2554b1(5);
        throw null;
    }

    @Override // p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: x1 */
    public InterfaceC0266ED mo2089x1() {
        return this;
    }
}
