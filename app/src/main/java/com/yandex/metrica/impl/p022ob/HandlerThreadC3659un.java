package com.yandex.metrica.impl.p022ob;

import android.os.HandlerThread;

/* renamed from: com.yandex.metrica.impl.ob.un */
/* loaded from: classes2.dex */
public class HandlerThreadC3659un extends HandlerThread implements InterfaceC3633tn {

    /* renamed from: a */
    private volatile boolean f24971a;

    public HandlerThreadC3659un(String str) {
        super(str);
        this.f24971a = true;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3633tn
    /* renamed from: c */
    public synchronized boolean mo16707c() {
        return this.f24971a;
    }
}
