package p000;

/* renamed from: cp */
/* loaded from: classes2.dex */
public final class C3889cp extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ C4140gp f25669e;

    /* renamed from: f */
    public final /* synthetic */ long f25670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3889cp(C4140gp c4140gp, long j) {
        super(1);
        this.f25669e = c4140gp;
        this.f25670f = j;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) throws C0742Ln {
        C1371Vn c1371Vn = (C1371Vn) obj;
        O90.m5968f(c1371Vn, "config");
        C4140gp c4140gp = this.f25669e;
        if (c4140gp.f28012J != this.f25670f) {
            throw new C0742Ln();
        }
        c1371Vn.f12732a = c4140gp.getCameraId();
        C10237mD0 previewView$react_native_vision_camera_release = c4140gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release != null) {
            InterfaceC8952cD0 surfaceProvider = previewView$react_native_vision_camera_release.getSurfaceProvider();
            O90.m5967e(surfaceProvider, "getSurfaceProvider(...)");
            c1371Vn.f12733b = new C1119Rn(new C1245Tn(surfaceProvider));
        } else {
            c1371Vn.f12733b = new C1057Qn();
        }
        if (c4140gp.getPhoto()) {
            c1371Vn.f12734c = new C1119Rn(new C1182Sn(c4140gp.f28017d, c4140gp.getPhotoHdr(), c4140gp.getPhotoQualityBalance()));
        } else {
            c1371Vn.f12734c = new C1057Qn();
        }
        if (c4140gp.getVideo() || c4140gp.getEnableFrameProcessor()) {
            c1371Vn.f12735d = new C1119Rn(new C1308Un(c4140gp.f28017d, c4140gp.getVideoHdr(), c4140gp.getVideoBitRateOverride(), c4140gp.getVideoBitRateMultiplier()));
        } else {
            c1371Vn.f12735d = new C1057Qn();
        }
        if (c4140gp.getEnableFrameProcessor()) {
            c1371Vn.f12736e = new C1119Rn(new C0994Pn(c4140gp.f28017d, c4140gp.getPixelFormat()));
        } else {
            c1371Vn.f12736e = new C1057Qn();
        }
        boolean audio = c4140gp.getAudio();
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (audio) {
            c1371Vn.f12749r = new C1119Rn(new C0805Mn());
        } else {
            c1371Vn.f12749r = new C1057Qn();
        }
        c1371Vn.f12740i = c4140gp.getEnableLocation() && c4140gp.f28035v;
        C4145gu codeScannerOptions = c4140gp.getCodeScannerOptions();
        if (codeScannerOptions != null) {
            c1371Vn.f12737f = new C1119Rn(new C0868Nn(codeScannerOptions.f28077a));
        } else {
            c1371Vn.f12737f = new C1057Qn();
        }
        EnumC9693hz0 outputOrientation = c4140gp.getOutputOrientation();
        O90.m5968f(outputOrientation, "<set-?>");
        c1371Vn.f12741j = outputOrientation;
        c1371Vn.f12742k = c4140gp.getFormat();
        c1371Vn.f12738g = c4140gp.getMinFps();
        c1371Vn.f12739h = c4140gp.getMaxFps();
        c1371Vn.f12743l = c4140gp.getLowLightBoost();
        EnumC10926rb1 torch = c4140gp.getTorch();
        O90.m5968f(torch, "<set-?>");
        c1371Vn.f12744m = torch;
        c1371Vn.f12746o = Double.valueOf(c4140gp.getExposure());
        c1371Vn.f12747p = c4140gp.getZoom();
        c1371Vn.f12748q = c4140gp.f28035v;
        return c8313Tf1;
    }
}
