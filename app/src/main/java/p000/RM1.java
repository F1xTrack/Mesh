package p000;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class RM1 {
    /* renamed from: a */
    public static String m7003a(String str, byte[] bArr) throws UnsupportedEncodingException {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            try {
                str3 = str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return "";
        }
        byte[] bArrM4864b = L12.m4864b(str2);
        if (TextUtils.isEmpty(str3) || bArr.length < 16 || bArrM4864b.length < 16) {
            return "";
        }
        try {
            return new String(m7004b(L12.m4864b(str3), bArr, bArrM4864b), "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            e3.getMessage();
            return "";
        }
    }

    /* renamed from: b */
    public static byte[] m7004b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length == 0) {
            return new byte[0];
        }
        if (bArr2 == null) {
            return new byte[0];
        }
        if (bArr2.length < 16) {
            return new byte[0];
        }
        if (bArr3 == null) {
            return new byte[0];
        }
        if (bArr3.length < 16) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            e.getMessage();
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            e2.getMessage();
            return new byte[0];
        } catch (InvalidKeyException e3) {
            e3.getMessage();
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            e4.getMessage();
            return new byte[0];
        } catch (BadPaddingException e5) {
            e5.getMessage();
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            e6.getMessage();
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            e7.getMessage();
            return new byte[0];
        }
    }

    /* renamed from: c */
    public static String m7005c(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM7006d;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        byte[] bArrM26397b = AbstractC7261zO.m26397b(16);
        if (TextUtils.isEmpty(str)) {
            bArrM7006d = new byte[0];
        } else if (bArr.length < 16) {
            bArrM7006d = new byte[0];
        } else if (bArrM26397b.length < 16) {
            bArrM7006d = new byte[0];
        } else {
            try {
                bArrM7006d = m7006d(str.getBytes("UTF-8"), bArr, bArrM26397b);
            } catch (UnsupportedEncodingException e) {
                e.getMessage();
                bArrM7006d = new byte[0];
            }
        }
        if (bArrM7006d == null || bArrM7006d.length == 0) {
            return "";
        }
        String strM4863a = L12.m4863a(bArrM26397b);
        String strM4863a2 = L12.m4863a(bArrM7006d);
        if (TextUtils.isEmpty(strM4863a) || TextUtils.isEmpty(strM4863a2)) {
            return "";
        }
        try {
            return strM4863a2.substring(0, 6) + strM4863a.substring(0, 6) + strM4863a2.substring(6, 10) + strM4863a.substring(6, 16) + strM4863a2.substring(10, 16) + strM4863a.substring(16) + strM4863a2.substring(16);
        } catch (Exception e2) {
            e2.getMessage();
            return "";
        }
    }

    /* renamed from: d */
    public static byte[] m7006d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr == null) {
            return new byte[0];
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        if (bArr2 == null) {
            return new byte[0];
        }
        if (bArr2.length < 16) {
            return new byte[0];
        }
        if (bArr3.length < 16) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            e.getMessage();
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            e2.getMessage();
            return new byte[0];
        } catch (InvalidKeyException e3) {
            e3.getMessage();
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            e4.getMessage();
            return new byte[0];
        } catch (BadPaddingException e5) {
            e5.getMessage();
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            e6.getMessage();
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            e7.getMessage();
            return new byte[0];
        }
    }

    /* renamed from: e */
    public static C8340Tt0 m7007e(C8340Tt0 c8340Tt0, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c8340Tt0.f11578b) {
            String strM7802c = c8340Tt0.m7802c();
            if (D51.m1556o(strM7802c, str, false) && strM7802c.length() != str.length() && ('a' > (cCharAt = strM7802c.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C8340Tt0.m7798e(str2.concat(AbstractC11374v51.m25335J(str, strM7802c)));
                }
                if (!z) {
                    return c8340Tt0;
                }
                String strM25335J = AbstractC11374v51.m25335J(str, strM7802c);
                if (strM25335J.length() != 0 && AbstractC9244eS1.m17993c(0, strM25335J)) {
                    if (strM25335J.length() != 1 && AbstractC9244eS1.m17993c(1, strM25335J)) {
                        Iterator it = new C9461g90(0, strM25335J.length() - 1, 1).iterator();
                        while (true) {
                            C9333f90 c9333f90 = (C9333f90) it;
                            if (!c9333f90.f27092c) {
                                next = null;
                                break;
                            }
                            next = c9333f90.next();
                            if (!AbstractC9244eS1.m17993c(((Number) next).intValue(), strM25335J)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strM25335J.substring(0, iIntValue);
                            O90.m5967e(strSubstring, "substring(...)");
                            String strM17995e = AbstractC9244eS1.m17995e(strSubstring);
                            String strSubstring2 = strM25335J.substring(iIntValue);
                            O90.m5967e(strSubstring2, "substring(...)");
                            strM25335J = strM17995e.concat(strSubstring2);
                        } else {
                            strM25335J = AbstractC9244eS1.m17995e(strM25335J);
                        }
                    } else if (strM25335J.length() != 0 && 'A' <= (cCharAt2 = strM25335J.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strM25335J.substring(1);
                        O90.m5967e(strSubstring3, "substring(...)");
                        strM25335J = lowerCase + strSubstring3;
                    }
                }
                if (C8340Tt0.m7799f(strM25335J)) {
                    return C8340Tt0.m7798e(strM25335J);
                }
            }
        }
        return null;
    }
}
