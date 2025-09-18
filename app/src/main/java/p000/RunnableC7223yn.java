package p000;

import android.hardware.camera2.CameraCaptureSession;
import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: yn */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7223yn implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f46452a;

    /* renamed from: b */
    public final /* synthetic */ int f46453b;

    /* renamed from: c */
    public final /* synthetic */ long f46454c;

    /* renamed from: d */
    public final /* synthetic */ Object f46455d;

    /* renamed from: e */
    public final /* synthetic */ Object f46456e;

    public /* synthetic */ RunnableC7223yn(Object obj, Object obj2, int i, long j, int i2) {
        this.f46452a = i2;
        this.f46455d = obj;
        this.f46456e = obj2;
        this.f46453b = i;
        this.f46454c = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f46452a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f46455d).f37864b).onCaptureSequenceCompleted((CameraCaptureSession) this.f46456e, this.f46453b, this.f46454c);
                break;
            default:
                ((C2313f0) this.f46455d).m13004a((Map) this.f46456e, this.f46453b, this.f46454c);
                break;
        }
    }
}
