package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes2.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a */
    private final RequestBodyEncrypter f33133a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f33133a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f33133a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
