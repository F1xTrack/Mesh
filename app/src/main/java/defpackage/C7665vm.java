package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7665vm extends CameraDevice.StateCallback {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public C7665vm(ExecutorC5715lY0 executorC5715lY0, CameraDevice.StateCallback stateCallback) {
        this.c = executorC5715lY0;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                ((C0212Cm) this.c).u("openCameraConfigAndClose camera closed");
                ((C0365El) this.b).b(null);
                break;
            default:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC2202ao(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                ((C0212Cm) this.c).u("openCameraConfigAndClose camera disconnected");
                ((C0365El) this.b).b(null);
                break;
            default:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC2202ao(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                ((C0212Cm) this.c).u(AbstractC7209tN0.u(i, "openCameraConfigAndClose camera error "));
                ((C0365El) this.b).b(null);
                break;
            default:
                ((ExecutorC5715lY0) this.c).execute(new RunnableC6690qf(this, cameraDevice, i, 4));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                C0212Cm c0212Cm = (C0212Cm) obj;
                c0212Cm.u("openCameraConfigAndClose camera opened");
                C4037gq c4037gq = new C4037gq(c0212Cm.I);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                G70 g70 = new G70(surface);
                AbstractC1500Sz1.l(g70.e).d(new RunnableC6769r4(surface, 18, surfaceTexture), QR1.a());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C0468Ft0 c0468Ft0B = C0468Ft0.b();
                ArrayList arrayList = new ArrayList();
                C0858Kt0 c0858Kt0A = C0858Kt0.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                CM cm = CM.d;
                C1241Pr0 c1241Pr0A = C8211ye.a(g70);
                c1241Pr0A.f = cm;
                linkedHashSet.add(c1241Pr0A.l());
                c0212Cm.u("Start configAndClose.");
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
                ArrayList arrayList10 = new ArrayList(arrayList);
                C6974s81 c6974s81 = C6974s81.b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = c0858Kt0A.a;
                for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
                    String str = (String) it.next();
                    arrayMap.put(str, arrayMap2.get(str));
                }
                C8194yY0 c8194yY0 = new C8194yY0(arrayList5, arrayList6, arrayList7, arrayList8, new C1702Vp(arrayList9, c0873Ky0A, 1, false, arrayList10, false, new C6974s81(arrayMap), null), null, null, 0, null);
                U41 u41 = c0212Cm.B;
                C20 c20 = (C20) u41.b;
                U41 u412 = (U41) u41.d;
                ExecutorC5715lY0 executorC5715lY0 = (ExecutorC5715lY0) u41.a;
                QZ qzA = QZ.a(AbstractC8171yQ1.b(new SZ(c4037gq.d(c8194yY0, cameraDevice, new E71((C3513e41) u41.e, (C3513e41) u41.f, u412, executorC5715lY0, c20, (Handler) u41.c)), 0)));
                C0515Gj c0515Gj = new C0515Gj(c4037gq, 1, g70);
                qzA.getClass();
                ExecutorC5715lY0 executorC5715lY02 = c0212Cm.c;
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA, c0515Gj, executorC5715lY02);
                Objects.requireNonNull(cameraDevice);
                runnableC3467drR.d(new G4(10, cameraDevice), executorC5715lY02);
                break;
            default:
                ((ExecutorC5715lY0) obj).execute(new RunnableC2202ao(this, cameraDevice, 2));
                break;
        }
    }

    public C7665vm(C0212Cm c0212Cm, C0365El c0365El) {
        this.c = c0212Cm;
        this.b = c0365El;
    }
}
