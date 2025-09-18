package p000;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: An */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0050An implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f369a;

    /* renamed from: b */
    public final /* synthetic */ C0113Bn f370b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f371c;

    public /* synthetic */ RunnableC0050An(C0113Bn c0113Bn, CameraCaptureSession cameraCaptureSession, int i) {
        this.f369a = i;
        this.f370b = c0113Bn;
        this.f371c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f369a) {
            case 0:
                this.f370b.f1023a.onActive(this.f371c);
                break;
            case 1:
                this.f370b.f1023a.onClosed(this.f371c);
                break;
            case 2:
                this.f370b.f1023a.onCaptureQueueEmpty(this.f371c);
                break;
            case 3:
                this.f370b.f1023a.onConfigured(this.f371c);
                break;
            case 4:
                this.f370b.f1023a.onReady(this.f371c);
                break;
            default:
                this.f370b.f1023a.onConfigureFailed(this.f371c);
                break;
        }
    }
}
