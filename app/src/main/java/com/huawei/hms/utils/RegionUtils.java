package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;

/* loaded from: classes2.dex */
public class RegionUtils {
    /* renamed from: a */
    private static String m12713a(Context context) {
        return (context == null || context.getApplicationContext() == null) ? "" : GrsApp.getInstance().getIssueCountryCode(context);
    }

    public static boolean isChinaROM(Context context) {
        return "CN".equalsIgnoreCase(m12713a(context));
    }
}
