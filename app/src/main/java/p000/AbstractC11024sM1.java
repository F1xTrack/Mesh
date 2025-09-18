package p000;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11024sM1 {

    /* renamed from: a */
    public static C1856ca f42378a;

    /* renamed from: d */
    public static ArrayList m24715d(Context context) {
        O90.m5968f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C0779MN.f7117a;
        }
        List listM25997y = AbstractC7167xu.m25997y(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM25997y) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            String str2 = runningAppProcessInfo.processName;
            O90.m5967e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new DD0(O90.m5963a(runningAppProcessInfo.processName, str), runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2));
        }
        return arrayList2;
    }

    /* renamed from: g */
    public static synchronized void m24716g(C1856ca c1856ca) {
        if (f42378a != null) {
            throw new IllegalStateException("init() already called");
        }
        f42378a = c1856ca;
    }

    /* renamed from: a */
    public abstract boolean mo9197a(AbstractC1759b1 abstractC1759b1, C1448X0 c1448x0, C1448X0 c1448x02);

    /* renamed from: b */
    public abstract boolean mo9198b(AbstractC1759b1 abstractC1759b1, Object obj, Object obj2);

    /* renamed from: c */
    public abstract boolean mo9199c(AbstractC1759b1 abstractC1759b1, C1638a1 c1638a1, C1638a1 c1638a12);

    /* renamed from: e */
    public abstract void mo9200e(C1638a1 c1638a1, C1638a1 c1638a12);

    /* renamed from: f */
    public abstract void mo9201f(C1638a1 c1638a1, Thread thread);
}
