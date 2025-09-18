package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dP1 */
/* loaded from: classes.dex */
public final class C3386dP1 implements OQ1 {
    public static volatile C3386dP1 J;
    public long A;
    public volatile Boolean B;
    public final Boolean C;
    public final Boolean D;
    public volatile boolean E;
    public int F;
    public int G;
    public final long I;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final C3759fN f;
    public final C1263Py1 g;
    public final UM1 h;
    public final OL1 i;
    public final C7595vO1 j;
    public final WW1 k;
    public final C5910mZ1 l;
    public final EL1 m;
    public final Clock n;
    public final JU1 o;
    public final FR1 p;
    public final C0948Lx1 q;
    public final C5322jU1 r;
    public final String s;
    public C7966xL1 t;
    public C2528cV1 u;
    public C5265jB1 v;
    public C5295jL1 w;
    public C7422uU1 x;
    public Boolean z;
    public boolean y = false;
    public final AtomicInteger H = new AtomicInteger(0);

    public C3386dP1(C7794wR1 c7794wR1) {
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(c7794wR1);
        Context context = c7794wR1.a;
        C3759fN c3759fN = new C3759fN(26);
        this.f = c3759fN;
        AbstractC6001n22.b = c3759fN;
        this.a = context;
        this.b = c7794wR1.b;
        this.c = c7794wR1.c;
        this.d = c7794wR1.d;
        this.e = c7794wR1.h;
        this.B = c7794wR1.e;
        this.s = c7794wR1.j;
        this.E = true;
        C3359dG1 c3359dG1 = c7794wR1.g;
        if (c3359dG1 != null && (bundle = c3359dG1.g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = c3359dG1.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        if (WO1.h == null && context != null) {
            Object obj3 = WO1.g;
            synchronized (obj3) {
                try {
                    if (WO1.h == null) {
                        synchronized (obj3) {
                            C5874mN1 c5874mN1 = WO1.h;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (c5874mN1 == null || c5874mN1.a != applicationContext) {
                                if (c5874mN1 != null) {
                                    C8162yN1.d();
                                    AbstractC6071nP1.c();
                                    C3383dO1.L();
                                }
                                JO1 jo1 = new JO1();
                                jo1.a = applicationContext;
                                WO1.h = new C5874mN1(applicationContext, HT1.a(jo1));
                                WO1.i.incrementAndGet();
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
        this.n = defaultClock;
        Long l = c7794wR1.i;
        this.I = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        C1263Py1 c1263Py1 = new C1263Py1(this);
        c1263Py1.e = new C5797lz1();
        this.g = c1263Py1;
        UM1 um1 = new UM1(this);
        um1.x1();
        this.h = um1;
        OL1 ol1 = new OL1(this);
        ol1.x1();
        this.i = ol1;
        C5910mZ1 c5910mZ1 = new C5910mZ1(this);
        c5910mZ1.x1();
        this.l = c5910mZ1;
        this.m = new EL1(new A61(10, this));
        this.q = new C0948Lx1(this);
        JU1 ju1 = new JU1(this);
        ju1.B1();
        this.o = ju1;
        FR1 fr1 = new FR1(this);
        fr1.B1();
        this.p = fr1;
        WW1 ww1 = new WW1(this);
        ww1.B1();
        this.k = ww1;
        C5322jU1 c5322jU1 = new C5322jU1(this);
        c5322jU1.x1();
        this.r = c5322jU1;
        C7595vO1 c7595vO1 = new C7595vO1(this);
        c7595vO1.x1();
        this.j = c7595vO1;
        C3359dG1 c3359dG12 = c7794wR1.g;
        if (c3359dG12 != null && c3359dG12.b != 0) {
            z = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            c(fr1);
            C3386dP1 c3386dP1 = (C3386dP1) fr1.b;
            if (c3386dP1.a.getApplicationContext() instanceof Application) {
                Application application = (Application) c3386dP1.a.getApplicationContext();
                if (fr1.d == null) {
                    fr1.d = new IS(3, fr1);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(fr1.d);
                    application.registerActivityLifecycleCallbacks(fr1.d);
                    fr1.n().o.d("Registered activity lifecycle callback");
                }
            }
        } else {
            e(ol1);
            ol1.j.d("Application context is not an Application");
        }
        c7595vO1.E1(new WZ(this, c7794wR1, false, 27));
    }

    public static C3386dP1 a(Context context, C3359dG1 c3359dG1, Long l) {
        Bundle bundle;
        if (c3359dG1 != null && (c3359dG1.e == null || c3359dG1.f == null)) {
            c3359dG1 = new C3359dG1(c3359dG1.a, c3359dG1.b, c3359dG1.c, c3359dG1.d, null, null, c3359dG1.g, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (J == null) {
            synchronized (C3386dP1.class) {
                try {
                    if (J == null) {
                        J = new C3386dP1(new C7794wR1(context, c3359dG1, l));
                    }
                } finally {
                }
            }
        } else if (c3359dG1 != null && (bundle = c3359dG1.g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(J);
            J.B = Boolean.valueOf(c3359dG1.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(J);
        return J;
    }

    public static void b(U0 u0) {
        if (u0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void c(AbstractC4128hI1 abstractC4128hI1) {
        if (abstractC4128hI1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC4128hI1.c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC4128hI1.getClass())));
        }
    }

    public static void d(TJ1 tj1) {
        if (tj1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void e(SQ1 sq1) {
        if (sq1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!sq1.c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(sq1.getClass())));
        }
    }

    public final boolean f() {
        return h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r6 = this;
            boolean r0 = r6.y
            if (r0 == 0) goto Lae
            vO1 r0 = r6.j
            e(r0)
            r0.v1()
            java.lang.Boolean r0 = r6.z
            com.google.android.gms.common.util.Clock r1 = r6.n
            if (r0 == 0) goto L31
            long r2 = r6.A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L31
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La7
            long r2 = r1.elapsedRealtime()
            long r4 = r6.A
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto La7
        L31:
            long r0 = r1.elapsedRealtime()
            r6.A = r0
            mZ1 r0 = r6.l
            b(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.z2(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L70
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.z2(r1)
            if (r1 == 0) goto L70
            android.content.Context r1 = r6.a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            boolean r4 = r4.isCallerInstantApp()
            if (r4 != 0) goto L6e
            Py1 r4 = r6.g
            boolean r4 = r4.H1()
            if (r4 != 0) goto L6e
            boolean r4 = defpackage.C5910mZ1.c2(r1)
            if (r4 == 0) goto L70
            boolean r1 = defpackage.C5910mZ1.n2(r1)
            if (r1 == 0) goto L70
        L6e:
            r1 = r2
            goto L71
        L70:
            r1 = r3
        L71:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.z = r4
            if (r1 == 0) goto La7
            jL1 r1 = r6.j()
            java.lang.String r1 = r1.D1()
            jL1 r4 = r6.j()
            r4.A1()
            java.lang.String r4 = r4.o
            boolean r0 = r0.g2(r1, r4)
            if (r0 != 0) goto La1
            jL1 r0 = r6.j()
            r0.A1()
            java.lang.String r0 = r0.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La0
            goto La1
        La0:
            r2 = r3
        La1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.z = r0
        La7:
            java.lang.Boolean r0 = r6.z
            boolean r0 = r0.booleanValue()
            return r0
        Lae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3386dP1.g():boolean");
    }

    public final int h() {
        C7595vO1 c7595vO1 = this.j;
        e(c7595vO1);
        c7595vO1.v1();
        Boolean boolD1 = this.g.D1("firebase_analytics_collection_deactivated");
        if (boolD1 != null && boolD1.booleanValue()) {
            return 1;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C7595vO1 c7595vO12 = this.j;
        e(c7595vO12);
        c7595vO12.v1();
        if (!this.E) {
            return 8;
        }
        UM1 um1 = this.h;
        b(um1);
        um1.v1();
        Boolean boolValueOf = um1.C1().contains("measurement_enabled") ? Boolean.valueOf(um1.C1().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolD12 = this.g.D1("firebase_analytics_collection_enabled");
        if (boolD12 != null) {
            return boolD12.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.B == null || this.B.booleanValue()) ? 0 : 7;
    }

    public final C5265jB1 i() {
        e(this.v);
        return this.v;
    }

    public final C5295jL1 j() {
        c(this.w);
        return this.w;
    }

    public final C7966xL1 k() {
        c(this.t);
        return this.t;
    }

    public final EL1 l() {
        return this.m;
    }

    public final C7422uU1 m() {
        d(this.x);
        return this.x;
    }

    @Override // defpackage.OQ1
    public final OL1 n() {
        OL1 ol1 = this.i;
        e(ol1);
        return ol1;
    }

    public final C2528cV1 o() {
        c(this.u);
        return this.u;
    }

    public final void p() {
        b(this.l);
    }

    @Override // defpackage.OQ1
    public final C7595vO1 p0() {
        C7595vO1 c7595vO1 = this.j;
        e(c7595vO1);
        return c7595vO1;
    }

    @Override // defpackage.OQ1
    public final Context zza() {
        return this.a;
    }

    @Override // defpackage.OQ1
    public final Clock zzb() {
        return this.n;
    }

    @Override // defpackage.OQ1
    public final C3759fN zzd() {
        return this.f;
    }
}
