package com.android.billingclient.api;

import android.content.Context;

/* loaded from: classes.dex */
final class zzdi {
    private static boolean zza = false;

    public static synchronized boolean zza(Context context) {
        if (zza) {
            return false;
        }
        zza = true;
        return false;
    }
}
