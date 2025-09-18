package defpackage;

import android.hardware.camera2.CameraManager;

/* renamed from: wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7855wm extends CameraManager.AvailabilityCallback {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ C0212Cm c;

    public C7855wm(C0212Cm c0212Cm, String str) {
        this.c = c0212Cm;
        this.a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.L == 4) {
                this.c.K(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
