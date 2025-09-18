package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.p1;
import java.io.IOException;

/* renamed from: xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8048xn implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC8048xn(C5947mm c5947mm, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.d = c5947mm;
        this.e = cameraCaptureSession;
        this.f = captureRequest;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.d).b).onCaptureStarted((CameraCaptureSession) this.e, (CaptureRequest) this.f, this.b, this.c);
                break;
            default:
                ((f0) this.d).a(this.b, (String) this.e, (p1.a) this.f, this.c);
                break;
        }
    }

    public /* synthetic */ RunnableC8048xn(f0 f0Var, long j, String str, p1.a aVar, long j2) {
        this.d = f0Var;
        this.b = j;
        this.e = str;
        this.f = aVar;
        this.c = j2;
    }
}
