package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* renamed from: cf */
/* loaded from: classes.dex */
public final class C1861cf {

    /* renamed from: a */
    public final boolean f17676a;

    public C1861cf() {
        this.f17676a = AbstractC6878tJ.f42992a.m17864z0(GetAvailableKeysNeedsOnInit.class) != null;
    }

    /* renamed from: a */
    public final List m10822a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, String str, CameraCharacteristics cameraCharacteristics, Context context) {
        boolean z = this.f17676a;
        if (z) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (z) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
