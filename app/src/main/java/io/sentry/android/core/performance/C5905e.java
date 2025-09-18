package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C5820Y0;
import io.sentry.C6113q1;
import io.sentry.InterfaceC5810V;
import io.sentry.android.core.AbstractC5911t;
import io.sentry.android.core.C5908q;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.performance.e */
/* loaded from: classes2.dex */
public final class C5905e extends AbstractC5901a {

    /* renamed from: n */
    public static long f33817n = SystemClock.uptimeMillis();

    /* renamed from: o */
    public static volatile C5905e f33818o;

    /* renamed from: b */
    public boolean f33820b;

    /* renamed from: a */
    public EnumC5904d f33819a = EnumC5904d.UNKNOWN;

    /* renamed from: h */
    public C5908q f33826h = null;

    /* renamed from: i */
    public C5820Y0 f33827i = null;

    /* renamed from: j */
    public C6113q1 f33828j = null;

    /* renamed from: k */
    public boolean f33829k = false;

    /* renamed from: l */
    public boolean f33830l = false;

    /* renamed from: m */
    public boolean f33831m = true;

    /* renamed from: c */
    public final C5906f f33821c = new C5906f();

    /* renamed from: d */
    public final C5906f f33822d = new C5906f();

    /* renamed from: e */
    public final C5906f f33823e = new C5906f();

    /* renamed from: f */
    public final HashMap f33824f = new HashMap();

    /* renamed from: g */
    public final ArrayList f33825g = new ArrayList();

    public C5905e() {
        this.f33820b = false;
        this.f33820b = AbstractC5911t.m21631l();
    }

    /* renamed from: c */
    public static C5905e m21604c() {
        if (f33818o == null) {
            synchronized (C5905e.class) {
                try {
                    if (f33818o == null) {
                        f33818o = new C5905e();
                    }
                } finally {
                }
            }
        }
        return f33818o;
    }

    /* renamed from: a */
    public final InterfaceC5810V m21605a() {
        return this.f33826h;
    }

    /* renamed from: b */
    public final C5906f m21606b(SentryAndroidOptions sentryAndroidOptions) {
        if (!this.f33820b || this.f33829k) {
            return new C5906f();
        }
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            C5906f c5906f = this.f33821c;
            if (c5906f.m21611c()) {
                return c5906f;
            }
        }
        return this.f33822d;
    }

    /* renamed from: d */
    public final void m21607d(Application application) {
        if (this.f33830l) {
            return;
        }
        boolean z = true;
        this.f33830l = true;
        if (!this.f33820b && !AbstractC5911t.m21631l()) {
            z = false;
        }
        this.f33820b = z;
        application.registerActivityLifecycleCallbacks(f33818o);
        new Handler(Looper.getMainLooper()).post(new RunnableC5903c(this, application, 0));
    }

    /* renamed from: e */
    public final void m21608e() {
        this.f33826h = null;
    }

    @Override // io.sentry.android.core.performance.AbstractC5901a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f33820b && this.f33828j == null) {
            this.f33828j = new C6113q1();
            C5906f c5906f = this.f33821c;
            if ((c5906f.m21612d() ? c5906f.m21609a() : System.currentTimeMillis()) - c5906f.f33833b > TimeUnit.MINUTES.toMillis(1L)) {
                this.f33829k = true;
            }
        }
    }
}
