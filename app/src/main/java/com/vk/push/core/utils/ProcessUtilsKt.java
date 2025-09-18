package com.vk.push.core.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import defpackage.AbstractC0872Ky;
import defpackage.AbstractC7538v51;
import defpackage.AbstractC8069xu;
import defpackage.O90;
import defpackage.OS0;
import defpackage.RQ1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "", "isMainProcess", "(Landroid/content/Context;)Z", "", "pid", "", "getPackageNameForPid", "(Landroid/content/Context;I)Ljava/lang/String;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessUtilsKt {
    public static final String getPackageNameForPid(Context context, int i) {
        Object objB;
        Object next;
        String str;
        O90.f(context, "<this>");
        try {
            Context applicationContext = context.getApplicationContext();
            O90.e(applicationContext, "applicationContext");
            ActivityManager activityManager = (ActivityManager) AbstractC0872Ky.b(applicationContext, ActivityManager.class);
            objB = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        if (objB instanceof OS0) {
            objB = null;
        }
        List list = (List) objB;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).pid == i) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) {
            return null;
        }
        return (String) AbstractC8069xu.C(AbstractC7538v51.O(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6));
    }

    public static final boolean isMainProcess(Context context) {
        String processName;
        Object next;
        Object objInvoke;
        O90.f(context, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Class.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                try {
                    Context applicationContext = context.getApplicationContext();
                    O90.e(applicationContext, "applicationContext");
                    ActivityManager activityManager = (ActivityManager) AbstractC0872Ky.b(applicationContext, ActivityManager.class);
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                    if (runningAppProcesses != null) {
                        int iMyPid = Process.myPid();
                        String packageName = context.getPackageName();
                        Iterator<T> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                            if (runningAppProcessInfo.pid == iMyPid && O90.a(runningAppProcessInfo.processName, packageName)) {
                                break;
                            }
                        }
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo2 != null) {
                            processName = runningAppProcessInfo2.processName;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
            }
        }
        return O90.a(processName, context.getPackageName());
    }
}
