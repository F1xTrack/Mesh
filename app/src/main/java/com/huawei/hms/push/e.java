package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.i("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    private static boolean b() {
        return true;
    }

    public static boolean c(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                HMSLog.d("PushSelfShowLog", str.concat(" is installed"));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean d() {
        return true;
    }

    public static Intent b(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static Boolean a(Context context, String str, Intent intent) {
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
            HMSLog.e("PushSelfShowLog", e.toString(), e);
        }
        return Boolean.FALSE;
    }

    public static int a() {
        return b() ? 67108864 : 134217728;
    }

    public static boolean a(Context context) {
        return PackageConstants.SERVICES_PACKAGE.equals(context.getPackageName());
    }
}
