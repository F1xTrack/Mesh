package p000;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Random;

/* renamed from: jJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9865jJ0 {

    /* renamed from: a */
    public final C0751Lw f35056a;

    /* renamed from: b */
    public final double f35057b;

    /* renamed from: c */
    public final double f35058c;

    /* renamed from: d */
    public final C9737iJ0 f35059d;

    /* renamed from: e */
    public final C9737iJ0 f35060e;

    public C9865jJ0(Context context, C7285zm c7285zm) {
        C7564Ev0 c7564Ev0 = new C7564Ev0(9);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        C0751Lw c0751LwM5135e = C0751Lw.m5135e();
        this.f35059d = null;
        this.f35060e = null;
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
        this.f35057b = dNextDouble;
        this.f35058c = dNextDouble2;
        this.f35056a = c0751LwM5135e;
        this.f35059d = new C9737iJ0(c7285zm, c7564Ev0, c0751LwM5135e, "Trace");
        this.f35060e = new C9737iJ0(c7285zm, c7564Ev0, c0751LwM5135e, "Network");
        AbstractC9441g02.m18379c(context);
    }

    /* renamed from: a */
    public static boolean m22012a(InterfaceC11381v90 interfaceC11381v90) {
        return interfaceC11381v90.size() > 0 && ((IA0) interfaceC11381v90.get(0)).m3776x() > 0 && ((IA0) interfaceC11381v90.get(0)).m3775w() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22013b() {
        /*
            r7 = this;
            Lw r0 = r7.f35056a
            r0.getClass()
            java.lang.Class<Uw> r1 = p000.C1317Uw.class
            monitor-enter(r1)
            Uw r2 = p000.C1317Uw.f12205a     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L17
            Uw r2 = new Uw     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            p000.C1317Uw.f12205a = r2     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto La3
        L17:
            Uw r2 = p000.C1317Uw.f12205a     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            zy0 r1 = r0.m5149k(r2)
            boolean r3 = r1.m26594b()
            if (r3 == 0) goto L38
            java.lang.Object r1 = r1.m26593a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r3 = r1.doubleValue()
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r5
            boolean r1 = p000.C0751Lw.m5139v(r3)
            if (r1 == 0) goto L38
            goto L99
        L38:
            com.google.firebase.perf.config.RemoteConfigManager r1 = r0.f6932a
            java.lang.String r3 = "fpr_vc_fragment_sampling_rate"
            zy0 r1 = r1.getDouble(r3)
            boolean r3 = r1.m26594b()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.m26593a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            boolean r3 = p000.C0751Lw.m5139v(r3)
            if (r3 == 0) goto L72
            gJ r0 = r0.f6934c
            java.lang.String r2 = "com.google.firebase.perf.FragmentSamplingRate"
            java.lang.Object r3 = r1.m26593a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r0.m18422e(r2, r3)
            java.lang.Object r0 = r1.m26593a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L72:
            zy0 r0 = r0.m5141b(r2)
            boolean r1 = r0.m26594b()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.m26593a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            boolean r1 = p000.C0751Lw.m5139v(r1)
            if (r1 == 0) goto L97
            java.lang.Object r0 = r0.m26593a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L97:
            r3 = 0
        L99:
            double r0 = r7.f35058c
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C9865jJ0.m22013b():boolean");
    }

    /* renamed from: c */
    public final boolean m22014c() {
        C1632Zw c1632Zw;
        double dDoubleValue;
        C0751Lw c0751Lw = this.f35056a;
        c0751Lw.getClass();
        synchronized (C1632Zw.class) {
            try {
                if (C1632Zw.f15232a == null) {
                    C1632Zw.f15232a = new C1632Zw();
                }
                c1632Zw = C1632Zw.f15232a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = c0751Lw.f6932a;
        c1632Zw.getClass();
        C11991zy0 c11991zy0 = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (c11991zy0.m26594b() && C0751Lw.m5139v(((Double) c11991zy0.m26593a()).doubleValue())) {
            c0751Lw.f6934c.m18422e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) c11991zy0.m26593a()).doubleValue());
            dDoubleValue = ((Double) c11991zy0.m26593a()).doubleValue();
        } else {
            C11991zy0 c11991zy0M5141b = c0751Lw.m5141b(c1632Zw);
            dDoubleValue = (c11991zy0M5141b.m26594b() && C0751Lw.m5139v(((Double) c11991zy0M5141b.m26593a()).doubleValue())) ? ((Double) c11991zy0M5141b.m26593a()).doubleValue() : c0751Lw.f6932a.isLastFetchFailed() ? 0.001d : 1.0d;
        }
        return this.f35057b < dDoubleValue;
    }
}
