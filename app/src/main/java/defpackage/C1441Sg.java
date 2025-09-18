package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: Sg */
/* loaded from: classes.dex */
public final class C1441Sg implements InterfaceC0046Ai1 {
    public static final ArrayList h;
    public final PreviewExtenderImpl b;
    public final ImageCaptureExtenderImpl c;
    public InterfaceC6907ro d;
    public String e;
    public CameraCharacteristics f;
    public final C1562Tu0 a = new C1562Tu0(14);
    public final C2556cf g = new C2556cf();

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        h = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public C1441Sg(int i) {
        this.b = null;
        this.c = null;
        try {
            if (i == 1) {
                this.b = new BokehPreviewExtenderImpl();
                this.c = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i == 2) {
                this.b = new HdrPreviewExtenderImpl();
                this.c = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i == 3) {
                this.b = new NightPreviewExtenderImpl();
                this.c = new NightImageCaptureExtenderImpl();
            } else if (i == 4) {
                this.b = new BeautyPreviewExtenderImpl();
                this.c = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.b = new AutoPreviewExtenderImpl();
                this.c = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            AbstractC0759Jm0.b("BasicVendorExtender");
        }
    }

    public static ArrayList m(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == i) {
                arrayList.add(new Pair(Integer.valueOf(i), (Size[]) pair.second));
                return arrayList;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            if (((Integer) pair2.first).intValue() == i2) {
                arrayList.add(new Pair(Integer.valueOf(i), (Size[]) pair2.second));
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException(AbstractC8235ym.g(i, "Supported resolution should contain ", " format."));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List a() {
        AbstractC3377dM1.h(this.d, "VendorExtender#init() must be called first");
        if (this.c != null && MR.d().compareTo(C1591Ue.f) >= 0) {
            try {
                List supportedResolutions = this.c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.c.getCaptureProcessor() != null ? m(35, 256, supportedResolutions) : supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int iJ = j();
        return Arrays.asList(new Pair(Integer.valueOf(iJ), ((StreamConfigurationMap) this.f.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(iJ)));
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List b() {
        AbstractC3377dM1.h(this.d, "VendorExtender#init() must be called first");
        if (this.b != null && MR.d().compareTo(C1591Ue.f) >= 0) {
            try {
                List supportedResolutions = this.b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return m(34, 35, supportedResolutions);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, ((StreamConfigurationMap) this.f.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(k())));
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean c() {
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            return this.c.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final List d() {
        if (MR.h(C1591Ue.h)) {
            try {
                List availableCaptureResultKeys = this.c.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception unused) {
                AbstractC0759Jm0.c("BasicVendorExtender");
            }
        }
        return Collections.emptyList();
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final void e(InterfaceC6907ro interfaceC6907ro) {
        InterfaceC6907ro interfaceC6907ro2 = interfaceC6907ro;
        this.d = interfaceC6907ro2;
        if (this.b == null || this.c == null) {
            return;
        }
        this.e = interfaceC6907ro2.e();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.d.q();
        this.f = cameraCharacteristics;
        this.b.init(this.e, cameraCharacteristics);
        this.c.init(this.e, this.f);
        Objects.toString(this.b.getProcessorType());
        AbstractC0759Jm0.a("BasicVendorExtender");
        Objects.toString(this.c.getCaptureProcessor());
        AbstractC0759Jm0.a("BasicVendorExtender");
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final Size[] f() {
        AbstractC3377dM1.h(this.d, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final AbstractC3987gZ0 g(Context context) {
        List listA;
        List listUnmodifiableList;
        AbstractC3377dM1.h(this.d, "VendorExtender#init() must be called first");
        PreviewExtenderImpl previewExtenderImpl = this.b;
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.c;
        if (MR.h(C1591Ue.h)) {
            try {
                listA = this.g.a(this.c, this.e, this.f, context);
            } catch (Exception unused) {
                AbstractC0759Jm0.f("BasicVendorExtender");
            }
            listUnmodifiableList = listA != null ? Collections.unmodifiableList(listA) : Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(h);
        }
        return new h(previewExtenderImpl, imageCaptureExtenderImpl, listUnmodifiableList, this, context);
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean h(LinkedHashMap linkedHashMap, String str) {
        if (this.a.s0(str) || this.b == null || this.c == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) linkedHashMap.get(str);
        return this.b.isExtensionAvailable(str, cameraCharacteristics) && this.c.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // defpackage.InterfaceC0046Ai1
    public final boolean i() {
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            return this.c.isPostviewAvailable();
        }
        return false;
    }

    public final int j() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.c;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    public final int k() {
        PreviewExtenderImpl previewExtenderImpl = this.b;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    public final Map l(Size size) {
        C1591Ue c1591Ue = C1591Ue.i;
        if (!C3664et.d(c1591Ue) || !MR.h(c1591Ue)) {
            return Collections.emptyMap();
        }
        List<Pair> supportedPostviewResolutions = this.c.getSupportedPostviewResolutions(size);
        HashMap map = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            map.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(map);
    }
}
