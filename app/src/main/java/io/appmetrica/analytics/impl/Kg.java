package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Kg extends AbstractC4625ig {
    public Kg(C4567g5 c4567g5) {
        super(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        this.a.q.b();
        Uj uj = this.a.k;
        synchronized (uj) {
            try {
                Gj gjB = uj.b(t5);
                if (gjB.g) {
                    gjB.g = false;
                    Xj xj = gjB.b;
                    xj.a(Xj.i, Boolean.FALSE);
                    xj.b();
                }
                if (uj.h != 1) {
                    uj.a(uj.g, t5);
                }
                uj.h = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
