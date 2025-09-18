package com.huawei.hms.hatool;

import android.util.Pair;
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
import p000.AbstractC7261zO;
import p000.L12;
import p000.RM1;

/* renamed from: com.huawei.hms.hatool.n */
/* loaded from: classes.dex */
public class C2167n {

    /* renamed from: a */
    public static final Charset f19258a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Pair<byte[], String> m12130a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String strSubstring = str.substring(0, i);
        return new Pair<>(L12.m4864b(strSubstring), str.substring(i));
    }

    /* renamed from: b */
    public static String m12133b(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bytes = str.getBytes(f19258a);
        byte[] bArrM4864b = L12.m4864b(str2);
        byte[] bArrM26397b = AbstractC7261zO.m26397b(16);
        byte[] bArrM7006d = RM1.m7006d(bytes, bArrM4864b, bArrM26397b);
        byte[] bArr = new byte[bArrM26397b.length + bArrM7006d.length];
        System.arraycopy(bArrM26397b, 0, bArr, 0, bArrM26397b.length);
        System.arraycopy(bArrM7006d, 0, bArr, bArrM26397b.length, bArrM7006d.length);
        return L12.m4863a(bArr);
    }

    /* renamed from: a */
    public static String m12131a(String str, String str2) {
        Pair<byte[], String> pairM12130a = m12130a(str, 32);
        return new String(RM1.m7004b(L12.m4864b((String) pairM12130a.second), L12.m4864b(str2), (byte[]) pairM12130a.first), f19258a);
    }

    /* renamed from: a */
    public static String m12132a(byte[] bArr, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal;
        if (bArr == null || bArr.length == 0 || str == null) {
            C2186v.m12268b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] bArrM4864b = L12.m4864b(str);
        if (bArrM4864b.length < 16) {
            C2186v.m12268b("AesCipher", "key length is not right");
            return "";
        }
        byte[] bArrM26397b = AbstractC7261zO.m26397b(12);
        if (bArr.length == 0) {
            bArrDoFinal = new byte[0];
        } else if (bArrM4864b.length < 16) {
            bArrDoFinal = new byte[0];
        } else if (bArrM26397b.length < 12) {
            bArrDoFinal = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM4864b, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArrM26397b));
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                e.getMessage();
                bArrDoFinal = new byte[0];
                byte[] bArr2 = new byte[bArrM26397b.length + bArrDoFinal.length];
                System.arraycopy(bArrM26397b, 0, bArr2, 0, bArrM26397b.length);
                System.arraycopy(bArrDoFinal, 0, bArr2, bArrM26397b.length, bArrDoFinal.length);
                return L12.m4863a(bArr2);
            } catch (GeneralSecurityException e2) {
                e2.getMessage();
                bArrDoFinal = new byte[0];
                byte[] bArr22 = new byte[bArrM26397b.length + bArrDoFinal.length];
                System.arraycopy(bArrM26397b, 0, bArr22, 0, bArrM26397b.length);
                System.arraycopy(bArrDoFinal, 0, bArr22, bArrM26397b.length, bArrDoFinal.length);
                return L12.m4863a(bArr22);
            }
        }
        byte[] bArr222 = new byte[bArrM26397b.length + bArrDoFinal.length];
        System.arraycopy(bArrM26397b, 0, bArr222, 0, bArrM26397b.length);
        System.arraycopy(bArrDoFinal, 0, bArr222, bArrM26397b.length, bArrDoFinal.length);
        return L12.m4863a(bArr222);
    }
}
