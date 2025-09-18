package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* renamed from: x60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11629x60 extends C0490Hm {

    /* renamed from: b */
    public static final C11629x60 f45366b;

    static {
        new C7616Fv0(15);
        f45366b = new C11629x60();
    }

    @Override // p000.C0490Hm
    /* renamed from: a */
    public final void mo3587a(C11375v60 c11375v60, C1622Zm c1622Zm) {
        super.mo3587a(c11375v60, c1622Zm);
        if (!(c11375v60 instanceof C11375v60)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        C0480Hc c0480Hc = C11375v60.f44147b;
        if (c11375v60.mo4790Q(c0480Hc)) {
            int iIntValue = ((Integer) AbstractC11153tN0.m24897i(c11375v60, c0480Hc)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) AbstractC7067wJ.f44776a.m17864z0(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c7612Ft0M2812b.m2815e(C3950dn.m17743L0(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    c7612Ft0M2812b.m2815e(C3950dn.m17743L0(key2), Boolean.FALSE);
                }
            }
        }
        c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
    }
}
