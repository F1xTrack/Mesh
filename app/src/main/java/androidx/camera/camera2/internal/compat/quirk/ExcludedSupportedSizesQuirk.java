package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p000.CG0;

/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements CG0 {
    /* renamed from: d */
    public static boolean m9874d() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    /* renamed from: e */
    public static boolean m9875e() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: f */
    public static boolean m9876f() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }
}
