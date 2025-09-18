package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.I4 */
/* loaded from: classes2.dex */
public final class C4557I4 implements InterfaceC5463t4 {

    /* renamed from: a */
    public final Context f30269a;

    /* renamed from: b */
    public final C4629L4 f30270b;

    /* renamed from: c */
    public final ResultReceiver f30271c;

    public C4557I4(Context context, C4629L4 c4629l4, C4436D4 c4436d4) {
        this.f30269a = context;
        this.f30270b = c4629l4;
        this.f30271c = c4436d4.f29995c;
        c4629l4.m19570a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5463t4
    /* renamed from: a */
    public final void mo19487a(C4821T5 c4821t5, C4436D4 c4436d4) {
        this.f30270b.mo19228a(c4436d4.f29994b);
        this.f30270b.m19572a(c4821t5, this);
    }

    /* renamed from: b */
    public final C4629L4 m19489b() {
        return this.f30270b;
    }

    /* renamed from: c */
    public final Context m19490c() {
        return this.f30269a;
    }

    /* renamed from: d */
    public final ResultReceiver m19491d() {
        return this.f30271c;
    }

    /* renamed from: a */
    public final void m19488a(C5163h4 c5163h4) {
        ResultReceiverC4388B6.m19226a(this.f30271c, c5163h4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5463t4
    /* renamed from: a */
    public final void mo19486a() {
        this.f30270b.m19575b(this);
    }
}
