package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.cl */
/* loaded from: classes2.dex */
class C2686cl {
    private final C2661bl a;
    private final C2661bl b;
    private final C2661bl c;
    private final C2661bl d;

    /* renamed from: com.yandex.metrica.impl.ob.cl$a */
    public static class a {
    }

    public C2686cl(C2636al c2636al, Il il) {
        this(new C2661bl(c2636al.c(), a(il.e)), new C2661bl(c2636al.b(), a(il.f)), new C2661bl(c2636al.d(), a(il.h)), new C2661bl(c2636al.a(), a(il.g)));
    }

    public C2661bl a() {
        return this.d;
    }

    public C2661bl b() {
        return this.b;
    }

    public C2661bl c() {
        return this.a;
    }

    public C2661bl d() {
        return this.c;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public C2686cl(C2661bl c2661bl, C2661bl c2661bl2, C2661bl c2661bl3, C2661bl c2661bl4) {
        this.a = c2661bl;
        this.b = c2661bl2;
        this.c = c2661bl3;
        this.d = c2661bl4;
    }
}
