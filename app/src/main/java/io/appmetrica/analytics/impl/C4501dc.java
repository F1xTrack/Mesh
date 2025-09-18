package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4501dc implements Bf {
    public final /* synthetic */ C4526ec a;

    public C4501dc(C4526ec c4526ec) {
        this.a = c4526ec;
    }

    @Override // io.appmetrica.analytics.impl.Bf
    public final void a(Ef ef) {
        if (ef == null) {
            return;
        }
        T5 t5 = new T5("", "", 0);
        t5.setValueBytes(ef.a());
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 4097;
        this.a.a(t5);
    }
}
