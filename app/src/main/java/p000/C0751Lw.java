package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Lw */
/* loaded from: classes.dex */
public final class C0751Lw {

    /* renamed from: d */
    public static final C6989v4 f6930d = C6989v4.m25319d();

    /* renamed from: e */
    public static volatile C0751Lw f6931e;

    /* renamed from: a */
    public final RemoteConfigManager f6932a = RemoteConfigManager.getInstance();

    /* renamed from: b */
    public H70 f6933b = new H70();

    /* renamed from: c */
    public final C4108gJ f6934c = C4108gJ.m18419b();

    /* renamed from: e */
    public static synchronized C0751Lw m5135e() {
        try {
            if (f6931e == null) {
                f6931e = new C0751Lw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6931e;
    }

    /* renamed from: r */
    public static boolean m5136r(long j) {
        return j >= 0;
    }

    /* renamed from: s */
    public static boolean m5137s(String str) {
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

    /* renamed from: t */
    public static boolean m5138t(long j) {
        return j >= 0;
    }

    /* renamed from: v */
    public static boolean m5139v(double d) {
        return ConfigValue.DOUBLE_DEFAULT_VALUE <= d && d <= 1.0d;
    }

    /* renamed from: a */
    public final C11991zy0 m5140a(OT1 ot1) {
        C4108gJ c4108gJ = this.f6934c;
        String strMo6075b = ot1.mo6075b();
        if (strMo6075b == null) {
            c4108gJ.getClass();
            C4108gJ.f27664c.m25320a();
            return new C11991zy0();
        }
        if (c4108gJ.f27666a == null) {
            c4108gJ.m18420c(C4108gJ.m18418a());
            if (c4108gJ.f27666a == null) {
                return new C11991zy0();
            }
        }
        if (!c4108gJ.f27666a.contains(strMo6075b)) {
            return new C11991zy0();
        }
        try {
            return new C11991zy0(Boolean.valueOf(c4108gJ.f27666a.getBoolean(strMo6075b, false)));
        } catch (ClassCastException e) {
            C4108gJ.f27664c.m25321b("Key %s from sharedPreferences has type other than long: %s", strMo6075b, e.getMessage());
            return new C11991zy0();
        }
    }

    /* renamed from: b */
    public final C11991zy0 m5141b(OT1 ot1) {
        C4108gJ c4108gJ = this.f6934c;
        String strMo6075b = ot1.mo6075b();
        if (strMo6075b == null) {
            c4108gJ.getClass();
            C4108gJ.f27664c.m25320a();
            return new C11991zy0();
        }
        if (c4108gJ.f27666a == null) {
            c4108gJ.m18420c(C4108gJ.m18418a());
            if (c4108gJ.f27666a == null) {
                return new C11991zy0();
            }
        }
        if (!c4108gJ.f27666a.contains(strMo6075b)) {
            return new C11991zy0();
        }
        try {
            try {
                return new C11991zy0(Double.valueOf(Double.longBitsToDouble(c4108gJ.f27666a.getLong(strMo6075b, 0L))));
            } catch (ClassCastException unused) {
                return new C11991zy0(Double.valueOf(Float.valueOf(c4108gJ.f27666a.getFloat(strMo6075b, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            C4108gJ.f27664c.m25321b("Key %s from sharedPreferences has type other than double: %s", strMo6075b, e.getMessage());
            return new C11991zy0();
        }
    }

    /* renamed from: c */
    public final C11991zy0 m5142c(OT1 ot1) {
        C4108gJ c4108gJ = this.f6934c;
        String strMo6075b = ot1.mo6075b();
        if (strMo6075b == null) {
            c4108gJ.getClass();
            C4108gJ.f27664c.m25320a();
            return new C11991zy0();
        }
        if (c4108gJ.f27666a == null) {
            c4108gJ.m18420c(C4108gJ.m18418a());
            if (c4108gJ.f27666a == null) {
                return new C11991zy0();
            }
        }
        if (!c4108gJ.f27666a.contains(strMo6075b)) {
            return new C11991zy0();
        }
        try {
            return new C11991zy0(Long.valueOf(c4108gJ.f27666a.getLong(strMo6075b, 0L)));
        } catch (ClassCastException e) {
            C4108gJ.f27664c.m25321b("Key %s from sharedPreferences has type other than long: %s", strMo6075b, e.getMessage());
            return new C11991zy0();
        }
    }

    /* renamed from: d */
    public final C11991zy0 m5143d(OT1 ot1) {
        C4108gJ c4108gJ = this.f6934c;
        String strMo6075b = ot1.mo6075b();
        if (strMo6075b == null) {
            c4108gJ.getClass();
            C4108gJ.f27664c.m25320a();
            return new C11991zy0();
        }
        if (c4108gJ.f27666a == null) {
            c4108gJ.m18420c(C4108gJ.m18418a());
            if (c4108gJ.f27666a == null) {
                return new C11991zy0();
            }
        }
        if (!c4108gJ.f27666a.contains(strMo6075b)) {
            return new C11991zy0();
        }
        try {
            return new C11991zy0(c4108gJ.f27666a.getString(strMo6075b, ""));
        } catch (ClassCastException e) {
            C4108gJ.f27664c.m25321b("Key %s from sharedPreferences has type other than String: %s", strMo6075b, e.getMessage());
            return new C11991zy0();
        }
    }

    /* renamed from: f */
    public final boolean m5144f() {
        C1254Tw c1254TwM7826d = C1254Tw.m7826d();
        C11991zy0 c11991zy0M5148j = m5148j(c1254TwM7826d);
        if (c11991zy0M5148j.m26594b()) {
            return ((Boolean) c11991zy0M5148j.m26593a()).booleanValue();
        }
        C11991zy0 c11991zy0 = this.f6932a.getBoolean("fpr_experiment_app_start_ttid");
        if (c11991zy0.m26594b()) {
            this.f6934c.m18424g("com.google.firebase.perf.ExperimentTTID", ((Boolean) c11991zy0.m26593a()).booleanValue());
            return ((Boolean) c11991zy0.m26593a()).booleanValue();
        }
        C11991zy0 c11991zy0M5140a = m5140a(c1254TwM7826d);
        if (c11991zy0M5140a.m26594b()) {
            return ((Boolean) c11991zy0M5140a.m26593a()).booleanValue();
        }
        return false;
    }

    /* renamed from: g */
    public final Boolean m5145g() {
        C1128Rw c1128Rw;
        synchronized (C1128Rw.class) {
            try {
                if (C1128Rw.f10488a == null) {
                    C1128Rw.f10488a = new C1128Rw();
                }
                c1128Rw = C1128Rw.f10488a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5148j = m5148j(c1128Rw);
        return c11991zy0M5148j.m26594b() ? (Boolean) c11991zy0M5148j.m26593a() : Boolean.FALSE;
    }

    /* renamed from: h */
    public final Boolean m5146h() {
        if (m5145g().booleanValue()) {
            return Boolean.FALSE;
        }
        C1191Sw c1191SwM7468d = C1191Sw.m7468d();
        C11991zy0 c11991zy0M5140a = m5140a(c1191SwM7468d);
        if (c11991zy0M5140a.m26594b()) {
            return (Boolean) c11991zy0M5140a.m26593a();
        }
        C11991zy0 c11991zy0M5148j = m5148j(c1191SwM7468d);
        if (c11991zy0M5148j.m26594b()) {
            return (Boolean) c11991zy0M5148j.m26593a();
        }
        return null;
    }

    /* renamed from: i */
    public final boolean m5147i() {
        C1817bx c1817bx;
        synchronized (C1817bx.class) {
            try {
                if (C1817bx.f17240a == null) {
                    C1817bx.f17240a = new C1817bx();
                }
                c1817bx = C1817bx.f17240a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5143d = m5143d(c1817bx);
        C11991zy0 string = this.f6932a.getString("fpr_disabled_android_versions");
        if (!string.m26594b()) {
            return c11991zy0M5143d.m26594b() ? m5137s((String) c11991zy0M5143d.m26593a()) : m5137s("");
        }
        String str = (String) string.m26593a();
        if (!c11991zy0M5143d.m26594b() || !((String) c11991zy0M5143d.m26593a()).equals(str)) {
            this.f6934c.m18423f("com.google.firebase.perf.SdkDisabledVersions", str);
        }
        return m5137s(str);
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11991zy0 m5148j(p000.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.f6933b
            java.lang.String r5 = r5.mo6076c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f4135a
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
            android.os.Bundle r2 = r2.f4135a     // Catch: java.lang.ClassCastException -> L38
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
            v4 r5 = p000.H70.f4134b
            java.lang.String r0 = "Metadata key %s contains type other than boolean: %s"
            r5.m25321b(r0, r3)
            zy0 r5 = new zy0
            r5.<init>()
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0751Lw.m5148j(OT1):zy0");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0020  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11991zy0 m5149k(p000.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.f6933b
            java.lang.String r5 = r5.mo6076c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f4135a
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
            android.os.Bundle r2 = r2.f4135a
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
            v4 r5 = p000.H70.f4134b
            java.lang.String r0 = "Metadata key %s contains type other than double: %s"
            r5.m25321b(r0, r1)
            zy0 r5 = new zy0
            r5.<init>()
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0751Lw.m5149k(OT1):zy0");
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
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11991zy0 m5150l(p000.OT1 r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            H70 r2 = r4.f6933b
            java.lang.String r5 = r5.mo6076c()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f4135a
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
            android.os.Bundle r2 = r2.f4135a     // Catch: java.lang.ClassCastException -> L38
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
            v4 r5 = p000.H70.f4134b
            java.lang.String r0 = "Metadata key %s contains type other than int: %s"
            r5.m25321b(r0, r3)
            zy0 r5 = new zy0
            r5.<init>()
        L50:
            boolean r0 = r5.m26594b()
            if (r0 == 0) goto L6b
            java.lang.Object r5 = r5.m26593a()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0751Lw.m5150l(OT1):zy0");
    }

    /* renamed from: m */
    public final long m5151m() {
        C1506Xw c1506Xw;
        synchronized (C1506Xw.class) {
            try {
                if (C1506Xw.f14051a == null) {
                    C1506Xw.f14051a = new C1506Xw();
                }
                c1506Xw = C1506Xw.f14051a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f6932a;
        c1506Xw.getClass();
        C11991zy0 c11991zy0 = remoteConfigManager.getLong("fpr_rl_network_event_count_bg");
        if (c11991zy0.m26594b() && m5136r(((Long) c11991zy0.m26593a()).longValue())) {
            this.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = m5142c(c1506Xw);
        if (c11991zy0M5142c.m26594b() && m5136r(((Long) c11991zy0M5142c.m26593a()).longValue())) {
            return ((Long) c11991zy0M5142c.m26593a()).longValue();
        }
        return 70L;
    }

    /* renamed from: n */
    public final long m5152n() {
        C1569Yw c1569Yw;
        synchronized (C1569Yw.class) {
            try {
                if (C1569Yw.f14619a == null) {
                    C1569Yw.f14619a = new C1569Yw();
                }
                c1569Yw = C1569Yw.f14619a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f6932a;
        c1569Yw.getClass();
        C11991zy0 c11991zy0 = remoteConfigManager.getLong("fpr_rl_network_event_count_fg");
        if (c11991zy0.m26594b() && m5136r(((Long) c11991zy0.m26593a()).longValue())) {
            this.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = m5142c(c1569Yw);
        if (c11991zy0M5142c.m26594b() && m5136r(((Long) c11991zy0M5142c.m26593a()).longValue())) {
            return ((Long) c11991zy0M5142c.m26593a()).longValue();
        }
        return 700L;
    }

    /* renamed from: o */
    public final long m5153o() {
        C1754ax c1754ax;
        synchronized (C1754ax.class) {
            try {
                if (C1754ax.f16690a == null) {
                    C1754ax.f16690a = new C1754ax();
                }
                c1754ax = C1754ax.f16690a;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f6932a;
        c1754ax.getClass();
        C11991zy0 c11991zy0 = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (c11991zy0.m26594b() && ((Long) c11991zy0.m26593a()).longValue() > 0) {
            this.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = m5142c(c1754ax);
        if (!c11991zy0M5142c.m26594b() || ((Long) c11991zy0M5142c.m26593a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) c11991zy0M5142c.m26593a()).longValue();
    }

    /* renamed from: p */
    public final long m5154p() {
        C3959dx c3959dx;
        synchronized (C3959dx.class) {
            try {
                if (C3959dx.f26399a == null) {
                    C3959dx.f26399a = new C3959dx();
                }
                c3959dx = C3959dx.f26399a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5150l = m5150l(c3959dx);
        if (c11991zy0M5150l.m26594b() && m5138t(((Long) c11991zy0M5150l.m26593a()).longValue())) {
            return ((Long) c11991zy0M5150l.m26593a()).longValue();
        }
        C11991zy0 c11991zy0 = this.f6932a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
        if (c11991zy0.m26594b() && m5138t(((Long) c11991zy0.m26593a()).longValue())) {
            this.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = m5142c(c3959dx);
        if (c11991zy0M5142c.m26594b() && m5138t(((Long) c11991zy0M5142c.m26593a()).longValue())) {
            return ((Long) c11991zy0M5142c.m26593a()).longValue();
        }
        return 0L;
    }

    /* renamed from: q */
    public final long m5155q() {
        C4148gx c4148gx;
        synchronized (C4148gx.class) {
            try {
                if (C4148gx.f28111a == null) {
                    C4148gx.f28111a = new C4148gx();
                }
                c4148gx = C4148gx.f28111a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5150l = m5150l(c4148gx);
        if (c11991zy0M5150l.m26594b() && m5138t(((Long) c11991zy0M5150l.m26593a()).longValue())) {
            return ((Long) c11991zy0M5150l.m26593a()).longValue();
        }
        C11991zy0 c11991zy0 = this.f6932a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
        if (c11991zy0.m26594b() && m5138t(((Long) c11991zy0.m26593a()).longValue())) {
            this.f6934c.m18421d(((Long) c11991zy0.m26593a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
            return ((Long) c11991zy0.m26593a()).longValue();
        }
        C11991zy0 c11991zy0M5142c = m5142c(c4148gx);
        if (c11991zy0M5142c.m26594b() && m5138t(((Long) c11991zy0M5142c.m26593a()).longValue())) {
            return ((Long) c11991zy0M5142c.m26593a()).longValue();
        }
        return 0L;
    }

    /* renamed from: u */
    public final boolean m5156u() {
        C3897cx c3897cx;
        boolean zBooleanValue;
        Boolean boolM5146h = m5146h();
        if (boolM5146h != null && !boolM5146h.booleanValue()) {
            return false;
        }
        synchronized (C3897cx.class) {
            try {
                if (C3897cx.f25729a == null) {
                    C3897cx.f25729a = new C3897cx();
                }
                c3897cx = C3897cx.f25729a;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11991zy0 c11991zy0M5140a = m5140a(c3897cx);
        C11991zy0 c11991zy0 = this.f6932a.getBoolean("fpr_enabled");
        if (!c11991zy0.m26594b()) {
            zBooleanValue = c11991zy0M5140a.m26594b() ? ((Boolean) c11991zy0M5140a.m26593a()).booleanValue() : true;
        } else if (this.f6932a.isLastFetchFailed()) {
            zBooleanValue = false;
        } else {
            Boolean bool = (Boolean) c11991zy0.m26593a();
            if (!c11991zy0M5140a.m26594b() || c11991zy0M5140a.m26593a() != bool) {
                this.f6934c.m18424g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
            }
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue && !m5147i();
    }
}
