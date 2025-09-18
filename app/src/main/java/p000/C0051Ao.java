package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* renamed from: Ao */
/* loaded from: classes.dex */
public final class C0051Ao extends C7287zo {
    @Override // p000.CC0
    /* renamed from: T0 */
    public final Set mo323T0() throws C6448mn {
        try {
            return ((CameraManager) this.f1250b).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new C6448mn(e);
        }
    }
}
