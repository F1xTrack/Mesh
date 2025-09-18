package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* renamed from: x60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7920x60 extends C0602Hm {
    public static final C7920x60 b;

    static {
        new C0474Fv0(15);
        b = new C7920x60();
    }

    @Override // defpackage.C0602Hm
    public final void a(C7540v60 c7540v60, C2005Zm c2005Zm) {
        super.a(c7540v60, c2005Zm);
        if (!(c7540v60 instanceof C7540v60)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        C0572Hc c0572Hc = C7540v60.b;
        if (c7540v60.Q(c0572Hc)) {
            int iIntValue = ((Integer) AbstractC7209tN0.i(c7540v60, c0572Hc)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) AbstractC7768wJ.a.z0(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c0468Ft0B.e(C3456dn.L0(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c0468Ft0B.e(C3456dn.L0(key2), Boolean.FALSE);
                }
            }
        }
        c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
    }
}
