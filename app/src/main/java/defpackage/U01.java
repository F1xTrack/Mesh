package defpackage;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;

/* loaded from: classes2.dex */
public class U01 extends CZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U01(CD cd, U01 u01, I5 i5, C1559Tt0 c1559Tt0, int i, W21 w21) {
        super(i, i5, cd, u01, c1559Tt0, w21);
        if (cd == null) {
            b1(0);
            throw null;
        }
        if (i5 == null) {
            b1(1);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(2);
            throw null;
        }
        if (i == 0) {
            b1(3);
            throw null;
        }
        if (w21 != null) {
        } else {
            b1(4);
            throw null;
        }
    }

    public static U01 J1(InterfaceC7492us interfaceC7492us, C1559Tt0 c1559Tt0, int i, W21 w21) {
        H5 h5 = S20.b;
        if (interfaceC7492us == null) {
            b1(5);
            throw null;
        }
        if (c1559Tt0 == null) {
            b1(7);
            throw null;
        }
        if (i == 0) {
            b1(8);
            throw null;
        }
        if (w21 != null) {
            return new U01(interfaceC7492us, null, h5, c1559Tt0, i, w21);
        }
        b1(9);
        throw null;
    }

    public static /* synthetic */ void b1(int i) {
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

    @Override // defpackage.CZ
    public CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        if (cd == null) {
            b1(25);
            throw null;
        }
        if (i == 0) {
            b1(26);
            throw null;
        }
        if (i5 == null) {
            b1(27);
            throw null;
        }
        U01 u01 = (U01) az;
        if (c1559Tt0 == null) {
            c1559Tt0 = getName();
        }
        return new U01(cd, u01, i5, c1559Tt0, i, w21);
    }

    @Override // defpackage.FD
    /* renamed from: K1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final U01 x1() {
        U01 u01 = (U01) super.x1();
        if (u01 != null) {
            return u01;
        }
        b1(24);
        throw null;
    }

    @Override // defpackage.CZ
    /* renamed from: L1 */
    public final U01 D1(C6887rh0 c6887rh0, C6887rh0 c6887rh02, List list, List list2, List list3, AbstractC0663Ig0 abstractC0663Ig0, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        if (list == null) {
            b1(14);
            throw null;
        }
        if (list2 == null) {
            b1(15);
            throw null;
        }
        if (list3 == null) {
            b1(16);
            throw null;
        }
        if (c7575vI != null) {
            return M1(c6887rh0, c6887rh02, list, list2, list3, abstractC0663Ig0, enumC6348os0, c7575vI, null);
        }
        b1(17);
        throw null;
    }

    public U01 M1(C6887rh0 c6887rh0, C6887rh0 c6887rh02, List list, List list2, List list3, AbstractC0663Ig0 abstractC0663Ig0, EnumC6348os0 enumC6348os0, C7575vI c7575vI, NN nn) {
        if (list == null) {
            b1(19);
            throw null;
        }
        if (list2 == null) {
            b1(20);
            throw null;
        }
        if (list3 == null) {
            b1(21);
            throw null;
        }
        if (c7575vI != null) {
            super.D1(c6887rh0, c6887rh02, list, list2, list3, abstractC0663Ig0, enumC6348os0, c7575vI);
            return this;
        }
        b1(22);
        throw null;
    }

    @Override // defpackage.CZ, defpackage.AZ
    public InterfaceC8386zZ N0() {
        return E1(C7833we1.b);
    }
}
