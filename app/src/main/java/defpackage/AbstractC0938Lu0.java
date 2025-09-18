package defpackage;

import android.net.ConnectivityManager;

/* renamed from: Lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0938Lu0 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        O90.f(connectivityManager, "<this>");
        O90.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
