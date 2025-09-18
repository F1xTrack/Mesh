package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* loaded from: classes2.dex */
public class Qe implements InterfaceC2929mf {
    private final C2912ln a;

    public Qe() {
        this(new C2912ln());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2929mf
    public byte[] a(Xe xe, C2856jh c2856jh) {
        byte[] bArrDecode = new byte[0];
        String str = xe.b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.a.a(xe.r).a(bArrDecode);
    }

    public Qe(C2912ln c2912ln) {
        this.a = c2912ln;
    }
}
