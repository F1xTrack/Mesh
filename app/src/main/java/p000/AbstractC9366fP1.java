package p000;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function2;

/* renamed from: fP1 */
/* loaded from: classes.dex */
public abstract class AbstractC9366fP1 {
    /* renamed from: a */
    public static C6353lH m18229a(InterfaceC0754Lz interfaceC0754Lz, Function2 function2) {
        C0591JN c0591jn = C0591JN.f5499a;
        EnumC0943Oz enumC0943Oz = EnumC0943Oz.f8765a;
        InterfaceC0125Bz interfaceC0125BzM26153a = AbstractC11805yU1.m26153a(interfaceC0754Lz.mo2469b(), c0591jn, true);
        C7064wG c7064wG = C0399GK.f3695b;
        if (interfaceC0125BzM26153a != c7064wG && interfaceC0125BzM26153a.mo937g(C7460Cv0.f1753c) == null) {
            interfaceC0125BzM26153a = interfaceC0125BzM26153a.mo936f(c7064wG);
        }
        EnumC0943Oz enumC0943Oz2 = EnumC0943Oz.f8765a;
        C6353lH c6353lH = new C6353lH(interfaceC0125BzM26153a, true);
        c6353lH.m2468T(enumC0943Oz, c6353lH, function2);
        return c6353lH;
    }

    /* renamed from: b */
    public static C9452g41 m18230b(InterfaceC0754Lz interfaceC0754Lz, ExecutorC1023QF executorC1023QF, Function2 function2, int i) {
        InterfaceC0125Bz interfaceC0125Bz = executorC1023QF;
        if ((i & 1) != 0) {
            interfaceC0125Bz = C0591JN.f5499a;
        }
        EnumC0943Oz enumC0943Oz = EnumC0943Oz.f8765a;
        InterfaceC0125Bz interfaceC0125BzM26153a = AbstractC11805yU1.m26153a(interfaceC0754Lz.mo2469b(), interfaceC0125Bz, true);
        C7064wG c7064wG = C0399GK.f3695b;
        if (interfaceC0125BzM26153a != c7064wG && interfaceC0125BzM26153a.mo937g(C7460Cv0.f1753c) == null) {
            interfaceC0125BzM26153a = interfaceC0125BzM26153a.mo936f(c7064wG);
        }
        EnumC0943Oz enumC0943Oz2 = EnumC0943Oz.f8765a;
        C9452g41 c9452g41 = new C9452g41(interfaceC0125BzM26153a, true);
        c9452g41.m2468T(enumC0943Oz, c9452g41, function2);
        return c9452g41;
    }

    /* renamed from: c */
    public static Object m18231c(Function2 function2) throws Throwable {
        C0591JN c0591jn = C0591JN.f5499a;
        Thread threadCurrentThread = Thread.currentThread();
        C7460Cv0 c7460Cv0 = C7460Cv0.f1753c;
        AbstractC0656KP abstractC0656KPM8938a = X91.m8938a();
        InterfaceC0125Bz interfaceC0125BzM26153a = AbstractC11805yU1.m26153a(c0591jn, abstractC0656KPM8938a, true);
        C7064wG c7064wG = C0399GK.f3695b;
        if (interfaceC0125BzM26153a != c7064wG && interfaceC0125BzM26153a.mo937g(c7460Cv0) == null) {
            interfaceC0125BzM26153a = interfaceC0125BzM26153a.mo936f(c7064wG);
        }
        C0171Ci c0171Ci = new C0171Ci(interfaceC0125BzM26153a, threadCurrentThread, abstractC0656KPM8938a);
        c0171Ci.m2468T(EnumC0943Oz.f8765a, c0171Ci, function2);
        AbstractC0656KP abstractC0656KP = c0171Ci.f1585e;
        if (abstractC0656KP != null) {
            int i = AbstractC0656KP.f6062f;
            abstractC0656KP.m4629x(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo4306A = abstractC0656KP != null ? abstractC0656KP.mo4306A() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9002cc0.f17647a;
                if (!(atomicReferenceFieldUpdater.get(c0171Ci) instanceof InterfaceC8814b80)) {
                    if (abstractC0656KP != null) {
                        int i2 = AbstractC0656KP.f6062f;
                        abstractC0656KP.m4628p(false);
                    }
                    Object objM18978a = AbstractC9720iA1.m18978a(atomicReferenceFieldUpdater.get(c0171Ci));
                    C6519nv c6519nv = objM18978a instanceof C6519nv ? (C6519nv) objM18978a : null;
                    if (c6519nv == null) {
                        return objM18978a;
                    }
                    throw c6519nv.f38606a;
                }
                LockSupport.parkNanos(c0171Ci, jMo4306A);
            } catch (Throwable th) {
                if (abstractC0656KP != null) {
                    int i3 = AbstractC0656KP.f6062f;
                    abstractC0656KP.m4628p(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0171Ci.m10812n(interruptedException);
        throw interruptedException;
    }

    /* renamed from: d */
    public static RectF m18232d(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float fRound = Math.round(fArr[i - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i] * 10.0f) / 10.0f;
            float f = rectF.left;
            if (fRound < f) {
                f = fRound;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (fRound2 < f2) {
                f2 = fRound2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (fRound <= f3) {
                fRound = f3;
            }
            rectF.right = fRound;
            float f4 = rectF.bottom;
            if (fRound2 <= f4) {
                fRound2 = f4;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }

    /* renamed from: e */
    public static final Object m18233e(InterfaceC0125Bz interfaceC0125Bz, Function2 function2, InterfaceC1382Vy interfaceC1382Vy) {
        Object objM18978a;
        InterfaceC0125Bz context = interfaceC1382Vy.getContext();
        InterfaceC0125Bz interfaceC0125BzMo936f = !((Boolean) interfaceC0125Bz.mo938j(Boolean.FALSE, new C0188Cz(0))).booleanValue() ? context.mo936f(interfaceC0125Bz) : AbstractC11805yU1.m26153a(context, interfaceC0125Bz, false);
        M22.m5248b(interfaceC0125BzMo936f);
        if (interfaceC0125BzMo936f == context) {
            JV0 jv0 = new JV0(interfaceC1382Vy, interfaceC0125BzMo936f);
            objM18978a = XZ1.m9091g(jv0, jv0, function2);
        } else {
            C7460Cv0 c7460Cv0 = C7460Cv0.f1753c;
            if (O90.m5963a(interfaceC0125BzMo936f.mo937g(c7460Cv0), context.mo937g(c7460Cv0))) {
                C8105Pf1 c8105Pf1 = new C8105Pf1(interfaceC1382Vy, interfaceC0125BzMo936f);
                InterfaceC0125Bz interfaceC0125Bz2 = c8105Pf1.f3003c;
                Object objM3817d = IJ1.m3817d(interfaceC0125Bz2, null);
                try {
                    Object objM9091g = XZ1.m9091g(c8105Pf1, c8105Pf1, function2);
                    IJ1.m3816c(interfaceC0125Bz2, objM3817d);
                    objM18978a = objM9091g;
                } catch (Throwable th) {
                    IJ1.m3816c(interfaceC0125Bz2, objM3817d);
                    throw th;
                }
            } else {
                C7194yK c7194yK = new C7194yK(interfaceC1382Vy, interfaceC0125BzMo936f);
                try {
                    EU0.m2316c(AbstractC10599p22.m23595b(AbstractC10599p22.m23594a(c7194yK, c7194yK, function2)), C8313Tf1.f11463a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C7194yK.f46189e;
                        int i = atomicIntegerFieldUpdater.get(c7194yK);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM18978a = AbstractC9720iA1.m18978a(C9002cc0.f17647a.get(c7194yK));
                            if (objM18978a instanceof C6519nv) {
                                throw ((C6519nv) objM18978a).f38606a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c7194yK, 0, 1)) {
                            objM18978a = EnumC0817Mz.f7418a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c7194yK.resumeWith(RQ1.m7015b(th2));
                    throw th2;
                }
            }
        }
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM18978a;
    }
}
