package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes2.dex */
public final class Q {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public Q(NetworkCapabilities networkCapabilities, D d, long j) {
        io.sentry.config.a.D(networkCapabilities, "NetworkCapabilities is required");
        io.sentry.config.a.D(d, "BuildInfoProvider is required");
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength <= -100 ? 0 : signalStrength;
        this.e = networkCapabilities.hasTransport(4);
        String str = networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : null;
        this.f = str == null ? "" : str;
        this.d = j;
    }
}
