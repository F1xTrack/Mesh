package com.huawei.hms.push;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.plugin.PushProxy;
import com.huawei.hms.push.utils.ha.PushAnalyticsCenter;
import com.huawei.hms.push.utils.ha.PushBaseAnalytics;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class l {
    private static final String a = "l";

    public static void a(Context context, String str, String str2, String str3) {
        PushBaseAnalytics pushAnalytics = PushAnalyticsCenter.getInstance().getPushAnalytics();
        if (pushAnalytics == null) {
            return;
        }
        Bundle bundleA = a(context, str, str2);
        HMSLog.i(a, "eventId:" + str3);
        pushAnalytics.report(context, str3, bundleA);
    }

    private static Bundle a(Context context, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("sdkVer", String.valueOf(61200300));
        bundle.putString("pkgName", context.getPackageName());
        bundle.putString("aaid", HmsInstanceId.getInstance(context).getId());
        PushProxy proxy = ProxyCenter.getProxy();
        if (proxy != null) {
            bundle.putString("proxyType", proxy.getProxyType());
        }
        bundle.putString("msgId", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("analyticInfo", str2);
        }
        return bundle;
    }

    public static void a(Context context, Bundle bundle, String str) {
        PushBaseAnalytics pushAnalytics;
        if (bundle == null || (pushAnalytics = PushAnalyticsCenter.getInstance().getPushAnalytics()) == null) {
            return;
        }
        bundle.putString("sdk_version", String.valueOf(61200300));
        HMSLog.i(a, "eventId:" + str);
        pushAnalytics.report(context, str, bundle);
    }
}
