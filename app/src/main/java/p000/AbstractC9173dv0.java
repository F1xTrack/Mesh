package p000;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: dv0 */
/* loaded from: classes.dex */
public abstract class AbstractC9173dv0 {

    /* renamed from: a */
    public static final /* synthetic */ int f26389a = 0;

    static {
        O90.m5967e(C1210TE.m7637M("NetworkStateTracker"), "tagWithPrefix(\"NetworkStateTracker\")");
    }

    /* renamed from: a */
    public static final C8912bv0 m17776a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesM4463a;
        O90.m5968f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesM4463a = AbstractC7822Ju0.m4463a(connectivityManager, AbstractC7874Ku0.m4777a(connectivityManager));
        } catch (SecurityException unused) {
            C1210TE.m7634G().getClass();
        }
        boolean zM4464b = networkCapabilitiesM4463a != null ? AbstractC7822Ju0.m4464b(networkCapabilitiesM4463a, 16) : false;
        return new C8912bv0(z, zM4464b, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
