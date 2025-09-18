package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import io.sentry.C5820Y0;
import io.sentry.InterfaceC5766G;

/* renamed from: io.sentry.android.core.internal.util.a */
/* loaded from: classes2.dex */
public final class C5881a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5766G f33748a;

    /* renamed from: b */
    public final /* synthetic */ C5820Y0 f33749b;

    public C5881a(C5820Y0 c5820y0, InterfaceC5766G interfaceC5766G) {
        this.f33749b = c5820y0;
        this.f33748a = interfaceC5766G;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f33748a.mo21386c(this.f33749b.mo21389b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        this.f33748a.mo21386c(this.f33749b.mo21389b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f33748a.mo21386c(this.f33749b.mo21389b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f33748a.mo21386c(this.f33749b.mo21389b());
    }
}
