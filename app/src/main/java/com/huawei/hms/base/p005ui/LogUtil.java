package com.huawei.hms.base.p005ui;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class LogUtil {

    /* renamed from: a */
    private static final Pattern f18865a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    private static String m11560a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(m11559a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static void m11562e(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m11560a(str2, z);
    }

    /* renamed from: e */
    public static void m11561e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m11560a(str2, false);
    }

    /* renamed from: a */
    private static String m11559a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (f18865a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i % 2 == 0) {
                    cCharAt = '*';
                }
                i++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
