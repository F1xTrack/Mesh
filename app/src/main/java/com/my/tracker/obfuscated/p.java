package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public final class p {
    int a = 1;
    int b = -1;

    public o a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", 1);
        int i = -1;
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i = (intExtra2 * 100) / intExtra3;
        }
        return new o(intExtra, i);
    }
}
