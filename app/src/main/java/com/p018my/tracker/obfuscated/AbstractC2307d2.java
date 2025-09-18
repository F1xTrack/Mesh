package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.my.tracker.obfuscated.d2 */
/* loaded from: classes2.dex */
public abstract class AbstractC2307d2 {
    /* renamed from: a */
    public static Object m12868a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    /* renamed from: a */
    public static String m12869a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        AbstractC2391y2.m13568a("SystemUtils: value in system properties is null for " + str);
        return null;
    }
}
