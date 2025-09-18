package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class HiAnalyticsOfCpUtils {

    /* renamed from: a */
    private static HiAnalyticsInstance f19489a;

    /* renamed from: a */
    private static HiAnalyticsInstance m12560a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f19489a = analyticsInstance;
        return analyticsInstance;
    }

    public static void onEvent(Context context, String str, String str2) {
        if (m12560a(context) != null) {
            f19489a.onEvent(context, str, str2);
        }
    }

    public static void onReport(Context context, int i) {
        if (m12560a(context) != null) {
            f19489a.onReport(i);
        }
    }

    public static void onStreamEvent(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m12560a(context) != null) {
            f19489a.onStreamEvent(i, str, linkedHashMap);
        }
    }

    public static void onEvent(Context context, int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m12560a(context) != null) {
            f19489a.onEvent(i, str, linkedHashMap);
        }
    }
}
