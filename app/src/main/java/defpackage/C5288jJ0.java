package defpackage;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Random;

/* renamed from: jJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5288jJ0 {
    public final C0943Lw a;
    public final double b;
    public final double c;
    public final C4321iJ0 d;
    public final C4321iJ0 e;

    public C5288jJ0(Context context, C8425zm c8425zm) {
        C0396Ev0 c0396Ev0 = new C0396Ev0(9);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        C0943Lw c0943LwE = C0943Lw.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(ConfigValue.DOUBLE_DEFAULT_VALUE <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (ConfigValue.DOUBLE_DEFAULT_VALUE <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.a = c0943LwE;
        this.d = new C4321iJ0(c8425zm, c0396Ev0, c0943LwE, "Trace");
        this.e = new C4321iJ0(c8425zm, c0396Ev0, c0943LwE, "Network");
        AbstractC3880g02.c(context);
    }

    public static boolean a(InterfaceC7549v90 interfaceC7549v90) {
        return interfaceC7549v90.size() > 0 && ((IA0) interfaceC7549v90.get(0)).x() > 0 && ((IA0) interfaceC7549v90.get(0)).w() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r7 = this;
            Lw r0 = r7.a
            r0.getClass()
            java.lang.Class<Uw> r1 = defpackage.C1645Uw.class
            monitor-enter(r1)
            Uw r2 = defpackage.C1645Uw.a     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L17
            Uw r2 = new Uw     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            defpackage.C1645Uw.a = r2     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto La3
        L17:
            Uw r2 = defpackage.C1645Uw.a     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            zy0 r1 = r0.k(r2)
            boolean r3 = r1.b()
            if (r3 == 0) goto L38
            java.lang.Object r1 = r1.a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r3 = r1.doubleValue()
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r5
            boolean r1 = defpackage.C0943Lw.v(r3)
            if (r1 == 0) goto L38
            goto L99
        L38:
            com.google.firebase.perf.config.RemoteConfigManager r1 = r0.a
            java.lang.String r3 = "fpr_vc_fragment_sampling_rate"
            zy0 r1 = r1.getDouble(r3)
            boolean r3 = r1.b()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            boolean r3 = defpackage.C0943Lw.v(r3)
            if (r3 == 0) goto L72
            gJ r0 = r0.c
            java.lang.String r2 = "com.google.firebase.perf.FragmentSamplingRate"
            java.lang.Object r3 = r1.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r0.e(r2, r3)
            java.lang.Object r0 = r1.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L72:
            zy0 r0 = r0.b(r2)
            boolean r1 = r0.b()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            boolean r1 = defpackage.C0943Lw.v(r1)
            if (r1 == 0) goto L97
            java.lang.Object r0 = r0.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L97:
            r3 = 0
        L99:
            double r0 = r7.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto La1
            r0 = 1
            goto La2
        La1:
            r0 = 0
        La2:
            return r0
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5288jJ0.b():boolean");
    }

    public final boolean c() {
        C2035Zw c2035Zw;
        double dDoubleValue;
        C0943Lw c0943Lw = this.a;
        c0943Lw.getClass();
        synchronized (C2035Zw.class) {
            try {
                if (C2035Zw.a == null) {
                    C2035Zw.a = new C2035Zw();
                }
                c2035Zw = C2035Zw.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = c0943Lw.a;
        c2035Zw.getClass();
        C8462zy0 c8462zy0 = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (c8462zy0.b() && C0943Lw.v(((Double) c8462zy0.a()).doubleValue())) {
            c0943Lw.c.e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) c8462zy0.a()).doubleValue());
            dDoubleValue = ((Double) c8462zy0.a()).doubleValue();
        } else {
            C8462zy0 c8462zy0B = c0943Lw.b(c2035Zw);
            dDoubleValue = (c8462zy0B.b() && C0943Lw.v(((Double) c8462zy0B.a()).doubleValue())) ? ((Double) c8462zy0B.a()).doubleValue() : c0943Lw.a.isLastFetchFailed() ? 0.001d : 1.0d;
        }
        return this.b < dDoubleValue;
    }
}
