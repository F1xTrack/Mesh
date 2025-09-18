package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: fi1 */
/* loaded from: classes2.dex */
public abstract class AbstractC9404fi1 extends AbstractC0329FD implements InterfaceC9276ei1 {

    /* renamed from: f */
    public AbstractC7742Ig0 f27352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9404fi1(InterfaceC0140CD interfaceC0140CD, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, AbstractC7742Ig0 abstractC7742Ig0, W21 w21) {
        super(interfaceC0140CD, interfaceC0510I5, c8340Tt0, w21);
        if (interfaceC0140CD == null) {
            m18289b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m18289b1(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m18289b1(2);
            throw null;
        }
        if (w21 == null) {
            m18289b1(3);
            throw null;
        }
        this.f27352f = abstractC7742Ig0;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m18289b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: F */
    public boolean mo107F() {
        return false;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: f0 */
    public final List mo1221f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18289b1(6);
        throw null;
    }

    public AbstractC7742Ig0 getReturnType() {
        AbstractC7742Ig0 type = getType();
        if (type != null) {
            return type;
        }
        m18289b1(10);
        throw null;
    }

    @Override // p000.AbstractC1259U0, p000.QN0
    public final AbstractC7742Ig0 getType() {
        AbstractC7742Ig0 abstractC7742Ig0 = this.f27352f;
        if (abstractC7742Ig0 != null) {
            return abstractC7742Ig0;
        }
        m18289b1(4);
        throw null;
    }

    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18289b1(8);
        throw null;
    }

    /* renamed from: q0 */
    public C10937rh0 mo119q0() {
        return null;
    }

    /* renamed from: t0 */
    public C10937rh0 mo121t0() {
        return null;
    }
}
