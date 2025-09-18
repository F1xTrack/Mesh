package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: p1 */
/* loaded from: classes2.dex */
public final class C6591p1 extends AbstractC6337l1 {

    /* renamed from: c */
    public final C7564Ev0 f39723c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC6654q1 f39724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6591p1(AbstractC6654q1 abstractC6654q1, Z41 z41, C7564Ev0 c7564Ev0) {
        super(z41);
        if (z41 == null) {
            m23591l(0);
            throw null;
        }
        this.f39724d = abstractC6654q1;
        this.f39723c = c7564Ev0;
    }

    /* renamed from: l */
    public static /* synthetic */ void m23591l(int i) {
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

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final InterfaceC0873Ns mo1962a() {
        AbstractC6654q1 abstractC6654q1 = this.f39724d;
        if (abstractC6654q1 != null) {
            return abstractC6654q1;
        }
        m23591l(3);
        throw null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return true;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: e */
    public final Collection mo3024e() {
        List listMo8120z1 = this.f39724d.mo8120z1();
        if (listMo8120z1 != null) {
            return listMo8120z1;
        }
        m23591l(1);
        throw null;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: f */
    public final AbstractC7742Ig0 mo1963f() {
        return C6298kP.m22197c(EnumC6235jP.f35122g, new String[0]);
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: g */
    public final C7564Ev0 mo3025g() {
        C7564Ev0 c7564Ev0 = this.f39723c;
        if (c7564Ev0 != null) {
            return c7564Ev0;
        }
        m23591l(5);
        throw null;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m23591l(2);
        throw null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        AbstractC11955zg0 abstractC11955zg0M25152e = AbstractC6940uI.m25152e(this.f39724d);
        if (abstractC11955zg0M25152e != null) {
            return abstractC11955zg0M25152e;
        }
        m23591l(4);
        throw null;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: j */
    public final boolean mo1965j(InterfaceC0873Ns interfaceC0873Ns) {
        if (interfaceC0873Ns instanceof InterfaceC10292me1) {
            AbstractC6654q1 abstractC6654q1 = this.f39724d;
            O90.m5968f(abstractC6654q1, "a");
            if (OL0.f8367b.m6022f(abstractC6654q1, (InterfaceC10292me1) interfaceC0873Ns, true, C7173y.f45981k)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC6337l1
    /* renamed from: k */
    public final List mo22331k(List list) {
        List listMo8119y1 = this.f39724d.mo8119y1(list);
        if (listMo8119y1 != null) {
            return listMo8119y1;
        }
        m23591l(8);
        throw null;
    }

    public final String toString() {
        return this.f39724d.getName().f11577a;
    }
}
