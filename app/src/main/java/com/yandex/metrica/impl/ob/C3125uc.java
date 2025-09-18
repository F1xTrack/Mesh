package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3125uc extends Bc<Ec> {
    public C3125uc(InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        super(interfaceExecutorC3086sn);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3205xc
    public void a(Runnable runnable, Object obj) {
        Dc dc = ((Ec) obj).b;
        if (dc != null) {
            a(runnable, dc.a);
        }
    }
}
