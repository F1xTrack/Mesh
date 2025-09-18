package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C3216dm;
import java.util.List;
import p000.InterfaceC9296es1;

/* renamed from: com.yandex.metrica.impl.ob.nl */
/* loaded from: classes2.dex */
class C3475nl implements InterfaceC3190cm {

    /* renamed from: a */
    private final InterfaceC9296es1 f24325a;

    /* renamed from: b */
    private final C3216dm.a f24326b;

    /* renamed from: c */
    private final InterfaceC3372jm f24327c;

    /* renamed from: d */
    private final C3346im f24328d;

    public C3475nl(InterfaceC2988Um<Activity> interfaceC2988Um, InterfaceC3372jm interfaceC3372jm) {
        this(new C3216dm.a(), interfaceC2988Um, interfaceC3372jm, new C3267fl(), new C3346im());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3190cm
    /* renamed from: a */
    public void mo14671a(Activity activity, long j) {
    }

    public C3475nl(C3216dm.a aVar, InterfaceC2988Um<Activity> interfaceC2988Um, InterfaceC3372jm interfaceC3372jm, C3267fl c3267fl, C3346im c3346im) {
        this.f24326b = aVar;
        this.f24327c = interfaceC3372jm;
        this.f24325a = c3267fl.m15948a(interfaceC2988Um);
        this.f24328d = c3346im;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public boolean mo14270a(C2688Il c2688Il) {
        return false;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3190cm
    /* renamed from: a */
    public void mo14672a(Activity activity, boolean z) {
        if (z) {
            return;
        }
        try {
            this.f24325a.subscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public void mo14268a(long j, Activity activity, C2638Gl c2638Gl, List<C3037Wl> list, C2688Il c2688Il, C3189cl c3189cl) {
        C2738Kl c2738Kl;
        C2738Kl c2738Kl2;
        if (c2688Il.f21449b && (c2738Kl2 = c2688Il.f21453f) != null) {
            this.f24327c.mo14492b(this.f24328d.m15139a(activity, c2638Gl, c2738Kl2, c3189cl.m15715b(), j));
        }
        if (!c2688Il.f21451d || (c2738Kl = c2688Il.f21455h) == null) {
            return;
        }
        this.f24327c.mo14489a(this.f24328d.m15139a(activity, c2638Gl, c2738Kl, c3189cl.m15717d(), j));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public void mo14269a(Throwable th, C3164bm c3164bm) {
        this.f24326b.getClass();
        new C3216dm(c3164bm, C2834Oh.m14711a()).m15805a("ui_parsing", th);
    }

    /* renamed from: a */
    public void m16498a(Activity activity) {
        try {
            this.f24325a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
