package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FE0 extends AE0 implements InterfaceC11899zE0 {

    /* renamed from: n */
    public AbstractC7742Ig0 f3093n;

    /* renamed from: o */
    public final FE0 f3094o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FE0(CE0 ce0, InterfaceC0510I5 interfaceC0510I5, EnumC10575os0 enumC10575os0, C7003vI c7003vI, boolean z, boolean z2, boolean z3, int i, FE0 fe0, W21 w21) {
        FE0 fe02;
        FE0 fe03;
        super(enumC10575os0, c7003vI, ce0, interfaceC0510I5, C8340Tt0.m7800g("<get-" + ce0.getName() + ">"), z, z2, z3, i, w21);
        if (interfaceC0510I5 == null) {
            m2557b1(1);
            throw null;
        }
        if (enumC10575os0 == null) {
            m2557b1(2);
            throw null;
        }
        if (c7003vI == null) {
            m2557b1(3);
            throw null;
        }
        if (i == 0) {
            m2557b1(4);
            throw null;
        }
        if (w21 == null) {
            m2557b1(5);
            throw null;
        }
        if (fe0 != null) {
            fe03 = this;
            fe02 = fe0;
        } else {
            fe02 = this;
            fe03 = fe02;
        }
        fe03.f3094o = fe02;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m2557b1(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: A1 */
    public final FE0 mo2089x1() {
        FE0 fe0 = this.f3094o;
        if (fe0 != null) {
            return fe0;
        }
        m2557b1(8);
        throw null;
    }

    /* renamed from: B1 */
    public final void m2559B1(AbstractC7742Ig0 abstractC7742Ig0) {
        if (abstractC7742Ig0 == null) {
            abstractC7742Ig0 = m123y1().getType();
        }
        this.f3093n = abstractC7742Ig0;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2840b(this, obj);
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: f0 */
    public final List mo1221f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m2557b1(7);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public final AbstractC7742Ig0 getReturnType() {
        return this.f3093n;
    }

    @Override // p000.InterfaceC7158xl, p000.InterfaceC7032vl
    /* renamed from: j */
    public final Collection mo1222j() {
        return m124z1(true);
    }
}
