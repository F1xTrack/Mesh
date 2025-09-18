package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: An, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0059An implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0137Bn b;
    public final /* synthetic */ CameraCaptureSession c;

    public /* synthetic */ RunnableC0059An(C0137Bn c0137Bn, CameraCaptureSession cameraCaptureSession, int i) {
        this.a = i;
        this.b = c0137Bn;
        this.c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.onActive(this.c);
                break;
            case 1:
                this.b.a.onClosed(this.c);
                break;
            case 2:
                this.b.a.onCaptureQueueEmpty(this.c);
                break;
            case 3:
                this.b.a.onConfigured(this.c);
                break;
            case 4:
                this.b.a.onReady(this.c);
                break;
            default:
                this.b.a.onConfigureFailed(this.c);
                break;
        }
    }
}
