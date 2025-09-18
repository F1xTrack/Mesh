package io.sentry.android.core.performance;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.C5908q;

/* renamed from: io.sentry.android.core.performance.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5903c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33814a;

    /* renamed from: b */
    public final /* synthetic */ C5905e f33815b;

    /* renamed from: c */
    public final /* synthetic */ Application f33816c;

    public /* synthetic */ RunnableC5903c(C5905e c5905e, Application application, int i) {
        this.f33814a = i;
        this.f33815b = c5905e;
        this.f33816c = application;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33814a) {
            case 0:
                C5905e c5905e = this.f33815b;
                c5905e.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC5903c(c5905e, this.f33816c, 1));
                break;
            default:
                C5905e c5905e2 = this.f33815b;
                Application application = this.f33816c;
                if (c5905e2.f33828j == null) {
                    c5905e2.f33820b = false;
                    C5908q c5908q = c5905e2.f33826h;
                    if (c5908q != null && c5908q.isRunning()) {
                        c5905e2.f33826h.close();
                        c5905e2.f33826h = null;
                    }
                }
                application.unregisterActivityLifecycleCallbacks(C5905e.f33818o);
                break;
        }
    }
}
