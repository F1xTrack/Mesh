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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0783MR;
import p000.AbstractC6878tJ;
import p000.AbstractC7806Jm0;
import p000.AbstractC9104dM1;
import p000.AbstractC9513gZ0;
import p000.AbstractC9821iz0;
import p000.C0480Hc;
import p000.C0608Je;
import p000.C0848NT;
import p000.C0858Nd;
import p000.C10996s81;
import p000.C11544wR0;
import p000.C1175Sg;
import p000.C1299Ue;
import p000.C1356VY;
import p000.C3950dn;
import p000.C4018et;
import p000.C4129ge;
import p000.C4201hn;
import p000.C4238iN;
import p000.C4264in;
import p000.C7356Av0;
import p000.C7882Ky0;
import p000.C7978Mu0;
import p000.C8342Tu0;
import p000.C9072d61;
import p000.F91;
import p000.G10;
import p000.H30;
import p000.InterfaceC4012en;
import p000.InterfaceC9129dZ0;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.h */
/* loaded from: classes.dex */
public final class C1703h extends AbstractC9513gZ0 {

    /* renamed from: B */
    public static final AtomicInteger f15996B = new AtomicInteger(0);

    /* renamed from: A */
    public final boolean f15997A;

    /* renamed from: h */
    public final Context f15998h;

    /* renamed from: i */
    public final PreviewExtenderImpl f15999i;

    /* renamed from: j */
    public final ImageCaptureExtenderImpl f16000j;

    /* renamed from: k */
    public volatile StillCaptureProcessor f16001k;

    /* renamed from: l */
    public volatile PreviewProcessor f16002l;

    /* renamed from: m */
    public volatile RequestUpdateProcessorImpl f16003m;

    /* renamed from: n */
    public volatile InterfaceC4012en f16004n;

    /* renamed from: o */
    public volatile InterfaceC4012en f16005o;

    /* renamed from: p */
    public volatile C0608Je f16006p;

    /* renamed from: q */
    public volatile AbstractC9821iz0 f16007q;

    /* renamed from: r */
    public volatile AbstractC9821iz0 f16008r;

    /* renamed from: s */
    public volatile C4201hn f16009s;

    /* renamed from: t */
    public volatile boolean f16010t;

    /* renamed from: u */
    public final AtomicInteger f16011u;

    /* renamed from: v */
    public final LinkedHashMap f16012v;

    /* renamed from: w */
    public final HashMap f16013w;

    /* renamed from: x */
    public final C9072d61 f16014x;

    /* renamed from: y */
    public AbstractC9821iz0 f16015y;

    /* renamed from: z */
    public final C1175Sg f16016z;

    public C1703h(PreviewExtenderImpl previewExtenderImpl, ImageCaptureExtenderImpl imageCaptureExtenderImpl, List list, C1175Sg c1175Sg, Context context) {
        super(list);
        this.f16001k = null;
        this.f16002l = null;
        this.f16003m = null;
        this.f16006p = null;
        this.f16010t = false;
        this.f16011u = new AtomicInteger(0);
        this.f16012v = new LinkedHashMap();
        this.f16013w = new HashMap();
        boolean z = AbstractC6878tJ.f42992a.m17864z0(CrashWhenOnDisableTooSoon.class) != null;
        C9072d61 c9072d61 = new C9072d61();
        c9072d61.f25817b = 0L;
        c9072d61.f25816a = z;
        this.f16014x = c9072d61;
        this.f15999i = previewExtenderImpl;
        this.f16000j = imageCaptureExtenderImpl;
        this.f15998h = context;
        this.f16016z = c1175Sg;
        this.f15997A = F91.m2532o(c1175Sg);
    }

    /* renamed from: p */
    public static HashMap m9920p(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((CaptureResult.Key) pair.first, pair.second);
        }
        return map;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: b */
    public final void mo9910b() {
        if (this.f16002l != null) {
            this.f16002l.close();
            this.f16002l = null;
        }
        if (this.f16001k != null) {
            this.f16001k.close();
            this.f16001k = null;
        }
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        this.f15999i.onDeInit();
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        this.f16000j.onDeInit();
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: c */
    public final Map mo9911c(Size size) {
        return this.f16016z.m7416l(size);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: e */
    public final C4264in mo9912e(String str, LinkedHashMap linkedHashMap, C4129ge c4129ge) {
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        this.f15999i.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.f15998h);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        this.f16000j.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.f15998h);
        this.f16007q = c4129ge.m18594d();
        this.f16008r = c4129ge.m18592b();
        this.f16015y = c4129ge.m18593c();
        PreviewExtenderImpl.ProcessorType processorType = this.f15999i.getProcessorType();
        Objects.toString(processorType);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.f16004n = C0858Nd.m5789e(f15996B.getAndIncrement(), this.f16007q.mo18264b(), 2);
            this.f16002l = new PreviewProcessor(this.f15999i.getProcessor(), this.f16007q.mo18265c(), this.f16007q.mo18264b());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.f16004n = C0608Je.m4379e(f15996B.getAndIncrement(), this.f16007q.mo18265c());
            this.f16003m = this.f15999i.getProcessor();
        } else {
            this.f16004n = C0608Je.m4379e(f15996B.getAndIncrement(), this.f16007q.mo18265c());
        }
        CaptureProcessorImpl captureProcessor = this.f16000j.getCaptureProcessor();
        Objects.toString(captureProcessor);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureProcessor != null) {
            this.f16005o = C0858Nd.m5789e(f15996B.getAndIncrement(), this.f16008r.mo18264b(), this.f16000j.getMaxCaptureStage());
            this.f16001k = new StillCaptureProcessor(captureProcessor, this.f16008r.mo18265c(), this.f16008r.mo18264b(), this.f16015y, !this.f15997A);
        } else {
            this.f16005o = C0608Je.m4379e(f15996B.getAndIncrement(), this.f16008r.mo18265c());
        }
        if (c4129ge.m18591a() != null) {
            this.f16006p = C0608Je.m4379e(f15996B.getAndIncrement(), c4129ge.m18591a().mo18265c());
        }
        C4264in c4264in = new C4264in(1);
        c4264in.m19091a(this.f16004n);
        c4264in.m19091a(this.f16005o);
        c4264in.m19098h(1);
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            int iOnSessionType = this.f15999i.onSessionType();
            AbstractC9104dM1.m17545d("Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl", iOnSessionType == this.f16000j.onSessionType());
            if (iOnSessionType == -1) {
                iOnSessionType = 0;
            }
            c4264in.m19099i(iOnSessionType);
        }
        if (this.f16006p != null) {
            c4264in.m19091a(this.f16006p);
        }
        CaptureStageImpl captureStageImplOnPresetSession = this.f15999i.onPresetSession();
        Objects.toString(captureStageImplOnPresetSession);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        CaptureStageImpl captureStageImplOnPresetSession2 = this.f16000j.onPresetSession();
        Objects.toString(captureStageImplOnPresetSession2);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureStageImplOnPresetSession != null && captureStageImplOnPresetSession.getParameters() != null) {
            for (Pair pair : captureStageImplOnPresetSession.getParameters()) {
                c4264in.m19092b((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (captureStageImplOnPresetSession2 != null && captureStageImplOnPresetSession2.getParameters() != null) {
            for (Pair pair2 : captureStageImplOnPresetSession2.getParameters()) {
                c4264in.m19092b((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return c4264in.m19094d();
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: f */
    public final void mo9913f() throws InterruptedException {
        this.f16014x.m17493a();
        if (this.f16002l != null) {
            this.f16002l.pause();
        }
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnDisableSession = this.f15999i.onDisableSession();
        Objects.toString(captureStageImplOnDisableSession);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureStageImplOnDisableSession != null) {
            arrayList.add(captureStageImplOnDisableSession);
        }
        CaptureStageImpl captureStageImplOnDisableSession2 = this.f16000j.onDisableSession();
        Objects.toString(captureStageImplOnDisableSession2);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureStageImplOnDisableSession2 != null) {
            arrayList.add(captureStageImplOnDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            m9923q(this.f16009s, arrayList);
        }
        this.f16009s = null;
        this.f16010t = false;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: g */
    public final void mo9914g(C4201hn c4201hn) {
        this.f16009s = c4201hn;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl captureStageImplOnEnableSession = this.f15999i.onEnableSession();
        Objects.toString(captureStageImplOnEnableSession);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureStageImplOnEnableSession != null) {
            arrayList.add(captureStageImplOnEnableSession);
        }
        CaptureStageImpl captureStageImplOnEnableSession2 = this.f16000j.onEnableSession();
        Objects.toString(captureStageImplOnEnableSession2);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (captureStageImplOnEnableSession2 != null) {
            arrayList.add(captureStageImplOnEnableSession2);
        }
        this.f16014x.m17494b();
        if (!arrayList.isEmpty()) {
            m9923q(c4201hn, arrayList);
        }
        if (this.f16002l != null) {
            this.f16002l.resume();
            m18579h(this.f16004n.getId(), new C1698c(this));
        }
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: i */
    public final void mo9915i(C3950dn c3950dn) {
        synchronized (this.f27846e) {
            try {
                HashMap map = new HashMap();
                G10 g10 = new G10(28);
                c3950dn.mo4789L(new H30(g10, 7, c3950dn));
                C7978Mu0 c7978Mu0M2908x = g10.m2908x();
                for (C0480Hc c0480Hc : ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4793u()) {
                    map.put(c0480Hc.f4364c, ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4794w(c0480Hc));
                }
                this.f16012v.clear();
                this.f16012v.putAll(map);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: j */
    public final int mo9916j(boolean z, C10996s81 c10996s81, C1356VY c1356vy) {
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        int andIncrement = this.f16011u.getAndIncrement();
        if (this.f16009s == null || this.f16010t) {
            AbstractC7806Jm0.m4407a("BasicSessionProcessor");
            c1356vy.mo8492d();
            return andIncrement;
        }
        this.f16010t = true;
        ArrayList arrayList = new ArrayList();
        List<CaptureStageImpl> captureStages = this.f16000j.getCaptureStages();
        ArrayList arrayList2 = new ArrayList();
        for (CaptureStageImpl captureStageImpl : captureStages) {
            C4264in c4264in = new C4264in(2);
            c4264in.m19093c(this.f16005o.getId());
            c4264in.m19100j(2);
            c4264in.m19096f(captureStageImpl.getId());
            arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
            m9921n(c4264in);
            m9922o(c4264in);
            for (Pair pair : captureStageImpl.getParameters()) {
                c4264in.m19097g((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(c4264in.m19095e());
        }
        arrayList2.toString();
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        C1700e c1700e = new C1700e(andIncrement, c1356vy, c10996s81, this);
        AbstractC7806Jm0.m4407a("BasicSessionProcessor");
        if (this.f16001k != null) {
            m18579h(this.f16005o.getId(), new C1701f(this, c1356vy, andIncrement));
            this.f16001k.startCapture(z, arrayList2, new C1702g(andIncrement, c1356vy, c10996s81, this));
        }
        this.f16009s.m18879e(arrayList, c1700e);
        return andIncrement;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: k */
    public final int mo9917k(final C10996s81 c10996s81, final InterfaceC9129dZ0 interfaceC9129dZ0) {
        final int andIncrement = this.f16011u.getAndIncrement();
        if (this.f16009s == null) {
            interfaceC9129dZ0.mo8492d();
        } else {
            if (this.f16002l != null) {
                this.f16002l.start(new PreviewProcessor.OnCaptureResultCallback(interfaceC9129dZ0, andIncrement, c10996s81) { // from class: androidx.camera.extensions.internal.sessionprocessor.b

                    /* renamed from: b */
                    public final /* synthetic */ InterfaceC9129dZ0 f15978b;

                    /* renamed from: c */
                    public final /* synthetic */ C10996s81 f15979c;

                    {
                        this.f15979c = c10996s81;
                    }

                    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
                    public final void onCaptureResult(long j, List list) {
                        this.f15977a.getClass();
                        this.f15978b.mo8494f(new C0848NT(j, this.f15979c, C1703h.m9920p(list)));
                    }
                });
            }
            m9924r(andIncrement, interfaceC9129dZ0);
        }
        return andIncrement;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: l */
    public final int mo9918l(C8342Tu0 c8342Tu0, C10996s81 c10996s81, C1356VY c1356vy) {
        AbstractC7806Jm0.m4412f("BasicSessionProcessor");
        int andIncrement = this.f16011u.getAndIncrement();
        C4264in c4264in = new C4264in(2);
        c4264in.m19093c(this.f16004n.getId());
        if (this.f16006p != null) {
            c4264in.m19093c(this.f16006p.f5654a);
        }
        c4264in.f29447a = 1;
        m9921n(c4264in);
        m9922o(c4264in);
        G10 g10 = new G10(28);
        c8342Tu0.mo4789L(new H30(g10, 7, c8342Tu0));
        C7978Mu0 c7978Mu0M2908x = g10.m2908x();
        for (C0480Hc c0480Hc : ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4793u()) {
            c4264in.m19097g(c0480Hc.f4364c, ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4794w(c0480Hc));
        }
        C4201hn c4201hn = this.f16009s;
        C11544wR0 c11544wR0M19095e = c4264in.m19095e();
        C4238iN c4238iN = new C4238iN(c1356vy, andIncrement, c10996s81);
        c4201hn.getClass();
        c4201hn.m18879e(Arrays.asList(c11544wR0M19095e), c4238iN);
        return andIncrement;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: m */
    public final void mo9919m() {
        this.f16009s.m18878d();
    }

    /* renamed from: n */
    public final void m9921n(C4264in c4264in) {
        synchronized (this.f27846e) {
            try {
                for (CaptureRequest.Key key : this.f16012v.keySet()) {
                    Object obj = this.f16012v.get(key);
                    if (obj != null) {
                        c4264in.m19097g(key, obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m9922o(C4264in c4264in) {
        CaptureStageImpl captureStage = this.f15999i.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                c4264in.m19097g((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    /* renamed from: q */
    public final void m9923q(C4201hn c4201hn, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CaptureStageImpl captureStageImpl = (CaptureStageImpl) it.next();
            C4264in c4264in = new C4264in(2);
            c4264in.m19093c(this.f16004n.getId());
            if (this.f16006p != null) {
                c4264in.m19093c(this.f16006p.getId());
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                c4264in.m19097g((CaptureRequest.Key) pair.first, pair.second);
            }
            c4264in.m19100j(1);
            arrayList2.add(c4264in.m19095e());
        }
        c4201hn.m18879e(arrayList2, new C7356Av0(8));
    }

    /* renamed from: r */
    public final void m9924r(int i, InterfaceC9129dZ0 interfaceC9129dZ0) {
        if (this.f16009s == null) {
            AbstractC7806Jm0.m4412f("BasicSessionProcessor");
            return;
        }
        C4264in c4264in = new C4264in(2);
        c4264in.m19093c(this.f16004n.getId());
        if (this.f16006p != null) {
            c4264in.m19093c(this.f16006p.f5654a);
        }
        c4264in.f29447a = 1;
        m9921n(c4264in);
        m9922o(c4264in);
        C1699d c1699d = new C1699d(this, interfaceC9129dZ0, i);
        AbstractC7806Jm0.m4412f("BasicSessionProcessor");
        this.f16009s.m18877c(c4264in.m19095e(), c1699d);
    }
}
