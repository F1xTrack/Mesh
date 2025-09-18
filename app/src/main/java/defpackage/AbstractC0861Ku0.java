package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: Ku0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0861Ku0 {
    public static final Network a(ConnectivityManager connectivityManager) {
        O90.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
