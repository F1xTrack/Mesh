package defpackage;

import android.hardware.camera2.CameraDevice;

/* renamed from: ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2202ao implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C7665vm b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ RunnableC2202ao(C7665vm c7665vm, CameraDevice cameraDevice, int i) {
        this.a = i;
        this.b = c7665vm;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CameraDevice.StateCallback) this.b.b).onClosed(this.c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.b.b).onDisconnected(this.c);
                break;
            default:
                ((CameraDevice.StateCallback) this.b.b).onOpened(this.c);
                break;
        }
    }
}
