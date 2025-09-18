package p000;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class D71 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1857a;

    /* renamed from: b */
    public final /* synthetic */ E71 f1858b;

    public /* synthetic */ D71(E71 e71, int i) {
        this.f1857a = i;
        this.f1858b = e71;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1857a) {
            case 0:
                E71 e71 = this.f1858b;
                e71.mo516g(e71);
                return;
            default:
                E71 e712 = this.f1858b;
                E71.m2035m();
                AbstractC9104dM1.m17549h(e712.f2485g, "Need to call openCaptureSession before using this API.");
                U41 u41 = e712.f2480b;
                synchronized (u41.f11644a) {
                    ((LinkedHashSet) u41.f11647d).add(e712);
                }
                ((CameraCaptureSession) ((ES1) e712.f2485g.f11590b).f2708b).close();
                e712.f2482d.execute(new D71(e712, 0));
                return;
        }
    }
}
