package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ID0 {
    static {
        O90.m5967e(C1210TE.m7637M("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    /* renamed from: a */
    public static final boolean m3787a(Context context, C6790rv c6790rv) {
        String strM7543a;
        Object next;
        Object objInvoke;
        O90.m5968f(context, "context");
        O90.m5968f(c6790rv, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strM7543a = C1201T5.f11145a.m7543a();
        } else {
            strM7543a = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC7759Io1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                O90.m5965c(objInvoke);
            } catch (Throwable unused) {
                C1210TE.m7634G().getClass();
            }
            if (objInvoke instanceof String) {
                strM7543a = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                O90.m5966d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strM7543a = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return O90.m5963a(strM7543a, context.getApplicationInfo().processName);
    }
}
