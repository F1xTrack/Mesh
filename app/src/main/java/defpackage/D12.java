package defpackage;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class D12 {
    public static SecretKeySpec a(C6928rv c6928rv) {
        int i;
        String str = (String) c6928rv.c;
        if (!TextUtils.isEmpty(str)) {
            String str2 = (String) c6928rv.d;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = (String) c6928rv.e;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = (String) c6928rv.f;
                    if (!TextUtils.isEmpty(str4) && str.length() == str2.length() && str2.length() == str3.length()) {
                        int length = str3.length();
                        int i2 = c6928rv.b;
                        if (length == i2 * 2 && (i = c6928rv.a) >= 0) {
                            String str5 = (String) c6928rv.g;
                            if (!TextUtils.isEmpty(str5)) {
                                byte[] bArrA = AbstractC2252b30.a(str);
                                byte[] bArrA2 = AbstractC2252b30.a(str2);
                                byte[] bArrA3 = AbstractC2252b30.a(str3);
                                b(bArrA, -4);
                                byte[] bArrD = d(bArrA, bArrA2);
                                b(bArrD, 6);
                                return new SecretKeySpec(SecretKeyFactory.getInstance(str5).generateSecret(new PBEKeySpec(AbstractC2252b30.b(d(bArrD, bArrA3)).toCharArray(), AbstractC2252b30.a(str4), i, i2 * 8)).getEncoded(), "AES");
                            }
                        }
                    }
                }
            }
        }
        throw new IllegalArgumentException("invalid data for generating the key.");
    }

    public static void b(byte[] bArr, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
    }

    public static byte[] c(SecretKeySpec secretKeySpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (secretKeySpec == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static Float e(String str) throws NumberFormatException {
        String[] strArrSplit = str.split(StringUtils.COMMA, 3);
        String[] strArrSplit2 = strArrSplit[0].split("/", 2);
        double dDoubleValue = Double.valueOf(strArrSplit2[0]).doubleValue() / Double.valueOf(strArrSplit2[1]).doubleValue();
        String[] strArrSplit3 = strArrSplit[1].split("/", 2);
        double dDoubleValue2 = Double.valueOf(strArrSplit3[0]).doubleValue() / Double.valueOf(strArrSplit3[1]).doubleValue();
        String[] strArrSplit4 = strArrSplit[2].split("/", 2);
        return Float.valueOf((float) (((Double.valueOf(strArrSplit4[0]).doubleValue() / Double.valueOf(strArrSplit4[1]).doubleValue()) / 3600.0d) + (dDoubleValue2 / 60.0d) + dDoubleValue));
    }
}
