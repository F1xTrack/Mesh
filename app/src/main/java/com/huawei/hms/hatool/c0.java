package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import defpackage.AbstractC8235ym;
import java.io.File;

/* loaded from: classes.dex */
public class c0 {
    public static boolean a(Context context) {
        return System.currentTimeMillis() - d.a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    public static boolean a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        v.f("hmsSdk", "not have read phone permission!");
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context context, String str, int i) {
        String str2 = d.c(context, str) + ".xml";
        File file = new File(context.getFilesDir(), AbstractC8235ym.v("../shared_prefs/", str2));
        if (!file.exists()) {
            file = new File(context.getFilesDir(), AbstractC8235ym.v("../../shared_prefs/", context.getPackageName() + "_" + str2));
        }
        long length = file.length();
        if (length <= i) {
            return false;
        }
        v.c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    public static boolean a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            v.f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
