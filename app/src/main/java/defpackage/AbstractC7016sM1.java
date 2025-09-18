package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7016sM1 {
    public static C2541ca a;

    public static ArrayList d(Context context) {
        O90.f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = MN.a;
        }
        List listY = AbstractC8069xu.y(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            String str2 = runningAppProcessInfo.processName;
            O90.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new DD0(O90.a(runningAppProcessInfo.processName, str), runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2));
        }
        return arrayList2;
    }

    public static synchronized void g(C2541ca c2541ca) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = c2541ca;
    }

    public abstract boolean a(AbstractC2243b1 abstractC2243b1, X0 x0, X0 x02);

    public abstract boolean b(AbstractC2243b1 abstractC2243b1, Object obj, Object obj2);

    public abstract boolean c(AbstractC2243b1 abstractC2243b1, C2052a1 c2052a1, C2052a1 c2052a12);

    public abstract void e(C2052a1 c2052a1, C2052a1 c2052a12);

    public abstract void f(C2052a1 c2052a1, Thread thread);
}
