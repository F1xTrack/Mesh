package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: Nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036Nb {
    public final boolean a;
    public boolean b;

    public C1036Nb() {
        this.a = false;
        this.b = false;
    }

    public C1036Nb(C3513e41 c3513e41, int i) {
        boolean z;
        switch (i) {
            case 1:
                this.b = false;
                this.a = c3513e41.z0(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 2:
            default:
                this.a = c3513e41.x0(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = AbstractC7768wJ.a.z0(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
            case 3:
                Iterator it = c3513e41.B0(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                        z = true;
                    }
                }
                this.a = z;
                this.b = c3513e41.x0(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
        }
    }
}
