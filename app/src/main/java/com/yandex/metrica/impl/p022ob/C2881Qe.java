package com.yandex.metrica.impl.p022ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.Qe */
/* loaded from: classes2.dex */
public class C2881Qe implements InterfaceC3443mf {

    /* renamed from: a */
    private final C3425ln f22012a;

    public C2881Qe() {
        this(new C3425ln());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3443mf
    /* renamed from: a */
    public byte[] mo14848a(C3055Xe c3055Xe, C3367jh c3367jh) {
        byte[] bArrDecode = new byte[0];
        String str = c3055Xe.f22787b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f22012a.m16422a(c3055Xe.f22803r).mo15950a(bArrDecode);
    }

    public C2881Qe(C3425ln c3425ln) {
        this.f22012a = c3425ln;
    }
}
