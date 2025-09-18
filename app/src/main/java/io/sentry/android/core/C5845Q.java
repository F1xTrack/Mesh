package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.config.AbstractC6003a;

/* renamed from: io.sentry.android.core.Q */
/* loaded from: classes2.dex */
public final class C5845Q {

    /* renamed from: a */
    public final int f33580a;

    /* renamed from: b */
    public final int f33581b;

    /* renamed from: c */
    public final int f33582c;

    /* renamed from: d */
    public final long f33583d;

    /* renamed from: e */
    public final boolean f33584e;

    /* renamed from: f */
    public final String f33585f;

    public C5845Q(NetworkCapabilities networkCapabilities, C5832D c5832d, long j) {
        AbstractC6003a.m21735D(networkCapabilities, "NetworkCapabilities is required");
        AbstractC6003a.m21735D(c5832d, "BuildInfoProvider is required");
        this.f33580a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f33581b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f33582c = signalStrength <= -100 ? 0 : signalStrength;
        this.f33584e = networkCapabilities.hasTransport(4);
        String str = networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : null;
        this.f33585f = str == null ? "" : str;
        this.f33583d = j;
    }
}
