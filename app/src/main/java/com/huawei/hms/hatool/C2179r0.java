package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.hatool.r0 */
/* loaded from: classes.dex */
public class C2179r0 {

    /* renamed from: a */
    private static final int[] f19278a = {1, 6, 7, 9};

    /* renamed from: b */
    private static final int[] f19279b = {0, 2, 3, 4, 5};

    /* renamed from: c */
    private static final Map<Integer, String> f19280c = new a();

    /* renamed from: com.huawei.hms.hatool.r0$a */
    public static class a extends HashMap<Integer, String> {
        public a() {
            put(1, "2G");
            put(2, "2G");
            put(4, "2G");
            put(7, "2G");
            put(11, "2G");
            put(3, "3G");
            put(8, "3G");
            put(9, "3G");
            put(10, "3G");
            put(15, "3G");
            put(5, "3G");
            put(6, "3G");
            put(12, "3G");
            put(14, "3G");
            put(13, "4G");
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    private static NetworkInfo m12206a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            C2186v.m12268b("hmsSdk", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m12209b(Context context) {
        NetworkInfo networkInfoM12206a;
        if (context == null) {
            return "unknown";
        }
        try {
            networkInfoM12206a = m12206a(context);
        } catch (Throwable unused) {
        }
        if (!m12210b(networkInfoM12206a)) {
            return LocalNotification.Importance.NONE;
        }
        if (m12211c(networkInfoM12206a)) {
            return "WIFI";
        }
        if (m12208a(networkInfoM12206a)) {
            return m12207a(networkInfoM12206a.getSubtype());
        }
        return "unknown";
    }

    /* renamed from: c */
    private static boolean m12211c(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f19278a, networkInfo.getType()) == -1) ? false : true;
    }

    /* renamed from: a */
    private static String m12207a(int i) {
        Map<Integer, String> map = f19280c;
        String str = map.containsKey(Integer.valueOf(i)) ? map.get(Integer.valueOf(i)) : "unknown";
        return (!"unknown".equals(str) || Build.VERSION.SDK_INT < 25) ? str : i != 16 ? i != 17 ? "unknown" : "3G" : "2G";
    }

    /* renamed from: b */
    private static boolean m12210b(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: a */
    private static boolean m12208a(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f19279b, networkInfo.getType()) == -1) ? false : true;
    }
}
