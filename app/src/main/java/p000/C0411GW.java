package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: GW */
/* loaded from: classes.dex */
public final class C0411GW {

    /* renamed from: v */
    public static final MeteringRectangle[] f3773v = new MeteringRectangle[0];

    /* renamed from: a */
    public final C6573om f3774a;

    /* renamed from: b */
    public final ExecutorC10151lY0 f3775b;

    /* renamed from: c */
    public final C20 f3776c;

    /* renamed from: f */
    public final QQ0 f3779f;

    /* renamed from: i */
    public ScheduledFuture f3782i;

    /* renamed from: j */
    public ScheduledFuture f3783j;

    /* renamed from: p */
    public MeteringRectangle[] f3789p;

    /* renamed from: q */
    public MeteringRectangle[] f3790q;

    /* renamed from: r */
    public MeteringRectangle[] f3791r;

    /* renamed from: s */
    public C0300El f3792s;

    /* renamed from: t */
    public boolean f3793t;

    /* renamed from: u */
    public C0285EW f3794u;

    /* renamed from: d */
    public volatile boolean f3777d = false;

    /* renamed from: e */
    public volatile Rational f3778e = null;

    /* renamed from: g */
    public boolean f3780g = false;

    /* renamed from: h */
    public Integer f3781h = 0;

    /* renamed from: k */
    public long f3784k = 0;

    /* renamed from: l */
    public boolean f3785l = false;

    /* renamed from: m */
    public boolean f3786m = false;

    /* renamed from: n */
    public int f3787n = 1;

    /* renamed from: o */
    public C0348FW f3788o = null;

    public C0411GW(C6573om c6573om, C20 c20, ExecutorC10151lY0 executorC10151lY0, C9196e41 c9196e41) {
        MeteringRectangle[] meteringRectangleArr = f3773v;
        this.f3789p = meteringRectangleArr;
        this.f3790q = meteringRectangleArr;
        this.f3791r = meteringRectangleArr;
        this.f3792s = null;
        this.f3793t = false;
        this.f3794u = null;
        this.f3774a = c6573om;
        this.f3775b = executorC10151lY0;
        this.f3776c = c20;
        this.f3779f = new QQ0(c9196e41);
    }

    /* renamed from: a */
    public final void m3075a(boolean z, boolean z2) {
        if (this.f3777d) {
            C1622Zm c1622Zm = new C1622Zm();
            c1622Zm.f15115c = true;
            c1622Zm.f15113a = this.f3787n;
            C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
            if (z) {
                c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            this.f3774a.m23551l(Collections.singletonList(c1622Zm.m9592e()));
        }
    }

    /* renamed from: b */
    public final void m3076b() {
        C6573om c6573om = this.f3774a;
        c6573om.m23549j(null);
        c6573om.m23549j(this.f3788o);
        C0300El c0300El = this.f3792s;
        if (c0300El != null) {
            c0300El.m2377d(new C1434Wn("Cancelled by cancelFocusAndMetering()"));
            this.f3792s = null;
        }
        ScheduledFuture scheduledFuture = this.f3782i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f3782i = null;
        }
        ScheduledFuture scheduledFuture2 = this.f3783j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f3783j = null;
        }
        if (this.f3789p.length > 0) {
            m3075a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f3773v;
        this.f3789p = meteringRectangleArr;
        this.f3790q = meteringRectangleArr;
        this.f3791r = meteringRectangleArr;
        this.f3780g = false;
        c6573om.m23552m();
    }

    /* renamed from: c */
    public final InterfaceFutureC7800Jj0 m3077c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        F70 f70 = F70.f3069c;
        return (i >= 28 && C6573om.m23540e(this.f3774a.f39232d, 5) == 5) ? AbstractC11797yQ1.m26149b(new C0159CW(this, z, 0)) : f70;
    }

    /* renamed from: d */
    public final List m3078d(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7972Mr0 c7972Mr0 = (C7972Mr0) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = c7972Mr0.f7370a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = c7972Mr0.f7371b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = c7972Mr0.f7373d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && ((C9196e41) this.f3779f.f9619a).m17862x0(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f2) : new PointF(f, f2);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    float fWidth = rect.width();
                    float f3 = c7972Mr0.f7372c;
                    int i3 = ((int) (fWidth * f3)) / 2;
                    int iHeight2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - i3, iHeight - iHeight2, iWidth + i3, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    public final boolean m3079e(C0974PT c0974pt) {
        Rational rational;
        C6573om c6573om = this.f3774a;
        Rect rectMo483k = ((InterfaceC8281Sp1) c6573om.f39236h.f16687g).mo483k();
        if (this.f3778e != null) {
            rational = this.f3778e;
        } else {
            Rect rectMo483k2 = ((InterfaceC8281Sp1) this.f3774a.f39236h.f16687g).mo483k();
            rational = new Rational(rectMo483k2.width(), rectMo483k2.height());
        }
        List list = (List) c0974pt.f9079c;
        Integer num = (Integer) c6573om.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        List listM3078d = m3078d(list, num == null ? 0 : num.intValue(), rational, rectMo483k, 1);
        Integer num2 = (Integer) c6573om.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        List listM3078d2 = m3078d((List) c0974pt.f9080d, num2 == null ? 0 : num2.intValue(), rational, rectMo483k, 2);
        Integer num3 = (Integer) c6573om.f39232d.m3155a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        return (listM3078d.isEmpty() && listM3078d2.isEmpty() && m3078d((List) c0974pt.f9081e, num3 == null ? 0 : num3.intValue(), rational, rectMo483k, 4).isEmpty()) ? false : true;
    }

    /* renamed from: f */
    public final void m3080f(C0300El c0300El) {
        AbstractC7806Jm0.m4412f("FocusMeteringControl");
        if (!this.f3777d) {
            c0300El.m2377d(new C1434Wn("Camera is not active."));
            return;
        }
        C1622Zm c1622Zm = new C1622Zm();
        c1622Zm.f15113a = this.f3787n;
        c1622Zm.f15115c = true;
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
        c1622Zm.m9589b(new C0993Pm(1, c0300El));
        this.f3774a.m23551l(Collections.singletonList(c1622Zm.m9592e()));
    }

    /* renamed from: g */
    public final void m3081g(boolean z) {
        if (this.f3777d) {
            C1622Zm c1622Zm = new C1622Zm();
            c1622Zm.f15113a = this.f3787n;
            c1622Zm.f15115c = true;
            C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
            c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(C6573om.m23540e(this.f3774a.f39232d, 1));
                c7612Ft0M2812b.m2814d(C3950dn.m17743L0(key), EnumC6791rw.f42160b, numValueOf);
            }
            c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            c1622Zm.m9589b(new C1747aq(1));
            this.f3774a.m23551l(Collections.singletonList(c1622Zm.m9592e()));
        }
    }
}
