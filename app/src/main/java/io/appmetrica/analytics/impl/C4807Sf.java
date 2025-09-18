package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.Sf */
/* loaded from: classes2.dex */
public final class C4807Sf implements InterfaceC4788Rk, InterfaceC4442Da {

    /* renamed from: a */
    public final Context f30737a;

    /* renamed from: b */
    public final C4964Z4 f30738b;

    /* renamed from: c */
    public final C4989a5 f30739c;

    /* renamed from: d */
    public final C4428Cl f30740d;

    /* renamed from: e */
    public final InterfaceC4659Ma f30741e;

    public C4807Sf(Context context, C4964Z4 c4964z4, C4436D4 c4436d4, InterfaceC5164h5 interfaceC5164h5, C4989a5 c4989a5, C4573Ik c4573Ik) {
        this.f30737a = context;
        this.f30738b = c4964z4;
        this.f30739c = c4989a5;
        C4428Cl c4428ClM19517a = c4573Ik.m19517a(context, c4964z4, c4436d4.f29993a);
        this.f30740d = c4428ClM19517a;
        this.f30741e = interfaceC5164h5.mo19952a(context, c4964z4, c4436d4.f29994b, c4428ClM19517a);
        c4573Ik.m19518a(c4964z4, this);
    }

    /* renamed from: a */
    public final C4964Z4 m19812a() {
        return this.f30738b;
    }

    /* renamed from: b */
    public final Context m19815b() {
        return this.f30737a;
    }

    /* renamed from: a */
    public final void m19814a(InterfaceC5463t4 interfaceC5463t4) {
        this.f30739c.f31241a.add(interfaceC5463t4);
    }

    /* renamed from: b */
    public final void m19816b(InterfaceC5463t4 interfaceC5463t4) {
        this.f30739c.f31241a.remove(interfaceC5463t4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19574a(C5155gl c5155gl) {
        this.f30741e.mo19574a(c5155gl);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4788Rk
    /* renamed from: a */
    public final void mo19571a(EnumC4621Kk enumC4621Kk, C5155gl c5155gl) {
        ((C5139g5) this.f30741e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4442Da
    /* renamed from: a */
    public final void mo19322a(C4436D4 c4436d4) {
        this.f30740d.m19291a(c4436d4.f29993a);
        this.f30741e.mo19228a(c4436d4.f29994b);
    }

    public C4807Sf(Context context, C4964Z4 c4964z4, C4436D4 c4436d4, InterfaceC5164h5 interfaceC5164h5) {
        this(context, c4964z4, c4436d4, interfaceC5164h5, new C4989a5(), C4573Ik.m19516a());
    }

    /* renamed from: a */
    public final void m19813a(C4821T5 c4821t5, C4436D4 c4436d4) {
        if (!AbstractC5443s9.f32555c.contains(EnumC4898Wa.m19946a(c4821t5.f30764d))) {
            this.f30741e.mo19228a(c4436d4.f29994b);
        }
        ((C5139g5) this.f30741e).mo19635a(c4821t5);
    }
}
