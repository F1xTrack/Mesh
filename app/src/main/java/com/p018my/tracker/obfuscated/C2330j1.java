package com.p018my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: com.my.tracker.obfuscated.j1 */
/* loaded from: classes2.dex */
public final class C2330j1 {
    /* renamed from: a */
    private int m13215a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    private String m13216b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
        }
        return null;
    }

    /* renamed from: a */
    public C2326i1 m13217a(Context context) {
        NetworkInfo activeNetworkInfo;
        String strM13216b;
        int iM13215a = -1;
        Boolean bool = null;
        int iM13214a = 0;
        if (AbstractC2346n1.m13340a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    iM13214a = m13214a(connectivityManager);
                } else {
                    activeNetworkInfo = null;
                }
                iM13215a = m13215a(activeNetworkInfo);
                strM13216b = m13216b(activeNetworkInfo);
            } catch (SecurityException unused) {
                AbstractC2391y2.m13568a("NetworkInfoDataProvider: No permissions for access to network state");
            }
        } else {
            strM13216b = null;
        }
        if (!AbstractC2346n1.m13339a() && AbstractC2346n1.m13340a("android.permission.BLUETOOTH", context)) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    bool = defaultAdapter.isEnabled() ? Boolean.TRUE : Boolean.FALSE;
                }
            } catch (SecurityException unused2) {
                AbstractC2391y2.m13568a("NetworkInfoDataProvider: Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
            }
        }
        return new C2326i1(iM13215a, strM13216b, bool, iM13214a);
    }

    /* renamed from: a */
    private int m13214a(ConnectivityManager connectivityManager) {
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4) ? 2 : 1;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
