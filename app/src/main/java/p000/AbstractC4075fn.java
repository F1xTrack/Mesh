package p000;

import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fn */
/* loaded from: classes.dex */
public abstract class AbstractC4075fn {
    /* renamed from: a */
    public static InterfaceC4012en m18292a(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        ArrayList arrayList = new ArrayList();
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            Iterator it = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it.hasNext()) {
                arrayList.add(m18292a((Camera2OutputConfigImpl) it.next()));
            }
        }
        try {
            try {
                try {
                    SurfaceOutputConfigImpl surfaceOutputConfigImpl = (SurfaceOutputConfigImpl) camera2OutputConfigImpl;
                    return C0608Je.m4378d(surfaceOutputConfigImpl.getId(), surfaceOutputConfigImpl.getSurfaceGroupId(), surfaceOutputConfigImpl.getPhysicalCameraId(), arrayList, surfaceOutputConfigImpl.getSurface());
                } catch (ClassCastException unused) {
                    ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                    return C0858Nd.m5788d(imageReaderOutputConfigImpl.getId(), imageReaderOutputConfigImpl.getSurfaceGroupId(), imageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
                }
            } catch (ClassCastException unused2) {
                MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                return C1677ae.m9777d(multiResolutionImageReaderOutputConfigImpl.getId(), multiResolutionImageReaderOutputConfigImpl.getSurfaceGroupId(), multiResolutionImageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
            }
        } catch (ClassCastException unused3) {
            throw new IllegalArgumentException("Not supported Camera2OutputConfigImpl: " + camera2OutputConfigImpl.getClass());
        }
    }
}
