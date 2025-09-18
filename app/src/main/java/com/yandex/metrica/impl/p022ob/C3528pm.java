package com.yandex.metrica.impl.p022ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.impl.ob.pm */
/* loaded from: classes2.dex */
public class C3528pm extends BroadcastReceiver {

    /* renamed from: a */
    private final InterfaceC2938Sm<Context, Intent> f24515a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f24516b;

    /* renamed from: com.yandex.metrica.impl.ob.pm$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f24517a;

        /* renamed from: b */
        final /* synthetic */ Intent f24518b;

        public a(Context context, Intent intent) {
            this.f24517a = context;
            this.f24518b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3528pm.this.f24515a.mo14454a(this.f24517a, this.f24518b);
        }
    }

    public C3528pm(InterfaceC2938Sm<Context, Intent> interfaceC2938Sm, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f24515a = interfaceC2938Sm;
        this.f24516b = interfaceExecutorC3607sn;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ((C3581rn) this.f24516b).execute(new a(context, intent));
    }
}
