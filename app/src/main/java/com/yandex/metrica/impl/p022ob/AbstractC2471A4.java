package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.A4 */
/* loaded from: classes2.dex */
public abstract class AbstractC2471A4 implements InterfaceC2571E4 {

    /* renamed from: a */
    private final C3562r4 f20833a;

    /* renamed from: b */
    private final C2555Dd f20834b;

    public AbstractC2471A4(Context context, C3562r4 c3562r4) {
        this(context, c3562r4, new C2555Dd(C3207dd.m15750a(context), C3145b3.m15668a(context), C2842P0.m14728i().m14750u()));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2571E4
    /* renamed from: a */
    public void mo13840a(C3376k0 c3376k0, C3044X3 c3044x3) {
        mo13842b(c3376k0, c3044x3);
    }

    /* renamed from: b */
    public C3562r4 m13841b() {
        return this.f20833a;
    }

    /* renamed from: b */
    public abstract void mo13842b(C3376k0 c3376k0, C3044X3 c3044x3);

    /* renamed from: c */
    public C2555Dd m13843c() {
        return this.f20834b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2571E4
    /* renamed from: a */
    public void mo13839a() {
        this.f20833a.m16651b(this);
        this.f20834b.m13997b(this);
    }

    public AbstractC2471A4(Context context, C3562r4 c3562r4, C2555Dd c2555Dd) {
        context.getApplicationContext();
        this.f20833a = c3562r4;
        this.f20834b = c2555Dd;
        c3562r4.m16649a(this);
        c2555Dd.m13995a(this);
    }
}
