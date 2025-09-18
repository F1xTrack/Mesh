package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: gJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3938gJ {
    public static final C7533v4 c = C7533v4.d();
    public static C3938gJ d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public C3938gJ(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            MU.d();
            MU muD = MU.d();
            muD.a();
            return muD.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized C3938gJ b() {
        try {
            if (d == null) {
                d = new C3938gJ(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new RunnableC3529eA(this, 15, context));
        }
    }

    public final void d(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.a.edit().remove(str).apply();
        } else {
            this.a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
