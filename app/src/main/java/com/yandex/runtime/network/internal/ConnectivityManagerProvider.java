package com.yandex.runtime.network.internal;

import android.net.ConnectivityManager;
import com.yandex.runtime.Runtime;

/* loaded from: classes2.dex */
public final class ConnectivityManagerProvider {
    public static ConnectivityManager get() {
        return (ConnectivityManager) Runtime.getApplicationContext().getSystemService("connectivity");
    }
}
