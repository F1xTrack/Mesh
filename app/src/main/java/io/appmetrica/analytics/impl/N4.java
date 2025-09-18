package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class N4 {
    public final C5027zb a;

    public N4() {
        this(C4667ka.h().i());
    }

    public static S4 a(L4 l4) {
        return new S4(new Q4(l4), l4);
    }

    public N4(C5027zb c5027zb) {
        this.a = c5027zb;
    }

    public final C4631im a(L4 l4, Cl cl2) {
        C4631im c4631im = new C4631im(l4, new Zf(cl2));
        C5027zb c5027zb = this.a;
        synchronized (c5027zb) {
            c5027zb.c.add(c4631im);
        }
        return c4631im;
    }
}
