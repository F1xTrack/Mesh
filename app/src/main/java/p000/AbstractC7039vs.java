package p000;

/* renamed from: vs */
/* loaded from: classes2.dex */
public abstract class AbstractC7039vs extends AbstractC0189D {

    /* renamed from: e */
    public final InterfaceC0140CD f44572e;

    /* renamed from: f */
    public final W21 f44573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7039vs(Z41 z41, InterfaceC0140CD interfaceC0140CD, C8340Tt0 c8340Tt0, W21 w21) {
        super(z41, c8340Tt0);
        if (z41 == null) {
            m25524r(0);
            throw null;
        }
        if (interfaceC0140CD == null) {
            m25524r(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m25524r(2);
            throw null;
        }
        this.f44572e = interfaceC0140CD;
        this.f44573f = w21;
    }

    /* renamed from: r */
    public static /* synthetic */ void m25524r(int i) {
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

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        W21 w21 = this.f44573f;
        if (w21 != null) {
            return w21;
        }
        m25524r(5);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        InterfaceC0140CD interfaceC0140CD = this.f44572e;
        if (interfaceC0140CD != null) {
            return interfaceC0140CD;
        }
        m25524r(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
