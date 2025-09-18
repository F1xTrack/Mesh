package p000;

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
public final class C4141gq implements InterfaceC4204hq {

    /* renamed from: a */
    public final Object f28040a;

    /* renamed from: b */
    public final ArrayList f28041b;

    /* renamed from: c */
    public final C4078fq f28042c;

    /* renamed from: d */
    public E71 f28043d;

    /* renamed from: e */
    public E71 f28044e;

    /* renamed from: f */
    public C11812yY0 f28045f;

    /* renamed from: g */
    public final HashMap f28046g;

    /* renamed from: h */
    public List f28047h;

    /* renamed from: i */
    public int f28048i;

    /* renamed from: j */
    public C0489Hl f28049j;

    /* renamed from: k */
    public C0300El f28050k;

    /* renamed from: l */
    public HashMap f28051l;

    /* renamed from: m */
    public final C0328FC f28052m;

    /* renamed from: n */
    public final C0328FC f28053n;

    /* renamed from: o */
    public final C8004Nh0 f28054o;

    /* renamed from: p */
    public final C8342Tu0 f28055p;

    /* renamed from: q */
    public final C0856Nb f28056q;

    public C4141gq(C8342Tu0 c8342Tu0) {
        this(c8342Tu0, new C9196e41(Collections.emptyList()));
    }

    /* renamed from: j */
    public static C0364Fm m18654j(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c0364Fm;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6511nn abstractC6511nn = (AbstractC6511nn) it.next();
            if (abstractC6511nn == null) {
                c0364Fm = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                AbstractC9500gS1.m18558a(abstractC6511nn, arrayList2);
                c0364Fm = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C0364Fm(arrayList2);
            }
            arrayList.add(c0364Fm);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C0364Fm(arrayList);
    }

    /* renamed from: m */
    public static ArrayList m18655m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8506Wy0 c8506Wy0 = (C8506Wy0) it.next();
            if (!arrayList2.contains(c8506Wy0.f13467a.mo9439e())) {
                arrayList2.add(c8506Wy0.f13467a.mo9439e());
                arrayList3.add(c8506Wy0);
            }
        }
        return arrayList3;
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: a */
    public final void mo4246a() {
        ArrayList<C1373Vp> arrayList;
        synchronized (this.f28040a) {
            try {
                if (this.f28041b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f28041b);
                    this.f28041b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C1373Vp c1373Vp : arrayList) {
                Iterator it = c1373Vp.f12782e.iterator();
                while (it.hasNext()) {
                    ((AbstractC6511nn) it.next()).mo6422a(c1373Vp.m8575a());
                }
            }
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: b */
    public final void mo4247b(C11812yY0 c11812yY0) {
        synchronized (this.f28040a) {
            try {
                switch (AbstractC7222ym.m26247x(this.f28048i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(AbstractC7222ym.m26221A(this.f28048i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f28045f = c11812yY0;
                        break;
                    case 4:
                        this.f28045f = c11812yY0;
                        if (c11812yY0 != null) {
                            if (!this.f28046g.keySet().containsAll(c11812yY0.m26164b())) {
                                AbstractC7806Jm0.m4412f("CaptureSession");
                                return;
                            } else {
                                AbstractC7806Jm0.m4412f("CaptureSession");
                                m18660o(this.f28045f);
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

    @Override // p000.InterfaceC4204hq
    /* renamed from: c */
    public final void mo4248c(HashMap map) {
        synchronized (this.f28040a) {
            this.f28051l = map;
        }
    }

    @Override // p000.InterfaceC4204hq
    public final void close() {
        synchronized (this.f28040a) {
            try {
                int iM26247x = AbstractC7222ym.m26247x(this.f28048i);
                if (iM26247x == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(AbstractC7222ym.m26221A(this.f28048i)));
                }
                if (iM26247x == 1) {
                    this.f28048i = 8;
                } else if (iM26247x == 2) {
                    AbstractC9104dM1.m17549h(this.f28043d, "The Opener shouldn't null in state:".concat(AbstractC7222ym.m26221A(this.f28048i)));
                    this.f28043d.m2048v();
                    this.f28048i = 8;
                } else if (iM26247x == 3 || iM26247x == 4) {
                    AbstractC9104dM1.m17549h(this.f28043d, "The Opener shouldn't null in state:".concat(AbstractC7222ym.m26221A(this.f28048i)));
                    this.f28043d.m2048v();
                    this.f28048i = 6;
                    this.f28054o.m5816c();
                    this.f28045f = null;
                }
            } finally {
            }
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: d */
    public final InterfaceFutureC7800Jj0 mo4249d(C11812yY0 c11812yY0, CameraDevice cameraDevice, E71 e71) {
        synchronized (this.f28040a) {
            try {
                if (AbstractC7222ym.m26247x(this.f28048i) != 1) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    return new F70(1, new IllegalStateException("open() should not allow the state: ".concat(AbstractC7222ym.m26221A(this.f28048i))));
                }
                this.f28048i = 3;
                ArrayList arrayList = new ArrayList(c11812yY0.m26164b());
                this.f28047h = arrayList;
                this.f28043d = e71;
                C1043QZ c1043qzM6727a = C1043QZ.m6727a(e71.m2046t(arrayList));
                C4224i9 c4224i9 = new C4224i9(this, c11812yY0, cameraDevice, 1);
                ExecutorC10151lY0 executorC10151lY0 = this.f28043d.f2482d;
                c1043qzM6727a.getClass();
                RunnableC3953dr runnableC3953drM7495r = AbstractC8301Sz1.m7495r(c1043qzM6727a, c4224i9, executorC10151lY0);
                AbstractC8301Sz1.m7478a(runnableC3953drM7495r, new C8170Qm0(7, this), this.f28043d.f2482d);
                return AbstractC8301Sz1.m7489l(runnableC3953drM7495r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: e */
    public final List mo4250e() {
        List listUnmodifiableList;
        synchronized (this.f28040a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f28041b);
        }
        return listUnmodifiableList;
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: f */
    public final void mo4251f(List list) {
        synchronized (this.f28040a) {
            try {
                switch (AbstractC7222ym.m26247x(this.f28048i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(AbstractC7222ym.m26221A(this.f28048i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f28041b.addAll(list);
                        break;
                    case 4:
                        this.f28041b.addAll(list);
                        this.f28054o.m5815b().mo2494d(new RunnableC0383G4(19, this), QR1.m6703a());
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

    @Override // p000.InterfaceC4204hq
    /* renamed from: g */
    public final C11812yY0 mo4252g() {
        C11812yY0 c11812yY0;
        synchronized (this.f28040a) {
            c11812yY0 = this.f28045f;
        }
        return c11812yY0;
    }

    @Override // p000.InterfaceC4204hq
    /* renamed from: h */
    public final boolean mo4253h() {
        boolean z;
        synchronized (this.f28040a) {
            int i = this.f28048i;
            z = i == 5 || i == 4;
        }
        return z;
    }

    /* renamed from: i */
    public final void m18656i() {
        synchronized (this.f28040a) {
            if (this.f28048i != 5) {
                AbstractC7806Jm0.m4412f("CaptureSession");
            } else {
                try {
                    this.f28044e.m2036i();
                } catch (CameraAccessException unused) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                }
            }
        }
    }

    /* renamed from: k */
    public final void m18657k() {
        if (this.f28048i == 8) {
            AbstractC7806Jm0.m4412f("CaptureSession");
            return;
        }
        this.f28048i = 8;
        this.f28044e = null;
        C0300El c0300El = this.f28050k;
        if (c0300El != null) {
            c0300El.m2375b(null);
            this.f28050k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C8506Wy0 m18658l(p000.C7214ye r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            iH r0 = r6.f46367a
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r1 = "Surface in OutputConfig not found in configuredSurfaceMap."
            p000.AbstractC9104dM1.m17549h(r0, r1)
            Wy0 r2 = new Wy0
            int r3 = r6.f46371e
            r2.<init>(r3, r0)
            fz0 r0 = r2.f13467a
            if (r8 == 0) goto L1c
            r0.mo9442i(r8)
            goto L21
        L1c:
            java.lang.String r8 = r6.f46369c
            r0.mo9442i(r8)
        L21:
            r8 = 1
            int r3 = r6.f46370d
            if (r3 != 0) goto L2a
            r0.mo17807h(r8)
            goto L30
        L2a:
            if (r3 != r8) goto L30
            r3 = 2
            r0.mo17807h(r3)
        L30:
            java.util.List r3 = r6.f46368b
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L58
            r0.mo9436b()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            iH r4 = (p000.AbstractC4232iH) r4
            java.lang.Object r4 = r7.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
            p000.AbstractC9104dM1.m17549h(r4, r1)
            r0.mo10397a(r4)
            goto L3f
        L58:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r7 < r1) goto L8c
            Tu0 r3 = r5.f28055p
            r3.getClass()
            if (r7 < r1) goto L66
            goto L67
        L66:
            r8 = 0
        L67:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            p000.AbstractC9104dM1.m17550i(r8, r7)
            java.lang.Object r7 = r3.f11590b
            GM r7 = (p000.InterfaceC0401GM) r7
            android.hardware.camera2.params.DynamicRangeProfiles r7 = r7.mo3041a()
            if (r7 == 0) goto L8c
            CM r6 = r6.f46372f
            java.lang.Long r7 = p000.AbstractC0212DM.m1650a(r6, r7)
            if (r7 != 0) goto L87
            java.util.Objects.toString(r6)
            java.lang.String r6 = "CaptureSession"
            p000.AbstractC7806Jm0.m4412f(r6)
            goto L8c
        L87:
            long r6 = r7.longValue()
            goto L8e
        L8c:
            r6 = 1
        L8e:
            r0.mo9441g(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4141gq.m18658l(ye, java.util.HashMap, java.lang.String):Wy0");
    }

    /* renamed from: n */
    public final int m18659n(ArrayList arrayList) {
        C6447mm c6447mm;
        ArrayList arrayList2;
        boolean z;
        InterfaceC7034vn interfaceC7034vn;
        synchronized (this.f28040a) {
            try {
                if (this.f28048i != 5) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    c6447mm = new C6447mm(1);
                    arrayList2 = new ArrayList();
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    Iterator it = arrayList.iterator();
                    z = false;
                    while (it.hasNext()) {
                        C1373Vp c1373Vp = (C1373Vp) it.next();
                        if (Collections.unmodifiableList(c1373Vp.f12778a).isEmpty()) {
                            AbstractC7806Jm0.m4412f("CaptureSession");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(c1373Vp.f12778a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AbstractC4232iH abstractC4232iH = (AbstractC4232iH) it2.next();
                                    if (!this.f28046g.containsKey(abstractC4232iH)) {
                                        Objects.toString(abstractC4232iH);
                                        AbstractC7806Jm0.m4412f("CaptureSession");
                                        break;
                                    }
                                } else {
                                    if (c1373Vp.f12780c == 2) {
                                        z = true;
                                    }
                                    C1622Zm c1622Zm = new C1622Zm(c1373Vp);
                                    if (c1373Vp.f12780c == 5 && (interfaceC7034vn = c1373Vp.f12785h) != null) {
                                        c1622Zm.f15120h = interfaceC7034vn;
                                    }
                                    C11812yY0 c11812yY0 = this.f28045f;
                                    if (c11812yY0 != null) {
                                        c1622Zm.m9590c(c11812yY0.f46304g.f12779b);
                                    }
                                    c1622Zm.m9590c(c1373Vp.f12779b);
                                    C1373Vp c1373VpM9592e = c1622Zm.m9592e();
                                    E71 e71 = this.f28044e;
                                    e71.f2485g.getClass();
                                    CaptureRequest captureRequestM4640c = KQ1.m4640c(c1373VpM9592e, ((CameraCaptureSession) ((ES1) e71.f2485g.f11590b).f2708b).getDevice(), this.f28046g, false, this.f28056q);
                                    if (captureRequestM4640c == null) {
                                        AbstractC7806Jm0.m4412f("CaptureSession");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = c1373Vp.f12782e.iterator();
                                    while (it3.hasNext()) {
                                        AbstractC9500gS1.m18558a((AbstractC6511nn) it3.next(), arrayList3);
                                    }
                                    c6447mm.m22943a(captureRequestM4640c, arrayList3);
                                    arrayList2.add(captureRequestM4640c);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e) {
                    e.getMessage();
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    return -1;
                }
                if (this.f28052m.m2552h(arrayList2, z)) {
                    this.f28044e.m2050x();
                    c6447mm.f37865c = new C4015eq(this);
                }
                if (this.f28053n.m2550f(arrayList2, z)) {
                    c6447mm.m22943a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new C0364Fm(this)));
                }
                return this.f28044e.m2037j(arrayList2, c6447mm);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final int m18660o(C11812yY0 c11812yY0) {
        synchronized (this.f28040a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (c11812yY0 == null) {
                AbstractC7806Jm0.m4412f("CaptureSession");
                return -1;
            }
            if (this.f28048i != 5) {
                AbstractC7806Jm0.m4412f("CaptureSession");
                return -1;
            }
            C1373Vp c1373Vp = c11812yY0.f46304g;
            if (Collections.unmodifiableList(c1373Vp.f12778a).isEmpty()) {
                AbstractC7806Jm0.m4412f("CaptureSession");
                try {
                    this.f28044e.m2050x();
                } catch (CameraAccessException e) {
                    e.getMessage();
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC7806Jm0.m4412f("CaptureSession");
                E71 e71 = this.f28044e;
                e71.f2485g.getClass();
                CaptureRequest captureRequestM4640c = KQ1.m4640c(c1373Vp, ((CameraCaptureSession) ((ES1) e71.f2485g.f11590b).f2708b).getDevice(), this.f28046g, true, this.f28056q);
                if (captureRequestM4640c == null) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                    return -1;
                }
                return this.f28044e.m2045s(captureRequestM4640c, this.f28054o.m5814a(m18654j(c1373Vp.f12782e, new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e2) {
                e2.getMessage();
                AbstractC7806Jm0.m4412f("CaptureSession");
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    /* renamed from: p */
    public final void m18661p() {
        synchronized (this.f28040a) {
            if (this.f28048i != 5) {
                AbstractC7806Jm0.m4412f("CaptureSession");
            } else {
                try {
                    this.f28044e.m2050x();
                } catch (CameraAccessException unused) {
                    AbstractC7806Jm0.m4412f("CaptureSession");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:35:0x0009, B:36:0x000f, B:54:0x006b, B:38:0x0013, B:40:0x0017, B:43:0x001d, B:45:0x003c, B:46:0x0040, B:48:0x0044, B:49:0x004f, B:50:0x0051, B:52:0x0053, B:53:0x0067, B:57:0x006f, B:58:0x007e), top: B:61:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:35:0x0009, B:36:0x000f, B:54:0x006b, B:38:0x0013, B:40:0x0017, B:43:0x001d, B:45:0x003c, B:46:0x0040, B:48:0x0044, B:49:0x004f, B:50:0x0051, B:52:0x0053, B:53:0x0067, B:57:0x006f, B:58:0x007e), top: B:61:0x0009 }] */
    @Override // p000.InterfaceC4204hq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceFutureC7800Jj0 release() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f28040a
            monitor-enter(r3)
            int r4 = r5.f28048i     // Catch: java.lang.Throwable -> L1b
            int r4 = p000.AbstractC7222ym.m26247x(r4)     // Catch: java.lang.Throwable -> L1b
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
            E71 r0 = r5.f28044e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.m2038k()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L7f
        L1d:
            r0 = 7
            r5.f28048i = r0     // Catch: java.lang.Throwable -> L1b
            Nh0 r0 = r5.f28054o     // Catch: java.lang.Throwable -> L1b
            r0.m5816c()     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.f28043d     // Catch: java.lang.Throwable -> L1b
            int r1 = r5.f28048i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = p000.AbstractC7222ym.m26221A(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L1b
            p000.AbstractC9104dM1.m17549h(r0, r1)     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.f28043d     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.m2048v()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L40
            r5.m18657k()     // Catch: java.lang.Throwable -> L1b
            goto L6b
        L40:
            Hl r0 = r5.f28049j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L4f
            eq r0 = new eq     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1b
            Hl r0 = p000.AbstractC11797yQ1.m26149b(r0)     // Catch: java.lang.Throwable -> L1b
            r5.f28049j = r0     // Catch: java.lang.Throwable -> L1b
        L4f:
            Hl r0 = r5.f28049j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L53:
            E71 r0 = r5.f28043d     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.f28048i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = p000.AbstractC7222ym.m26221A(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L1b
            p000.AbstractC9104dM1.m17549h(r0, r1)     // Catch: java.lang.Throwable -> L1b
            E71 r0 = r5.f28043d     // Catch: java.lang.Throwable -> L1b
            r0.m2048v()     // Catch: java.lang.Throwable -> L1b
        L67:
            r0 = 8
            r5.f28048i = r0     // Catch: java.lang.Throwable -> L1b
        L6b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            F70 r0 = p000.F70.f3069c
            return r0
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.f28048i     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = p000.AbstractC7222ym.m26221A(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L7f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4141gq.release():Jj0");
    }

    public C4141gq(C8342Tu0 c8342Tu0, C9196e41 c9196e41) {
        this.f28040a = new Object();
        this.f28041b = new ArrayList();
        this.f28046g = new HashMap();
        this.f28047h = Collections.emptyList();
        this.f28048i = 1;
        this.f28051l = new HashMap();
        this.f28052m = new C0328FC(8);
        this.f28053n = new C0328FC(10);
        this.f28048i = 2;
        this.f28055p = c8342Tu0;
        this.f28042c = new C4078fq(this);
        this.f28054o = new C8004Nh0(c9196e41.m17862x0(CaptureNoResponseQuirk.class));
        this.f28056q = new C0856Nb(c9196e41, 3);
    }
}
