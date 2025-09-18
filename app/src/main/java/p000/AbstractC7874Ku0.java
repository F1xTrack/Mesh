package p000;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: Ku0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7874Ku0 {
    /* renamed from: a */
    public static final Network m4777a(ConnectivityManager connectivityManager) {
        O90.m5968f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
