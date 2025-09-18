package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: Ju0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7822Ju0 {
    /* renamed from: a */
    public static final NetworkCapabilities m4463a(ConnectivityManager connectivityManager, Network network) {
        O90.m5968f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final boolean m4464b(NetworkCapabilities networkCapabilities, int i) {
        O90.m5968f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    /* renamed from: c */
    public static final void m4465c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        O90.m5968f(connectivityManager, "<this>");
        O90.m5968f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
