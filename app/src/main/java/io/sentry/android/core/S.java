package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.sentry.C5122f;
import io.sentry.EnumC5148n1;
import io.sentry.InterfaceC5112b1;

/* loaded from: classes2.dex */
public final class S extends ConnectivityManager.NetworkCallback {
    public final io.sentry.E a;
    public final D b;
    public Network c;
    public NetworkCapabilities d;
    public long e;
    public final InterfaceC5112b1 f;

    public S(D d, InterfaceC5112b1 interfaceC5112b1) {
        io.sentry.E e = io.sentry.E.a;
        this.c = null;
        this.d = null;
        this.e = 0L;
        this.a = e;
        io.sentry.config.a.D(d, "BuildInfoProvider is required");
        this.b = d;
        io.sentry.config.a.D(interfaceC5112b1, "SentryDateProvider is required");
        this.f = interfaceC5112b1;
    }

    public static C5122f a(String str) {
        C5122f c5122f = new C5122f();
        c5122f.d = "system";
        c5122f.f = "network.event";
        c5122f.b(str, NotificationConstants.ACTION);
        c5122f.h = EnumC5148n1.INFO;
        return c5122f;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network.equals(this.c)) {
            return;
        }
        this.a.a(a("NETWORK_AVAILABLE"));
        this.c = network;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCapabilitiesChanged(android.net.Network r21, android.net.NetworkCapabilities r22) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.S.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.c)) {
            this.a.a(a("NETWORK_LOST"));
            this.c = null;
            this.d = null;
        }
    }
}
