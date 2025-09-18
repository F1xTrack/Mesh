package p000;

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

/* renamed from: vm */
/* loaded from: classes.dex */
public final class C7033vm extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f44518a = 0;

    /* renamed from: b */
    public final Object f44519b;

    /* renamed from: c */
    public final Object f44520c;

    public C7033vm(ExecutorC10151lY0 executorC10151lY0, CameraDevice.StateCallback stateCallback) {
        this.f44520c = executorC10151lY0;
        this.f44519b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f44518a) {
            case 0:
                ((C0175Cm) this.f44520c).m1347u("openCameraConfigAndClose camera closed");
                ((C0300El) this.f44519b).m2375b(null);
                break;
            default:
                ((ExecutorC10151lY0) this.f44520c).execute(new RunnableC1745ao(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f44518a) {
            case 0:
                ((C0175Cm) this.f44520c).m1347u("openCameraConfigAndClose camera disconnected");
                ((C0300El) this.f44519b).m2375b(null);
                break;
            default:
                ((ExecutorC10151lY0) this.f44520c).execute(new RunnableC1745ao(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f44518a) {
            case 0:
                ((C0175Cm) this.f44520c).m1347u(AbstractC11153tN0.m24909u(i, "openCameraConfigAndClose camera error "));
                ((C0300El) this.f44519b).m2375b(null);
                break;
            default:
                ((ExecutorC10151lY0) this.f44520c).execute(new RunnableC6694qf(this, cameraDevice, i, 4));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.f44520c;
        switch (this.f44518a) {
            case 0:
                C0175Cm c0175Cm = (C0175Cm) obj;
                c0175Cm.m1347u("openCameraConfigAndClose camera opened");
                C4141gq c4141gq = new C4141gq(c0175Cm.f1618I);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                G70 g70 = new G70(surface);
                AbstractC8301Sz1.m7489l(g70.f29023e).mo2494d(new RunnableC6720r4(surface, 18, surfaceTexture), QR1.m6703a());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                ArrayList arrayList = new ArrayList();
                C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0149CM c0149cm = C0149CM.f1329d;
                C8128Pr0 c8128Pr0M26209a = C7214ye.m26209a(g70);
                c8128Pr0M26209a.f9308f = c0149cm;
                linkedHashSet.add(c8128Pr0M26209a.m6450l());
                c0175Cm.m1347u("Start configAndClose.");
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
                ArrayList arrayList10 = new ArrayList(arrayList);
                C10996s81 c10996s81 = C10996s81.f42278b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = c7872Kt0M4776a.f42279a;
                for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
                    String str = (String) it.next();
                    arrayMap.put(str, arrayMap2.get(str));
                }
                C11812yY0 c11812yY0 = new C11812yY0(arrayList5, arrayList6, arrayList7, arrayList8, new C1373Vp(arrayList9, c7882Ky0M4786a, 1, false, arrayList10, false, new C10996s81(arrayMap), null), null, null, 0, null);
                U41 u41 = c0175Cm.f1611B;
                C20 c20 = (C20) u41.f11645b;
                U41 u412 = (U41) u41.f11647d;
                ExecutorC10151lY0 executorC10151lY0 = (ExecutorC10151lY0) u41.f11644a;
                C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11797yQ1.m26149b(new C1168SZ(c4141gq.mo4249d(c11812yY0, cameraDevice, new E71((C9196e41) u41.f11648e, (C9196e41) u41.f11649f, u412, executorC10151lY0, c20, (Handler) u41.f11646c)), 0)));
                C0424Gj c0424Gj = new C0424Gj(c4141gq, 1, g70);
                c1043qzM6727a.getClass();
                ExecutorC10151lY0 executorC10151lY02 = c0175Cm.f1624c;
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a, c0424Gj, executorC10151lY02);
                Objects.requireNonNull(cameraDevice);
                runnableC3953drM7495r.mo2494d(new RunnableC0383G4(10, cameraDevice), executorC10151lY02);
                break;
            default:
                ((ExecutorC10151lY0) obj).execute(new RunnableC1745ao(this, cameraDevice, 2));
                break;
        }
    }

    public C7033vm(C0175Cm c0175Cm, C0300El c0300El) {
        this.f44520c = c0175Cm;
        this.f44519b = c0300El;
    }
}
