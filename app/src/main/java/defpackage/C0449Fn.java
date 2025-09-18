package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* renamed from: Fn */
/* loaded from: classes.dex */
public final class C0449Fn extends QQ0 {
    @Override // defpackage.QQ0
    public final Set I() {
        try {
            return ((CameraCharacteristics) this.a).getPhysicalCameraIds();
        } catch (Exception unused) {
            AbstractC0759Jm0.f("CameraCharacteristicsImpl");
            return Collections.emptySet();
        }
    }
}
