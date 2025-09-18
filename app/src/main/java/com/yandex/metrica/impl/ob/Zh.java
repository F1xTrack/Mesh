package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class Zh {
    private final String a;
    private final R2 b;
    private final Om c;
    private final Xh d;

    public Zh(String str, Wh wh) {
        this(str, new R2(), new Nm(), new Xh(wh));
    }

    public void a(InterfaceC2783gi interfaceC2783gi, int i, Ei ei) {
        this.d.a(ei.g);
        if (this.b.b(this.d.a(i), ei.g, "report " + this.a)) {
            ((RunnableC2857ji) interfaceC2783gi).a(this.a, Integer.valueOf(i));
            this.d.a(i, this.c.b());
        }
    }

    public Zh(String str, R2 r2, Om om, Xh xh) {
        this.a = str;
        this.b = r2;
        this.c = om;
        this.d = xh;
    }
}
