package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import p000.C8313Tf1;

/* renamed from: io.appmetrica.analytics.impl.g6 */
/* loaded from: classes2.dex */
public final class C5140g6 extends C5150gg {

    /* renamed from: f */
    public final Context f31745f;

    /* renamed from: g */
    public final C4737Pg f31746g;

    /* renamed from: h */
    public final C4851Ub f31747h;

    /* renamed from: i */
    public final C5365p6 f31748i;

    public C5140g6(Context context, C5134g0 c5134g0, InterfaceC5029bk interfaceC5029bk, C4737Pg c4737Pg) {
        super(c5134g0, interfaceC5029bk, c4737Pg);
        this.f31745f = context;
        this.f31746g = c4737Pg;
        this.f31747h = C5388q4.m20928h().m20938i();
        this.f31748i = new C5365p6(context);
    }

    /* renamed from: a */
    public final void m20436a(C4737Pg c4737Pg) {
        if (c4737Pg.f30620a.f30767g != 0) {
            this.f31748i.m20903a(c4737Pg);
            return;
        }
        Intent intentM19284a = AbstractC4426Cj.m19284a(this.f31745f);
        C4821T5 c4821t5 = c4737Pg.f30620a;
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = 5890;
        intentM19284a.putExtras(c4821t5.m19859d(c4737Pg.f30624e.m20038c()));
        try {
            this.f31745f.startService(intentM19284a);
        } catch (Throwable unused) {
            this.f31748i.m20903a(c4737Pg);
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: c */
    public final boolean mo19781c() {
        m20436a(this.f31746g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mo19777a();
        return C8313Tf1.f11463a;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC4784Rg
    /* renamed from: a */
    public final synchronized void mo19777a() {
        try {
            if (this.f30701c) {
                return;
            }
            this.f30701c = true;
            if (this.f31747h.m19885a(AppMetricaModule.NAME)) {
                this.f31748i.m20903a(this.f31746g);
            } else {
                this.f30699a.m20404c();
                this.f30701c = false;
                super.mo19777a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
