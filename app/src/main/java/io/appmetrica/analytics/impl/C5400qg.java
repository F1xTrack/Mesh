package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qg */
/* loaded from: classes2.dex */
public final class C5400qg extends AbstractC5200ig {

    /* renamed from: b */
    public final C5482tn f32464b;

    public C5400qg(C5139g5 c5139g5) {
        this(c5139g5, c5139g5.m20430u());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C5139g5 c5139g5 = this.f31942a;
        if (this.f32464b.m21104c()) {
            return false;
        }
        if (!this.f32464b.m21105d()) {
            C5193i9 c5193i9 = c5139g5.f31736o;
            c5193i9.f31919c.m19892b(C4821T5.m19836a(c4821t5, EnumC4898Wa.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C5482tn c5482tn = this.f32464b;
        synchronized (c5482tn) {
            C5507un c5507un = c5482tn.f32656a;
            c5507un.m21152a(c5507un.m21151a().put("first_event_done", true));
        }
        return false;
    }

    public C5400qg(C5139g5 c5139g5, C5482tn c5482tn) {
        super(c5139g5);
        this.f32464b = c5482tn;
    }
}
