package defpackage;

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
    public static String a(String str, byte[] bArr) throws UnsupportedEncodingException {
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
        byte[] bArrB = L12.b(str2);
        if (TextUtils.isEmpty(str3) || bArr.length < 16 || bArrB.length < 16) {
            return "";
        }
        try {
            return new String(b(L12.b(str3), bArr, bArrB), "UTF-8");
        } catch (UnsupportedEncodingException e3) {
            e3.getMessage();
            return "";
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
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

    public static String c(String str, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrD;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        byte[] bArrB = AbstractC8353zO.b(16);
        if (TextUtils.isEmpty(str)) {
            bArrD = new byte[0];
        } else if (bArr.length < 16) {
            bArrD = new byte[0];
        } else if (bArrB.length < 16) {
            bArrD = new byte[0];
        } else {
            try {
                bArrD = d(str.getBytes("UTF-8"), bArr, bArrB);
            } catch (UnsupportedEncodingException e) {
                e.getMessage();
                bArrD = new byte[0];
            }
        }
        if (bArrD == null || bArrD.length == 0) {
            return "";
        }
        String strA = L12.a(bArrB);
        String strA2 = L12.a(bArrD);
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            return "";
        }
        try {
            return strA2.substring(0, 6) + strA.substring(0, 6) + strA2.substring(6, 10) + strA.substring(6, 16) + strA2.substring(10, 16) + strA.substring(16) + strA2.substring(16);
        } catch (Exception e2) {
            e2.getMessage();
            return "";
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
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

    public static C1559Tt0 e(C1559Tt0 c1559Tt0, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c1559Tt0.b) {
            String strC = c1559Tt0.c();
            if (D51.o(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C1559Tt0.e(str2.concat(AbstractC7538v51.J(str, strC)));
                }
                if (!z) {
                    return c1559Tt0;
                }
                String strJ = AbstractC7538v51.J(str, strC);
                if (strJ.length() != 0 && AbstractC3585eS1.c(0, strJ)) {
                    if (strJ.length() != 1 && AbstractC3585eS1.c(1, strJ)) {
                        Iterator it = new C3909g90(0, strJ.length() - 1, 1).iterator();
                        while (true) {
                            C3718f90 c3718f90 = (C3718f90) it;
                            if (!c3718f90.c) {
                                next = null;
                                break;
                            }
                            next = c3718f90.next();
                            if (!AbstractC3585eS1.c(((Number) next).intValue(), strJ)) {
                                break;
                            }
                        }
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strJ.substring(0, iIntValue);
                            O90.e(strSubstring, "substring(...)");
                            String strE = AbstractC3585eS1.e(strSubstring);
                            String strSubstring2 = strJ.substring(iIntValue);
                            O90.e(strSubstring2, "substring(...)");
                            strJ = strE.concat(strSubstring2);
                        } else {
                            strJ = AbstractC3585eS1.e(strJ);
                        }
                    } else if (strJ.length() != 0 && 'A' <= (cCharAt2 = strJ.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strJ.substring(1);
                        O90.e(strSubstring3, "substring(...)");
                        strJ = lowerCase + strSubstring3;
                    }
                }
                if (C1559Tt0.f(strJ)) {
                    return C1559Tt0.e(strJ);
                }
            }
        }
        return null;
    }
}
