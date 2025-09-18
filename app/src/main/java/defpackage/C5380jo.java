package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.mrousavy.camera.react.CameraDevicesManager;
import java.util.ArrayList;

/* renamed from: jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5380jo extends CameraManager.AvailabilityCallback {
    public final ArrayList a;
    public final /* synthetic */ CameraDevicesManager b;

    public C5380jo(CameraDevicesManager cameraDevicesManager) throws CameraAccessException {
        this.b = cameraDevicesManager;
        String[] cameraIdList = cameraDevicesManager.cameraManager.getCameraIdList();
        O90.e(cameraIdList, "getCameraIdList(...)");
        this.a = J8.E(cameraIdList);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        O90.f(str, "cameraId");
        ArrayList arrayList = this.a;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.b.sendAvailableDevicesChangedEvent();
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        CameraDevicesManager cameraDevicesManager = this.b;
        O90.f(str, "cameraId");
        ArrayList arrayList = this.a;
        if (arrayList.contains(str)) {
            try {
                cameraDevicesManager.cameraManager.getCameraCharacteristics(str);
            } catch (Throwable unused) {
                arrayList.remove(str);
                cameraDevicesManager.sendAvailableDevicesChangedEvent();
            }
        }
    }
}
