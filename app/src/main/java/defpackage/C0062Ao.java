package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* renamed from: Ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062Ao extends C8431zo {
    @Override // defpackage.CC0
    public final Set T0() throws C5950mn {
        try {
            return ((CameraManager) this.b).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new C5950mn(e);
        }
    }
}
