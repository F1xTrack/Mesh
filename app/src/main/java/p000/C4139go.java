package p000;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: go */
/* loaded from: classes.dex */
public final class C4139go extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f27999a;

    /* renamed from: b */
    public final Object f28000b;

    public C4139go(U41 u41) {
        this.f27999a = 1;
        this.f28000b = u41;
    }

    /* renamed from: a */
    public void m18646a() {
        ArrayList arrayListM7886u;
        synchronized (((U41) this.f28000b).f11644a) {
            arrayListM7886u = ((U41) this.f28000b).m7886u();
            ((LinkedHashSet) ((U41) this.f28000b).f11648e).clear();
            ((LinkedHashSet) ((U41) this.f28000b).f11646c).clear();
            ((LinkedHashSet) ((U41) this.f28000b).f11647d).clear();
        }
        Iterator it = arrayListM7886u.iterator();
        while (it.hasNext()) {
            E71 e71 = (E71) it.next();
            e71.m2044r();
            e71.f2499u.m5816c();
        }
    }

    /* renamed from: b */
    public void m18647b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((U41) this.f28000b).f11644a) {
            linkedHashSet.addAll((LinkedHashSet) ((U41) this.f28000b).f11648e);
            linkedHashSet.addAll((LinkedHashSet) ((U41) this.f28000b).f11646c);
        }
        ((ExecutorC10151lY0) ((U41) this.f28000b).f11645b).execute(new RunnableC0383G4(20, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f27999a) {
            case 0:
                Iterator it = ((ArrayList) this.f28000b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                m18647b();
                m18646a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f27999a) {
            case 0:
                Iterator it = ((ArrayList) this.f28000b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                m18647b();
                m18646a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f27999a) {
            case 0:
                Iterator it = ((ArrayList) this.f28000b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                m18647b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((U41) this.f28000b).f11644a) {
                    linkedHashSet.addAll((LinkedHashSet) ((U41) this.f28000b).f11648e);
                    linkedHashSet.addAll((LinkedHashSet) ((U41) this.f28000b).f11646c);
                }
                ((ExecutorC10151lY0) ((U41) this.f28000b).f11645b).execute(new RunnableC6246ja(linkedHashSet, i, 4));
                m18646a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f27999a) {
            case 0:
                Iterator it = ((ArrayList) this.f28000b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public C4139go(ArrayList arrayList) {
        this.f27999a = 0;
        this.f28000b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C4202ho)) {
                ((ArrayList) this.f28000b).add(stateCallback);
            }
        }
    }

    /* renamed from: c */
    private final void m18645c(CameraDevice cameraDevice) {
    }
}
