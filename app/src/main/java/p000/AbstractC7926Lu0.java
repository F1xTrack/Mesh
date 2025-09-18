package p000;

import android.net.ConnectivityManager;

/* renamed from: Lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7926Lu0 {
    /* renamed from: a */
    public static final void m5134a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        O90.m5968f(connectivityManager, "<this>");
        O90.m5968f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
