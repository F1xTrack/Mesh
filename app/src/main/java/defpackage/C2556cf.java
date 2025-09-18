package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* renamed from: cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2556cf {
    public final boolean a;

    public C2556cf() {
        this.a = AbstractC7196tJ.a.z0(GetAvailableKeysNeedsOnInit.class) != null;
    }

    public final List a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, String str, CameraCharacteristics cameraCharacteristics, Context context) {
        boolean z = this.a;
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
