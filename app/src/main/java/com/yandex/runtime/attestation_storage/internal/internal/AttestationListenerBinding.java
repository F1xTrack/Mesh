package com.yandex.runtime.attestation_storage.internal.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.attestation_storage.internal.AttestationListener;

/* loaded from: classes2.dex */
public class AttestationListenerBinding implements AttestationListener {
    private final NativeObject nativeObject;

    public AttestationListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationFailed(String str);

    @Override // com.yandex.runtime.attestation_storage.internal.AttestationListener
    public native void onAttestationReceived(byte[] bArr);
}
