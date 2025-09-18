package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.impl.ob.pm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3011pm extends BroadcastReceiver {
    private final Sm<Context, Intent> a;
    private final InterfaceExecutorC3086sn b;

    /* renamed from: com.yandex.metrica.impl.ob.pm$a */
    public class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ Intent b;

        public a(Context context, Intent intent) {
            this.a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3011pm.this.a.a(this.a, this.b);
        }
    }

    public C3011pm(Sm<Context, Intent> sm, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.a = sm;
        this.b = interfaceExecutorC3086sn;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ((C3061rn) this.b).execute(new a(context, intent));
    }
}
