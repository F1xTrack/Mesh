package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.al, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2636al {
    private final C3164vl a;
    private final Ll b;
    private final Ll c;
    private final Ll d;

    public C2636al(Il il) {
        this(new C3164vl(il == null ? null : il.e), new Ll(il == null ? null : il.f), new Ll(il == null ? null : il.h), new Ll(il != null ? il.g : null));
    }

    public void a(Il il) {
        this.a.d(il.e);
        this.b.d(il.f);
        this.c.d(il.h);
        this.d.d(il.g);
    }

    public Zk<?> b() {
        return this.b;
    }

    public Zk<?> c() {
        return this.a;
    }

    public Zk<?> d() {
        return this.c;
    }

    public synchronized Zk<?> a() {
        return this.d;
    }

    public C2636al(C3164vl c3164vl, Ll ll, Ll ll2, Ll ll3) {
        this.a = c3164vl;
        this.b = ll;
        this.c = ll2;
        this.d = ll3;
    }
}
