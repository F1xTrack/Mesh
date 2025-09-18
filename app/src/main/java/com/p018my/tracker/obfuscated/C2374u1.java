package com.p018my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: com.my.tracker.obfuscated.u1 */
/* loaded from: classes2.dex */
public final class C2374u1 {

    /* renamed from: com.my.tracker.obfuscated.u1$a */
    public static class a extends BroadcastReceiver {

        /* renamed from: a */
        final InterfaceC2368t f20133a;

        public a(InterfaceC2368t interfaceC2368t) {
            this.f20133a = interfaceC2368t;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("payload");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    AbstractC2391y2.m13568a("RuStoreRemoteConfigHandler: received: action=" + intent.getAction() + ", payload=" + stringExtra);
                    this.f20133a.mo7467a(stringExtra);
                } catch (Exception e) {
                    AbstractC2391y2.m13568a("RuStoreRemoteConfigHandler: error " + e);
                }
            }
        }
    }

    private C2374u1() {
    }

    /* renamed from: a */
    public void m13515a(Context context, InterfaceC2368t interfaceC2368t) {
        a aVar = new a(interfaceC2368t);
        IntentFilter intentFilter = new IntentFilter("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 4);
        }
    }

    /* renamed from: a */
    public static C2374u1 m13514a() {
        return new C2374u1();
    }
}
