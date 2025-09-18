package p000;

import android.hardware.camera2.CameraDevice;

/* renamed from: ao */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1745ao implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16600a;

    /* renamed from: b */
    public final /* synthetic */ C7033vm f16601b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f16602c;

    public /* synthetic */ RunnableC1745ao(C7033vm c7033vm, CameraDevice cameraDevice, int i) {
        this.f16600a = i;
        this.f16601b = c7033vm;
        this.f16602c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16600a) {
            case 0:
                ((CameraDevice.StateCallback) this.f16601b.f44519b).onClosed(this.f16602c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f16601b.f44519b).onDisconnected(this.f16602c);
                break;
            default:
                ((CameraDevice.StateCallback) this.f16601b.f44519b).onOpened(this.f16602c);
                break;
        }
    }
}
