package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.my.tracker.obfuscated.C2612a;
import defpackage.O91;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.a */
/* loaded from: classes2.dex */
public final class C2612a {
    final f0 d;
    final z2 e;
    final x1 f;
    final Application g;
    final Runnable h;
    final Runnable i;
    final Runnable j;
    final Map a = new WeakHashMap();
    final Handler b = m.a;
    final AtomicBoolean c = new AtomicBoolean();
    long k = 0;
    long l = 0;

    /* renamed from: com.my.tracker.obfuscated.a$a */
    public final class C0003a implements Application.ActivityLifecycleCallbacks {
        private C0003a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C2612a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C2612a.this.c(activity);
        }

        public /* synthetic */ C0003a(C2612a c2612a, int i) {
            this();
        }
    }

    private C2612a(f0 f0Var, z2 z2Var, x1 x1Var, Application application) {
        this.d = f0Var;
        this.e = z2Var;
        this.f = x1Var;
        this.g = application;
        final int i = 0;
        this.h = new Runnable(this) { // from class: Zp1
            public final /* synthetic */ C2612a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.b();
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.d();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.i = new Runnable(this) { // from class: Zp1
            public final /* synthetic */ C2612a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.b();
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.d();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.j = new Runnable(this) { // from class: Zp1
            public final /* synthetic */ C2612a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.b();
                        break;
                    case 1:
                        this.b.c();
                        break;
                    default:
                        this.b.d();
                        break;
                }
            }
        };
    }

    public void e() {
        if (this.c.get()) {
            m.f(this.i);
        }
    }

    public void f() {
        y2.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    public /* synthetic */ void c() {
        a(w2.a(this.e.e()));
    }

    public /* synthetic */ void d() {
        q1.a(this.g).d(w2.b(this.k));
    }

    public void a() {
        this.g.registerActivityLifecycleCallbacks(new C0003a(this, 0));
    }

    /* renamed from: b */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) != null || this.a.size() > 1) {
            return;
        }
        m2.d().a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.k >= w2.a(this.e.i())) {
            this.f.c();
            if (this.e.u()) {
                this.d.g();
                a(w2.a(this.e.e()));
                return;
            }
        }
        long j = this.l - jCurrentTimeMillis;
        if (j > 0) {
            a(j);
        } else {
            f();
        }
    }

    public void c(Activity activity) {
        if (this.a.remove(activity) == null || !this.a.isEmpty()) {
            return;
        }
        m2.d().b();
        this.c.set(false);
        this.b.removeCallbacks(this.h);
        this.k = System.currentTimeMillis();
        m.a(this.j);
    }

    public void d(Activity activity) {
        m.f(new O91(this, 12, activity));
    }

    public static C2612a a(f0 f0Var, z2 z2Var, x1 x1Var, Application application) {
        return new C2612a(f0Var, z2Var, x1Var, application);
    }

    public void a(long j) {
        this.b.removeCallbacks(this.h);
        this.c.set(true);
        this.b.postDelayed(this.h, j);
        this.l = System.currentTimeMillis() + j;
    }
}
