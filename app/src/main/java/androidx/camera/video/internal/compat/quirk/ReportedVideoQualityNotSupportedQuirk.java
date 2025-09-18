package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;
import p000.C6630pe;
import p000.InterfaceC6766ro;

/* loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    /* renamed from: d */
    public static boolean m9950d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: e */
    public static boolean m9951e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m9952f() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: g */
    public static boolean m9953g() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* renamed from: a */
    public final boolean mo9949a(InterfaceC6766ro interfaceC6766ro, C6630pe c6630pe) {
        if (m9950d() || m9951e()) {
            return c6630pe == C6630pe.f40251g;
        }
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return c6630pe == C6630pe.f40249e || c6630pe == C6630pe.f40250f;
        }
        if (m9952f()) {
            return interfaceC6766ro.mo2398j() == 0 && (c6630pe == C6630pe.f40250f || c6630pe == C6630pe.f40249e);
        }
        if (m9953g()) {
            return interfaceC6766ro.mo2398j() == 1 && c6630pe == C6630pe.f40251g;
        }
        return false;
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    /* renamed from: b */
    public final boolean mo9885b() {
        return m9950d() || m9951e() || m9952f() || m9953g();
    }
}
