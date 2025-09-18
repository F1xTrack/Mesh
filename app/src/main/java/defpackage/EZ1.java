package defpackage;

import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C4473c9;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EZ1 {
    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case C4473c9.J /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case C4473c9.J /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C6887rh0 b(InterfaceC7662vl interfaceC7662vl, AbstractC0663Ig0 abstractC0663Ig0, C1559Tt0 c1559Tt0, I5 i5, int i) {
        if (i5 == null) {
            a(33);
            throw null;
        }
        if (abstractC0663Ig0 == null) {
            return null;
        }
        C0716Iy c0716Iy = new C0716Iy(interfaceC7662vl, abstractC0663Ig0, c1559Tt0);
        C2512cQ0 c2512cQ0 = AbstractC1715Vt0.a;
        return new C6887rh0(interfaceC7662vl, c0716Iy, i5, C1559Tt0.e(AbstractC1715Vt0.b + '_' + i));
    }

    public static FE0 c(CE0 ce0, I5 i5) {
        return i(ce0, i5, true, ce0.e());
    }

    public static JE0 d(CE0 ce0, I5 i5) {
        H5 h5 = S20.b;
        W21 w21E = ce0.e();
        if (w21E != null) {
            return j(ce0, i5, h5, true, ce0.getVisibility(), w21E);
        }
        a(6);
        throw null;
    }

    public static EE0 e(D d) {
        if (d == null) {
            a(26);
            throw null;
        }
        InterfaceC0153Bs0 interfaceC0153Bs0D = AbstractC7002sI.d(d);
        O90.f(interfaceC0153Bs0D, "<this>");
        InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0D, C5626l41.t);
        if (interfaceC7492usB == null) {
            return null;
        }
        H5 h5 = S20.b;
        EnumC6348os0 enumC6348os0 = EnumC6348os0.b;
        C7575vI c7575vI = AbstractC7765wI.e;
        EE0 ee0Z1 = EE0.z1(d, enumC6348os0, c7575vI, false, AbstractC6581q41.b, 4, d.e());
        FE0 fe0 = new FE0(ee0Z1, h5, enumC6348os0, c7575vI, false, false, false, 4, null, d.e());
        ee0Z1.C1(fe0, null, null, null);
        C0733Jd1.b.getClass();
        C0733Jd1 c0733Jd1 = C0733Jd1.c;
        InterfaceC1200Pd1 interfaceC1200Pd1V = interfaceC7492usB.v();
        List listSingletonList = Collections.singletonList(new C6962s41(d.m()));
        O90.f(c0733Jd1, "attributes");
        O90.f(interfaceC1200Pd1V, "constructor");
        O90.f(listSingletonList, "arguments");
        ee0Z1.F1(NV1.A(c0733Jd1, interfaceC1200Pd1V, listSingletonList, false), Collections.emptyList(), null, null, Collections.emptyList());
        fe0.B1(ee0Z1.getReturnType());
        return ee0Z1;
    }

    public static U01 f(D d) {
        if (d == null) {
            a(24);
            throw null;
        }
        H5 h5 = S20.b;
        U01 u01J1 = U01.J1(d, AbstractC6581q41.c, 4, d.e());
        return u01J1.D1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C1758Wh1(u01J1, null, 0, h5, C1559Tt0.e("value"), AbstractC7384uI.e(d).u(), false, false, false, null, d.e())), d.m(), EnumC6348os0.b, AbstractC7765wI.e);
    }

    public static U01 g(D d) {
        if (d == null) {
            a(22);
            throw null;
        }
        U01 u01J1 = U01.J1(d, AbstractC6581q41.a, 4, d.e());
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        AbstractC8408zg0 abstractC8408zg0E = AbstractC7384uI.e(d);
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
        return u01J1.D1(null, null, listEmptyList, listEmptyList2, listEmptyList3, abstractC8408zg0E.g(d.m()), EnumC6348os0.b, AbstractC7765wI.e);
    }

    public static C6887rh0 h(InterfaceC7662vl interfaceC7662vl, AbstractC0663Ig0 abstractC0663Ig0, I5 i5) {
        if (abstractC0663Ig0 == null) {
            return null;
        }
        return new C6887rh0(interfaceC7662vl, new C8172yR(interfaceC7662vl, abstractC0663Ig0), i5);
    }

    public static FE0 i(CE0 ce0, I5 i5, boolean z, W21 w21) {
        if (i5 == null) {
            a(18);
            throw null;
        }
        if (w21 != null) {
            return new FE0(ce0, i5, ce0.f(), ce0.getVisibility(), z, false, false, 1, null, w21);
        }
        a(19);
        throw null;
    }

    public static JE0 j(CE0 ce0, I5 i5, I5 i52, boolean z, C7575vI c7575vI, W21 w21) {
        if (i5 == null) {
            a(8);
            throw null;
        }
        if (i52 == null) {
            a(9);
            throw null;
        }
        if (c7575vI == null) {
            a(10);
            throw null;
        }
        if (w21 == null) {
            a(11);
            throw null;
        }
        JE0 je0 = new JE0(ce0, i5, ce0.f(), c7575vI, z, false, false, 1, null, w21);
        je0.n = JE0.A1(je0, ce0.getType(), i52);
        return je0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC0663Ig0 k(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        if (abstractC0663Ig0 instanceof InterfaceC0424Fe1) {
            return ((InterfaceC0424Fe1) abstractC0663Ig0).k();
        }
        return null;
    }

    public static final AbstractC1521Tg1 l(AbstractC1521Tg1 abstractC1521Tg1, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC1521Tg1, "<this>");
        O90.f(abstractC0663Ig0, "origin");
        return n(abstractC1521Tg1, k(abstractC0663Ig0));
    }

    public static boolean m(AZ az) {
        if (az.l() == 4) {
            CD cdI = az.i();
            int i = AbstractC7002sI.a;
            if (AbstractC7002sI.n(cdI, EnumC0152Bs.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC1521Tg1 n(AbstractC1521Tg1 abstractC1521Tg1, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC1521Tg1, "<this>");
        if (abstractC1521Tg1 instanceof InterfaceC0424Fe1) {
            return n(((InterfaceC0424Fe1) abstractC1521Tg1).t(), abstractC0663Ig0);
        }
        if (abstractC0663Ig0 == null || abstractC0663Ig0.equals(abstractC1521Tg1)) {
            return abstractC1521Tg1;
        }
        if (abstractC1521Tg1 instanceof X01) {
            return new C2245b11((X01) abstractC1521Tg1, abstractC0663Ig0);
        }
        if (abstractC1521Tg1 instanceof AbstractC3405dW) {
            return new C3977gW((AbstractC3405dW) abstractC1521Tg1, abstractC0663Ig0);
        }
        throw new C7074sg();
    }
}
