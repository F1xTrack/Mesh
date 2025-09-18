package p000;

import io.appmetrica.analytics.impl.C5043c9;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EZ1 {
    /* renamed from: a */
    public static /* synthetic */ void m2341a(int i) {
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
            case C5043c9.f31374J /* 35 */:
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
            case C5043c9.f31374J /* 35 */:
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

    /* renamed from: b */
    public static C10937rh0 m2342b(InterfaceC7032vl interfaceC7032vl, AbstractC7742Ig0 abstractC7742Ig0, C8340Tt0 c8340Tt0, InterfaceC0510I5 interfaceC0510I5, int i) {
        if (interfaceC0510I5 == null) {
            m2341a(33);
            throw null;
        }
        if (abstractC7742Ig0 == null) {
            return null;
        }
        C0565Iy c0565Iy = new C0565Iy(interfaceC7032vl, abstractC7742Ig0, c8340Tt0);
        C8978cQ0 c8978cQ0 = AbstractC8444Vt0.f12847a;
        return new C10937rh0(interfaceC7032vl, c0565Iy, interfaceC0510I5, C8340Tt0.m7798e(AbstractC8444Vt0.f12848b + '_' + i));
    }

    /* renamed from: c */
    public static FE0 m2343c(CE0 ce0, InterfaceC0510I5 interfaceC0510I5) {
        return m2349i(ce0, interfaceC0510I5, true, ce0.mo422e());
    }

    /* renamed from: d */
    public static JE0 m2344d(CE0 ce0, InterfaceC0510I5 interfaceC0510I5) {
        C0447H5 c0447h5 = S20.f10539b;
        W21 w21Mo422e = ce0.mo422e();
        if (w21Mo422e != null) {
            return m2350j(ce0, interfaceC0510I5, c0447h5, true, ce0.getVisibility(), w21Mo422e);
        }
        m2341a(6);
        throw null;
    }

    /* renamed from: e */
    public static EE0 m2345e(AbstractC0189D abstractC0189D) {
        if (abstractC0189D == null) {
            m2341a(26);
            throw null;
        }
        InterfaceC7402Bs0 interfaceC7402Bs0M24692d = AbstractC6814sI.m24692d(abstractC0189D);
        O90.m5968f(interfaceC7402Bs0M24692d, "<this>");
        InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0M24692d, C10092l41.f36881t);
        if (interfaceC6976usM17465b == null) {
            return null;
        }
        C0447H5 c0447h5 = S20.f10539b;
        EnumC10575os0 enumC10575os0 = EnumC10575os0.f39323b;
        C7003vI c7003vI = AbstractC7066wI.f44764e;
        EE0 ee0M2079z1 = EE0.m2079z1(abstractC0189D, enumC10575os0, c7003vI, false, AbstractC10732q41.f40578b, 4, abstractC0189D.mo422e());
        FE0 fe0 = new FE0(ee0M2079z1, c0447h5, enumC10575os0, c7003vI, false, false, false, 4, null, abstractC0189D.mo422e());
        ee0M2079z1.m2082C1(fe0, null, null, null);
        C7789Jd1.f5652b.getClass();
        C7789Jd1 c7789Jd1 = C7789Jd1.f5653c;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = interfaceC6976usM17465b.mo1439v();
        List listSingletonList = Collections.singletonList(new C10988s41(abstractC0189D.mo1492m()));
        O90.m5968f(c7789Jd1, "attributes");
        O90.m5968f(interfaceC8101Pd1Mo1439v, "constructor");
        O90.m5968f(listSingletonList, "arguments");
        ee0M2079z1.m2085F1(NV1.m5726A(c7789Jd1, interfaceC8101Pd1Mo1439v, listSingletonList, false), Collections.emptyList(), null, null, Collections.emptyList());
        fe0.m2559B1(ee0M2079z1.getReturnType());
        return ee0M2079z1;
    }

    /* renamed from: f */
    public static U01 m2346f(AbstractC0189D abstractC0189D) {
        if (abstractC0189D == null) {
            m2341a(24);
            throw null;
        }
        C0447H5 c0447h5 = S20.f10539b;
        U01 u01M7853J1 = U01.m7853J1(abstractC0189D, AbstractC10732q41.f40579c, 4, abstractC0189D.mo422e());
        return u01M7853J1.mo1215D1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C8473Wh1(u01M7853J1, null, 0, c0447h5, C8340Tt0.m7798e("value"), AbstractC6940uI.m25152e(abstractC0189D).m26510u(), false, false, false, null, abstractC0189D.mo422e())), abstractC0189D.mo1492m(), EnumC10575os0.f39323b, AbstractC7066wI.f44764e);
    }

    /* renamed from: g */
    public static U01 m2347g(AbstractC0189D abstractC0189D) {
        if (abstractC0189D == null) {
            m2341a(22);
            throw null;
        }
        U01 u01M7853J1 = U01.m7853J1(abstractC0189D, AbstractC10732q41.f40577a, 4, abstractC0189D.mo422e());
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        AbstractC11955zg0 abstractC11955zg0M25152e = AbstractC6940uI.m25152e(abstractC0189D);
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
        return u01M7853J1.mo1215D1(null, null, listEmptyList, listEmptyList2, listEmptyList3, abstractC11955zg0M25152e.m26500g(abstractC0189D.mo1492m()), EnumC10575os0.f39323b, AbstractC7066wI.f44764e);
    }

    /* renamed from: h */
    public static C10937rh0 m2348h(InterfaceC7032vl interfaceC7032vl, AbstractC7742Ig0 abstractC7742Ig0, InterfaceC0510I5 interfaceC0510I5) {
        if (abstractC7742Ig0 == null) {
            return null;
        }
        return new C10937rh0(interfaceC7032vl, new C7201yR(interfaceC7032vl, abstractC7742Ig0), interfaceC0510I5);
    }

    /* renamed from: i */
    public static FE0 m2349i(CE0 ce0, InterfaceC0510I5 interfaceC0510I5, boolean z, W21 w21) {
        if (interfaceC0510I5 == null) {
            m2341a(18);
            throw null;
        }
        if (w21 != null) {
            return new FE0(ce0, interfaceC0510I5, ce0.mo115f(), ce0.getVisibility(), z, false, false, 1, null, w21);
        }
        m2341a(19);
        throw null;
    }

    /* renamed from: j */
    public static JE0 m2350j(CE0 ce0, InterfaceC0510I5 interfaceC0510I5, InterfaceC0510I5 interfaceC0510I52, boolean z, C7003vI c7003vI, W21 w21) {
        if (interfaceC0510I5 == null) {
            m2341a(8);
            throw null;
        }
        if (interfaceC0510I52 == null) {
            m2341a(9);
            throw null;
        }
        if (c7003vI == null) {
            m2341a(10);
            throw null;
        }
        if (w21 == null) {
            m2341a(11);
            throw null;
        }
        JE0 je0 = new JE0(ce0, interfaceC0510I5, ce0.mo115f(), c7003vI, z, false, false, 1, null, w21);
        je0.f5400n = JE0.m4254A1(je0, ce0.getType(), interfaceC0510I52);
        return je0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final AbstractC7742Ig0 m2351k(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "<this>");
        if (abstractC7742Ig0 instanceof InterfaceC7583Fe1) {
            return ((InterfaceC7583Fe1) abstractC7742Ig0).mo2720k();
        }
        return null;
    }

    /* renamed from: l */
    public static final AbstractC8315Tg1 m2352l(AbstractC8315Tg1 abstractC8315Tg1, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        O90.m5968f(abstractC7742Ig0, "origin");
        return m2354n(abstractC8315Tg1, m2351k(abstractC7742Ig0));
    }

    /* renamed from: m */
    public static boolean m2353m(InterfaceC0036AZ interfaceC0036AZ) {
        if (interfaceC0036AZ.mo116l() == 4) {
            InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0036AZ.mo423i();
            int i = AbstractC6814sI.f42360a;
            if (AbstractC6814sI.m24702n(interfaceC0140CDMo423i, EnumC0118Bs.f1062c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final AbstractC8315Tg1 m2354n(AbstractC8315Tg1 abstractC8315Tg1, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        if (abstractC8315Tg1 instanceof InterfaceC7583Fe1) {
            return m2354n(((InterfaceC7583Fe1) abstractC8315Tg1).mo2721t(), abstractC7742Ig0);
        }
        if (abstractC7742Ig0 == null || abstractC7742Ig0.equals(abstractC8315Tg1)) {
            return abstractC8315Tg1;
        }
        if (abstractC8315Tg1 instanceof X01) {
            return new C8798b11((X01) abstractC8315Tg1, abstractC7742Ig0);
        }
        if (abstractC8315Tg1 instanceof AbstractC3933dW) {
            return new C4121gW((AbstractC3933dW) abstractC8315Tg1, abstractC7742Ig0);
        }
        throw new C6838sg();
    }
}
