package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: Ju0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0783Ju0 {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        O90.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i) {
        O90.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        O90.f(connectivityManager, "<this>");
        O90.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
