package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import kotlin.Metadata;
import p000.D51;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "camera-video_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {

    /* renamed from: a */
    public static final boolean f16049a;

    static {
        f16049a = D51.m1551j(Build.BRAND, "motorola") && D51.m1551j(Build.MODEL, "motorola edge 20 fusion");
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    /* renamed from: b */
    public final /* synthetic */ boolean mo9885b() {
        return true;
    }
}
