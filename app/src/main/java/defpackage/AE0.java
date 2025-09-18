package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AE0 extends FD implements InterfaceC8324zE0 {
    public boolean f;
    public final boolean g;
    public final EnumC6348os0 h;
    public final CE0 i;
    public final boolean j;
    public final int k;
    public C7575vI l;
    public AZ m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AE0(EnumC6348os0 enumC6348os0, C7575vI c7575vI, CE0 ce0, I5 i5, C1559Tt0 c1559Tt0, boolean z, boolean z2, boolean z3, int i, W21 w21) {
        super(ce0.i(), i5, c1559Tt0, w21);
        if (enumC6348os0 == null) {
            b1(0);
            throw null;
        }
        if (c7575vI == null) {
            b1(1);
            throw null;
        }
        if (i5 == null) {
            b1(3);
            throw null;
        }
        if (w21 == null) {
            b1(5);
            throw null;
        }
        this.m = null;
        this.h = enumC6348os0;
        this.l = c7575vI;
        this.i = ce0;
        this.f = z;
        this.g = z2;
        this.j = z3;
        this.k = i;
    }

    public static /* synthetic */ void b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC7662vl
    public final boolean F() {
        return false;
    }

    @Override // defpackage.AZ
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.InterfaceC8042xl
    public final void H0(Collection collection) {
        if (collection != null) {
            return;
        }
        b1(16);
        throw null;
    }

    @Override // defpackage.AZ
    public final boolean L0() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean M() {
        return false;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.AZ
    public final boolean S() {
        return false;
    }

    @Override // defpackage.AZ, defpackage.R51
    public final AZ b(C7833we1 c7833we1) {
        if (c7833we1 != null) {
            return this;
        }
        b1(7);
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final EnumC6348os0 f() {
        EnumC6348os0 enumC6348os0 = this.h;
        if (enumC6348os0 != null) {
            return enumC6348os0;
        }
        b1(10);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        b1(9);
        throw null;
    }

    @Override // defpackage.HD, defpackage.InterfaceC2400bq0
    public final C7575vI getVisibility() {
        C7575vI c7575vI = this.l;
        if (c7575vI != null) {
            return c7575vI;
        }
        b1(11);
        throw null;
    }

    @Override // defpackage.InterfaceC2400bq0
    public final boolean isExternal() {
        return this.g;
    }

    @Override // defpackage.AZ
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.AZ
    public final boolean isInline() {
        return this.j;
    }

    @Override // defpackage.AZ
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.AZ
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.InterfaceC8042xl
    public final int l() {
        int i = this.k;
        if (i != 0) {
            return i;
        }
        b1(6);
        throw null;
    }

    @Override // defpackage.InterfaceC8042xl
    public final InterfaceC8042xl m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // defpackage.AZ
    public final AZ o0() {
        return this.m;
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 q0() {
        return y1().q0();
    }

    @Override // defpackage.InterfaceC7662vl
    public final Object s(KI ki) {
        return null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final C6887rh0 t0() {
        return y1().t0();
    }

    @Override // defpackage.InterfaceC7662vl
    public final List x0() {
        List listX0 = y1().x0();
        if (listX0 != null) {
            return listX0;
        }
        b1(14);
        throw null;
    }

    public final CE0 y1() {
        CE0 ce0 = this.i;
        if (ce0 != null) {
            return ce0;
        }
        b1(13);
        throw null;
    }

    public final ArrayList z1(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (CE0 ce0 : y1().j()) {
            DD ddC = z ? ce0.c() : ce0.d();
            if (ddC != null) {
                arrayList.add(ddC);
            }
        }
        return arrayList;
    }

    @Override // defpackage.R51
    public final /* bridge */ /* synthetic */ ED b(C7833we1 c7833we1) {
        b(c7833we1);
        return this;
    }
}
