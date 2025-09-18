package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.md, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2927md<T> implements Xc<T> {
    private final AbstractC2902ld<T> a;
    private final InterfaceC3075sc<T> b;
    private final InterfaceC2977od c;
    private final InterfaceC3205xc<T> d;
    private final Runnable e = new a();
    private T f;

    /* renamed from: com.yandex.metrica.impl.ob.md$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2927md.this.b();
        }
    }

    public C2927md(AbstractC2902ld<T> abstractC2902ld, InterfaceC3075sc<T> interfaceC3075sc, InterfaceC2977od interfaceC2977od, InterfaceC3205xc<T> interfaceC3205xc, T t) {
        this.a = abstractC2902ld;
        this.b = interfaceC3075sc;
        this.c = interfaceC2977od;
        this.d = interfaceC3205xc;
        this.f = t;
    }

    public void a() {
        T t = this.f;
        if (t != null && this.b.a(t) && this.a.a(this.f)) {
            this.c.a();
            this.d.a(this.e, this.f);
        }
    }

    public void b() {
        this.d.a();
        this.a.a();
    }

    public void c() {
        T t = this.f;
        if (t != null && this.b.b(t)) {
            this.a.b();
        }
        a();
    }

    public void a(T t) {
        if (U2.a(this.f, t)) {
            return;
        }
        this.f = t;
        b();
        a();
    }
}
