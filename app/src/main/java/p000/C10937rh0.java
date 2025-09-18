package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: rh0 */
/* loaded from: classes2.dex */
public final class C10937rh0 extends AbstractC0203DD implements InterfaceC8946cA0 {

    /* renamed from: d */
    public final /* synthetic */ int f41810d = 1;

    /* renamed from: e */
    public final InterfaceC0140CD f41811e;

    /* renamed from: f */
    public final QN0 f41812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10937rh0(InterfaceC6976us interfaceC6976us) {
        super(S20.f10539b, AbstractC9961k31.f36277d);
        if (interfaceC6976us == null) {
            m24449b1(0);
            throw null;
        }
        this.f41811e = interfaceC6976us;
        this.f41812f = new X70(interfaceC6976us);
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m24449b1(int i) {
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

    /* renamed from: c1 */
    public static /* synthetic */ void m24450c1(int i) {
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

    /* renamed from: x1 */
    public static /* synthetic */ void m24451x1(int i) {
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

    @Override // p000.InterfaceC7032vl
    /* renamed from: F */
    public final boolean mo107F() {
        return false;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2845h(this, obj);
    }

    @Override // p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC7032vl mo2089x1() {
        return this;
    }

    @Override // p000.InterfaceC0266ED
    /* renamed from: e */
    public final W21 mo422e() {
        return W21.f12940O0;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: f0 */
    public final List mo1221f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m24451x1(7);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public final AbstractC7742Ig0 getReturnType() {
        return getType();
    }

    @Override // p000.AbstractC1259U0, p000.QN0
    public final AbstractC7742Ig0 getType() {
        AbstractC7742Ig0 type = m24452y1().getType();
        if (type != null) {
            return type;
        }
        m24451x1(6);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public final List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m24451x1(5);
        throw null;
    }

    @Override // p000.InterfaceC0455HD, p000.InterfaceC8902bq0
    public final C7003vI getVisibility() {
        C7003vI c7003vI = AbstractC7066wI.f44765f;
        if (c7003vI != null) {
            return c7003vI;
        }
        m24451x1(9);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        switch (this.f41810d) {
            case 0:
                InterfaceC6976us interfaceC6976us = (InterfaceC6976us) this.f41811e;
                if (interfaceC6976us != null) {
                    return interfaceC6976us;
                }
                m24449b1(2);
                throw null;
            default:
                InterfaceC0140CD interfaceC0140CD = this.f41811e;
                if (interfaceC0140CD != null) {
                    return interfaceC0140CD;
                }
                m24450c1(8);
                throw null;
        }
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: j */
    public final Collection mo1222j() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m24451x1(8);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: q0 */
    public final C10937rh0 mo119q0() {
        return null;
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: t0 */
    public final C10937rh0 mo121t0() {
        return null;
    }

    @Override // p000.AbstractC0203DD, p000.AbstractC1259U0
    public String toString() {
        switch (this.f41810d) {
            case 0:
                return "class " + ((InterfaceC6976us) this.f41811e).getName() + "::this";
            default:
                return super.toString();
        }
    }

    /* renamed from: y1 */
    public final QN0 m24452y1() {
        switch (this.f41810d) {
            case 0:
                X70 x70 = (X70) this.f41812f;
                if (x70 != null) {
                    return x70;
                }
                m24449b1(1);
                throw null;
            default:
                AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f41812f;
                if (abstractC1259U0 != null) {
                    return abstractC1259U0;
                }
                m24450c1(7);
                throw null;
        }
    }

    @Override // p000.R51
    /* renamed from: z1 */
    public final C10937rh0 mo114b(C11571we1 c11571we1) {
        if (c11571we1 == null) {
            m24451x1(3);
            throw null;
        }
        if (c11571we1.f45011a.mo7050e()) {
            return this;
        }
        AbstractC7742Ig0 abstractC7742Ig0M25667i = mo423i() instanceof InterfaceC6976us ? c11571we1.m25667i(getType(), EnumC9532gi1.f27949e) : c11571we1.m25667i(getType(), EnumC9532gi1.f27947c);
        if (abstractC7742Ig0M25667i == null) {
            return null;
        }
        return abstractC7742Ig0M25667i == getType() ? this : new C10937rh0(mo423i(), new C7371Bc1(abstractC7742Ig0M25667i), getAnnotations());
    }

    @Override // p000.AbstractC0203DD, p000.InterfaceC0140CD
    /* renamed from: a */
    public final InterfaceC0140CD mo2089x1() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10937rh0(InterfaceC0140CD interfaceC0140CD, AbstractC1259U0 abstractC1259U0, InterfaceC0510I5 interfaceC0510I5) {
        this(interfaceC0140CD, abstractC1259U0, interfaceC0510I5, AbstractC9961k31.f36277d);
        if (interfaceC0140CD == null) {
            m24450c1(0);
            throw null;
        }
        if (interfaceC0510I5 != null) {
        } else {
            m24450c1(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10937rh0(InterfaceC0140CD interfaceC0140CD, AbstractC1259U0 abstractC1259U0, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0) {
        super(interfaceC0510I5, c8340Tt0);
        if (interfaceC0140CD == null) {
            m24450c1(3);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m24450c1(5);
            throw null;
        }
        if (c8340Tt0 != null) {
            this.f41811e = interfaceC0140CD;
            this.f41812f = abstractC1259U0;
            return;
        }
        m24450c1(6);
        throw null;
    }
}
