package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: gJ */
/* loaded from: classes.dex */
public final class C4108gJ {

    /* renamed from: c */
    public static final C6989v4 f27664c = C6989v4.m25319d();

    /* renamed from: d */
    public static C4108gJ f27665d;

    /* renamed from: a */
    public volatile SharedPreferences f27666a;

    /* renamed from: b */
    public final ExecutorService f27667b;

    public C4108gJ(ExecutorService executorService) {
        this.f27667b = executorService;
    }

    /* renamed from: a */
    public static Context m18418a() {
        try {
            C0786MU.m5375d();
            C0786MU c0786muM5375d = C0786MU.m5375d();
            c0786muM5375d.m5379a();
            return c0786muM5375d.f7174a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C4108gJ m18419b() {
        try {
            if (f27665d == null) {
                f27665d = new C4108gJ(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27665d;
    }

    /* renamed from: c */
    public final synchronized void m18420c(Context context) {
        if (this.f27666a == null && context != null) {
            this.f27667b.execute(new RunnableC3973eA(this, 15, context));
        }
    }

    /* renamed from: d */
    public final void m18421d(long j, String str) {
        if (this.f27666a == null) {
            m18420c(m18418a());
            if (this.f27666a == null) {
                return;
            }
        }
        this.f27666a.edit().putLong(str, j).apply();
    }

    /* renamed from: e */
    public final void m18422e(String str, double d) {
        if (this.f27666a == null) {
            m18420c(m18418a());
            if (this.f27666a == null) {
                return;
            }
        }
        this.f27666a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
    }

    /* renamed from: f */
    public final void m18423f(String str, String str2) {
        if (this.f27666a == null) {
            m18420c(m18418a());
            if (this.f27666a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f27666a.edit().remove(str).apply();
        } else {
            this.f27666a.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: g */
    public final void m18424g(String str, boolean z) {
        if (this.f27666a == null) {
            m18420c(m18418a());
            if (this.f27666a == null) {
                return;
            }
        }
        this.f27666a.edit().putBoolean(str, z).apply();
    }
}
