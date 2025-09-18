package com.huawei.hms.framework.network.grs.p008g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C2123a;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import com.huawei.hms.framework.network.grs.p007f.C2099b;
import com.huawei.hms.framework.network.grs.p008g.p009i.C2111a;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2115d;
import com.huawei.hms.framework.network.grs.p011h.C2119d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import p000.AbstractC0852NX;

/* renamed from: com.huawei.hms.framework.network.grs.g.c */
/* loaded from: classes.dex */
public class C2105c {

    /* renamed from: l */
    private static final String f19056l = "c";

    /* renamed from: a */
    private final GrsBaseInfo f19057a;

    /* renamed from: b */
    private final Context f19058b;

    /* renamed from: c */
    private final C2095a f19059c;

    /* renamed from: d */
    private C2106d f19060d;

    /* renamed from: i */
    private final C2114c f19065i;

    /* renamed from: e */
    private final Map<String, Future<C2106d>> f19061e = new ConcurrentHashMap(16);

    /* renamed from: f */
    private final List<C2106d> f19062f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private final JSONArray f19063g = new JSONArray();

    /* renamed from: h */
    private final List<String> f19064h = new CopyOnWriteArrayList();

    /* renamed from: j */
    private String f19066j = "";

    /* renamed from: k */
    private long f19067k = 1;

    public C2105c(C2114c c2114c, C2095a c2095a) {
        this.f19065i = c2114c;
        this.f19057a = c2114c.m11849b();
        this.f19058b = c2114c.m11847a();
        this.f19059c = c2095a;
        m11788b();
        m11789c();
    }

    /* renamed from: b */
    private C2106d m11787b(C2106d c2106d) throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        String str2;
        for (Map.Entry<String, Future<C2106d>> entry : this.f19061e.entrySet()) {
            if (c2106d != null && (c2106d.m11828o() || c2106d.m11826m())) {
                break;
            }
            try {
                c2106d = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = f19056l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.m11690w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.m11685i(f19056l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = f19056l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.m11690w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.m11689w(f19056l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return c2106d;
    }

    /* renamed from: c */
    private void m11789c() {
        String grsParasKey = this.f19057a.getGrsParasKey(true, true, this.f19058b);
        this.f19066j = this.f19059c.m11733a().m11743a(grsParasKey + "ETag", "");
    }

    /* renamed from: d */
    private String m11790d() {
        C2099b c2099bM11767a = C2099b.m11767a(this.f19058b.getPackageName());
        C2123a c2123aM11769a = c2099bM11767a != null ? c2099bM11767a.m11769a() : null;
        if (c2123aM11769a == null) {
            return "";
        }
        String strM11877a = c2123aM11769a.m11877a();
        Logger.m11688v(f19056l, "get appName from local assets is{%s}", strM11877a);
        return strM11877a;
    }

    /* renamed from: a */
    public C2106d m11791a(ExecutorService executorService, String str, C2097c c2097c) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f19064h.isEmpty()) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2106d c2106dM11785a = m11785a(executorService, this.f19064h, str, c2097c);
        Logger.m11686i(f19056l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(c2106dM11785a == null ? 0 : c2106dM11785a.m11813b()));
        C2107e.m11830a(new ArrayList(this.f19062f), SystemClock.elapsedRealtime() - jElapsedRealtime, this.f19063g, this.f19058b);
        this.f19062f.clear();
        return c2106dM11785a;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x009b A[LOOP:0: B:50:0x0005->B:83:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0093 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.huawei.hms.framework.network.grs.p008g.C2106d m11785a(java.util.concurrent.ExecutorService r16, java.util.List<java.lang.String> r17, java.lang.String r18, com.huawei.hms.framework.network.grs.p006e.C2097c r19) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r15 = this;
            r9 = r15
            r0 = 0
            r10 = 0
            r11 = r0
            r12 = r10
        L5:
            int r0 = r17.size()
            if (r12 >= r0) goto L9f
            r13 = r17
            java.lang.Object r0 = r13.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8e
            com.huawei.hms.framework.network.grs.g.a r14 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.f19058b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.f19057a
            r1 = r14
            r2 = r0
            r3 = r12
            r4 = r15
            r6 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r14.m11783g()
            r2 = r16
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.f19061e
            r3.put(r0, r1)
            r3 = 1
            long r4 = r9.f19067k     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            java.lang.Object r0 = r1.get(r4, r0)     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.p008g.C2106d) r1     // Catch: java.lang.InterruptedException -> L6a java.util.concurrent.ExecutionException -> L6c java.util.concurrent.TimeoutException -> L6e java.util.concurrent.CancellationException -> L86
            if (r1 == 0) goto L67
            boolean r0 = r1.m11828o()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            if (r0 != 0) goto L5a
            boolean r0 = r1.m11826m()     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            if (r0 == 0) goto L67
            goto L5a
        L54:
            r0 = move-exception
            r11 = r1
            goto L76
        L57:
            r0 = move-exception
            r11 = r1
            goto L7e
        L5a:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            java.lang.String r4 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.m11685i(r0, r4)     // Catch: java.lang.InterruptedException -> L54 java.util.concurrent.ExecutionException -> L57 java.util.concurrent.TimeoutException -> L63 java.util.concurrent.CancellationException -> L65
            r11 = r1
            goto L91
        L63:
            r11 = r1
            goto L6e
        L65:
            r11 = r1
            goto L86
        L67:
            r11 = r1
        L68:
            r3 = r10
            goto L91
        L6a:
            r0 = move-exception
            goto L76
        L6c:
            r0 = move-exception
            goto L7e
        L6e:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.m11689w(r0, r1)
            goto L68
        L76:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l
            java.lang.String r4 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.m11690w(r1, r4, r0)
            goto L91
        L7e:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.m11690w(r1, r3, r0)
            goto L68
        L86:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.m11685i(r0, r1)
            goto L91
        L8e:
            r2 = r16
            goto L68
        L91:
            if (r3 == 0) goto L9b
            java.lang.String r0 = com.huawei.hms.framework.network.grs.p008g.C2105c.f19056l
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.m11687v(r0, r1)
            goto L9f
        L9b:
            int r12 = r12 + 1
            goto L5
        L9f:
            com.huawei.hms.framework.network.grs.g.d r0 = r15.m11787b(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.p008g.C2105c.m11785a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    /* renamed from: b */
    private void m11788b() {
        C2115d c2115dM11842a = C2111a.m11842a(this.f19058b);
        if (c2115dM11842a == null) {
            Logger.m11689w(f19056l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        m11794a(c2115dM11842a);
        List<String> listM11852a = c2115dM11842a.m11852a();
        if (listM11852a == null || listM11852a.size() <= 0) {
            Logger.m11687v(f19056l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (listM11852a.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String strM11856b = c2115dM11842a.m11856b();
        if (listM11852a.size() > 0) {
            for (String str : listM11852a) {
                if (str.startsWith("https://")) {
                    m11786a(strM11856b, str);
                } else {
                    Logger.m11689w(f19056l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.m11688v(f19056l, "request to GRS server url is {%s}", this.f19064h);
    }

    /* renamed from: a */
    public String m11792a() {
        return this.f19066j;
    }

    /* renamed from: a */
    public synchronized void m11793a(C2106d c2106d) {
        try {
            this.f19062f.add(c2106d);
            C2106d c2106d2 = this.f19060d;
            if (c2106d2 == null || (!c2106d2.m11828o() && !this.f19060d.m11826m())) {
                if (c2106d.m11827n()) {
                    Logger.m11685i(f19056l, "GRS server open 503 limiting strategy.");
                    C2119d.m11868a(this.f19057a.getGrsParasKey(true, true, this.f19058b), new C2119d.a(c2106d.m11824k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (c2106d.m11826m()) {
                    Logger.m11685i(f19056l, "GRS server open 304 Not Modified.");
                }
                if (!c2106d.m11828o() && !c2106d.m11826m()) {
                    Logger.m11687v(f19056l, "grsResponseResult has exception so need return");
                    return;
                }
                this.f19060d = c2106d;
                this.f19059c.m11736a(this.f19057a, c2106d, this.f19058b, this.f19065i);
                for (Map.Entry<String, Future<C2106d>> entry : this.f19061e.entrySet()) {
                    if (!entry.getKey().equals(c2106d.m11825l()) && !entry.getValue().isCancelled()) {
                        Logger.m11685i(f19056l, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.m11687v(f19056l, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m11794a(C2115d c2115d) {
    }

    /* renamed from: a */
    private void m11786a(String str, String str2) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str2, str);
        String grsReqParamJoint = this.f19057a.getGrsReqParamJoint(false, false, m11790d(), this.f19058b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sbM5762k.append("?");
            sbM5762k.append(grsReqParamJoint);
        }
        this.f19064h.add(sbM5762k.toString());
    }
}
