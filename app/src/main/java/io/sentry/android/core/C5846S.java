package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5981b1;
import io.sentry.config.AbstractC6003a;

/* renamed from: io.sentry.android.core.S */
/* loaded from: classes2.dex */
public final class C5846S extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final C5760E f33586a;

    /* renamed from: b */
    public final C5832D f33587b;

    /* renamed from: c */
    public Network f33588c;

    /* renamed from: d */
    public NetworkCapabilities f33589d;

    /* renamed from: e */
    public long f33590e;

    /* renamed from: f */
    public final InterfaceC5981b1 f33591f;

    public C5846S(C5832D c5832d, InterfaceC5981b1 interfaceC5981b1) {
        C5760E c5760e = C5760E.f33234a;
        this.f33588c = null;
        this.f33589d = null;
        this.f33590e = 0L;
        this.f33586a = c5760e;
        AbstractC6003a.m21735D(c5832d, "BuildInfoProvider is required");
        this.f33587b = c5832d;
        AbstractC6003a.m21735D(interfaceC5981b1, "SentryDateProvider is required");
        this.f33591f = interfaceC5981b1;
    }

    /* renamed from: a */
    public static C6017f m21540a(String str) {
        C6017f c6017f = new C6017f();
        c6017f.f34146d = "system";
        c6017f.f34148f = "network.event";
        c6017f.m21778b(str, NotificationConstants.ACTION);
        c6017f.f34150h = EnumC6069n1.INFO;
        return c6017f;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network.equals(this.f33588c)) {
            return;
        }
        this.f33586a.m21384a(m21540a("NETWORK_AVAILABLE"));
        this.f33588c = network;
        this.f33589d = null;
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
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5846S.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.f33588c)) {
            this.f33586a.m21384a(m21540a("NETWORK_LOST"));
            this.f33588c = null;
            this.f33589d = null;
        }
    }
}
