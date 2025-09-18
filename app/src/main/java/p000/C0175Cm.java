package p000;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Cm */
/* loaded from: classes.dex */
public final class C0175Cm implements InterfaceC6972uo {

    /* renamed from: A */
    public final U41 f1610A;

    /* renamed from: B */
    public final U41 f1611B;

    /* renamed from: C */
    public final HashSet f1612C;

    /* renamed from: D */
    public InterfaceC0491Hn f1613D;

    /* renamed from: E */
    public final Object f1614E;

    /* renamed from: F */
    public AbstractC9513gZ0 f1615F;

    /* renamed from: G */
    public boolean f1616G;

    /* renamed from: H */
    public final C0588JK f1617H;

    /* renamed from: I */
    public final C8342Tu0 f1618I;

    /* renamed from: J */
    public final H61 f1619J;

    /* renamed from: K */
    public final C7967Mo1 f1620K;

    /* renamed from: L */
    public volatile int f1621L = 3;

    /* renamed from: a */
    public final C11287uQ0 f1622a;

    /* renamed from: b */
    public final C7161xo f1623b;

    /* renamed from: c */
    public final ExecutorC10151lY0 f1624c;

    /* renamed from: d */
    public final C20 f1625d;

    /* renamed from: e */
    public final C7967Mo1 f1626e;

    /* renamed from: f */
    public final C9108dO1 f1627f;

    /* renamed from: g */
    public final C6573om f1628g;

    /* renamed from: h */
    public final C0112Bm f1629h;

    /* renamed from: i */
    public final C0301Em f1630i;

    /* renamed from: j */
    public CameraDevice f1631j;

    /* renamed from: k */
    public int f1632k;

    /* renamed from: l */
    public InterfaceC4204hq f1633l;

    /* renamed from: m */
    public final AtomicInteger f1634m;

    /* renamed from: n */
    public InterfaceFutureC7800Jj0 f1635n;

    /* renamed from: o */
    public C0300El f1636o;

    /* renamed from: p */
    public final LinkedHashMap f1637p;

    /* renamed from: q */
    public int f1638q;

    /* renamed from: r */
    public final C7096wm f1639r;

    /* renamed from: s */
    public final C8875bc1 f1640s;

    /* renamed from: t */
    public final C1246To f1641t;

    /* renamed from: u */
    public final boolean f1642u;

    /* renamed from: v */
    public final boolean f1643v;

    /* renamed from: w */
    public boolean f1644w;

    /* renamed from: x */
    public boolean f1645x;

    /* renamed from: y */
    public boolean f1646y;

    /* renamed from: z */
    public C8128Pr0 f1647z;

    public C0175Cm(Context context, C7161xo c7161xo, String str, C0301Em c0301Em, C8875bc1 c8875bc1, C1246To c1246To, Executor executor, Handler handler, C0588JK c0588jk, long j) throws C1309Uo {
        C7967Mo1 c7967Mo1 = new C7967Mo1(14);
        this.f1626e = c7967Mo1;
        this.f1632k = 0;
        this.f1634m = new AtomicInteger(0);
        this.f1637p = new LinkedHashMap();
        this.f1638q = 0;
        this.f1644w = false;
        this.f1645x = false;
        this.f1646y = true;
        this.f1612C = new HashSet();
        this.f1613D = AbstractC0680Kn.f6285a;
        this.f1614E = new Object();
        this.f1616G = false;
        C7967Mo1 c7967Mo12 = new C7967Mo1();
        c7967Mo12.f7363b = this;
        c7967Mo12.f7362a = null;
        this.f1620K = c7967Mo12;
        this.f1623b = c7161xo;
        this.f1640s = c8875bc1;
        this.f1641t = c1246To;
        C20 c20 = new C20(handler);
        this.f1625d = c20;
        ExecutorC10151lY0 executorC10151lY0 = new ExecutorC10151lY0(executor);
        this.f1624c = executorC10151lY0;
        this.f1629h = new C0112Bm(this, executorC10151lY0, c20, j);
        C11287uQ0 c11287uQ0 = new C11287uQ0();
        c11287uQ0.f43693a = new LinkedHashMap();
        this.f1622a = c11287uQ0;
        ((C7560Et0) c7967Mo1.f7362a).m2440k(new C9018ck0(EnumC6909to.CLOSED));
        C9108dO1 c9108dO1 = new C9108dO1(c1246To);
        this.f1627f = c9108dO1;
        U41 u41 = new U41();
        u41.f11644a = new Object();
        u41.f11646c = new LinkedHashSet();
        u41.f11647d = new LinkedHashSet();
        u41.f11648e = new LinkedHashSet();
        u41.f11649f = new C4139go(u41);
        u41.f11645b = executorC10151lY0;
        this.f1610A = u41;
        this.f1617H = c0588jk;
        try {
            C0428Gn c0428GnM25939b = c7161xo.m25939b(str);
            C6573om c6573om = new C6573om(c0428GnM25939b, c20, executorC10151lY0, new C7621Fx1(this), c0301Em.f2894j);
            this.f1628g = c6573om;
            this.f1630i = c0301Em;
            c0301Em.m2388B(c6573om);
            c0301Em.f2892h.m1871l((C7560Et0) c9108dO1.f26013c);
            this.f1618I = C8342Tu0.m7803q0(c0428GnM25939b);
            this.f1633l = m1314A();
            C9196e41 c9196e41 = c0301Em.f2894j;
            C9196e41 c9196e412 = AbstractC7067wJ.f44776a;
            U41 u412 = new U41();
            u412.f11644a = executorC10151lY0;
            u412.f11645b = c20;
            u412.f11646c = handler;
            u412.f11647d = u41;
            u412.f11648e = c9196e41;
            u412.f11649f = c9196e412;
            this.f1611B = u412;
            C9196e41 c9196e413 = c0301Em.f2894j;
            this.f1642u = c9196e413.m17862x0(LegacyCameraOutputConfigNullPointerQuirk.class) || c9196e413.m17862x0(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.f1643v = c0301Em.f2894j.m17862x0(LegacyCameraSurfaceCleanupQuirk.class);
            C7096wm c7096wm = new C7096wm(this, str);
            this.f1639r = c7096wm;
            C9432fw1 c9432fw1 = new C9432fw1(5, this);
            synchronized (c1246To.f11518b) {
                AbstractC9104dM1.m17550i(!c1246To.f11521e.containsKey(this), "Camera is already registered: " + this);
                c1246To.f11521e.put(this, new C1183So(executorC10151lY0, c9432fw1, c7096wm));
            }
            c7161xo.f45796a.mo1082j1(executorC10151lY0, c7096wm);
            this.f1619J = new H61(context, str, c7161xo, new C8326Tm0(9));
        } catch (C6448mn e) {
            throw new C1309Uo(e);
        }
    }

    /* renamed from: w */
    public static String m1311w(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: x */
    public static String m1312x(C8128Pr0 c8128Pr0) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        c8128Pr0.getClass();
        sb.append(c8128Pr0.hashCode());
        return sb.toString();
    }

    /* renamed from: y */
    public static String m1313y(AbstractC9402fh1 abstractC9402fh1) {
        return abstractC9402fh1.m18277h() + abstractC9402fh1.hashCode();
    }

    /* renamed from: A */
    public final InterfaceC4204hq m1314A() {
        synchronized (this.f1614E) {
            try {
                if (this.f1615F == null) {
                    return new C4141gq(this.f1618I, this.f1630i.f2894j);
                }
                return new JD0(this.f1615F, this.f1630i, this.f1618I, this.f1624c, this.f1625d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: B */
    public final void m1315B(boolean z) {
        if (!z) {
            this.f1629h.f1016e.f46986b = -1L;
        }
        this.f1629h.m855a();
        this.f1620K.m5449q();
        m1347u("Opening camera.");
        m1319F(8);
        try {
            this.f1623b.f45796a.mo1070f1(this.f1630i.f2885a, this.f1624c, m1346t());
        } catch (SecurityException e) {
            m1347u("Unable to open camera due to " + e.getMessage());
            m1319F(7);
            this.f1629h.m856b();
        } catch (C6448mn e2) {
            m1347u("Unable to open camera due to " + e2.getMessage());
            if (e2.f37915a == 10001) {
                m1320G(3, new C0039Ac(7, e2), true);
                return;
            }
            C7967Mo1 c7967Mo1 = this.f1620K;
            if (((C0175Cm) c7967Mo1.f7363b).f1621L != 8) {
                ((C0175Cm) c7967Mo1.f7363b).m1347u("Don't need the onError timeout handler.");
                return;
            }
            ((C0175Cm) c7967Mo1.f7363b).m1347u("Camera waiting for onError.");
            c7967Mo1.m5449q();
            c7967Mo1.f7362a = new C8539Xo1(c7967Mo1);
        }
    }

    /* renamed from: C */
    public final void m1316C() {
        AbstractC9104dM1.m17550i(this.f1621L == 9, null);
        C11685xY0 c11685xY0M25187d = this.f1622a.m25187d();
        if (!c11685xY0M25187d.f45675l || !c11685xY0M25187d.f45674k) {
            m1347u("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f1641t.m7776e(this.f1631j.getId(), this.f1640s.m10465d(this.f1631j.getId()))) {
            m1347u("Unable to create capture session in camera operating mode = " + this.f1640s.f17088a);
            return;
        }
        HashMap map = new HashMap();
        Collection<C11812yY0> collectionM25188e = this.f1622a.m25188e();
        Collection collectionM25189f = this.f1622a.m25189f();
        C0480Hc c0480Hc = AbstractC10350n51.f38097a;
        ArrayList arrayList = new ArrayList(collectionM25189f);
        Iterator it = collectionM25188e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11812yY0 c11812yY0 = (C11812yY0) it.next();
            C7882Ky0 c7882Ky0 = c11812yY0.f46304g.f12779b;
            C0480Hc c0480Hc2 = AbstractC10350n51.f38097a;
            if (c7882Ky0.f6404a.containsKey(c0480Hc2) && c11812yY0.m26164b().size() != 1) {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(c11812yY0.m26164b().size()));
                AbstractC7806Jm0.m4412f("StreamUseCaseUtil");
                break;
            }
            if (c11812yY0.f46304g.f12779b.f6404a.containsKey(c0480Hc2)) {
                int i = 0;
                for (C11812yY0 c11812yY02 : collectionM25188e) {
                    if (((InterfaceC9914jh1) arrayList.get(i)).mo6166T() == EnumC10170lh1.f37256f) {
                        AbstractC9104dM1.m17550i(!c11812yY02.m26164b().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((AbstractC4232iH) c11812yY02.m26164b().get(0), 1L);
                    } else if (c11812yY02.f46304g.f12779b.f6404a.containsKey(c0480Hc2) && !c11812yY02.m26164b().isEmpty()) {
                        map.put((AbstractC4232iH) c11812yY02.m26164b().get(0), (Long) c11812yY02.f46304g.f12779b.mo4794w(c0480Hc2));
                    }
                    i++;
                }
            }
        }
        this.f1633l.mo4248c(map);
        InterfaceC4204hq interfaceC4204hq = this.f1633l;
        C11812yY0 c11812yY0M25912b = c11685xY0M25187d.m25912b();
        CameraDevice cameraDevice = this.f1631j;
        cameraDevice.getClass();
        U41 u41 = this.f1611B;
        AbstractC8301Sz1.m7478a(interfaceC4204hq.mo4249d(c11812yY0M25912b, cameraDevice, new E71((C9196e41) u41.f11648e, (C9196e41) u41.f11649f, (U41) u41.f11647d, (ExecutorC10151lY0) u41.f11644a, (C20) u41.f11645b, (Handler) u41.f11646c)), new CC0(this, interfaceC4204hq, false, 7), this.f1624c);
    }

    /* renamed from: D */
    public final void m1317D() {
        if (this.f1647z != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.f1647z.getClass();
            sb.append(this.f1647z.hashCode());
            String string = sb.toString();
            C11287uQ0 c11287uQ0 = this.f1622a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c11287uQ0.f43693a;
            if (linkedHashMap.containsKey(string)) {
                C9530gh1 c9530gh1 = (C9530gh1) linkedHashMap.get(string);
                c9530gh1.f27939e = false;
                if (!c9530gh1.f27940f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f1647z.getClass();
            sb2.append(this.f1647z.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c11287uQ0.f43693a;
            if (linkedHashMap2.containsKey(string2)) {
                C9530gh1 c9530gh12 = (C9530gh1) linkedHashMap2.get(string2);
                c9530gh12.f27940f = false;
                if (!c9530gh12.f27939e) {
                    linkedHashMap2.remove(string2);
                }
            }
            C8128Pr0 c8128Pr0 = this.f1647z;
            c8128Pr0.getClass();
            AbstractC7806Jm0.m4412f("MeteringRepeating");
            G70 g70 = (G70) c8128Pr0.f9303a;
            if (g70 != null) {
                g70.mo6573a();
            }
            c8128Pr0.f9303a = null;
            this.f1647z = null;
        }
    }

    /* renamed from: E */
    public final void m1318E() {
        AbstractC9104dM1.m17550i(this.f1633l != null, null);
        m1347u("Resetting Capture Session");
        InterfaceC4204hq interfaceC4204hq = this.f1633l;
        C11812yY0 c11812yY0Mo4252g = interfaceC4204hq.mo4252g();
        List listMo4250e = interfaceC4204hq.mo4250e();
        InterfaceC4204hq interfaceC4204hqM1314A = m1314A();
        this.f1633l = interfaceC4204hqM1314A;
        interfaceC4204hqM1314A.mo4247b(c11812yY0Mo4252g);
        this.f1633l.mo4251f(listMo4250e);
        if (AbstractC7222ym.m26247x(this.f1621L) != 8) {
            m1347u("Skipping Capture Session state check due to current camera state: " + AbstractC7222ym.m26249z(this.f1621L) + " and previous session status: " + interfaceC4204hq.mo4253h());
        } else if (this.f1642u && interfaceC4204hq.mo4253h()) {
            m1347u("Close camera before creating new session");
            m1319F(6);
        }
        if (this.f1643v && interfaceC4204hq.mo4253h()) {
            m1347u("ConfigAndClose is required when close the camera.");
            this.f1644w = true;
        }
        interfaceC4204hq.close();
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Release = interfaceC4204hq.release();
        m1347u("Releasing session in state ".concat(AbstractC7222ym.m26246w(this.f1621L)));
        this.f1637p.put(interfaceC4204hq, interfaceFutureC7800Jj0Release);
        AbstractC8301Sz1.m7478a(interfaceFutureC7800Jj0Release, new C1339VH(this, 5, interfaceC4204hq), QR1.m6703a());
    }

    /* renamed from: F */
    public final void m1319F(int i) {
        m1320G(i, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0148 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:133:0x009f, B:135:0x00a6, B:137:0x00b0, B:150:0x00e4, B:154:0x00ea, B:156:0x00f1, B:158:0x00f5, B:160:0x0105, B:163:0x010d, B:165:0x0111, B:166:0x0120, B:168:0x0126, B:170:0x0138, B:178:0x0164, B:179:0x0167, B:171:0x0148, B:173:0x014c, B:175:0x0150, B:139:0x00b8, B:141:0x00cd, B:145:0x00d4, B:147:0x00db), top: B:198:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1320G(int r10, p000.C0039Ac r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0175Cm.m1320G(int, Ac, boolean):void");
    }

    /* renamed from: H */
    public final ArrayList m1321H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            arrayList2.add(new C7212yc(m1313y(abstractC9402fh1), abstractC9402fh1.getClass(), this.f1646y ? abstractC9402fh1.f27344m : abstractC9402fh1.f27345n, abstractC9402fh1.f27337f, abstractC9402fh1.m18273c(), abstractC9402fh1.f27338g, abstractC9402fh1.m18274d() == null ? null : C9966k51.m22152J(abstractC9402fh1)));
        }
        return arrayList2;
    }

    /* renamed from: I */
    public final void m1322I(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.f1622a.m25188e().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7212yc c7212yc = (C7212yc) it.next();
            if (!this.f1622a.m25190h(c7212yc.f46334a)) {
                C11287uQ0 c11287uQ0 = this.f1622a;
                String str = c7212yc.f46334a;
                C11812yY0 c11812yY0 = c7212yc.f46336c;
                InterfaceC9914jh1 interfaceC9914jh1 = c7212yc.f46337d;
                C0419Ge c0419Ge = c7212yc.f46339f;
                ArrayList arrayList3 = c7212yc.f46340g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c11287uQ0.f43693a;
                C9530gh1 c9530gh1 = (C9530gh1) linkedHashMap.get(str);
                if (c9530gh1 == null) {
                    c9530gh1 = new C9530gh1(c11812yY0, interfaceC9914jh1, c0419Ge, arrayList3);
                    linkedHashMap.put(str, c9530gh1);
                }
                c9530gh1.f27939e = true;
                c11287uQ0.m25191j(str, c11812yY0, interfaceC9914jh1, c0419Ge, arrayList3);
                arrayList2.add(c7212yc.f46334a);
                if (c7212yc.f46335b == C9085dD0.class && (size = c7212yc.f46338e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        m1347u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f1628g.m23550k(true);
            C6573om c6573om = this.f1628g;
            synchronized (c6573om.f39231c) {
                c6573om.f39243o++;
            }
        }
        m1343q();
        m1326M();
        m1325L();
        m1318E();
        if (this.f1621L == 9) {
            m1316C();
        } else {
            int iM26247x = AbstractC7222ym.m26247x(this.f1621L);
            if (iM26247x == 2 || iM26247x == 3) {
                m1323J(false);
            } else if (iM26247x != 4) {
                m1347u("open() ignored due to being in state: ".concat(AbstractC7222ym.m26249z(this.f1621L)));
            } else {
                m1319F(7);
                if (!this.f1637p.isEmpty() && !this.f1645x && this.f1632k == 0) {
                    AbstractC9104dM1.m17550i(this.f1631j != null, "Camera Device should be open if session close is not complete");
                    m1319F(9);
                    m1316C();
                }
            }
        }
        if (rational != null) {
            this.f1628g.f39235g.f3778e = rational;
        }
    }

    /* renamed from: J */
    public final void m1323J(boolean z) {
        m1347u("Attempting to force open the camera.");
        if (this.f1641t.m7775d(this)) {
            m1315B(z);
        } else {
            m1347u("No cameras available. Waiting for available camera before opening camera.");
            m1319F(4);
        }
    }

    /* renamed from: K */
    public final void m1324K(boolean z) {
        m1347u("Attempting to open the camera.");
        if (this.f1639r.f45081b && this.f1641t.m7775d(this)) {
            m1315B(z);
        } else {
            m1347u("No cameras available. Waiting for available camera before opening camera.");
            m1319F(4);
        }
    }

    /* renamed from: L */
    public final void m1325L() {
        C11287uQ0 c11287uQ0 = this.f1622a;
        c11287uQ0.getClass();
        C11685xY0 c11685xY0 = new C11685xY0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c11287uQ0.f43693a).entrySet()) {
            C9530gh1 c9530gh1 = (C9530gh1) entry.getValue();
            if (c9530gh1.f27940f && c9530gh1.f27939e) {
                String str = (String) entry.getKey();
                c11685xY0.m25911a(c9530gh1.f27935a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        AbstractC7806Jm0.m4412f("UseCaseAttachState");
        boolean z = c11685xY0.f45675l && c11685xY0.f45674k;
        C6573om c6573om = this.f1628g;
        if (!z) {
            c6573om.f39250v = 1;
            c6573om.f39235g.f3787n = 1;
            c6573om.f39241m.f15113a = 1;
            this.f1633l.mo4247b(c6573om.m23546d());
            return;
        }
        int i = c11685xY0.m25912b().f46304g.f12780c;
        c6573om.f39250v = i;
        c6573om.f39235g.f3787n = i;
        c6573om.f39241m.f15113a = i;
        c11685xY0.m25911a(c6573om.m23546d());
        this.f1633l.mo4247b(c11685xY0.m25912b());
    }

    /* renamed from: M */
    public final void m1326M() {
        Iterator it = this.f1622a.m25189f().iterator();
        boolean zMo6170m0 = false;
        while (it.hasNext()) {
            zMo6170m0 |= ((InterfaceC9914jh1) it.next()).mo6170m0();
        }
        this.f1628g.f39239k.f12792c = zMo6170m0;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: a */
    public final InterfaceC9177dx0 mo1327a() {
        return this.f1626e;
    }

    @Override // p000.InterfaceC6972uo, p000.InterfaceC6385ln
    /* renamed from: b */
    public final InterfaceC6766ro mo1328b() {
        return mo1341o();
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: c */
    public final void mo1329c(InterfaceC0491Hn interfaceC0491Hn) {
        if (interfaceC0491Hn == null) {
            interfaceC0491Hn = AbstractC0680Kn.f6285a;
        }
        AbstractC9513gZ0 abstractC9513gZ0Mo3592V = interfaceC0491Hn.mo3592V();
        this.f1613D = interfaceC0491Hn;
        synchronized (this.f1614E) {
            this.f1615F = abstractC9513gZ0Mo3592V;
        }
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: d */
    public final void mo1330d(AbstractC9402fh1 abstractC9402fh1) {
        abstractC9402fh1.getClass();
        this.f1624c.execute(new RunnableC6970um(this, m1313y(abstractC9402fh1), this.f1646y ? abstractC9402fh1.f27344m : abstractC9402fh1.f27345n, abstractC9402fh1.f27337f, abstractC9402fh1.f27338g, abstractC9402fh1.m18274d() == null ? null : C9966k51.m22152J(abstractC9402fh1), 0));
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: e */
    public final boolean mo1331e() {
        return ((C0301Em) mo1328b()).mo2398j() == 0;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: f */
    public final void mo1332f(AbstractC9402fh1 abstractC9402fh1) {
        abstractC9402fh1.getClass();
        this.f1624c.execute(new RunnableC6907tm(this, m1313y(abstractC9402fh1), this.f1646y ? abstractC9402fh1.f27344m : abstractC9402fh1.f27345n, abstractC9402fh1.f27337f, abstractC9402fh1.f27338g, abstractC9402fh1.m18274d() == null ? null : C9966k51.m22152J(abstractC9402fh1), 1));
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: g */
    public final InterfaceC1560Yn mo1333g() {
        return this.f1628g;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: h */
    public final InterfaceC0491Hn mo1334h() {
        return this.f1613D;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: i */
    public final void mo1335i(AbstractC9402fh1 abstractC9402fh1) {
        abstractC9402fh1.getClass();
        this.f1624c.execute(new RunnableC6907tm(this, m1313y(abstractC9402fh1), this.f1646y ? abstractC9402fh1.f27344m : abstractC9402fh1.f27345n, abstractC9402fh1.f27337f, abstractC9402fh1.f27338g, abstractC9402fh1.m18274d() == null ? null : C9966k51.m22152J(abstractC9402fh1), 0));
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: j */
    public final void mo1336j(boolean z) {
        this.f1624c.execute(new RunnableC7273za(this, z, 4));
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: k */
    public final void mo1337k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(m1321H(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            String strM1313y = m1313y(abstractC9402fh1);
            HashSet hashSet = this.f1612C;
            if (hashSet.contains(strM1313y)) {
                abstractC9402fh1.mo7106w();
                hashSet.remove(strM1313y);
            }
        }
        this.f1624c.execute(new RunnableC6844sm(this, arrayList3, 1));
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: l */
    public final void mo1338l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C6573om c6573om = this.f1628g;
        synchronized (c6573om.f39231c) {
            c6573om.f39243o++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            String strM1313y = m1313y(abstractC9402fh1);
            HashSet hashSet = this.f1612C;
            if (!hashSet.contains(strM1313y)) {
                hashSet.add(strM1313y);
                abstractC9402fh1.mo7105v();
                abstractC9402fh1.mo18287t();
            }
        }
        try {
            this.f1624c.execute(new RunnableC6844sm(this, new ArrayList(m1321H(arrayList2)), 0));
        } catch (RejectedExecutionException unused) {
            m1347u("Unable to attach use cases.");
            c6573om.m23544b();
        }
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: m */
    public final /* synthetic */ boolean mo1339m() {
        return true;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: n */
    public final void mo1340n(boolean z) {
        this.f1646y = z;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: o */
    public final InterfaceC6766ro mo1341o() {
        return this.f1630i;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: p */
    public final void mo1342p(AbstractC9402fh1 abstractC9402fh1) {
        abstractC9402fh1.getClass();
        this.f1624c.execute(new RunnableC6720r4(this, 19, m1313y(abstractC9402fh1)));
    }

    /* renamed from: q */
    public final void m1343q() {
        Size size;
        C11287uQ0 c11287uQ0 = this.f1622a;
        C11812yY0 c11812yY0M25912b = c11287uQ0.m25187d().m25912b();
        C1373Vp c1373Vp = c11812yY0M25912b.f46304g;
        int size2 = Collections.unmodifiableList(c1373Vp.f12778a).size();
        int size3 = c11812yY0M25912b.m26164b().size();
        if (c11812yY0M25912b.m26164b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(c1373Vp.f12778a).isEmpty()) {
            if (size3 == 1 && size2 == 1) {
                m1317D();
                return;
            }
            if (size2 >= 2) {
                m1317D();
                return;
            } else if (this.f1647z == null || m1349z()) {
                AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                return;
            } else {
                m1317D();
                return;
            }
        }
        if (this.f1647z == null) {
            C0428Gn c0428Gn = this.f1630i.f2886b;
            C6764rm c6764rm = new C6764rm(this, 2);
            C0588JK c0588jk = this.f1617H;
            C8128Pr0 c8128Pr0 = new C8128Pr0();
            G61 g61 = new G61();
            Size size4 = null;
            c8128Pr0.f9308f = null;
            c8128Pr0.f9305c = new C8076Or0();
            c8128Pr0.f9307e = c6764rm;
            Size[] sizeArrM6155v = c0428Gn.m3156b().m6155v(34);
            if (sizeArrM6155v == null) {
                AbstractC7806Jm0.m4412f("MeteringRepeating");
                size = new Size(0, 0);
            } else {
                if (g61.f3590a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size5 : sizeArrM6155v) {
                        if (G61.f3589c.compare(size5, G61.f3588b) >= 0) {
                            arrayList.add(size5);
                        }
                    }
                    sizeArrM6155v = (Size[]) arrayList.toArray(new Size[0]);
                }
                List listAsList = Arrays.asList(sizeArrM6155v);
                Collections.sort(listAsList, new C0295Eg(16));
                Size sizeM4285e = c0588jk.m4285e();
                long jMin = Math.min(sizeM4285e.getWidth() * sizeM4285e.getHeight(), 307200L);
                int length = sizeArrM6155v.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Size size6 = sizeArrM6155v[i];
                    Size size7 = size4;
                    long width = size6.getWidth() * size6.getHeight();
                    if (width == jMin) {
                        size = size6;
                        break;
                    } else if (width <= jMin) {
                        i++;
                        size4 = size6;
                    } else if (size7 != null) {
                        size = size7;
                    }
                }
                size = (Size) listAsList.get(0);
            }
            c8128Pr0.f9306d = size;
            Objects.toString(size);
            AbstractC7806Jm0.m4412f("MeteringRepeating");
            c8128Pr0.f9304b = c8128Pr0.m6451n();
            this.f1647z = c8128Pr0;
        }
        if (!m1349z()) {
            AbstractC7806Jm0.m4412f("Camera2CameraImpl");
            return;
        }
        C8128Pr0 c8128Pr02 = this.f1647z;
        if (c8128Pr02 != null) {
            String strM1312x = m1312x(c8128Pr02);
            C8128Pr0 c8128Pr03 = this.f1647z;
            C11812yY0 c11812yY0 = (C11812yY0) c8128Pr03.f9304b;
            EnumC10170lh1 enumC10170lh1 = EnumC10170lh1.f37256f;
            List listSingletonList = Collections.singletonList(enumC10170lh1);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c11287uQ0.f43693a;
            C9530gh1 c9530gh1 = (C9530gh1) linkedHashMap.get(strM1312x);
            C8076Or0 c8076Or0 = (C8076Or0) c8128Pr03.f9305c;
            if (c9530gh1 == null) {
                c9530gh1 = new C9530gh1(c11812yY0, c8076Or0, null, listSingletonList);
                linkedHashMap.put(strM1312x, c9530gh1);
            }
            c9530gh1.f27939e = true;
            c11287uQ0.m25191j(strM1312x, c11812yY0, c8076Or0, null, listSingletonList);
            C8128Pr0 c8128Pr04 = this.f1647z;
            C11812yY0 c11812yY02 = (C11812yY0) c8128Pr04.f9304b;
            List listSingletonList2 = Collections.singletonList(enumC10170lh1);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c11287uQ0.f43693a;
            C9530gh1 c9530gh12 = (C9530gh1) linkedHashMap2.get(strM1312x);
            if (c9530gh12 == null) {
                c9530gh12 = new C9530gh1(c11812yY02, (C8076Or0) c8128Pr04.f9305c, null, listSingletonList2);
                linkedHashMap2.put(strM1312x, c9530gh12);
            }
            c9530gh12.f27940f = true;
        }
    }

    /* renamed from: r */
    public final void m1344r() {
        AbstractC9104dM1.m17550i(this.f1621L == 5 || this.f1621L == 2 || (this.f1621L == 7 && this.f1632k != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + AbstractC7222ym.m26249z(this.f1621L) + " (error: " + m1311w(this.f1632k) + ")");
        m1318E();
        this.f1633l.mo4246a();
    }

    @Override // p000.InterfaceC6972uo
    public final InterfaceFutureC7800Jj0 release() {
        return AbstractC11797yQ1.m26149b(new C6764rm(this, 1));
    }

    /* renamed from: s */
    public final void m1345s() {
        AbstractC9104dM1.m17550i(this.f1621L == 2 || this.f1621L == 5, null);
        AbstractC9104dM1.m17550i(this.f1637p.isEmpty(), null);
        if (!this.f1644w) {
            m1348v();
            return;
        }
        if (this.f1645x) {
            m1347u("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f1639r.f45081b) {
            this.f1644w = false;
            m1348v();
            m1347u("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            m1347u("Open camera to configAndClose");
            C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new C6764rm(this, 0));
            this.f1645x = true;
            c0489HlM26149b.f4484b.mo2494d(new RunnableC0383G4(9, this), this.f1624c);
        }
    }

    /* renamed from: t */
    public final CameraDevice.StateCallback m1346t() {
        ArrayList arrayList = new ArrayList(this.f1622a.m25187d().m25912b().f46300c);
        arrayList.add((C4139go) this.f1610A.f11649f);
        arrayList.add(this.f1629h);
        return YQ1.m9297a(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f1630i.f2885a);
    }

    /* renamed from: u */
    public final void m1347u(String str) {
        toString();
        AbstractC7806Jm0.m4412f("Camera2CameraImpl");
    }

    /* renamed from: v */
    public final void m1348v() {
        AbstractC9104dM1.m17550i(this.f1621L == 2 || this.f1621L == 5, null);
        AbstractC9104dM1.m17550i(this.f1637p.isEmpty(), null);
        this.f1631j = null;
        if (this.f1621L == 5) {
            m1319F(3);
            return;
        }
        this.f1623b.f45796a.mo1097o1(this.f1639r);
        m1319F(1);
        C0300El c0300El = this.f1636o;
        if (c0300El != null) {
            c0300El.m2375b(null);
            this.f1636o = null;
        }
    }

    /* renamed from: z */
    public final boolean m1349z() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f1614E) {
            try {
                i = this.f1640s.f17088a == 2 ? 1 : 0;
            } finally {
            }
        }
        C11287uQ0 c11287uQ0 = this.f1622a;
        c11287uQ0.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c11287uQ0.f43693a).entrySet()) {
            if (((C9530gh1) entry.getValue()).f27939e) {
                arrayList2.add((C9530gh1) entry.getValue());
            }
        }
        for (C9530gh1 c9530gh1 : Collections.unmodifiableCollection(arrayList2)) {
            List list = c9530gh1.f27938d;
            if (list == null || list.get(0) != EnumC10170lh1.f37256f) {
                if (c9530gh1.f27937c == null || c9530gh1.f27938d == null) {
                    c9530gh1.toString();
                    AbstractC7806Jm0.m4412f("Camera2CameraImpl");
                    return false;
                }
                C11812yY0 c11812yY0 = c9530gh1.f27935a;
                InterfaceC9914jh1 interfaceC9914jh1 = c9530gh1.f27936b;
                for (AbstractC4232iH abstractC4232iH : c11812yY0.m26164b()) {
                    H61 h61 = this.f1619J;
                    int iMo5267p = interfaceC9914jh1.mo5267p();
                    C0545Ie c0545IeM3959b = C0545Ie.m3959b(i, iMo5267p, abstractC4232iH.f29026h, h61.m3309i(iMo5267p));
                    int iMo5267p2 = interfaceC9914jh1.mo5267p();
                    Size size = abstractC4232iH.f29026h;
                    C0419Ge c0419Ge = c9530gh1.f27937c;
                    arrayList.add(new C6691qc(c0545IeM3959b, iMo5267p2, size, c0419Ge.f3840b, c9530gh1.f27938d, c0419Ge.f3842d, interfaceC9914jh1.mo6168Z(null)));
                }
            }
        }
        this.f1647z.getClass();
        HashMap map = new HashMap();
        C8128Pr0 c8128Pr0 = this.f1647z;
        map.put((C8076Or0) c8128Pr0.f9305c, Collections.singletonList((Size) c8128Pr0.f9306d));
        try {
            this.f1619J.m3307g(i, arrayList, map, false, false);
            m1347u("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException unused) {
            m1347u("Surface combination with metering repeating  not supported!");
            return false;
        }
    }
}
