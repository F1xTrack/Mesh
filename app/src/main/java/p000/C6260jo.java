package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.mrousavy.camera.react.CameraDevicesManager;
import java.util.ArrayList;

/* renamed from: jo */
/* loaded from: classes2.dex */
public final class C6260jo extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public final ArrayList f35381a;

    /* renamed from: b */
    public final /* synthetic */ CameraDevicesManager f35382b;

    public C6260jo(CameraDevicesManager cameraDevicesManager) throws CameraAccessException {
        this.f35382b = cameraDevicesManager;
        String[] cameraIdList = cameraDevicesManager.cameraManager.getCameraIdList();
        O90.m5967e(cameraIdList, "getCameraIdList(...)");
        this.f35381a = AbstractC0576J8.m4174E(cameraIdList);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        O90.m5968f(str, "cameraId");
        ArrayList arrayList = this.f35381a;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        this.f35382b.sendAvailableDevicesChangedEvent();
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        CameraDevicesManager cameraDevicesManager = this.f35382b;
        O90.m5968f(str, "cameraId");
        ArrayList arrayList = this.f35381a;
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
