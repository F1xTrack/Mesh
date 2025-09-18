package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* loaded from: classes.dex */
public final class B4 implements InterfaceC1470Sp1 {
    public final C0527Gn a;
    public final Range b;
    public C0365El d;
    public final boolean f;
    public float c = 1.0f;
    public float e = 1.0f;

    public B4(C0527Gn c0527Gn) {
        boolean z = false;
        this.f = false;
        this.a = c0527Gn;
        this.b = (Range) c0527Gn.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) c0527Gn.b.a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
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
            c0527Gn.getClass();
        }
        this.f = z;
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final void c(TotalCaptureResult totalCaptureResult) {
        if (this.d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.e == f.floatValue()) {
                this.d.b(null);
                this.d = null;
            }
        }
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final float getMaxZoom() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final float getMinZoom() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final Rect k() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final void n(C2580cn c2580cn) {
        c2580cn.e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (!this.f || Build.VERSION.SDK_INT < 34) {
            return;
        }
        c2580cn.e(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final void o(float f, C0365El c0365El) {
        this.c = f;
        C0365El c0365El2 = this.d;
        if (c0365El2 != null) {
            c0365El2.d(new C1774Wn("There is a new zoomRatio being set"));
        }
        this.e = this.c;
        this.d = c0365El;
    }

    @Override // defpackage.InterfaceC1470Sp1
    public final void p() {
        this.c = 1.0f;
        C0365El c0365El = this.d;
        if (c0365El != null) {
            c0365El.d(new C1774Wn("Camera is not active."));
            this.d = null;
        }
    }
}
