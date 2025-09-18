package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Map;

/* renamed from: aR1 */
/* loaded from: classes.dex */
public abstract class AbstractC8725aR1 {
    /* renamed from: a */
    public static C3979eG m9741a(Map map) {
        if (map == null) {
            return new C3979eG(1, 5);
        }
        Object obj = map.get("type");
        String str = obj instanceof String ? (String) obj : null;
        int i = O90.m5963a(str, "kotlin") ? 1 : O90.m5963a(str, "unity") ? 2 : O90.m5963a(str, "flutter") ? 3 : O90.m5963a(str, "unreal-engine") ? 4 : O90.m5963a(str, "godot") ? 5 : O90.m5963a(str, "react-native") ? 6 : 0;
        return new C3979eG(i != 0 ? i : 1, 5);
    }

    /* renamed from: b */
    public static boolean m9742b(C7161xo c7161xo, String str) throws C10739q80 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c7161xo.m25939b(str).m3155a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C6448mn e) {
            throw new C10739q80(new C1309Uo(e));
        }
    }
}
