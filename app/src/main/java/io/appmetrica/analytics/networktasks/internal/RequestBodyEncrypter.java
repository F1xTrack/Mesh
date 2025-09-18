package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes2.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    RequestBodyEncryptionMode getEncryptionMode();
}
