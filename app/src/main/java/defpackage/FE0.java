package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FE0 extends AE0 implements InterfaceC8324zE0 {
    public AbstractC0663Ig0 n;
    public final FE0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FE0(CE0 ce0, I5 i5, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, boolean z2, boolean z3, int i, FE0 fe0, W21 w21) {
        FE0 fe02;
        FE0 fe03;
        super(enumC6348os0, c7575vI, ce0, i5, C1559Tt0.g("<get-" + ce0.getName() + ">"), z, z2, z3, i, w21);
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (enumC6348os0 == null) {
            b1(2);
            throw null;
        }
        if (c7575vI == null) {
            b1(3);
            throw null;
        }
        if (i == 0) {
            b1(4);
            throw null;
        }
        if (w21 == null) {
            b1(5);
            throw null;
        }
        if (fe0 != null) {
            fe03 = this;
            fe02 = fe0;
        } else {
            fe02 = this;
            fe03 = fe02;
        }
        fe03.o = fe02;
    }

    public static /* synthetic */ void b1(int i) {
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

    @Override // defpackage.FD
    /* renamed from: A1 */
    public final FE0 x1() {
        FE0 fe0 = this.o;
        if (fe0 != null) {
            return fe0;
        }
        b1(8);
        throw null;
    }

    public final void B1(AbstractC0663Ig0 abstractC0663Ig0) {
        if (abstractC0663Ig0 == null) {
            abstractC0663Ig0 = y1().getType();
        }
        this.n = abstractC0663Ig0;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.b(this, obj);
    }

    @Override // defpackage.InterfaceC7662vl
    public final List f0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        b1(7);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final AbstractC0663Ig0 getReturnType() {
        return this.n;
    }

    @Override // defpackage.InterfaceC8042xl, defpackage.InterfaceC7662vl
    public final Collection j() {
        return z1(true);
    }
}
