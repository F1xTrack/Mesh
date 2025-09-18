package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Lw */
/* loaded from: classes.dex */
public final class C0943Lw {
    public static final C7533v4 d = C7533v4.d();
    public static volatile C0943Lw e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public H70 b = new H70();
    public final C3938gJ c = C3938gJ.b();

    public static synchronized C0943Lw e() {
        try {
            if (e == null) {
                e = new C0943Lw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean r(long j) {
        return j >= 0;
    }

    public static boolean s(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals("21.0.4")) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(long j) {
        return j >= 0;
    }

    public static boolean v(double d2) {
        return ConfigValue.DOUBLE_DEFAULT_VALUE <= d2 && d2 <= 1.0d;
    }

    public final C8462zy0 a(OT1 ot1) {
        C3938gJ c3938gJ = this.c;
        String strB = ot1.b();
        if (strB == null) {
            c3938gJ.getClass();
            C3938gJ.c.a();
            return new C8462zy0();
        }
        if (c3938gJ.a == null) {
            c3938gJ.c(C3938gJ.a());
            if (c3938gJ.a == null) {
                return new C8462zy0();
            }
        }
        if (!c3938gJ.a.contains(strB)) {
            return new C8462zy0();
        }
        try {
            return new C8462zy0(Boolean.valueOf(c3938gJ.a.getBoolean(strB, false)));
        } catch (ClassCastException e2) {
            C3938gJ.c.b("Key %s from sharedPreferences has type other than long: %s", strB, e2.getMessage());
            return new C8462zy0();
        }
    }

    public final C8462zy0 b(OT1 ot1) {
        C3938gJ c3938gJ = this.c;
        String strB = ot1.b();
        if (strB == null) {
            c3938gJ.getClass();
            C3938gJ.c.a();
            return new C8462zy0();
        }
        if (c3938gJ.a == null) {
            c3938gJ.c(C3938gJ.a());
            if (c3938gJ.a == null) {
                return new C8462zy0();
            }
        }
        if (!c3938gJ.a.contains(strB)) {
            return new C8462zy0();
        }
        try {
            try {
                return new C8462zy0(Double.valueOf(Double.longBitsToDouble(c3938gJ.a.getLong(strB, 0L))));
            } catch (ClassCastException unused) {
                return new C8462zy0(Double.valueOf(Float.valueOf(c3938gJ.a.getFloat(strB, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e2) {
            C3938gJ.c.b("Key %s from sharedPreferences has type other than double: %s", strB, e2.getMessage());
            return new C8462zy0();
        }
    }

    public final C8462zy0 c(OT1 ot1) {
        C3938gJ c3938gJ = this.c;
        String strB = ot1.b();
        if (strB == null) {
            c3938gJ.getClass();
            C3938gJ.c.a();
            return new C8462zy0();
        }
        if (c3938gJ.a == null) {
            c3938gJ.c(C3938gJ.a());
            if (c3938gJ.a == null) {
                return new C8462zy0();
            }
        }
        if (!c3938gJ.a.contains(strB)) {
            return new C8462zy0();
        }
        try {
            return new C8462zy0(Long.valueOf(c3938gJ.a.getLong(strB, 0L)));
        } catch (ClassCastException e2) {
            C3938gJ.c.b("Key %s from sharedPreferences has type other than long: %s", strB, e2.getMessage());
            return new C8462zy0();
        }
    }

    public final C8462zy0 d(OT1 ot1) {
        C3938gJ c3938gJ = this.c;
        String strB = ot1.b();
        if (strB == null) {
            c3938gJ.getClass();
            C3938gJ.c.a();
            return new C8462zy0();
        }
        if (c3938gJ.a == null) {
            c3938gJ.c(C3938gJ.a());
            if (c3938gJ.a == null) {
                return new C8462zy0();
            }
        }
        if (!c3938gJ.a.contains(strB)) {
            return new C8462zy0();
        }
        try {
            return new C8462zy0(c3938gJ.a.getString(strB, ""));
        } catch (ClassCastException e2) {
            C3938gJ.c.b("Key %s from sharedPreferences has type other than String: %s", strB, e2.getMessage());
            return new C8462zy0();
        }
    }

    public final boolean f() {
        C1567Tw c1567TwD = C1567Tw.d();
        C8462zy0 c8462zy0J = j(c1567TwD);
        if (c8462zy0J.b()) {
            return ((Boolean) c8462zy0J.a()).booleanValue();
        }
        C8462zy0 c8462zy0 = this.a.getBoolean("fpr_experiment_app_start_ttid");
        if (c8462zy0.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) c8462zy0.a()).booleanValue());
            return ((Boolean) c8462zy0.a()).booleanValue();
        }
        C8462zy0 c8462zy0A = a(c1567TwD);
        if (c8462zy0A.b()) {
            return ((Boolean) c8462zy0A.a()).booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        C1411Rw c1411Rw;
        synchronized (C1411Rw.class) {
            try {
                if (C1411Rw.a == null) {
                    C1411Rw.a = new C1411Rw();
                }
                c1411Rw = C1411Rw.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0J = j(c1411Rw);
        return c8462zy0J.b() ? (Boolean) c8462zy0J.a() : Boolean.FALSE;
    }

    public final Boolean h() {
        if (g().booleanValue()) {
            return Boolean.FALSE;
        }
        C1489Sw c1489SwD = C1489Sw.d();
        C8462zy0 c8462zy0A = a(c1489SwD);
        if (c8462zy0A.b()) {
            return (Boolean) c8462zy0A.a();
        }
        C8462zy0 c8462zy0J = j(c1489SwD);
        if (c8462zy0J.b()) {
            return (Boolean) c8462zy0J.a();
        }
        return null;
    }

    public final boolean i() {
        C2420bx c2420bx;
        synchronized (C2420bx.class) {
            try {
                if (C2420bx.a == null) {
                    C2420bx.a = new C2420bx();
                }
                c2420bx = C2420bx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0D = d(c2420bx);
        C8462zy0 string = this.a.getString("fpr_disabled_android_versions");
        if (!string.b()) {
            return c8462zy0D.b() ? s((String) c8462zy0D.a()) : s("");
        }
        String str = (String) string.a();
        if (!c8462zy0D.b() || !((String) c8462zy0D.a()).equals(str)) {
            this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
        }
        return s(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v4] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zy0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C8462zy0 j(defpackage.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.b
            java.lang.String r5 = r5.c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            zy0 r5 = new zy0
            r5.<init>()
            goto L50
        L20:
            android.os.Bundle r2 = r2.a     // Catch: java.lang.ClassCastException -> L38
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.ClassCastException -> L38
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.ClassCastException -> L38
            if (r2 != 0) goto L31
            zy0 r2 = new zy0     // Catch: java.lang.ClassCastException -> L38
            r2.<init>()     // Catch: java.lang.ClassCastException -> L38
            r5 = r2
            goto L50
        L31:
            zy0 r3 = new zy0     // Catch: java.lang.ClassCastException -> L38
            r3.<init>(r2)     // Catch: java.lang.ClassCastException -> L38
            r5 = r3
            goto L50
        L38:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r3[r1] = r2
            v4 r5 = defpackage.H70.b
            java.lang.String r0 = "Metadata key %s contains type other than boolean: %s"
            r5.b(r0, r3)
            zy0 r5 = new zy0
            r5.<init>()
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0943Lw.j(OT1):zy0");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C8462zy0 k(defpackage.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.b
            java.lang.String r5 = r5.c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            zy0 r5 = new zy0
            r5.<init>()
            goto L5f
        L20:
            android.os.Bundle r2 = r2.a
            java.lang.Object r2 = r2.get(r5)
            if (r2 != 0) goto L2e
            zy0 r5 = new zy0
            r5.<init>()
            goto L5f
        L2e:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L43
            java.lang.Float r2 = (java.lang.Float) r2
            double r0 = r2.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            zy0 r0 = new zy0
            r0.<init>(r5)
            r5 = r0
            goto L5f
        L43:
            boolean r3 = r2 instanceof java.lang.Double
            if (r3 == 0) goto L4f
            java.lang.Double r2 = (java.lang.Double) r2
            zy0 r5 = new zy0
            r5.<init>(r2)
            goto L5f
        L4f:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            v4 r5 = defpackage.H70.b
            java.lang.String r0 = "Metadata key %s contains type other than double: %s"
            r5.b(r0, r1)
            zy0 r5 = new zy0
            r5.<init>()
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0943Lw.k(OT1):zy0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [zy0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [v4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zy0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [zy0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C8462zy0 l(defpackage.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.b
            java.lang.String r5 = r5.c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            zy0 r5 = new zy0
            r5.<init>()
            goto L50
        L20:
            android.os.Bundle r2 = r2.a     // Catch: java.lang.ClassCastException -> L38
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.ClassCastException -> L38
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.ClassCastException -> L38
            if (r2 != 0) goto L31
            zy0 r2 = new zy0     // Catch: java.lang.ClassCastException -> L38
            r2.<init>()     // Catch: java.lang.ClassCastException -> L38
            r5 = r2
            goto L50
        L31:
            zy0 r3 = new zy0     // Catch: java.lang.ClassCastException -> L38
            r3.<init>(r2)     // Catch: java.lang.ClassCastException -> L38
            r5 = r3
            goto L50
        L38:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r3[r1] = r2
            v4 r5 = defpackage.H70.b
            java.lang.String r0 = "Metadata key %s contains type other than int: %s"
            r5.b(r0, r3)
            zy0 r5 = new zy0
            r5.<init>()
        L50:
            boolean r0 = r5.b()
            if (r0 == 0) goto L6b
            java.lang.Object r5 = r5.a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r0 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            zy0 r0 = new zy0
            r0.<init>(r5)
            goto L70
        L6b:
            zy0 r0 = new zy0
            r0.<init>()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0943Lw.l(OT1):zy0");
    }

    public final long m() {
        C1879Xw c1879Xw;
        synchronized (C1879Xw.class) {
            try {
                if (C1879Xw.a == null) {
                    C1879Xw.a = new C1879Xw();
                }
                c1879Xw = C1879Xw.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        c1879Xw.getClass();
        C8462zy0 c8462zy0 = remoteConfigManager.getLong("fpr_rl_network_event_count_bg");
        if (c8462zy0.b() && r(((Long) c8462zy0.a()).longValue())) {
            this.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c(c1879Xw);
        if (c8462zy0C.b() && r(((Long) c8462zy0C.a()).longValue())) {
            return ((Long) c8462zy0C.a()).longValue();
        }
        return 70L;
    }

    public final long n() {
        C1957Yw c1957Yw;
        synchronized (C1957Yw.class) {
            try {
                if (C1957Yw.a == null) {
                    C1957Yw.a = new C1957Yw();
                }
                c1957Yw = C1957Yw.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        c1957Yw.getClass();
        C8462zy0 c8462zy0 = remoteConfigManager.getLong("fpr_rl_network_event_count_fg");
        if (c8462zy0.b() && r(((Long) c8462zy0.a()).longValue())) {
            this.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c(c1957Yw);
        if (c8462zy0C.b() && r(((Long) c8462zy0C.a()).longValue())) {
            return ((Long) c8462zy0C.a()).longValue();
        }
        return 700L;
    }

    public final long o() {
        C2229ax c2229ax;
        synchronized (C2229ax.class) {
            try {
                if (C2229ax.a == null) {
                    C2229ax.a = new C2229ax();
                }
                c2229ax = C2229ax.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        c2229ax.getClass();
        C8462zy0 c8462zy0 = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (c8462zy0.b() && ((Long) c8462zy0.a()).longValue() > 0) {
            this.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c(c2229ax);
        if (!c8462zy0C.b() || ((Long) c8462zy0C.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) c8462zy0C.a()).longValue();
    }

    public final long p() {
        C3485dx c3485dx;
        synchronized (C3485dx.class) {
            try {
                if (C3485dx.a == null) {
                    C3485dx.a = new C3485dx();
                }
                c3485dx = C3485dx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0L = l(c3485dx);
        if (c8462zy0L.b() && t(((Long) c8462zy0L.a()).longValue())) {
            return ((Long) c8462zy0L.a()).longValue();
        }
        C8462zy0 c8462zy0 = this.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
        if (c8462zy0.b() && t(((Long) c8462zy0.a()).longValue())) {
            this.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c(c3485dx);
        if (c8462zy0C.b() && t(((Long) c8462zy0C.a()).longValue())) {
            return ((Long) c8462zy0C.a()).longValue();
        }
        return 0L;
    }

    public final long q() {
        C4058gx c4058gx;
        synchronized (C4058gx.class) {
            try {
                if (C4058gx.a == null) {
                    C4058gx.a = new C4058gx();
                }
                c4058gx = C4058gx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0L = l(c4058gx);
        if (c8462zy0L.b() && t(((Long) c8462zy0L.a()).longValue())) {
            return ((Long) c8462zy0L.a()).longValue();
        }
        C8462zy0 c8462zy0 = this.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
        if (c8462zy0.b() && t(((Long) c8462zy0.a()).longValue())) {
            this.c.d(((Long) c8462zy0.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
            return ((Long) c8462zy0.a()).longValue();
        }
        C8462zy0 c8462zy0C = c(c4058gx);
        if (c8462zy0C.b() && t(((Long) c8462zy0C.a()).longValue())) {
            return ((Long) c8462zy0C.a()).longValue();
        }
        return 0L;
    }

    public final boolean u() {
        C3295cx c3295cx;
        boolean zBooleanValue;
        Boolean boolH = h();
        if (boolH != null && !boolH.booleanValue()) {
            return false;
        }
        synchronized (C3295cx.class) {
            try {
                if (C3295cx.a == null) {
                    C3295cx.a = new C3295cx();
                }
                c3295cx = C3295cx.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C8462zy0 c8462zy0A = a(c3295cx);
        C8462zy0 c8462zy0 = this.a.getBoolean("fpr_enabled");
        if (!c8462zy0.b()) {
            zBooleanValue = c8462zy0A.b() ? ((Boolean) c8462zy0A.a()).booleanValue() : true;
        } else if (this.a.isLastFetchFailed()) {
            zBooleanValue = false;
        } else {
            Boolean bool = (Boolean) c8462zy0.a();
            if (!c8462zy0A.b() || c8462zy0A.a() != bool) {
                this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
            }
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue && !i();
    }
}
