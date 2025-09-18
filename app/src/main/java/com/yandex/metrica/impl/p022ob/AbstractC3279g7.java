package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.InterfaceC3799r;

/* renamed from: com.yandex.metrica.impl.ob.g7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3279g7 implements InterfaceC3331i7 {

    /* renamed from: a */
    private final a f23486a;

    /* renamed from: b */
    private final InterfaceC3799r f23487b;

    /* renamed from: c */
    private final C2717K0 f23488c;

    /* renamed from: com.yandex.metrica.impl.ob.g7$a */
    public interface a {
        /* renamed from: a */
        boolean mo15957a(Throwable th);
    }

    public AbstractC3279g7(a aVar, InterfaceC3799r interfaceC3799r, C2717K0 c2717k0) {
        this.f23486a = aVar;
        this.f23488c = c2717k0;
    }

    /* renamed from: a */
    public abstract void mo15982a(C3513p7 c3513p7);

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3331i7
    /* renamed from: a */
    public void mo15983a(Throwable th, C3227e7 c3227e7) {
        if (this.f23486a.mo15957a(th)) {
            mo15982a(C3539q7.m16602a(th, c3227e7, null, this.f23488c.m14455a(), this.f23488c.m14456b()));
        }
    }
}
