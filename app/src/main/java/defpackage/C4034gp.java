package defpackage;

import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.mrousavy.camera.frameprocessors.Frame;
import com.mrousavy.camera.frameprocessors.FrameProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: gp */
/* loaded from: classes2.dex */
public final class C4034gp extends FrameLayout {
    public EnumC6225oD0 A;
    public boolean B;
    public EnumC2518cS0 C;
    public C4049gu D;
    public boolean E;
    public final C1339Qy F;
    public final C0920Lo G;
    public FrameProcessor H;
    public C5843mD0 I;
    public long J;
    public final C5772lr0 K;
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public EnumC5646lB0 i;
    public boolean j;
    public boolean k;
    public C3840fo l;
    public Integer m;
    public Integer n;
    public EnumC1608Uj1 o;
    public boolean p;
    public boolean q;
    public Double r;
    public Double s;
    public EnumC7188tG0 t;
    public boolean u;
    public boolean v;
    public EnumC6870rb1 w;
    public float x;
    public double y;
    public EnumC4256hz0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4034gp(S91 s91) {
        super(s91);
        O90.f(s91, "context");
        this.i = EnumC5646lB0.c;
        this.k = true;
        this.t = EnumC7188tG0.c;
        this.w = EnumC6870rb1.c;
        this.x = 1.0f;
        this.z = EnumC4256hz0.c;
        this.A = EnumC6225oD0.c;
        this.C = EnumC2518cS0.c;
        GK gk = GK.a;
        this.F = AbstractC7625vY1.a(AbstractC0603Hm0.a);
        this.J = System.currentTimeMillis();
        this.K = new C5772lr0(this);
        setClipToOutline(true);
        this.G = new C0920Lo(s91, this);
        setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC6177nz(this, 1));
        e();
    }

    public final void a(Throwable th) {
        O90.f(th, "error");
        th.printStackTrace();
        AbstractC5762lo c5837mB0 = th instanceof AbstractC5762lo ? (AbstractC5762lo) th : new C5837mB0(th);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", c5837mB0.a + "/" + c5837mB0.b);
        writableMapCreateMap.putString("message", c5837mB0.c);
        Throwable cause = c5837mB0.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", ER1.d(cause));
        }
        ER1.e(this, new C3622ef(OZ1.e(this), getId(), writableMapCreateMap, 2));
    }

    public final void b(Frame frame) {
        C5772lr0 c5772lr0 = this.K;
        c5772lr0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((ArrayList) c5772lr0.c).add(Long.valueOf(jCurrentTimeMillis));
        ArrayList arrayList = (ArrayList) c5772lr0.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (jCurrentTimeMillis - ((Number) next).longValue() < 1000) {
                arrayList2.add(next);
            }
        }
        c5772lr0.c = AbstractC8069xu.d0(arrayList2);
        FrameProcessor frameProcessor = this.H;
        if (frameProcessor != null) {
            frameProcessor.call(frame);
        }
    }

    public final void c(A01 a01) {
        a01.toString();
        int iE = OZ1.e(this);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", a01.a);
        ER1.e(this, new C3622ef(iE, getId(), writableMapCreateMap, 5));
    }

    public final void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.J = jCurrentTimeMillis;
        AbstractC3767fP1.b(this.F, null, new C3461dp(this, jCurrentTimeMillis, null), 3);
    }

    public final void e() {
        AbstractC3767fP1.b(this.F, null, new C3652ep(this, null), 3);
    }

    public final EnumC6225oD0 getAndroidPreviewViewType() {
        return this.A;
    }

    public final boolean getAudio() {
        return this.g;
    }

    public final String getCameraId() {
        return this.a;
    }

    public final C0920Lo getCameraSession$react_native_vision_camera_release() {
        return this.G;
    }

    public final C4049gu getCodeScannerOptions() {
        return this.D;
    }

    public final boolean getEnableDepthData() {
        return this.b;
    }

    public final boolean getEnableFrameProcessor() {
        return this.h;
    }

    public final boolean getEnableLocation() {
        return this.j;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.c;
    }

    public final boolean getEnableZoomGesture() {
        return this.B;
    }

    public final double getExposure() {
        return this.y;
    }

    public final C3840fo getFormat() {
        return this.l;
    }

    public final FrameProcessor getFrameProcessor$react_native_vision_camera_release() {
        return this.H;
    }

    public final boolean getLowLightBoost() {
        return this.u;
    }

    public final Integer getMaxFps() {
        return this.n;
    }

    public final Integer getMinFps() {
        return this.m;
    }

    public final EnumC4256hz0 getOutputOrientation() {
        return this.z;
    }

    public final boolean getPhoto() {
        return this.e;
    }

    public final boolean getPhotoHdr() {
        return this.q;
    }

    public final EnumC7188tG0 getPhotoQualityBalance() {
        return this.t;
    }

    public final EnumC5646lB0 getPixelFormat() {
        return this.i;
    }

    public final boolean getPreview() {
        return this.k;
    }

    public final C5843mD0 getPreviewView$react_native_vision_camera_release() {
        return this.I;
    }

    public final EnumC2518cS0 getResizeMode() {
        return this.C;
    }

    public final EnumC6870rb1 getTorch() {
        return this.w;
    }

    public final boolean getVideo() {
        return this.f;
    }

    public final Double getVideoBitRateMultiplier() {
        return this.s;
    }

    public final Double getVideoBitRateOverride() {
        return this.r;
    }

    public final boolean getVideoHdr() {
        return this.p;
    }

    public final EnumC1608Uj1 getVideoStabilizationMode() {
        return this.o;
    }

    public final float getZoom() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.E) {
            this.E = true;
            ER1.e(this, new C7098so(OZ1.e(this), getId(), 5));
        }
        C5772lr0 c5772lr0 = this.K;
        c5772lr0.getClass();
        Timer timer = new Timer("VisionCamera FPS Sample Collector");
        c5772lr0.d = timer;
        timer.schedule(new JX(0, c5772lr0), 1000L, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5772lr0 c5772lr0 = this.K;
        Timer timer = (Timer) c5772lr0.d;
        if (timer != null) {
            timer.cancel();
        }
        c5772lr0.d = null;
    }

    public final void setActive(boolean z) {
        this.v = z;
    }

    public final void setAndroidPreviewViewType(EnumC6225oD0 enumC6225oD0) {
        O90.f(enumC6225oD0, "value");
        this.A = enumC6225oD0;
        e();
    }

    public final void setAudio(boolean z) {
        this.g = z;
    }

    public final void setCameraId(String str) {
        this.a = str;
    }

    public final void setCodeScannerOptions(C4049gu c4049gu) {
        this.D = c4049gu;
    }

    public final void setEnableDepthData(boolean z) {
        this.b = z;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.h = z;
    }

    public final void setEnableLocation(boolean z) {
        this.j = z;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.c = z;
    }

    public final void setEnableZoomGesture(boolean z) {
        this.B = z;
        if (z) {
            setOnTouchListener(new ViewOnTouchListenerC2396bp(0, new ScaleGestureDetector(getContext(), new C3843fp(0, this))));
        } else {
            setOnTouchListener(null);
        }
    }

    public final void setExposure(double d) {
        this.y = d;
    }

    public final void setFormat(C3840fo c3840fo) {
        this.l = c3840fo;
    }

    public final void setFrameProcessor$react_native_vision_camera_release(FrameProcessor frameProcessor) {
        this.H = frameProcessor;
    }

    public final void setLowLightBoost(boolean z) {
        this.u = z;
    }

    public final void setMaxFps(Integer num) {
        this.n = num;
    }

    public final void setMinFps(Integer num) {
        this.m = num;
    }

    public final void setMirrored(boolean z) {
        this.d = z;
    }

    public final void setOutputOrientation(EnumC4256hz0 enumC4256hz0) {
        O90.f(enumC4256hz0, "<set-?>");
        this.z = enumC4256hz0;
    }

    public final void setPhoto(boolean z) {
        this.e = z;
    }

    public final void setPhotoHdr(boolean z) {
        this.q = z;
    }

    public final void setPhotoQualityBalance(EnumC7188tG0 enumC7188tG0) {
        O90.f(enumC7188tG0, "<set-?>");
        this.t = enumC7188tG0;
    }

    public final void setPixelFormat(EnumC5646lB0 enumC5646lB0) {
        O90.f(enumC5646lB0, "<set-?>");
        this.i = enumC5646lB0;
    }

    public final void setPreview(boolean z) {
        this.k = z;
        e();
    }

    public final void setPreviewView$react_native_vision_camera_release(C5843mD0 c5843mD0) {
        this.I = c5843mD0;
    }

    public final void setResizeMode(EnumC2518cS0 enumC2518cS0) {
        O90.f(enumC2518cS0, "value");
        this.C = enumC2518cS0;
        e();
    }

    public final void setTorch(EnumC6870rb1 enumC6870rb1) {
        O90.f(enumC6870rb1, "<set-?>");
        this.w = enumC6870rb1;
    }

    public final void setVideo(boolean z) {
        this.f = z;
    }

    public final void setVideoBitRateMultiplier(Double d) {
        this.s = d;
    }

    public final void setVideoBitRateOverride(Double d) {
        this.r = d;
    }

    public final void setVideoHdr(boolean z) {
        this.p = z;
    }

    public final void setVideoStabilizationMode(EnumC1608Uj1 enumC1608Uj1) {
        this.o = enumC1608Uj1;
    }

    public final void setZoom(float f) {
        this.x = f;
    }
}
