package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: p1 */
/* loaded from: classes2.dex */
public final class C6376p1 extends AbstractC5612l1 {
    public final C0396Ev0 c;
    public final /* synthetic */ AbstractC6567q1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6376p1(AbstractC6567q1 abstractC6567q1, Z41 z41, C0396Ev0 c0396Ev0) {
        super(z41);
        if (z41 == null) {
            l(0);
            throw null;
        }
        this.d = abstractC6567q1;
        this.c = c0396Ev0;
    }

    public static /* synthetic */ void l(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final InterfaceC1087Ns a() {
        AbstractC6567q1 abstractC6567q1 = this.d;
        if (abstractC6567q1 != null) {
            return abstractC6567q1;
        }
        l(3);
        throw null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.AbstractC5612l1
    public final Collection e() {
        List listZ1 = this.d.z1();
        if (listZ1 != null) {
            return listZ1;
        }
        l(1);
        throw null;
    }

    @Override // defpackage.AbstractC5612l1
    public final AbstractC0663Ig0 f() {
        return C5496kP.c(EnumC5305jP.g, new String[0]);
    }

    @Override // defpackage.AbstractC5612l1
    public final C0396Ev0 g() {
        C0396Ev0 c0396Ev0 = this.c;
        if (c0396Ev0 != null) {
            return c0396Ev0;
        }
        l(5);
        throw null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        l(2);
        throw null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        AbstractC8408zg0 abstractC8408zg0E = AbstractC7384uI.e(this.d);
        if (abstractC8408zg0E != null) {
            return abstractC8408zg0E;
        }
        l(4);
        throw null;
    }

    @Override // defpackage.AbstractC5612l1
    public final boolean j(InterfaceC1087Ns interfaceC1087Ns) {
        if (interfaceC1087Ns instanceof InterfaceC5925me1) {
            AbstractC6567q1 abstractC6567q1 = this.d;
            O90.f(abstractC6567q1, "a");
            if (OL0.b.f(abstractC6567q1, (InterfaceC5925me1) interfaceC1087Ns, true, C8087y.k)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5612l1
    public final List k(List list) {
        List listY1 = this.d.y1(list);
        if (listY1 != null) {
            return listY1;
        }
        l(8);
        throw null;
    }

    public final String toString() {
        return this.d.getName().a;
    }
}
