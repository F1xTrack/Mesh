package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.O2 */
/* loaded from: classes2.dex */
public final class C2819O2 {

    /* renamed from: a */
    public static final /* synthetic */ int f21836a = 0;

    static {
        Pattern.compile("[^0-9a-zA-Z,`’\\.\\+\\-'\\s\"]");
        Pattern.compile("\\s+");
    }

    /* renamed from: a */
    public static String m14686a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: b */
    public static String m14688b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static byte[] m14689c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: d */
    public static byte[] m14690d(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: a */
    public static String m14685a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    /* renamed from: a */
    public static String m14687a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }
}
