package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8100y3 {
    public static final HashMap a = new HashMap();

    public static SecretKey a(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateKey = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = a;
        if (map.get(str) == null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Key key = keyStore.getKey(str, null);
                if (key instanceof SecretKey) {
                    secretKeyGenerateKey = (SecretKey) key;
                } else {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                    secretKeyGenerateKey = keyGenerator.generateKey();
                }
            } catch (IOException e) {
                e.getMessage();
            } catch (InvalidAlgorithmParameterException e2) {
                e2.getMessage();
            } catch (KeyStoreException e3) {
                e3.getMessage();
            } catch (NoSuchAlgorithmException e4) {
                e4.getMessage();
            } catch (NoSuchProviderException e5) {
                e5.getMessage();
            } catch (UnrecoverableKeyException e6) {
                e6.getMessage();
            } catch (CertificateException e7) {
                e7.getMessage();
            } catch (Exception e8) {
                e8.getMessage();
            }
            map.put(str, secretKeyGenerateKey);
        }
        return (SecretKey) map.get(str);
    }

    public static String b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(c(str, L12.b(str2)), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.getMessage();
            }
        }
        return "";
    }

    public static byte[] c(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr.length <= 12) {
            return bArr2;
        }
        SecretKey secretKeyA = a(str);
        byte[] bArr3 = new byte[0];
        if (secretKeyA == null || bArr.length <= 12) {
            return bArr3;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeyA, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e) {
            e.getMessage();
            return bArr3;
        } catch (InvalidKeyException e2) {
            e2.getMessage();
            return bArr3;
        } catch (NoSuchAlgorithmException e3) {
            e3.getMessage();
            return bArr3;
        } catch (BadPaddingException e4) {
            e4.getMessage();
            return bArr3;
        } catch (IllegalBlockSizeException e5) {
            e5.getMessage();
            return bArr3;
        } catch (NoSuchPaddingException e6) {
            e6.getMessage();
            return bArr3;
        } catch (Exception e7) {
            e7.getMessage();
            return bArr3;
        }
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return L12.a(e(str, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                e.getMessage();
            }
        }
        return "";
    }

    public static byte[] e(String str, byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            return bArr2;
        }
        SecretKey secretKeyA = a(str);
        byte[] bArrCopyOf = new byte[0];
        if (secretKeyA == null) {
            return bArrCopyOf;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            return bArrCopyOf;
        } catch (InvalidKeyException e) {
            e.getMessage();
            return bArrCopyOf;
        } catch (NoSuchAlgorithmException e2) {
            e2.getMessage();
            return bArrCopyOf;
        } catch (BadPaddingException e3) {
            e3.getMessage();
            return bArrCopyOf;
        } catch (IllegalBlockSizeException e4) {
            e4.getMessage();
            return bArrCopyOf;
        } catch (NoSuchPaddingException e5) {
            e5.getMessage();
            return bArrCopyOf;
        } catch (Exception e6) {
            e6.getMessage();
            return bArrCopyOf;
        }
    }
}
