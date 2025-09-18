package io.sentry.android.core.performance;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.C5100q;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Application c;

    public /* synthetic */ c(e eVar, Application application, int i) {
        this.a = i;
        this.b = eVar;
        this.c = application;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                eVar.getClass();
                new Handler(Looper.getMainLooper()).post(new c(eVar, this.c, 1));
                break;
            default:
                e eVar2 = this.b;
                Application application = this.c;
                if (eVar2.j == null) {
                    eVar2.b = false;
                    C5100q c5100q = eVar2.h;
                    if (c5100q != null && c5100q.isRunning()) {
                        eVar2.h.close();
                        eVar2.h = null;
                    }
                }
                application.unregisterActivityLifecycleCallbacks(e.o);
                break;
        }
    }
}
