package p000;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* renamed from: rB */
/* loaded from: classes.dex */
public abstract class AbstractC6727rB {
    /* renamed from: a */
    public static BiometricPrompt.CryptoObject m24178a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* renamed from: b */
    public static IdentityCredential m24179b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
