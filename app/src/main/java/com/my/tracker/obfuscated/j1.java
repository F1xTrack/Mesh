package com.my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public final class j1 {
    private int a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 3;
        }
        return 2;
    }

    private String b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
        }
        return null;
    }

    public i1 a(Context context) {
        NetworkInfo activeNetworkInfo;
        String strB;
        int iA = -1;
        Boolean bool = null;
        int iA2 = 0;
        if (n1.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    iA2 = a(connectivityManager);
                } else {
                    activeNetworkInfo = null;
                }
                iA = a(activeNetworkInfo);
                strB = b(activeNetworkInfo);
            } catch (SecurityException unused) {
                y2.a("NetworkInfoDataProvider: No permissions for access to network state");
            }
        } else {
            strB = null;
        }
        if (!n1.a() && n1.a("android.permission.BLUETOOTH", context)) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    bool = defaultAdapter.isEnabled() ? Boolean.TRUE : Boolean.FALSE;
                }
            } catch (SecurityException unused2) {
                y2.a("NetworkInfoDataProvider: Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
            }
        }
        return new i1(iA, strB, bool, iA2);
    }

    private int a(ConnectivityManager connectivityManager) {
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
