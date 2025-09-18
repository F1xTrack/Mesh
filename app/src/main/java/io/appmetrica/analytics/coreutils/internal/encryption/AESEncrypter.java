package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a */
    private final String f29714a;

    /* renamed from: b */
    private final byte[] f29715b;

    /* renamed from: c */
    private final byte[] f29716c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f29714a = str;
        this.f29715b = bArr;
        this.f29716c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f29715b, "AES");
            Cipher cipher = Cipher.getInstance(this.f29714a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f29716c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f29714a;
    }

    public byte[] getIV() {
        return this.f29716c;
    }

    public byte[] getPassword() {
        return this.f29715b;
    }

    public byte[] decrypt(byte[] bArr, int i, int i2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f29715b, "AES");
            Cipher cipher = Cipher.getInstance(this.f29714a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f29716c));
            return cipher.doFinal(bArr, i, i2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
