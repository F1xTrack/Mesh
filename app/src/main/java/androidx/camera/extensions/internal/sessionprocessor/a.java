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
import defpackage.AbstractC0759Jm0;
import defpackage.AbstractC3837fn;
import defpackage.AbstractC3987gZ0;
import defpackage.C0390Et0;
import defpackage.C0572Hc;
import defpackage.C0873Ky0;
import defpackage.C1016Mu0;
import defpackage.C1562Tu0;
import defpackage.C1591Ue;
import defpackage.C3456dn;
import defpackage.C3664et;
import defpackage.C3796fZ0;
import defpackage.C3810fe;
import defpackage.C4001ge;
import defpackage.C4037gq;
import defpackage.C4219hn;
import defpackage.C4409in;
import defpackage.C6974s81;
import defpackage.C7529v3;
import defpackage.F91;
import defpackage.G10;
import defpackage.H30;
import defpackage.InterfaceC3415dZ0;
import defpackage.InterfaceC3712f70;
import defpackage.InterfaceC5634l70;
import defpackage.MR;
import defpackage.SR0;
import defpackage.VY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends AbstractC3987gZ0 {
    public final SessionProcessorImpl h;
    public final C7529v3 i;
    public final Context j;
    public final int k;
    public final C0390Et0 l;
    public boolean m;
    public final C0390Et0 n;
    public final AdvancedSessionProcessor$ExtensionMetadataMonitor o;
    public final boolean p;

    public a(SessionProcessorImpl sessionProcessorImpl, List list, C7529v3 c7529v3, Context context, int i) {
        super(list);
        boolean zContains = false;
        this.m = false;
        new HashMap();
        this.h = sessionProcessorImpl;
        this.i = c7529v3;
        this.j = context;
        this.p = F91.o(c7529v3);
        this.k = i;
        C1591Ue c1591Ue = C1591Ue.i;
        C0390Et0 c0390Et0 = (!C3664et.d(c1591Ue) || !MR.h(c1591Ue) || Build.VERSION.SDK_INT < 34) ? false : c7529v3.d().contains(CaptureResult.EXTENSION_CURRENT_TYPE) ? new C0390Et0(Integer.valueOf(i)) : null;
        this.l = c0390Et0;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue) && Build.VERSION.SDK_INT >= 34) {
            zContains = c7529v3.k().contains(CaptureRequest.EXTENSION_STRENGTH);
        }
        C0390Et0 c0390Et02 = zContains ? new C0390Et0(100) : null;
        this.n = c0390Et02;
        if (c0390Et0 == null && c0390Et02 == null) {
            this.o = null;
        } else {
            this.o = new AdvancedSessionProcessor$ExtensionMetadataMonitor(c0390Et0, c0390Et02);
        }
    }

    public static HashMap n(C1562Tu0 c1562Tu0) {
        HashMap map = new HashMap();
        G10 g10 = new G10(28);
        c1562Tu0.L(new H30(g10, 7, c1562Tu0));
        C1016Mu0 c1016Mu0X = g10.x();
        for (C0572Hc c0572Hc : ((C0873Ky0) c1016Mu0X.getConfig()).u()) {
            map.put(c0572Hc.c, ((C0873Ky0) c1016Mu0X.getConfig()).w(c0572Hc));
        }
        return map;
    }

    public static C4409in o(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        C4409in c4409in = new C4409in(1);
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            c4409in.a(AbstractC3837fn.a((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            c4409in.b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        c4409in.h(camera2SessionConfigImpl.getSessionTemplateId());
        C1591Ue c1591Ue = C1591Ue.i;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType == -1) {
                    sessionType = 0;
                }
                c4409in.i(sessionType);
            } catch (NoSuchMethodError unused) {
                c4409in.i(0);
            }
        }
        return c4409in.d();
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void b() {
        synchronized (this.e) {
            new HashMap();
        }
        this.h.deInitSession();
    }

    @Override // defpackage.AbstractC3987gZ0
    public final Map c(Size size) {
        return this.i.l(size);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final C4409in e(String str, LinkedHashMap linkedHashMap, final C4001ge c4001ge) {
        C1591Ue c1591Ue = C1591Ue.i;
        Camera2SessionConfigImpl camera2SessionConfigImplInitSession = (C3664et.d(c1591Ue) && MR.h(c1591Ue)) ? this.h.initSession(str, linkedHashMap, this.j, new OutputSurfaceConfigurationImpl(c4001ge) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter
            private final OutputSurfaceImpl mAnalysisOutputSurface;
            private final OutputSurfaceImpl mCaptureOutputSurface;
            private final OutputSurfaceImpl mPostviewOutputSurface;
            private final OutputSurfaceImpl mPreviewOutputSurface;

            {
                C4001ge c4001ge2 = (C4001ge) c4001ge;
                this.mPreviewOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4001ge2.a);
                this.mCaptureOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4001ge2.b);
                C3810fe c3810fe = c4001ge2.c;
                this.mAnalysisOutputSurface = c3810fe != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c3810fe) : null;
                C3810fe c3810fe2 = c4001ge2.d;
                this.mPostviewOutputSurface = c3810fe2 != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c3810fe2) : null;
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
            camera2SessionConfigImplInitSession = this.h.initSession(str, linkedHashMap, this.j, new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4001ge.d()), new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4001ge.b()), c4001ge.a() != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(c4001ge.a()) : null);
        }
        this.m = c4001ge.c() != null;
        C0390Et0 c0390Et0 = this.l;
        if (c0390Et0 != null) {
            c0390Et0.k(Integer.valueOf(this.k));
        }
        C0390Et0 c0390Et02 = this.n;
        if (c0390Et02 != null) {
            c0390Et02.k(100);
        }
        return o(camera2SessionConfigImplInitSession);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void f() {
        this.h.onCaptureSessionEnd();
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void g(final C4219hn c4219hn) {
        this.h.onCaptureSessionStart(new RequestProcessorImpl(c4219hn) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$RequestProcessorImplAdapter
            private final SR0 mRequestProcessor;

            {
                this.mRequestProcessor = c4219hn;
            }

            public void abortCaptures() {
                C4037gq c4037gq;
                C4219hn c4219hn2 = (C4219hn) this.mRequestProcessor;
                synchronized (c4219hn2.a) {
                    try {
                        if (!c4219hn2.d && (c4037gq = c4219hn2.b) != null) {
                            c4037gq.i();
                        }
                    } finally {
                    }
                }
            }

            public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
                this.this$0.h(i, new InterfaceC3712f70(imageProcessorImpl) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageProcessorAdapter
                    private final ImageProcessorImpl mImpl;

                    {
                        this.mImpl = imageProcessorImpl;
                    }

                    @Override // defpackage.InterfaceC3712f70
                    public void onNextImageAvailable(int i2, long j, final InterfaceC5634l70 interfaceC5634l70, String str) {
                        this.mImpl.onNextImageAvailable(i2, j, new ImageReferenceImpl(interfaceC5634l70) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageReferenceImplAdapter
                            private final InterfaceC5634l70 mImageReference;

                            {
                                this.mImageReference = interfaceC5634l70;
                            }

                            public boolean decrement() {
                                return ((C3796fZ0) this.mImageReference).a();
                            }

                            public Image get() {
                                return ((C3796fZ0) this.mImageReference).b;
                            }

                            public boolean increment() {
                                C3796fZ0 c3796fZ0 = (C3796fZ0) this.mImageReference;
                                synchronized (c3796fZ0.c) {
                                    try {
                                        int i3 = c3796fZ0.a;
                                        if (i3 <= 0) {
                                            return false;
                                        }
                                        c3796fZ0.a = i3 + 1;
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
                return ((C4219hn) this.mRequestProcessor).c(new AdvancedSessionProcessor$RequestAdapter(request), new AdvancedSessionProcessor$CallbackAdapter(callback));
            }

            public void stopRepeating() {
                ((C4219hn) this.mRequestProcessor).d();
            }

            public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
                SR0 sr0 = this.mRequestProcessor;
                AdvancedSessionProcessor$RequestAdapter advancedSessionProcessor$RequestAdapter = new AdvancedSessionProcessor$RequestAdapter(request);
                AdvancedSessionProcessor$CallbackAdapter advancedSessionProcessor$CallbackAdapter = new AdvancedSessionProcessor$CallbackAdapter(callback);
                C4219hn c4219hn2 = (C4219hn) sr0;
                c4219hn2.getClass();
                return c4219hn2.e(Arrays.asList(advancedSessionProcessor$RequestAdapter), advancedSessionProcessor$CallbackAdapter);
            }

            public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
                ArrayList arrayList = new ArrayList();
                Iterator<RequestProcessorImpl.Request> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AdvancedSessionProcessor$RequestAdapter(it.next()));
                }
                return ((C4219hn) this.mRequestProcessor).e(arrayList, new AdvancedSessionProcessor$CallbackAdapter(callback));
            }
        });
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void i(C3456dn c3456dn) {
        HashMap mapN;
        synchronized (this.e) {
            try {
                mapN = n(c3456dn);
                if (this.g != -1 && Build.VERSION.SDK_INT >= 34) {
                    mapN.put(CaptureRequest.EXTENSION_STRENGTH, Integer.valueOf(this.g));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h.setParameters(mapN);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int j(boolean z, C6974s81 c6974s81, VY vy) {
        AbstractC0759Jm0.a("AdvancedSessionProcessor");
        AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter = new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(vy, c6974s81, this.p);
        C1591Ue c1591Ue = C1591Ue.i;
        return (C3664et.d(c1591Ue) && MR.h(c1591Ue) && this.m && z && this.i.i()) ? this.h.startCaptureWithPostview(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter) : this.h.startCapture(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int k(C6974s81 c6974s81, InterfaceC3415dZ0 interfaceC3415dZ0) {
        AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.e) {
            advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter = new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(interfaceC3415dZ0, c6974s81, this.o, this.p);
        }
        return this.h.startRepeating(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // defpackage.AbstractC3987gZ0
    public final int l(C1562Tu0 c1562Tu0, C6974s81 c6974s81, VY vy) {
        HashMap mapN = n(c1562Tu0);
        C1591Ue c1591Ue = C1591Ue.h;
        if (C3664et.d(c1591Ue) && MR.h(c1591Ue)) {
            return this.h.startTrigger(mapN, new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(vy, c6974s81, this.p));
        }
        return -1;
    }

    @Override // defpackage.AbstractC3987gZ0
    public final void m() {
        this.h.stopRepeating();
        synchronized (this.e) {
        }
    }
}
