package p000;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.google.android.gms.common.util.ProcessUtils;

/* loaded from: classes.dex */
public abstract class EY0 {

    /* renamed from: a */
    public static final String f2745a;

    /* renamed from: b */
    public static final String f2746b;

    static {
        String myProcessName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            myProcessName = Process.myProcessName();
            O90.m5967e(myProcessName, "myProcessName()");
        } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        byte[] bytes = myProcessName.getBytes(AbstractC7038vr.f44561a);
        O90.m5967e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        f2745a = AbstractC7222ym.m26234k("firebase_session_", strEncodeToString, "_data");
        f2746b = AbstractC7222ym.m26234k("firebase_session_", strEncodeToString, "_settings");
    }
}
