package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.vn */
/* loaded from: classes2.dex */
public class C3685vn extends Thread implements InterfaceC3633tn {

    /* renamed from: a */
    private volatile boolean f25137a;

    public C3685vn() {
        this.f25137a = true;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3633tn
    /* renamed from: c */
    public synchronized boolean mo16707c() {
        return this.f25137a;
    }

    /* renamed from: d */
    public synchronized void m17100d() {
        this.f25137a = false;
        interrupt();
    }

    public C3685vn(Runnable runnable, String str) {
        super(runnable, str);
        this.f25137a = true;
    }

    public C3685vn(String str) {
        super(str);
        this.f25137a = true;
    }
}
