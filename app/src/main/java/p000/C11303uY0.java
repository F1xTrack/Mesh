package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;

/* renamed from: uY0 */
/* loaded from: classes.dex */
public final class C11303uY0 extends AbstractC11175tY0 {
    /* renamed from: e */
    public static C11303uY0 m25202e(InterfaceC9914jh1 interfaceC9914jh1, Size size) {
        if (interfaceC9914jh1.mo6174z() == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC9914jh1.mo997K(interfaceC9914jh1.toString()));
        }
        C11303uY0 c11303uY0 = new C11303uY0();
        C11812yY0 c11812yY0Mo6165H = interfaceC9914jh1.mo6165H();
        C7882Ky0 c7882Ky0 = C7882Ky0.f6403c;
        int i = C11812yY0.m26163a().f46304g.f12780c;
        if (c11812yY0Mo6165H != null) {
            i = c11812yY0Mo6165H.f46304g.f12780c;
            for (CameraDevice.StateCallback stateCallback : c11812yY0Mo6165H.f46300c) {
                ArrayList arrayList = c11303uY0.f43135c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : c11812yY0Mo6165H.f46301d) {
                ArrayList arrayList2 = c11303uY0.f43136d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            c11303uY0.f43134b.m9588a(c11812yY0Mo6165H.f46304g.f12782e);
            c7882Ky0 = c11812yY0Mo6165H.f46304g.f12779b;
        }
        C1622Zm c1622Zm = c11303uY0.f43134b;
        c1622Zm.getClass();
        c1622Zm.f15117e = C7612Ft0.m2813c(c7882Ky0);
        if (interfaceC9914jh1 instanceof C9213eD0) {
            Rational rational = AbstractC9341fD0.f27109a;
            if (((PreviewPixelHDRnetQuirk) AbstractC7067wJ.f44776a.m17864z0(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC9341fD0.f27109a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.TONEMAP_MODE), 2);
                c11303uY0.f43134b.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            }
        }
        c11303uY0.f43134b.f15113a = ((Integer) interfaceC9914jh1.mo4792q(C3950dn.f26271d, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) interfaceC9914jh1.mo4792q(C3950dn.f26273f, new C4202ho());
        ArrayList arrayList3 = c11303uY0.f43135c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) interfaceC9914jh1.mo4792q(C3950dn.f26274g, new C0302En());
        ArrayList arrayList4 = c11303uY0.f43136d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        c11303uY0.m25203a(new C1310Up((CameraCaptureSession.CaptureCallback) interfaceC9914jh1.mo4792q(C3950dn.f26275h, new C0427Gm())));
        int iMo6167U = interfaceC9914jh1.mo6167U();
        if (iMo6167U != 0) {
            C1622Zm c1622Zm2 = c11303uY0.f43134b;
            c1622Zm2.getClass();
            if (iMo6167U != 0) {
                ((C7612Ft0) c1622Zm2.f15117e).m2815e(InterfaceC9914jh1.f35334e1, Integer.valueOf(iMo6167U));
            }
        }
        int iMo6169g0 = interfaceC9914jh1.mo6169g0();
        if (iMo6169g0 != 0) {
            C1622Zm c1622Zm3 = c11303uY0.f43134b;
            c1622Zm3.getClass();
            if (iMo6169g0 != 0) {
                ((C7612Ft0) c1622Zm3.f15117e).m2815e(InterfaceC9914jh1.f35333d1, Integer.valueOf(iMo6169g0));
            }
        }
        C7612Ft0 c7612Ft0M2812b2 = C7612Ft0.m2812b();
        C0480Hc c0480Hc = C3950dn.f26276i;
        c7612Ft0M2812b2.m2815e(c0480Hc, (String) interfaceC9914jh1.mo4792q(c0480Hc, null));
        C0480Hc c0480Hc2 = C3950dn.f26272e;
        Long l = (Long) interfaceC9914jh1.mo4792q(c0480Hc2, -1L);
        l.getClass();
        c7612Ft0M2812b2.m2815e(c0480Hc2, l);
        c11303uY0.f43134b.m9590c(c7612Ft0M2812b2);
        c11303uY0.f43134b.m9590c(C1869cn.m10866b(interfaceC9914jh1).m10867a());
        return c11303uY0;
    }

    /* renamed from: a */
    public final void m25203a(AbstractC6511nn abstractC6511nn) {
        this.f43134b.m9589b(abstractC6511nn);
        ArrayList arrayList = this.f43137e;
        if (arrayList.contains(abstractC6511nn)) {
            return;
        }
        arrayList.add(abstractC6511nn);
    }

    /* renamed from: b */
    public final void m25204b(InterfaceC6854sw interfaceC6854sw) {
        this.f43134b.m9590c(interfaceC6854sw);
    }

    /* renamed from: c */
    public final void m25205c(AbstractC4232iH abstractC4232iH, C0149CM c0149cm, int i) {
        C8128Pr0 c8128Pr0M26209a = C7214ye.m26209a(abstractC4232iH);
        c8128Pr0M26209a.f9305c = null;
        if (c0149cm == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        c8128Pr0M26209a.f9308f = c0149cm;
        c8128Pr0M26209a.f9306d = Integer.valueOf(i);
        this.f43133a.add(c8128Pr0M26209a.m6450l());
        this.f43134b.m9591d(abstractC4232iH);
    }

    /* renamed from: d */
    public final C11812yY0 m25206d() {
        return new C11812yY0(new ArrayList(this.f43133a), new ArrayList(this.f43135c), new ArrayList(this.f43136d), new ArrayList(this.f43137e), this.f43134b.m9592e(), this.f43138f, this.f43139g, this.f43140h, this.f43141i);
    }
}
