package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.android.core.RunnableC5105w;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes.dex */
public final class IS implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ IS(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(Intent intent) {
        S3 s3;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.b;
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc")) && (s3 = (S3) MU.d().b(S3.class)) != null) {
                String string2 = bundle.getString("google.c.a.c_id");
                T3 t3 = (T3) s3;
                if (AbstractC6420pE1.d("fcm") && AbstractC6420pE1.b("fcm", "_ln")) {
                    CG1 cg1 = (CG1) t3.a.b;
                    cg1.getClass();
                    cg1.f(new LG1(cg1, "fcm", "_ln", string2, true, 0));
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string2);
                t3.a("fcm", "_cmp", bundle2);
            }
            TA1.e(bundle, "_no");
        }
    }

    public void j(C7380uG1 c7380uG1) {
        JU1 ju1X1 = ((FR1) this.b).x1();
        synchronized (ju1X1.m) {
            try {
                if (Objects.equals(ju1X1.h, c7380uG1)) {
                    ju1X1.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C3386dP1) ju1X1.b).g.G1()) {
            ju1X1.g.remove(Integer.valueOf(c7380uG1.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(defpackage.C7380uG1 r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            FR1 r0 = (defpackage.FR1) r0
            OL1 r1 = r0.n()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            rx r1 = r1.o     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            java.lang.String r2 = "onActivityCreated"
            r1.d(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            android.content.Intent r1 = r10.c     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 != 0) goto L1b
            JU1 r0 = r0.x1()
            r0.E1(r10, r11)
            return
        L1b:
            android.net.Uri r2 = r1.getData()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L2e
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 == 0) goto L2e
        L27:
            r6 = r2
            goto L47
        L29:
            r1 = move-exception
            goto L9e
        L2c:
            r1 = move-exception
            goto L8b
        L2e:
            android.os.Bundle r2 = r1.getExtras()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r3)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r3 != 0) goto L45
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            goto L27
        L45:
            r2 = 0
            goto L27
        L47:
            if (r6 == 0) goto L83
            boolean r2 = r6.isHierarchical()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r2 != 0) goto L50
            goto L83
        L50:
            r0.u1()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r1 = defpackage.C5910mZ1.d2(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 == 0) goto L5d
            java.lang.String r1 = "gs"
        L5b:
            r7 = r1
            goto L60
        L5d:
            java.lang.String r1 = "auto"
            goto L5b
        L60:
            java.lang.String r1 = "referrer"
            java.lang.String r8 = r6.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r11 != 0) goto L6b
            r1 = 1
        L69:
            r5 = r1
            goto L6d
        L6b:
            r1 = 0
            goto L69
        L6d:
            vO1 r1 = r0.p0()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            QM1 r2 = new QM1     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r3 = r2
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r1.E1(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            JU1 r0 = r0.x1()
            r0.E1(r10, r11)
            return
        L83:
            JU1 r0 = r0.x1()
            r0.E1(r10, r11)
            return
        L8b:
            OL1 r2 = r0.n()     // Catch: java.lang.Throwable -> L29
            rx r2 = r2.g     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r1, r3)     // Catch: java.lang.Throwable -> L29
            JU1 r0 = r0.x1()
            r0.E1(r10, r11)
            return
        L9e:
            JU1 r0 = r0.x1()
            r0.E1(r10, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IS.k(uG1, android.os.Bundle):void");
    }

    public void l(C7380uG1 c7380uG1) {
        JU1 ju1X1 = ((FR1) this.b).x1();
        synchronized (ju1X1.m) {
            ju1X1.l = false;
            ju1X1.i = true;
        }
        long jElapsedRealtime = ((C3386dP1) ju1X1.b).n.elapsedRealtime();
        if (((C3386dP1) ju1X1.b).g.G1()) {
            CU1 cu1I1 = ju1X1.I1(c7380uG1);
            ju1X1.e = ju1X1.d;
            ju1X1.d = null;
            ju1X1.p0().E1(new RunnableC5105w(ju1X1, cu1I1, jElapsedRealtime));
        } else {
            ju1X1.d = null;
            ju1X1.p0().E1(new RunnableC5662lG1(ju1X1, jElapsedRealtime, 1));
        }
        WW1 ww1Y1 = ((FR1) this.b).y1();
        ww1Y1.p0().E1(new TW1(ww1Y1, ((C3386dP1) ww1Y1.b).n.elapsedRealtime(), 1));
    }

    public void m(C7380uG1 c7380uG1, Bundle bundle) {
        CU1 cu1;
        JU1 ju1X1 = ((FR1) this.b).x1();
        if (!((C3386dP1) ju1X1.b).g.G1() || bundle == null || (cu1 = (CU1) ju1X1.g.get(Integer.valueOf(c7380uG1.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(NotificationConstants.ID, cu1.c);
        bundle2.putString("name", cu1.a);
        bundle2.putString("referrer_name", cu1.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public void n(C7380uG1 c7380uG1) {
        WW1 ww1Y1 = ((FR1) this.b).y1();
        ww1Y1.p0().E1(new TW1(ww1Y1, ((C3386dP1) ww1Y1.b).n.elapsedRealtime(), 0));
        JU1 ju1X1 = ((FR1) this.b).x1();
        synchronized (ju1X1.m) {
            ju1X1.l = true;
            if (!Objects.equals(c7380uG1, ju1X1.h)) {
                synchronized (ju1X1.m) {
                    ju1X1.h = c7380uG1;
                    ju1X1.i = false;
                }
                if (((C3386dP1) ju1X1.b).g.G1()) {
                    ju1X1.j = null;
                    ju1X1.p0().E1(new SU1(ju1X1, 1));
                }
            }
        }
        if (!((C3386dP1) ju1X1.b).g.G1()) {
            ju1X1.d = ju1X1.j;
            ju1X1.p0().E1(new SU1(ju1X1, 0));
            return;
        }
        ju1X1.D1(c7380uG1.b, ju1X1.I1(c7380uG1), false);
        C0948Lx1 c0948Lx1 = ((C3386dP1) ju1X1.b).q;
        C3386dP1.d(c0948Lx1);
        c0948Lx1.p0().E1(new RunnableC5662lG1(c0948Lx1, ((C3386dP1) c0948Lx1.b).n.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RQ(this, 2, intent));
                        break;
                    }
                }
                break;
            case 1:
                O90.f(activity, "activity");
                ((C7881wu1) this.b).invoke(activity, bundle);
                break;
            case 2:
                ((CG1) this.b).f(new PG1(this, bundle, activity));
                break;
            default:
                k(C7380uG1.i0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                O90.f(activity, "activity");
                break;
            case 2:
                ((CG1) this.b).f(new VI1(this, activity, 4));
                break;
            default:
                j(C7380uG1.i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                O90.f(activity, "activity");
                break;
            case 2:
                ((CG1) this.b).f(new VI1(this, activity, 1));
                break;
            default:
                l(C7380uG1.i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                O90.f(activity, "activity");
                break;
            case 2:
                ((CG1) this.b).f(new VI1(this, activity, 2));
                break;
            default:
                n(C7380uG1.i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                O90.f(activity, "activity");
                O90.f(bundle, "outState");
                break;
            case 2:
                BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
                ((CG1) this.b).f(new PG1(this, activity, binderC3546eF1));
                Bundle bundleH = binderC3546eF1.H(50L);
                if (bundleH != null) {
                    bundle.putAll(bundleH);
                    break;
                }
                break;
            default:
                m(C7380uG1.i0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                O90.f(activity, "activity");
                break;
            case 2:
                ((CG1) this.b).f(new VI1(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                O90.f(activity, "activity");
                break;
            case 2:
                ((CG1) this.b).f(new VI1(this, activity, 3));
                break;
        }
    }

    public IS() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
