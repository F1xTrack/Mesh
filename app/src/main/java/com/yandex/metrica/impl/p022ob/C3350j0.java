package com.yandex.metrica.impl.p022ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.yandex.metrica.impl.ob.j0 */
/* loaded from: classes2.dex */
public class C3350j0 {

    /* renamed from: a */
    private final BroadcastReceiver f23671a;

    /* renamed from: b */
    private boolean f23672b = false;

    /* renamed from: com.yandex.metrica.impl.ob.j0$a */
    public static class a {
        /* renamed from: a */
        public C3350j0 m16107a(BroadcastReceiver broadcastReceiver) {
            return new C3350j0(broadcastReceiver);
        }
    }

    public C3350j0(BroadcastReceiver broadcastReceiver) {
        this.f23671a = broadcastReceiver;
    }

    /* renamed from: a */
    public synchronized Intent m16105a(Context context, IntentFilter intentFilter) {
        Intent intentRegisterReceiver;
        try {
            intentRegisterReceiver = context.registerReceiver(this.f23671a, intentFilter);
            try {
                this.f23672b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intentRegisterReceiver = null;
        }
        return intentRegisterReceiver;
    }

    /* renamed from: a */
    public synchronized void m16106a(Context context) {
        if (this.f23672b) {
            try {
                context.unregisterReceiver(this.f23671a);
                this.f23672b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
