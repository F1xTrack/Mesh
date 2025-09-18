package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Vm */
/* loaded from: classes2.dex */
public final class C4886Vm extends AbstractC4701O4 {

    /* renamed from: b */
    public final C4463E6 f30876b;

    public C4886Vm(C4629L4 c4629l4, C4463E6 c4463e6) {
        super(c4629l4);
        this.f30876b = c4463e6;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4701O4
    /* renamed from: a */
    public final boolean mo19681a(C4821T5 c4821t5, C4557I4 c4557i4) {
        C4411C4 c4411c4 = c4557i4.f30270b.f30421d.f30787a;
        this.f30876b.m19338a(c4411c4.f29946i);
        Boolean bool = c4411c4.f29939b;
        if (Boolean.TRUE.equals(bool)) {
            C5244ka.f32038C.m20625j().mo19324a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            C5244ka.f32038C.m20625j().mo19324a(false);
        }
        return false;
    }
}
