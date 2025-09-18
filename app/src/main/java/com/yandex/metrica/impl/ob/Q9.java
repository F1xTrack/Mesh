package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Q9 {
    private final String a;
    private final InterfaceC3226y8 b;
    private final P9<AbstractC2714e> c;
    private final InterfaceC2725ea<Object, AbstractC2714e> d;

    public Q9(String str, InterfaceC3226y8 interfaceC3226y8, P9<AbstractC2714e> p9, InterfaceC2725ea<Object, AbstractC2714e> interfaceC2725ea) {
        this.a = str;
        this.b = interfaceC3226y8;
        this.c = p9;
        this.d = interfaceC2725ea;
    }

    public void a(Object obj) {
        this.b.a(this.a, this.c.a((P9<AbstractC2714e>) this.d.b(obj)));
    }

    public Object b() {
        try {
            byte[] bArrA = this.b.a(this.a);
            return U2.a(bArrA) ? this.d.a(this.c.a()) : this.d.a(this.c.a(bArrA));
        } catch (Throwable unused) {
            return this.d.a(this.c.a());
        }
    }

    public void a() {
        this.b.b(this.a);
    }
}
