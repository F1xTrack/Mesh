package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class Ua implements InterfaceC2676cb {
    private final Hm a;

    public Ua(Hm hm) {
        this.a = hm;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
    public long a(D9 d9) {
        return d9.a(new C3232ye(AbstractC8235ym.v("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_", ((Dm) this.a).b()), null).a(), Long.MAX_VALUE);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2676cb
    public void a(D9 d9, long j) {
    }
}
