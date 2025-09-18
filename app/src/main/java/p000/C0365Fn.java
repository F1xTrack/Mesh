package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* renamed from: Fn */
/* loaded from: classes.dex */
public final class C0365Fn extends QQ0 {
    @Override // p000.QQ0
    /* renamed from: I */
    public final Set mo2777I() {
        try {
            return ((CameraCharacteristics) this.f9619a).getPhysicalCameraIds();
        } catch (Exception unused) {
            AbstractC7806Jm0.m4412f("CameraCharacteristicsImpl");
            return Collections.emptySet();
        }
    }
}
