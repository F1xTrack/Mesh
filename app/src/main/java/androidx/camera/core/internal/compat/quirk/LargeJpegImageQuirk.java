package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import p000.CG0;

/* loaded from: classes.dex */
public final class LargeJpegImageQuirk implements CG0 {

    /* renamed from: a */
    public static final HashSet f15959a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* renamed from: b */
    public static final HashSet f15960b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    /* renamed from: d */
    public static boolean m9898d() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f15960b.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
