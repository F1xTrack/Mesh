package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC10130lN1;
import p000.AbstractC9376fU1;
import p000.C0533IS;
import p000.C0786MU;
import p000.C0876Nv;
import p000.C10209m02;
import p000.C10542ob1;
import p000.C22;
import p000.C3932dV;
import p000.C4198hk;
import p000.C4224i9;
import p000.C7119x8;
import p000.C7356Av0;
import p000.C7608Fr0;
import p000.C8128Pr0;
import p000.C8937c51;
import p000.C9450g32;
import p000.ES1;
import p000.ExecutorC1215TJ;
import p000.H30;
import p000.InterfaceC1136S3;
import p000.InterfaceC1478XU;
import p000.InterfaceC9347fG0;
import p000.LL0;
import p000.M51;
import p000.QT0;
import p000.RunnableC11632x71;
import p000.TA1;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: l */
    public static LL0 f18465l;

    /* renamed from: n */
    public static ScheduledThreadPoolExecutor f18467n;

    /* renamed from: a */
    public final C0786MU f18468a;

    /* renamed from: b */
    public final Context f18469b;

    /* renamed from: c */
    public final C8128Pr0 f18470c;

    /* renamed from: d */
    public final ES1 f18471d;

    /* renamed from: e */
    public final C4198hk f18472e;

    /* renamed from: f */
    public final ScheduledThreadPoolExecutor f18473f;

    /* renamed from: g */
    public final ThreadPoolExecutor f18474g;

    /* renamed from: h */
    public final C9450g32 f18475h;

    /* renamed from: i */
    public final C7608Fr0 f18476i;

    /* renamed from: j */
    public boolean f18477j;

    /* renamed from: k */
    public static final long f18464k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m */
    public static InterfaceC9347fG0 f18466m = new C0876Nv(5);

    public FirebaseMessaging(C0786MU c0786mu, InterfaceC9347fG0 interfaceC9347fG0, InterfaceC9347fG0 interfaceC9347fG02, InterfaceC1478XU interfaceC1478XU, InterfaceC9347fG0 interfaceC9347fG03, M51 m51) {
        final int i = 1;
        final int i2 = 0;
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        final C7608Fr0 c7608Fr0 = new C7608Fr0(context);
        c0786mu.m5379a();
        QT0 qt0 = new QT0(c0786mu.f7174a);
        final C8128Pr0 c8128Pr0 = new C8128Pr0();
        c8128Pr0.f9303a = c0786mu;
        c8128Pr0.f9304b = c7608Fr0;
        c8128Pr0.f9305c = qt0;
        c8128Pr0.f9306d = interfaceC9347fG0;
        c8128Pr0.f9307e = interfaceC9347fG02;
        c8128Pr0.f9308f = interfaceC1478XU;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f18477j = false;
        f18466m = interfaceC9347fG03;
        this.f18468a = c0786mu;
        this.f18472e = new C4198hk(this, m51);
        c0786mu.m5379a();
        final Context context2 = c0786mu.f7174a;
        this.f18469b = context2;
        C0533IS c0533is = new C0533IS();
        this.f18476i = c7608Fr0;
        this.f18470c = c8128Pr0;
        this.f18471d = new ES1(executorServiceNewSingleThreadExecutor);
        this.f18473f = scheduledThreadPoolExecutor;
        this.f18474g = threadPoolExecutor;
        c0786mu.m5379a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0533is);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: cV

            /* renamed from: b */
            public final /* synthetic */ FirebaseMessaging f17539b;

            {
                this.f17539b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f17539b;
                        if (firebaseMessaging.f18472e.m18864m()) {
                            firebaseMessaging.m11315j();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f17539b;
                        Context context3 = firebaseMessaging2.f18469b;
                        AbstractC10130lN1.m22415b(context3);
                        AbstractC10642pN1.m23771d(context3, firebaseMessaging2.f18470c, firebaseMessaging2.m11314i());
                        if (firebaseMessaging2.m11314i()) {
                            firebaseMessaging2.m11312g();
                            break;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = C10542ob1.f39113j;
        C9450g32 c9450g32M18242c = AbstractC9376fU1.m18242c(scheduledThreadPoolExecutor2, new Callable() { // from class: nb1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C10286mb1 c10286mb1;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C7608Fr0 c7608Fr02 = c7608Fr0;
                C8128Pr0 c8128Pr02 = c8128Pr0;
                synchronized (C10286mb1.class) {
                    try {
                        WeakReference weakReference = C10286mb1.f37784d;
                        c10286mb1 = weakReference != null ? (C10286mb1) weakReference.get() : null;
                        if (c10286mb1 == null) {
                            C10286mb1 c10286mb12 = new C10286mb1(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            c10286mb12.m22904b();
                            C10286mb1.f37784d = new WeakReference(c10286mb12);
                            c10286mb1 = c10286mb12;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C10542ob1(firebaseMessaging, c7608Fr02, c10286mb1, c8128Pr02, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f18475h = c9450g32M18242c;
        c9450g32M18242c.mo11138e(scheduledThreadPoolExecutor, new C3932dV(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: cV

            /* renamed from: b */
            public final /* synthetic */ FirebaseMessaging f17539b;

            {
                this.f17539b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f17539b;
                        if (firebaseMessaging.f18472e.m18864m()) {
                            firebaseMessaging.m11315j();
                            break;
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f17539b;
                        Context context3 = firebaseMessaging2.f18469b;
                        AbstractC10130lN1.m22415b(context3);
                        AbstractC10642pN1.m23771d(context3, firebaseMessaging2.f18470c, firebaseMessaging2.m11314i());
                        if (firebaseMessaging2.m11314i()) {
                            firebaseMessaging2.m11312g();
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* renamed from: b */
    public static void m11306b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f18467n == null) {
                    f18467n = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f18467n.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static synchronized FirebaseMessaging m11307c() {
        return getInstance(C0786MU.m5375d());
    }

    /* renamed from: d */
    public static synchronized LL0 m11308d(Context context) {
        try {
            if (f18465l == null) {
                f18465l = new LL0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18465l;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C0786MU c0786mu) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c0786mu.m5380b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* renamed from: a */
    public final String m11309a() {
        Task taskMo11140g;
        C8937c51 c8937c51M11311f = m11311f();
        if (!m11317l(c8937c51M11311f)) {
            return c8937c51M11311f.f17297a;
        }
        String strM2794c = C7608Fr0.m2794c(this.f18468a);
        ES1 es1 = this.f18471d;
        synchronized (es1) {
            taskMo11140g = (Task) ((C7119x8) es1.f2709c).getOrDefault(strM2794c, null);
            if (taskMo11140g == null) {
                C8128Pr0 c8128Pr0 = this.f18470c;
                taskMo11140g = c8128Pr0.m6452o(c8128Pr0.m6445B(C7608Fr0.m2794c((C0786MU) c8128Pr0.f9303a), "*", new Bundle())).m18387n(this.f18474g, new C4224i9(10, this, c8937c51M11311f, strM2794c)).mo11140g((ExecutorService) es1.f2708b, new H30(es1, 6, strM2794c));
                ((C7119x8) es1.f2709c).put(strM2794c, taskMo11140g);
            }
        }
        try {
            return (String) AbstractC9376fU1.m18240a(taskMo11140g);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: e */
    public final String m11310e() {
        C0786MU c0786mu = this.f18468a;
        c0786mu.m5379a();
        return "[DEFAULT]".equals(c0786mu.f7175b) ? "" : c0786mu.m5381f();
    }

    /* renamed from: f */
    public final C8937c51 m11311f() {
        C8937c51 c8937c51M10585a;
        LL0 ll0M11308d = m11308d(this.f18469b);
        String strM11310e = m11310e();
        String strM2794c = C7608Fr0.m2794c(this.f18468a);
        synchronized (ll0M11308d) {
            c8937c51M10585a = C8937c51.m10585a(ll0M11308d.f6615a.getString(LL0.m4955a(strM11310e, strM2794c), null));
        }
        return c8937c51M10585a;
    }

    /* renamed from: g */
    public final void m11312g() {
        C9450g32 c9450g32M18243d;
        int i;
        QT0 qt0 = (QT0) this.f18470c.f9305c;
        if (qt0.f9638c.m21948f() >= 241100000) {
            C22 c22M952e = C22.m952e(qt0.f9637b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c22M952e) {
                i = c22M952e.f1149a;
                c22M952e.f1149a = i + 1;
            }
            c9450g32M18243d = c22M952e.m957f(new C10209m02(i, 5, bundle, 1)).mo11139f(ExecutorC1215TJ.f11320f, C7356Av0.f467g);
        } else {
            c9450g32M18243d = AbstractC9376fU1.m18243d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        c9450g32M18243d.mo11138e(this.f18473f, new C3932dV(this, 1));
    }

    /* renamed from: h */
    public final synchronized void m11313h(boolean z) {
        this.f18477j = z;
    }

    /* renamed from: i */
    public final boolean m11314i() {
        Context context = this.f18469b;
        AbstractC10130lN1.m22415b(context);
        if (!PlatformVersion.isAtLeastQ()) {
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (this.f18468a.m5380b(InterfaceC1136S3.class) != null) {
            return true;
        }
        return TA1.m7612b() && f18466m != null;
    }

    /* renamed from: j */
    public final void m11315j() {
        if (m11317l(m11311f())) {
            synchronized (this) {
                if (!this.f18477j) {
                    m11316k(0L);
                }
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m11316k(long j) {
        m11306b(new RunnableC11632x71(this, Math.min(Math.max(30L, 2 * j), f18464k)), j);
        this.f18477j = true;
    }

    /* renamed from: l */
    public final boolean m11317l(C8937c51 c8937c51) {
        if (c8937c51 != null) {
            String strM2801a = this.f18476i.m2801a();
            if (System.currentTimeMillis() <= c8937c51.f17299c + C8937c51.f17295d && strM2801a.equals(c8937c51.f17298b)) {
                return false;
            }
        }
        return true;
    }
}
