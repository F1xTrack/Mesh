package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class JE0 extends AE0 implements InterfaceC8324zE0 {
    public C1758Wh1 n;
    public final JE0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JE0(CE0 ce0, I5 i5, EnumC6348os0 enumC6348os0, C7575vI c7575vI, boolean z, boolean z2, boolean z3, int i, JE0 je0, W21 w21) {
        JE0 je02;
        JE0 je03;
        super(enumC6348os0, c7575vI, ce0, i5, C1559Tt0.g("<set-" + ce0.getName() + ">"), z, z2, z3, i, w21);
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
        if (je0 != null) {
            je03 = this;
            je02 = je0;
        } else {
            je02 = this;
            je03 = je02;
        }
        je03.o = je02;
    }

    public static C1758Wh1 A1(JE0 je0, AbstractC0663Ig0 abstractC0663Ig0, I5 i5) {
        if (abstractC0663Ig0 == null) {
            b1(8);
            throw null;
        }
        if (i5 != null) {
            return new C1758Wh1(je0, null, 0, i5, AbstractC5431k31.g, abstractC0663Ig0, false, false, false, null, W21.O0);
        }
        b1(9);
        throw null;
    }

    public static /* synthetic */ void b1(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.FD
    /* renamed from: B1 */
    public final JE0 x1() {
        JE0 je0 = this.o;
        if (je0 != null) {
            return je0;
        }
        b1(13);
        throw null;
    }

    @Override // defpackage.CD
    public final Object Z(GD gd, Object obj) {
        return gd.i(this, obj);
    }

    @Override // defpackage.InterfaceC7662vl
    public final List f0() {
        C1758Wh1 c1758Wh1 = this.n;
        if (c1758Wh1 == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(c1758Wh1);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        b1(11);
        throw null;
    }

    @Override // defpackage.InterfaceC7662vl
    public final AbstractC0663Ig0 getReturnType() {
        return AbstractC7384uI.e(this).w();
    }

    @Override // defpackage.InterfaceC8042xl, defpackage.InterfaceC7662vl
    public final Collection j() {
        return z1(false);
    }
}
