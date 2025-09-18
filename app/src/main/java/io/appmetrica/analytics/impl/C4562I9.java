package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.I9 */
/* loaded from: classes2.dex */
public final class C4562I9 implements InterfaceC4415C8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4415C8
    /* renamed from: a */
    public final C5542w8 mo19265a(C4821T5 c4821t5) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4415C8
    /* renamed from: a */
    public final byte[] mo19266a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public final EnumC4465E8 m19497a() {
        return EnumC4465E8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
