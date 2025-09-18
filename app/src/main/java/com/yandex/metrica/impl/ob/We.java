package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class We implements InterfaceC2929mf {
    private final C2912ln a;

    public We() {
        this(new C2912ln());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        String str = xe.b;
        return this.a.a(xe.r).a(str != null ? O2.c(str) : new byte[0]);
    }

    public We(C2912ln c2912ln) {
        this.a = c2912ln;
    }
}
