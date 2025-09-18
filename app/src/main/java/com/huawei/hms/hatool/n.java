package com.huawei.hms.hatool;

import android.util.Pair;
import defpackage.AbstractC8353zO;
import defpackage.L12;
import defpackage.RM1;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class n {
    public static final Charset a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String strSubstring = str.substring(0, i);
        return new Pair<>(L12.b(strSubstring), str.substring(i));
    }

    public static String b(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bytes = str.getBytes(a);
        byte[] bArrB = L12.b(str2);
        byte[] bArrB2 = AbstractC8353zO.b(16);
        byte[] bArrD = RM1.d(bytes, bArrB, bArrB2);
        byte[] bArr = new byte[bArrB2.length + bArrD.length];
        System.arraycopy(bArrB2, 0, bArr, 0, bArrB2.length);
        System.arraycopy(bArrD, 0, bArr, bArrB2.length, bArrD.length);
        return L12.a(bArr);
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> pairA = a(str, 32);
        return new String(RM1.b(L12.b((String) pairA.second), L12.b(str2), (byte[]) pairA.first), a);
    }

    public static String a(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal;
        if (bArr == null || bArr.length == 0 || str == null) {
            v.b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] bArrB = L12.b(str);
        if (bArrB.length < 16) {
            v.b("AesCipher", "key length is not right");
            return "";
        }
        byte[] bArrB2 = AbstractC8353zO.b(12);
        if (bArr.length == 0) {
            bArrDoFinal = new byte[0];
        } else if (bArrB.length < 16) {
            bArrDoFinal = new byte[0];
        } else if (bArrB2.length < 12) {
            bArrDoFinal = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrB, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArrB2));
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                e.getMessage();
                bArrDoFinal = new byte[0];
                byte[] bArr2 = new byte[bArrB2.length + bArrDoFinal.length];
                System.arraycopy(bArrB2, 0, bArr2, 0, bArrB2.length);
                System.arraycopy(bArrDoFinal, 0, bArr2, bArrB2.length, bArrDoFinal.length);
                return L12.a(bArr2);
            } catch (GeneralSecurityException e2) {
                e2.getMessage();
                bArrDoFinal = new byte[0];
                byte[] bArr22 = new byte[bArrB2.length + bArrDoFinal.length];
                System.arraycopy(bArrB2, 0, bArr22, 0, bArrB2.length);
                System.arraycopy(bArrDoFinal, 0, bArr22, bArrB2.length, bArrDoFinal.length);
                return L12.a(bArr22);
            }
        }
        byte[] bArr222 = new byte[bArrB2.length + bArrDoFinal.length];
        System.arraycopy(bArrB2, 0, bArr222, 0, bArrB2.length);
        System.arraycopy(bArrDoFinal, 0, bArr222, bArrB2.length, bArrDoFinal.length);
        return L12.a(bArr222);
    }
}
