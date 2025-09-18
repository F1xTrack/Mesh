package p000;

import android.hardware.camera2.CameraManager;

/* renamed from: wo */
/* loaded from: classes.dex */
public final class C7098wo extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final ExecutorC10151lY0 f45108a;

    /* renamed from: b */
    public final C7096wm f45109b;

    /* renamed from: c */
    public final Object f45110c = new Object();

    /* renamed from: d */
    public boolean f45111d = false;

    public C7098wo(ExecutorC10151lY0 executorC10151lY0, C7096wm c7096wm) {
        this.f45108a = executorC10151lY0;
        this.f45109b = c7096wm;
    }

    /* renamed from: a */
    public final void m25703a() {
        synchronized (this.f45110c) {
            this.f45111d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f45110c) {
            try {
                if (!this.f45111d) {
                    this.f45108a.execute(new RunnableC0383G4(14, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f45110c) {
            try {
                if (!this.f45111d) {
                    this.f45108a.execute(new RunnableC7035vo(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f45110c) {
            try {
                if (!this.f45111d) {
                    this.f45108a.execute(new RunnableC7035vo(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
