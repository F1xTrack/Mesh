package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dP1 */
/* loaded from: classes.dex */
public final class C9110dP1 implements OQ1 {

    /* renamed from: J */
    public static volatile C9110dP1 f26021J;

    /* renamed from: A */
    public long f26022A;

    /* renamed from: B */
    public volatile Boolean f26023B;

    /* renamed from: C */
    public final Boolean f26024C;

    /* renamed from: D */
    public final Boolean f26025D;

    /* renamed from: E */
    public volatile boolean f26026E;

    /* renamed from: F */
    public int f26027F;

    /* renamed from: G */
    public int f26028G;

    /* renamed from: I */
    public final long f26030I;

    /* renamed from: a */
    public final Context f26031a;

    /* renamed from: b */
    public final String f26032b;

    /* renamed from: c */
    public final String f26033c;

    /* renamed from: d */
    public final String f26034d;

    /* renamed from: e */
    public final boolean f26035e;

    /* renamed from: f */
    public final C4049fN f26036f;

    /* renamed from: g */
    public final C8143Py1 f26037g;

    /* renamed from: h */
    public final UM1 f26038h;

    /* renamed from: i */
    public final OL1 f26039i;

    /* renamed from: j */
    public final C11412vO1 f26040j;

    /* renamed from: k */
    public final WW1 f26041k;

    /* renamed from: l */
    public final C10282mZ1 f26042l;

    /* renamed from: m */
    public final EL1 f26043m;

    /* renamed from: n */
    public final Clock f26044n;

    /* renamed from: o */
    public final JU1 f26045o;

    /* renamed from: p */
    public final FR1 f26046p;

    /* renamed from: q */
    public final C7933Lx1 f26047q;

    /* renamed from: r */
    public final C9888jU1 f26048r;

    /* renamed from: s */
    public final String f26049s;

    /* renamed from: t */
    public C11660xL1 f26050t;

    /* renamed from: u */
    public C8989cV1 f26051u;

    /* renamed from: v */
    public C9850jB1 f26052v;

    /* renamed from: w */
    public C9870jL1 f26053w;

    /* renamed from: x */
    public C11296uU1 f26054x;

    /* renamed from: z */
    public Boolean f26056z;

    /* renamed from: y */
    public boolean f26055y = false;

    /* renamed from: H */
    public final AtomicInteger f26029H = new AtomicInteger(0);

    public C9110dP1(C11545wR1 c11545wR1) {
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(c11545wR1);
        Context context = c11545wR1.f44870a;
        C4049fN c4049fN = new C4049fN(26);
        this.f26036f = c4049fN;
        AbstractC10343n22.f38063b = c4049fN;
        this.f26031a = context;
        this.f26032b = c11545wR1.f44871b;
        this.f26033c = c11545wR1.f44872c;
        this.f26034d = c11545wR1.f44873d;
        this.f26035e = c11545wR1.f44877h;
        this.f26023B = c11545wR1.f44874e;
        this.f26049s = c11545wR1.f44879j;
        this.f26026E = true;
        C9092dG1 c9092dG1 = c11545wR1.f44876g;
        if (c9092dG1 != null && (bundle = c9092dG1.f25927g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f26024C = (Boolean) obj;
            }
            Object obj2 = c9092dG1.f25927g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f26025D = (Boolean) obj2;
            }
        }
        if (WO1.f13160h == null && context != null) {
            Object obj3 = WO1.f13159g;
            synchronized (obj3) {
                try {
                    if (WO1.f13160h == null) {
                        synchronized (obj3) {
                            C10258mN1 c10258mN1 = WO1.f13160h;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (c10258mN1 == null || c10258mN1.f37658a != applicationContext) {
                                if (c10258mN1 != null) {
                                    C11791yN1.m26146d();
                                    AbstractC10390nP1.m23136c();
                                    C9108dO1.m17559L();
                                }
                                JO1 jo1 = new JO1();
                                jo1.f5509a = applicationContext;
                                WO1.f13160h = new C10258mN1(applicationContext, HT1.m3451a(jo1));
                                WO1.f13161i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        Clock defaultClock = DefaultClock.getInstance();
        this.f26044n = defaultClock;
        Long l = c11545wR1.f44878i;
        this.f26030I = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        C8143Py1 c8143Py1 = new C8143Py1(this);
        c8143Py1.f9378e = new C10206lz1();
        this.f26037g = c8143Py1;
        UM1 um1 = new UM1(this);
        um1.m7368x1();
        this.f26038h = um1;
        OL1 ol1 = new OL1(this);
        ol1.m7368x1();
        this.f26039i = ol1;
        C10282mZ1 c10282mZ1 = new C10282mZ1(this);
        c10282mZ1.m7368x1();
        this.f26042l = c10282mZ1;
        this.f26043m = new EL1(new A61(10, this));
        this.f26047q = new C7933Lx1(this);
        JU1 ju1 = new JU1(this);
        ju1.m18794B1();
        this.f26045o = ju1;
        FR1 fr1 = new FR1(this);
        fr1.m18794B1();
        this.f26046p = fr1;
        WW1 ww1 = new WW1(this);
        ww1.m18794B1();
        this.f26041k = ww1;
        C9888jU1 c9888jU1 = new C9888jU1(this);
        c9888jU1.m7368x1();
        this.f26048r = c9888jU1;
        C11412vO1 c11412vO1 = new C11412vO1(this);
        c11412vO1.m7368x1();
        this.f26040j = c11412vO1;
        C9092dG1 c9092dG12 = c11545wR1.f44876g;
        if (c9092dG12 != null && c9092dG12.f25922b != 0) {
            z = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            m17590c(fr1);
            C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
            if (c9110dP1.f26031a.getApplicationContext() instanceof Application) {
                Application application = (Application) c9110dP1.f26031a.getApplicationContext();
                if (fr1.f3205d == null) {
                    fr1.f3205d = new C0533IS(3, fr1);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(fr1.f3205d);
                    application.registerActivityLifecycleCallbacks(fr1.f3205d);
                    fr1.mo6070n().f8386o.m24555d("Registered activity lifecycle callback");
                }
            }
        } else {
            m17592e(ol1);
            ol1.f8381j.m24555d("Application context is not an Application");
        }
        c11412vO1.m25412E1(new RunnableC1420WZ(this, c11545wR1, false, 27));
    }

    /* renamed from: a */
    public static C9110dP1 m17588a(Context context, C9092dG1 c9092dG1, Long l) {
        Bundle bundle;
        if (c9092dG1 != null && (c9092dG1.f25925e == null || c9092dG1.f25926f == null)) {
            c9092dG1 = new C9092dG1(c9092dG1.f25921a, c9092dG1.f25922b, c9092dG1.f25923c, c9092dG1.f25924d, null, null, c9092dG1.f25927g, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f26021J == null) {
            synchronized (C9110dP1.class) {
                try {
                    if (f26021J == null) {
                        f26021J = new C9110dP1(new C11545wR1(context, c9092dG1, l));
                    }
                } finally {
                }
            }
        } else if (c9092dG1 != null && (bundle = c9092dG1.f25927g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f26021J);
            f26021J.f26023B = Boolean.valueOf(c9092dG1.f25927g.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f26021J);
        return f26021J;
    }

    /* renamed from: b */
    public static void m17589b(AbstractC1259U0 abstractC1259U0) {
        if (abstractC1259U0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: c */
    public static void m17590c(AbstractC9608hI1 abstractC9608hI1) {
        if (abstractC9608hI1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC9608hI1.f28371c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC9608hI1.getClass())));
        }
    }

    /* renamed from: d */
    public static void m17591d(TJ1 tj1) {
        if (tj1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: e */
    public static void m17592e(SQ1 sq1) {
        if (sq1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!sq1.f10765c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(sq1.getClass())));
        }
    }

    /* renamed from: f */
    public final boolean m17593f() {
        return m17595h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0079  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17594g() {
        /*
            r6 = this;
            boolean r0 = r6.f26055y
            if (r0 == 0) goto Lae
            vO1 r0 = r6.f26040j
            m17592e(r0)
            r0.mo7681v1()
            java.lang.Boolean r0 = r6.f26056z
            com.google.android.gms.common.util.Clock r1 = r6.f26044n
            if (r0 == 0) goto L31
            long r2 = r6.f26022A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L31
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La7
            long r2 = r1.elapsedRealtime()
            long r4 = r6.f26022A
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La7
        L31:
            long r0 = r1.elapsedRealtime()
            r6.f26022A = r0
            mZ1 r0 = r6.f26042l
            m17589b(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.m22899z2(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L70
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.m22899z2(r1)
            if (r1 == 0) goto L70
            android.content.Context r1 = r6.f26031a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            boolean r4 = r4.isCallerInstantApp()
            if (r4 != 0) goto L6e
            Py1 r4 = r6.f26037g
            boolean r4 = r4.m6514H1()
            if (r4 != 0) goto L6e
            boolean r4 = p000.C10282mZ1.m22848c2(r1)
            if (r4 == 0) goto L70
            boolean r1 = p000.C10282mZ1.m22854n2(r1)
            if (r1 == 0) goto L70
        L6e:
            r1 = r2
            goto L71
        L70:
            r1 = r3
        L71:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f26056z = r4
            if (r1 == 0) goto La7
            jL1 r1 = r6.m17597j()
            java.lang.String r1 = r1.m22026D1()
            jL1 r4 = r6.m17597j()
            r4.m18793A1()
            java.lang.String r4 = r4.f35083o
            boolean r0 = r0.m22887g2(r1, r4)
            if (r0 != 0) goto La1
            jL1 r0 = r6.m17597j()
            r0.m18793A1()
            java.lang.String r0 = r0.f35083o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La0
            goto La1
        La0:
            r2 = r3
        La1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f26056z = r0
        La7:
            java.lang.Boolean r0 = r6.f26056z
            boolean r0 = r0.booleanValue()
            return r0
        Lae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9110dP1.m17594g():boolean");
    }

    /* renamed from: h */
    public final int m17595h() {
        C11412vO1 c11412vO1 = this.f26040j;
        m17592e(c11412vO1);
        c11412vO1.mo7681v1();
        Boolean boolM6510D1 = this.f26037g.m6510D1("firebase_analytics_collection_deactivated");
        if (boolM6510D1 != null && boolM6510D1.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f26025D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C11412vO1 c11412vO12 = this.f26040j;
        m17592e(c11412vO12);
        c11412vO12.mo7681v1();
        if (!this.f26026E) {
            return 8;
        }
        UM1 um1 = this.f26038h;
        m17589b(um1);
        um1.mo7681v1();
        Boolean boolValueOf = um1.m7993C1().contains("measurement_enabled") ? Boolean.valueOf(um1.m7993C1().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolM6510D12 = this.f26037g.m6510D1("firebase_analytics_collection_enabled");
        if (boolM6510D12 != null) {
            return boolM6510D12.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f26024C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f26023B == null || this.f26023B.booleanValue()) ? 0 : 7;
    }

    /* renamed from: i */
    public final C9850jB1 m17596i() {
        m17592e(this.f26052v);
        return this.f26052v;
    }

    /* renamed from: j */
    public final C9870jL1 m17597j() {
        m17590c(this.f26053w);
        return this.f26053w;
    }

    /* renamed from: k */
    public final C11660xL1 m17598k() {
        m17590c(this.f26050t);
        return this.f26050t;
    }

    /* renamed from: l */
    public final EL1 m17599l() {
        return this.f26043m;
    }

    /* renamed from: m */
    public final C11296uU1 m17600m() {
        m17591d(this.f26054x);
        return this.f26054x;
    }

    @Override // p000.OQ1
    /* renamed from: n */
    public final OL1 mo6070n() {
        OL1 ol1 = this.f26039i;
        m17592e(ol1);
        return ol1;
    }

    /* renamed from: o */
    public final C8989cV1 m17601o() {
        m17590c(this.f26051u);
        return this.f26051u;
    }

    /* renamed from: p */
    public final void m17602p() {
        m17589b(this.f26042l);
    }

    @Override // p000.OQ1
    /* renamed from: p0 */
    public final C11412vO1 mo6071p0() {
        C11412vO1 c11412vO1 = this.f26040j;
        m17592e(c11412vO1);
        return c11412vO1;
    }

    @Override // p000.OQ1
    public final Context zza() {
        return this.f26031a;
    }

    @Override // p000.OQ1
    public final Clock zzb() {
        return this.f26044n;
    }

    @Override // p000.OQ1
    public final C4049fN zzd() {
        return this.f26036f;
    }
}
