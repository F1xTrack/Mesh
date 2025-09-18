package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Ic extends Bc<Jc> {
    public Ic(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        super(interfaceExecutorC3086sn);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3205xc
    public void a(Runnable runnable, Object obj) {
        Hc hc = ((Jc) obj).b;
        if (hc != null) {
            a(runnable, hc.b);
        }
    }
}
