package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.C2354p1;
import java.io.IOException;

/* renamed from: xn */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7160xn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45781a = 1;

    /* renamed from: b */
    public final /* synthetic */ long f45782b;

    /* renamed from: c */
    public final /* synthetic */ long f45783c;

    /* renamed from: d */
    public final /* synthetic */ Object f45784d;

    /* renamed from: e */
    public final /* synthetic */ Object f45785e;

    /* renamed from: f */
    public final /* synthetic */ Object f45786f;

    public /* synthetic */ RunnableC7160xn(C6447mm c6447mm, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f45784d = c6447mm;
        this.f45785e = cameraCaptureSession;
        this.f45786f = captureRequest;
        this.f45782b = j;
        this.f45783c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f45781a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f45784d).f37864b).onCaptureStarted((CameraCaptureSession) this.f45785e, (CaptureRequest) this.f45786f, this.f45782b, this.f45783c);
                break;
            default:
                ((C2313f0) this.f45784d).m12988a(this.f45782b, (String) this.f45785e, (C2354p1.a) this.f45786f, this.f45783c);
                break;
        }
    }

    public /* synthetic */ RunnableC7160xn(C2313f0 c2313f0, long j, String str, C2354p1.a aVar, long j2) {
        this.f45784d = c2313f0;
        this.f45782b = j;
        this.f45785e = str;
        this.f45786f = aVar;
        this.f45783c = j2;
    }
}
