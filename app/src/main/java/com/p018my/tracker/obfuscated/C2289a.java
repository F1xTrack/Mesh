package com.p018my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.p018my.tracker.obfuscated.C2289a;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.O91;

/* renamed from: com.my.tracker.obfuscated.a */
/* loaded from: classes2.dex */
public final class C2289a {

    /* renamed from: d */
    final C2313f0 f19716d;

    /* renamed from: e */
    final C2395z2 f19717e;

    /* renamed from: f */
    final C2386x1 f19718f;

    /* renamed from: g */
    final Application f19719g;

    /* renamed from: h */
    final Runnable f19720h;

    /* renamed from: i */
    final Runnable f19721i;

    /* renamed from: j */
    final Runnable f19722j;

    /* renamed from: a */
    final Map f19713a = new WeakHashMap();

    /* renamed from: b */
    final Handler f19714b = AbstractC2340m.f20022a;

    /* renamed from: c */
    final AtomicBoolean f19715c = new AtomicBoolean();

    /* renamed from: k */
    long f19723k = 0;

    /* renamed from: l */
    long f19724l = 0;

    /* renamed from: com.my.tracker.obfuscated.a$a */
    public final class a implements Application.ActivityLifecycleCallbacks {
        private a() {
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
            C2289a.this.m12759a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C2289a.this.m12770c(activity);
        }

        public /* synthetic */ a(C2289a c2289a, int i) {
            this();
        }
    }

    private C2289a(C2313f0 c2313f0, C2395z2 c2395z2, C2386x1 c2386x1, Application application) {
        this.f19716d = c2313f0;
        this.f19717e = c2395z2;
        this.f19718f = c2386x1;
        this.f19719g = application;
        final int i = 0;
        this.f19720h = new Runnable(this) { // from class: Zp1

            /* renamed from: b */
            public final /* synthetic */ C2289a f15145b;

            {
                this.f15145b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f15145b.m12761b();
                        break;
                    case 1:
                        this.f15145b.m12763c();
                        break;
                    default:
                        this.f15145b.m12765d();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f19721i = new Runnable(this) { // from class: Zp1

            /* renamed from: b */
            public final /* synthetic */ C2289a f15145b;

            {
                this.f15145b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f15145b.m12761b();
                        break;
                    case 1:
                        this.f15145b.m12763c();
                        break;
                    default:
                        this.f15145b.m12765d();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f19722j = new Runnable(this) { // from class: Zp1

            /* renamed from: b */
            public final /* synthetic */ C2289a f15145b;

            {
                this.f15145b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f15145b.m12761b();
                        break;
                    case 1:
                        this.f15145b.m12763c();
                        break;
                    default:
                        this.f15145b.m12765d();
                        break;
                }
            }
        };
    }

    /* renamed from: e */
    public void m12772e() {
        if (this.f19715c.get()) {
            AbstractC2340m.m13295f(this.f19721i);
        }
    }

    /* renamed from: f */
    public void m12773f() {
        AbstractC2391y2.m13568a("ActivityHandler: timer tick for buffering period");
        this.f19716d.m13052a();
        m12772e();
    }

    /* renamed from: b */
    public /* synthetic */ void m12761b() {
        if (this.f19715c.get()) {
            m12773f();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void m12763c() {
        m12768a(AbstractC2383w2.m13529a(this.f19717e.m13603e()));
    }

    /* renamed from: d */
    public /* synthetic */ void m12765d() {
        C2358q1.m13407a(this.f19719g).m13422d(AbstractC2383w2.m13530b(this.f19723k));
    }

    /* renamed from: a */
    public void m12767a() {
        this.f19719g.registerActivityLifecycleCallbacks(new a(this, 0));
    }

    /* renamed from: b */
    public void m12759a(Activity activity) {
        if (this.f19713a.put(activity, Boolean.TRUE) != null || this.f19713a.size() > 1) {
            return;
        }
        C2343m2.m13308d().mo13310a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f19723k >= AbstractC2383w2.m13529a(this.f19717e.m13609i())) {
            this.f19718f.m13543c();
            if (this.f19717e.m13621u()) {
                this.f19716d.m13089g();
                m12768a(AbstractC2383w2.m13529a(this.f19717e.m13603e()));
                return;
            }
        }
        long j = this.f19724l - jCurrentTimeMillis;
        if (j > 0) {
            m12768a(j);
        } else {
            m12773f();
        }
    }

    /* renamed from: c */
    public void m12770c(Activity activity) {
        if (this.f19713a.remove(activity) == null || !this.f19713a.isEmpty()) {
            return;
        }
        C2343m2.m13308d().mo13314b();
        this.f19715c.set(false);
        this.f19714b.removeCallbacks(this.f19720h);
        this.f19723k = System.currentTimeMillis();
        AbstractC2340m.m13290a(this.f19722j);
    }

    /* renamed from: d */
    public void m12771d(Activity activity) {
        AbstractC2340m.m13295f(new O91(this, 12, activity));
    }

    /* renamed from: a */
    public static C2289a m12758a(C2313f0 c2313f0, C2395z2 c2395z2, C2386x1 c2386x1, Application application) {
        return new C2289a(c2313f0, c2395z2, c2386x1, application);
    }

    /* renamed from: a */
    public void m12768a(long j) {
        this.f19714b.removeCallbacks(this.f19720h);
        this.f19715c.set(true);
        this.f19714b.postDelayed(this.f19720h, j);
        this.f19724l = System.currentTimeMillis() + j;
    }
}
