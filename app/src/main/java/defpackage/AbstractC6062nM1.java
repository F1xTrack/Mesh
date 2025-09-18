package defpackage;

import com.facebook.react.bridge.ReactContext;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: nM1 */
/* loaded from: classes.dex */
public abstract class AbstractC6062nM1 {
    public static RunnableC3467dr a(ReactContext reactContext) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L;
        O90.f(reactContext, "context");
        HT ht = CD0.b.a;
        synchronized (ht.a) {
            interfaceFutureC0750Jj0L = (QZ) ht.b;
            if (interfaceFutureC0750Jj0L == null) {
                C8054xp c8054xp = new C8054xp(reactContext, null);
                QZ qzA = QZ.a((InterfaceFutureC0750Jj0) ht.c);
                EE ee = new EE(23, new C8277z(26, c8054xp));
                TJ tjA = QR1.a();
                qzA.getClass();
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA, ee, tjA);
                ht.b = runnableC3467drR;
                AbstractC1500Sz1.a(runnableC3467drR, new C6846rT1(ht, c8054xp, reactContext, 16), QR1.a());
                interfaceFutureC0750Jj0L = AbstractC1500Sz1.l(runnableC3467drR);
            }
        }
        C0680Im c0680Im = new C0680Im(6);
        return AbstractC1500Sz1.r(interfaceFutureC0750Jj0L, new C0136Bm1(20, c0680Im), QR1.a());
    }

    public static boolean b(C2005Zm c2005Zm, Z01 z01, AbstractC5719lZ1 abstractC5719lZ1) {
        O90.f(z01, "type");
        InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
        if ((interfaceC1009Ms.q(z01) && !interfaceC1009Ms.m0(z01)) || interfaceC1009Ms.H(z01)) {
            return true;
        }
        c2005Zm.h();
        ArrayDeque arrayDeque = (ArrayDeque) c2005Zm.g;
        O90.c(arrayDeque);
        C8098y21 c8098y21 = (C8098y21) c2005Zm.h;
        O90.c(c8098y21);
        arrayDeque.push(z01);
        while (!arrayDeque.isEmpty()) {
            if (c8098y21.b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + z01 + ". Supertypes = " + AbstractC8069xu.H(c8098y21, null, null, null, null, 63)).toString());
            }
            Z01 z012 = (Z01) arrayDeque.pop();
            O90.c(z012);
            if (c8098y21.add(z012)) {
                boolean zM0 = interfaceC1009Ms.m0(z012);
                C1044Nd1 c1044Nd1 = C1044Nd1.c;
                AbstractC5719lZ1 abstractC5719lZ12 = zM0 ? c1044Nd1 : abstractC5719lZ1;
                if (abstractC5719lZ12.equals(c1044Nd1)) {
                    abstractC5719lZ12 = null;
                }
                if (abstractC5719lZ12 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC1009Ms.z(interfaceC1009Ms.W(z012)).iterator();
                    while (it.hasNext()) {
                        Z01 z01B = abstractC5719lZ12.b(c2005Zm, (InterfaceC0974Mg0) it.next());
                        if ((interfaceC1009Ms.q(z01B) && !interfaceC1009Ms.m0(z01B)) || interfaceC1009Ms.H(z01B)) {
                            c2005Zm.f();
                            return true;
                        }
                        arrayDeque.add(z01B);
                    }
                }
            }
        }
        c2005Zm.f();
        return false;
    }

    public static boolean c(C2005Zm c2005Zm, Z01 z01, InterfaceC1278Qd1 interfaceC1278Qd1) {
        InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
        if (interfaceC1009Ms.a0(z01)) {
            return true;
        }
        if (interfaceC1009Ms.m0(z01)) {
            return false;
        }
        if (c2005Zm.c) {
            interfaceC1009Ms.I(z01);
        }
        return interfaceC1009Ms.h0(interfaceC1009Ms.W(z01), interfaceC1278Qd1);
    }
}
