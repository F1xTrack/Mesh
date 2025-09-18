package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.lf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2904lf implements InterfaceC2929mf {
    private final C2912ln a;

    public C2904lf() {
        this(new C2912ln());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        byte[] bArrA = new byte[0];
        try {
            bArrA = V0.a(xe.b);
        } catch (Throwable unused) {
        }
        byte[] bArrA2 = this.a.a(xe.r).a(bArrA);
        return bArrA2 == null ? new byte[0] : bArrA2;
    }

    public C2904lf(C2912ln c2912ln) {
        this.a = c2912ln;
    }
}
