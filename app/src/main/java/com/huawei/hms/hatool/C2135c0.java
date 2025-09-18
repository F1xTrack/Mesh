package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.hatool.c0 */
/* loaded from: classes.dex */
public class C2135c0 {
    /* renamed from: a */
    public static boolean m11943a(Context context) {
        return System.currentTimeMillis() - C2137d.m11954a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    /* renamed from: a */
    public static boolean m11944a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        C2186v.m12276f("hmsSdk", "not have read phone permission!");
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public static boolean m11945a(Context context, String str, int i) {
        String str2 = C2137d.m11961c(context, str) + ".xml";
        File file = new File(context.getFilesDir(), AbstractC7222ym.m26245v("../shared_prefs/", str2));
        if (!file.exists()) {
            file = new File(context.getFilesDir(), AbstractC7222ym.m26245v("../../shared_prefs/", context.getPackageName() + "_" + str2));
        }
        long length = file.length();
        if (length <= i) {
            return false;
        }
        C2186v.m12271c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    /* renamed from: a */
    public static boolean m11946a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            C2186v.m12276f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
