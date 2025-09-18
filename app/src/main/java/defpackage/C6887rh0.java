package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: rh0 */
/* loaded from: classes2.dex */
public final class C6887rh0 extends DD implements InterfaceC2464cA0 {
    public final /* synthetic */ int d = 1;
    public final CD e;
    public final QN0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6887rh0(InterfaceC7492us interfaceC7492us) {
        super(S20.b, AbstractC5431k31.d);
        if (interfaceC7492us == null) {
            b1(0);
            throw null;
        }
        this.e = interfaceC7492us;
        this.f = new X70(interfaceC7492us);
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void c1(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void x1(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC7662vl
    public final boolean F() {
        return false;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.h(this, obj);
    }

    @Override // defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final InterfaceC7662vl x1() {
        return this;
    }

    @Override // defpackage.ED
    public final W21 e() {
        return W21.O0;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        x1(7);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final AbstractC0663Ig0 getReturnType() {
        return getType();
    }

    @Override // defpackage.U0, defpackage.QN0
    public final AbstractC0663Ig0 getType() {
        AbstractC0663Ig0 type = y1().getType();
        if (type != null) {
            return type;
        }
        x1(6);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        x1(5);
        throw null;
    }

    @Override // defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = AbstractC7765wI.f;
        if (c7575vI != null) {
            return c7575vI;
        }
        x1(9);
        throw null;
    }

    @Override // defpackage.CD
    public final CD i() {
        switch (this.d) {
            case 0:
                InterfaceC7492us interfaceC7492us = (InterfaceC7492us) this.e;
                if (interfaceC7492us != null) {
                    return interfaceC7492us;
                }
                b1(2);
                throw null;
            default:
                CD cd = this.e;
                if (cd != null) {
                    return cd;
                }
                c1(8);
                throw null;
        }
    }

    @Override // defpackage.InterfaceC7662vl
    public final Collection j() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        x1(8);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 q0() {
        return null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 t0() {
        return null;
    }

    @Override // defpackage.DD, defpackage.U0
    public String toString() {
        switch (this.d) {
            case 0:
                return "class " + ((InterfaceC7492us) this.e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    public final QN0 y1() {
        switch (this.d) {
            case 0:
                X70 x70 = (X70) this.f;
                if (x70 != null) {
                    return x70;
                }
                b1(1);
                throw null;
            default:
                U0 u0 = (U0) this.f;
                if (u0 != null) {
                    return u0;
                }
                c1(7);
                throw null;
        }
    }

    @Override // defpackage.R51
    /* renamed from: z1 */
    public final C6887rh0 b(C7833we1 c7833we1) {
        if (c7833we1 == null) {
            x1(3);
            throw null;
        }
        if (c7833we1.a.e()) {
            return this;
        }
        AbstractC0663Ig0 abstractC0663Ig0I = i() instanceof InterfaceC7492us ? c7833we1.i(getType(), EnumC4015gi1.e) : c7833we1.i(getType(), EnumC4015gi1.c);
        if (abstractC0663Ig0I == null) {
            return null;
        }
        return abstractC0663Ig0I == getType() ? this : new C6887rh0(i(), new C0106Bc1(abstractC0663Ig0I), getAnnotations());
    }

    @Override // defpackage.DD, defpackage.CD
    /* renamed from: a */
    public final CD x1() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6887rh0(CD cd, U0 u0, I5 i5) {
        this(cd, u0, i5, AbstractC5431k31.d);
        if (cd == null) {
            c1(0);
            throw null;
        }
        if (i5 != null) {
        } else {
            c1(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6887rh0(CD cd, U0 u0, I5 i5, C1559Tt0 c1559Tt0) {
        super(i5, c1559Tt0);
        if (cd == null) {
            c1(3);
            throw null;
        }
        if (i5 == null) {
            c1(5);
            throw null;
        }
        if (c1559Tt0 != null) {
            this.e = cd;
            this.f = u0;
            return;
        }
        c1(6);
        throw null;
    }
}
