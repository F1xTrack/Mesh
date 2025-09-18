package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import io.sentry.C5759D1;
import io.sentry.C5820Y0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import p000.C1686an;

/* renamed from: io.sentry.android.core.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5854a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33637a;

    /* renamed from: b */
    public final /* synthetic */ Object f33638b;

    public /* synthetic */ RunnableC5854a(int i, Object obj) {
        this.f33637a = i;
        this.f33638b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33637a) {
            case 0:
                C5856b c5856b = (C5856b) this.f33638b;
                c5856b.getClass();
                c5856b.f33648h = SystemClock.uptimeMillis();
                c5856b.f33649i.set(false);
                return;
            case 1:
                ((C5863e) this.f33638b).f33670a.f16089a.mo2455n();
                return;
            case 2:
                ((C5900p) this.f33638b).m21601a(null, true);
                return;
            case 3:
                AbstractC5911t.m21623d((C5759D1) this.f33638b);
                return;
            default:
                NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.f33638b;
                synchronized (networkBreadcrumbsIntegration.f33570d) {
                    try {
                        if (networkBreadcrumbsIntegration.f33573g != null) {
                            Context context = networkBreadcrumbsIntegration.f33567a;
                            ILogger iLogger = networkBreadcrumbsIntegration.f33569c;
                            C5832D c5832d = networkBreadcrumbsIntegration.f33568b;
                            C5846S c5846s = networkBreadcrumbsIntegration.f33573g;
                            c5832d.getClass();
                            ConnectivityManager connectivityManagerM21477o = C5820Y0.m21477o(context, iLogger);
                            if (connectivityManagerM21477o != null) {
                                try {
                                    connectivityManagerM21477o.unregisterNetworkCallback(c5846s);
                                } catch (Throwable th) {
                                    iLogger.mo21406d(EnumC6069n1.WARNING, "unregisterNetworkCallback failed", th);
                                }
                            }
                            networkBreadcrumbsIntegration.f33569c.mo21407k(EnumC6069n1.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
                        }
                        networkBreadcrumbsIntegration.f33573g = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC5854a(C5856b c5856b, C1686an c1686an) {
        this.f33637a = 0;
        this.f33638b = c5856b;
    }
}
