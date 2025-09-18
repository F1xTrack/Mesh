package p000;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class JD0 implements InterfaceC4204hq {

    /* renamed from: o */
    public static final ArrayList f5382o = new ArrayList();

    /* renamed from: p */
    public static int f5383p = 0;

    /* renamed from: a */
    public final AbstractC9513gZ0 f5384a;

    /* renamed from: b */
    public final C0301Em f5385b;

    /* renamed from: c */
    public final ExecutorC10151lY0 f5386c;

    /* renamed from: d */
    public final C20 f5387d;

    /* renamed from: e */
    public final C4141gq f5388e;

    /* renamed from: g */
    public C11812yY0 f5390g;

    /* renamed from: h */
    public C4201hn f5391h;

    /* renamed from: i */
    public C11812yY0 f5392i;

    /* renamed from: f */
    public List f5389f = new ArrayList();

    /* renamed from: k */
    public volatile List f5394k = null;

    /* renamed from: m */
    public C8342Tu0 f5396m = new C8342Tu0(6, C7882Ky0.m4786a(C7612Ft0.m2812b()));

    /* renamed from: n */
    public C8342Tu0 f5397n = new C8342Tu0(6, C7882Ky0.m4786a(C7612Ft0.m2812b()));

    /* renamed from: j */
    public int f5393j = 1;

    /* renamed from: l */
    public final C4049fN f5395l = new C4049fN(19);

    public JD0(AbstractC9513gZ0 abstractC9513gZ0, C0301Em c0301Em, C8342Tu0 c8342Tu0, ExecutorC10151lY0 executorC10151lY0, C20 c20) {
        this.f5388e = new C4141gq(c8342Tu0);
        this.f5384a = abstractC9513gZ0;
        this.f5385b = c0301Em;
        this.f5386c = executorC10151lY0;
        this.f5387d = c20;
        f5383p++;
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
    }

    /* renamed from: i */
    public static void m4245i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1373Vp c1373Vp = (C1373Vp) it.next();
            Iterator it2 = c1373Vp.f12782e.iterator();
            while (it2.hasNext()) {
                ((AbstractC6511nn) it2.next()).mo6422a(c1373Vp.m8575a());
            }
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: a */
    public final void mo4246a() {
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        if (this.f5394k != null) {
            for (C1373Vp c1373Vp : this.f5394k) {
                Iterator it = c1373Vp.f12782e.iterator();
                while (it.hasNext()) {
                    ((AbstractC6511nn) it.next()).mo6422a(c1373Vp.m8575a());
                }
            }
            this.f5394k = null;
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: b */
    public final void mo4247b(C11812yY0 c11812yY0) {
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        this.f5390g = c11812yY0;
        if (c11812yY0 == null) {
            return;
        }
        C4201hn c4201hn = this.f5391h;
        if (c4201hn != null) {
            synchronized (c4201hn.f28579a) {
                c4201hn.f28583e = c11812yY0;
            }
        }
        if (this.f5393j == 3) {
            C8342Tu0 c8342Tu0M10867a = C1869cn.m10866b(c11812yY0.f46304g.f12779b).m10867a();
            this.f5396m = c8342Tu0M10867a;
            C8342Tu0 c8342Tu0 = this.f5397n;
            C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
            EnumC6791rw enumC6791rw = EnumC6791rw.f42162d;
            for (C0480Hc c0480Hc : c8342Tu0M10867a.mo4793u()) {
                c7612Ft0M2812b.m2814d(c0480Hc, enumC6791rw, c8342Tu0M10867a.mo4794w(c0480Hc));
            }
            for (C0480Hc c0480Hc2 : c8342Tu0.mo4793u()) {
                c7612Ft0M2812b.m2814d(c0480Hc2, enumC6791rw, c8342Tu0.mo4794w(c0480Hc2));
            }
            this.f5384a.mo9915i(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            for (AbstractC4232iH abstractC4232iH : Collections.unmodifiableList(c11812yY0.f46304g.f12778a)) {
                if (Objects.equals(abstractC4232iH.f29028j, C9085dD0.class) || Objects.equals(abstractC4232iH.f29028j, C9966k51.class)) {
                    this.f5384a.mo9917k(c11812yY0.f46304g.f12784g, this.f5395l);
                    return;
                }
            }
            this.f5384a.mo9919m();
        }
    }

    @Override // p000.InterfaceC4204hq
    public final void close() {
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        if (this.f5393j == 3) {
            AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
            this.f5384a.mo9913f();
            C4201hn c4201hn = this.f5391h;
            if (c4201hn != null) {
                synchronized (c4201hn.f28579a) {
                    c4201hn.f28582d = true;
                    c4201hn.f28580b = null;
                    c4201hn.f28583e = null;
                    c4201hn.f28581c = null;
                }
            }
            this.f5393j = 4;
        }
        this.f5388e.close();
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: d */
    public final InterfaceFutureC7800Jj0 mo4249d(C11812yY0 c11812yY0, CameraDevice cameraDevice, E71 e71) {
        int i = this.f5393j;
        AbstractC9104dM1.m17545d("Invalid state state:".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "DE_INITIALIZED" : "ON_CAPTURE_SESSION_ENDED" : "ON_CAPTURE_SESSION_STARTED" : "SESSION_INITIALIZED" : "UNINITIALIZED"), i == 1);
        AbstractC9104dM1.m17545d("SessionConfig contains no surfaces", !c11812yY0.m26164b().isEmpty());
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        List listM26164b = c11812yY0.m26164b();
        this.f5389f = listM26164b;
        C20 c20 = this.f5387d;
        ExecutorC10151lY0 executorC10151lY0 = this.f5386c;
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC11561wZ1.m25651d(listM26164b, executorC10151lY0, c20));
        C7253zG c7253zG = new C7253zG(this, c11812yY0, cameraDevice, e71, 1);
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(c1043qzM6727a, c7253zG, executorC10151lY0), new C7391Bm1(20, new C9469gD0(1, this)), executorC10151lY0);
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: e */
    public final List mo4250e() {
        return this.f5394k != null ? this.f5394k : Collections.emptyList();
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: f */
    public final void mo4251f(List list) {
        if (list.isEmpty()) {
            return;
        }
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        int iM26247x = AbstractC7222ym.m26247x(this.f5393j);
        if (iM26247x == 0 || iM26247x == 1) {
            if (this.f5394k == null) {
                this.f5394k = list;
                return;
            } else {
                m4245i(list);
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                return;
            }
        }
        if (iM26247x != 2) {
            if (iM26247x == 3 || iM26247x == 4) {
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                m4245i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1373Vp c1373Vp = (C1373Vp) it.next();
            if (c1373Vp.f12780c == 2) {
                C1869cn c1869cnM10866b = C1869cn.m10866b(c1373Vp.f12779b);
                C0480Hc c0480Hc = C1373Vp.f12775i;
                C7882Ky0 c7882Ky0 = c1373Vp.f12779b;
                if (c7882Ky0.f6404a.containsKey(c0480Hc)) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    c1869cnM10866b.f17745b.m2815e(C3950dn.m17743L0(key), (Integer) c7882Ky0.mo4794w(c0480Hc));
                }
                C0480Hc c0480Hc2 = C1373Vp.f12776j;
                if (c7882Ky0.f6404a.containsKey(c0480Hc2)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
                    c1869cnM10866b.f17745b.m2815e(C3950dn.m17743L0(key2), Byte.valueOf(((Integer) c7882Ky0.mo4794w(c0480Hc2)).byteValue()));
                }
                C8342Tu0 c8342Tu0M10867a = c1869cnM10866b.m10867a();
                this.f5397n = c8342Tu0M10867a;
                C8342Tu0 c8342Tu0 = this.f5396m;
                C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                EnumC6791rw enumC6791rw = EnumC6791rw.f42162d;
                for (C0480Hc c0480Hc3 : c8342Tu0.mo4793u()) {
                    c7612Ft0M2812b.m2814d(c0480Hc3, enumC6791rw, c8342Tu0.mo4794w(c0480Hc3));
                }
                for (C0480Hc c0480Hc4 : c8342Tu0M10867a.mo4793u()) {
                    c7612Ft0M2812b.m2814d(c0480Hc4, enumC6791rw, c8342Tu0M10867a.mo4794w(c0480Hc4));
                }
                this.f5384a.mo9915i(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
                this.f5384a.mo9916j(c1373Vp.f12781d, c1373Vp.f12784g, new C1356VY(c1373Vp.m8575a(), c1373Vp.f12782e));
            } else {
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                C8342Tu0 c8342Tu0M10867a2 = C1869cn.m10866b(c1373Vp.f12779b).m10867a();
                Iterator it2 = c8342Tu0M10867a2.getConfig().mo4793u().iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key3 = ((C0480Hc) it2.next()).f4364c;
                    if (key3.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key3.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        this.f5384a.mo9918l(c8342Tu0M10867a2, c1373Vp.f12784g, new C1356VY(c1373Vp.m8575a(), c1373Vp.f12782e));
                        break;
                    }
                }
                m4245i(Arrays.asList(c1373Vp));
            }
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: g */
    public final C11812yY0 mo4252g() {
        return this.f5390g;
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: h */
    public final boolean mo4253h() {
        return this.f5388e.mo4253h();
    }

    @Override // p000.InterfaceC4204hq
    public final InterfaceFutureC7800Jj0 release() {
        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Release = this.f5388e.release();
        int iM26247x = AbstractC7222ym.m26247x(this.f5393j);
        if (iM26247x == 1 || iM26247x == 3) {
            interfaceFutureC7800Jj0Release.mo2494d(new RunnableC8352Tz0(4, this), QR1.m6703a());
        }
        this.f5393j = 5;
        return interfaceFutureC7800Jj0Release;
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: c */
    public final void mo4248c(HashMap map) {
    }
}
