package com.huawei.hms.aaid.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.AbstractC2201e;
import com.huawei.hms.opendevice.AbstractC2206j;
import com.huawei.hms.opendevice.C2205i;
import com.huawei.hms.support.log.HMSLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public class BaseUtils {
    private BaseUtils() {
    }

    public static void clearSubjectIds(Context context) {
        C2205i.m12355a(context).removeKey("subjectId");
    }

    public static void delLocalToken(Context context, String str) {
        C2205i.m12355a(context).m12361c(str);
    }

    public static void deleteAllTokenCache(Context context) {
        C2205i.m12355a(context).m12357a();
    }

    public static void deleteCacheData(Context context, String str) {
        C2205i.m12355a(context).removeKey(str);
    }

    public static String getCacheData(Context context, String str, boolean z) {
        return z ? C2205i.m12355a(context).m12356a(str) : C2205i.m12355a(context).getString(str);
    }

    public static String getLocalToken(Context context, String str) {
        return C2205i.m12355a(context).m12359b(str);
    }

    public static boolean getProxyInit(Context context) {
        return C2205i.m12355a(context).getBoolean("_proxy_init");
    }

    public static String[] getSubjectIds(Context context) {
        String string = C2205i.m12355a(context).getString("subjectId");
        return TextUtils.isEmpty(string) ? new String[0] : string.split(StringUtils.COMMA);
    }

    public static void initSecret(Context context) {
        AbstractC2206j.m12362a(context);
    }

    public static boolean isMainProc(Context context) throws IOException {
        String strM12340a = AbstractC2201e.m12340a(context);
        String str = context.getApplicationInfo().processName;
        HMSLog.m12622i("BaseUtils", "main process name: " + str + ", current process name: " + strM12340a);
        return str.equals(strM12340a);
    }

    public static boolean saveCacheData(Context context, String str, String str2, boolean z) {
        return z ? C2205i.m12355a(context).m12358a(str, str2) : C2205i.m12355a(context).saveString(str, str2);
    }

    public static void saveProxyInit(Context context, boolean z) {
        C2205i.m12355a(context).saveBoolean("_proxy_init", z);
    }

    public static void saveToken(Context context, String str, String str2) {
        C2205i.m12355a(context).m12360b(str, str2);
    }
}
