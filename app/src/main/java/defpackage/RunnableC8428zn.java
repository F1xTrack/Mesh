package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.my.tracker.obfuscated.f0;
import java.io.IOException;

/* renamed from: zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8428zn implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC8428zn(C5947mm c5947mm, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.c = c5947mm;
        this.d = cameraCaptureSession;
        this.e = captureRequest;
        this.f = surface;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.c).b).onCaptureBufferLost((CameraCaptureSession) this.d, (CaptureRequest) this.e, (Surface) this.f, this.b);
                break;
            default:
                ((f0) this.c).a((String) this.d, (String) this.e, this.b, (Runnable) this.f);
                break;
        }
    }

    public /* synthetic */ RunnableC8428zn(f0 f0Var, String str, String str2, long j, Runnable runnable) {
        this.c = f0Var;
        this.d = str;
        this.e = str2;
        this.b = j;
        this.f = runnable;
    }
}
