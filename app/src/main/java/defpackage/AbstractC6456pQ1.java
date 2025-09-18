package defpackage;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: pQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6456pQ1 {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        AbstractC8235ym.j("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap map;
        Bundle bundle = new Bundle();
        synchronized (AbstractC6456pQ1.class) {
            map = a;
            map.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
