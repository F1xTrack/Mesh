package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yk */
/* loaded from: classes2.dex */
public class C3238yk extends Rj {
    private int a;
    private Rj b;

    public C3238yk(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context.getApplicationContext(), new Wn(), interfaceExecutorC3086sn);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a() {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            this.b.a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void b() {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            this.b.b();
        }
    }

    public C3238yk(Context context, Wn wn, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        if (wn.a(context, "android.hardware.telephony")) {
            this.b = new C2859jk(context, interfaceExecutorC3086sn);
        } else {
            this.b = new C2909lk();
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Bk bk) {
        this.b.a(bk);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Wj wj) {
        this.b.a(wj);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(boolean z) {
        this.b.a(z);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(Qi qi) {
        this.b.a(qi);
    }

    @Override // com.yandex.metrica.impl.ob.Vc
    public void a(Uc uc) {
        this.b.a(uc);
    }
}
