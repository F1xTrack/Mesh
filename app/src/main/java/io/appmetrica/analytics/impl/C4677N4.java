package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.N4 */
/* loaded from: classes2.dex */
public final class C4677N4 {

    /* renamed from: a */
    public final C5620zb f30503a;

    public C4677N4() {
        this(C5244ka.m20614h().m20624i());
    }

    /* renamed from: a */
    public static C4796S4 m19652a(C4629L4 c4629l4) {
        return new C4796S4(new C4749Q4(c4629l4), c4629l4);
    }

    public C4677N4(C5620zb c5620zb) {
        this.f30503a = c5620zb;
    }

    /* renamed from: a */
    public final C5206im m19653a(C4629L4 c4629l4, C4428Cl c4428Cl) {
        C5206im c5206im = new C5206im(c4629l4, new C4975Zf(c4428Cl));
        C5620zb c5620zb = this.f30503a;
        synchronized (c5620zb) {
            c5620zb.f32919c.add(c5206im);
        }
        return c5206im;
    }
}
