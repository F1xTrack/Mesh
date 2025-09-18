package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class JE0 extends AE0 implements InterfaceC11899zE0 {

    /* renamed from: n */
    public C8473Wh1 f5400n;

    /* renamed from: o */
    public final JE0 f5401o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JE0(CE0 ce0, InterfaceC0510I5 interfaceC0510I5, EnumC10575os0 enumC10575os0, C7003vI c7003vI, boolean z, boolean z2, boolean z3, int i, JE0 je0, W21 w21) {
        JE0 je02;
        JE0 je03;
        super(enumC10575os0, c7003vI, ce0, interfaceC0510I5, C8340Tt0.m7800g("<set-" + ce0.getName() + ">"), z, z2, z3, i, w21);
        if (interfaceC0510I5 == null) {
            m4255b1(1);
            throw null;
        }
        if (enumC10575os0 == null) {
            m4255b1(2);
            throw null;
        }
        if (c7003vI == null) {
            m4255b1(3);
            throw null;
        }
        if (i == 0) {
            m4255b1(4);
            throw null;
        }
        if (w21 == null) {
            m4255b1(5);
            throw null;
        }
        if (je0 != null) {
            je03 = this;
            je02 = je0;
        } else {
            je02 = this;
            je03 = je02;
        }
        je03.f5401o = je02;
    }

    /* renamed from: A1 */
    public static C8473Wh1 m4254A1(JE0 je0, AbstractC7742Ig0 abstractC7742Ig0, InterfaceC0510I5 interfaceC0510I5) {
        if (abstractC7742Ig0 == null) {
            m4255b1(8);
            throw null;
        }
        if (interfaceC0510I5 != null) {
            return new C8473Wh1(je0, null, 0, interfaceC0510I5, AbstractC9961k31.f36280g, abstractC7742Ig0, false, false, false, null, W21.f12940O0);
        }
        m4255b1(9);
        throw null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m4255b1(int i) {
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

    @Override // p000.AbstractC0329FD
    /* renamed from: B1 */
    public final JE0 mo2089x1() {
        JE0 je0 = this.f5401o;
        if (je0 != null) {
            return je0;
        }
        m4255b1(13);
        throw null;
    }

    @Override // p000.InterfaceC0140CD
    /* renamed from: Z */
    public final Object mo421Z(InterfaceC0392GD interfaceC0392GD, Object obj) {
        return interfaceC0392GD.mo2846i(this, obj);
    }

    @Override // p000.InterfaceC7032vl
    /* renamed from: f0 */
    public final List mo1221f0() {
        C8473Wh1 c8473Wh1 = this.f5400n;
        if (c8473Wh1 == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(c8473Wh1);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m4255b1(11);
        throw null;
    }

    @Override // p000.InterfaceC7032vl
    public final AbstractC7742Ig0 getReturnType() {
        return AbstractC6940uI.m25152e(this).m26512w();
    }

    @Override // p000.InterfaceC7158xl, p000.InterfaceC7032vl
    /* renamed from: j */
    public final Collection mo1222j() {
        return m124z1(false);
    }
}
