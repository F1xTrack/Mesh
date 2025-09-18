package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: om */
/* loaded from: classes.dex */
public final class C6573om implements InterfaceC1560Yn {

    /* renamed from: a */
    public final C6447mm f39229a;

    /* renamed from: b */
    public final ExecutorC10151lY0 f39230b;

    /* renamed from: c */
    public final Object f39231c = new Object();

    /* renamed from: d */
    public final C0428Gn f39232d;

    /* renamed from: e */
    public final C7621Fx1 f39233e;

    /* renamed from: f */
    public final C11303uY0 f39234f;

    /* renamed from: g */
    public final C0411GW f39235g;

    /* renamed from: h */
    public final C1753aw f39236h;

    /* renamed from: i */
    public final C11182tb1 f39237i;

    /* renamed from: j */
    public final C1753aw f39238j;

    /* renamed from: k */
    public final C8437Vp1 f39239k;

    /* renamed from: l */
    public final C4137gm f39240l;

    /* renamed from: m */
    public final C1622Zm f39241m;

    /* renamed from: n */
    public final C1339VH f39242n;

    /* renamed from: o */
    public int f39243o;

    /* renamed from: p */
    public InterfaceC11119t60 f39244p;

    /* renamed from: q */
    public volatile boolean f39245q;

    /* renamed from: r */
    public volatile int f39246r;

    /* renamed from: s */
    public final C0856Nb f39247s;

    /* renamed from: t */
    public final AtomicLong f39248t;

    /* renamed from: u */
    public volatile InterfaceFutureC7800Jj0 f39249u;

    /* renamed from: v */
    public int f39250v;

    /* renamed from: w */
    public long f39251w;

    /* renamed from: x */
    public final C6384lm f39252x;

    public C6573om(C0428Gn c0428Gn, C20 c20, ExecutorC10151lY0 executorC10151lY0, C7621Fx1 c7621Fx1, C9196e41 c9196e41) {
        C11303uY0 c11303uY0 = new C11303uY0();
        this.f39234f = c11303uY0;
        this.f39243o = 0;
        this.f39245q = false;
        this.f39246r = 2;
        this.f39248t = new AtomicLong(0L);
        this.f39249u = F70.f3069c;
        this.f39250v = 1;
        this.f39251w = 0L;
        C6384lm c6384lm = new C6384lm();
        c6384lm.f37285b = new HashSet();
        c6384lm.f37286c = new ArrayMap();
        this.f39252x = c6384lm;
        this.f39232d = c0428Gn;
        this.f39233e = c7621Fx1;
        this.f39230b = executorC10151lY0;
        this.f39242n = new C1339VH(executorC10151lY0);
        C6447mm c6447mm = new C6447mm(executorC10151lY0);
        this.f39229a = c6447mm;
        c11303uY0.f43134b.f15113a = this.f39250v;
        c11303uY0.f43134b.m9589b(new C1310Up(c6447mm));
        c11303uY0.f43134b.m9589b(c6384lm);
        this.f39238j = new C1753aw(this, c0428Gn, executorC10151lY0, 2);
        this.f39235g = new C0411GW(this, c20, executorC10151lY0, c9196e41);
        this.f39236h = new C1753aw(this, c0428Gn, executorC10151lY0, 9);
        this.f39237i = new C11182tb1(this, c0428Gn, executorC10151lY0);
        this.f39239k = new C8437Vp1(c0428Gn);
        this.f39247s = new C0856Nb(c9196e41, 0);
        this.f39240l = new C4137gm(this, executorC10151lY0);
        this.f39241m = new C1622Zm(this, c0428Gn, c9196e41, executorC10151lY0, c20);
    }

    /* renamed from: e */
    public static int m23540e(C0428Gn c0428Gn, int i) {
        int[] iArr = (int[]) c0428Gn.m3155a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m23541h(i, iArr) ? i : m23541h(1, iArr) ? 1 : 0;
    }

    /* renamed from: h */
    public static boolean m23541h(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m23542i(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C10996s81) && (l = (Long) ((C10996s81) tag).f42279a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: E */
    public final void mo903E(InterfaceC6854sw interfaceC6854sw) {
        C4137gm c4137gm = this.f39240l;
        C8342Tu0 c8342Tu0M10867a = C1869cn.m10866b(interfaceC6854sw).m10867a();
        synchronized (c4137gm.f27983e) {
            C1869cn c1869cn = (C1869cn) c4137gm.f27984f;
            c1869cn.getClass();
            EnumC6791rw enumC6791rw = EnumC6791rw.f42162d;
            for (C0480Hc c0480Hc : c8342Tu0M10867a.mo4793u()) {
                c1869cn.f17745b.m2814d(c0480Hc, enumC6791rw, c8342Tu0M10867a.mo4794w(c0480Hc));
            }
        }
        AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C4011em(c4137gm, 0))).mo2494d(new RunnableC0004A3(1), QR1.m6703a());
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: L */
    public final InterfaceFutureC7800Jj0 mo904L(float f) {
        InterfaceFutureC7800Jj0 f70;
        C0984Pd c0984PdM6387d;
        if (!m23548g()) {
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        C1753aw c1753aw = this.f39236h;
        synchronized (((C8385Up1) c1753aw.f16685e)) {
            try {
                ((C8385Up1) c1753aw.f16685e).m8186d(f);
                c0984PdM6387d = C0984Pd.m6387d((C8385Up1) c1753aw.f16685e);
            } catch (IllegalArgumentException e) {
                f70 = new F70(1, e);
            }
        }
        c1753aw.m10395n(c0984PdM6387d);
        f70 = AbstractC11797yQ1.m26149b(new H30(c1753aw, 20, c0984PdM6387d));
        return AbstractC8301Sz1.m7489l(f70);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P */
    public final Rect mo905P() {
        Rect rect = (Rect) this.f39232d.m3155a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P0 */
    public final void mo906P0() {
        C1339VH c1339vh = this.f39242n;
        c1339vh.getClass();
        ((ExecutorC10151lY0) c1339vh.f12486b).execute(new RunnableC8529Xj1(c1339vh, 1));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: R */
    public final void mo907R(int i) {
        if (!m23548g()) {
            AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
            return;
        }
        this.f39246r = i;
        AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
        C8437Vp1 c8437Vp1 = this.f39239k;
        boolean z = true;
        if (this.f39246r != 1 && this.f39246r != 0) {
            z = false;
        }
        c8437Vp1.f12793d = z;
        this.f39249u = AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C0071B7(4, this)));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: T */
    public final void mo908T(InterfaceC11119t60 interfaceC11119t60) {
        this.f39244p = interfaceC11119t60;
    }

    /* renamed from: a */
    public final void m23543a(InterfaceC6510nm interfaceC6510nm) {
        ((HashSet) this.f39229a.f37864b).add(interfaceC6510nm);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: a0 */
    public final InterfaceFutureC7800Jj0 mo910a0(final ArrayList arrayList, final int i, final int i2) {
        if (!m23548g()) {
            AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        final int i3 = this.f39246r;
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC8301Sz1.m7489l(this.f39249u));
        InterfaceC6471n9 interfaceC6471n9 = new InterfaceC6471n9() { // from class: hm
            @Override // p000.InterfaceC6471n9
            public final InterfaceFutureC7800Jj0 apply(Object obj) {
                C1622Zm c1622Zm = this.f28565a.f39241m;
                int i4 = i2;
                int i5 = i;
                int i6 = i3;
                C1056Qm c1056QmM9594g = c1622Zm.m9594g(i5, i6, i4);
                C1043QZ c1043qzM6727a2 = C1043QZ.m6727a(c1056QmM9594g.m6753a(i6));
                C0867Nm c0867Nm = new C0867Nm(c1056QmM9594g, i6, arrayList);
                c1043qzM6727a2.getClass();
                ExecutorC10151lY0 executorC10151lY0 = c1056QmM9594g.f9770b;
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a2, c0867Nm, executorC10151lY0);
                runnableC3953drM7495r.mo2494d(new RunnableC0383G4(12, c1056QmM9594g), executorC10151lY0);
                return AbstractC8301Sz1.m7489l(runnableC3953drM7495r);
            }
        };
        ExecutorC10151lY0 executorC10151lY0 = this.f39230b;
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7495r(c1043qzM6727a, interfaceC6471n9, executorC10151lY0);
    }

    /* renamed from: b */
    public final void m23544b() {
        synchronized (this.f39231c) {
            try {
                int i = this.f39243o;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f39243o = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: b0 */
    public final void mo912b0(C11303uY0 c11303uY0) throws Exception {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        C8437Vp1 c8437Vp1 = this.f39239k;
        C0428Gn c0428Gn = c8437Vp1.f12790a;
        while (true) {
            C8489Wp1 c8489Wp1 = c8437Vp1.f12791b;
            if (c8489Wp1.m956d()) {
                break;
            } else {
                ((InterfaceC9457g70) c8489Wp1.m953a()).close();
            }
        }
        G70 g70 = c8437Vp1.f12798i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (g70 != null) {
            MU0 mu0 = c8437Vp1.f12796g;
            if (mu0 != null) {
                AbstractC8301Sz1.m7489l(g70.f29023e).mo2494d(new RunnableC1562Yp(mu0, 3), QR1.m6710h());
                c8437Vp1.f12796g = null;
            }
            g70.mo6573a();
            c8437Vp1.f12798i = null;
        }
        ImageWriter imageWriter = c8437Vp1.f12799j;
        if (imageWriter != null) {
            imageWriter.close();
            c8437Vp1.f12799j = null;
        }
        boolean z = c8437Vp1.f12792c;
        C1622Zm c1622Zm = c11303uY0.f43134b;
        if (z) {
            c1622Zm.f15113a = 1;
            return;
        }
        if (c8437Vp1.f12795f) {
            c1622Zm.f15113a = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) c0428Gn.m3155a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            e.getMessage();
            AbstractC7806Jm0.m4412f("ZslControlImpl");
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C3957dv(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (c8437Vp1.f12794e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c0428Gn.m3155a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    C7764Ir0 c7764Ir0 = new C7764Ir0(size.getWidth(), size.getHeight(), 34, 9);
                    c8437Vp1.f12797h = c7764Ir0.f5173b;
                    c8437Vp1.f12796g = new MU0(c7764Ir0);
                    c7764Ir0.mo4047k(new C7655Go1(1, c8437Vp1), QR1.m6709g());
                    G70 g702 = new G70(c8437Vp1.f12796g.mo4044h(), new Size(c8437Vp1.f12796g.getWidth(), c8437Vp1.f12796g.getHeight()), 34);
                    c8437Vp1.f12798i = g702;
                    MU0 mu02 = c8437Vp1.f12796g;
                    InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7489l = AbstractC8301Sz1.m7489l(g702.f29023e);
                    Objects.requireNonNull(mu02);
                    interfaceFutureC7800Jj0M7489l.mo2494d(new RunnableC1562Yp(mu02, 3), QR1.m6710h());
                    c11303uY0.m25205c(c8437Vp1.f12798i, C0149CM.f1329d, -1);
                    c11303uY0.m25203a(c8437Vp1.f12797h);
                    C0239Dn c0239Dn = new C0239Dn(2, c8437Vp1);
                    ArrayList arrayList = c11303uY0.f43136d;
                    if (!arrayList.contains(c0239Dn)) {
                        arrayList.add(c0239Dn);
                    }
                    c11303uY0.f43139g = new InputConfiguration(c8437Vp1.f12796g.getWidth(), c8437Vp1.f12796g.getHeight(), c8437Vp1.f12796g.mo4039c());
                    return;
                }
            }
        }
        c1622Zm.f15113a = 1;
    }

    /* renamed from: c */
    public final void m23545c(boolean z) {
        this.f39245q = z;
        if (!z) {
            C1622Zm c1622Zm = new C1622Zm();
            c1622Zm.f15113a = this.f39250v;
            c1622Zm.f15115c = true;
            C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c7612Ft0M2812b.m2815e(C3950dn.m17743L0(key), Integer.valueOf(m23540e(this.f39232d, 1)));
            c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.FLASH_MODE), 0);
            c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            m23551l(Collections.singletonList(c1622Zm.m9592e()));
        }
        m23552m();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C11812yY0 m23546d() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6573om.m23546d():yY0");
    }

    /* renamed from: f */
    public final int m23547f(int i) {
        int[] iArr = (int[]) this.f39232d.m3155a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m23541h(i, iArr)) {
            return i;
        }
        if (m23541h(4, iArr)) {
            return 4;
        }
        return m23541h(1, iArr) ? 1 : 0;
    }

    /* renamed from: g */
    public final boolean m23548g() {
        int i;
        synchronized (this.f39231c) {
            i = this.f39243o;
        }
        return i > 0;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: h0 */
    public final InterfaceFutureC7800Jj0 mo918h0(boolean z) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M26149b;
        if (!m23548g()) {
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        C11182tb1 c11182tb1 = this.f39237i;
        if (c11182tb1.f43160c) {
            C11182tb1.m24944b(c11182tb1.f43159b, Integer.valueOf(z ? 1 : 0));
            interfaceFutureC7800Jj0M26149b = AbstractC11797yQ1.m26149b(new C0159CW(c11182tb1, z, 2));
        } else {
            AbstractC7806Jm0.m4412f("TorchControl");
            interfaceFutureC7800Jj0M26149b = new F70(1, new IllegalStateException("No flash unit"));
        }
        return AbstractC8301Sz1.m7489l(interfaceFutureC7800Jj0M26149b);
    }

    /* renamed from: j */
    public final void m23549j(InterfaceC6510nm interfaceC6510nm) {
        ((HashSet) this.f39229a.f37864b).remove(interfaceC6510nm);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: j0 */
    public final InterfaceFutureC7800Jj0 mo921j0(C0974PT c0974pt) {
        if (!m23548g()) {
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        C0411GW c0411gw = this.f39235g;
        c0411gw.getClass();
        return AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C0424Gj(c0411gw, 28, c0974pt)));
    }

    /* renamed from: k */
    public final void m23550k(boolean z) {
        C0984Pd c0984PdM6387d;
        AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
        C0411GW c0411gw = this.f39235g;
        if (z != c0411gw.f3777d) {
            c0411gw.f3777d = z;
            if (!c0411gw.f3777d) {
                c0411gw.m3076b();
            }
        }
        C1753aw c1753aw = this.f39236h;
        if (c1753aw.f16683c != z) {
            c1753aw.f16683c = z;
            if (!z) {
                synchronized (((C8385Up1) c1753aw.f16685e)) {
                    ((C8385Up1) c1753aw.f16685e).m8186d(1.0f);
                    c0984PdM6387d = C0984Pd.m6387d((C8385Up1) c1753aw.f16685e);
                }
                c1753aw.m10395n(c0984PdM6387d);
                ((InterfaceC8281Sp1) c1753aw.f16687g).mo486p();
                ((C6573om) c1753aw.f16682b).m23552m();
            }
        }
        C11182tb1 c11182tb1 = this.f39237i;
        if (c11182tb1.f43162e != z) {
            c11182tb1.f43162e = z;
            if (!z) {
                if (c11182tb1.f43164g) {
                    c11182tb1.f43164g = false;
                    c11182tb1.f43158a.m23545c(false);
                    C11182tb1.m24944b(c11182tb1.f43159b, 0);
                }
                C0300El c0300El = c11182tb1.f43163f;
                if (c0300El != null) {
                    c0300El.m2377d(new C1434Wn("Camera is not active."));
                    c11182tb1.f43163f = null;
                }
            }
        }
        C1753aw c1753aw2 = this.f39238j;
        if (z != c1753aw2.f16683c) {
            c1753aw2.f16683c = z;
            if (!z) {
                ((C1356VY) c1753aw2.f16684d).m8491c0(0);
                c1753aw2.m10386d();
            }
        }
        C4137gm c4137gm = this.f39240l;
        c4137gm.getClass();
        ((ExecutorC10151lY0) c4137gm.f27982d).execute(new RunnableC7273za(c4137gm, z, 3));
        if (z) {
            return;
        }
        this.f39244p = null;
        ((AtomicInteger) this.f39242n.f12487c).set(0);
        AbstractC7806Jm0.m4412f("VideoUsageControl");
    }

    /* renamed from: l */
    public final void m23551l(List list) {
        int iM8577c;
        int iM8576b;
        InterfaceC7034vn interfaceC7034vn;
        C7621Fx1 c7621Fx1 = this.f39233e;
        c7621Fx1.getClass();
        list.getClass();
        C0175Cm c0175Cm = (C0175Cm) c7621Fx1.f3494a;
        c0175Cm.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1373Vp c1373Vp = (C1373Vp) it.next();
            HashSet hashSet = new HashSet();
            C7612Ft0.m2812b();
            ArrayList arrayList2 = new ArrayList();
            C7872Kt0.m4776a();
            hashSet.addAll(c1373Vp.f12778a);
            C7612Ft0 c7612Ft0M2813c = C7612Ft0.m2813c(c1373Vp.f12779b);
            arrayList2.addAll(c1373Vp.f12782e);
            ArrayMap arrayMap = new ArrayMap();
            C10996s81 c10996s81 = c1373Vp.f12784g;
            for (String str : c10996s81.f42279a.keySet()) {
                arrayMap.put(str, c10996s81.f42279a.get(str));
            }
            C7872Kt0 c7872Kt0 = new C7872Kt0(arrayMap);
            InterfaceC7034vn interfaceC7034vn2 = (c1373Vp.f12780c != 5 || (interfaceC7034vn = c1373Vp.f12785h) == null) ? null : interfaceC7034vn;
            if (Collections.unmodifiableList(c1373Vp.f12778a).isEmpty() && c1373Vp.f12783f) {
                if (hashSet.isEmpty()) {
                    C11287uQ0 c11287uQ0 = c0175Cm.f1622a;
                    c11287uQ0.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) c11287uQ0.f43693a).entrySet()) {
                        C9530gh1 c9530gh1 = (C9530gh1) entry.getValue();
                        if (c9530gh1.f27940f && c9530gh1.f27939e) {
                            arrayList3.add(((C9530gh1) entry.getValue()).f27935a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        C1373Vp c1373Vp2 = ((C11812yY0) it2.next()).f46304g;
                        List listUnmodifiableList = Collections.unmodifiableList(c1373Vp2.f12778a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (c1373Vp2.m8576b() != 0 && (iM8576b = c1373Vp2.m8576b()) != 0) {
                                c7612Ft0M2813c.m2815e(InterfaceC9914jh1.f35333d1, Integer.valueOf(iM8576b));
                            }
                            if (c1373Vp2.m8577c() != 0 && (iM8577c = c1373Vp2.m8577c()) != 0) {
                                c7612Ft0M2813c.m2815e(InterfaceC9914jh1.f35334e1, Integer.valueOf(iM8577c));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((AbstractC4232iH) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                    }
                } else {
                    AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2813c);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            C10996s81 c10996s812 = C10996s81.f42278b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = c7872Kt0.f42279a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new C1373Vp(arrayList4, c7882Ky0M4786a, c1373Vp.f12780c, c1373Vp.f12781d, arrayList5, c1373Vp.f12783f, new C10996s81(arrayMap2), interfaceC7034vn2));
        }
        c0175Cm.m1347u("Issue capture request");
        c0175Cm.f1633l.mo4251f(arrayList);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: l0 */
    public final InterfaceFutureC7800Jj0 mo922l0(final int i, final int i2) {
        if (!m23548g()) {
            AbstractC7806Jm0.m4412f("Camera2CameraControlImp");
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        final int i3 = this.f39246r;
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(AbstractC8301Sz1.m7489l(this.f39249u));
        InterfaceC6471n9 interfaceC6471n9 = new InterfaceC6471n9() { // from class: km
            @Override // p000.InterfaceC6471n9
            public final InterfaceFutureC7800Jj0 apply(Object obj) {
                C1622Zm c1622Zm = this.f36681a.f39241m;
                int i4 = i2;
                int i5 = i;
                int i6 = i3;
                return AbstractC8301Sz1.m7484g(new C0741Lm(c1622Zm.m9594g(i5, i6, i4), (ExecutorC10151lY0) c1622Zm.f15119g, i6));
            }
        };
        ExecutorC10151lY0 executorC10151lY0 = this.f39230b;
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7495r(c1043qzM6727a, interfaceC6471n9, executorC10151lY0);
    }

    /* renamed from: m */
    public final long m23552m() {
        this.f39251w = this.f39248t.getAndIncrement();
        ((C0175Cm) this.f39233e.f3494a).m1325L();
        return this.f39251w;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: n0 */
    public final InterfaceC6854sw mo923n0() {
        C3950dn c3950dn;
        C4137gm c4137gm = this.f39240l;
        synchronized (c4137gm.f27983e) {
            C1869cn c1869cn = (C1869cn) c4137gm.f27984f;
            c1869cn.getClass();
            c3950dn = new C3950dn(6, C7882Ky0.m4786a(c1869cn.f17745b));
        }
        return c3950dn;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: r0 */
    public final InterfaceFutureC7800Jj0 mo924r0(int i) {
        if (!m23548g()) {
            return new F70(1, new C1434Wn("Camera is not active."));
        }
        C1753aw c1753aw = this.f39238j;
        C1356VY c1356vy = (C1356VY) c1753aw.f16684d;
        Range range = (Range) ((C0428Gn) c1356vy.f12613d).m3155a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) {
            return new F70(1, new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range rangeMo915e = c1356vy.mo915e();
        if (rangeMo915e.contains((Range) Integer.valueOf(i))) {
            c1356vy.m8491c0(i);
            return AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C0804Mm(c1753aw, i, 4)));
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Requested ExposureCompensation ", " is not within valid range [");
        sbM26237n.append(rangeMo915e.getUpper());
        sbM26237n.append("..");
        sbM26237n.append(rangeMo915e.getLower());
        sbM26237n.append("]");
        return new F70(1, new IllegalArgumentException(sbM26237n.toString()));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: t */
    public final void mo925t() {
        C1339VH c1339vh = this.f39242n;
        c1339vh.getClass();
        ((ExecutorC10151lY0) c1339vh.f12486b).execute(new RunnableC8529Xj1(c1339vh, 0));
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: z0 */
    public final void mo926z0() {
        C4137gm c4137gm = this.f39240l;
        synchronized (c4137gm.f27983e) {
            c4137gm.f27984f = new C1869cn(0);
        }
        AbstractC8301Sz1.m7489l(AbstractC11797yQ1.m26149b(new C4011em(c4137gm, 1))).mo2494d(new RunnableC0004A3(1), QR1.m6703a());
    }
}
