package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* renamed from: io.appmetrica.analytics.impl.r6 */
/* loaded from: classes2.dex */
public final class C5415r6 implements CryptoProvider {

    /* renamed from: a */
    public final AESRSAEncrypter f32500a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    public final Encrypter getAesRsaEncrypter() {
        return this.f32500a;
    }
}
