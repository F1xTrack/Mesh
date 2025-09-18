package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PY0 {
    public static final PY0 a = new PY0();
    public static final C1304Qm0 b;

    static {
        C6109nc0 c6109nc0 = new C6109nc0();
        c6109nc0.a(OY0.class, C5917mc.a);
        c6109nc0.a(WY0.class, C6108nc.a);
        c6109nc0.a(HC.class, C5535kc.a);
        c6109nc0.a(C2267b8.class, C5344jc.a);
        c6109nc0.a(C3702f4.class, C4377ic.a);
        c6109nc0.a(DD0.class, C5726lc.a);
        c6109nc0.d = true;
        b = new C1304Qm0(22, c6109nc0);
    }

    public static C2267b8 a(MU mu) {
        Object next;
        DD0 dd0;
        String myProcessName;
        mu.a();
        Context context = mu.a;
        O90.e(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        mu.a();
        String str = mu.c.b;
        O90.e(str, "firebaseApp.options.applicationId");
        String str2 = Build.MODEL;
        O90.e(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        O90.e(str3, "RELEASE");
        O90.e(packageName, "packageName");
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? strValueOf : str4;
        String str6 = Build.MANUFACTURER;
        O90.e(str6, "MANUFACTURER");
        mu.a();
        int iMyPid = Process.myPid();
        Iterator it = AbstractC7016sM1.d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DD0) next).b == iMyPid) {
                break;
            }
        }
        DD0 dd02 = (DD0) next;
        if (dd02 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                myProcessName = Process.myProcessName();
                O90.e(myProcessName, "myProcessName()");
            } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            dd0 = new DD0(false, iMyPid, 0, myProcessName);
        } else {
            dd0 = dd02;
        }
        mu.a();
        return new C2267b8(str, str2, str3, new C3702f4(packageName, str5, strValueOf, str6, dd0, AbstractC7016sM1.d(context)));
    }
}
