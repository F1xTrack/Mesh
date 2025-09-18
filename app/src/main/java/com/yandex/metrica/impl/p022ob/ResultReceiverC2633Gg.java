package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.Gg */
/* loaded from: classes2.dex */
public class ResultReceiverC2633Gg extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f21315b = 0;

    /* renamed from: a */
    private final InterfaceC2583Eg f21316a;

    public ResultReceiverC2633Gg(Handler handler, InterfaceC2583Eg interfaceC2583Eg) {
        super(handler);
        this.f21316a = interfaceC2583Eg;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        C2608Fg c2608FgM14133a;
        if (i == 1) {
            try {
                c2608FgM14133a = C2608Fg.m14133a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
                c2608FgM14133a = null;
            }
            this.f21316a.mo14002a(c2608FgM14133a);
        }
    }
}
