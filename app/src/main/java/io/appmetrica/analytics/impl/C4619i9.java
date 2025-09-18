package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.i9 */
/* loaded from: classes2.dex */
public final class C4619i9 {
    public final C4743ne a;
    public final tn b;
    public final Uj c;
    public final L6 d;
    public final D8 e;
    public final Mj f;
    public final C4439b0 g;
    public final P8 h;
    public final C4615i5 i;
    public final TimeProvider j;
    public final int k;
    public long l;
    public int m;

    public C4619i9(C4743ne c4743ne, tn tnVar, Uj uj, L6 l6, C4439b0 c4439b0, D8 d8, Mj mj, int i, C4615i5 c4615i5, P8 p8, SystemTimeProvider systemTimeProvider) {
        this.a = c4743ne;
        this.b = tnVar;
        this.c = uj;
        this.d = l6;
        this.g = c4439b0;
        this.e = d8;
        this.f = mj;
        this.k = i;
        this.h = p8;
        this.j = systemTimeProvider;
        this.i = c4615i5;
        this.l = c4743ne.h();
        this.m = c4743ne.g();
    }

    public final void a(T5 t5, Wj wj) {
        Map map = t5.p;
        Mj mj = this.f;
        mj.getClass();
        map.putAll(new HashMap(mj.b));
        t5.c(this.a.i());
        t5.o = Integer.valueOf(this.b.b());
        C4414a0 c4414a0A = this.g.a();
        D8 d8 = this.e;
        d8.getClass();
        C8 c8 = (C8) d8.b.a(Wa.a(t5.d));
        L6 l6 = this.d;
        C4952w8 c4952w8A = c8.a(t5);
        int i = t5.d;
        P8 p8 = this.h;
        C4617i7 c4617i7 = new C4617i7(l6.g, wj, i, p8, c4952w8A, (Eg) l6.h.l.a(), c4414a0A);
        Long lValueOf = Long.valueOf(wj.a);
        Yj yj = wj.d;
        Long lValueOf2 = Long.valueOf(wj.b);
        Wa waA = Wa.a(c4617i7.h.d);
        long jOptLong = 0;
        if (!AbstractC4857s9.g.contains(Wa.a(i))) {
            tn tnVar = p8.b;
            synchronized (tnVar) {
                jOptLong = tnVar.a.a().optLong("global_number", 0L);
            }
            p8.b.b(1 + jOptLong);
        }
        l6.a(l6.l.fromModel(new C4545f7(lValueOf, yj, lValueOf2, waA, Long.valueOf(jOptLong), Long.valueOf(wj.c), c4617i7.a())));
        this.i.a.g();
    }
}
