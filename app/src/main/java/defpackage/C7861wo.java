package defpackage;

import android.hardware.camera2.CameraManager;

/* renamed from: wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7861wo extends CameraManager.AvailabilityCallback {
    public final ExecutorC5715lY0 a;
    public final C7855wm b;
    public final Object c = new Object();
    public boolean d = false;

    public C7861wo(ExecutorC5715lY0 executorC5715lY0, C7855wm c7855wm) {
        this.a = executorC5715lY0;
        this.b = c7855wm;
    }

    public final void a() {
        synchronized (this.c) {
            this.d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new G4(14, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new RunnableC7671vo(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new RunnableC7671vo(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
