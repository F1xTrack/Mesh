package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: dv0 */
/* loaded from: classes.dex */
public abstract class AbstractC3480dv0 {
    public static final /* synthetic */ int a = 0;

    static {
        O90.e(TE.M("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    public static final C2415bv0 a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        O90.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = AbstractC0783Ju0.a(connectivityManager, AbstractC0861Ku0.a(connectivityManager));
        } catch (SecurityException unused) {
            TE.G().getClass();
        }
        boolean zB = networkCapabilitiesA != null ? AbstractC0783Ju0.b(networkCapabilitiesA, 16) : false;
        return new C2415bv0(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
