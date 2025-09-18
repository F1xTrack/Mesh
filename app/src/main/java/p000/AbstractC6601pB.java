package p000;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.KeyGenerator;

/* renamed from: pB */
/* loaded from: classes.dex */
public abstract class AbstractC6601pB {
    /* renamed from: a */
    public static KeyGenParameterSpec m23631a(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static KeyGenParameterSpec.Builder m23632b(String str, int i) {
        return new KeyGenParameterSpec.Builder(str, i);
    }

    /* renamed from: c */
    public static void m23633c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
        keyGenerator.init(keyGenParameterSpec);
    }

    /* renamed from: d */
    public static void m23634d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    /* renamed from: e */
    public static void m23635e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }
}
