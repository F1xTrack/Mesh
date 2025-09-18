package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fi1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3824fi1 extends FD implements InterfaceC3633ei1 {
    public AbstractC0663Ig0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3824fi1(CD cd, I5 i5, C1559Tt0 c1559Tt0, AbstractC0663Ig0 abstractC0663Ig0, W21 w21) {
        super(cd, i5, c1559Tt0, w21);
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
        this.f = abstractC0663Ig0;
    }

    public static /* synthetic */ void b1(int i) {
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

    @Override // defpackage.InterfaceC7662vl
    public boolean F() {
        return false;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        b1(6);
        throw null;
    }

    public AbstractC0663Ig0 getReturnType() {
        AbstractC0663Ig0 type = getType();
        if (type != null) {
            return type;
        }
        b1(10);
        throw null;
    }

    @Override // defpackage.U0, defpackage.QN0
    public final AbstractC0663Ig0 getType() {
        AbstractC0663Ig0 abstractC0663Ig0 = this.f;
        if (abstractC0663Ig0 != null) {
            return abstractC0663Ig0;
        }
        b1(4);
        throw null;
    }

    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        b1(8);
        throw null;
    }

    public C6887rh0 q0() {
        return null;
    }

    public C6887rh0 t0() {
        return null;
    }
}
