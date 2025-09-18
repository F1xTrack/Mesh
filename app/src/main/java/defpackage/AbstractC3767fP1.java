package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function2;

/* renamed from: fP1 */
/* loaded from: classes.dex */
public abstract class AbstractC3767fP1 {
    public static C5663lH a(InterfaceC0952Lz interfaceC0952Lz, Function2 function2) {
        JN jn = JN.a;
        EnumC1186Oz enumC1186Oz = EnumC1186Oz.a;
        InterfaceC0173Bz interfaceC0173BzA = AbstractC8183yU1.a(interfaceC0952Lz.b(), jn, true);
        C7759wG c7759wG = GK.b;
        if (interfaceC0173BzA != c7759wG && interfaceC0173BzA.g(C0240Cv0.c) == null) {
            interfaceC0173BzA = interfaceC0173BzA.f(c7759wG);
        }
        EnumC1186Oz enumC1186Oz2 = EnumC1186Oz.a;
        C5663lH c5663lH = new C5663lH(interfaceC0173BzA, true);
        c5663lH.T(enumC1186Oz, c5663lH, function2);
        return c5663lH;
    }

    public static C3895g41 b(InterfaceC0952Lz interfaceC0952Lz, QF qf, Function2 function2, int i) {
        InterfaceC0173Bz interfaceC0173Bz = qf;
        if ((i & 1) != 0) {
            interfaceC0173Bz = JN.a;
        }
        EnumC1186Oz enumC1186Oz = EnumC1186Oz.a;
        InterfaceC0173Bz interfaceC0173BzA = AbstractC8183yU1.a(interfaceC0952Lz.b(), interfaceC0173Bz, true);
        C7759wG c7759wG = GK.b;
        if (interfaceC0173BzA != c7759wG && interfaceC0173BzA.g(C0240Cv0.c) == null) {
            interfaceC0173BzA = interfaceC0173BzA.f(c7759wG);
        }
        EnumC1186Oz enumC1186Oz2 = EnumC1186Oz.a;
        C3895g41 c3895g41 = new C3895g41(interfaceC0173BzA, true);
        c3895g41.T(enumC1186Oz, c3895g41, function2);
        return c3895g41;
    }

    public static Object c(Function2 function2) throws Throwable {
        JN jn = JN.a;
        Thread threadCurrentThread = Thread.currentThread();
        C0240Cv0 c0240Cv0 = C0240Cv0.c;
        KP kpA = X91.a();
        InterfaceC0173Bz interfaceC0173BzA = AbstractC8183yU1.a(jn, kpA, true);
        C7759wG c7759wG = GK.b;
        if (interfaceC0173BzA != c7759wG && interfaceC0173BzA.g(c0240Cv0) == null) {
            interfaceC0173BzA = interfaceC0173BzA.f(c7759wG);
        }
        C0200Ci c0200Ci = new C0200Ci(interfaceC0173BzA, threadCurrentThread, kpA);
        c0200Ci.T(EnumC1186Oz.a, c0200Ci, function2);
        KP kp = c0200Ci.e;
        if (kp != null) {
            int i = KP.f;
            kp.x(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jA = kp != null ? kp.A() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2548cc0.a;
                if (!(atomicReferenceFieldUpdater.get(c0200Ci) instanceof InterfaceC2268b80)) {
                    if (kp != null) {
                        int i2 = KP.f;
                        kp.p(false);
                    }
                    Object objA = AbstractC4295iA1.a(atomicReferenceFieldUpdater.get(c0200Ci));
                    C6165nv c6165nv = objA instanceof C6165nv ? (C6165nv) objA : null;
                    if (c6165nv == null) {
                        return objA;
                    }
                    throw c6165nv.a;
                }
                LockSupport.parkNanos(c0200Ci, jA);
            } catch (Throwable th) {
                if (kp != null) {
                    int i3 = KP.f;
                    kp.p(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0200Ci.n(interruptedException);
        throw interruptedException;
    }

    public static RectF d(float[] fArr) {
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

    public static final Object e(InterfaceC0173Bz interfaceC0173Bz, Function2 function2, InterfaceC1729Vy interfaceC1729Vy) {
        Object objA;
        InterfaceC0173Bz context = interfaceC1729Vy.getContext();
        InterfaceC0173Bz interfaceC0173BzF = !((Boolean) interfaceC0173Bz.j(Boolean.FALSE, new C0251Cz(0))).booleanValue() ? context.f(interfaceC0173Bz) : AbstractC8183yU1.a(context, interfaceC0173Bz, false);
        M22.b(interfaceC0173BzF);
        if (interfaceC0173BzF == context) {
            JV0 jv0 = new JV0(interfaceC1729Vy, interfaceC0173BzF);
            objA = XZ1.g(jv0, jv0, function2);
        } else {
            C0240Cv0 c0240Cv0 = C0240Cv0.c;
            if (O90.a(interfaceC0173BzF.g(c0240Cv0), context.g(c0240Cv0))) {
                C1206Pf1 c1206Pf1 = new C1206Pf1(interfaceC1729Vy, interfaceC0173BzF);
                InterfaceC0173Bz interfaceC0173Bz2 = c1206Pf1.c;
                Object objD = IJ1.d(interfaceC0173Bz2, null);
                try {
                    Object objG = XZ1.g(c1206Pf1, c1206Pf1, function2);
                    IJ1.c(interfaceC0173Bz2, objD);
                    objA = objG;
                } catch (Throwable th) {
                    IJ1.c(interfaceC0173Bz2, objD);
                    throw th;
                }
            } else {
                C8151yK c8151yK = new C8151yK(interfaceC1729Vy, interfaceC0173BzF);
                try {
                    EU0.c(AbstractC6383p22.b(AbstractC6383p22.a(c8151yK, c8151yK, function2)), C1518Tf1.a);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C8151yK.e;
                        int i = atomicIntegerFieldUpdater.get(c8151yK);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objA = AbstractC4295iA1.a(C2548cc0.a.get(c8151yK));
                            if (objA instanceof C6165nv) {
                                throw ((C6165nv) objA).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c8151yK, 0, 1)) {
                            objA = EnumC1030Mz.a;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c8151yK.resumeWith(RQ1.b(th2));
                    throw th2;
                }
            }
        }
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        return objA;
    }
}
