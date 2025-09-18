package defpackage;

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
public final class C6329om implements InterfaceC1930Yn {
    public final C5947mm a;
    public final ExecutorC5715lY0 b;
    public final Object c = new Object();
    public final C0527Gn d;
    public final C0481Fx1 e;
    public final C7433uY0 f;
    public final GW g;
    public final C2226aw h;
    public final C7252tb1 i;
    public final C2226aw j;
    public final C1704Vp1 k;
    public final C4025gm l;
    public final C2005Zm m;
    public final VH n;
    public int o;
    public InterfaceC7158t60 p;
    public volatile boolean q;
    public volatile int r;
    public final C1036Nb s;
    public final AtomicLong t;
    public volatile InterfaceFutureC0750Jj0 u;
    public int v;
    public long w;
    public final C5756lm x;

    public C6329om(C0527Gn c0527Gn, C20 c20, ExecutorC5715lY0 executorC5715lY0, C0481Fx1 c0481Fx1, C3513e41 c3513e41) {
        C7433uY0 c7433uY0 = new C7433uY0();
        this.f = c7433uY0;
        this.o = 0;
        this.q = false;
        this.r = 2;
        this.t = new AtomicLong(0L);
        this.u = F70.c;
        this.v = 1;
        this.w = 0L;
        C5756lm c5756lm = new C5756lm();
        c5756lm.b = new HashSet();
        c5756lm.c = new ArrayMap();
        this.x = c5756lm;
        this.d = c0527Gn;
        this.e = c0481Fx1;
        this.b = executorC5715lY0;
        this.n = new VH(executorC5715lY0);
        C5947mm c5947mm = new C5947mm(executorC5715lY0);
        this.a = c5947mm;
        c7433uY0.b.a = this.v;
        c7433uY0.b.b(new C1624Up(c5947mm));
        c7433uY0.b.b(c5756lm);
        this.j = new C2226aw(this, c0527Gn, executorC5715lY0, 2);
        this.g = new GW(this, c20, executorC5715lY0, c3513e41);
        this.h = new C2226aw(this, c0527Gn, executorC5715lY0, 9);
        this.i = new C7252tb1(this, c0527Gn, executorC5715lY0);
        this.k = new C1704Vp1(c0527Gn);
        this.s = new C1036Nb(c3513e41, 0);
        this.l = new C4025gm(this, executorC5715lY0);
        this.m = new C2005Zm(this, c0527Gn, c3513e41, executorC5715lY0, c20);
    }

    public static int e(C0527Gn c0527Gn, int i) {
        int[] iArr = (int[]) c0527Gn.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return h(i, iArr) ? i : h(1, iArr) ? 1 : 0;
    }

    public static boolean h(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C6974s81) && (l = (Long) ((C6974s81) tag).a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void E(InterfaceC7122sw interfaceC7122sw) {
        C4025gm c4025gm = this.l;
        C1562Tu0 c1562Tu0A = C2580cn.b(interfaceC7122sw).a();
        synchronized (c4025gm.e) {
            C2580cn c2580cn = (C2580cn) c4025gm.f;
            c2580cn.getClass();
            EnumC6931rw enumC6931rw = EnumC6931rw.d;
            for (C0572Hc c0572Hc : c1562Tu0A.u()) {
                c2580cn.b.d(c0572Hc, enumC6931rw, c1562Tu0A.w(c0572Hc));
            }
        }
        AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C3643em(c4025gm, 0))).d(new A3(1), QR1.a());
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 L(float f) {
        InterfaceFutureC0750Jj0 f70;
        C1198Pd c1198PdD;
        if (!g()) {
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        C2226aw c2226aw = this.h;
        synchronized (((C1626Up1) c2226aw.e)) {
            try {
                ((C1626Up1) c2226aw.e).d(f);
                c1198PdD = C1198Pd.d((C1626Up1) c2226aw.e);
            } catch (IllegalArgumentException e) {
                f70 = new F70(1, e);
            }
        }
        c2226aw.n(c1198PdD);
        f70 = AbstractC8171yQ1.b(new H30(c2226aw, 20, c1198PdD));
        return AbstractC1500Sz1.l(f70);
    }

    @Override // defpackage.InterfaceC1930Yn
    public final Rect P() {
        Rect rect = (Rect) this.d.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void P0() {
        VH vh = this.n;
        vh.getClass();
        ((ExecutorC5715lY0) vh.b).execute(new RunnableC1842Xj1(vh, 1));
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void R(int i) {
        if (!g()) {
            AbstractC0759Jm0.f("Camera2CameraControlImp");
            return;
        }
        this.r = i;
        AbstractC0759Jm0.f("Camera2CameraControlImp");
        C1704Vp1 c1704Vp1 = this.k;
        boolean z = true;
        if (this.r != 1 && this.r != 0) {
            z = false;
        }
        c1704Vp1.d = z;
        this.u = AbstractC1500Sz1.l(AbstractC8171yQ1.b(new B7(4, this)));
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void T(InterfaceC7158t60 interfaceC7158t60) {
        this.p = interfaceC7158t60;
    }

    public final void a(InterfaceC6138nm interfaceC6138nm) {
        ((HashSet) this.a.b).add(interfaceC6138nm);
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 a0(final ArrayList arrayList, final int i, final int i2) {
        if (!g()) {
            AbstractC0759Jm0.f("Camera2CameraControlImp");
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        final int i3 = this.r;
        QZ qzA = QZ.a(AbstractC1500Sz1.l(this.u));
        InterfaceC6021n9 interfaceC6021n9 = new InterfaceC6021n9() { // from class: hm
            @Override // defpackage.InterfaceC6021n9
            public final InterfaceFutureC0750Jj0 apply(Object obj) {
                C2005Zm c2005Zm = this.a.m;
                int i4 = i2;
                int i5 = i;
                int i6 = i3;
                C1303Qm c1303QmG = c2005Zm.g(i5, i6, i4);
                QZ qzA2 = QZ.a(c1303QmG.a(i6));
                C1069Nm c1069Nm = new C1069Nm(c1303QmG, i6, arrayList);
                qzA2.getClass();
                ExecutorC5715lY0 executorC5715lY0 = c1303QmG.b;
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA2, c1069Nm, executorC5715lY0);
                runnableC3467drR.d(new G4(12, c1303QmG), executorC5715lY0);
                return AbstractC1500Sz1.l(runnableC3467drR);
            }
        };
        ExecutorC5715lY0 executorC5715lY0 = this.b;
        qzA.getClass();
        return AbstractC1500Sz1.r(qzA, interfaceC6021n9, executorC5715lY0);
    }

    public final void b() {
        synchronized (this.c) {
            try {
                int i = this.o;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.o = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void b0(C7433uY0 c7433uY0) throws Exception {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        C1704Vp1 c1704Vp1 = this.k;
        C0527Gn c0527Gn = c1704Vp1.a;
        while (true) {
            C1782Wp1 c1782Wp1 = c1704Vp1.b;
            if (c1782Wp1.d()) {
                break;
            } else {
                ((InterfaceC3903g70) c1782Wp1.a()).close();
            }
        }
        G70 g70 = c1704Vp1.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (g70 != null) {
            MU0 mu0 = c1704Vp1.g;
            if (mu0 != null) {
                AbstractC1500Sz1.l(g70.e).d(new RunnableC1936Yp(mu0, 3), QR1.h());
                c1704Vp1.g = null;
            }
            g70.a();
            c1704Vp1.i = null;
        }
        ImageWriter imageWriter = c1704Vp1.j;
        if (imageWriter != null) {
            imageWriter.close();
            c1704Vp1.j = null;
        }
        boolean z = c1704Vp1.c;
        C2005Zm c2005Zm = c7433uY0.b;
        if (z) {
            c2005Zm.a = 1;
            return;
        }
        if (c1704Vp1.f) {
            c2005Zm.a = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) c0527Gn.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            e.getMessage();
            AbstractC0759Jm0.f("ZslControlImpl");
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new C3479dv(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (c1704Vp1.e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c0527Gn.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    C0696Ir0 c0696Ir0 = new C0696Ir0(size.getWidth(), size.getHeight(), 34, 9);
                    c1704Vp1.h = c0696Ir0.b;
                    c1704Vp1.g = new MU0(c0696Ir0);
                    c0696Ir0.k(new C0532Go1(1, c1704Vp1), QR1.g());
                    G70 g702 = new G70(c1704Vp1.g.h(), new Size(c1704Vp1.g.getWidth(), c1704Vp1.g.getHeight()), 34);
                    c1704Vp1.i = g702;
                    MU0 mu02 = c1704Vp1.g;
                    InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L = AbstractC1500Sz1.l(g702.e);
                    Objects.requireNonNull(mu02);
                    interfaceFutureC0750Jj0L.d(new RunnableC1936Yp(mu02, 3), QR1.h());
                    c7433uY0.c(c1704Vp1.i, CM.d, -1);
                    c7433uY0.a(c1704Vp1.h);
                    C0293Dn c0293Dn = new C0293Dn(2, c1704Vp1);
                    ArrayList arrayList = c7433uY0.d;
                    if (!arrayList.contains(c0293Dn)) {
                        arrayList.add(c0293Dn);
                    }
                    c7433uY0.g = new InputConfiguration(c1704Vp1.g.getWidth(), c1704Vp1.g.getHeight(), c1704Vp1.g.c());
                    return;
                }
            }
        }
        c2005Zm.a = 1;
    }

    public final void c(boolean z) {
        this.q = z;
        if (!z) {
            C2005Zm c2005Zm = new C2005Zm();
            c2005Zm.a = this.v;
            c2005Zm.c = true;
            C0468Ft0 c0468Ft0B = C0468Ft0.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c0468Ft0B.e(C3456dn.L0(key), Integer.valueOf(e(this.d, 1)));
            c0468Ft0B.e(C3456dn.L0(CaptureRequest.FLASH_MODE), 0);
            c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            l(Collections.singletonList(c2005Zm.e()));
        }
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C8194yY0 d() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6329om.d():yY0");
    }

    public final int f(int i) {
        int[] iArr = (int[]) this.d.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (h(i, iArr)) {
            return i;
        }
        if (h(4, iArr)) {
            return 4;
        }
        return h(1, iArr) ? 1 : 0;
    }

    public final boolean g() {
        int i;
        synchronized (this.c) {
            i = this.o;
        }
        return i > 0;
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 h0(boolean z) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0B;
        if (!g()) {
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        C7252tb1 c7252tb1 = this.i;
        if (c7252tb1.c) {
            C7252tb1.b(c7252tb1.b, Integer.valueOf(z ? 1 : 0));
            interfaceFutureC0750Jj0B = AbstractC8171yQ1.b(new CW(c7252tb1, z, 2));
        } else {
            AbstractC0759Jm0.f("TorchControl");
            interfaceFutureC0750Jj0B = new F70(1, new IllegalStateException("No flash unit"));
        }
        return AbstractC1500Sz1.l(interfaceFutureC0750Jj0B);
    }

    public final void j(InterfaceC6138nm interfaceC6138nm) {
        ((HashSet) this.a.b).remove(interfaceC6138nm);
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 j0(PT pt) {
        if (!g()) {
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        GW gw = this.g;
        gw.getClass();
        return AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C0515Gj(gw, 28, pt)));
    }

    public final void k(boolean z) {
        C1198Pd c1198PdD;
        AbstractC0759Jm0.f("Camera2CameraControlImp");
        GW gw = this.g;
        if (z != gw.d) {
            gw.d = z;
            if (!gw.d) {
                gw.b();
            }
        }
        C2226aw c2226aw = this.h;
        if (c2226aw.c != z) {
            c2226aw.c = z;
            if (!z) {
                synchronized (((C1626Up1) c2226aw.e)) {
                    ((C1626Up1) c2226aw.e).d(1.0f);
                    c1198PdD = C1198Pd.d((C1626Up1) c2226aw.e);
                }
                c2226aw.n(c1198PdD);
                ((InterfaceC1470Sp1) c2226aw.g).p();
                ((C6329om) c2226aw.b).m();
            }
        }
        C7252tb1 c7252tb1 = this.i;
        if (c7252tb1.e != z) {
            c7252tb1.e = z;
            if (!z) {
                if (c7252tb1.g) {
                    c7252tb1.g = false;
                    c7252tb1.a.c(false);
                    C7252tb1.b(c7252tb1.b, 0);
                }
                C0365El c0365El = c7252tb1.f;
                if (c0365El != null) {
                    c0365El.d(new C1774Wn("Camera is not active."));
                    c7252tb1.f = null;
                }
            }
        }
        C2226aw c2226aw2 = this.j;
        if (z != c2226aw2.c) {
            c2226aw2.c = z;
            if (!z) {
                ((VY) c2226aw2.d).c0(0);
                c2226aw2.d();
            }
        }
        C4025gm c4025gm = this.l;
        c4025gm.getClass();
        ((ExecutorC5715lY0) c4025gm.d).execute(new RunnableC8389za(c4025gm, z, 3));
        if (z) {
            return;
        }
        this.p = null;
        ((AtomicInteger) this.n.c).set(0);
        AbstractC0759Jm0.f("VideoUsageControl");
    }

    public final void l(List list) {
        int iC;
        int iB;
        InterfaceC7668vn interfaceC7668vn;
        C0481Fx1 c0481Fx1 = this.e;
        c0481Fx1.getClass();
        list.getClass();
        C0212Cm c0212Cm = (C0212Cm) c0481Fx1.a;
        c0212Cm.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1702Vp c1702Vp = (C1702Vp) it.next();
            HashSet hashSet = new HashSet();
            C0468Ft0.b();
            ArrayList arrayList2 = new ArrayList();
            C0858Kt0.a();
            hashSet.addAll(c1702Vp.a);
            C0468Ft0 c0468Ft0C = C0468Ft0.c(c1702Vp.b);
            arrayList2.addAll(c1702Vp.e);
            ArrayMap arrayMap = new ArrayMap();
            C6974s81 c6974s81 = c1702Vp.g;
            for (String str : c6974s81.a.keySet()) {
                arrayMap.put(str, c6974s81.a.get(str));
            }
            C0858Kt0 c0858Kt0 = new C0858Kt0(arrayMap);
            InterfaceC7668vn interfaceC7668vn2 = (c1702Vp.c != 5 || (interfaceC7668vn = c1702Vp.h) == null) ? null : interfaceC7668vn;
            if (Collections.unmodifiableList(c1702Vp.a).isEmpty() && c1702Vp.f) {
                if (hashSet.isEmpty()) {
                    C7409uQ0 c7409uQ0 = c0212Cm.a;
                    c7409uQ0.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) c7409uQ0.a).entrySet()) {
                        C4012gh1 c4012gh1 = (C4012gh1) entry.getValue();
                        if (c4012gh1.f && c4012gh1.e) {
                            arrayList3.add(((C4012gh1) entry.getValue()).a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        C1702Vp c1702Vp2 = ((C8194yY0) it2.next()).g;
                        List listUnmodifiableList = Collections.unmodifiableList(c1702Vp2.a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (c1702Vp2.b() != 0 && (iB = c1702Vp2.b()) != 0) {
                                c0468Ft0C.e(InterfaceC5361jh1.d1, Integer.valueOf(iB));
                            }
                            if (c1702Vp2.c() != 0 && (iC = c1702Vp2.c()) != 0) {
                                c0468Ft0C.e(InterfaceC5361jh1.e1, Integer.valueOf(iC));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((AbstractC4314iH) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        AbstractC0759Jm0.f("Camera2CameraImpl");
                    }
                } else {
                    AbstractC0759Jm0.f("Camera2CameraImpl");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0C);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            C6974s81 c6974s812 = C6974s81.b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = c0858Kt0.a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new C1702Vp(arrayList4, c0873Ky0A, c1702Vp.c, c1702Vp.d, arrayList5, c1702Vp.f, new C6974s81(arrayMap2), interfaceC7668vn2));
        }
        c0212Cm.u("Issue capture request");
        c0212Cm.l.f(arrayList);
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 l0(final int i, final int i2) {
        if (!g()) {
            AbstractC0759Jm0.f("Camera2CameraControlImp");
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        final int i3 = this.r;
        QZ qzA = QZ.a(AbstractC1500Sz1.l(this.u));
        InterfaceC6021n9 interfaceC6021n9 = new InterfaceC6021n9() { // from class: km
            @Override // defpackage.InterfaceC6021n9
            public final InterfaceFutureC0750Jj0 apply(Object obj) {
                C2005Zm c2005Zm = this.a.m;
                int i4 = i2;
                int i5 = i;
                int i6 = i3;
                return AbstractC1500Sz1.g(new C0914Lm(c2005Zm.g(i5, i6, i4), (ExecutorC5715lY0) c2005Zm.g, i6));
            }
        };
        ExecutorC5715lY0 executorC5715lY0 = this.b;
        qzA.getClass();
        return AbstractC1500Sz1.r(qzA, interfaceC6021n9, executorC5715lY0);
    }

    public final long m() {
        this.w = this.t.getAndIncrement();
        ((C0212Cm) this.e.a).L();
        return this.w;
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceC7122sw n0() {
        C3456dn c3456dn;
        C4025gm c4025gm = this.l;
        synchronized (c4025gm.e) {
            C2580cn c2580cn = (C2580cn) c4025gm.f;
            c2580cn.getClass();
            c3456dn = new C3456dn(6, C0873Ky0.a(c2580cn.b));
        }
        return c3456dn;
    }

    @Override // defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 r0(int i) {
        if (!g()) {
            return new F70(1, new C1774Wn("Camera is not active."));
        }
        C2226aw c2226aw = this.j;
        VY vy = (VY) c2226aw.d;
        Range range = (Range) ((C0527Gn) vy.d).a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) {
            return new F70(1, new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range rangeE = vy.e();
        if (rangeE.contains((Range) Integer.valueOf(i))) {
            vy.c0(i);
            return AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C0991Mm(c2226aw, i, 4)));
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "Requested ExposureCompensation ", " is not within valid range [");
        sbN.append(rangeE.getUpper());
        sbN.append("..");
        sbN.append(rangeE.getLower());
        sbN.append("]");
        return new F70(1, new IllegalArgumentException(sbN.toString()));
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void t() {
        VH vh = this.n;
        vh.getClass();
        ((ExecutorC5715lY0) vh.b).execute(new RunnableC1842Xj1(vh, 0));
    }

    @Override // defpackage.InterfaceC1930Yn
    public final void z0() {
        C4025gm c4025gm = this.l;
        synchronized (c4025gm.e) {
            c4025gm.f = new C2580cn(0);
        }
        AbstractC1500Sz1.l(AbstractC8171yQ1.b(new C3643em(c4025gm, 1))).d(new A3(1), QR1.a());
    }
}
