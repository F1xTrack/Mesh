package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Zl */
/* loaded from: classes2.dex */
public class C3112Zl implements InterfaceC2713Jl {

    /* renamed from: a */
    private final C3787zl f23005a;

    /* renamed from: b */
    private final C3657ul f23006b;

    /* renamed from: c */
    private final C2601F9 f23007c;

    /* renamed from: d */
    private final C3137al f23008d;

    /* renamed from: e */
    private final C3475nl f23009e;

    /* renamed from: f */
    private Activity f23010f;

    /* renamed from: g */
    private C2688Il f23011g;

    /* renamed from: com.yandex.metrica.impl.ob.Zl$a */
    public class a implements InterfaceC2988Um<Activity> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(Activity activity) {
            C3112Zl.this.f23005a.m17341a(activity);
        }
    }

    public C3112Zl(Context context, C2601F9 c2601f9, InterfaceC3372jm interfaceC3372jm, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2688Il c2688Il) {
        this(context, c2601f9, interfaceC3372jm, interfaceExecutorC3607sn, c2688Il, new C3137al(c2688Il));
    }

    /* renamed from: b */
    public synchronized void m15565b(Activity activity) {
        this.f23010f = activity;
        this.f23005a.m17341a(activity);
    }

    private C3112Zl(Context context, C2601F9 c2601f9, InterfaceC3372jm interfaceC3372jm, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2688Il c2688Il, C3137al c3137al) {
        this(c2601f9, interfaceC3372jm, c2688Il, c3137al, new C2762Lk(1, c2601f9), new C3294gm(interfaceExecutorC3607sn, new C2787Mk(c2601f9), c3137al), new C2687Ik(context));
    }

    /* renamed from: a */
    public synchronized void m15563a(Activity activity) {
        this.f23009e.m16498a(activity);
        this.f23010f = null;
    }

    private C3112Zl(C2601F9 c2601f9, InterfaceC3372jm interfaceC3372jm, C2688Il c2688Il, C3137al c3137al, C2762Lk c2762Lk, C3294gm c3294gm, C2687Ik c2687Ik) {
        this(c2601f9, c2688Il, interfaceC3372jm, c3294gm, c3137al, new C3787zl(c2688Il, c2762Lk, c2601f9, c3294gm, c2687Ik), new C3657ul(c2688Il, c2762Lk, c2601f9, c3294gm, c2687Ik), new C2812Nk());
    }

    public C3112Zl(C2601F9 c2601f9, C2688Il c2688Il, InterfaceC3372jm interfaceC3372jm, C3294gm c3294gm, C3137al c3137al, C3787zl c3787zl, C3657ul c3657ul, C2812Nk c2812Nk) {
        this.f23007c = c2601f9;
        this.f23011g = c2688Il;
        this.f23008d = c3137al;
        this.f23005a = c3787zl;
        this.f23006b = c3657ul;
        C3475nl c3475nl = new C3475nl(new a(), interfaceC3372jm);
        this.f23009e = c3475nl;
        c3294gm.m16015a(c2812Nk, c3475nl);
    }

    /* renamed from: a */
    public synchronized void m15564a(InterfaceC2838Ol interfaceC2838Ol, boolean z) {
        this.f23006b.m16936a(this.f23010f, interfaceC2838Ol, z);
        this.f23007c.m14082c(true);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2713Jl
    /* renamed from: a */
    public synchronized void mo14446a(C2688Il c2688Il) {
        if (!c2688Il.equals(this.f23011g)) {
            this.f23008d.m15618a(c2688Il);
            this.f23006b.m16937a(c2688Il);
            this.f23005a.m17342a(c2688Il);
            this.f23011g = c2688Il;
            Activity activity = this.f23010f;
            if (activity != null) {
                this.f23005a.m17343b(activity);
            }
        }
    }
}
