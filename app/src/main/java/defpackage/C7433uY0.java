package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;

/* renamed from: uY0 */
/* loaded from: classes.dex */
public final class C7433uY0 extends AbstractC7242tY0 {
    public static C7433uY0 e(InterfaceC5361jh1 interfaceC5361jh1, Size size) {
        if (interfaceC5361jh1.z() == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC5361jh1.K(interfaceC5361jh1.toString()));
        }
        C7433uY0 c7433uY0 = new C7433uY0();
        C8194yY0 c8194yY0H = interfaceC5361jh1.H();
        C0873Ky0 c0873Ky0 = C0873Ky0.c;
        int i = C8194yY0.a().g.c;
        if (c8194yY0H != null) {
            i = c8194yY0H.g.c;
            for (CameraDevice.StateCallback stateCallback : c8194yY0H.c) {
                ArrayList arrayList = c7433uY0.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : c8194yY0H.d) {
                ArrayList arrayList2 = c7433uY0.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            c7433uY0.b.a(c8194yY0H.g.e);
            c0873Ky0 = c8194yY0H.g.b;
        }
        C2005Zm c2005Zm = c7433uY0.b;
        c2005Zm.getClass();
        c2005Zm.e = C0468Ft0.c(c0873Ky0);
        if (interfaceC5361jh1 instanceof C3539eD0) {
            Rational rational = AbstractC3730fD0.a;
            if (((PreviewPixelHDRnetQuirk) AbstractC7768wJ.a.z0(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC3730fD0.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                C0468Ft0 c0468Ft0B = C0468Ft0.b();
                c0468Ft0B.e(C3456dn.L0(CaptureRequest.TONEMAP_MODE), 2);
                c7433uY0.b.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            }
        }
        c7433uY0.b.a = ((Integer) interfaceC5361jh1.q(C3456dn.d, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) interfaceC5361jh1.q(C3456dn.f, new C4222ho());
        ArrayList arrayList3 = c7433uY0.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) interfaceC5361jh1.q(C3456dn.g, new C0371En());
        ArrayList arrayList4 = c7433uY0.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        c7433uY0.a(new C1624Up((CameraCaptureSession.CaptureCallback) interfaceC5361jh1.q(C3456dn.h, new C0524Gm())));
        int iU = interfaceC5361jh1.U();
        if (iU != 0) {
            C2005Zm c2005Zm2 = c7433uY0.b;
            c2005Zm2.getClass();
            if (iU != 0) {
                ((C0468Ft0) c2005Zm2.e).e(InterfaceC5361jh1.e1, Integer.valueOf(iU));
            }
        }
        int iG0 = interfaceC5361jh1.g0();
        if (iG0 != 0) {
            C2005Zm c2005Zm3 = c7433uY0.b;
            c2005Zm3.getClass();
            if (iG0 != 0) {
                ((C0468Ft0) c2005Zm3.e).e(InterfaceC5361jh1.d1, Integer.valueOf(iG0));
            }
        }
        C0468Ft0 c0468Ft0B2 = C0468Ft0.b();
        C0572Hc c0572Hc = C3456dn.i;
        c0468Ft0B2.e(c0572Hc, (String) interfaceC5361jh1.q(c0572Hc, null));
        C0572Hc c0572Hc2 = C3456dn.e;
        Long l = (Long) interfaceC5361jh1.q(c0572Hc2, -1L);
        l.getClass();
        c0468Ft0B2.e(c0572Hc2, l);
        c7433uY0.b.c(c0468Ft0B2);
        c7433uY0.b.c(C2580cn.b(interfaceC5361jh1).a());
        return c7433uY0;
    }

    public final void a(AbstractC6141nn abstractC6141nn) {
        this.b.b(abstractC6141nn);
        ArrayList arrayList = this.e;
        if (arrayList.contains(abstractC6141nn)) {
            return;
        }
        arrayList.add(abstractC6141nn);
    }

    public final void b(InterfaceC7122sw interfaceC7122sw) {
        this.b.c(interfaceC7122sw);
    }

    public final void c(AbstractC4314iH abstractC4314iH, CM cm, int i) {
        C1241Pr0 c1241Pr0A = C8211ye.a(abstractC4314iH);
        c1241Pr0A.c = null;
        if (cm == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        c1241Pr0A.f = cm;
        c1241Pr0A.d = Integer.valueOf(i);
        this.a.add(c1241Pr0A.l());
        this.b.d(abstractC4314iH);
    }

    public final C8194yY0 d() {
        return new C8194yY0(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.e(), this.f, this.g, this.h, this.i);
    }
}
