package com.huawei.hms.framework.network.grs.p008g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.network.grs.InterfaceC2092b;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import com.huawei.hms.framework.network.grs.p008g.p009i.C2111a;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2113b;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2115d;
import com.huawei.hms.framework.network.grs.p011h.C2119d;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.huawei.hms.framework.network.grs.g.g */
/* loaded from: classes.dex */
public class C2109g {

    /* renamed from: b */
    private static final ExecutorService f19087b = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: c */
    private static final Map<String, C2113b> f19088c = new ConcurrentHashMap(16);

    /* renamed from: d */
    private static final Object f19089d = new Object();

    /* renamed from: a */
    private C2095a f19090a;

    /* renamed from: com.huawei.hms.framework.network.grs.g.g$a */
    public class a implements Callable<C2106d> {

        /* renamed from: a */
        final /* synthetic */ C2114c f19091a;

        /* renamed from: b */
        final /* synthetic */ String f19092b;

        /* renamed from: c */
        final /* synthetic */ C2097c f19093c;

        public a(C2114c c2114c, String str, C2097c c2097c) {
            this.f19091a = c2114c;
            this.f19092b = str;
            this.f19093c = c2097c;
        }

        @Override // java.util.concurrent.Callable
        public C2106d call() {
            return new C2105c(this.f19091a, C2109g.this.f19090a).m11791a(C2109g.f19087b, this.f19092b, this.f19093c);
        }
    }

    /* renamed from: com.huawei.hms.framework.network.grs.g.g$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2114c f19095a;

        /* renamed from: b */
        final /* synthetic */ String f19096b;

        /* renamed from: c */
        final /* synthetic */ C2097c f19097c;

        /* renamed from: d */
        final /* synthetic */ int f19098d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC2092b f19099e;

        public b(C2114c c2114c, String str, C2097c c2097c, int i, InterfaceC2092b interfaceC2092b) {
            this.f19095a = c2114c;
            this.f19096b = str;
            this.f19097c = c2097c;
            this.f19098d = i;
            this.f19099e = interfaceC2092b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2109g c2109g = C2109g.this;
            c2109g.m11834a(c2109g.m11836a(this.f19095a, this.f19096b, this.f19097c, this.f19098d), this.f19099e);
        }
    }

    /* renamed from: a */
    public C2106d m11836a(C2114c c2114c, String str, C2097c c2097c, int i) {
        Future<C2106d> futureSubmit;
        String str2;
        String str3;
        Logger.m11680d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = c2114c.m11849b().getGrsParasKey(true, true, c2114c.m11847a());
        Logger.m11687v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (f19089d) {
            try {
                if (!NetworkUtil.isNetworkAvailable(c2114c.m11847a())) {
                    return null;
                }
                C2119d.a aVarM11867a = C2119d.m11867a(grsParasKey);
                Map<String, C2113b> map = f19088c;
                C2113b c2113b = map.get(grsParasKey);
                if (c2113b == null || !c2113b.m11844b()) {
                    if (aVarM11867a != null && aVarM11867a.m11869a()) {
                        return null;
                    }
                    Logger.m11680d("RequestController", "hitGrsRequestBean == null or request block is released.");
                    futureSubmit = f19087b.submit(new a(c2114c, str, c2097c));
                    map.put(grsParasKey, new C2113b(futureSubmit));
                } else {
                    futureSubmit = c2113b.m11843a();
                }
                if (i == -1) {
                    C2115d c2115dM11842a = C2111a.m11842a(c2114c.m11847a());
                    i = c2115dM11842a != null ? c2115dM11842a.m11857c() : 10;
                }
                Logger.m11686i("RequestController", "use grsQueryTimeout %d", Integer.valueOf(i));
                try {
                    return futureSubmit.get(i, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e = e;
                    str2 = "RequestController";
                    str3 = "when check result, find InterruptedException, check others";
                    Logger.m11690w(str2, str3, e);
                    return null;
                } catch (CancellationException e2) {
                    e = e2;
                    str2 = "RequestController";
                    str3 = "when check result, find CancellationException, check others";
                    Logger.m11690w(str2, str3, e);
                    return null;
                } catch (ExecutionException e3) {
                    e = e3;
                    str2 = "RequestController";
                    str3 = "when check result, find ExecutionException, check others";
                    Logger.m11690w(str2, str3, e);
                    return null;
                } catch (TimeoutException e4) {
                    e = e4;
                    str2 = "RequestController";
                    str3 = "when check result, find TimeoutException, check others";
                    Logger.m11690w(str2, str3, e);
                    return null;
                } catch (Exception e5) {
                    e = e5;
                    str2 = "RequestController";
                    str3 = "when check result, find Other Exception, check others";
                    Logger.m11690w(str2, str3, e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m11837a(C2095a c2095a) {
        this.f19090a = c2095a;
    }

    /* renamed from: a */
    public void m11834a(C2106d c2106d, InterfaceC2092b interfaceC2092b) {
        if (interfaceC2092b != null) {
            if (c2106d == null) {
                Logger.m11687v("RequestController", "GrsResponse is null");
                interfaceC2092b.mo11703a();
            } else {
                Logger.m11687v("RequestController", "GrsResponse is not null");
                interfaceC2092b.mo11704a(c2106d);
            }
        }
    }

    /* renamed from: a */
    public void m11838a(C2114c c2114c, InterfaceC2092b interfaceC2092b, String str, C2097c c2097c, int i) {
        f19087b.execute(new b(c2114c, str, c2097c, i, interfaceC2092b));
    }

    /* renamed from: a */
    public void m11839a(String str) {
        synchronized (f19089d) {
            f19088c.remove(str);
        }
    }
}
