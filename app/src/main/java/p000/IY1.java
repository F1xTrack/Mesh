package p000;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public abstract class IY1 {
    /* renamed from: a */
    public static C8071Oo1 m3932a() throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderM23632b = AbstractC6601pB.m23632b("androidxBiometric", 3);
            AbstractC6601pB.m23634d(builderM23632b);
            AbstractC6601pB.m23635e(builderM23632b);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            AbstractC6601pB.m23633c(keyGenerator, AbstractC6601pB.m23631a(builderM23632b));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new C8071Oo1(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: b */
    public static EnumC8043Oa1 m3933b(String str) {
        O90.m5968f(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC8043Oa1.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC8043Oa1.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC8043Oa1.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC8043Oa1.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC8043Oa1.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* renamed from: c */
    public static BiometricPrompt.CryptoObject m3934c(C8071Oo1 c8071Oo1) {
        IdentityCredential identityCredential;
        if (c8071Oo1 == null) {
            return null;
        }
        Cipher cipher = (Cipher) c8071Oo1.f8628b;
        if (cipher != null) {
            return AbstractC6664qB.m23941b(cipher);
        }
        Signature signature = (Signature) c8071Oo1.f8627a;
        if (signature != null) {
            return AbstractC6664qB.m23940a(signature);
        }
        Mac mac = (Mac) c8071Oo1.f8629c;
        if (mac != null) {
            return AbstractC6664qB.m23942c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = (IdentityCredential) c8071Oo1.f8630d) == null) {
            return null;
        }
        return AbstractC6727rB.m24178a(identityCredential);
    }
}
