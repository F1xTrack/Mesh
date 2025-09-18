package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.wg */
/* loaded from: classes2.dex */
public final class C4960wg extends AbstractC4625ig {
    public C4960wg(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        Gj gjB;
        Wj wj;
        C4619i9 c4619i9 = this.a.o;
        Uj uj = c4619i9.c;
        if (uj.h == 0) {
            gjB = uj.e.b();
            if (gjB != null && gjB.a(t5.i) && (gjB = uj.f.b()) != null && gjB.a(t5.i)) {
                gjB = null;
            }
        } else {
            gjB = uj.g;
        }
        if (gjB != null) {
            wj = new Wj();
            wj.a = gjB.d;
            long andIncrement = gjB.f.getAndIncrement();
            Xj xj = gjB.b;
            xj.a(Xj.g, Long.valueOf(gjB.f.get()));
            xj.b();
            wj.b = andIncrement;
            wj.c = TimeUnit.MILLISECONDS.toSeconds(gjB.j);
            wj.d = gjB.c.a;
        } else {
            long j = t5.j;
            long jA = uj.b.a();
            L6 l6 = uj.a.f;
            Yj yj = Yj.BACKGROUND;
            l6.a(jA, yj, j);
            Wj wj2 = new Wj();
            wj2.a = jA;
            wj2.d = yj;
            wj2.b = 0L;
            wj2.c = 0L;
            wj = wj2;
        }
        c4619i9.a(t5, wj);
        return true;
    }
}
