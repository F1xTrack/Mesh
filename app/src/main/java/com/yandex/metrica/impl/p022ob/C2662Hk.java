package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Hk */
/* loaded from: classes2.dex */
class C2662Hk implements InterfaceC3138am {

    /* renamed from: a */
    private final C2762Lk f21373a;

    /* renamed from: b */
    private final C2601F9 f21374b;

    /* renamed from: c */
    private final InterfaceC3449ml f21375c;

    /* renamed from: d */
    private final a f21376d;

    /* renamed from: e */
    private final boolean f21377e;

    /* renamed from: com.yandex.metrica.impl.ob.Hk$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Hk$b */
    public static class b {
    }

    public C2662Hk(C2762Lk c2762Lk, C2601F9 c2601f9, boolean z, InterfaceC3449ml interfaceC3449ml, a aVar) {
        this.f21373a = c2762Lk;
        this.f21374b = c2601f9;
        this.f21377e = z;
        this.f21375c = interfaceC3449ml;
        this.f21376d = aVar;
    }

    /* renamed from: b */
    private boolean m14267b(C2688Il c2688Il) {
        if (!c2688Il.f21450c || c2688Il.f21454g == null) {
            return false;
        }
        return this.f21377e || this.f21374b.m14075a(false);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public void mo14268a(long j, Activity activity, C2638Gl c2638Gl, List<C3037Wl> list, C2688Il c2688Il, C3189cl c3189cl) {
        if (m14267b(c2688Il)) {
            a aVar = this.f21376d;
            C2738Kl c2738Kl = c2688Il.f21454g;
            aVar.getClass();
            this.f21373a.m14547a((c2738Kl.f21599h ? new C3293gl() : new C3215dl(list)).m15139a(activity, c2638Gl, c2688Il.f21454g, c3189cl.m15714a(), j));
            this.f21375c.onResult(this.f21373a.m14546a());
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public void mo14269a(Throwable th, C3164bm c3164bm) {
        this.f21375c.onError("exception: " + th.getMessage());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public boolean mo14270a(C2688Il c2688Il) {
        return m14267b(c2688Il) && !c2688Il.f21454g.f21599h;
    }
}
