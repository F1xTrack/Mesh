package p000;

/* renamed from: DD */
/* loaded from: classes2.dex */
public abstract class AbstractC0203DD extends AbstractC1259U0 implements InterfaceC0140CD {

    /* renamed from: c */
    public final C8340Tt0 f1897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0203DD(InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0) {
        super(interfaceC0510I5);
        if (interfaceC0510I5 == null) {
            m1596b1(0);
            throw null;
        }
        if (c8340Tt0 == null) {
            m1596b1(1);
            throw null;
        }
        this.f1897c = c8340Tt0;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m1596b1(int i) {
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

    /* renamed from: w1 */
    public static String m1597w1(InterfaceC0140CD interfaceC0140CD) {
        try {
            String str = C6417mI.f37619e.m22767w(interfaceC0140CD) + "[" + interfaceC0140CD.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC0140CD)) + "]";
            if (str != null) {
                return str;
            }
            m1596b1(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC0140CD.getClass().getSimpleName() + " " + interfaceC0140CD.getName();
            if (str2 != null) {
                return str2;
            }
            m1596b1(6);
            throw null;
        }
    }

    @Override // p000.InterfaceC0140CD
    public final C8340Tt0 getName() {
        C8340Tt0 c8340Tt0 = this.f1897c;
        if (c8340Tt0 != null) {
            return c8340Tt0;
        }
        m1596b1(2);
        throw null;
    }

    @Override // p000.AbstractC1259U0
    public String toString() {
        return m1597w1(this);
    }

    /* renamed from: a */
    public InterfaceC0140CD mo2089x1() {
        return this;
    }
}
