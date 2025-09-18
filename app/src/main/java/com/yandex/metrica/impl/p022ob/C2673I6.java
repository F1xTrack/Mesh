package com.yandex.metrica.impl.p022ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.I6 */
/* loaded from: classes2.dex */
public class C2673I6 {

    /* renamed from: a */
    private final C2514Bm f21402a;

    /* renamed from: b */
    private final C2723K6 f21403b;

    public C2673I6() {
        this(new C2514Bm(), new C2723K6());
    }

    /* renamed from: a */
    public Long m14281a(List<C2804Nc> list) {
        if (C2968U2.m15249b(list)) {
            return null;
        }
        this.f21403b.getClass();
        C2804Nc c2804Nc = list.get(Math.min(1, list.size()) - 1);
        long jM13938a = c2804Nc.f21772a;
        long j = c2804Nc.f21773b;
        if (jM13938a != j) {
            jM13938a = this.f21402a.m13938a(jM13938a, j);
        }
        return Long.valueOf(jM13938a);
    }

    public C2673I6(C2514Bm c2514Bm, C2723K6 c2723k6) {
        this.f21402a = c2514Bm;
        this.f21403b = c2723k6;
    }
}
