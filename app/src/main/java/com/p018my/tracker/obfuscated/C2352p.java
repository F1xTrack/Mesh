package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.my.tracker.obfuscated.p */
/* loaded from: classes2.dex */
public final class C2352p {

    /* renamed from: a */
    int f20079a = 1;

    /* renamed from: b */
    int f20080b = -1;

    /* renamed from: a */
    public C2348o m13370a(Context context) {
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
        return new C2348o(intExtra, i);
    }
}
