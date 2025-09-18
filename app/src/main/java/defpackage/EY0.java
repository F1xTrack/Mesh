package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.google.android.gms.common.util.ProcessUtils;

/* loaded from: classes.dex */
public abstract class EY0 {
    public static final String a;
    public static final String b;

    static {
        String myProcessName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            myProcessName = Process.myProcessName();
            O90.e(myProcessName, "myProcessName()");
        } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        byte[] bytes = myProcessName.getBytes(AbstractC7680vr.a);
        O90.e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 10);
        a = AbstractC8235ym.k("firebase_session_", strEncodeToString, "_data");
        b = AbstractC8235ym.k("firebase_session_", strEncodeToString, "_settings");
    }
}
