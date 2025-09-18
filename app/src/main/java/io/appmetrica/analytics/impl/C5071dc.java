package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dc */
/* loaded from: classes2.dex */
public final class C5071dc implements InterfaceC4397Bf {

    /* renamed from: a */
    public final /* synthetic */ C5096ec f31480a;

    public C5071dc(C5096ec c5096ec) {
        this.f31480a = c5096ec;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4397Bf
    /* renamed from: a */
    public final void mo19236a(C4472Ef c4472Ef) {
        if (c4472Ef == null) {
            return;
        }
        C4821T5 c4821t5 = new C4821T5("", "", 0);
        c4821t5.setValueBytes(c4472Ef.m19359a());
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 4097;
        this.f31480a.mo19635a(c4821t5);
    }
}
