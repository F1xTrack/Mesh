package p000;

import android.hardware.camera2.CameraManager;

/* renamed from: wm */
/* loaded from: classes.dex */
public final class C7096wm extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final String f45080a;

    /* renamed from: b */
    public boolean f45081b = true;

    /* renamed from: c */
    public final /* synthetic */ C0175Cm f45082c;

    public C7096wm(C0175Cm c0175Cm, String str) {
        this.f45082c = c0175Cm;
        this.f45080a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f45080a.equals(str)) {
            this.f45081b = true;
            if (this.f45082c.f1621L == 4) {
                this.f45082c.m1324K(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f45080a.equals(str)) {
            this.f45081b = false;
        }
    }
}
