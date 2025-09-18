package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;

/* loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, SurfaceProcessingQuirk {
    /* renamed from: d */
    public static boolean m9880d() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: e */
    public static boolean m9881e() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m9882f() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: g */
    public static boolean m9883g() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m9884h() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    /* renamed from: b */
    public final boolean mo9885b() {
        if (!m9880d() && !m9881e() && !m9884h() && !m9882f()) {
            String str = Build.MODEL;
            if ((!"pixel 4 xl".equalsIgnoreCase(str) || Build.VERSION.SDK_INT != 29) && ((!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto e13".equalsIgnoreCase(str)) && !m9883g())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* renamed from: c */
    public final boolean mo9873c() {
        return m9880d() || m9881e() || m9884h() || m9882f();
    }
}
