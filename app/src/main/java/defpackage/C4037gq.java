package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: gq */
/* loaded from: classes.dex */
public final class C4037gq implements InterfaceC4228hq {
    public final Object a;
    public final ArrayList b;
    public final C3846fq c;
    public E71 d;
    public E71 e;
    public C8194yY0 f;
    public final HashMap g;
    public List h;
    public int i;
    public C0599Hl j;
    public C0365El k;
    public HashMap l;
    public final FC m;
    public final FC n;
    public final C1055Nh0 o;
    public final C1562Tu0 p;
    public final C1036Nb q;

    public C4037gq(C1562Tu0 c1562Tu0) {
        this(c1562Tu0, new C3513e41(Collections.emptyList()));
    }

    public static C0446Fm j(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c0446Fm;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6141nn abstractC6141nn = (AbstractC6141nn) it.next();
            if (abstractC6141nn == null) {
                c0446Fm = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                AbstractC3967gS1.a(abstractC6141nn, arrayList2);
                c0446Fm = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C0446Fm(arrayList2);
            }
            arrayList.add(c0446Fm);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C0446Fm(arrayList);
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1808Wy0 c1808Wy0 = (C1808Wy0) it.next();
            if (!arrayList2.contains(c1808Wy0.a.e())) {
                arrayList2.add(c1808Wy0.a.e());
                arrayList3.add(c1808Wy0);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.InterfaceC4228hq
    public final void a() {
        ArrayList<C1702Vp> arrayList;
        synchronized (this.a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C1702Vp c1702Vp : arrayList) {
                Iterator it = c1702Vp.e.iterator();
                while (it.hasNext()) {
                    ((AbstractC6141nn) it.next()).a(c1702Vp.a());
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void b(C8194yY0 c8194yY0) {
        synchronized (this.a) {
            try {
                switch (AbstractC8235ym.x(this.i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(AbstractC8235ym.A(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f = c8194yY0;
                        break;
                    case 4:
                        this.f = c8194yY0;
                        if (c8194yY0 != null) {
                            if (!this.g.keySet().containsAll(c8194yY0.b())) {
                                AbstractC0759Jm0.f("CaptureSession");
                                return;
                            } else {
                                AbstractC0759Jm0.f("CaptureSession");
                                o(this.f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void c(HashMap map) {
        synchronized (this.a) {
            this.l = map;
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final void close() {
        synchronized (this.a) {
            try {
                int iX = AbstractC8235ym.x(this.i);
                if (iX == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(AbstractC8235ym.A(this.i)));
                }
                if (iX == 1) {
                    this.i = 8;
                } else if (iX == 2) {
                    AbstractC3377dM1.h(this.d, "The Opener shouldn't null in state:".concat(AbstractC8235ym.A(this.i)));
                    this.d.v();
                    this.i = 8;
                } else if (iX == 3 || iX == 4) {
                    AbstractC3377dM1.h(this.d, "The Opener shouldn't null in state:".concat(AbstractC8235ym.A(this.i)));
                    this.d.v();
                    this.i = 6;
                    this.o.c();
                    this.f = null;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final InterfaceFutureC0750Jj0 d(C8194yY0 c8194yY0, CameraDevice cameraDevice, E71 e71) {
        synchronized (this.a) {
            try {
                if (AbstractC8235ym.x(this.i) != 1) {
                    AbstractC0759Jm0.f("CaptureSession");
                    return new F70(1, new IllegalStateException("open() should not allow the state: ".concat(AbstractC8235ym.A(this.i))));
                }
                this.i = 3;
                ArrayList arrayList = new ArrayList(c8194yY0.b());
                this.h = arrayList;
                this.d = e71;
                QZ qzA = QZ.a(e71.t(arrayList));
                C4290i9 c4290i9 = new C4290i9(this, c8194yY0, cameraDevice, 1);
                ExecutorC5715lY0 executorC5715lY0 = this.d.d;
                qzA.getClass();
                RunnableC3467dr runnableC3467drR = AbstractC1500Sz1.r(qzA, c4290i9, executorC5715lY0);
                AbstractC1500Sz1.a(runnableC3467drR, new C1304Qm0(7, this), this.d.d);
                return AbstractC1500Sz1.l(runnableC3467drR);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final List e() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.b);
        }
        return listUnmodifiableList;
    }

    @Override // defpackage.InterfaceC4228hq
    public final void f(List list) {
        synchronized (this.a) {
            try {
                switch (AbstractC8235ym.x(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(AbstractC8235ym.A(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.b().d(new G4(19, this), QR1.a());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // defpackage.InterfaceC4228hq
    public final C8194yY0 g() {
        C8194yY0 c8194yY0;
        synchronized (this.a) {
            c8194yY0 = this.f;
        }
        return c8194yY0;
    }

    @Override // defpackage.InterfaceC4228hq
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            z = i == 5 || i == 4;
        }
        return z;
    }

    public final void i() {
        synchronized (this.a) {
            if (this.i != 5) {
                AbstractC0759Jm0.f("CaptureSession");
            } else {
                try {
                    this.e.i();
                } catch (CameraAccessException unused) {
                    AbstractC0759Jm0.f("CaptureSession");
                }
            }
        }
    }

    public final void k() {
        if (this.i == 8) {
            AbstractC0759Jm0.f("CaptureSession");
            return;
        }
        this.i = 8;
        this.e = null;
        C0365El c0365El = this.k;
        if (c0365El != null) {
            c0365El.b(null);
            this.k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C1808Wy0 l(defpackage.C8211ye r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            iH r0 = r6.a
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r1 = "Surface in OutputConfig not found in configuredSurfaceMap."
            defpackage.AbstractC3377dM1.h(r0, r1)
            Wy0 r2 = new Wy0
            int r3 = r6.e
            r2.<init>(r3, r0)
            fz0 r0 = r2.a
            if (r8 == 0) goto L1c
            r0.i(r8)
            goto L21
        L1c:
            java.lang.String r8 = r6.c
            r0.i(r8)
        L21:
            r8 = 1
            int r3 = r6.d
            if (r3 != 0) goto L2a
            r0.h(r8)
            goto L30
        L2a:
            if (r3 != r8) goto L30
            r3 = 2
            r0.h(r3)
        L30:
            java.util.List r3 = r6.b
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L58
            r0.b()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            iH r4 = (defpackage.AbstractC4314iH) r4
            java.lang.Object r4 = r7.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
            defpackage.AbstractC3377dM1.h(r4, r1)
            r0.a(r4)
            goto L3f
        L58:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r7 < r1) goto L8c
            Tu0 r3 = r5.p
            r3.getClass()
            if (r7 < r1) goto L66
            goto L67
        L66:
            r8 = 0
        L67:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            defpackage.AbstractC3377dM1.i(r8, r7)
            java.lang.Object r7 = r3.b
            GM r7 = (defpackage.GM) r7
            android.hardware.camera2.params.DynamicRangeProfiles r7 = r7.a()
            if (r7 == 0) goto L8c
            CM r6 = r6.f
            java.lang.Long r7 = defpackage.DM.a(r6, r7)
            if (r7 != 0) goto L87
            java.util.Objects.toString(r6)
            java.lang.String r6 = "CaptureSession"
            defpackage.AbstractC0759Jm0.f(r6)
            goto L8c
        L87:
            long r6 = r7.longValue()
            goto L8e
        L8c:
            r6 = 1
        L8e:
            r0.g(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4037gq.l(ye, java.util.HashMap, java.lang.String):Wy0");
    }

    public final int n(ArrayList arrayList) {
        C5947mm c5947mm;
        ArrayList arrayList2;
        boolean z;
        InterfaceC7668vn interfaceC7668vn;
        synchronized (this.a) {
            try {
                if (this.i != 5) {
                    AbstractC0759Jm0.f("CaptureSession");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    c5947mm = new C5947mm(1);
                    arrayList2 = new ArrayList();
                    AbstractC0759Jm0.f("CaptureSession");
                    Iterator it = arrayList.iterator();
                    z = false;
                    while (it.hasNext()) {
                        C1702Vp c1702Vp = (C1702Vp) it.next();
                        if (Collections.unmodifiableList(c1702Vp.a).isEmpty()) {
                            AbstractC0759Jm0.f("CaptureSession");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(c1702Vp.a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AbstractC4314iH abstractC4314iH = (AbstractC4314iH) it2.next();
                                    if (!this.g.containsKey(abstractC4314iH)) {
                                        Objects.toString(abstractC4314iH);
                                        AbstractC0759Jm0.f("CaptureSession");
                                        break;
                                    }
                                } else {
                                    if (c1702Vp.c == 2) {
                                        z = true;
                                    }
                                    C2005Zm c2005Zm = new C2005Zm(c1702Vp);
                                    if (c1702Vp.c == 5 && (interfaceC7668vn = c1702Vp.h) != null) {
                                        c2005Zm.h = interfaceC7668vn;
                                    }
                                    C8194yY0 c8194yY0 = this.f;
                                    if (c8194yY0 != null) {
                                        c2005Zm.c(c8194yY0.g.b);
                                    }
                                    c2005Zm.c(c1702Vp.b);
                                    C1702Vp c1702VpE = c2005Zm.e();
                                    E71 e71 = this.e;
                                    e71.g.getClass();
                                    CaptureRequest captureRequestC = KQ1.c(c1702VpE, ((CameraCaptureSession) ((ES1) e71.g.b).b).getDevice(), this.g, false, this.q);
                                    if (captureRequestC == null) {
                                        AbstractC0759Jm0.f("CaptureSession");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = c1702Vp.e.iterator();
                                    while (it3.hasNext()) {
                                        AbstractC3967gS1.a((AbstractC6141nn) it3.next(), arrayList3);
                                    }
                                    c5947mm.a(captureRequestC, arrayList3);
                                    arrayList2.add(captureRequestC);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e) {
                    e.getMessage();
                    AbstractC0759Jm0.f("CaptureSession");
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    AbstractC0759Jm0.f("CaptureSession");
                    return -1;
                }
                if (this.m.h(arrayList2, z)) {
                    this.e.x();
                    c5947mm.c = new C3655eq(this);
                }
                if (this.n.f(arrayList2, z)) {
                    c5947mm.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C0446Fm(this)));
                }
                return this.e.j(arrayList2, c5947mm);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int o(C8194yY0 c8194yY0) {
        synchronized (this.a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (c8194yY0 == null) {
                AbstractC0759Jm0.f("CaptureSession");
                return -1;
            }
            if (this.i != 5) {
                AbstractC0759Jm0.f("CaptureSession");
                return -1;
            }
            C1702Vp c1702Vp = c8194yY0.g;
            if (Collections.unmodifiableList(c1702Vp.a).isEmpty()) {
                AbstractC0759Jm0.f("CaptureSession");
                try {
                    this.e.x();
                } catch (CameraAccessException e) {
                    e.getMessage();
                    AbstractC0759Jm0.f("CaptureSession");
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC0759Jm0.f("CaptureSession");
                E71 e71 = this.e;
                e71.g.getClass();
                CaptureRequest captureRequestC = KQ1.c(c1702Vp, ((CameraCaptureSession) ((ES1) e71.g.b).b).getDevice(), this.g, true, this.q);
                if (captureRequestC == null) {
                    AbstractC0759Jm0.f("CaptureSession");
                    return -1;
                }
                return this.e.s(captureRequestC, this.o.a(j(c1702Vp.e, new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e2) {
                e2.getMessage();
                AbstractC0759Jm0.f("CaptureSession");
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    public final void p() {
        synchronized (this.a) {
            if (this.i != 5) {
                AbstractC0759Jm0.f("CaptureSession");
            } else {
                try {
                    this.e.x();
                } catch (CameraAccessException unused) {
                    AbstractC0759Jm0.f("CaptureSession");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:35:0x0009, B:36:0x000f, B:54:0x006b, B:38:0x0013, B:40:0x0017, B:43:0x001d, B:45:0x003c, B:46:0x0040, B:48:0x0044, B:49:0x004f, B:50:0x0051, B:52:0x0053, B:53:0x0067, B:57:0x006f, B:58:0x007e), top: B:61:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:35:0x0009, B:36:0x000f, B:54:0x006b, B:38:0x0013, B:40:0x0017, B:43:0x001d, B:45:0x003c, B:46:0x0040, B:48:0x0044, B:49:0x004f, B:50:0x0051, B:52:0x0053, B:53:0x0067, B:57:0x006f, B:58:0x007e), top: B:61:0x0009 }] */
    @Override // defpackage.InterfaceC4228hq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceFutureC0750Jj0 release() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.a
            monitor-enter(r3)
            int r4 = r5.i     // Catch: java.lang.Throwable -> L1b
            int r4 = defpackage.AbstractC8235ym.x(r4)     // Catch: java.lang.Throwable -> L1b
            switch(r4) {
                case 0: goto L6f;
                case 1: goto L67;
                case 2: goto L53;
                case 3: goto L1d;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L40;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1b
        L12:
            goto L6b
        L13:
            E71 r0 = r5.e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.k()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L7f
        L1d:
            r0 = 7
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
            Nh0 r0 = r5.o     // Catch: java.lang.Throwable -> L1b
            r0.c()     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            int r1 = r5.i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = defpackage.AbstractC8235ym.A(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L1b
            defpackage.AbstractC3377dM1.h(r0, r1)     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L40
            r5.k()     // Catch: java.lang.Throwable -> L1b
            goto L6b
        L40:
            Hl r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L4f
            eq r0 = new eq     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            Hl r0 = defpackage.AbstractC8171yQ1.b(r0)     // Catch: java.lang.Throwable -> L1b
            r5.j = r0     // Catch: java.lang.Throwable -> L1b
        L4f:
            Hl r0 = r5.j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L53:
            E71 r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = defpackage.AbstractC8235ym.A(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L1b
            defpackage.AbstractC3377dM1.h(r0, r1)     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.d     // Catch: java.lang.Throwable -> L1b
            r0.v()     // Catch: java.lang.Throwable -> L1b
        L67:
            r0 = 8
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
        L6b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            F70 r0 = defpackage.F70.c
            return r0
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = defpackage.AbstractC8235ym.A(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L7f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4037gq.release():Jj0");
    }

    public C4037gq(C1562Tu0 c1562Tu0, C3513e41 c3513e41) {
        this.a = new Object();
        this.b = new ArrayList();
        this.g = new HashMap();
        this.h = Collections.emptyList();
        this.i = 1;
        this.l = new HashMap();
        this.m = new FC(8);
        this.n = new FC(10);
        this.i = 2;
        this.p = c1562Tu0;
        this.c = new C3846fq(this);
        this.o = new C1055Nh0(c3513e41.x0(CaptureNoResponseQuirk.class));
        this.q = new C1036Nb(c3513e41, 3);
    }
}
