package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.wg */
/* loaded from: classes2.dex */
public final class C5550wg extends AbstractC5200ig {
    public C5550wg(C5139g5 c5139g5) {
        super(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C4524Gj c4524GjM20400b;
        C4907Wj c4907Wj;
        C5193i9 c5193i9 = this.f31942a.f31736o;
        C4859Uj c4859Uj = c5193i9.f31919c;
        if (c4859Uj.f30832h == 0) {
            c4524GjM20400b = c4859Uj.f30829e.m20400b();
            if (c4524GjM20400b != null && c4524GjM20400b.m19453a(c4821t5.f30769i) && (c4524GjM20400b = c4859Uj.f30830f.m20400b()) != null && c4524GjM20400b.m19453a(c4821t5.f30769i)) {
                c4524GjM20400b = null;
            }
        } else {
            c4524GjM20400b = c4859Uj.f30831g;
        }
        if (c4524GjM20400b != null) {
            c4907Wj = new C4907Wj();
            c4907Wj.f30989a = c4524GjM20400b.f30192d;
            long andIncrement = c4524GjM20400b.f30194f.getAndIncrement();
            C4931Xj c4931Xj = c4524GjM20400b.f30190b;
            c4931Xj.m19986a(C4931Xj.f31057g, Long.valueOf(c4524GjM20400b.f30194f.get()));
            c4931Xj.m19988b();
            c4907Wj.f30990b = andIncrement;
            c4907Wj.f30991c = TimeUnit.MILLISECONDS.toSeconds(c4524GjM20400b.f30198j);
            c4907Wj.f30992d = c4524GjM20400b.f30191c.f30367a;
        } else {
            long j = c4821t5.f30770j;
            long jM19879a = c4859Uj.f30826b.m19879a();
            C4631L6 c4631l6 = c4859Uj.f30825a.f31727f;
            EnumC4955Yj enumC4955Yj = EnumC4955Yj.BACKGROUND;
            c4631l6.m19587a(jM19879a, enumC4955Yj, j);
            C4907Wj c4907Wj2 = new C4907Wj();
            c4907Wj2.f30989a = jM19879a;
            c4907Wj2.f30992d = enumC4955Yj;
            c4907Wj2.f30990b = 0L;
            c4907Wj2.f30991c = 0L;
            c4907Wj = c4907Wj2;
        }
        c5193i9.m20572a(c4821t5, c4907Wj);
        return true;
    }
}
