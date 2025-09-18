package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* loaded from: classes2.dex */
public class AESRSARequestBodyEncrypter implements RequestBodyEncrypter {

    /* renamed from: a */
    private final AESRSAEncrypter f33094a;

    public AESRSARequestBodyEncrypter() {
        this(new AESRSAEncrypter());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public byte[] encrypt(byte[] bArr) {
        return this.f33094a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.AES_RSA;
    }

    public AESRSARequestBodyEncrypter(AESRSAEncrypter aESRSAEncrypter) {
        this.f33094a = aESRSAEncrypter;
    }
}
