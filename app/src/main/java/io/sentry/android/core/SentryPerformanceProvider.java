package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.yandex.metrica.C2460e;
import io.sentry.C5759D1;
import io.sentry.C5805T0;
import io.sentry.C5820Y0;
import io.sentry.C6061m0;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.internal.util.C5893m;
import io.sentry.android.core.performance.C5905e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class SentryPerformanceProvider extends AbstractC5836H {

    /* renamed from: f */
    public static final long f33604f = SystemClock.uptimeMillis();

    /* renamed from: b */
    public Application f33605b;

    /* renamed from: c */
    public C5857b0 f33606c;

    /* renamed from: d */
    public final C5847T f33607d;

    /* renamed from: e */
    public final C5832D f33608e;

    public SentryPerformanceProvider() {
        C5847T c5847t = new C5847T();
        this.f33607d = c5847t;
        this.f33608e = new C5832D(c5847t);
    }

    /* renamed from: a */
    public final synchronized void m21542a() {
        C5857b0 c5857b0;
        C5905e c5905eM21604c = C5905e.m21604c();
        c5905eM21604c.f33822d.m21614f();
        c5905eM21604c.f33821c.m21614f();
        Application application = this.f33605b;
        if (application != null && (c5857b0 = this.f33606c) != null) {
            application.unregisterActivityLifecycleCallbacks(c5857b0);
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C5905e c5905eM21604c = C5905e.m21604c();
        Context context = getContext();
        c5905eM21604c.f33822d.m21613e(f33604f);
        C5832D c5832d = this.f33608e;
        c5832d.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            if (context instanceof Application) {
                this.f33605b = (Application) context;
            }
            if (this.f33605b != null) {
                c5905eM21604c.f33821c.m21613e(Process.getStartUptimeMillis());
                c5905eM21604c.m21607d(this.f33605b);
                C5857b0 c5857b0 = new C5857b0(this, new AtomicBoolean(false));
                this.f33606c = c5857b0;
                this.f33605b.registerActivityLifecycleCallbacks(c5857b0);
            }
        }
        Context context2 = getContext();
        C5847T c5847t = this.f33607d;
        if (context2 == null) {
            c5847t.mo21407k(EnumC6069n1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C5805T0 c5805t0 = (C5805T0) new C6061m0(C5759D1.empty()).mo21458b(bufferedReader, C5805T0.class);
                if (c5805t0 == null) {
                    c5847t.mo21407k(EnumC6069n1.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (c5805t0.f33406f) {
                    boolean z = c5805t0.f33403c;
                    C5820Y0 c5820y0 = new C5820Y0(Boolean.valueOf(z), c5805t0.f33404d, Boolean.valueOf(c5805t0.f33401a), c5805t0.f33402b);
                    c5905eM21604c.f33827i = c5820y0;
                    if (((Boolean) c5820y0.f33443c).booleanValue() && z) {
                        c5847t.mo21407k(EnumC6069n1.DEBUG, "App start profiling started.", new Object[0]);
                        C5908q c5908q = new C5908q(context2, this.f33608e, new C5893m(context2, c5847t, c5832d), c5847t, c5805t0.f33405e, c5805t0.f33406f, c5805t0.f33407g, new C2460e(4, false));
                        c5905eM21604c.f33826h = c5908q;
                        c5908q.start();
                    } else {
                        c5847t.mo21407k(EnumC6069n1.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
                    }
                } else {
                    c5847t.mo21407k(EnumC6069n1.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                }
                bufferedReader.close();
                return true;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            c5847t.mo21406d(EnumC6069n1.ERROR, "App start profiling config file not found. ", e);
            return true;
        } catch (Throwable th3) {
            c5847t.mo21406d(EnumC6069n1.ERROR, "Error reading app start profiling config file. ", th3);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        synchronized (C5905e.m21604c()) {
            try {
                C5908q c5908q = C5905e.m21604c().f33826h;
                if (c5908q != null) {
                    c5908q.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
