package p000;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* renamed from: Nb */
/* loaded from: classes.dex */
public final class C0856Nb {

    /* renamed from: a */
    public final boolean f7894a;

    /* renamed from: b */
    public boolean f7895b;

    public C0856Nb() {
        this.f7894a = false;
        this.f7895b = false;
    }

    public C0856Nb(C9196e41 c9196e41, int i) {
        boolean z;
        switch (i) {
            case 1:
                this.f7895b = false;
                this.f7894a = c9196e41.m17864z0(AutoFlashUnderExposedQuirk.class) != null;
                break;
            case 2:
            default:
                this.f7894a = c9196e41.m17862x0(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f7895b = AbstractC7067wJ.f44776a.m17864z0(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
            case 3:
                Iterator it = c9196e41.m17838B0(CaptureIntentPreviewQuirk.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (((CaptureIntentPreviewQuirk) it.next()).mo9873c()) {
                        z = true;
                    }
                }
                this.f7894a = z;
                this.f7895b = c9196e41.m17862x0(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
        }
    }
}
