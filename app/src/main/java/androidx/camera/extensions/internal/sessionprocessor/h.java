package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor;
import defpackage.AbstractC0759Jm0;
import defpackage.AbstractC3377dM1;
import defpackage.AbstractC3987gZ0;
import defpackage.AbstractC5223iz0;
import defpackage.AbstractC7196tJ;
import defpackage.C0084Av0;
import defpackage.C0572Hc;
import defpackage.C0734Je;
import defpackage.C0873Ky0;
import defpackage.C1016Mu0;
import defpackage.C1042Nd;
import defpackage.C1441Sg;
import defpackage.C1562Tu0;
import defpackage.C1591Ue;
import defpackage.C3329d61;
import defpackage.C3456dn;
import defpackage.C3664et;
import defpackage.C4001ge;
import defpackage.C4219hn;
import defpackage.C4332iN;
import defpackage.C4409in;
import defpackage.C6974s81;
import defpackage.C7793wR0;
import defpackage.F91;
import defpackage.G10;
import defpackage.H30;
import defpackage.InterfaceC3415dZ0;
import defpackage.InterfaceC3646en;
import defpackage.MR;
import defpackage.NT;
import defpackage.VY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h extends AbstractC3987gZ0 {
    public static final AtomicInteger B = new AtomicInteger(0);
    public final boolean A;
    public final Context h;
    public final PreviewExtenderImpl i;
    public final ImageCaptureExtenderImpl j;
    public volatile StillCaptureProcessor k;
    public volatile PreviewProcessor l;
    public volatile RequestUpdateProcessorImpl m;
    public volatile InterfaceC3646en n;
    public volatile InterfaceC3646en o;
    public volatile C0734Je p;
    public volatile AbstractC5223iz0 q;
    public volatile AbstractC5223iz0 r;
    public volatile C4219hn s;
    public volatile boolean t;
    public final AtomicInteger u;
    public final LinkedHashMap v;
    public final HashMap w;
    public final C3329d61 x;
    public AbstractC5223iz0 y;
    public final C1441Sg z;

    public h(PreviewExtenderImpl previewExtenderImpl, ImageCaptureExtenderImpl imageCaptureExtenderImpl, List list, C1441Sg c1441Sg, Context context) {
        super(list);
        this.k = null;
        this.l = null;
        this.m = null;
        this.p = null;
        this.t = false;
        this.u = new AtomicInteger(0);
        this.v = new LinkedHashMap();
        this.w = new HashMap();
        boolean z = AbstractC7196tJ.a.z0(CrashWhenOnDisableTooSoon.class) != null;
        C3329d61 c3329d61 = new C3329d61();
        c3329d61.b = 0L;
        c3329d61.a = z;
        this.x = c3329d61;
        this.i = previewExtenderImpl;
        this.j = imageCaptureExtenderImpl;
        this.h = context;
        this.z = c1441Sg;
        this.A = F91.o(c1441Sg);
    }

    public static HashMap p(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((CaptureResult.Key) pair.first, pair.second);
        }
        return map;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void b() {
        if (this.l != null) {
            this.l.close();
            this.l = null;
        }
        if (this.k != null) {
            this.k.close();
            this.k = null;
        }
        AbstractC0759Jm0.a("BasicSessionProcessor");
        this.i.onDeInit();
        AbstractC0759Jm0.a("BasicSessionProcessor");
        this.j.onDeInit();
    }

    @Override // defpackage.AbstractC3987gZ0
    public final Map c(Size size) {
        return this.z.l(size);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final C4409in e(String str, LinkedHashMap linkedHashMap, C4001ge c4001ge) {
        AbstractC0759Jm0.a("BasicSessionProcessor");
        this.i.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.h);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        this.j.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.h);
        this.q = c4001ge.d();
        this.r = c4001ge.b();
        this.y = c4001ge.c();
        PreviewExtenderImpl.ProcessorType processorType = this.i.getProcessorType();
        Objects.toString(processorType);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.n = C1042Nd.e(B.getAndIncrement(), this.q.b(), 2);
            this.l = new PreviewProcessor(this.i.getProcessor(), this.q.c(), this.q.b());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.n = C0734Je.e(B.getAndIncrement(), this.q.c());
            this.m = this.i.getProcessor();
        } else {
            this.n = C0734Je.e(B.getAndIncrement(), this.q.c());
        }
        CaptureProcessorImpl captureProcessor = this.j.getCaptureProcessor();
        Objects.toString(captureProcessor);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureProcessor != null) {
            this.o = C1042Nd.e(B.getAndIncrement(), this.r.b(), this.j.getMaxCaptureStage());
            this.k = new StillCaptureProcessor(captureProcessor, this.r.c(), this.r.b(), this.y, !this.A);
        } else {
            this.o = C0734Je.e(B.getAndIncrement(), this.r.c());
        }
        if (c4001ge.a() != null) {
            this.p = C0734Je.e(B.getAndIncrement(), c4001ge.a().c());
        }
        C4409in c4409in = new C4409in(1);
        c4409in.a(this.n);
        c4409in.a(this.o);
        c4409in.h(1);
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            int iOnSessionType = this.i.onSessionType();
            AbstractC3377dM1.d("Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl", iOnSessionType == this.j.onSessionType());
            if (iOnSessionType == -1) {
                iOnSessionType = 0;
            }
            c4409in.i(iOnSessionType);
        }
        if (this.p != null) {
            c4409in.a(this.p);
        }
        CaptureStageImpl captureStageImplOnPresetSession = this.i.onPresetSession();
        Objects.toString(captureStageImplOnPresetSession);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        CaptureStageImpl captureStageImplOnPresetSession2 = this.j.onPresetSession();
        Objects.toString(captureStageImplOnPresetSession2);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureStageImplOnPresetSession != null && captureStageImplOnPresetSession.getParameters() != null) {
            for (Pair pair : captureStageImplOnPresetSession.getParameters()) {
                c4409in.b((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (captureStageImplOnPresetSession2 != null && captureStageImplOnPresetSession2.getParameters() != null) {
            for (Pair pair2 : captureStageImplOnPresetSession2.getParameters()) {
                c4409in.b((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return c4409in.d();
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void f() throws InterruptedException {
        this.x.a();
        if (this.l != null) {
            this.l.pause();
        }
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnDisableSession = this.i.onDisableSession();
        Objects.toString(captureStageImplOnDisableSession);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureStageImplOnDisableSession != null) {
            arrayList.add(captureStageImplOnDisableSession);
        }
        CaptureStageImpl captureStageImplOnDisableSession2 = this.j.onDisableSession();
        Objects.toString(captureStageImplOnDisableSession2);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureStageImplOnDisableSession2 != null) {
            arrayList.add(captureStageImplOnDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            q(this.s, arrayList);
        }
        this.s = null;
        this.t = false;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void g(C4219hn c4219hn) {
        this.s = c4219hn;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnEnableSession = this.i.onEnableSession();
        Objects.toString(captureStageImplOnEnableSession);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureStageImplOnEnableSession != null) {
            arrayList.add(captureStageImplOnEnableSession);
        }
        CaptureStageImpl captureStageImplOnEnableSession2 = this.j.onEnableSession();
        Objects.toString(captureStageImplOnEnableSession2);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (captureStageImplOnEnableSession2 != null) {
            arrayList.add(captureStageImplOnEnableSession2);
        }
        this.x.b();
        if (!arrayList.isEmpty()) {
            q(c4219hn, arrayList);
        }
        if (this.l != null) {
            this.l.resume();
            h(this.n.getId(), new c(this));
        }
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void i(C3456dn c3456dn) {
        synchronized (this.e) {
            try {
                HashMap map = new HashMap();
                G10 g10 = new G10(28);
                c3456dn.L(new H30(g10, 7, c3456dn));
                C1016Mu0 c1016Mu0X = g10.x();
                for (C0572Hc c0572Hc : ((C0873Ky0) c1016Mu0X.getConfig()).u()) {
                    map.put(c0572Hc.c, ((C0873Ky0) c1016Mu0X.getConfig()).w(c0572Hc));
                }
                this.v.clear();
                this.v.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int j(boolean z, C6974s81 c6974s81, VY vy) {
        AbstractC0759Jm0.a("BasicSessionProcessor");
        int andIncrement = this.u.getAndIncrement();
        if (this.s == null || this.t) {
            AbstractC0759Jm0.a("BasicSessionProcessor");
            vy.d();
            return andIncrement;
        }
        this.t = true;
        ArrayList arrayList = new ArrayList();
        List<CaptureStageImpl> captureStages = this.j.getCaptureStages();
        ArrayList arrayList2 = new ArrayList();
        for (CaptureStageImpl captureStageImpl : captureStages) {
            C4409in c4409in = new C4409in(2);
            c4409in.c(this.o.getId());
            c4409in.j(2);
            c4409in.f(captureStageImpl.getId());
            arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
            n(c4409in);
            o(c4409in);
            for (Pair pair : captureStageImpl.getParameters()) {
                c4409in.g((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(c4409in.e());
        }
        arrayList2.toString();
        AbstractC0759Jm0.a("BasicSessionProcessor");
        e eVar = new e(andIncrement, vy, c6974s81, this);
        AbstractC0759Jm0.a("BasicSessionProcessor");
        if (this.k != null) {
            h(this.o.getId(), new f(this, vy, andIncrement));
            this.k.startCapture(z, arrayList2, new g(andIncrement, vy, c6974s81, this));
        }
        this.s.e(arrayList, eVar);
        return andIncrement;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int k(final C6974s81 c6974s81, final InterfaceC3415dZ0 interfaceC3415dZ0) {
        final int andIncrement = this.u.getAndIncrement();
        if (this.s == null) {
            interfaceC3415dZ0.d();
        } else {
            if (this.l != null) {
                this.l.start(new PreviewProcessor.OnCaptureResultCallback(interfaceC3415dZ0, andIncrement, c6974s81) { // from class: androidx.camera.extensions.internal.sessionprocessor.b
                    public final /* synthetic */ InterfaceC3415dZ0 b;
                    public final /* synthetic */ C6974s81 c;

                    {
                        this.c = c6974s81;
                    }

                    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                    public final void onCaptureResult(long j, List list) {
                        this.a.getClass();
                        this.b.f(new NT(j, this.c, h.p(list)));
                    }
                });
            }
            r(andIncrement, interfaceC3415dZ0);
        }
        return andIncrement;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int l(C1562Tu0 c1562Tu0, C6974s81 c6974s81, VY vy) {
        AbstractC0759Jm0.f("BasicSessionProcessor");
        int andIncrement = this.u.getAndIncrement();
        C4409in c4409in = new C4409in(2);
        c4409in.c(this.n.getId());
        if (this.p != null) {
            c4409in.c(this.p.a);
        }
        c4409in.a = 1;
        n(c4409in);
        o(c4409in);
        G10 g10 = new G10(28);
        c1562Tu0.L(new H30(g10, 7, c1562Tu0));
        C1016Mu0 c1016Mu0X = g10.x();
        for (C0572Hc c0572Hc : ((C0873Ky0) c1016Mu0X.getConfig()).u()) {
            c4409in.g(c0572Hc.c, ((C0873Ky0) c1016Mu0X.getConfig()).w(c0572Hc));
        }
        C4219hn c4219hn = this.s;
        C7793wR0 c7793wR0E = c4409in.e();
        C4332iN c4332iN = new C4332iN(vy, andIncrement, c6974s81);
        c4219hn.getClass();
        c4219hn.e(Arrays.asList(c7793wR0E), c4332iN);
        return andIncrement;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void m() {
        this.s.d();
    }

    public final void n(C4409in c4409in) {
        synchronized (this.e) {
            try {
                for (CaptureRequest.Key key : this.v.keySet()) {
                    Object obj = this.v.get(key);
                    if (obj != null) {
                        c4409in.g(key, obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(C4409in c4409in) {
        CaptureStageImpl captureStage = this.i.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                c4409in.g((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    public final void q(C4219hn c4219hn, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CaptureStageImpl captureStageImpl = (CaptureStageImpl) it.next();
            C4409in c4409in = new C4409in(2);
            c4409in.c(this.n.getId());
            if (this.p != null) {
                c4409in.c(this.p.getId());
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                c4409in.g((CaptureRequest.Key) pair.first, pair.second);
            }
            c4409in.j(1);
            arrayList2.add(c4409in.e());
        }
        c4219hn.e(arrayList2, new C0084Av0(8));
    }

    public final void r(int i, InterfaceC3415dZ0 interfaceC3415dZ0) {
        if (this.s == null) {
            AbstractC0759Jm0.f("BasicSessionProcessor");
            return;
        }
        C4409in c4409in = new C4409in(2);
        c4409in.c(this.n.getId());
        if (this.p != null) {
            c4409in.c(this.p.a);
        }
        c4409in.a = 1;
        n(c4409in);
        o(c4409in);
        d dVar = new d(this, interfaceC3415dZ0, i);
        AbstractC0759Jm0.f("BasicSessionProcessor");
        this.s.c(c4409in.e(), dVar);
    }
}
