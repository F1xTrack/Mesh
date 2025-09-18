package p000;

import android.os.Bundle;
import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: pQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10648pQ1 {

    /* renamed from: a */
    public static final HashMap f40073a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f40073a = new HashMap();
        AbstractC7222ym.m26233j("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m23784a() {
        HashMap map;
        Bundle bundle = new Bundle();
        synchronized (AbstractC10648pQ1.class) {
            map = f40073a;
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
