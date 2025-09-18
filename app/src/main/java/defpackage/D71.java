package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class D71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ E71 b;

    public /* synthetic */ D71(E71 e71, int i) {
        this.a = i;
        this.b = e71;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                E71 e71 = this.b;
                e71.g(e71);
                return;
            default:
                E71 e712 = this.b;
                E71.m();
                AbstractC3377dM1.h(e712.g, "Need to call openCaptureSession before using this API.");
                U41 u41 = e712.b;
                synchronized (u41.a) {
                    ((LinkedHashSet) u41.d).add(e712);
                }
                ((CameraCaptureSession) ((ES1) e712.g.b).b).close();
                e712.d.execute(new D71(e712, 0));
                return;
        }
    }
}
