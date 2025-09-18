package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import p000.C6630pe;
import p000.InterfaceC6766ro;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    /* renamed from: a */
    public final boolean mo9949a(InterfaceC6766ro interfaceC6766ro, C6630pe c6630pe) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && interfaceC6766ro.mo2398j() == 0 && c6630pe == C6630pe.f40248d;
    }
}
