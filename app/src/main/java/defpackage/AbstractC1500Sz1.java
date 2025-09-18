package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: Sz1 */
/* loaded from: classes.dex */
public abstract class AbstractC1500Sz1 {
    public static void a(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, PZ pz, Executor executor) {
        pz.getClass();
        interfaceFutureC0750Jj0.d(new XZ(interfaceFutureC0750Jj0, 0, pz), executor);
    }

    public static C8227yj0 b(List list) {
        return new C8227yj0(new ArrayList(list), true, QR1.a());
    }

    public static final void c(double[] dArr, double d, double d2, double d3) {
        dArr[12] = d;
        dArr[13] = d2;
        dArr[14] = d3;
    }

    public static final double d(double[] dArr) {
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

    public static Object e(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        AbstractC3377dM1.i(interfaceFutureC0750Jj0.isDone(), "Future was expected to be done, " + interfaceFutureC0750Jj0);
        return f(interfaceFutureC0750Jj0);
    }

    public static Object f(Future future) {
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

    public static F70 g(Object obj) {
        return obj == null ? F70.c : new F70(0, obj);
    }

    public static final double[] h(double[] dArr) {
        double d = d(dArr);
        if (i(d)) {
            return dArr;
        }
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double d5 = dArr[3];
        double d6 = dArr[4];
        double d7 = dArr[5];
        double d8 = dArr[6];
        double d9 = dArr[7];
        double d10 = dArr[8];
        double d11 = dArr[9];
        double d12 = dArr[10];
        double d13 = dArr[11];
        double d14 = dArr[12];
        double d15 = dArr[13];
        double d16 = dArr[14];
        double d17 = dArr[15];
        double d18 = d8 * d13;
        double d19 = d9 * d12;
        double d20 = d9 * d11;
        double d21 = d7 * d13;
        double d22 = d8 * d11;
        double d23 = d7 * d12;
        double d24 = ((d23 * d17) + ((((d20 * d16) + ((d18 * d15) - (d19 * d15))) - (d21 * d16)) - (d22 * d17))) / d;
        double d25 = d5 * d12;
        double d26 = d4 * d13;
        double d27 = d5 * d11;
        double d28 = d3 * d13;
        double d29 = d4 * d11;
        double d30 = (d29 * d17) + (d28 * d16) + (((d25 * d15) - (d26 * d15)) - (d27 * d16));
        double d31 = d3 * d12;
        double d32 = d4 * d9;
        double d33 = d5 * d8;
        double d34 = d5 * d7;
        double d35 = d3 * d9;
        double d36 = d4 * d7;
        double d37 = d3 * d8;
        double d38 = ((d37 * d17) + ((((d34 * d16) + ((d32 * d15) - (d33 * d15))) - (d35 * d16)) - (d36 * d17))) / d;
        double d39 = (((d36 * d13) + ((d35 * d12) + (((d33 * d11) - (d32 * d11)) - (d34 * d12)))) - (d37 * d13)) / d;
        double d40 = (d19 * d14) - (d18 * d14);
        double d41 = d9 * d10;
        double d42 = d6 * d13;
        double d43 = (d42 * d16) + (d40 - (d41 * d16));
        double d44 = d8 * d10;
        double d45 = (d44 * d17) + d43;
        double d46 = d6 * d12;
        double d47 = (d26 * d14) - (d25 * d14);
        double d48 = d5 * d10;
        double d49 = (d48 * d16) + d47;
        double d50 = d2 * d13;
        double d51 = d4 * d10;
        double d52 = d2 * d12;
        double d53 = ((d52 * d17) + ((d49 - (d50 * d16)) - (d51 * d17))) / d;
        double d54 = d5 * d6;
        double d55 = d9 * d2;
        double d56 = d4 * d6;
        double d57 = d8 * d2;
        double d58 = (((d56 * d17) + ((d55 * d16) + (((d33 * d14) - (d32 * d14)) - (d54 * d16)))) - (d57 * d17)) / d;
        double d59 = ((d57 * d13) + ((((d54 * d12) + ((d32 * d10) - (d33 * d10))) - (d55 * d12)) - (d56 * d13))) / d;
        double d60 = ((d41 * d15) + ((d21 * d14) - (d20 * d14))) - (d42 * d15);
        double d61 = d7 * d10;
        double d62 = d6 * d11;
        double d63 = ((d62 * d17) + (d60 - (d61 * d17))) / d;
        double d64 = d3 * d10;
        double d65 = (d64 * d17) + (d50 * d15) + (((d27 * d14) - (d28 * d14)) - (d48 * d15));
        double d66 = d2 * d11;
        double d67 = d3 * d6;
        double d68 = d2 * d7;
        return new double[]{d24, (d30 - (d31 * d17)) / d, d38, d39, (d45 - (d46 * d17)) / d, d53, d58, d59, d63, (d65 - (d66 * d17)) / d, ((d17 * d68) + ((((d54 * d15) + ((d35 * d14) - (d34 * d14))) - (d55 * d15)) - (d67 * d17))) / d, (((d67 * d13) + ((d55 * d11) + (((d34 * d10) - (d35 * d10)) - (d54 * d11)))) - (d13 * d68)) / d, (((d61 * d16) + ((d46 * d15) + (((d22 * d14) - (d23 * d14)) - (d44 * d15)))) - (d62 * d16)) / d, ((d66 * d16) + ((((d51 * d15) + ((d31 * d14) - (d29 * d14))) - (d52 * d15)) - (d64 * d16))) / d, (((d67 * d16) + ((d15 * d57) + (((d36 * d14) - (d14 * d37)) - (d56 * d15)))) - (d16 * d68)) / d, ((d68 * d12) + ((((d56 * d11) + ((d37 * d10) - (d36 * d10))) - (d57 * d11)) - (d67 * d12))) / d};
    }

    public static boolean i(double d) {
        return !Double.isNaN(d) && Math.abs(d) < 1.0E-5d;
    }

    public static final void j(double[] dArr, double[] dArr2, double[] dArr3) {
        O90.f(dArr, "out");
        O90.f(dArr2, "a");
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

    public static final void k(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        dArr3[0] = (dArr2[12] * d4) + (dArr2[8] * d3) + (dArr2[4] * d2) + (dArr2[0] * d);
        dArr3[1] = (dArr2[13] * d4) + (dArr2[9] * d3) + (dArr2[5] * d2) + (dArr2[1] * d);
        dArr3[2] = (dArr2[14] * d4) + (dArr2[10] * d3) + (dArr2[6] * d2) + (dArr2[2] * d);
        dArr3[3] = (d4 * dArr2[15]) + (d3 * dArr2[11]) + (d2 * dArr2[7]) + (d * dArr2[3]);
    }

    public static InterfaceFutureC0750Jj0 l(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        interfaceFutureC0750Jj0.getClass();
        return interfaceFutureC0750Jj0.isDone() ? interfaceFutureC0750Jj0 : AbstractC8171yQ1.b(new SZ(interfaceFutureC0750Jj0, 1));
    }

    public static void m(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, C0365El c0365El) {
        n(true, interfaceFutureC0750Jj0, c0365El, QR1.a());
    }

    public static void n(boolean z, InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, C0365El c0365El, TJ tj) {
        interfaceFutureC0750Jj0.getClass();
        c0365El.getClass();
        tj.getClass();
        a(interfaceFutureC0750Jj0, new C3866fw1(17, c0365El), tj);
        if (z) {
            c0365El.a(new GR0(24, interfaceFutureC0750Jj0), QR1.a());
        }
    }

    public static final void o(double[] dArr) {
        O90.f(dArr, "matrix");
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

    public static final double p(double d) {
        return Math.round(d * 1000.0d) * 0.001d;
    }

    public static C8227yj0 q(ArrayList arrayList) {
        return new C8227yj0(new ArrayList(arrayList), false, QR1.a());
    }

    public static RunnableC3467dr r(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, InterfaceC6021n9 interfaceC6021n9, Executor executor) {
        RunnableC3467dr runnableC3467dr = new RunnableC3467dr(interfaceC6021n9, interfaceFutureC0750Jj0);
        interfaceFutureC0750Jj0.d(runnableC3467dr, executor);
        return runnableC3467dr;
    }

    public static final double[] s(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    public static final double[] t(double[] dArr, double[] dArr2, double d) {
        O90.f(dArr, "a");
        O90.f(dArr2, "b");
        return new double[]{(dArr2[0] * d) + (dArr[0] * 1.0d), (dArr2[1] * d) + (dArr[1] * 1.0d), (d * dArr2[2]) + (1.0d * dArr[2])};
    }

    public static final double[] u(double[] dArr, double[] dArr2) {
        O90.f(dArr, "a");
        double d = dArr[1];
        double d2 = dArr2[2];
        double d3 = dArr[2];
        double d4 = dArr2[1];
        double d5 = dArr2[0];
        double d6 = dArr[0];
        return new double[]{(d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5)};
    }

    public static final double v(double[] dArr, double[] dArr2) {
        O90.f(dArr, "a");
        O90.f(dArr2, "b");
        return (dArr[2] * dArr2[2]) + (dArr[1] * dArr2[1]) + (dArr[0] * dArr2[0]);
    }

    public static final double w(double[] dArr) {
        O90.f(dArr, "a");
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = (d2 * d2) + (d * d);
        double d4 = dArr[2];
        return Math.sqrt((d4 * d4) + d3);
    }

    public static final double[] x(double d, double[] dArr) {
        O90.f(dArr, "vector");
        double d2 = 1;
        if (i(d)) {
            d = w(dArr);
        }
        double d3 = d2 / d;
        return new double[]{dArr[0] * d3, dArr[1] * d3, dArr[2] * d3};
    }
}
