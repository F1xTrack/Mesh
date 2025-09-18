package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Rl {
    public final HashMap a;

    public Rl() {
        HashMap map = new HashMap();
        this.a = map;
        Ll ll = new Ll();
        Ml ml = new Ml();
        Nl nl = new Nl();
        Ol ol = new Ol();
        Pl pl = new Pl();
        map.put(C4678kl.class, ll);
        map.put(U1.class, ml);
        map.put(C4910ue.class, nl);
        map.put(C4826r2.class, ol);
        map.put(J3.class, pl);
    }

    public static Sl a(Class cls) {
        return (Sl) Ql.a.a.get(cls);
    }
}
