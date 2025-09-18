package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3166vn extends Thread implements InterfaceC3111tn {
    private volatile boolean a;

    public C3166vn() {
        this.a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3111tn
    public synchronized boolean c() {
        return this.a;
    }

    public synchronized void d() {
        this.a = false;
        interrupt();
    }

    public C3166vn(Runnable runnable, String str) {
        super(runnable, str);
        this.a = true;
    }

    public C3166vn(String str) {
        super(str);
        this.a = true;
    }
}
