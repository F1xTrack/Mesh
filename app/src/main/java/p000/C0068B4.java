package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* renamed from: B4 */
/* loaded from: classes.dex */
public final class C0068B4 implements InterfaceC8281Sp1 {

    /* renamed from: a */
    public final C0428Gn f539a;

    /* renamed from: b */
    public final Range f540b;

    /* renamed from: d */
    public C0300El f542d;

    /* renamed from: f */
    public final boolean f544f;

    /* renamed from: c */
    public float f541c = 1.0f;

    /* renamed from: e */
    public float f543e = 1.0f;

    public C0068B4(C0428Gn c0428Gn) {
        boolean z = false;
        this.f544f = false;
        this.f539a = c0428Gn;
        this.f540b = (Range) c0428Gn.m3155a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) c0428Gn.f3890b.f9619a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        } else {
            c0428Gn.getClass();
        }
        this.f544f = z;
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: c */
    public final void mo482c(TotalCaptureResult totalCaptureResult) {
        if (this.f542d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.f543e == f.floatValue()) {
                this.f542d.m2375b(null);
                this.f542d = null;
            }
        }
    }

    @Override // p000.InterfaceC8281Sp1
    public final float getMaxZoom() {
        return ((Float) this.f540b.getUpper()).floatValue();
    }

    @Override // p000.InterfaceC8281Sp1
    public final float getMinZoom() {
        return ((Float) this.f540b.getLower()).floatValue();
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: k */
    public final Rect mo483k() {
        Rect rect = (Rect) this.f539a.m3155a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: n */
    public final void mo484n(C1869cn c1869cn) {
        c1869cn.m10868e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f541c));
        if (!this.f544f || Build.VERSION.SDK_INT < 34) {
            return;
        }
        c1869cn.m10868e(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: o */
    public final void mo485o(float f, C0300El c0300El) {
        this.f541c = f;
        C0300El c0300El2 = this.f542d;
        if (c0300El2 != null) {
            c0300El2.m2377d(new C1434Wn("There is a new zoomRatio being set"));
        }
        this.f543e = this.f541c;
        this.f542d = c0300El;
    }

    @Override // p000.InterfaceC8281Sp1
    /* renamed from: p */
    public final void mo486p() {
        this.f541c = 1.0f;
        C0300El c0300El = this.f542d;
        if (c0300El != null) {
            c0300El.m2377d(new C1434Wn("Camera is not active."));
            this.f542d = null;
        }
    }
}
