package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import p000.AbstractC7222ym;
import p000.CG0;

/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements CG0 {

    /* renamed from: a */
    public static final HashMap f15926a;

    static {
        HashMap map = new HashMap();
        f15926a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: d */
    public static Size m9877d(int i) {
        if (!m9878e()) {
            return null;
        }
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return new Size(1920, 1080);
        }
        if (iM26247x == 1) {
            return new Size(1280, 720);
        }
        if (iM26247x != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    /* renamed from: e */
    public static boolean m9878e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap map = f15926a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
