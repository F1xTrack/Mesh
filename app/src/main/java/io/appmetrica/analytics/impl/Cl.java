package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.MN;
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

/* loaded from: classes2.dex */
public final class Cl {
    public final Dl a;
    public volatile NetworkTask b;

    public Cl(Dl dl) {
        this.a = dl;
    }

    public final Context b() {
        return this.a.a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            if (g()) {
                if (this.b == null) {
                    C4485cl c4485clD = d();
                    C4814qd c4814qd = C4814qd.a;
                    Yk yk = new Yk(new Bd(), C4667ka.C.m());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c4485clD);
                    this.b = new NetworkTask(new SynchronizedBlockingExecutor(), new C4905u9(this.a.a), new AllHostsExponentialBackoffPolicy(C4814qd.a.a(EnumC4766od.STARTUP)), new Al(this, new Sk(), new FullUrlFormer(yk, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), MN.a, C4814qd.c);
                }
                networkTask = this.b;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    public final C4485cl d() {
        return (C4485cl) this.a.l.a();
    }

    public final C4583gl e() {
        C4583gl c4583gl;
        Jk jk = this.a.l;
        synchronized (jk) {
            c4583gl = jk.c.a;
        }
        return c4583gl;
    }

    public final void f() {
        C4583gl c4583gl;
        Jk jk = this.a.l;
        synchronized (jk) {
            c4583gl = jk.c.a;
        }
        C4678kl c4678kl = c4583gl.c;
        C4654jl c4654jlA = c4678kl.a(c4678kl.m);
        String strA = c4583gl.a;
        String str = c4583gl.b;
        ln lnVar = this.a.n;
        String str2 = c4583gl.d;
        lnVar.getClass();
        if (!ln.a(str2)) {
            c4654jlA.a = this.a.m.a().id;
        }
        String str3 = c4583gl.a;
        if (str3 == null || str3.length() == 0) {
            strA = this.a.h.a();
            str = "";
        }
        List<String> list = this.a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        c4654jlA.g = list;
        C4583gl c4583gl2 = new C4583gl(strA, str, new C4678kl(c4654jlA));
        b(c4583gl2);
        a(c4583gl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005c A[PHI: r2
  0x005c: PHI (r2v4 boolean) = (r2v3 boolean), (r2v7 boolean), (r2v7 boolean) binds: [B:45:0x0025, B:54:0x0057, B:55:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g() {
        /*
            r8 = this;
            r0 = 1
            monitor-enter(r8)
            io.appmetrica.analytics.impl.gl r1 = r8.e()     // Catch: java.lang.Throwable -> L22
            java.util.Set r2 = io.appmetrica.analytics.impl.AbstractC4510dl.a     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1.w     // Catch: java.lang.Throwable -> L22
            r3 = 0
            if (r2 != 0) goto L24
            long r4 = r1.o     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.El r2 = r1.A     // Catch: java.lang.Throwable -> L22
            int r2 = r2.a     // Catch: java.lang.Throwable -> L22
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r4 = r4 + r6
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r2 = io.appmetrica.analytics.impl.AbstractC4510dl.b     // Catch: java.lang.Throwable -> L22
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
            java.lang.String r2 = r1.d     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4510dl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4510dl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> L22
            boolean r2 = io.appmetrica.analytics.impl.AbstractC4510dl.a(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L40
            r3 = r0
        L40:
            r2 = r3 ^ 1
            io.appmetrica.analytics.impl.Dl r4 = r8.a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.T3 r4 = r4.k     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.cl r5 = r8.d()     // Catch: java.lang.Throwable -> L22
            java.util.Map r5 = r5.h     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Dl r6 = r8.a     // Catch: java.lang.Throwable -> L22
            io.appmetrica.analytics.impl.Q3 r6 = r6.j     // Catch: java.lang.Throwable -> L22
            r4.getClass()     // Catch: java.lang.Throwable -> L22
            boolean r1 = io.appmetrica.analytics.impl.T3.a(r5, r1, r6)     // Catch: java.lang.Throwable -> L22
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Cl.g():boolean");
    }

    public final synchronized void h() {
        this.b = null;
    }

    public final Z4 a() {
        return this.a.f;
    }

    public final synchronized void b(C4583gl c4583gl) {
        this.a.l.a(c4583gl);
        C4559fl c4559fl = this.a.g;
        c4559fl.b.a(c4583gl.a);
        c4559fl.b.b(c4583gl.b);
        c4559fl.a.save(c4583gl.c);
        this.a.e.a(c4583gl);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC4510dl.a(e(), list, map, new Bl(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C4583gl a(io.appmetrica.analytics.impl.C4535el r9, io.appmetrica.analytics.impl.C4485cl r10, long r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Cl.a(io.appmetrica.analytics.impl.el, io.appmetrica.analytics.impl.cl, long):io.appmetrica.analytics.impl.gl");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:30:0x0001, B:32:0x0007, B:41:0x0037, B:43:0x003e), top: B:50:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.appmetrica.analytics.impl.C4535el r4, io.appmetrica.analytics.impl.C4485cl r5, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = io.appmetrica.analytics.impl.hn.a(r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.String r0 = "Date"
            java.lang.Object r6 = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L32
            boolean r0 = io.appmetrica.analytics.impl.hn.a(r6)     // Catch: java.lang.Throwable -> L32
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
            java.lang.Long r6 = r4.l     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.kj r2 = io.appmetrica.analytics.impl.AbstractC4652jj.a     // Catch: java.lang.Throwable -> L32
            r2.a(r0, r6)     // Catch: java.lang.Throwable -> L32
            io.appmetrica.analytics.impl.gl r4 = r3.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            r3.h()     // Catch: java.lang.Throwable -> L32
            r3.b(r4)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)
            r3.a(r4)
            return
        L54:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Cl.a(io.appmetrica.analytics.impl.el, io.appmetrica.analytics.impl.cl, java.util.Map):void");
    }

    public final void a(C4583gl c4583gl) {
        ArrayList arrayList;
        Dl dl = this.a;
        Gk gk = dl.d;
        String str = dl.b;
        synchronized (gk.a.b) {
            try {
                Ik ik = gk.a;
                ik.c = c4583gl;
                Collection collection = (Collection) ik.a.a.get(str);
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
            ((Rk) it.next()).a(c4583gl);
        }
    }

    public final void a(Kk kk) {
        synchronized (this) {
            this.b = null;
        }
        Dl dl = this.a;
        dl.d.a(dl.f.a, kk, e());
    }

    public final synchronized void a(C4435al c4435al) {
        try {
            this.a.l.a(c4435al);
            C4485cl c4485clD = d();
            if (c4485clD.k) {
                List list = c4485clD.j;
                if (list != null && !list.isEmpty()) {
                    if (!hn.a(list, c4485clD.e)) {
                        C4583gl c4583glE = e();
                        C4678kl c4678kl = c4583glE.c;
                        C4654jl c4654jlA = c4678kl.a(c4678kl.m);
                        String str = c4583glE.a;
                        String str2 = c4583glE.b;
                        c4654jlA.g = list;
                        C4583gl c4583gl = new C4583gl(str, str2, new C4678kl(c4654jlA));
                        b(c4583gl);
                        a(c4583gl);
                    }
                } else {
                    if (c4485clD.e != null && (!r5.isEmpty())) {
                        C4583gl c4583glE2 = e();
                        C4678kl c4678kl2 = c4583glE2.c;
                        C4654jl c4654jlA2 = c4678kl2.a(c4678kl2.m);
                        String str3 = c4583glE2.a;
                        String str4 = c4583glE2.b;
                        c4654jlA2.g = null;
                        C4583gl c4583gl2 = new C4583gl(str3, str4, new C4678kl(c4654jlA2));
                        b(c4583gl2);
                        a(c4583gl2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
