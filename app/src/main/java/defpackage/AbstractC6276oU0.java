package defpackage;

import java.lang.reflect.Method;

/* renamed from: oU0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6276oU0 {
    public static final C0074As a = C0074As.j(new KX("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static C5539kd0 a(AZ az) {
        String strB = DS1.b(az);
        if (strB == null) {
            if (az instanceof FE0) {
                String strB2 = AbstractC7384uI.k(az).getName().b();
                O90.e(strB2, "asString(...)");
                strB = AbstractC1040Nc0.a(strB2);
            } else if (az instanceof JE0) {
                String strB3 = AbstractC7384uI.k(az).getName().b();
                O90.e(strB3, "asString(...)");
                strB = AbstractC1040Nc0.b(strB3);
            } else {
                strB = ((DD) az).getName().b();
                O90.e(strB, "asString(...)");
            }
        }
        return new C5539kd0(new C5921md0(strB, AbstractC3534eB1.a(az, 1)));
    }

    public static S22 b(CE0 ce0) {
        O90.f(ce0, "possiblyOverriddenProperty");
        CE0 ce0X1 = ((CE0) AbstractC7002sI.t(ce0)).x1();
        O90.e(ce0X1, "getOriginal(...)");
        if (ce0X1 instanceof TI) {
            TI ti = (TI) ce0X1;
            C8089y00 c8089y00 = AbstractC0654Id0.d;
            O90.e(c8089y00, "propertySignature");
            C6613qF0 c6613qF0 = ti.B;
            C0186Cd0 c0186Cd0 = (C0186Cd0) XM1.a(c6613qF0, c8089y00);
            if (c0186Cd0 != null) {
                return new C7639vd0(ce0X1, c6613qF0, c0186Cd0, ti.C, ti.D);
            }
        } else if (ce0X1 instanceof C4184hb0) {
            W21 w21E = ((C4184hb0) ce0X1).e();
            C6085nU0 c6085nU0 = w21E instanceof C6085nU0 ? (C6085nU0) w21E : null;
            AbstractC5497kP0 abstractC5497kP0 = c6085nU0 != null ? c6085nU0.a : null;
            if (abstractC5497kP0 instanceof C5879mP0) {
                return new C7257td0(((C5879mP0) abstractC5497kP0).a);
            }
            if (!(abstractC5497kP0 instanceof C6452pP0)) {
                throw new C1420Rz("Incorrect resolution sequence for Java field " + ce0X1 + " (source = " + abstractC5497kP0 + ')', 1);
            }
            Method method = ((C6452pP0) abstractC5497kP0).a;
            JE0 je0D = ce0X1.d();
            W21 w21E2 = je0D != null ? je0D.e() : null;
            C6085nU0 c6085nU02 = w21E2 instanceof C6085nU0 ? (C6085nU0) w21E2 : null;
            AbstractC5497kP0 abstractC5497kP02 = c6085nU02 != null ? c6085nU02.a : null;
            C6452pP0 c6452pP0 = abstractC5497kP02 instanceof C6452pP0 ? (C6452pP0) abstractC5497kP02 : null;
            return new C7448ud0(method, c6452pP0 != null ? c6452pP0.a : null);
        }
        FE0 fe0C = ce0X1.c();
        O90.c(fe0C);
        C5539kd0 c5539kd0A = a(fe0C);
        JE0 je0D2 = ce0X1.d();
        return new C7829wd0(c5539kd0A, je0D2 != null ? a(je0D2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Q22 c(AZ az) {
        Method method;
        O90.f(az, "possiblySubstitutedFunction");
        AZ azX1 = ((AZ) AbstractC7002sI.t(az)).x1();
        O90.e(azX1, "getOriginal(...)");
        if (!(azX1 instanceof InterfaceC8335zI)) {
            if (azX1 instanceof C3611eb0) {
                W21 w21E = ((C3611eb0) azX1).e();
                C6085nU0 c6085nU0 = w21E instanceof C6085nU0 ? (C6085nU0) w21E : null;
                AbstractC5497kP0 abstractC5497kP0 = c6085nU0 != null ? c6085nU0.a : null;
                C6452pP0 c6452pP0 = abstractC5497kP0 instanceof C6452pP0 ? (C6452pP0) abstractC5497kP0 : null;
                if (c6452pP0 != null && (method = c6452pP0.a) != null) {
                    return new C4381id0(method);
                }
                throw new C1420Rz("Incorrect resolution sequence for Java method " + azX1, 1);
            }
            if (!(azX1 instanceof C1736Wa0)) {
                DD dd = (DD) azX1;
                if ((dd.getName().equals(AbstractC6581q41.c) && EZ1.m(azX1)) || ((dd.getName().equals(AbstractC6581q41.a) && EZ1.m(azX1)) || (O90.a(dd.getName(), C7113st.e) && azX1.f0().isEmpty()))) {
                    return a(azX1);
                }
                throw new C1420Rz("Unknown origin of " + azX1 + " (" + azX1.getClass() + ')', 1);
            }
            W21 w21E2 = ((C1736Wa0) azX1).e();
            C6085nU0 c6085nU02 = w21E2 instanceof C6085nU0 ? (C6085nU0) w21E2 : null;
            Object obj = c6085nU02 != null ? c6085nU02.a : null;
            if (obj instanceof C5306jP0) {
                return new C4190hd0(((C5306jP0) obj).a);
            }
            if (obj instanceof C3957gP0) {
                C3957gP0 c3957gP0 = (C3957gP0) obj;
                if (c3957gP0.a.isAnnotation()) {
                    return new C3999gd0(c3957gP0.a);
                }
            }
            throw new C1420Rz("Incorrect resolution sequence for Java constructor " + azX1 + " (" + obj + ')', 1);
        }
        InterfaceC8335zI interfaceC8335zI = (InterfaceC8335zI) azX1;
        K0 k0C = interfaceC8335zI.C();
        if (k0C instanceof C4309iF0) {
            DR dr = C0732Jd0.a;
            C5921md0 c5921md0C = C0732Jd0.c((C4309iF0) k0C, interfaceC8335zI.g0(), interfaceC8335zI.X());
            if (c5921md0C != null) {
                return new C5539kd0(c5921md0C);
            }
        }
        if (k0C instanceof VE0) {
            DR dr2 = C0732Jd0.a;
            C5921md0 c5921md0A = C0732Jd0.a((VE0) k0C, interfaceC8335zI.g0(), interfaceC8335zI.X());
            if (c5921md0A != null) {
                CD cdI = az.i();
                O90.e(cdI, "getContainingDeclaration(...)");
                if (AbstractC7355u80.b(cdI)) {
                    return new C5539kd0(c5921md0A);
                }
                CD cdI2 = az.i();
                O90.e(cdI2, "getContainingDeclaration(...)");
                if (!AbstractC7355u80.c(cdI2)) {
                    return new C5348jd0(c5921md0A);
                }
                InterfaceC6174ny interfaceC6174ny = (InterfaceC6174ny) az;
                boolean zY = interfaceC6174ny.y();
                String str = c5921md0A.b;
                String str2 = c5921md0A.c;
                if (zY) {
                    if (!O90.a(str, "constructor-impl") || !D51.i(str2, ")V")) {
                        throw new IllegalArgumentException(("Invalid signature: " + c5921md0A).toString());
                    }
                } else {
                    if (!O90.a(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + c5921md0A).toString());
                    }
                    InterfaceC7492us interfaceC7492usZ = interfaceC6174ny.z();
                    O90.e(interfaceC7492usZ, "getConstructedClass(...)");
                    C0074As c0074AsF = AbstractC7384uI.f(interfaceC7492usZ);
                    O90.c(c0074AsF);
                    String strB = AbstractC0308Ds.b(c0074AsF.c());
                    if (D51.i(str2, ")V")) {
                        String str3 = AbstractC7538v51.K("V", str2) + strB;
                        O90.f(str, "name");
                        O90.f(str3, "desc");
                        c5921md0A = new C5921md0(str, str3);
                    } else if (!D51.i(str2, strB)) {
                        throw new IllegalArgumentException(("Invalid signature: " + c5921md0A).toString());
                    }
                }
                return new C5539kd0(c5921md0A);
            }
        }
        return a(azX1);
    }
}
