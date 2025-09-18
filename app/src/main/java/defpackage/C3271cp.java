package defpackage;

/* renamed from: cp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3271cp extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ C4034gp e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3271cp(C4034gp c4034gp, long j) {
        super(1);
        this.e = c4034gp;
        this.f = j;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws C0917Ln {
        C1696Vn c1696Vn = (C1696Vn) obj;
        O90.f(c1696Vn, "config");
        C4034gp c4034gp = this.e;
        if (c4034gp.J != this.f) {
            throw new C0917Ln();
        }
        c1696Vn.a = c4034gp.getCameraId();
        C5843mD0 previewView$react_native_vision_camera_release = c4034gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release != null) {
            InterfaceC2473cD0 surfaceProvider = previewView$react_native_vision_camera_release.getSurfaceProvider();
            O90.e(surfaceProvider, "getSurfaceProvider(...)");
            c1696Vn.b = new C1384Rn(new C1540Tn(surfaceProvider));
        } else {
            c1696Vn.b = new C1306Qn();
        }
        if (c4034gp.getPhoto()) {
            c1696Vn.c = new C1384Rn(new C1462Sn(c4034gp.d, c4034gp.getPhotoHdr(), c4034gp.getPhotoQualityBalance()));
        } else {
            c1696Vn.c = new C1306Qn();
        }
        if (c4034gp.getVideo() || c4034gp.getEnableFrameProcessor()) {
            c1696Vn.d = new C1384Rn(new C1618Un(c4034gp.d, c4034gp.getVideoHdr(), c4034gp.getVideoBitRateOverride(), c4034gp.getVideoBitRateMultiplier()));
        } else {
            c1696Vn.d = new C1306Qn();
        }
        if (c4034gp.getEnableFrameProcessor()) {
            c1696Vn.e = new C1384Rn(new C1228Pn(c4034gp.d, c4034gp.getPixelFormat()));
        } else {
            c1696Vn.e = new C1306Qn();
        }
        boolean audio = c4034gp.getAudio();
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (audio) {
            c1696Vn.r = new C1384Rn(new C0994Mn());
        } else {
            c1696Vn.r = new C1306Qn();
        }
        c1696Vn.i = c4034gp.getEnableLocation() && c4034gp.v;
        C4049gu codeScannerOptions = c4034gp.getCodeScannerOptions();
        if (codeScannerOptions != null) {
            c1696Vn.f = new C1384Rn(new C1072Nn(codeScannerOptions.a));
        } else {
            c1696Vn.f = new C1306Qn();
        }
        EnumC4256hz0 outputOrientation = c4034gp.getOutputOrientation();
        O90.f(outputOrientation, "<set-?>");
        c1696Vn.j = outputOrientation;
        c1696Vn.k = c4034gp.getFormat();
        c1696Vn.g = c4034gp.getMinFps();
        c1696Vn.h = c4034gp.getMaxFps();
        c1696Vn.l = c4034gp.getLowLightBoost();
        EnumC6870rb1 torch = c4034gp.getTorch();
        O90.f(torch, "<set-?>");
        c1696Vn.m = torch;
        c1696Vn.o = Double.valueOf(c4034gp.getExposure());
        c1696Vn.p = c4034gp.getZoom();
        c1696Vn.q = c4034gp.v;
        return c1518Tf1;
    }
}
