package p000;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;

/* loaded from: classes2.dex */
public class U01 extends AbstractC0162CZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U01(InterfaceC0140CD interfaceC0140CD, U01 u01, InterfaceC0510I5 interfaceC0510I5, C8340Tt0 c8340Tt0, int i, W21 w21) {
        super(i, interfaceC0510I5, interfaceC0140CD, u01, c8340Tt0, w21);
        if (interfaceC0140CD == null) {
            m7854b1(0);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m7854b1(1);
            throw null;
        }
        if (c8340Tt0 == null) {
            m7854b1(2);
            throw null;
        }
        if (i == 0) {
            m7854b1(3);
            throw null;
        }
        if (w21 != null) {
        } else {
            m7854b1(4);
            throw null;
        }
    }

    /* renamed from: J1 */
    public static U01 m7853J1(InterfaceC6976us interfaceC6976us, C8340Tt0 c8340Tt0, int i, W21 w21) {
        C0447H5 c0447h5 = S20.f10539b;
        if (interfaceC6976us == null) {
            m7854b1(5);
            throw null;
        }
        if (c8340Tt0 == null) {
            m7854b1(7);
            throw null;
        }
        if (i == 0) {
            m7854b1(8);
            throw null;
        }
        if (w21 != null) {
            return new U01(interfaceC6976us, null, c0447h5, c8340Tt0, i, w21);
        }
        m7854b1(9);
        throw null;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m7854b1(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: A1 */
    public AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        if (interfaceC0140CD == null) {
            m7854b1(25);
            throw null;
        }
        if (i == 0) {
            m7854b1(26);
            throw null;
        }
        if (interfaceC0510I5 == null) {
            m7854b1(27);
            throw null;
        }
        U01 u01 = (U01) interfaceC0036AZ;
        if (c8340Tt0 == null) {
            c8340Tt0 = getName();
        }
        return new U01(interfaceC0140CD, u01, interfaceC0510I5, c8340Tt0, i, w21);
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: K1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final U01 mo2089x1() {
        U01 u01 = (U01) super.mo2089x1();
        if (u01 != null) {
            return u01;
        }
        m7854b1(24);
        throw null;
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: L1 */
    public final U01 mo1215D1(C10937rh0 c10937rh0, C10937rh0 c10937rh02, List list, List list2, List list3, AbstractC7742Ig0 abstractC7742Ig0, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        if (list == null) {
            m7854b1(14);
            throw null;
        }
        if (list2 == null) {
            m7854b1(15);
            throw null;
        }
        if (list3 == null) {
            m7854b1(16);
            throw null;
        }
        if (c7003vI != null) {
            return mo7857M1(c10937rh0, c10937rh02, list, list2, list3, abstractC7742Ig0, enumC10575os0, c7003vI, null);
        }
        m7854b1(17);
        throw null;
    }

    /* renamed from: M1 */
    public U01 mo7857M1(C10937rh0 c10937rh0, C10937rh0 c10937rh02, List list, List list2, List list3, AbstractC7742Ig0 abstractC7742Ig0, EnumC10575os0 enumC10575os0, C7003vI c7003vI, C0842NN c0842nn) {
        if (list == null) {
            m7854b1(19);
            throw null;
        }
        if (list2 == null) {
            m7854b1(20);
            throw null;
        }
        if (list3 == null) {
            m7854b1(21);
            throw null;
        }
        if (c7003vI != null) {
            super.mo1215D1(c10937rh0, c10937rh02, list, list2, list3, abstractC7742Ig0, enumC10575os0, c7003vI);
            return this;
        }
        m7854b1(22);
        throw null;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC0036AZ
    /* renamed from: N0 */
    public InterfaceC7272zZ mo228N0() {
        return m1216E1(C11571we1.f45010b);
    }
}
