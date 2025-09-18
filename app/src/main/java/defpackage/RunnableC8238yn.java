package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8238yn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC8238yn(Object obj, Object obj2, int i, long j, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.d).b).onCaptureSequenceCompleted((CameraCaptureSession) this.e, this.b, this.c);
                break;
            default:
                ((f0) this.d).a((Map) this.e, this.b, this.c);
                break;
        }
    }
}
