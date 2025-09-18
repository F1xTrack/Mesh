package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yk */
/* loaded from: classes2.dex */
public class C3760yk extends AbstractC2910Rj {

    /* renamed from: a */
    private int f25338a;

    /* renamed from: b */
    private AbstractC2910Rj f25339b;

    public C3760yk(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context.getApplicationContext(), new C3039Wn(), interfaceExecutorC3607sn);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public synchronized void mo15081a() {
        int i = this.f25338a + 1;
        this.f25338a = i;
        if (i == 1) {
            this.f25339b.mo15081a();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: b */
    public synchronized void mo15086b() {
        int i = this.f25338a - 1;
        this.f25338a = i;
        if (i == 0) {
            this.f25339b.mo15086b();
        }
    }

    public C3760yk(Context context, C3039Wn c3039Wn, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        if (c3039Wn.m15404a(context, "android.hardware.telephony")) {
            this.f25339b = new C3370jk(context, interfaceExecutorC3607sn);
        } else {
            this.f25339b = new C3422lk();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public synchronized void mo15082a(InterfaceC2512Bk interfaceC2512Bk) {
        this.f25339b.mo15082a(interfaceC2512Bk);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public synchronized void mo15084a(InterfaceC3035Wj interfaceC3035Wj) {
        this.f25339b.mo15084a(interfaceC3035Wj);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public void mo15085a(boolean z) {
        this.f25339b.mo15085a(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2910Rj
    /* renamed from: a */
    public void mo15083a(C2885Qi c2885Qi) {
        this.f25339b.mo15083a(c2885Qi);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3003Vc
    /* renamed from: a */
    public void mo15306a(C2978Uc c2978Uc) {
        this.f25339b.mo15306a(c2978Uc);
    }
}
