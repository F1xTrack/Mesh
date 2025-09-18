package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0783MR;
import p000.AbstractC4075fn;
import p000.AbstractC7806Jm0;
import p000.AbstractC9513gZ0;
import p000.C0480Hc;
import p000.C10996s81;
import p000.C1299Ue;
import p000.C1356VY;
import p000.C3950dn;
import p000.C4018et;
import p000.C4066fe;
import p000.C4129ge;
import p000.C4141gq;
import p000.C4201hn;
import p000.C4264in;
import p000.C6988v3;
import p000.C7560Et0;
import p000.C7882Ky0;
import p000.C7978Mu0;
import p000.C8342Tu0;
import p000.C9385fZ0;
import p000.F91;
import p000.G10;
import p000.H30;
import p000.InterfaceC10097l70;
import p000.InterfaceC9129dZ0;
import p000.InterfaceC9329f70;
import p000.SR0;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.a */
/* loaded from: classes.dex */
public final class C1696a extends AbstractC9513gZ0 {

    /* renamed from: h */
    public final SessionProcessorImpl f15968h;

    /* renamed from: i */
    public final C6988v3 f15969i;

    /* renamed from: j */
    public final Context f15970j;

    /* renamed from: k */
    public final int f15971k;

    /* renamed from: l */
    public final C7560Et0 f15972l;

    /* renamed from: m */
    public boolean f15973m;

    /* renamed from: n */
    public final C7560Et0 f15974n;

    /* renamed from: o */
    public final AdvancedSessionProcessor$ExtensionMetadataMonitor f15975o;

    /* renamed from: p */
    public final boolean f15976p;

    public C1696a(SessionProcessorImpl sessionProcessorImpl, List list, C6988v3 c6988v3, Context context, int i) {
        super(list);
        boolean zContains = false;
        this.f15973m = false;
        new HashMap();
        this.f15968h = sessionProcessorImpl;
        this.f15969i = c6988v3;
        this.f15970j = context;
        this.f15976p = F91.m2532o(c6988v3);
        this.f15971k = i;
        C1299Ue c1299Ue = C1299Ue.f11948i;
        C7560Et0 c7560Et0 = (!C4018et.m18064d(c1299Ue) || !AbstractC0783MR.m5368h(c1299Ue) || Build.VERSION.SDK_INT < 34) ? false : c6988v3.mo294d().contains(CaptureResult.EXTENSION_CURRENT_TYPE) ? new C7560Et0(Integer.valueOf(i)) : null;
        this.f15972l = c7560Et0;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue) && Build.VERSION.SDK_INT >= 34) {
            zContains = c6988v3.m25312k().contains(CaptureRequest.EXTENSION_STRENGTH);
        }
        C7560Et0 c7560Et02 = zContains ? new C7560Et0(100) : null;
        this.f15974n = c7560Et02;
        if (c7560Et0 == null && c7560Et02 == null) {
            this.f15975o = null;
        } else {
            this.f15975o = new AdvancedSessionProcessor$ExtensionMetadataMonitor(c7560Et0, c7560Et02);
        }
    }

    /* renamed from: n */
    public static HashMap m9908n(C8342Tu0 c8342Tu0) {
        HashMap map = new HashMap();
        G10 g10 = new G10(28);
        c8342Tu0.mo4789L(new H30(g10, 7, c8342Tu0));
        C7978Mu0 c7978Mu0M2908x = g10.m2908x();
        for (C0480Hc c0480Hc : ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4793u()) {
            map.put(c0480Hc.f4364c, ((C7882Ky0) c7978Mu0M2908x.getConfig()).mo4794w(c0480Hc));
        }
        return map;
    }

    /* renamed from: o */
    public static C4264in m9909o(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        C4264in c4264in = new C4264in(1);
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            c4264in.m19091a(AbstractC4075fn.m18292a((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            c4264in.m19092b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        c4264in.m19098h(camera2SessionConfigImpl.getSessionTemplateId());
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                c4264in.m19099i(sessionType);
            } catch (NoSuchMethodError unused) {
                c4264in.m19099i(0);
            }
        }
        return c4264in.m19094d();
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: b */
    public final void mo9910b() {
        synchronized (this.f27846e) {
            new HashMap();
        }
        this.f15968h.deInitSession();
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: c */
    public final Map mo9911c(Size size) {
        return this.f15969i.m25313l(size);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: e */
    public final C4264in mo9912e(String str, LinkedHashMap linkedHashMap, final C4129ge c4129ge) {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        Camera2SessionConfigImpl camera2SessionConfigImplInitSession = (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) ? this.f15968h.initSession(str, linkedHashMap, this.f15970j, new OutputSurfaceConfigurationImpl(c4129ge) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter
            private final OutputSurfaceImpl mAnalysisOutputSurface;
            private final OutputSurfaceImpl mCaptureOutputSurface;
            private final OutputSurfaceImpl mPostviewOutputSurface;
            private final OutputSurfaceImpl mPreviewOutputSurface;

            {
                C4129ge c4129ge2 = (C4129ge) c4129ge;
                this.mPreviewOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4129ge2.f27897a);
                this.mCaptureOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4129ge2.f27898b);
                C4066fe c4066fe = c4129ge2.f27899c;
                this.mAnalysisOutputSurface = c4066fe != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4066fe) : null;
                C4066fe c4066fe2 = c4129ge2.f27900d;
                this.mPostviewOutputSurface = c4066fe2 != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4066fe2) : null;
            }

            public OutputSurfaceImpl getImageAnalysisOutputSurface() {
                return this.mAnalysisOutputSurface;
            }

            public OutputSurfaceImpl getImageCaptureOutputSurface() {
                return this.mCaptureOutputSurface;
            }

            public OutputSurfaceImpl getPostviewOutputSurface() {
                return this.mPostviewOutputSurface;
            }

            public OutputSurfaceImpl getPreviewOutputSurface() {
                return this.mPreviewOutputSurface;
            }
        }) : null;
        if (camera2SessionConfigImplInitSession == null) {
            camera2SessionConfigImplInitSession = this.f15968h.initSession(str, linkedHashMap, this.f15970j, new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4129ge.m18594d()), new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4129ge.m18592b()), c4129ge.m18591a() != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4129ge.m18591a()) : null);
        }
        this.f15973m = c4129ge.m18593c() != null;
        C7560Et0 c7560Et0 = this.f15972l;
        if (c7560Et0 != null) {
            c7560Et0.m2440k(Integer.valueOf(this.f15971k));
        }
        C7560Et0 c7560Et02 = this.f15974n;
        if (c7560Et02 != null) {
            c7560Et02.m2440k(100);
        }
        return m9909o(camera2SessionConfigImplInitSession);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: f */
    public final void mo9913f() {
        this.f15968h.onCaptureSessionEnd();
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: g */
    public final void mo9914g(final C4201hn c4201hn) {
        this.f15968h.onCaptureSessionStart(new RequestProcessorImpl(c4201hn) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$RequestProcessorImplAdapter
            private final SR0 mRequestProcessor;

            {
                this.mRequestProcessor = c4201hn;
            }

            public void abortCaptures() {
                C4141gq c4141gq;
                C4201hn c4201hn2 = (C4201hn) this.mRequestProcessor;
                synchronized (c4201hn2.f28579a) {
                    try {
                        if (!c4201hn2.f28582d && (c4141gq = c4201hn2.f28580b) != null) {
                            c4141gq.m18656i();
                        }
                    } finally {
                    }
                }
            }

            public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
                this.this$0.m18579h(i, new InterfaceC9329f70(imageProcessorImpl) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageProcessorAdapter
                    private final ImageProcessorImpl mImpl;

                    {
                        this.mImpl = imageProcessorImpl;
                    }

                    @Override // p000.InterfaceC9329f70
                    public void onNextImageAvailable(int i2, long j, final InterfaceC10097l70 interfaceC10097l70, String str) {
                        this.mImpl.onNextImageAvailable(i2, j, new ImageReferenceImpl(interfaceC10097l70) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageReferenceImplAdapter
                            private final InterfaceC10097l70 mImageReference;

                            {
                                this.mImageReference = interfaceC10097l70;
                            }

                            public boolean decrement() {
                                return ((C9385fZ0) this.mImageReference).m18258a();
                            }

                            public Image get() {
                                return ((C9385fZ0) this.mImageReference).f27236b;
                            }

                            public boolean increment() {
                                C9385fZ0 c9385fZ0 = (C9385fZ0) this.mImageReference;
                                synchronized (c9385fZ0.f27237c) {
                                    try {
                                        int i3 = c9385fZ0.f27235a;
                                        if (i3 <= 0) {
                                            return false;
                                        }
                                        c9385fZ0.f27235a = i3 + 1;
                                        return true;
                                    } finally {
                                    }
                                }
                            }
                        }, str);
                    }
                });
            }

            public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
                return ((C4201hn) this.mRequestProcessor).m18877c(new AdvancedSessionProcessor$RequestAdapter(request), new AdvancedSessionProcessor$CallbackAdapter(callback));
            }

            public void stopRepeating() {
                ((C4201hn) this.mRequestProcessor).m18878d();
            }

            public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
                SR0 sr0 = this.mRequestProcessor;
                AdvancedSessionProcessor$RequestAdapter advancedSessionProcessor$RequestAdapter = new AdvancedSessionProcessor$RequestAdapter(request);
                AdvancedSessionProcessor$CallbackAdapter advancedSessionProcessor$CallbackAdapter = new AdvancedSessionProcessor$CallbackAdapter(callback);
                C4201hn c4201hn2 = (C4201hn) sr0;
                c4201hn2.getClass();
                return c4201hn2.m18879e(Arrays.asList(advancedSessionProcessor$RequestAdapter), advancedSessionProcessor$CallbackAdapter);
            }

            public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
                ArrayList arrayList = new ArrayList();
                Iterator<RequestProcessorImpl.Request> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AdvancedSessionProcessor$RequestAdapter(it.next()));
                }
                return ((C4201hn) this.mRequestProcessor).m18879e(arrayList, new AdvancedSessionProcessor$CallbackAdapter(callback));
            }
        });
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: i */
    public final void mo9915i(C3950dn c3950dn) {
        HashMap mapM9908n;
        synchronized (this.f27846e) {
            try {
                mapM9908n = m9908n(c3950dn);
                if (this.f27848g != -1 && Build.VERSION.SDK_INT >= 34) {
                    mapM9908n.put(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(this.f27848g));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15968h.setParameters(mapM9908n);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: j */
    public final int mo9916j(boolean z, C10996s81 c10996s81, C1356VY c1356vy) {
        AbstractC7806Jm0.m4407a("AdvancedSessionProcessor");
        C1692xa6b766a6 c1692xa6b766a6 = new C1692xa6b766a6(c1356vy, c10996s81, this.f15976p);
        C1299Ue c1299Ue = C1299Ue.f11948i;
        return (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue) && this.f15973m && z && this.f15969i.mo299i()) ? this.f15968h.startCaptureWithPostview(c1692xa6b766a6) : this.f15968h.startCapture(c1692xa6b766a6);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: k */
    public final int mo9917k(C10996s81 c10996s81, InterfaceC9129dZ0 interfaceC9129dZ0) {
        C1692xa6b766a6 c1692xa6b766a6;
        synchronized (this.f27846e) {
            c1692xa6b766a6 = new C1692xa6b766a6(interfaceC9129dZ0, c10996s81, this.f15975o, this.f15976p);
        }
        return this.f15968h.startRepeating(c1692xa6b766a6);
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: l */
    public final int mo9918l(C8342Tu0 c8342Tu0, C10996s81 c10996s81, C1356VY c1356vy) {
        HashMap mapM9908n = m9908n(c8342Tu0);
        C1299Ue c1299Ue = C1299Ue.f11947h;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            return this.f15968h.startTrigger(mapM9908n, new C1692xa6b766a6(c1356vy, c10996s81, this.f15976p));
        }
        return -1;
    }

    @Override // p000.AbstractC9513gZ0
    /* renamed from: m */
    public final void mo9919m() {
        this.f15968h.stopRepeating();
        synchronized (this.f27846e) {
        }
    }
}
