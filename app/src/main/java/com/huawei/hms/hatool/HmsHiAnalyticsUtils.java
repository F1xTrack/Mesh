package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class HmsHiAnalyticsUtils {
    public static void enableLog() {
        C2134c.m11941a();
    }

    public static boolean getInitFlag() {
        return AbstractC2128a.m11902b();
    }

    public static void init(Context context, boolean z, boolean z2, boolean z3, String str, String str2) {
        new C2131b(context).m11922a(z).m11925c(z2).m11924b(z3).m11920a(0, str).m11920a(1, str).m11921a(str2).m11923a();
    }

    public static void onEvent(Context context, String str, String str2) {
        AbstractC2128a.m11900a(context, str, str2);
    }

    public static void onReport() {
        AbstractC2128a.m11903c();
    }

    public static void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC2128a.m11901b(i, str, linkedHashMap);
    }

    public static void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC2128a.m11899a(i, str, linkedHashMap);
    }
}
