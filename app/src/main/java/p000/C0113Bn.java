package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: Bn */
/* loaded from: classes.dex */
public final class C0113Bn extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    public final CameraCaptureSession.StateCallback f1023a;

    /* renamed from: b */
    public final Executor f1024b;

    public C0113Bn(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f1024b = executor;
        this.f1023a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f1024b.execute(new RunnableC0050An(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f1024b.execute(new RunnableC8339Ts1(this, cameraCaptureSession, surface, 10));
    }
}
