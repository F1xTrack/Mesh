package p000;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: qB */
/* loaded from: classes.dex */
public abstract class AbstractC6664qB {
    /* renamed from: a */
    public static BiometricPrompt.CryptoObject m23940a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    /* renamed from: b */
    public static BiometricPrompt.CryptoObject m23941b(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    /* renamed from: c */
    public static BiometricPrompt.CryptoObject m23942c(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    /* renamed from: d */
    public static Cipher m23943d(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    /* renamed from: e */
    public static Mac m23944e(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    /* renamed from: f */
    public static Signature m23945f(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
