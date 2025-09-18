package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.CG0;

/* loaded from: classes.dex */
public class ZslDisablerQuirk implements CG0 {

    /* renamed from: a */
    public static final List f15953a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* renamed from: b */
    public static final List f15954b = Arrays.asList("MI 8");

    /* renamed from: d */
    public static boolean m9886d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
