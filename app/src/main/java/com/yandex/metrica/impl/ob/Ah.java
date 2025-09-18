package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Qd;
import java.util.List;

/* loaded from: classes2.dex */
class Ah implements Qd.a {
    final /* synthetic */ Eh a;
    final /* synthetic */ C3235yh b;
    final /* synthetic */ C3260zh c;

    public Ah(C3260zh c3260zh, Eh eh, C3235yh c3235yh) {
        this.c = c3260zh;
        this.a = eh;
        this.b = c3235yh;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a(String str, byte[] bArr) {
        List<Hh> listA = this.c.c.a(this.c.d.a(bArr, "af9202nao18gswqp"));
        C3235yh c3235yh = this.b;
        this.c.f.getClass();
        c3235yh.a(new Eh(listA, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public String b() {
        return this.a.b;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void c() {
        this.b.a();
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a() {
        C3235yh c3235yh = this.b;
        Eh eh = this.a;
        List<Hh> list = eh.a;
        String str = eh.b;
        this.c.f.getClass();
        c3235yh.a(new Eh(list, str, System.currentTimeMillis(), true, false));
    }
}
