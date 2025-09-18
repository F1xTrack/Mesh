package p000;

import com.facebook.react.bridge.ReactContext;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: nM1 */
/* loaded from: classes.dex */
public abstract class AbstractC10384nM1 {
    /* renamed from: a */
    public static RunnableC3953dr m23132a(ReactContext reactContext) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7489l;
        O90.m5968f(reactContext, "context");
        C0471HT c0471ht = CD0.f1253b.f1254a;
        synchronized (c0471ht.f4309a) {
            interfaceFutureC7800Jj0M7489l = (C1043QZ) c0471ht.f4310b;
            if (interfaceFutureC7800Jj0M7489l == null) {
                C7162xp c7162xp = new C7162xp(reactContext, null);
                C1043QZ c1043qzM6727a = C1043QZ.m6727a((InterfaceFutureC7800Jj0) c0471ht.f4311c);
                C0267EE c0267ee = new C0267EE(23, new C7236z(26, c7162xp));
                ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
                c1043qzM6727a.getClass();
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a, c0267ee, executorC1215TJM6703a);
                c0471ht.f4310b = runnableC3953drM7495r;
                AbstractC8301Sz1.m7478a(runnableC3953drM7495r, new C10910rT1(c0471ht, c7162xp, reactContext, 16), QR1.m6703a());
                interfaceFutureC7800Jj0M7489l = AbstractC8301Sz1.m7489l(runnableC3953drM7495r);
            }
        }
        C0553Im c0553Im = new C0553Im(6);
        return AbstractC8301Sz1.m7495r(interfaceFutureC7800Jj0M7489l, new C7391Bm1(20, c0553Im), QR1.m6703a());
    }

    /* renamed from: b */
    public static boolean m23133b(C1622Zm c1622Zm, Z01 z01, AbstractC10154lZ1 abstractC10154lZ1) {
        O90.m5968f(z01, "type");
        InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
        if ((interfaceC0810Ms.mo1100q(z01) && !interfaceC0810Ms.mo1090m0(z01)) || interfaceC0810Ms.mo1021H(z01)) {
            return true;
        }
        c1622Zm.m9595h();
        ArrayDeque arrayDeque = (ArrayDeque) c1622Zm.f15119g;
        O90.m5965c(arrayDeque);
        C11748y21 c11748y21 = (C11748y21) c1622Zm.f15120h;
        O90.m5965c(c11748y21);
        arrayDeque.push(z01);
        while (!arrayDeque.isEmpty()) {
            if (c11748y21.f46049b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + z01 + ". Supertypes = " + AbstractC7167xu.m25962H(c11748y21, null, null, null, null, 63)).toString());
            }
            Z01 z012 = (Z01) arrayDeque.pop();
            O90.m5965c(z012);
            if (c11748y21.add(z012)) {
                boolean zMo1090m0 = interfaceC0810Ms.mo1090m0(z012);
                C7997Nd1 c7997Nd1 = C7997Nd1.f7929c;
                AbstractC10154lZ1 abstractC10154lZ12 = zMo1090m0 ? c7997Nd1 : abstractC10154lZ1;
                if (abstractC10154lZ12.equals(c7997Nd1)) {
                    abstractC10154lZ12 = null;
                }
                if (abstractC10154lZ12 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC0810Ms.mo1116z(interfaceC0810Ms.mo1047W(z012)).iterator();
                    while (it.hasNext()) {
                        Z01 z01Mo5127b = abstractC10154lZ12.mo5127b(c1622Zm, (InterfaceC7950Mg0) it.next());
                        if ((interfaceC0810Ms.mo1100q(z01Mo5127b) && !interfaceC0810Ms.mo1090m0(z01Mo5127b)) || interfaceC0810Ms.mo1021H(z01Mo5127b)) {
                            c1622Zm.m9593f();
                            return true;
                        }
                        arrayDeque.add(z01Mo5127b);
                    }
                }
            }
        }
        c1622Zm.m9593f();
        return false;
    }

    /* renamed from: c */
    public static boolean m23134c(C1622Zm c1622Zm, Z01 z01, InterfaceC8153Qd1 interfaceC8153Qd1) {
        InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
        if (interfaceC0810Ms.mo1055a0(z01)) {
            return true;
        }
        if (interfaceC0810Ms.mo1090m0(z01)) {
            return false;
        }
        if (c1622Zm.f15115c) {
            interfaceC0810Ms.mo1022I(z01);
        }
        return interfaceC0810Ms.mo1075h0(interfaceC0810Ms.mo1047W(z01), interfaceC8153Qd1);
    }
}
