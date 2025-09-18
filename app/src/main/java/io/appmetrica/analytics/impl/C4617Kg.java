package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Kg */
/* loaded from: classes2.dex */
public final class C4617Kg extends AbstractC5200ig {
    public C4617Kg(C5139g5 c5139g5) {
        super(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        this.f31942a.f31738q.m20860b();
        C4859Uj c4859Uj = this.f31942a.f31732k;
        synchronized (c4859Uj) {
            try {
                C4524Gj c4524GjM19892b = c4859Uj.m19892b(c4821t5);
                if (c4524GjM19892b.f30195g) {
                    c4524GjM19892b.f30195g = false;
                    C4931Xj c4931Xj = c4524GjM19892b.f30190b;
                    c4931Xj.m19986a(C4931Xj.f31059i, Boolean.FALSE);
                    c4931Xj.m19988b();
                }
                if (c4859Uj.f30832h != 1) {
                    c4859Uj.m19891a(c4859Uj.f30831g, c4821t5);
                }
                c4859Uj.f30832h = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
