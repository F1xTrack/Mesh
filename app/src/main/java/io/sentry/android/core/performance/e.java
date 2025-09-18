package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C5164q1;
import io.sentry.V;
import io.sentry.Y0;
import io.sentry.android.core.AbstractC5102t;
import io.sentry.android.core.C5100q;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends a {
    public static long n = SystemClock.uptimeMillis();
    public static volatile e o;
    public boolean b;
    public d a = d.UNKNOWN;
    public C5100q h = null;
    public Y0 i = null;
    public C5164q1 j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = true;
    public final f c = new f();
    public final f d = new f();
    public final f e = new f();
    public final HashMap f = new HashMap();
    public final ArrayList g = new ArrayList();

    public e() {
        this.b = false;
        this.b = AbstractC5102t.l();
    }

    public static e c() {
        if (o == null) {
            synchronized (e.class) {
                try {
                    if (o == null) {
                        o = new e();
                    }
                } finally {
                }
            }
        }
        return o;
    }

    public final V a() {
        return this.h;
    }

    public final f b(SentryAndroidOptions sentryAndroidOptions) {
        if (!this.b || this.k) {
            return new f();
        }
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            f fVar = this.c;
            if (fVar.c()) {
                return fVar;
            }
        }
        return this.d;
    }

    public final void d(Application application) {
        if (this.l) {
            return;
        }
        boolean z = true;
        this.l = true;
        if (!this.b && !AbstractC5102t.l()) {
            z = false;
        }
        this.b = z;
        application.registerActivityLifecycleCallbacks(o);
        new Handler(Looper.getMainLooper()).post(new c(this, application, 0));
    }

    public final void e() {
        this.h = null;
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.b && this.j == null) {
            this.j = new C5164q1();
            f fVar = this.c;
            if ((fVar.d() ? fVar.a() : System.currentTimeMillis()) - fVar.b > TimeUnit.MINUTES.toMillis(1L)) {
                this.k = true;
            }
        }
    }
}
