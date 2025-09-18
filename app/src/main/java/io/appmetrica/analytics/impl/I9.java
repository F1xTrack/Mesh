package io.appmetrica.analytics.impl;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class I9 implements C8 {
    @Override // io.appmetrica.analytics.impl.C8
    public final C4952w8 a(T5 t5) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.C8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final E8 a() {
        return E8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
