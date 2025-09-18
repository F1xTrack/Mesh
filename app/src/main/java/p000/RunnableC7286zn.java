package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;

/* renamed from: zn */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7286zn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46999a = 1;

    /* renamed from: b */
    public final /* synthetic */ long f47000b;

    /* renamed from: c */
    public final /* synthetic */ Object f47001c;

    /* renamed from: d */
    public final /* synthetic */ Object f47002d;

    /* renamed from: e */
    public final /* synthetic */ Object f47003e;

    /* renamed from: f */
    public final /* synthetic */ Object f47004f;

    public /* synthetic */ RunnableC7286zn(C6447mm c6447mm, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.f47001c = c6447mm;
        this.f47002d = cameraCaptureSession;
        this.f47003e = captureRequest;
        this.f47004f = surface;
        this.f47000b = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f46999a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f47001c).f37864b).onCaptureBufferLost((CameraCaptureSession) this.f47002d, (CaptureRequest) this.f47003e, (Surface) this.f47004f, this.f47000b);
                break;
            default:
                ((C2313f0) this.f47001c).m13000a((String) this.f47002d, (String) this.f47003e, this.f47000b, (Runnable) this.f47004f);
                break;
        }
    }

    public /* synthetic */ RunnableC7286zn(C2313f0 c2313f0, String str, String str2, long j, Runnable runnable) {
        this.f47001c = c2313f0;
        this.f47002d = str;
        this.f47003e = str2;
        this.f47000b = j;
        this.f47004f = runnable;
    }
}
