package defpackage;

import android.content.Context;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.yandex.metrica.impl.ob.C2913m;
import com.yandex.metrica.impl.ob.C2963o;
import com.yandex.metrica.impl.ob.C2988p;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import com.yandex.metrica.impl.ob.InterfaceC3062s;
import com.yandex.metrica.impl.ob.InterfaceC3087t;
import com.yandex.metrica.impl.ob.InterfaceC3112u;
import com.yandex.metrica.impl.ob.InterfaceC3137v;
import com.yandex.metrica.impl.ob.r;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: Hj */
/* loaded from: classes.dex */
public final class C0593Hj implements Provider, InterfaceC4347iS, r, InterfaceC3013q {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public /* synthetic */ C0593Hj() {
        this.a = 1;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public synchronized void a(C2988p c2988p) {
        this.b = c2988p;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public void b() {
        C2988p c2988p = (C2988p) this.b;
        if (c2988p != null) {
            ((Executor) this.e).execute(new C5359jh(this, 3, c2988p));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public Executor c() {
        return (Executor) this.e;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3087t d() {
        return (InterfaceC3087t) this.f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3062s e() {
        return (C2913m) this.g;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3137v f() {
        return (C2963o) this.h;
    }

    public void g() {
        ((C3513e41) this.h).w0();
        try {
            O90.e(R81.a(new CallableC0437Fj(0, this), (ExecutorService) this.f), "{\n      Task.call(\n     …     writeExecutor)\n    }");
        } catch (Exception e) {
            AbstractC3393dS.t("Failed to schedule disk-cache clear", new Object[0]);
            R81.b(e);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 2:
                return new C5705lV((MU) ((G10) this.b).get(), (InterfaceC3739fG0) ((C1562Tu0) this.c).get(), (XU) ((C1016Mu0) this.d).get(), (InterfaceC3739fG0) ((C1304Qm0) this.e).get(), (RemoteConfigManager) ((C5396jt0) this.f).get(), (C0943Lw) ((C1538Tm0) this.g).get(), (SessionManager) ((C0084Av0) this.h).get());
            default:
                return new C1911Yg1((Context) ((C0552Gv0) this.b).a, (C0618Hr0) ((Provider) this.c).get(), (PP) ((Provider) this.d).get(), (C1349Rb0) ((C1857Xo1) this.e).get(), (Executor) ((Provider) this.f).get(), (A71) ((Provider) this.g).get(), new C1538Tm0(23), new C0396Ev0(22), (InterfaceC2217at) ((Provider) this.h).get());
        }
    }

    public boolean h(O01 o01) {
        boolean zE = false;
        C3513e41 c3513e41 = (C3513e41) this.h;
        synchronized (c3513e41) {
            if (((HashMap) c3513e41.b).containsKey(o01)) {
                EncodedImage encodedImage = (EncodedImage) ((HashMap) c3513e41.b).get(o01);
                synchronized (encodedImage) {
                    if (EncodedImage.isValid(encodedImage)) {
                        return true;
                    }
                    ((HashMap) c3513e41.b).remove(o01);
                    AbstractC3393dS.o(C3513e41.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), o01.a, Integer.valueOf(System.identityHashCode(o01)));
                }
            }
            if (((C7771wK) ((InterfaceC5890mT) this.b)).f(o01)) {
                return true;
            }
            EncodedImage encodedImageA0 = ((C3513e41) this.h).A0(o01);
            C0318Dv0 c0318Dv0 = (C0318Dv0) this.g;
            if (encodedImageA0 != null) {
                encodedImageA0.close();
                AbstractC3393dS.m("Found image for %s in staging area", o01.a, C0593Hj.class);
                c0318Dv0.getClass();
                return true;
            }
            AbstractC3393dS.m("Did not find image for %s in staging area", o01.a, C0593Hj.class);
            c0318Dv0.getClass();
            try {
                zE = ((C7771wK) ((InterfaceC5890mT) this.b)).e(o01);
            } catch (Exception unused) {
            }
            return zE;
        }
    }

    public int i() {
        int iL;
        DV1.a();
        AbstractC3377dM1.i(((MU0) this.c) != null, "The ImageReader is not initialized.");
        MU0 mu0 = (MU0) this.c;
        synchronized (mu0.a) {
            iL = mu0.d.l() - mu0.b;
        }
        return iL;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(defpackage.InterfaceC3903g70 r4) throws java.lang.Exception {
        /*
            r3 = this;
            defpackage.DV1.a()
            java.lang.Object r0 = r3.b
            OD0 r0 = (defpackage.OD0) r0
            java.lang.String r1 = "CaptureNode"
            if (r0 != 0) goto L16
            java.util.Objects.toString(r4)
            defpackage.AbstractC0759Jm0.f(r1)
            r4.close()
            goto La6
        L16:
            K60 r0 = r4.P()
            s81 r0 = r0.b()
            java.lang.Object r2 = r3.b
            OD0 r2 = (defpackage.OD0) r2
            java.lang.String r2 = r2.i
            android.util.ArrayMap r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L35
            defpackage.AbstractC0759Jm0.f(r1)
            r4.close()
            return
        L35:
            defpackage.DV1.a()
            java.lang.Object r0 = r3.f
            le r0 = (defpackage.C5732le) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r1 = r3.b
            OD0 r1 = (defpackage.OD0) r1
            me r2 = new me
            r2.<init>(r1, r4)
            TM r0 = r0.a
            r0.b(r2)
            java.lang.Object r0 = r3.b
            OD0 r0 = (defpackage.OD0) r0
            java.lang.Object r1 = r3.g
            Dc r1 = (defpackage.C0260Dc) r1
            if (r1 == 0) goto L61
            java.util.ArrayList r1 = r1.h
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L61
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 == 0) goto L73
            java.lang.Object r1 = r3.b
            OD0 r1 = (defpackage.OD0) r1
            if (r1 == 0) goto L73
            int r4 = r4.j0()
            Re r1 = r1.b
            r1.b(r4)
        L73:
            r4 = 0
            if (r2 == 0) goto L84
            java.lang.Object r1 = r3.b
            OD0 r1 = (defpackage.OD0) r1
            if (r1 == 0) goto L86
            Re r1 = r1.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L86
        L84:
            r3.b = r4
        L86:
            int r1 = r0.l
            r2 = -1
            if (r1 == r2) goto L90
            r1 = 100
            r0.a(r1)
        L90:
            WR0 r0 = r0.h
            defpackage.DV1.a()
            boolean r1 = r0.g
            if (r1 == 0) goto L9a
            goto La6
        L9a:
            boolean r1 = r0.h
            if (r1 != 0) goto La1
            r0.b()
        La1:
            El r0 = r0.e
            r0.b(r4)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0593Hj.j(g70):void");
    }

    public void k(OD0 od0) {
        DV1.a();
        AbstractC3377dM1.i(od0.j.size() == 1, "only one capture stage is supported.");
        AbstractC3377dM1.i(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.b = od0;
        AbstractC1500Sz1.a(od0.k, new C4332iN(this, od0, false, 9), QR1.a());
    }

    public C7487uq0 l(O01 o01) throws IOException {
        String str = o01.a;
        C0318Dv0 c0318Dv0 = (C0318Dv0) this.g;
        try {
            AbstractC3393dS.m("Disk cache read for %s", str, C0593Hj.class);
            C5699lT c5699lTC = ((C7771wK) ((InterfaceC5890mT) this.b)).c(o01);
            if (c5699lTC == null) {
                AbstractC3393dS.m("Disk cache miss for %s", str, C0593Hj.class);
                c0318Dv0.getClass();
                return null;
            }
            AbstractC3393dS.m("Found entry in disk cache for %s", str, C0593Hj.class);
            c0318Dv0.getClass();
            FileInputStream fileInputStream = new FileInputStream(c5699lTC.a);
            try {
                VH vh = (VH) this.c;
                int length = (int) c5699lTC.a.length();
                vh.getClass();
                C7678vq0 c7678vq0 = new C7678vq0((AbstractC6914rq0) vh.b, length);
                try {
                    ((C1204Pf) vh.c).f(fileInputStream, c7678vq0);
                    C7487uq0 c7487uq0N = c7678vq0.n();
                    fileInputStream.close();
                    AbstractC3393dS.m("Successful read from disk cache for %s", str, C0593Hj.class);
                    return c7487uq0N;
                } finally {
                    c7678vq0.close();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            AbstractC3393dS.t("Exception reading from cache for %s", str);
            c0318Dv0.getClass();
            throw e;
        }
    }

    public void m(C1279Qe c1279Qe) {
        boolean z;
        DV1.a();
        OD0 od0 = (OD0) this.b;
        if (od0 != null) {
            if (od0.a == c1279Qe.a) {
                WR0 wr0 = od0.h;
                DV1.a();
                if (wr0.g) {
                    return;
                }
                C1357Re c1357Re = wr0.a;
                DV1.a();
                int i = c1357Re.a;
                if (i > 0) {
                    z = true;
                    c1357Re.a = i - 1;
                } else {
                    z = false;
                }
                C7730w60 c7730w60 = c1279Qe.b;
                if (!z) {
                    DV1.a();
                    c1357Re.c.execute(new MD0(c1357Re, 28, c7730w60));
                }
                wr0.a();
                wr0.e.d(c7730w60);
                if (z) {
                    C7737w81 c7737w81 = wr0.b;
                    c7737w81.getClass();
                    DV1.a();
                    AbstractC0759Jm0.f("TakePictureManagerImpl");
                    c7737w81.a.addFirst(c1357Re);
                    c7737w81.c();
                }
            }
        }
    }

    public void n(O01 o01, EncodedImage encodedImage) {
        String str = o01.a;
        String str2 = o01.a;
        AbstractC3393dS.m("About to write to disk-cache for key %s", str, C0593Hj.class);
        try {
            ((C7771wK) ((InterfaceC5890mT) this.b)).g(o01, new C0515Gj(encodedImage, 0, this));
            ((C0318Dv0) this.g).getClass();
            AbstractC3393dS.m("Successful disk-cache write for key %s", str2, C0593Hj.class);
        } catch (IOException unused) {
            AbstractC3393dS.t("Failed to write to disk-cache for key %s", str2);
        }
    }

    public /* synthetic */ C0593Hj(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, int i) {
        this.a = i;
        this.b = provider;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public Executor a() {
        return (Executor) this.d;
    }

    public C0593Hj(Context context, Executor executor, Executor executor2, InterfaceC3112u interfaceC3112u, InterfaceC3087t interfaceC3087t, C2913m c2913m, C2963o c2963o) {
        this.a = 4;
        O90.f(context, "context");
        O90.f(executor, "workerExecutor");
        O90.f(executor2, "uiExecutor");
        O90.f(interfaceC3112u, "billingInfoStorage");
        O90.f(interfaceC3087t, "billingInfoSender");
        this.c = context;
        this.d = executor;
        this.e = executor2;
        this.f = interfaceC3087t;
        this.g = c2913m;
        this.h = c2963o;
    }

    public C0593Hj(InterfaceC5890mT interfaceC5890mT, VH vh, C1204Pf c1204Pf, ExecutorService executorService, ExecutorService executorService2, C0318Dv0 c0318Dv0) {
        this.a = 0;
        O90.f(interfaceC5890mT, "fileCache");
        O90.f(vh, "pooledByteBufferFactory");
        O90.f(c1204Pf, "pooledByteStreams");
        O90.f(executorService, "readExecutor");
        O90.f(executorService2, "writeExecutor");
        O90.f(c0318Dv0, "imageCacheStatsTracker");
        this.b = interfaceC5890mT;
        this.c = vh;
        this.d = c1204Pf;
        this.e = executorService;
        this.f = executorService2;
        this.g = c0318Dv0;
        C3513e41 c3513e41 = new C3513e41(0, false);
        c3513e41.b = new HashMap();
        this.h = c3513e41;
    }
}
