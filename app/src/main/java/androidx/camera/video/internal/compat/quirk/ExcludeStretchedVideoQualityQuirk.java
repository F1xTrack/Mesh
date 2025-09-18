package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p000.C6630pe;
import p000.InterfaceC6766ro;

/* loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    /* renamed from: d */
    public static boolean m9947d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    /* renamed from: e */
    public static boolean m9948e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* renamed from: a */
    public final boolean mo9949a(InterfaceC6766ro interfaceC6766ro, C6630pe c6630pe) {
        String str = Build.BRAND;
        return "Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL) ? c6630pe == C6630pe.f40250f || c6630pe == C6630pe.f40251g : (("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || m9948e() || m9947d())))) && c6630pe == C6630pe.f40250f;
    }
}
