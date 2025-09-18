package p000;

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
import androidx.camera.extensions.internal.sessionprocessor.C1703h;
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
public final class C1175Sg implements InterfaceC7331Ai1 {

    /* renamed from: h */
    public static final ArrayList f10898h;

    /* renamed from: b */
    public final PreviewExtenderImpl f10900b;

    /* renamed from: c */
    public final ImageCaptureExtenderImpl f10901c;

    /* renamed from: d */
    public InterfaceC6766ro f10902d;

    /* renamed from: e */
    public String f10903e;

    /* renamed from: f */
    public CameraCharacteristics f10904f;

    /* renamed from: a */
    public final C8342Tu0 f10899a = new C8342Tu0(14);

    /* renamed from: g */
    public final C1861cf f10905g = new C1861cf();

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        f10898h = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(CaptureRequest.CONTROL_ZOOM_RATIO);
        }
    }

    public C1175Sg(int i) {
        this.f10900b = null;
        this.f10901c = null;
        try {
            if (i == 1) {
                this.f10900b = new BokehPreviewExtenderImpl();
                this.f10901c = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i == 2) {
                this.f10900b = new HdrPreviewExtenderImpl();
                this.f10901c = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i == 3) {
                this.f10900b = new NightPreviewExtenderImpl();
                this.f10901c = new NightImageCaptureExtenderImpl();
            } else if (i == 4) {
                this.f10900b = new BeautyPreviewExtenderImpl();
                this.f10901c = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.f10900b = new AutoPreviewExtenderImpl();
                this.f10901c = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            AbstractC7806Jm0.m4408b("BasicVendorExtender");
        }
    }

    /* renamed from: m */
    public static ArrayList m7413m(int i, int i2, List list) {
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
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Supported resolution should contain ", " format."));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: a */
    public final List mo291a() {
        AbstractC9104dM1.m17549h(this.f10902d, "VendorExtender#init() must be called first");
        if (this.f10901c != null && AbstractC0783MR.m5366d().compareTo(C1299Ue.f11945f) >= 0) {
            try {
                List supportedResolutions = this.f10901c.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.f10901c.getCaptureProcessor() != null ? m7413m(35, 256, supportedResolutions) : supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int iM7414j = m7414j();
        return Arrays.asList(new Pair(Integer.valueOf(iM7414j), ((StreamConfigurationMap) this.f10904f.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(iM7414j)));
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: b */
    public final List mo292b() {
        AbstractC9104dM1.m17549h(this.f10902d, "VendorExtender#init() must be called first");
        if (this.f10900b != null && AbstractC0783MR.m5366d().compareTo(C1299Ue.f11945f) >= 0) {
            try {
                List supportedResolutions = this.f10900b.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return m7413m(34, 35, supportedResolutions);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, ((StreamConfigurationMap) this.f10904f.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(m7415k())));
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: c */
    public final boolean mo293c() {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            return this.f10901c.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: d */
    public final List mo294d() {
        if (AbstractC0783MR.m5368h(C1299Ue.f11947h)) {
            try {
                List availableCaptureResultKeys = this.f10901c.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception unused) {
                AbstractC7806Jm0.m4409c("BasicVendorExtender");
            }
        }
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: e */
    public final void mo295e(InterfaceC6766ro interfaceC6766ro) {
        InterfaceC6766ro interfaceC6766ro2 = interfaceC6766ro;
        this.f10902d = interfaceC6766ro2;
        if (this.f10900b == null || this.f10901c == null) {
            return;
        }
        this.f10903e = interfaceC6766ro2.mo2393e();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.f10902d.mo2405q();
        this.f10904f = cameraCharacteristics;
        this.f10900b.init(this.f10903e, cameraCharacteristics);
        this.f10901c.init(this.f10903e, this.f10904f);
        Objects.toString(this.f10900b.getProcessorType());
        AbstractC7806Jm0.m4407a("BasicVendorExtender");
        Objects.toString(this.f10901c.getCaptureProcessor());
        AbstractC7806Jm0.m4407a("BasicVendorExtender");
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: f */
    public final Size[] mo296f() {
        AbstractC9104dM1.m17549h(this.f10902d, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: g */
    public final AbstractC9513gZ0 mo297g(Context context) {
        List listM10822a;
        List listUnmodifiableList;
        AbstractC9104dM1.m17549h(this.f10902d, "VendorExtender#init() must be called first");
        PreviewExtenderImpl previewExtenderImpl = this.f10900b;
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.f10901c;
        if (AbstractC0783MR.m5368h(C1299Ue.f11947h)) {
            try {
                listM10822a = this.f10905g.m10822a(this.f10901c, this.f10903e, this.f10904f, context);
            } catch (Exception unused) {
                AbstractC7806Jm0.m4412f("BasicVendorExtender");
            }
            listUnmodifiableList = listM10822a != null ? Collections.unmodifiableList(listM10822a) : Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(f10898h);
        }
        return new C1703h(previewExtenderImpl, imageCaptureExtenderImpl, listUnmodifiableList, this, context);
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: h */
    public final boolean mo298h(LinkedHashMap linkedHashMap, String str) {
        if (this.f10899a.m7819s0(str) || this.f10900b == null || this.f10901c == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) linkedHashMap.get(str);
        return this.f10900b.isExtensionAvailable(str, cameraCharacteristics) && this.f10901c.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: i */
    public final boolean mo299i() {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            return this.f10901c.isPostviewAvailable();
        }
        return false;
    }

    /* renamed from: j */
    public final int m7414j() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.f10901c;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    /* renamed from: k */
    public final int m7415k() {
        PreviewExtenderImpl previewExtenderImpl = this.f10900b;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    /* renamed from: l */
    public final Map m7416l(Size size) {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (!C4018et.m18064d(c1299Ue) || !AbstractC0783MR.m5368h(c1299Ue)) {
            return Collections.emptyMap();
        }
        List<Pair> supportedPostviewResolutions = this.f10901c.getSupportedPostviewResolutions(size);
        HashMap map = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            map.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(map);
    }
}
