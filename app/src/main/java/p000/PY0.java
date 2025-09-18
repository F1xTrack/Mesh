package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PY0 {

    /* renamed from: a */
    public static final PY0 f9130a = new PY0();

    /* renamed from: b */
    public static final C8170Qm0 f9131b;

    static {
        C10415nc0 c10415nc0 = new C10415nc0();
        c10415nc0.mo884a(OY0.class, C6437mc.f37788a);
        c10415nc0.mo884a(WY0.class, C6500nc.f38394a);
        c10415nc0.mo884a(C0454HC.class, C6311kc.f36568a);
        c10415nc0.mo884a(C1766b8.class, C6248jc.f35276a);
        c10415nc0.mo884a(C4030f4.class, C4253ic.f29364a);
        c10415nc0.mo884a(DD0.class, C6374lc.f37184a);
        c10415nc0.f38409d = true;
        f9131b = new C8170Qm0(22, c10415nc0);
    }

    /* renamed from: a */
    public static C1766b8 m6383a(C0786MU c0786mu) {
        Object next;
        DD0 dd0;
        String myProcessName;
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
        O90.m5967e(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c0786mu.m5379a();
        String str = c0786mu.f7176c.f27219b;
        O90.m5967e(str, "firebaseApp.options.applicationId");
        String str2 = Build.MODEL;
        O90.m5967e(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        O90.m5967e(str3, "RELEASE");
        O90.m5967e(packageName, "packageName");
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? strValueOf : str4;
        String str6 = Build.MANUFACTURER;
        O90.m5967e(str6, "MANUFACTURER");
        c0786mu.m5379a();
        int iMyPid = Process.myPid();
        Iterator it = AbstractC11024sM1.m24715d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DD0) next).f1899b == iMyPid) {
                break;
            }
        }
        DD0 dd02 = (DD0) next;
        if (dd02 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                myProcessName = Process.myProcessName();
                O90.m5967e(myProcessName, "myProcessName()");
            } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            dd0 = new DD0(false, iMyPid, 0, myProcessName);
        } else {
            dd0 = dd02;
        }
        c0786mu.m5379a();
        return new C1766b8(str, str2, str3, new C4030f4(packageName, str5, strValueOf, str6, dd0, AbstractC11024sM1.m24715d(context)));
    }
}
