package com.yandex.metrica.impl.p022ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.nn */
/* loaded from: classes2.dex */
public class C3477nn implements InterfaceC3399kn {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3399kn
    /* renamed from: a */
    public C3373jn mo15949a(C3376k0 c3376k0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3399kn
    /* renamed from: a */
    public byte[] mo15950a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
