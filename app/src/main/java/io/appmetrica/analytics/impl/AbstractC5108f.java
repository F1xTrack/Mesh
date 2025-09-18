package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f */
/* loaded from: classes2.dex */
public abstract class AbstractC5108f implements InterfaceC5463t4 {

    /* renamed from: a */
    public final Context f31644a;

    /* renamed from: b */
    public final C4807Sf f31645b;

    public AbstractC5108f(Context context, C4807Sf c4807Sf) {
        this.f31644a = context.getApplicationContext();
        this.f31645b = c4807Sf;
        c4807Sf.m19814a(this);
        C5244ka.m20614h().m20626k().mo19325b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5463t4
    /* renamed from: a */
    public final void mo19487a(C4821T5 c4821t5, C4436D4 c4436d4) {
        mo19776b(c4821t5, c4436d4);
    }

    /* renamed from: b */
    public final C4807Sf m20358b() {
        return this.f31645b;
    }

    /* renamed from: b */
    public abstract void mo19776b(C4821T5 c4821t5, C4436D4 c4436d4);

    /* renamed from: c */
    public final Context m20359c() {
        return this.f31644a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5463t4
    /* renamed from: a */
    public final void mo19486a() {
        this.f31645b.m19816b(this);
        C5244ka.f32038C.m20625j().mo19323a(this);
    }
}
