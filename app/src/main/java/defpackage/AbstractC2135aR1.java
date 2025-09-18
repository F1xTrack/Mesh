package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Map;

/* renamed from: aR1 */
/* loaded from: classes.dex */
public abstract class AbstractC2135aR1 {
    public static C3547eG a(Map map) {
        if (map == null) {
            return new C3547eG(1, 5);
        }
        Object obj = map.get("type");
        String str = obj instanceof String ? (String) obj : null;
        int i = O90.a(str, "kotlin") ? 1 : O90.a(str, "unity") ? 2 : O90.a(str, "flutter") ? 3 : O90.a(str, "unreal-engine") ? 4 : O90.a(str, "godot") ? 5 : O90.a(str, "react-native") ? 6 : 0;
        return new C3547eG(i != 0 ? i : 1, 5);
    }

    public static boolean b(C8051xo c8051xo, String str) throws C6592q80 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c8051xo.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C5950mn e) {
            throw new C6592q80(new C1621Uo(e));
        }
    }
}
