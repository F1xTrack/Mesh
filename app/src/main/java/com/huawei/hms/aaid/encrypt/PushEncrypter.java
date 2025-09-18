package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.AbstractC2208l;
import java.io.UnsupportedEncodingException;
import p000.L12;
import p000.RM1;

/* loaded from: classes.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM12376b = AbstractC2208l.m12376b(context);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM12376b)) {
            return "";
        }
        byte[] bArrM4864b = L12.m4864b(strM12376b);
        return bArrM4864b.length < 16 ? "" : RM1.m7003a(str, bArrM4864b);
    }

    public static String encrypter(Context context, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strM12376b = AbstractC2208l.m12376b(context);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strM12376b)) {
            return "";
        }
        byte[] bArrM4864b = L12.m4864b(strM12376b);
        return bArrM4864b.length < 16 ? "" : RM1.m7005c(str, bArrM4864b);
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : RM1.m7005c(str, AbstractC2208l.m12372a(context));
    }
}
