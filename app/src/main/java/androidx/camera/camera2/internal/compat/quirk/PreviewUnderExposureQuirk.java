package androidx.camera.camera2.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import p000.CG0;
import p000.D51;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Landroidx/camera/camera2/internal/compat/quirk/PreviewUnderExposureQuirk;", "LCG0;", "<init>", "()V", "camera-camera2_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PreviewUnderExposureQuirk implements CG0 {

    /* renamed from: a */
    public static final PreviewUnderExposureQuirk f15947a = new PreviewUnderExposureQuirk();

    /* renamed from: b */
    public static final boolean f15948b = D51.m1551j(Build.BRAND, "TCL");

    private PreviewUnderExposureQuirk() {
    }
}
