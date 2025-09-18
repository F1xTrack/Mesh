package p000;

import java.lang.reflect.Method;

/* renamed from: oU0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10527oU0 {

    /* renamed from: a */
    public static final C0055As f39027a = C0055As.m358j(new C0664KX("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C10033kd0 m23468a(InterfaceC0036AZ interfaceC0036AZ) {
        String strM1690b = DS1.m1690b(interfaceC0036AZ);
        if (strM1690b == null) {
            if (interfaceC0036AZ instanceof FE0) {
                String strM7801b = AbstractC6940uI.m25158k(interfaceC0036AZ).getName().m7801b();
                O90.m5967e(strM7801b, "asString(...)");
                strM1690b = AbstractC7994Nc0.m5784a(strM7801b);
            } else if (interfaceC0036AZ instanceof JE0) {
                String strM7801b2 = AbstractC6940uI.m25158k(interfaceC0036AZ).getName().m7801b();
                O90.m5967e(strM7801b2, "asString(...)");
                strM1690b = AbstractC7994Nc0.m5785b(strM7801b2);
            } else {
                strM1690b = ((AbstractC0203DD) interfaceC0036AZ).getName().m7801b();
                O90.m5967e(strM1690b, "asString(...)");
            }
        }
        return new C10033kd0(new C10289md0(strM1690b, AbstractC9210eB1.m17874a(interfaceC0036AZ, 1)));
    }

    /* renamed from: b */
    public static S22 m23469b(CE0 ce0) {
        O90.m5968f(ce0, "possiblyOverriddenProperty");
        CE0 ce0Mo2089x1 = ((CE0) AbstractC6814sI.m24708t(ce0)).mo2089x1();
        O90.m5967e(ce0Mo2089x1, "getOriginal(...)");
        if (ce0Mo2089x1 instanceof C1214TI) {
            C1214TI c1214ti = (C1214TI) ce0Mo2089x1;
            C11741y00 c11741y00 = AbstractC7736Id0.f5052d;
            O90.m5967e(c11741y00, "propertySignature");
            C10753qF0 c10753qF0 = c1214ti.f11290B;
            C7424Cd0 c7424Cd0 = (C7424Cd0) XM1.m8993a(c10753qF0, c11741y00);
            if (c7424Cd0 != null) {
                return new C11441vd0(ce0Mo2089x1, c10753qF0, c7424Cd0, c1214ti.f11291C, c1214ti.f11292D);
            }
        } else if (ce0Mo2089x1 instanceof C9645hb0) {
            W21 w21Mo422e = ((C9645hb0) ce0Mo2089x1).mo422e();
            C10399nU0 c10399nU0 = w21Mo422e instanceof C10399nU0 ? (C10399nU0) w21Mo422e : null;
            AbstractC10005kP0 abstractC10005kP0 = c10399nU0 != null ? c10399nU0.f38345a : null;
            if (abstractC10005kP0 instanceof C10261mP0) {
                return new C11185td0(((C10261mP0) abstractC10005kP0).f37670a);
            }
            if (!(abstractC10005kP0 instanceof C10645pP0)) {
                throw new C1131Rz("Incorrect resolution sequence for Java field " + ce0Mo2089x1 + " (source = " + abstractC10005kP0 + ')', 1);
            }
            Method method = ((C10645pP0) abstractC10005kP0).f40051a;
            JE0 je0Mo1122d = ce0Mo2089x1.mo1122d();
            W21 w21Mo422e2 = je0Mo1122d != null ? je0Mo1122d.mo422e() : null;
            C10399nU0 c10399nU02 = w21Mo422e2 instanceof C10399nU0 ? (C10399nU0) w21Mo422e2 : null;
            AbstractC10005kP0 abstractC10005kP02 = c10399nU02 != null ? c10399nU02.f38345a : null;
            C10645pP0 c10645pP0 = abstractC10005kP02 instanceof C10645pP0 ? (C10645pP0) abstractC10005kP02 : null;
            return new C11313ud0(method, c10645pP0 != null ? c10645pP0.f40051a : null);
        }
        FE0 fe0Mo1121c = ce0Mo2089x1.mo1121c();
        O90.m5965c(fe0Mo1121c);
        C10033kd0 c10033kd0M23468a = m23468a(fe0Mo1121c);
        JE0 je0Mo1122d2 = ce0Mo2089x1.mo1122d();
        return new C11568wd0(c10033kd0M23468a, je0Mo1122d2 != null ? m23468a(je0Mo1122d2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static Q22 m23470c(InterfaceC0036AZ interfaceC0036AZ) {
        Method method;
        O90.m5968f(interfaceC0036AZ, "possiblySubstitutedFunction");
        InterfaceC0036AZ interfaceC0036AZMo2089x1 = ((InterfaceC0036AZ) AbstractC6814sI.m24708t(interfaceC0036AZ)).mo2089x1();
        O90.m5967e(interfaceC0036AZMo2089x1, "getOriginal(...)");
        if (!(interfaceC0036AZMo2089x1 instanceof InterfaceC7255zI)) {
            if (interfaceC0036AZMo2089x1 instanceof C9261eb0) {
                W21 w21Mo422e = ((C9261eb0) interfaceC0036AZMo2089x1).mo422e();
                C10399nU0 c10399nU0 = w21Mo422e instanceof C10399nU0 ? (C10399nU0) w21Mo422e : null;
                AbstractC10005kP0 abstractC10005kP0 = c10399nU0 != null ? c10399nU0.f38345a : null;
                C10645pP0 c10645pP0 = abstractC10005kP0 instanceof C10645pP0 ? (C10645pP0) abstractC10005kP0 : null;
                if (c10645pP0 != null && (method = c10645pP0.f40051a) != null) {
                    return new C9777id0(method);
                }
                throw new C1131Rz("Incorrect resolution sequence for Java method " + interfaceC0036AZMo2089x1, 1);
            }
            if (!(interfaceC0036AZMo2089x1 instanceof C8458Wa0)) {
                AbstractC0203DD abstractC0203DD = (AbstractC0203DD) interfaceC0036AZMo2089x1;
                if ((abstractC0203DD.getName().equals(AbstractC10732q41.f40579c) && EZ1.m2353m(interfaceC0036AZMo2089x1)) || ((abstractC0203DD.getName().equals(AbstractC10732q41.f40577a) && EZ1.m2353m(interfaceC0036AZMo2089x1)) || (O90.m5963a(abstractC0203DD.getName(), C6851st.f42654e) && interfaceC0036AZMo2089x1.mo1221f0().isEmpty()))) {
                    return m23468a(interfaceC0036AZMo2089x1);
                }
                throw new C1131Rz("Unknown origin of " + interfaceC0036AZMo2089x1 + " (" + interfaceC0036AZMo2089x1.getClass() + ')', 1);
            }
            W21 w21Mo422e2 = ((C8458Wa0) interfaceC0036AZMo2089x1).mo422e();
            C10399nU0 c10399nU02 = w21Mo422e2 instanceof C10399nU0 ? (C10399nU0) w21Mo422e2 : null;
            Object obj = c10399nU02 != null ? c10399nU02.f38345a : null;
            if (obj instanceof C9877jP0) {
                return new C9649hd0(((C9877jP0) obj).f35144a);
            }
            if (obj instanceof C9493gP0) {
                C9493gP0 c9493gP0 = (C9493gP0) obj;
                if (c9493gP0.f27782a.isAnnotation()) {
                    return new C9521gd0(c9493gP0.f27782a);
                }
            }
            throw new C1131Rz("Incorrect resolution sequence for Java constructor " + interfaceC0036AZMo2089x1 + " (" + obj + ')', 1);
        }
        InterfaceC7255zI interfaceC7255zI = (InterfaceC7255zI) interfaceC0036AZMo2089x1;
        AbstractC0631K0 abstractC0631K0Mo149C = interfaceC7255zI.mo149C();
        if (abstractC0631K0Mo149C instanceof C9729iF0) {
            C0217DR c0217dr = C7788Jd0.f5651a;
            C10289md0 c10289md0M4372c = C7788Jd0.m4372c((C9729iF0) abstractC0631K0Mo149C, interfaceC7255zI.mo153g0(), interfaceC7255zI.mo152X());
            if (c10289md0M4372c != null) {
                return new C10033kd0(c10289md0M4372c);
            }
        }
        if (abstractC0631K0Mo149C instanceof VE0) {
            C0217DR c0217dr2 = C7788Jd0.f5651a;
            C10289md0 c10289md0M4370a = C7788Jd0.m4370a((VE0) abstractC0631K0Mo149C, interfaceC7255zI.mo153g0(), interfaceC7255zI.mo152X());
            if (c10289md0M4370a != null) {
                InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0036AZ.mo423i();
                O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
                if (AbstractC11251u80.m25117b(interfaceC0140CDMo423i)) {
                    return new C10033kd0(c10289md0M4370a);
                }
                InterfaceC0140CD interfaceC0140CDMo423i2 = interfaceC0036AZ.mo423i();
                O90.m5967e(interfaceC0140CDMo423i2, "getContainingDeclaration(...)");
                if (!AbstractC11251u80.m25118c(interfaceC0140CDMo423i2)) {
                    return new C9905jd0(c10289md0M4370a);
                }
                InterfaceC6522ny interfaceC6522ny = (InterfaceC6522ny) interfaceC0036AZ;
                boolean zMo2718y = interfaceC6522ny.mo2718y();
                String str = c10289md0M4370a.f37798b;
                String str2 = c10289md0M4370a.f37799c;
                if (zMo2718y) {
                    if (!O90.m5963a(str, "constructor-impl") || !D51.m1550i(str2, ")V")) {
                        throw new IllegalArgumentException(("Invalid signature: " + c10289md0M4370a).toString());
                    }
                } else {
                    if (!O90.m5963a(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + c10289md0M4370a).toString());
                    }
                    InterfaceC6976us interfaceC6976usMo2719z = interfaceC6522ny.mo2719z();
                    O90.m5967e(interfaceC6976usMo2719z, "getConstructedClass(...)");
                    C0055As c0055AsM25153f = AbstractC6940uI.m25153f(interfaceC6976usMo2719z);
                    O90.m5965c(c0055AsM25153f);
                    String strM1919b = AbstractC0244Ds.m1919b(c0055AsM25153f.m360c());
                    if (D51.m1550i(str2, ")V")) {
                        String str3 = AbstractC11374v51.m25336K("V", str2) + strM1919b;
                        O90.m5968f(str, "name");
                        O90.m5968f(str3, "desc");
                        c10289md0M4370a = new C10289md0(str, str3);
                    } else if (!D51.m1550i(str2, strM1919b)) {
                        throw new IllegalArgumentException(("Invalid signature: " + c10289md0M4370a).toString());
                    }
                }
                return new C10033kd0(c10289md0M4370a);
            }
        }
        return m23468a(interfaceC0036AZMo2089x1);
    }
}
