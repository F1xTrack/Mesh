package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;

/* renamed from: com.yandex.metrica.impl.ob.un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class HandlerThreadC3136un extends HandlerThread implements InterfaceC3111tn {
    private volatile boolean a;

    public HandlerThreadC3136un(String str) {
        super(str);
        this.a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3111tn
    public synchronized boolean c() {
        return this.a;
    }
}
