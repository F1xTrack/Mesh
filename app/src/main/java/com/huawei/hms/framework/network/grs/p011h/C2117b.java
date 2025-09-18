package com.huawei.hms.framework.network.grs.p011h;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.framework.network.grs.h.b */
/* loaded from: classes.dex */
public class C2117b {

    /* renamed from: a */
    private static final String f19112a = "b";

    /* renamed from: b */
    private static final Pattern f19113b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    public static String m11862a(String str) {
        return m11863a(str, "SHA-256");
    }

    /* renamed from: b */
    public static String m11865b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 1;
        if (str.length() == 1) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            String str2 = str.charAt(i2) + "";
            if (f19113b.matcher(str2).matches()) {
                if (i % 2 == 0) {
                    str2 = "*";
                }
                i++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static String m11863a(String str, String str2) throws UnsupportedEncodingException {
        String str3;
        String str4;
        try {
        } catch (UnsupportedEncodingException unused) {
            str3 = f19112a;
            str4 = "encrypt UnsupportedEncodingException";
        }
        try {
            return m11864a(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
        } catch (NoSuchAlgorithmException unused2) {
            str3 = f19112a;
            str4 = "encrypt NoSuchAlgorithmException";
            Logger.m11689w(str3, str4);
            return null;
        }
    }

    /* renamed from: a */
    private static String m11864a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
