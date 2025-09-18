package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import io.sentry.G;
import io.sentry.Y0;

/* loaded from: classes2.dex */
public final class a extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ G a;
    public final /* synthetic */ Y0 b;

    public a(Y0 y0, G g) {
        this.b = y0;
        this.a = g;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.c(this.b.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        this.a.c(this.b.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.c(this.b.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.c(this.b.b());
    }
}
