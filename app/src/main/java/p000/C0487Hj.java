package p000;

import android.content.Context;
import com.facebook.imagepipeline.image.EncodedImage;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.yandex.metrica.impl.p022ob.C3427m;
import com.yandex.metrica.impl.p022ob.C3479o;
import com.yandex.metrica.impl.p022ob.C3505p;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.metrica.impl.p022ob.InterfaceC3557r;
import com.yandex.metrica.impl.p022ob.InterfaceC3583s;
import com.yandex.metrica.impl.p022ob.InterfaceC3609t;
import com.yandex.metrica.impl.p022ob.InterfaceC3635u;
import com.yandex.metrica.impl.p022ob.InterfaceC3661v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: Hj */
/* loaded from: classes.dex */
public final class C0487Hj implements Provider, InterfaceC4243iS, InterfaceC3557r, InterfaceC3531q {

    /* renamed from: a */
    public final /* synthetic */ int f4444a;

    /* renamed from: b */
    public Object f4445b;

    /* renamed from: c */
    public Object f4446c;

    /* renamed from: d */
    public Object f4447d;

    /* renamed from: e */
    public Object f4448e;

    /* renamed from: f */
    public Object f4449f;

    /* renamed from: g */
    public Object f4450g;

    /* renamed from: h */
    public Object f4451h;

    public /* synthetic */ C0487Hj() {
        this.f4444a = 1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3557r
    /* renamed from: a */
    public synchronized void mo3441a(C3505p c3505p) {
        this.f4445b = c3505p;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3557r
    /* renamed from: b */
    public void mo3442b() {
        C3505p c3505p = (C3505p) this.f4445b;
        if (c3505p != null) {
            ((Executor) this.f4448e).execute(new C6253jh(this, 3, c3505p));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: c */
    public Executor mo3443c() {
        return (Executor) this.f4448e;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: d */
    public InterfaceC3609t mo3444d() {
        return (InterfaceC3609t) this.f4449f;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: e */
    public InterfaceC3583s mo3445e() {
        return (C3427m) this.f4450g;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: f */
    public InterfaceC3661v mo3447f() {
        return (C3479o) this.f4451h;
    }

    /* renamed from: g */
    public void m3553g() {
        ((C9196e41) this.f4451h).m17861w0();
        try {
            O90.m5967e(R81.m6908a(new CallableC0361Fj(0, this), (ExecutorService) this.f4449f), "{\n      Task.call(\n     …     writeExecutor)\n    }");
        } catch (Exception e) {
            AbstractC3929dS.m17687t("Failed to schedule disk-cache clear", new Object[0]);
            R81.m6909b(e);
        }
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f4444a) {
            case 2:
                return new C6367lV((C0786MU) ((G10) this.f4445b).get(), (InterfaceC9347fG0) ((C8342Tu0) this.f4446c).get(), (InterfaceC1478XU) ((C7978Mu0) this.f4447d).get(), (InterfaceC9347fG0) ((C8170Qm0) this.f4448e).get(), (RemoteConfigManager) ((C9937jt0) this.f4449f).get(), (C0751Lw) ((C8326Tm0) this.f4450g).get(), (SessionManager) ((C7356Av0) this.f4451h).get());
            default:
                return new C8575Yg1((Context) ((C7668Gv0) this.f4445b).f3961a, (C7712Hr0) ((Provider) this.f4446c).get(), (InterfaceC0970PP) ((Provider) this.f4447d).get(), (C8200Rb0) ((C8539Xo1) this.f4448e).get(), (Executor) ((Provider) this.f4449f).get(), (A71) ((Provider) this.f4450g).get(), new C8326Tm0(23), new C7564Ev0(22), (InterfaceC1750at) ((Provider) this.f4451h).get());
        }
    }

    /* renamed from: h */
    public boolean m3554h(O01 o01) {
        boolean zM25600e = false;
        C9196e41 c9196e41 = (C9196e41) this.f4451h;
        synchronized (c9196e41) {
            if (((HashMap) c9196e41.f26532b).containsKey(o01)) {
                EncodedImage encodedImage = (EncodedImage) ((HashMap) c9196e41.f26532b).get(o01);
                synchronized (encodedImage) {
                    if (EncodedImage.isValid(encodedImage)) {
                        return true;
                    }
                    ((HashMap) c9196e41.f26532b).remove(o01);
                    AbstractC3929dS.m17682o(C9196e41.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), o01.f8165a, Integer.valueOf(System.identityHashCode(o01)));
                }
            }
            if (((C7068wK) ((InterfaceC6428mT) this.f4445b)).m25601f(o01)) {
                return true;
            }
            EncodedImage encodedImageM17837A0 = ((C9196e41) this.f4451h).m17837A0(o01);
            C7512Dv0 c7512Dv0 = (C7512Dv0) this.f4450g;
            if (encodedImageM17837A0 != null) {
                encodedImageM17837A0.close();
                AbstractC3929dS.m17680m("Found image for %s in staging area", o01.f8165a, C0487Hj.class);
                c7512Dv0.getClass();
                return true;
            }
            AbstractC3929dS.m17680m("Did not find image for %s in staging area", o01.f8165a, C0487Hj.class);
            c7512Dv0.getClass();
            try {
                zM25600e = ((C7068wK) ((InterfaceC6428mT) this.f4445b)).m25600e(o01);
            } catch (Exception unused) {
            }
            return zM25600e;
        }
    }

    /* renamed from: i */
    public int m3555i() {
        int iMo4048l;
        DV1.m1716a();
        AbstractC9104dM1.m17550i(((MU0) this.f4446c) != null, "The ImageReader is not initialized.");
        MU0 mu0 = (MU0) this.f4446c;
        synchronized (mu0.f7184a) {
            iMo4048l = mu0.f7187d.mo4048l() - mu0.f7185b;
        }
        return iMo4048l;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3556j(p000.InterfaceC9457g70 r4) throws java.lang.Exception {
        /*
            r3 = this;
            p000.DV1.m1716a()
            java.lang.Object r0 = r3.f4445b
            OD0 r0 = (p000.OD0) r0
            java.lang.String r1 = "CaptureNode"
            if (r0 != 0) goto L16
            java.util.Objects.toString(r4)
            p000.AbstractC7806Jm0.m4412f(r1)
            r4.close()
            goto La6
        L16:
            K60 r0 = r4.mo18403P()
            s81 r0 = r0.mo4564b()
            java.lang.Object r2 = r3.f4445b
            OD0 r2 = (p000.OD0) r2
            java.lang.String r2 = r2.f8312i
            android.util.ArrayMap r0 = r0.f42279a
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L35
            p000.AbstractC7806Jm0.m4412f(r1)
            r4.close()
            return
        L35:
            p000.DV1.m1716a()
            java.lang.Object r0 = r3.f4449f
            le r0 = (p000.C6376le) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r1 = r3.f4445b
            OD0 r1 = (p000.OD0) r1
            me r2 = new me
            r2.<init>(r1, r4)
            TM r0 = r0.f37208a
            r0.mo3020b(r2)
            java.lang.Object r0 = r3.f4445b
            OD0 r0 = (p000.OD0) r0
            java.lang.Object r1 = r3.f4450g
            Dc r1 = (p000.C0228Dc) r1
            if (r1 == 0) goto L61
            java.util.ArrayList r1 = r1.f2067h
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L61
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 == 0) goto L73
            java.lang.Object r1 = r3.f4445b
            OD0 r1 = (p000.OD0) r1
            if (r1 == 0) goto L73
            int r4 = r4.mo18405j0()
            Re r1 = r1.f8305b
            r1.m7053b(r4)
        L73:
            r4 = 0
            if (r2 == 0) goto L84
            java.lang.Object r1 = r3.f4445b
            OD0 r1 = (p000.OD0) r1
            if (r1 == 0) goto L86
            Re r1 = r1.f8305b
            boolean r1 = r1.m7052a()
            if (r1 == 0) goto L86
        L84:
            r3.f4445b = r4
        L86:
            int r1 = r0.f8315l
            r2 = -1
            if (r1 == r2) goto L90
            r1 = 100
            r0.m5997a(r1)
        L90:
            WR0 r0 = r0.f8311h
            p000.DV1.m1716a()
            boolean r1 = r0.f13185g
            if (r1 == 0) goto L9a
            goto La6
        L9a:
            boolean r1 = r0.f13186h
            if (r1 != 0) goto La1
            r0.m8761b()
        La1:
            El r0 = r0.f13183e
            r0.m2375b(r4)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0487Hj.m3556j(g70):void");
    }

    /* renamed from: k */
    public void m3557k(OD0 od0) {
        DV1.m1716a();
        AbstractC9104dM1.m17550i(od0.f8313j.size() == 1, "only one capture stage is supported.");
        AbstractC9104dM1.m17550i(m3555i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f4445b = od0;
        AbstractC8301Sz1.m7478a(od0.f8314k, new C4238iN(this, od0, false, 9), QR1.m6703a());
    }

    /* renamed from: l */
    public C11339uq0 m3558l(O01 o01) throws IOException {
        String str = o01.f8165a;
        C7512Dv0 c7512Dv0 = (C7512Dv0) this.f4450g;
        try {
            AbstractC3929dS.m17680m("Disk cache read for %s", str, C0487Hj.class);
            C6365lT c6365lTM25598c = ((C7068wK) ((InterfaceC6428mT) this.f4445b)).m25598c(o01);
            if (c6365lTM25598c == null) {
                AbstractC3929dS.m17680m("Disk cache miss for %s", str, C0487Hj.class);
                c7512Dv0.getClass();
                return null;
            }
            AbstractC3929dS.m17680m("Found entry in disk cache for %s", str, C0487Hj.class);
            c7512Dv0.getClass();
            FileInputStream fileInputStream = new FileInputStream(c6365lTM25598c.f37075a);
            try {
                C1339VH c1339vh = (C1339VH) this.f4446c;
                int length = (int) c6365lTM25598c.f37075a.length();
                c1339vh.getClass();
                C11467vq0 c11467vq0 = new C11467vq0((AbstractC10955rq0) c1339vh.f12486b, length);
                try {
                    ((C0986Pf) c1339vh.f12487c).m6395f(fileInputStream, c11467vq0);
                    C11339uq0 c11339uq0M25523n = c11467vq0.m25523n();
                    fileInputStream.close();
                    AbstractC3929dS.m17680m("Successful read from disk cache for %s", str, C0487Hj.class);
                    return c11339uq0M25523n;
                } finally {
                    c11467vq0.close();
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            AbstractC3929dS.m17687t("Exception reading from cache for %s", str);
            c7512Dv0.getClass();
            throw e;
        }
    }

    /* renamed from: m */
    public void m3559m(C1048Qe c1048Qe) {
        boolean z;
        DV1.m1716a();
        OD0 od0 = (OD0) this.f4445b;
        if (od0 != null) {
            if (od0.f8304a == c1048Qe.f9705a) {
                WR0 wr0 = od0.f8311h;
                DV1.m1716a();
                if (wr0.f13185g) {
                    return;
                }
                C1110Re c1110Re = wr0.f13179a;
                DV1.m1716a();
                int i = c1110Re.f10347a;
                if (i > 0) {
                    z = true;
                    c1110Re.f10347a = i - 1;
                } else {
                    z = false;
                }
                C11502w60 c11502w60 = c1048Qe.f9706b;
                if (!z) {
                    DV1.m1716a();
                    c1110Re.f10349c.execute(new MD0(c1110Re, 28, c11502w60));
                }
                wr0.m8760a();
                wr0.f13183e.m2377d(c11502w60);
                if (z) {
                    C11507w81 c11507w81 = wr0.f13180b;
                    c11507w81.getClass();
                    DV1.m1716a();
                    AbstractC7806Jm0.m4412f("TakePictureManagerImpl");
                    c11507w81.f44692a.addFirst(c1110Re);
                    c11507w81.m25567c();
                }
            }
        }
    }

    /* renamed from: n */
    public void m3560n(O01 o01, EncodedImage encodedImage) {
        String str = o01.f8165a;
        String str2 = o01.f8165a;
        AbstractC3929dS.m17680m("About to write to disk-cache for key %s", str, C0487Hj.class);
        try {
            ((C7068wK) ((InterfaceC6428mT) this.f4445b)).m25602g(o01, new C0424Gj(encodedImage, 0, this));
            ((C7512Dv0) this.f4450g).getClass();
            AbstractC3929dS.m17680m("Successful disk-cache write for key %s", str2, C0487Hj.class);
        } catch (IOException unused) {
            AbstractC3929dS.m17687t("Failed to write to disk-cache for key %s", str2);
        }
    }

    public /* synthetic */ C0487Hj(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, int i) {
        this.f4444a = i;
        this.f4445b = provider;
        this.f4446c = provider2;
        this.f4447d = provider3;
        this.f4448e = provider4;
        this.f4449f = provider5;
        this.f4450g = provider6;
        this.f4451h = provider7;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: a */
    public Executor mo3440a() {
        return (Executor) this.f4447d;
    }

    public C0487Hj(Context context, Executor executor, Executor executor2, InterfaceC3635u interfaceC3635u, InterfaceC3609t interfaceC3609t, C3427m c3427m, C3479o c3479o) {
        this.f4444a = 4;
        O90.m5968f(context, "context");
        O90.m5968f(executor, "workerExecutor");
        O90.m5968f(executor2, "uiExecutor");
        O90.m5968f(interfaceC3635u, "billingInfoStorage");
        O90.m5968f(interfaceC3609t, "billingInfoSender");
        this.f4446c = context;
        this.f4447d = executor;
        this.f4448e = executor2;
        this.f4449f = interfaceC3609t;
        this.f4450g = c3427m;
        this.f4451h = c3479o;
    }

    public C0487Hj(InterfaceC6428mT interfaceC6428mT, C1339VH c1339vh, C0986Pf c0986Pf, ExecutorService executorService, ExecutorService executorService2, C7512Dv0 c7512Dv0) {
        this.f4444a = 0;
        O90.m5968f(interfaceC6428mT, "fileCache");
        O90.m5968f(c1339vh, "pooledByteBufferFactory");
        O90.m5968f(c0986Pf, "pooledByteStreams");
        O90.m5968f(executorService, "readExecutor");
        O90.m5968f(executorService2, "writeExecutor");
        O90.m5968f(c7512Dv0, "imageCacheStatsTracker");
        this.f4445b = interfaceC6428mT;
        this.f4446c = c1339vh;
        this.f4447d = c0986Pf;
        this.f4448e = executorService;
        this.f4449f = executorService2;
        this.f4450g = c7512Dv0;
        C9196e41 c9196e41 = new C9196e41(0, false);
        c9196e41.f26532b = new HashMap();
        this.f4451h = c9196e41;
    }
}
