package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.lf */
/* loaded from: classes2.dex */
public class C3417lf implements InterfaceC3443mf {

    /* renamed from: a */
    private final C3425ln f24191a;

    public C3417lf() {
        this(new C3425ln());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3443mf
    /* renamed from: a */
    public byte[] mo14848a(C3055Xe c3055Xe, C3367jh c3367jh) {
        byte[] bArrM15298a = new byte[0];
        try {
            bArrM15298a = C2991V0.m15298a(c3055Xe.f22787b);
        } catch (Throwable unused) {
        }
        byte[] bArrMo15950a = this.f24191a.m16422a(c3055Xe.f22803r).mo15950a(bArrM15298a);
        return bArrMo15950a == null ? new byte[0] : bArrMo15950a;
    }

    public C3417lf(C3425ln c3425ln) {
        this.f24191a = c3425ln;
    }
}
