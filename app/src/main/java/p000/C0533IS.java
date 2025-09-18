package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import io.sentry.android.core.RunnableC5914w;
import java.util.ArrayDeque;
import java.util.Objects;

/* renamed from: IS */
/* loaded from: classes.dex */
public final class C0533IS implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ int f4938a;

    /* renamed from: b */
    public final Object f4939b;

    public /* synthetic */ C0533IS(int i, Object obj) {
        this.f4938a = i;
        this.f4939b = obj;
    }

    /* renamed from: a */
    public void m3870a(Intent intent) {
        InterfaceC1136S3 interfaceC1136S3;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f4939b;
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
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc")) && (interfaceC1136S3 = (InterfaceC1136S3) C0786MU.m5375d().m5380b(InterfaceC1136S3.class)) != null) {
                String string2 = bundle.getString("google.c.a.c_id");
                C1199T3 c1199t3 = (C1199T3) interfaceC1136S3;
                if (AbstractC10624pE1.m23664d("fcm") && AbstractC10624pE1.m23662b("fcm", "_ln")) {
                    CG1 cg1 = (CG1) c1199t3.f11130a.f27505b;
                    cg1.getClass();
                    cg1.m1136f(new LG1(cg1, "fcm", "_ln", string2, true, 0));
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string2);
                c1199t3.m7538a("fcm", "_cmp", bundle2);
            }
            TA1.m7615e(bundle, "_no");
        }
    }

    /* renamed from: j */
    public void m3871j(C11268uG1 c11268uG1) {
        JU1 ju1M7683x1 = ((FR1) this.f4939b).m7683x1();
        synchronized (ju1M7683x1.f5556m) {
            try {
                if (Objects.equals(ju1M7683x1.f5551h, c11268uG1)) {
                    ju1M7683x1.f5551h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C9110dP1) ju1M7683x1.f11615b).f26037g.m6513G1()) {
            ju1M7683x1.f5550g.remove(Integer.valueOf(c11268uG1.f43627a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0045  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3872k(p000.C11268uG1 r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f4939b
            FR1 r0 = (p000.FR1) r0
            OL1 r1 = r0.mo6070n()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            rx r1 = r1.f8386o     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            java.lang.String r2 = "onActivityCreated"
            r1.m24555d(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            android.content.Intent r1 = r10.f43629c     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            if (r1 != 0) goto L1b
            JU1 r0 = r0.m7683x1()
            r0.m4331E1(r10, r11)
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
            r0.m7852u1()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            boolean r1 = p000.C10282mZ1.m22849d2(r1)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
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
            vO1 r1 = r0.mo6071p0()     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            QM1 r2 = new QM1     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r3 = r2
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            r1.m25412E1(r2)     // Catch: java.lang.Throwable -> L29 java.lang.RuntimeException -> L2c
            JU1 r0 = r0.m7683x1()
            r0.m4331E1(r10, r11)
            return
        L83:
            JU1 r0 = r0.m7683x1()
            r0.m4331E1(r10, r11)
            return
        L8b:
            OL1 r2 = r0.mo6070n()     // Catch: java.lang.Throwable -> L29
            rx r2 = r2.f8378g     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.m24554c(r1, r3)     // Catch: java.lang.Throwable -> L29
            JU1 r0 = r0.m7683x1()
            r0.m4331E1(r10, r11)
            return
        L9e:
            JU1 r0 = r0.m7683x1()
            r0.m4331E1(r10, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0533IS.m3872k(uG1, android.os.Bundle):void");
    }

    /* renamed from: l */
    public void m3873l(C11268uG1 c11268uG1) {
        JU1 ju1M7683x1 = ((FR1) this.f4939b).m7683x1();
        synchronized (ju1M7683x1.f5556m) {
            ju1M7683x1.f5555l = false;
            ju1M7683x1.f5552i = true;
        }
        long jElapsedRealtime = ((C9110dP1) ju1M7683x1.f11615b).f26044n.elapsedRealtime();
        if (((C9110dP1) ju1M7683x1.f11615b).f26037g.m6513G1()) {
            CU1 cu1M4335I1 = ju1M7683x1.m4335I1(c11268uG1);
            ju1M7683x1.f5548e = ju1M7683x1.f5547d;
            ju1M7683x1.f5547d = null;
            ju1M7683x1.mo6071p0().m25412E1(new RunnableC5914w(ju1M7683x1, cu1M4335I1, jElapsedRealtime));
        } else {
            ju1M7683x1.f5547d = null;
            ju1M7683x1.mo6071p0().m25412E1(new RunnableC10116lG1(ju1M7683x1, jElapsedRealtime, 1));
        }
        WW1 ww1M7684y1 = ((FR1) this.f4939b).m7684y1();
        ww1M7684y1.mo6071p0().m25412E1(new TW1(ww1M7684y1, ((C9110dP1) ww1M7684y1.f11615b).f26044n.elapsedRealtime(), 1));
    }

    /* renamed from: m */
    public void m3874m(C11268uG1 c11268uG1, Bundle bundle) {
        CU1 cu1;
        JU1 ju1M7683x1 = ((FR1) this.f4939b).m7683x1();
        if (!((C9110dP1) ju1M7683x1.f11615b).f26037g.m6513G1() || bundle == null || (cu1 = (CU1) ju1M7683x1.f5550g.get(Integer.valueOf(c11268uG1.f43627a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(NotificationConstants.f19487ID, cu1.f1401c);
        bundle2.putString("name", cu1.f1399a);
        bundle2.putString("referrer_name", cu1.f1400b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: n */
    public void m3875n(C11268uG1 c11268uG1) {
        WW1 ww1M7684y1 = ((FR1) this.f4939b).m7684y1();
        ww1M7684y1.mo6071p0().m25412E1(new TW1(ww1M7684y1, ((C9110dP1) ww1M7684y1.f11615b).f26044n.elapsedRealtime(), 0));
        JU1 ju1M7683x1 = ((FR1) this.f4939b).m7683x1();
        synchronized (ju1M7683x1.f5556m) {
            ju1M7683x1.f5555l = true;
            if (!Objects.equals(c11268uG1, ju1M7683x1.f5551h)) {
                synchronized (ju1M7683x1.f5556m) {
                    ju1M7683x1.f5551h = c11268uG1;
                    ju1M7683x1.f5552i = false;
                }
                if (((C9110dP1) ju1M7683x1.f11615b).f26037g.m6513G1()) {
                    ju1M7683x1.f5553j = null;
                    ju1M7683x1.mo6071p0().m25412E1(new SU1(ju1M7683x1, 1));
                }
            }
        }
        if (!((C9110dP1) ju1M7683x1.f11615b).f26037g.m6513G1()) {
            ju1M7683x1.f5547d = ju1M7683x1.f5553j;
            ju1M7683x1.mo6071p0().m25412E1(new SU1(ju1M7683x1, 0));
            return;
        }
        ju1M7683x1.m4330D1(c11268uG1.f43628b, ju1M7683x1.m4335I1(c11268uG1), false);
        C7933Lx1 c7933Lx1 = ((C9110dP1) ju1M7683x1.f11615b).f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.mo6071p0().m25412E1(new RunnableC10116lG1(c7933Lx1, ((C9110dP1) c7933Lx1.f11615b).f26044n.elapsedRealtime(), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f4938a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        m3870a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC1096RQ(this, 2, intent));
                        break;
                    }
                }
                break;
            case 1:
                O90.m5968f(activity, "activity");
                ((C11603wu1) this.f4939b).invoke(activity, bundle);
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new PG1(this, bundle, activity));
                break;
            default:
                m3872k(C11268uG1.m25147i0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f4938a) {
            case 0:
                break;
            case 1:
                O90.m5968f(activity, "activity");
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new VI1(this, activity, 4));
                break;
            default:
                m3871j(C11268uG1.m25147i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f4938a) {
            case 0:
                break;
            case 1:
                O90.m5968f(activity, "activity");
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new VI1(this, activity, 1));
                break;
            default:
                m3873l(C11268uG1.m25147i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f4938a) {
            case 0:
                break;
            case 1:
                O90.m5968f(activity, "activity");
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new VI1(this, activity, 2));
                break;
            default:
                m3875n(C11268uG1.m25147i0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f4938a) {
            case 0:
                break;
            case 1:
                O90.m5968f(activity, "activity");
                O90.m5968f(bundle, "outState");
                break;
            case 2:
                BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
                ((CG1) this.f4939b).m1136f(new PG1(this, activity, binderC9218eF1));
                Bundle bundleM17888H = binderC9218eF1.m17888H(50L);
                if (bundleM17888H != null) {
                    bundle.putAll(bundleM17888H);
                    break;
                }
                break;
            default:
                m3874m(C11268uG1.m25147i0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f4938a) {
            case 1:
                O90.m5968f(activity, "activity");
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new VI1(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f4938a) {
            case 1:
                O90.m5968f(activity, "activity");
                break;
            case 2:
                ((CG1) this.f4939b).m1136f(new VI1(this, activity, 3));
                break;
        }
    }

    public C0533IS() {
        this.f4938a = 0;
        this.f4939b = new ArrayDeque(10);
    }

    /* renamed from: b */
    private final void m3862b(Activity activity) {
    }

    /* renamed from: c */
    private final void m3863c(Activity activity) {
    }

    /* renamed from: d */
    private final void m3864d(Activity activity) {
    }

    /* renamed from: f */
    private final void m3866f(Activity activity) {
    }

    /* renamed from: g */
    private final void m3867g(Activity activity) {
    }

    /* renamed from: h */
    private final void m3868h(Activity activity) {
    }

    /* renamed from: i */
    private final void m3869i(Activity activity) {
    }

    /* renamed from: e */
    private final void m3865e(Activity activity, Bundle bundle) {
    }
}
