package p000;

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
public final class C4140gp extends FrameLayout {

    /* renamed from: A */
    public EnumC10493oD0 f28003A;

    /* renamed from: B */
    public boolean f28004B;

    /* renamed from: C */
    public EnumC8982cS0 f28005C;

    /* renamed from: D */
    public C4145gu f28006D;

    /* renamed from: E */
    public boolean f28007E;

    /* renamed from: F */
    public final C1068Qy f28008F;

    /* renamed from: G */
    public final C0743Lo f28009G;

    /* renamed from: H */
    public FrameProcessor f28010H;

    /* renamed from: I */
    public C10237mD0 f28011I;

    /* renamed from: J */
    public long f28012J;

    /* renamed from: K */
    public final C10189lr0 f28013K;

    /* renamed from: a */
    public String f28014a;

    /* renamed from: b */
    public boolean f28015b;

    /* renamed from: c */
    public boolean f28016c;

    /* renamed from: d */
    public boolean f28017d;

    /* renamed from: e */
    public boolean f28018e;

    /* renamed from: f */
    public boolean f28019f;

    /* renamed from: g */
    public boolean f28020g;

    /* renamed from: h */
    public boolean f28021h;

    /* renamed from: i */
    public EnumC10105lB0 f28022i;

    /* renamed from: j */
    public boolean f28023j;

    /* renamed from: k */
    public boolean f28024k;

    /* renamed from: l */
    public C4076fo f28025l;

    /* renamed from: m */
    public Integer f28026m;

    /* renamed from: n */
    public Integer f28027n;

    /* renamed from: o */
    public EnumC8373Uj1 f28028o;

    /* renamed from: p */
    public boolean f28029p;

    /* renamed from: q */
    public boolean f28030q;

    /* renamed from: r */
    public Double f28031r;

    /* renamed from: s */
    public Double f28032s;

    /* renamed from: t */
    public EnumC11139tG0 f28033t;

    /* renamed from: u */
    public boolean f28034u;

    /* renamed from: v */
    public boolean f28035v;

    /* renamed from: w */
    public EnumC10926rb1 f28036w;

    /* renamed from: x */
    public float f28037x;

    /* renamed from: y */
    public double f28038y;

    /* renamed from: z */
    public EnumC9693hz0 f28039z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140gp(S91 s91) {
        super(s91);
        O90.m5968f(s91, "context");
        this.f28022i = EnumC10105lB0.f36940c;
        this.f28024k = true;
        this.f28033t = EnumC11139tG0.f42983c;
        this.f28036w = EnumC10926rb1.f41746c;
        this.f28037x = 1.0f;
        this.f28039z = EnumC9693hz0.f28706c;
        this.f28003A = EnumC10493oD0.f38890c;
        this.f28005C = EnumC8982cS0.f17520c;
        C0399GK c0399gk = C0399GK.f3694a;
        this.f28008F = AbstractC11432vY1.m25444a(AbstractC7702Hm0.f4486a);
        this.f28012J = System.currentTimeMillis();
        this.f28013K = new C10189lr0(this);
        setClipToOutline(true);
        this.f28009G = new C0743Lo(s91, this);
        setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC6523nz(this, 1));
        m18652e();
    }

    /* renamed from: a */
    public final void m18648a(Throwable th) {
        O90.m5968f(th, "error");
        th.printStackTrace();
        AbstractC6386lo c10233mB0 = th instanceof AbstractC6386lo ? (AbstractC6386lo) th : new C10233mB0(th);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", c10233mB0.f37292a + "/" + c10233mB0.f37293b);
        writableMapCreateMap.putString("message", c10233mB0.f37294c);
        Throwable cause = c10233mB0.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", ER1.m2273d(cause));
        }
        ER1.m2274e(this, new C4004ef(OZ1.m6094e(this), getId(), writableMapCreateMap, 2));
    }

    /* renamed from: b */
    public final void m18649b(Frame frame) {
        C10189lr0 c10189lr0 = this.f28013K;
        c10189lr0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((ArrayList) c10189lr0.f37324c).add(Long.valueOf(jCurrentTimeMillis));
        ArrayList arrayList = (ArrayList) c10189lr0.f37324c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (jCurrentTimeMillis - ((Number) next).longValue() < 1000) {
                arrayList2.add(next);
            }
        }
        c10189lr0.f37324c = AbstractC7167xu.m25984d0(arrayList2);
        FrameProcessor frameProcessor = this.f28010H;
        if (frameProcessor != null) {
            frameProcessor.call(frame);
        }
    }

    /* renamed from: c */
    public final void m18650c(A01 a01) {
        a01.toString();
        int iM6094e = OZ1.m6094e(this);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", a01.f8a);
        ER1.m2274e(this, new C4004ef(iM6094e, getId(), writableMapCreateMap, 5));
    }

    /* renamed from: d */
    public final void m18651d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f28012J = jCurrentTimeMillis;
        AbstractC9366fP1.m18230b(this.f28008F, null, new C3951dp(this, jCurrentTimeMillis, null), 3);
    }

    /* renamed from: e */
    public final void m18652e() {
        AbstractC9366fP1.m18230b(this.f28008F, null, new C4014ep(this, null), 3);
    }

    public final EnumC10493oD0 getAndroidPreviewViewType() {
        return this.f28003A;
    }

    public final boolean getAudio() {
        return this.f28020g;
    }

    public final String getCameraId() {
        return this.f28014a;
    }

    public final C0743Lo getCameraSession$react_native_vision_camera_release() {
        return this.f28009G;
    }

    public final C4145gu getCodeScannerOptions() {
        return this.f28006D;
    }

    public final boolean getEnableDepthData() {
        return this.f28015b;
    }

    public final boolean getEnableFrameProcessor() {
        return this.f28021h;
    }

    public final boolean getEnableLocation() {
        return this.f28023j;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.f28016c;
    }

    public final boolean getEnableZoomGesture() {
        return this.f28004B;
    }

    public final double getExposure() {
        return this.f28038y;
    }

    public final C4076fo getFormat() {
        return this.f28025l;
    }

    public final FrameProcessor getFrameProcessor$react_native_vision_camera_release() {
        return this.f28010H;
    }

    public final boolean getLowLightBoost() {
        return this.f28034u;
    }

    public final Integer getMaxFps() {
        return this.f28027n;
    }

    public final Integer getMinFps() {
        return this.f28026m;
    }

    public final EnumC9693hz0 getOutputOrientation() {
        return this.f28039z;
    }

    public final boolean getPhoto() {
        return this.f28018e;
    }

    public final boolean getPhotoHdr() {
        return this.f28030q;
    }

    public final EnumC11139tG0 getPhotoQualityBalance() {
        return this.f28033t;
    }

    public final EnumC10105lB0 getPixelFormat() {
        return this.f28022i;
    }

    public final boolean getPreview() {
        return this.f28024k;
    }

    public final C10237mD0 getPreviewView$react_native_vision_camera_release() {
        return this.f28011I;
    }

    public final EnumC8982cS0 getResizeMode() {
        return this.f28005C;
    }

    public final EnumC10926rb1 getTorch() {
        return this.f28036w;
    }

    public final boolean getVideo() {
        return this.f28019f;
    }

    public final Double getVideoBitRateMultiplier() {
        return this.f28032s;
    }

    public final Double getVideoBitRateOverride() {
        return this.f28031r;
    }

    public final boolean getVideoHdr() {
        return this.f28029p;
    }

    public final EnumC8373Uj1 getVideoStabilizationMode() {
        return this.f28028o;
    }

    public final float getZoom() {
        return this.f28037x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f28007E) {
            this.f28007E = true;
            ER1.m2274e(this, new C6846so(OZ1.m6094e(this), getId(), 5));
        }
        C10189lr0 c10189lr0 = this.f28013K;
        c10189lr0.getClass();
        Timer timer = new Timer("VisionCamera FPS Sample Collector");
        c10189lr0.f37325d = timer;
        timer.schedule(new C0601JX(0, c10189lr0), 1000L, 1000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10189lr0 c10189lr0 = this.f28013K;
        Timer timer = (Timer) c10189lr0.f37325d;
        if (timer != null) {
            timer.cancel();
        }
        c10189lr0.f37325d = null;
    }

    public final void setActive(boolean z) {
        this.f28035v = z;
    }

    public final void setAndroidPreviewViewType(EnumC10493oD0 enumC10493oD0) {
        O90.m5968f(enumC10493oD0, "value");
        this.f28003A = enumC10493oD0;
        m18652e();
    }

    public final void setAudio(boolean z) {
        this.f28020g = z;
    }

    public final void setCameraId(String str) {
        this.f28014a = str;
    }

    public final void setCodeScannerOptions(C4145gu c4145gu) {
        this.f28006D = c4145gu;
    }

    public final void setEnableDepthData(boolean z) {
        this.f28015b = z;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.f28021h = z;
    }

    public final void setEnableLocation(boolean z) {
        this.f28023j = z;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.f28016c = z;
    }

    public final void setEnableZoomGesture(boolean z) {
        this.f28004B = z;
        if (z) {
            setOnTouchListener(new ViewOnTouchListenerC1809bp(0, new ScaleGestureDetector(getContext(), new C4077fp(0, this))));
        } else {
            setOnTouchListener(null);
        }
    }

    public final void setExposure(double d) {
        this.f28038y = d;
    }

    public final void setFormat(C4076fo c4076fo) {
        this.f28025l = c4076fo;
    }

    public final void setFrameProcessor$react_native_vision_camera_release(FrameProcessor frameProcessor) {
        this.f28010H = frameProcessor;
    }

    public final void setLowLightBoost(boolean z) {
        this.f28034u = z;
    }

    public final void setMaxFps(Integer num) {
        this.f28027n = num;
    }

    public final void setMinFps(Integer num) {
        this.f28026m = num;
    }

    public final void setMirrored(boolean z) {
        this.f28017d = z;
    }

    public final void setOutputOrientation(EnumC9693hz0 enumC9693hz0) {
        O90.m5968f(enumC9693hz0, "<set-?>");
        this.f28039z = enumC9693hz0;
    }

    public final void setPhoto(boolean z) {
        this.f28018e = z;
    }

    public final void setPhotoHdr(boolean z) {
        this.f28030q = z;
    }

    public final void setPhotoQualityBalance(EnumC11139tG0 enumC11139tG0) {
        O90.m5968f(enumC11139tG0, "<set-?>");
        this.f28033t = enumC11139tG0;
    }

    public final void setPixelFormat(EnumC10105lB0 enumC10105lB0) {
        O90.m5968f(enumC10105lB0, "<set-?>");
        this.f28022i = enumC10105lB0;
    }

    public final void setPreview(boolean z) {
        this.f28024k = z;
        m18652e();
    }

    public final void setPreviewView$react_native_vision_camera_release(C10237mD0 c10237mD0) {
        this.f28011I = c10237mD0;
    }

    public final void setResizeMode(EnumC8982cS0 enumC8982cS0) {
        O90.m5968f(enumC8982cS0, "value");
        this.f28005C = enumC8982cS0;
        m18652e();
    }

    public final void setTorch(EnumC10926rb1 enumC10926rb1) {
        O90.m5968f(enumC10926rb1, "<set-?>");
        this.f28036w = enumC10926rb1;
    }

    public final void setVideo(boolean z) {
        this.f28019f = z;
    }

    public final void setVideoBitRateMultiplier(Double d) {
        this.f28032s = d;
    }

    public final void setVideoBitRateOverride(Double d) {
        this.f28031r = d;
    }

    public final void setVideoHdr(boolean z) {
        this.f28029p = z;
    }

    public final void setVideoStabilizationMode(EnumC8373Uj1 enumC8373Uj1) {
        this.f28028o = enumC8373Uj1;
    }

    public final void setZoom(float f) {
        this.f28037x = f;
    }
}
