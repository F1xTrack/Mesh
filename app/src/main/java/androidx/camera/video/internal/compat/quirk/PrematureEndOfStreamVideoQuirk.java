package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import p000.CG0;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;", "LCG0;", "<init>", "()V", "camera-video_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class PrematureEndOfStreamVideoQuirk implements CG0 {

    /* renamed from: a */
    public static final PrematureEndOfStreamVideoQuirk f16047a = new PrematureEndOfStreamVideoQuirk();

    /* renamed from: b */
    public static final boolean f16048b;

    static {
        f16048b = "OPPO".equalsIgnoreCase(Build.BRAND) && "CPH1931".equalsIgnoreCase(Build.MODEL);
    }

    private PrematureEndOfStreamVideoQuirk() {
    }
}
