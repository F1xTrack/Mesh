package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0779MN;

/* renamed from: io.appmetrica.analytics.impl.Cl */
/* loaded from: classes2.dex */
public final class C4428Cl {

    /* renamed from: a */
    public final C4453Dl f29972a;

    /* renamed from: b */
    public volatile NetworkTask f29973b;

    public C4428Cl(C4453Dl c4453Dl) {
        this.f29972a = c4453Dl;
    }

    /* renamed from: b */
    public final Context m19295b() {
        return this.f29972a.f30028a;
    }

    /* renamed from: c */
    public final synchronized NetworkTask m19297c() {
        NetworkTask networkTask;
        try {
            if (m19301g()) {
                if (this.f29973b == null) {
                    C5055cl c5055clM19298d = m19298d();
                    C5397qd c5397qd = C5397qd.f32445a;
                    C4956Yk c4956Yk = new C4956Yk(new C4395Bd(), C5244ka.f32038C.m20628m());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c5055clM19298d);
                    this.f29973b = new NetworkTask(new SynchronizedBlockingExecutor(), new C5493u9(this.f29972a.f30028a), new AllHostsExponentialBackoffPolicy(C5397qd.f32445a.m20957a(EnumC5347od.STARTUP)), new C4378Al(this, new C4812Sk(), new FullUrlFormer(c4956Yk, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), C0779MN.f7117a, C5397qd.f32447c);
                }
                networkTask = this.f29973b;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    /* renamed from: d */
    public final C5055cl m19298d() {
        return (C5055cl) this.f29972a.f30039l.m21113a();
    }

    /* renamed from: e */
    public final C5155gl m19299e() {
        C5155gl c5155gl;
        C4597Jk c4597Jk = this.f29972a.f30039l;
        synchronized (c4597Jk) {
            c5155gl = c4597Jk.f32674c.f30602a;
        }
        return c5155gl;
    }

    /* renamed from: f */
    public final void m19300f() {
        C5155gl c5155gl;
        C4597Jk c4597Jk = this.f29972a.f30039l;
        synchronized (c4597Jk) {
            c5155gl = c4597Jk.f32674c.f30602a;
        }
        C5255kl c5255kl = c5155gl.f31784c;
        C5230jl c5230jlM20660a = c5255kl.m20660a(c5255kl.f32098m);
        String strM19547a = c5155gl.f31782a;
        String str = c5155gl.f31783b;
        C5282ln c5282ln = this.f29972a.f30041n;
        String str2 = c5155gl.f31785d;
        c5282ln.getClass();
        if (!C5282ln.m20694a(str2)) {
            c5230jlM20660a.f31996a = this.f29972a.f30040m.m20034a().f32948id;
        }
        String str3 = c5155gl.f31782a;
        if (str3 == null || str3.length() == 0) {
            strM19547a = this.f29972a.f30035h.m19547a();
            str = "";
        }
        List<String> list = this.f29972a.f30030c.f31270e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c5230jlM20660a.f32002g = list;
        C5155gl c5155gl2 = new C5155gl(strM19547a, str, new C5255kl(c5230jlM20660a));
        m19296b(c5155gl2);
        m19293a(c5155gl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005c A[PHI: r2
  0x005c: PHI (r2v4 boolean) = (r2v3 boolean), (r2v7 boolean), (r2v7 boolean) binds: [B:45:0x0025, B:54:0x0057, B:55:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m19301g() {
        /*
            r8 = this;
            r0 = 1
            monitor-enter(r8)
            io.appmetrica.analytics.impl.gl r1 = r8.m19299e()     // Catch: java.lang.Throwable -> L22
            java.util.Set r2 = io.appmetrica.analytics.impl.AbstractC5080dl.f31495a     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1.f31804w     // Catch: java.lang.Throwable -> L22
            r3 = 0
            if (r2 != 0) goto L24
            long r4 = r1.f31796o     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.El r2 = r1.f31779A     // Catch: java.lang.Throwable -> L22
            int r2 = r2.f30111a     // Catch: java.lang.Throwable -> L22
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.AbstractC5080dl.f31496b     // Catch: java.lang.Throwable -> L22
            long r6 = r2.currentTimeSeconds()     // Catch: java.lang.Throwable -> L22
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L20
            goto L24
        L20:
            r2 = r3
            goto L25
        L22:
            r0 = move-exception
            goto L5f
        L24:
            r2 = r0
        L25:
            if (r2 != 0) goto L5c
            java.lang.String r2 = r1.f31785d     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC5080dl.m20292a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f31782a     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC5080dl.m20292a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.f31783b     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC5080dl.m20292a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            r3 = r0
        L40:
            r2 = r3 ^ 1
            io.appmetrica.analytics.impl.Dl r4 = r8.f29972a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.T3 r4 = r4.f30038k     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.cl r5 = r8.m19298d()     // Catch: java.lang.Throwable -> L22
            java.util.Map r5 = r5.f31441h     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Dl r6 = r8.f29972a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Q3 r6 = r6.f30037j     // Catch: java.lang.Throwable -> L22
            r4.getClass()     // Catch: java.lang.Throwable -> L22
            boolean r1 = io.appmetrica.analytics.impl.C4819T3.m19830a(r5, r1, r6)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L5c
            if (r1 != 0) goto L5c
            goto L5d
        L5c:
            r0 = r2
        L5d:
            monitor-exit(r8)
            return r0
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4428Cl.m19301g():boolean");
    }

    /* renamed from: h */
    public final synchronized void m19302h() {
        this.f29973b = null;
    }

    /* renamed from: a */
    public final C4964Z4 m19288a() {
        return this.f29972a.f30033f;
    }

    /* renamed from: b */
    public final synchronized void m19296b(C5155gl c5155gl) {
        this.f29972a.f30039l.m21115a(c5155gl);
        C5130fl c5130fl = this.f29972a.f30034g;
        c5130fl.f31697b.m21059a(c5155gl.f31782a);
        c5130fl.f31697b.m21061b(c5155gl.f31783b);
        c5130fl.f31696a.save(c5155gl.f31784c);
        this.f29972a.f30032e.mo19206a(c5155gl);
    }

    /* renamed from: a */
    public final synchronized boolean m19294a(List<String> list, Map<String, String> map) {
        return !AbstractC5080dl.m20291a(m19299e(), list, map, new C4403Bl(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5155gl m19289a(io.appmetrica.analytics.impl.C5105el r9, io.appmetrica.analytics.impl.C5055cl r10, long r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4428Cl.m19289a(io.appmetrica.analytics.impl.el, io.appmetrica.analytics.impl.cl, long):io.appmetrica.analytics.impl.gl");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:30:0x0001, B:32:0x0007, B:41:0x0037, B:43:0x003e), top: B:50:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19292a(io.appmetrica.analytics.impl.C5105el r4, io.appmetrica.analytics.impl.C5055cl r5, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.AbstractC5182hn.m20514a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.AbstractC5182hn.m20513a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            r0 = 0
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L34
            java.util.Date r6 = r0.parse(r6)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.getTime()     // Catch: java.lang.Throwable -> L34
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L34
            goto L35
        L32:
            r4 = move-exception
            goto L54
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L3c
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L32
            goto L3e
        L3c:
            r0 = 0
        L3e:
            java.lang.Long r6 = r4.f31625l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.kj r2 = io.appmetrica.analytics.impl.AbstractC5228jj.f31988a     // Catch: java.lang.Throwable -> L32
            r2.m20654a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.gl r4 = r3.m19289a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.m19302h()     // Catch: java.lang.Throwable -> L32
            r3.m19296b(r4)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.m19293a(r4)
            return
        L54:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4428Cl.m19292a(io.appmetrica.analytics.impl.el, io.appmetrica.analytics.impl.cl, java.util.Map):void");
    }

    /* renamed from: a */
    public final void m19293a(C5155gl c5155gl) {
        ArrayList arrayList;
        C4453Dl c4453Dl = this.f29972a;
        C4525Gk c4525Gk = c4453Dl.f30031d;
        String str = c4453Dl.f30029b;
        synchronized (c4525Gk.f30200a.f30319b) {
            try {
                C4573Ik c4573Ik = c4525Gk.f30200a;
                c4573Ik.f30320c = c5155gl;
                Collection collection = (Collection) c4573Ik.f30318a.f32190a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4788Rk) it.next()).mo19574a(c5155gl);
        }
    }

    /* renamed from: a */
    public final void m19290a(EnumC4621Kk enumC4621Kk) {
        synchronized (this) {
            this.f29973b = null;
        }
        C4453Dl c4453Dl = this.f29972a;
        c4453Dl.f30031d.m19454a(c4453Dl.f30033f.f31144a, enumC4621Kk, m19299e());
    }

    /* renamed from: a */
    public final synchronized void m19291a(C5005al c5005al) {
        try {
            this.f29972a.f30039l.mo19538a(c5005al);
            C5055cl c5055clM19298d = m19298d();
            if (c5055clM19298d.f31444k) {
                List list = c5055clM19298d.f31443j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC5182hn.m20512a(list, c5055clM19298d.f31438e)) {
                        C5155gl c5155glM19299e = m19299e();
                        C5255kl c5255kl = c5155glM19299e.f31784c;
                        C5230jl c5230jlM20660a = c5255kl.m20660a(c5255kl.f32098m);
                        String str = c5155glM19299e.f31782a;
                        String str2 = c5155glM19299e.f31783b;
                        c5230jlM20660a.f32002g = list;
                        C5155gl c5155gl = new C5155gl(str, str2, new C5255kl(c5230jlM20660a));
                        m19296b(c5155gl);
                        m19293a(c5155gl);
                    }
                } else {
                    if (c5055clM19298d.f31438e != null && (!r5.isEmpty())) {
                        C5155gl c5155glM19299e2 = m19299e();
                        C5255kl c5255kl2 = c5155glM19299e2.f31784c;
                        C5230jl c5230jlM20660a2 = c5255kl2.m20660a(c5255kl2.f32098m);
                        String str3 = c5155glM19299e2.f31782a;
                        String str4 = c5155glM19299e2.f31783b;
                        c5230jlM20660a2.f32002g = null;
                        C5155gl c5155gl2 = new C5155gl(str3, str4, new C5255kl(c5230jlM20660a2));
                        m19296b(c5155gl2);
                        m19293a(c5155gl2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
