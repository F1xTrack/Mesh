package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3235yh {
    private Q9 a;
    private Eh b;
    private Nm c;
    private Gh d;
    private a e;

    /* renamed from: com.yandex.metrica.impl.ob.yh$a */
    public interface a {
    }

    public C3235yh(Q9 q9, a aVar) {
        this(q9, aVar, new Nm(), new Gh(q9));
    }

    public void a(Eh eh) {
        this.a.a(eh);
        this.b = eh;
        this.d.a();
        Bh bh = (Bh) this.e;
        bh.a.b();
        bh.a.h = false;
    }

    public C3235yh(Q9 q9, a aVar, Nm nm, Gh gh) {
        this.a = q9;
        this.b = (Eh) q9.b();
        this.c = nm;
        this.d = gh;
        this.e = aVar;
    }

    public void a() {
        Eh eh = this.b;
        List<Hh> list = eh.a;
        String str = eh.b;
        this.c.getClass();
        Eh eh2 = new Eh(list, str, System.currentTimeMillis(), true, true);
        this.a.a(eh2);
        this.b = eh2;
        Bh bh = (Bh) this.e;
        bh.a.b();
        bh.a.h = false;
    }
}
