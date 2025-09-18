package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2962nn implements InterfaceC2887kn {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2887kn
    public C2862jn a(C2864k0 c2864k0) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2887kn
    public byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
