package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: go */
/* loaded from: classes.dex */
public final class C4031go extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public C4031go(U41 u41) {
        this.a = 1;
        this.b = u41;
    }

    public void a() {
        ArrayList arrayListU;
        synchronized (((U41) this.b).a) {
            arrayListU = ((U41) this.b).u();
            ((LinkedHashSet) ((U41) this.b).e).clear();
            ((LinkedHashSet) ((U41) this.b).c).clear();
            ((LinkedHashSet) ((U41) this.b).d).clear();
        }
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            E71 e71 = (E71) it.next();
            e71.r();
            e71.u.c();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((U41) this.b).a) {
            linkedHashSet.addAll((LinkedHashSet) ((U41) this.b).e);
            linkedHashSet.addAll((LinkedHashSet) ((U41) this.b).c);
        }
        ((ExecutorC5715lY0) ((U41) this.b).b).execute(new G4(20, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((U41) this.b).a) {
                    linkedHashSet.addAll((LinkedHashSet) ((U41) this.b).e);
                    linkedHashSet.addAll((LinkedHashSet) ((U41) this.b).c);
                }
                ((ExecutorC5715lY0) ((U41) this.b).b).execute(new RunnableC5338ja(linkedHashSet, i, 4));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public C4031go(ArrayList arrayList) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C4222ho)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }
}
