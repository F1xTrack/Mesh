package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.md */
/* loaded from: classes2.dex */
public class C3441md<T> implements InterfaceC3053Xc<T> {

    /* renamed from: a */
    private final AbstractC3415ld<T> f24257a;

    /* renamed from: b */
    private final InterfaceC3596sc<T> f24258b;

    /* renamed from: c */
    private final InterfaceC3493od f24259c;

    /* renamed from: d */
    private final InterfaceC3726xc<T> f24260d;

    /* renamed from: e */
    private final Runnable f24261e = new a();

    /* renamed from: f */
    private T f24262f;

    /* renamed from: com.yandex.metrica.impl.ob.md$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3441md.this.m16431b();
        }
    }

    public C3441md(AbstractC3415ld<T> abstractC3415ld, InterfaceC3596sc<T> interfaceC3596sc, InterfaceC3493od interfaceC3493od, InterfaceC3726xc<T> interfaceC3726xc, T t) {
        this.f24257a = abstractC3415ld;
        this.f24258b = interfaceC3596sc;
        this.f24259c = interfaceC3493od;
        this.f24260d = interfaceC3726xc;
        this.f24262f = t;
    }

    /* renamed from: a */
    public void m16429a() {
        T t = this.f24262f;
        if (t != null && this.f24258b.mo14190a(t) && this.f24257a.mo13928a(this.f24262f)) {
            this.f24259c.mo16538a();
            this.f24260d.mo14339a(this.f24261e, this.f24262f);
        }
    }

    /* renamed from: b */
    public void m16431b() {
        this.f24260d.mo13924a();
        this.f24257a.mo13927a();
    }

    /* renamed from: c */
    public void m16432c() {
        T t = this.f24262f;
        if (t != null && this.f24258b.mo14191b(t)) {
            this.f24257a.mo13929b();
        }
        m16429a();
    }

    /* renamed from: a */
    public void m16430a(T t) {
        if (C2968U2.m15245a(this.f24262f, t)) {
            return;
        }
        this.f24262f = t;
        m16431b();
        m16429a();
    }
}
