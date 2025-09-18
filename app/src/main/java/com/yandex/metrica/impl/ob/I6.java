package com.yandex.metrica.impl.ob;

import java.util.List;

/* loaded from: classes2.dex */
public class I6 {
    private final Bm a;
    private final K6 b;

    public I6() {
        this(new Bm(), new K6());
    }

    public Long a(List<Nc> list) {
        if (U2.b(list)) {
            return null;
        }
        this.b.getClass();
        Nc nc = list.get(Math.min(1, list.size()) - 1);
        long jA = nc.a;
        long j = nc.b;
        if (jA != j) {
            jA = this.a.a(jA, j);
        }
        return Long.valueOf(jA);
    }

    public I6(Bm bm, K6 k6) {
        this.a = bm;
        this.b = k6;
    }
}
