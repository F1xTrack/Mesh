package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: Sz1 */
/* loaded from: classes.dex */
public abstract class AbstractC8301Sz1 {
    /* renamed from: a */
    public static void m7478a(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, InterfaceC0980PZ interfaceC0980PZ, Executor executor) {
        interfaceC0980PZ.getClass();
        interfaceFutureC7800Jj0.mo2494d(new RunnableC1483XZ(interfaceFutureC7800Jj0, 0, interfaceC0980PZ), executor);
    }

    /* renamed from: b */
    public static C11834yj0 m7479b(List list) {
        return new C11834yj0(new ArrayList(list), true, QR1.m6703a());
    }

    /* renamed from: c */
    public static final void m7480c(double[] dArr, double d, double d2, double d3) {
        dArr[12] = d;
        dArr[13] = d2;
        dArr[14] = d3;
    }

    /* renamed from: d */
    public static final double m7481d(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = (d20 * d11 * d13) + ((((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13));
        double d22 = d3 * d6;
        double d23 = (d22 * d12 * d13) + d21;
        double d24 = d2 * d7;
        double d25 = d4 * d5;
        double d26 = d8 * d;
        double d27 = d3 * d5;
        double d28 = ((((d25 * d11) * d14) + (((d18 * d9) * d14) + ((d23 - ((d24 * d12) * d13)) - ((d17 * d9) * d14)))) - ((d26 * d11) * d14)) - ((d27 * d12) * d14);
        double d29 = d7 * d;
        double d30 = d26 * d10 * d15;
        double d31 = d2 * d5;
        double d32 = d * d6;
        double d33 = d24 * d9 * d16;
        double d34 = d27 * d10 * d16;
        return (d32 * d11 * d16) + (((d34 + (d33 + (((((d31 * d12) * d15) + (d30 + (((((d19 * d9) * d15) + (((d29 * d12) * d14) + d28)) - ((d20 * d9) * d15)) - ((d25 * d10) * d15)))) - ((d12 * d32) * d15)) - ((d22 * d9) * d16)))) - ((d29 * d10) * d16)) - ((d31 * d11) * d16));
    }

    /* renamed from: e */
    public static Object m7482e(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        AbstractC9104dM1.m17550i(interfaceFutureC7800Jj0.isDone(), "Future was expected to be done, " + interfaceFutureC7800Jj0);
        return m7483f(interfaceFutureC7800Jj0);
    }

    /* renamed from: f */
    public static Object m7483f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: g */
    public static F70 m7484g(Object obj) {
        return obj == null ? F70.f3069c : new F70(0, obj);
    }

    /* renamed from: h */
    public static final double[] m7485h(double[] dArr) {
        double dM7481d = m7481d(dArr);
        if (m7486i(dM7481d)) {
            return dArr;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d7 * d12;
        double d18 = d8 * d11;
        double d19 = d8 * d10;
        double d20 = d6 * d12;
        double d21 = d7 * d10;
        double d22 = d6 * d11;
        double d23 = ((d22 * d16) + ((((d19 * d15) + ((d17 * d14) - (d18 * d14))) - (d20 * d15)) - (d21 * d16))) / dM7481d;
        double d24 = d4 * d11;
        double d25 = d3 * d12;
        double d26 = d4 * d10;
        double d27 = d2 * d12;
        double d28 = d3 * d10;
        double d29 = (d28 * d16) + (d27 * d15) + (((d24 * d14) - (d25 * d14)) - (d26 * d15));
        double d30 = d2 * d11;
        double d31 = d3 * d8;
        double d32 = d4 * d7;
        double d33 = d4 * d6;
        double d34 = d2 * d8;
        double d35 = d3 * d6;
        double d36 = d2 * d7;
        double d37 = ((d36 * d16) + ((((d33 * d15) + ((d31 * d14) - (d32 * d14))) - (d34 * d15)) - (d35 * d16))) / dM7481d;
        double d38 = (((d35 * d12) + ((d34 * d11) + (((d32 * d10) - (d31 * d10)) - (d33 * d11)))) - (d36 * d12)) / dM7481d;
        double d39 = (d18 * d13) - (d17 * d13);
        double d40 = d8 * d9;
        double d41 = d5 * d12;
        double d42 = (d41 * d15) + (d39 - (d40 * d15));
        double d43 = d7 * d9;
        double d44 = (d43 * d16) + d42;
        double d45 = d5 * d11;
        double d46 = (d25 * d13) - (d24 * d13);
        double d47 = d4 * d9;
        double d48 = (d47 * d15) + d46;
        double d49 = d * d12;
        double d50 = d3 * d9;
        double d51 = d * d11;
        double d52 = ((d51 * d16) + ((d48 - (d49 * d15)) - (d50 * d16))) / dM7481d;
        double d53 = d4 * d5;
        double d54 = d8 * d;
        double d55 = d3 * d5;
        double d56 = d7 * d;
        double d57 = (((d55 * d16) + ((d54 * d15) + (((d32 * d13) - (d31 * d13)) - (d53 * d15)))) - (d56 * d16)) / dM7481d;
        double d58 = ((d56 * d12) + ((((d53 * d11) + ((d31 * d9) - (d32 * d9))) - (d54 * d11)) - (d55 * d12))) / dM7481d;
        double d59 = ((d40 * d14) + ((d20 * d13) - (d19 * d13))) - (d41 * d14);
        double d60 = d6 * d9;
        double d61 = d5 * d10;
        double d62 = ((d61 * d16) + (d59 - (d60 * d16))) / dM7481d;
        double d63 = d2 * d9;
        double d64 = (d63 * d16) + (d49 * d14) + (((d26 * d13) - (d27 * d13)) - (d47 * d14));
        double d65 = d * d10;
        double d66 = d2 * d5;
        double d67 = d * d6;
        return new double[]{d23, (d29 - (d30 * d16)) / dM7481d, d37, d38, (d44 - (d45 * d16)) / dM7481d, d52, d57, d58, d62, (d64 - (d65 * d16)) / dM7481d, ((d16 * d67) + ((((d53 * d14) + ((d34 * d13) - (d33 * d13))) - (d54 * d14)) - (d66 * d16))) / dM7481d, (((d66 * d12) + ((d54 * d10) + (((d33 * d9) - (d34 * d9)) - (d53 * d10)))) - (d12 * d67)) / dM7481d, (((d60 * d15) + ((d45 * d14) + (((d21 * d13) - (d22 * d13)) - (d43 * d14)))) - (d61 * d15)) / dM7481d, ((d65 * d15) + ((((d50 * d14) + ((d30 * d13) - (d28 * d13))) - (d51 * d14)) - (d63 * d15))) / dM7481d, (((d66 * d15) + ((d14 * d56) + (((d35 * d13) - (d13 * d36)) - (d55 * d14)))) - (d15 * d67)) / dM7481d, ((d67 * d11) + ((((d55 * d10) + ((d36 * d9) - (d35 * d9))) - (d56 * d10)) - (d66 * d11))) / dM7481d};
    }

    /* renamed from: i */
    public static boolean m7486i(double d) {
        return !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    /* renamed from: j */
    public static final void m7487j(double[] dArr, double[] dArr2, double[] dArr3) {
        O90.m5968f(dArr, "out");
        O90.m5968f(dArr2, "a");
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        double d5 = dArr2[4];
        double d6 = dArr2[5];
        double d7 = dArr2[6];
        double d8 = dArr2[7];
        double d9 = dArr2[8];
        double d10 = dArr2[9];
        double d11 = dArr2[10];
        double d12 = dArr2[11];
        double d13 = dArr2[12];
        double d14 = dArr2[13];
        double d15 = dArr2[14];
        double d16 = dArr2[15];
        double d17 = dArr3[0];
        double d18 = dArr3[1];
        double d19 = dArr3[2];
        double d20 = dArr3[3];
        dArr[0] = (d20 * d13) + (d19 * d9) + (d18 * d5) + (d17 * d);
        dArr[1] = (d20 * d14) + (d19 * d10) + (d18 * d6) + (d17 * d2);
        dArr[2] = (d20 * d15) + (d19 * d11) + (d18 * d7) + (d17 * d3);
        double d21 = d19 * d12;
        double d22 = d20 * d16;
        dArr[3] = d22 + d21 + (d18 * d8) + (d17 * d4);
        double d23 = dArr3[4];
        double d24 = dArr3[5];
        double d25 = dArr3[6];
        double d26 = dArr3[7];
        dArr[4] = (d26 * d13) + (d25 * d9) + (d24 * d5) + (d23 * d);
        dArr[5] = (d26 * d14) + (d25 * d10) + (d24 * d6) + (d23 * d2);
        dArr[6] = (d26 * d15) + (d25 * d11) + (d24 * d7) + (d23 * d3);
        double d27 = d25 * d12;
        double d28 = d26 * d16;
        dArr[7] = d28 + d27 + (d24 * d8) + (d23 * d4);
        double d29 = dArr3[8];
        double d30 = dArr3[9];
        double d31 = dArr3[10];
        double d32 = dArr3[11];
        dArr[8] = (d32 * d13) + (d31 * d9) + (d30 * d5) + (d29 * d);
        dArr[9] = (d32 * d14) + (d31 * d10) + (d30 * d6) + (d29 * d2);
        dArr[10] = (d32 * d15) + (d31 * d11) + (d30 * d7) + (d29 * d3);
        double d33 = d31 * d12;
        double d34 = d32 * d16;
        dArr[11] = d34 + d33 + (d30 * d8) + (d29 * d4);
        double d35 = dArr3[12];
        double d36 = dArr3[13];
        double d37 = dArr3[14];
        double d38 = dArr3[15];
        double d39 = d9 * d37;
        double d40 = d13 * d38;
        dArr[12] = d40 + d39 + (d5 * d36) + (d * d35);
        double d41 = d10 * d37;
        double d42 = d14 * d38;
        dArr[13] = d42 + d41 + (d6 * d36) + (d2 * d35);
        double d43 = d11 * d37;
        double d44 = d15 * d38;
        dArr[14] = d44 + d43 + (d7 * d36) + (d3 * d35);
        double d45 = d37 * d12;
        double d46 = d38 * d16;
        dArr[15] = d46 + d45 + (d36 * d8) + (d35 * d4);
    }

    /* renamed from: k */
    public static final void m7488k(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        dArr3[0] = (dArr2[12] * d4) + (dArr2[8] * d3) + (dArr2[4] * d2) + (dArr2[0] * d);
        dArr3[1] = (dArr2[13] * d4) + (dArr2[9] * d3) + (dArr2[5] * d2) + (dArr2[1] * d);
        dArr3[2] = (dArr2[14] * d4) + (dArr2[10] * d3) + (dArr2[6] * d2) + (dArr2[2] * d);
        dArr3[3] = (d4 * dArr2[15]) + (d3 * dArr2[11]) + (d2 * dArr2[7]) + (d * dArr2[3]);
    }

    /* renamed from: l */
    public static InterfaceFutureC7800Jj0 m7489l(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        interfaceFutureC7800Jj0.getClass();
        return interfaceFutureC7800Jj0.isDone() ? interfaceFutureC7800Jj0 : AbstractC11797yQ1.m26149b(new C1168SZ(interfaceFutureC7800Jj0, 1));
    }

    /* renamed from: m */
    public static void m7490m(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, C0300El c0300El) {
        m7491n(true, interfaceFutureC7800Jj0, c0300El, QR1.m6703a());
    }

    /* renamed from: n */
    public static void m7491n(boolean z, InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, C0300El c0300El, ExecutorC1215TJ executorC1215TJ) {
        interfaceFutureC7800Jj0.getClass();
        c0300El.getClass();
        executorC1215TJ.getClass();
        m7478a(interfaceFutureC7800Jj0, new C9432fw1(17, c0300El), executorC1215TJ);
        if (z) {
            c0300El.m2374a(new GR0(24, interfaceFutureC7800Jj0), QR1.m6703a());
        }
    }

    /* renamed from: o */
    public static final void m7492o(double[] dArr) {
        O90.m5968f(dArr, "matrix");
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    /* renamed from: p */
    public static final double m7493p(double d) {
        return Math.round(d * 1000.0d) * 0.001d;
    }

    /* renamed from: q */
    public static C11834yj0 m7494q(ArrayList arrayList) {
        return new C11834yj0(new ArrayList(arrayList), false, QR1.m6703a());
    }

    /* renamed from: r */
    public static RunnableC3953dr m7495r(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, InterfaceC6471n9 interfaceC6471n9, Executor executor) {
        RunnableC3953dr runnableC3953dr = new RunnableC3953dr(interfaceC6471n9, interfaceFutureC7800Jj0);
        interfaceFutureC7800Jj0.mo2494d(runnableC3953dr, executor);
        return runnableC3953dr;
    }

    /* renamed from: s */
    public static final double[] m7496s(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    /* renamed from: t */
    public static final double[] m7497t(double[] dArr, double[] dArr2, double d) {
        O90.m5968f(dArr, "a");
        O90.m5968f(dArr2, "b");
        return new double[]{(dArr2[0] * d) + (dArr[0] * 1.0d), (dArr2[1] * d) + (dArr[1] * 1.0d), (d * dArr2[2]) + (1.0d * dArr[2])};
    }

    /* renamed from: u */
    public static final double[] m7498u(double[] dArr, double[] dArr2) {
        O90.m5968f(dArr, "a");
        double d = dArr[1];
        double d2 = dArr2[2];
        double d3 = dArr[2];
        double d4 = dArr2[1];
        double d5 = dArr2[0];
        double d6 = dArr[0];
        return new double[]{(d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5)};
    }

    /* renamed from: v */
    public static final double m7499v(double[] dArr, double[] dArr2) {
        O90.m5968f(dArr, "a");
        O90.m5968f(dArr2, "b");
        return (dArr[2] * dArr2[2]) + (dArr[1] * dArr2[1]) + (dArr[0] * dArr2[0]);
    }

    /* renamed from: w */
    public static final double m7500w(double[] dArr) {
        O90.m5968f(dArr, "a");
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = (d2 * d2) + (d * d);
        double d4 = dArr[2];
        return Math.sqrt((d4 * d4) + d3);
    }

    /* renamed from: x */
    public static final double[] m7501x(double d, double[] dArr) {
        O90.m5968f(dArr, "vector");
        double d2 = 1;
        if (m7486i(d)) {
            d = m7500w(dArr);
        }
        double d3 = d2 / d;
        return new double[]{dArr[0] * d3, dArr[1] * d3, dArr[2] * d3};
    }
}
