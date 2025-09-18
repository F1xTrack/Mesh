package defpackage;

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
public final class C0212Cm implements InterfaceC7480uo {
    public final U41 A;
    public final U41 B;
    public final HashSet C;
    public InterfaceC0605Hn D;
    public final Object E;
    public AbstractC3987gZ0 F;
    public boolean G;
    public final JK H;
    public final C1562Tu0 I;
    public final H61 J;
    public final C0999Mo1 K;
    public volatile int L = 3;
    public final C7409uQ0 a;
    public final C8051xo b;
    public final ExecutorC5715lY0 c;
    public final C20 d;
    public final C0999Mo1 e;
    public final C3383dO1 f;
    public final C6329om g;
    public final C0134Bm h;
    public final C0368Em i;
    public CameraDevice j;
    public int k;
    public InterfaceC4228hq l;
    public final AtomicInteger m;
    public InterfaceFutureC0750Jj0 n;
    public C0365El o;
    public final LinkedHashMap p;
    public int q;
    public final C7855wm r;
    public final C2359bc1 s;
    public final C1543To t;
    public final boolean u;
    public final boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public C1241Pr0 z;

    public C0212Cm(Context context, C8051xo c8051xo, String str, C0368Em c0368Em, C2359bc1 c2359bc1, C1543To c1543To, Executor executor, Handler handler, JK jk, long j) throws C1621Uo {
        C0999Mo1 c0999Mo1 = new C0999Mo1(14);
        this.e = c0999Mo1;
        this.k = 0;
        this.m = new AtomicInteger(0);
        this.p = new LinkedHashMap();
        this.q = 0;
        this.w = false;
        this.x = false;
        this.y = true;
        this.C = new HashSet();
        this.D = AbstractC0839Kn.a;
        this.E = new Object();
        this.G = false;
        C0999Mo1 c0999Mo12 = new C0999Mo1();
        c0999Mo12.b = this;
        c0999Mo12.a = null;
        this.K = c0999Mo12;
        this.b = c8051xo;
        this.s = c2359bc1;
        this.t = c1543To;
        C20 c20 = new C20(handler);
        this.d = c20;
        ExecutorC5715lY0 executorC5715lY0 = new ExecutorC5715lY0(executor);
        this.c = executorC5715lY0;
        this.h = new C0134Bm(this, executorC5715lY0, c20, j);
        C7409uQ0 c7409uQ0 = new C7409uQ0();
        c7409uQ0.a = new LinkedHashMap();
        this.a = c7409uQ0;
        ((C0390Et0) c0999Mo1.a).k(new C2572ck0(EnumC7289to.CLOSED));
        C3383dO1 c3383dO1 = new C3383dO1(c1543To);
        this.f = c3383dO1;
        U41 u41 = new U41();
        u41.a = new Object();
        u41.c = new LinkedHashSet();
        u41.d = new LinkedHashSet();
        u41.e = new LinkedHashSet();
        u41.f = new C4031go(u41);
        u41.b = executorC5715lY0;
        this.A = u41;
        this.H = jk;
        try {
            C0527Gn c0527GnB = c8051xo.b(str);
            C6329om c6329om = new C6329om(c0527GnB, c20, executorC5715lY0, new C0481Fx1(this), c0368Em.j);
            this.g = c6329om;
            this.i = c0368Em;
            c0368Em.B(c6329om);
            c0368Em.h.l((C0390Et0) c3383dO1.c);
            this.I = C1562Tu0.q0(c0527GnB);
            this.l = A();
            C3513e41 c3513e41 = c0368Em.j;
            C3513e41 c3513e412 = AbstractC7768wJ.a;
            U41 u412 = new U41();
            u412.a = executorC5715lY0;
            u412.b = c20;
            u412.c = handler;
            u412.d = u41;
            u412.e = c3513e41;
            u412.f = c3513e412;
            this.B = u412;
            C3513e41 c3513e413 = c0368Em.j;
            this.u = c3513e413.x0(LegacyCameraOutputConfigNullPointerQuirk.class) || c3513e413.x0(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.v = c0368Em.j.x0(LegacyCameraSurfaceCleanupQuirk.class);
            C7855wm c7855wm = new C7855wm(this, str);
            this.r = c7855wm;
            C3866fw1 c3866fw1 = new C3866fw1(5, this);
            synchronized (c1543To.b) {
                AbstractC3377dM1.i(!c1543To.e.containsKey(this), "Camera is already registered: " + this);
                c1543To.e.put(this, new C1465So(executorC5715lY0, c3866fw1, c7855wm));
            }
            c8051xo.a.j1(executorC5715lY0, c7855wm);
            this.J = new H61(context, str, c8051xo, new C1538Tm0(9));
        } catch (C5950mn e) {
            throw new C1621Uo(e);
        }
    }

    public static String w(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String x(C1241Pr0 c1241Pr0) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        c1241Pr0.getClass();
        sb.append(c1241Pr0.hashCode());
        return sb.toString();
    }

    public static String y(AbstractC3821fh1 abstractC3821fh1) {
        return abstractC3821fh1.h() + abstractC3821fh1.hashCode();
    }

    public final InterfaceC4228hq A() {
        synchronized (this.E) {
            try {
                if (this.F == null) {
                    return new C4037gq(this.I, this.i.j);
                }
                return new JD0(this.F, this.i, this.I, this.c, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(boolean z) {
        if (!z) {
            this.h.e.b = -1L;
        }
        this.h.a();
        this.K.q();
        u("Opening camera.");
        F(8);
        try {
            this.b.a.f1(this.i.a, this.c, t());
        } catch (SecurityException e) {
            u("Unable to open camera due to " + e.getMessage());
            F(7);
            this.h.b();
        } catch (C5950mn e2) {
            u("Unable to open camera due to " + e2.getMessage());
            if (e2.a == 10001) {
                G(3, new C0026Ac(7, e2), true);
                return;
            }
            C0999Mo1 c0999Mo1 = this.K;
            if (((C0212Cm) c0999Mo1.b).L != 8) {
                ((C0212Cm) c0999Mo1.b).u("Don't need the onError timeout handler.");
                return;
            }
            ((C0212Cm) c0999Mo1.b).u("Camera waiting for onError.");
            c0999Mo1.q();
            c0999Mo1.a = new C1857Xo1(c0999Mo1);
        }
    }

    public final void C() {
        AbstractC3377dM1.i(this.L == 9, null);
        C8004xY0 c8004xY0D = this.a.d();
        if (!c8004xY0D.l || !c8004xY0D.k) {
            u("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.t.e(this.j.getId(), this.s.d(this.j.getId()))) {
            u("Unable to create capture session in camera operating mode = " + this.s.a);
            return;
        }
        HashMap map = new HashMap();
        Collection<C8194yY0> collectionE = this.a.e();
        Collection collectionF = this.a.f();
        C0572Hc c0572Hc = AbstractC6011n51.a;
        ArrayList arrayList = new ArrayList(collectionF);
        Iterator it = collectionE.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C8194yY0 c8194yY0 = (C8194yY0) it.next();
            C0873Ky0 c0873Ky0 = c8194yY0.g.b;
            C0572Hc c0572Hc2 = AbstractC6011n51.a;
            if (c0873Ky0.a.containsKey(c0572Hc2) && c8194yY0.b().size() != 1) {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(c8194yY0.b().size()));
                AbstractC0759Jm0.f("StreamUseCaseUtil");
                break;
            }
            if (c8194yY0.g.b.a.containsKey(c0572Hc2)) {
                int i = 0;
                for (C8194yY0 c8194yY02 : collectionE) {
                    if (((InterfaceC5361jh1) arrayList.get(i)).T() == EnumC5743lh1.f) {
                        AbstractC3377dM1.i(!c8194yY02.b().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((AbstractC4314iH) c8194yY02.b().get(0), 1L);
                    } else if (c8194yY02.g.b.a.containsKey(c0572Hc2) && !c8194yY02.b().isEmpty()) {
                        map.put((AbstractC4314iH) c8194yY02.b().get(0), (Long) c8194yY02.g.b.w(c0572Hc2));
                    }
                    i++;
                }
            }
        }
        this.l.c(map);
        InterfaceC4228hq interfaceC4228hq = this.l;
        C8194yY0 c8194yY0B = c8004xY0D.b();
        CameraDevice cameraDevice = this.j;
        cameraDevice.getClass();
        U41 u41 = this.B;
        AbstractC1500Sz1.a(interfaceC4228hq.d(c8194yY0B, cameraDevice, new E71((C3513e41) u41.e, (C3513e41) u41.f, (U41) u41.d, (ExecutorC5715lY0) u41.a, (C20) u41.b, (Handler) u41.c)), new CC0(this, interfaceC4228hq, false, 7), this.c);
    }

    public final void D() {
        if (this.z != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.z.getClass();
            sb.append(this.z.hashCode());
            String string = sb.toString();
            C7409uQ0 c7409uQ0 = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c7409uQ0.a;
            if (linkedHashMap.containsKey(string)) {
                C4012gh1 c4012gh1 = (C4012gh1) linkedHashMap.get(string);
                c4012gh1.e = false;
                if (!c4012gh1.f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.z.getClass();
            sb2.append(this.z.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c7409uQ0.a;
            if (linkedHashMap2.containsKey(string2)) {
                C4012gh1 c4012gh12 = (C4012gh1) linkedHashMap2.get(string2);
                c4012gh12.f = false;
                if (!c4012gh12.e) {
                    linkedHashMap2.remove(string2);
                }
            }
            C1241Pr0 c1241Pr0 = this.z;
            c1241Pr0.getClass();
            AbstractC0759Jm0.f("MeteringRepeating");
            G70 g70 = (G70) c1241Pr0.a;
            if (g70 != null) {
                g70.a();
            }
            c1241Pr0.a = null;
            this.z = null;
        }
    }

    public final void E() {
        AbstractC3377dM1.i(this.l != null, null);
        u("Resetting Capture Session");
        InterfaceC4228hq interfaceC4228hq = this.l;
        C8194yY0 c8194yY0G = interfaceC4228hq.g();
        List listE = interfaceC4228hq.e();
        InterfaceC4228hq interfaceC4228hqA = A();
        this.l = interfaceC4228hqA;
        interfaceC4228hqA.b(c8194yY0G);
        this.l.f(listE);
        if (AbstractC8235ym.x(this.L) != 8) {
            u("Skipping Capture Session state check due to current camera state: " + AbstractC8235ym.z(this.L) + " and previous session status: " + interfaceC4228hq.h());
        } else if (this.u && interfaceC4228hq.h()) {
            u("Close camera before creating new session");
            F(6);
        }
        if (this.v && interfaceC4228hq.h()) {
            u("ConfigAndClose is required when close the camera.");
            this.w = true;
        }
        interfaceC4228hq.close();
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0Release = interfaceC4228hq.release();
        u("Releasing session in state ".concat(AbstractC8235ym.w(this.L)));
        this.p.put(interfaceC4228hq, interfaceFutureC0750Jj0Release);
        AbstractC1500Sz1.a(interfaceFutureC0750Jj0Release, new VH(this, 5, interfaceC4228hq), QR1.a());
    }

    public final void F(int i) {
        G(i, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0148 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:133:0x009f, B:135:0x00a6, B:137:0x00b0, B:150:0x00e4, B:154:0x00ea, B:156:0x00f1, B:158:0x00f5, B:160:0x0105, B:163:0x010d, B:165:0x0111, B:166:0x0120, B:168:0x0126, B:170:0x0138, B:178:0x0164, B:179:0x0167, B:171:0x0148, B:173:0x014c, B:175:0x0150, B:139:0x00b8, B:141:0x00cd, B:145:0x00d4, B:147:0x00db), top: B:198:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(int r10, defpackage.C0026Ac r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0212Cm.G(int, Ac, boolean):void");
    }

    public final ArrayList H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            arrayList2.add(new C8205yc(y(abstractC3821fh1), abstractC3821fh1.getClass(), this.y ? abstractC3821fh1.m : abstractC3821fh1.n, abstractC3821fh1.f, abstractC3821fh1.c(), abstractC3821fh1.g, abstractC3821fh1.d() == null ? null : C5438k51.J(abstractC3821fh1)));
        }
        return arrayList2;
    }

    public final void I(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.a.e().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C8205yc c8205yc = (C8205yc) it.next();
            if (!this.a.h(c8205yc.a)) {
                C7409uQ0 c7409uQ0 = this.a;
                String str = c8205yc.a;
                C8194yY0 c8194yY0 = c8205yc.c;
                InterfaceC5361jh1 interfaceC5361jh1 = c8205yc.d;
                C0500Ge c0500Ge = c8205yc.f;
                ArrayList arrayList3 = c8205yc.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c7409uQ0.a;
                C4012gh1 c4012gh1 = (C4012gh1) linkedHashMap.get(str);
                if (c4012gh1 == null) {
                    c4012gh1 = new C4012gh1(c8194yY0, interfaceC5361jh1, c0500Ge, arrayList3);
                    linkedHashMap.put(str, c4012gh1);
                }
                c4012gh1.e = true;
                c7409uQ0.j(str, c8194yY0, interfaceC5361jh1, c0500Ge, arrayList3);
                arrayList2.add(c8205yc.a);
                if (c8205yc.b == C3349dD0.class && (size = c8205yc.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            this.g.k(true);
            C6329om c6329om = this.g;
            synchronized (c6329om.c) {
                c6329om.o++;
            }
        }
        q();
        M();
        L();
        E();
        if (this.L == 9) {
            C();
        } else {
            int iX = AbstractC8235ym.x(this.L);
            if (iX == 2 || iX == 3) {
                J(false);
            } else if (iX != 4) {
                u("open() ignored due to being in state: ".concat(AbstractC8235ym.z(this.L)));
            } else {
                F(7);
                if (!this.p.isEmpty() && !this.x && this.k == 0) {
                    AbstractC3377dM1.i(this.j != null, "Camera Device should be open if session close is not complete");
                    F(9);
                    C();
                }
            }
        }
        if (rational != null) {
            this.g.g.e = rational;
        }
    }

    public final void J(boolean z) {
        u("Attempting to force open the camera.");
        if (this.t.d(this)) {
            B(z);
        } else {
            u("No cameras available. Waiting for available camera before opening camera.");
            F(4);
        }
    }

    public final void K(boolean z) {
        u("Attempting to open the camera.");
        if (this.r.b && this.t.d(this)) {
            B(z);
        } else {
            u("No cameras available. Waiting for available camera before opening camera.");
            F(4);
        }
    }

    public final void L() {
        C7409uQ0 c7409uQ0 = this.a;
        c7409uQ0.getClass();
        C8004xY0 c8004xY0 = new C8004xY0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c7409uQ0.a).entrySet()) {
            C4012gh1 c4012gh1 = (C4012gh1) entry.getValue();
            if (c4012gh1.f && c4012gh1.e) {
                String str = (String) entry.getKey();
                c8004xY0.a(c4012gh1.a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        AbstractC0759Jm0.f("UseCaseAttachState");
        boolean z = c8004xY0.l && c8004xY0.k;
        C6329om c6329om = this.g;
        if (!z) {
            c6329om.v = 1;
            c6329om.g.n = 1;
            c6329om.m.a = 1;
            this.l.b(c6329om.d());
            return;
        }
        int i = c8004xY0.b().g.c;
        c6329om.v = i;
        c6329om.g.n = i;
        c6329om.m.a = i;
        c8004xY0.a(c6329om.d());
        this.l.b(c8004xY0.b());
    }

    public final void M() {
        Iterator it = this.a.f().iterator();
        boolean zM0 = false;
        while (it.hasNext()) {
            zM0 |= ((InterfaceC5361jh1) it.next()).m0();
        }
        this.g.k.c = zM0;
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC3486dx0 a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC7480uo, defpackage.InterfaceC5759ln
    public final InterfaceC6907ro b() {
        return o();
    }

    @Override // defpackage.InterfaceC7480uo
    public final void c(InterfaceC0605Hn interfaceC0605Hn) {
        if (interfaceC0605Hn == null) {
            interfaceC0605Hn = AbstractC0839Kn.a;
        }
        AbstractC3987gZ0 abstractC3987gZ0V = interfaceC0605Hn.V();
        this.D = interfaceC0605Hn;
        synchronized (this.E) {
            this.F = abstractC3987gZ0V;
        }
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void d(AbstractC3821fh1 abstractC3821fh1) {
        abstractC3821fh1.getClass();
        this.c.execute(new RunnableC7474um(this, y(abstractC3821fh1), this.y ? abstractC3821fh1.m : abstractC3821fh1.n, abstractC3821fh1.f, abstractC3821fh1.g, abstractC3821fh1.d() == null ? null : C5438k51.J(abstractC3821fh1), 0));
    }

    @Override // defpackage.InterfaceC7480uo
    public final boolean e() {
        return ((C0368Em) b()).j() == 0;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void f(AbstractC3821fh1 abstractC3821fh1) {
        abstractC3821fh1.getClass();
        this.c.execute(new RunnableC7283tm(this, y(abstractC3821fh1), this.y ? abstractC3821fh1.m : abstractC3821fh1.n, abstractC3821fh1.f, abstractC3821fh1.g, abstractC3821fh1.d() == null ? null : C5438k51.J(abstractC3821fh1), 1));
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC1930Yn g() {
        return this.g;
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC0605Hn h() {
        return this.D;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void i(AbstractC3821fh1 abstractC3821fh1) {
        abstractC3821fh1.getClass();
        this.c.execute(new RunnableC7283tm(this, y(abstractC3821fh1), this.y ? abstractC3821fh1.m : abstractC3821fh1.n, abstractC3821fh1.f, abstractC3821fh1.g, abstractC3821fh1.d() == null ? null : C5438k51.J(abstractC3821fh1), 0));
    }

    @Override // defpackage.InterfaceC7480uo
    public final void j(boolean z) {
        this.c.execute(new RunnableC8389za(this, z, 4));
    }

    @Override // defpackage.InterfaceC7480uo
    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(H(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            String strY = y(abstractC3821fh1);
            HashSet hashSet = this.C;
            if (hashSet.contains(strY)) {
                abstractC3821fh1.w();
                hashSet.remove(strY);
            }
        }
        this.c.execute(new RunnableC7092sm(this, arrayList3, 1));
    }

    @Override // defpackage.InterfaceC7480uo
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C6329om c6329om = this.g;
        synchronized (c6329om.c) {
            c6329om.o++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
            String strY = y(abstractC3821fh1);
            HashSet hashSet = this.C;
            if (!hashSet.contains(strY)) {
                hashSet.add(strY);
                abstractC3821fh1.v();
                abstractC3821fh1.t();
            }
        }
        try {
            this.c.execute(new RunnableC7092sm(this, new ArrayList(H(arrayList2)), 0));
        } catch (RejectedExecutionException unused) {
            u("Unable to attach use cases.");
            c6329om.b();
        }
    }

    @Override // defpackage.InterfaceC7480uo
    public final /* synthetic */ boolean m() {
        return true;
    }

    @Override // defpackage.InterfaceC7480uo
    public final void n(boolean z) {
        this.y = z;
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC6907ro o() {
        return this.i;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void p(AbstractC3821fh1 abstractC3821fh1) {
        abstractC3821fh1.getClass();
        this.c.execute(new RunnableC6769r4(this, 19, y(abstractC3821fh1)));
    }

    public final void q() {
        Size size;
        C7409uQ0 c7409uQ0 = this.a;
        C8194yY0 c8194yY0B = c7409uQ0.d().b();
        C1702Vp c1702Vp = c8194yY0B.g;
        int size2 = Collections.unmodifiableList(c1702Vp.a).size();
        int size3 = c8194yY0B.b().size();
        if (c8194yY0B.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(c1702Vp.a).isEmpty()) {
            if (size3 == 1 && size2 == 1) {
                D();
                return;
            }
            if (size2 >= 2) {
                D();
                return;
            } else if (this.z == null || z()) {
                AbstractC0759Jm0.f("Camera2CameraImpl");
                return;
            } else {
                D();
                return;
            }
        }
        if (this.z == null) {
            C0527Gn c0527Gn = this.i.b;
            C6901rm c6901rm = new C6901rm(this, 2);
            JK jk = this.H;
            C1241Pr0 c1241Pr0 = new C1241Pr0();
            G61 g61 = new G61();
            Size size4 = null;
            c1241Pr0.f = null;
            c1241Pr0.c = new C1163Or0();
            c1241Pr0.e = c6901rm;
            Size[] sizeArrV = c0527Gn.b().v(34);
            if (sizeArrV == null) {
                AbstractC0759Jm0.f("MeteringRepeating");
                size = new Size(0, 0);
            } else {
                if (g61.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size5 : sizeArrV) {
                        if (G61.c.compare(size5, G61.b) >= 0) {
                            arrayList.add(size5);
                        }
                    }
                    sizeArrV = (Size[]) arrayList.toArray(new Size[0]);
                }
                List listAsList = Arrays.asList(sizeArrV);
                Collections.sort(listAsList, new C0350Eg(16));
                Size sizeE = jk.e();
                long jMin = Math.min(sizeE.getWidth() * sizeE.getHeight(), 307200L);
                int length = sizeArrV.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Size size6 = sizeArrV[i];
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
            c1241Pr0.d = size;
            Objects.toString(size);
            AbstractC0759Jm0.f("MeteringRepeating");
            c1241Pr0.b = c1241Pr0.n();
            this.z = c1241Pr0;
        }
        if (!z()) {
            AbstractC0759Jm0.f("Camera2CameraImpl");
            return;
        }
        C1241Pr0 c1241Pr02 = this.z;
        if (c1241Pr02 != null) {
            String strX = x(c1241Pr02);
            C1241Pr0 c1241Pr03 = this.z;
            C8194yY0 c8194yY0 = (C8194yY0) c1241Pr03.b;
            EnumC5743lh1 enumC5743lh1 = EnumC5743lh1.f;
            List listSingletonList = Collections.singletonList(enumC5743lh1);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c7409uQ0.a;
            C4012gh1 c4012gh1 = (C4012gh1) linkedHashMap.get(strX);
            C1163Or0 c1163Or0 = (C1163Or0) c1241Pr03.c;
            if (c4012gh1 == null) {
                c4012gh1 = new C4012gh1(c8194yY0, c1163Or0, null, listSingletonList);
                linkedHashMap.put(strX, c4012gh1);
            }
            c4012gh1.e = true;
            c7409uQ0.j(strX, c8194yY0, c1163Or0, null, listSingletonList);
            C1241Pr0 c1241Pr04 = this.z;
            C8194yY0 c8194yY02 = (C8194yY0) c1241Pr04.b;
            List listSingletonList2 = Collections.singletonList(enumC5743lh1);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c7409uQ0.a;
            C4012gh1 c4012gh12 = (C4012gh1) linkedHashMap2.get(strX);
            if (c4012gh12 == null) {
                c4012gh12 = new C4012gh1(c8194yY02, (C1163Or0) c1241Pr04.c, null, listSingletonList2);
                linkedHashMap2.put(strX, c4012gh12);
            }
            c4012gh12.f = true;
        }
    }

    public final void r() {
        AbstractC3377dM1.i(this.L == 5 || this.L == 2 || (this.L == 7 && this.k != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + AbstractC8235ym.z(this.L) + " (error: " + w(this.k) + ")");
        E();
        this.l.a();
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceFutureC0750Jj0 release() {
        return AbstractC8171yQ1.b(new C6901rm(this, 1));
    }

    public final void s() {
        AbstractC3377dM1.i(this.L == 2 || this.L == 5, null);
        AbstractC3377dM1.i(this.p.isEmpty(), null);
        if (!this.w) {
            v();
            return;
        }
        if (this.x) {
            u("Ignored since configAndClose is processing");
            return;
        }
        if (!this.r.b) {
            this.w = false;
            v();
            u("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            u("Open camera to configAndClose");
            C0599Hl c0599HlB = AbstractC8171yQ1.b(new C6901rm(this, 0));
            this.x = true;
            c0599HlB.b.d(new G4(9, this), this.c);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.a.d().b().c);
        arrayList.add((C4031go) this.A.f);
        arrayList.add(this.h);
        return YQ1.a(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.i.a);
    }

    public final void u(String str) {
        toString();
        AbstractC0759Jm0.f("Camera2CameraImpl");
    }

    public final void v() {
        AbstractC3377dM1.i(this.L == 2 || this.L == 5, null);
        AbstractC3377dM1.i(this.p.isEmpty(), null);
        this.j = null;
        if (this.L == 5) {
            F(3);
            return;
        }
        this.b.a.o1(this.r);
        F(1);
        C0365El c0365El = this.o;
        if (c0365El != null) {
            c0365El.b(null);
            this.o = null;
        }
    }

    public final boolean z() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.E) {
            try {
                i = this.s.a == 2 ? 1 : 0;
            } finally {
            }
        }
        C7409uQ0 c7409uQ0 = this.a;
        c7409uQ0.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) c7409uQ0.a).entrySet()) {
            if (((C4012gh1) entry.getValue()).e) {
                arrayList2.add((C4012gh1) entry.getValue());
            }
        }
        for (C4012gh1 c4012gh1 : Collections.unmodifiableCollection(arrayList2)) {
            List list = c4012gh1.d;
            if (list == null || list.get(0) != EnumC5743lh1.f) {
                if (c4012gh1.c == null || c4012gh1.d == null) {
                    c4012gh1.toString();
                    AbstractC0759Jm0.f("Camera2CameraImpl");
                    return false;
                }
                C8194yY0 c8194yY0 = c4012gh1.a;
                InterfaceC5361jh1 interfaceC5361jh1 = c4012gh1.b;
                for (AbstractC4314iH abstractC4314iH : c8194yY0.b()) {
                    H61 h61 = this.J;
                    int iP = interfaceC5361jh1.p();
                    C0656Ie c0656IeB = C0656Ie.b(i, iP, abstractC4314iH.h, h61.i(iP));
                    int iP2 = interfaceC5361jh1.p();
                    Size size = abstractC4314iH.h;
                    C0500Ge c0500Ge = c4012gh1.c;
                    arrayList.add(new C6681qc(c0656IeB, iP2, size, c0500Ge.b, c4012gh1.d, c0500Ge.d, interfaceC5361jh1.Z(null)));
                }
            }
        }
        this.z.getClass();
        HashMap map = new HashMap();
        C1241Pr0 c1241Pr0 = this.z;
        map.put((C1163Or0) c1241Pr0.c, Collections.singletonList((Size) c1241Pr0.d));
        try {
            this.J.g(i, arrayList, map, false, false);
            u("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException unused) {
            u("Surface combination with metering repeating  not supported!");
            return false;
        }
    }
}
