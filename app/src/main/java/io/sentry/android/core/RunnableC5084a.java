package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import defpackage.C2199an;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.Y0;

/* renamed from: io.sentry.android.core.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5084a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC5084a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C5085b c5085b = (C5085b) this.b;
                c5085b.getClass();
                c5085b.h = SystemClock.uptimeMillis();
                c5085b.i.set(false);
                return;
            case 1:
                ((C5088e) this.b).a.a.n();
                return;
            case 2:
                ((C5099p) this.b).a(null, true);
                return;
            case 3:
                AbstractC5102t.d((D1) this.b);
                return;
            default:
                NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.b;
                synchronized (networkBreadcrumbsIntegration.d) {
                    try {
                        if (networkBreadcrumbsIntegration.g != null) {
                            Context context = networkBreadcrumbsIntegration.a;
                            ILogger iLogger = networkBreadcrumbsIntegration.c;
                            D d = networkBreadcrumbsIntegration.b;
                            S s = networkBreadcrumbsIntegration.g;
                            d.getClass();
                            ConnectivityManager connectivityManagerO = Y0.o(context, iLogger);
                            if (connectivityManagerO != null) {
                                try {
                                    connectivityManagerO.unregisterNetworkCallback(s);
                                } catch (Throwable th) {
                                    iLogger.d(EnumC5148n1.WARNING, "unregisterNetworkCallback failed", th);
                                }
                            }
                            networkBreadcrumbsIntegration.c.k(EnumC5148n1.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
                        }
                        networkBreadcrumbsIntegration.g = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC5084a(C5085b c5085b, C2199an c2199an) {
        this.a = 0;
        this.b = c5085b;
    }
}
