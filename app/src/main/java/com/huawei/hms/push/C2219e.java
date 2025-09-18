package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* renamed from: com.huawei.hms.push.e */
/* loaded from: classes.dex */
public class C2219e {
    /* renamed from: a */
    public static String m12439a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m12622i("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m12442b() {
        return true;
    }

    /* renamed from: c */
    public static boolean m12444c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                HMSLog.m12617d("PushSelfShowLog", str.concat(" is installed"));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m12445d() {
        return true;
    }

    /* renamed from: b */
    public static Intent m12441b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.m12623w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m12443c() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: a */
    public static Boolean m12438a(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                int size = listQueryIntentActivities.size();
                for (int i = 0; i < size; i++) {
                    if (listQueryIntentActivities.get(i).activityInfo != null && str.equals(listQueryIntentActivities.get(i).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e) {
            HMSLog.m12621e("PushSelfShowLog", e.toString(), e);
        }
        return Boolean.FALSE;
    }

    /* renamed from: a */
    public static int m12437a() {
        return m12442b() ? 67108864 : 134217728;
    }

    /* renamed from: a */
    public static boolean m12440a(Context context) {
        return PackageConstants.SERVICES_PACKAGE.equals(context.getPackageName());
    }
}
