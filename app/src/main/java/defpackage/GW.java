package defpackage;

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

/* loaded from: classes.dex */
public final class GW {
    public static final MeteringRectangle[] v = new MeteringRectangle[0];
    public final C6329om a;
    public final ExecutorC5715lY0 b;
    public final C20 c;
    public final QQ0 f;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public C0365El s;
    public boolean t;
    public EW u;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public FW o = null;

    public GW(C6329om c6329om, C20 c20, ExecutorC5715lY0 executorC5715lY0, C3513e41 c3513e41) {
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = null;
        this.t = false;
        this.u = null;
        this.a = c6329om;
        this.b = executorC5715lY0;
        this.c = c20;
        this.f = new QQ0(c3513e41);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            C2005Zm c2005Zm = new C2005Zm();
            c2005Zm.c = true;
            c2005Zm.a = this.n;
            C0468Ft0 c0468Ft0B = C0468Ft0.b();
            if (z) {
                c0468Ft0B.e(C3456dn.L0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                c0468Ft0B.e(C3456dn.L0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            this.a.l(Collections.singletonList(c2005Zm.e()));
        }
    }

    public final void b() {
        C6329om c6329om = this.a;
        c6329om.j(null);
        c6329om.j(this.o);
        C0365El c0365El = this.s;
        if (c0365El != null) {
            c0365El.d(new C1774Wn("Cancelled by cancelFocusAndMetering()"));
            this.s = null;
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.p.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = v;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.g = false;
        c6329om.m();
    }

    public final InterfaceFutureC0750Jj0 c(boolean z) {
        int i = Build.VERSION.SDK_INT;
        F70 f70 = F70.c;
        return (i >= 28 && C6329om.e(this.a.d, 5) == 5) ? AbstractC8171yQ1.b(new CW(this, z, 0)) : f70;
    }

    public final List d(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1007Mr0 c1007Mr0 = (C1007Mr0) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = c1007Mr0.a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = c1007Mr0.b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    Rational rational3 = c1007Mr0.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i2 == 1 && ((C3513e41) this.f.a).x0(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f2) : new PointF(f, f2);
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
                    float f3 = c1007Mr0.c;
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

    public final boolean e(PT pt) {
        Rational rational;
        C6329om c6329om = this.a;
        Rect rectK = ((InterfaceC1470Sp1) c6329om.h.g).k();
        if (this.e != null) {
            rational = this.e;
        } else {
            Rect rectK2 = ((InterfaceC1470Sp1) this.a.h.g).k();
            rational = new Rational(rectK2.width(), rectK2.height());
        }
        List list = (List) pt.c;
        Integer num = (Integer) c6329om.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        List listD = d(list, num == null ? 0 : num.intValue(), rational, rectK, 1);
        Integer num2 = (Integer) c6329om.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        List listD2 = d((List) pt.d, num2 == null ? 0 : num2.intValue(), rational, rectK, 2);
        Integer num3 = (Integer) c6329om.d.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        return (listD.isEmpty() && listD2.isEmpty() && d((List) pt.e, num3 == null ? 0 : num3.intValue(), rational, rectK, 4).isEmpty()) ? false : true;
    }

    public final void f(C0365El c0365El) {
        AbstractC0759Jm0.f("FocusMeteringControl");
        if (!this.d) {
            c0365El.d(new C1774Wn("Camera is not active."));
            return;
        }
        C2005Zm c2005Zm = new C2005Zm();
        c2005Zm.a = this.n;
        c2005Zm.c = true;
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        c0468Ft0B.e(C3456dn.L0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
        c2005Zm.b(new C1225Pm(1, c0365El));
        this.a.l(Collections.singletonList(c2005Zm.e()));
    }

    public final void g(boolean z) {
        if (this.d) {
            C2005Zm c2005Zm = new C2005Zm();
            c2005Zm.a = this.n;
            c2005Zm.c = true;
            C0468Ft0 c0468Ft0B = C0468Ft0.b();
            c0468Ft0B.e(C3456dn.L0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(C6329om.e(this.a.d, 1));
                c0468Ft0B.d(C3456dn.L0(key), EnumC6931rw.b, numValueOf);
            }
            c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            c2005Zm.b(new C2208aq(1));
            this.a.l(Collections.singletonList(c2005Zm.e()));
        }
    }
}
