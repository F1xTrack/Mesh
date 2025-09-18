package com.my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public final class u1 {

    public static class a extends BroadcastReceiver {
        final t a;

        public a(t tVar) {
            this.a = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("payload");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    y2.a("RuStoreRemoteConfigHandler: received: action=" + intent.getAction() + ", payload=" + stringExtra);
                    this.a.a(stringExtra);
                } catch (Exception e) {
                    y2.a("RuStoreRemoteConfigHandler: error " + e);
                }
            }
        }
    }

    private u1() {
    }

    public void a(Context context, t tVar) {
        a aVar = new a(tVar);
        IntentFilter intentFilter = new IntentFilter("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 4);
        }
    }

    public static u1 a() {
        return new u1();
    }
}
