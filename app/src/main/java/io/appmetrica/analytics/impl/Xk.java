package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import defpackage.C7074sg;
import defpackage.O90;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Xk {
    public final HashSet a;
    public final HashMap b;
    public final Uk c;
    public List d;
    public HashMap e;
    public long f;
    public boolean g;
    public long h;
    public final C4719me i;
    public final I j;
    public final T3 k;
    public final C4974x6 l;
    public final Q9 m;
    public final P9 n;
    public final ln o;

    public Xk(Context context, C4719me c4719me) {
        this(c4719me, new I(), new T3(), C4805q4.h().a(context), new C4974x6(), new Q9(), new P9(), new ln());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.AbstractC4510dl.a     // Catch: java.lang.Throwable -> L2a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2a
            java.util.Set r0 = defpackage.AbstractC8069xu.E(r1, r0)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2a
        L12:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2a
            java.util.HashSet r4 = r8.a     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L12
            r9 = r3
            goto L2d
        L2a:
            r9 = move-exception
            goto L49
        L2c:
            r9 = r2
        L2d:
            long r4 = r8.h     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.AbstractC4510dl.b     // Catch: java.lang.Throwable -> L2a
            long r6 = r1.currentTimeSeconds()     // Catch: java.lang.Throwable -> L2a
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r1 = r3
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r0 == 0) goto L46
            if (r9 != 0) goto L46
            if (r1 != 0) goto L46
            boolean r9 = r8.g     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L47
        L46:
            r2 = r3
        L47:
            monitor-exit(r8)
            return r2
        L49:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2a
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Xk.a(java.util.List):boolean");
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            ln lnVar = this.o;
            String str = identifiersResult.id;
            lnVar.getClass();
            if (ln.a(str)) {
                this.b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", "appmetrica_device_id_hash", StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        S9 s9;
        C4719me c4719meD = this.i.i((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.b.get("appmetrica_device_id_hash")).a((IdentifiersResult) this.b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult) this.b.get("appmetrica_clids")).j(Hl.a((Map) this.e)).f((IdentifiersResult) this.b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.b.get("appmetrica_yandex_adv_id")).b(this.g).c(this.l.d).d(this.h);
        Q9 q9 = this.m;
        synchronized (q9) {
            s9 = q9.b;
        }
        c4719meD.a(s9).b();
    }

    public Xk(C4719me c4719me, I i, T3 t3, Yc yc, C4974x6 c4974x6, Q9 q9, P9 p9, ln lnVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.c = new Uk();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = c4719me;
        this.j = i;
        this.k = t3;
        this.l = c4974x6;
        this.m = q9;
        this.n = p9;
        this.o = lnVar;
        c(yc.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c4719me.j());
        a("appmetrica_device_id_hash", c4719me.i());
        a("appmetrica_get_ad_url", c4719me.d());
        a("appmetrica_report_ad_url", c4719me.e());
        b(c4719me.o());
        a("appmetrica_google_adv_id", c4719me.l());
        a("appmetrica_huawei_oaid", c4719me.m());
        a("appmetrica_yandex_adv_id", c4719me.r());
        c4974x6.a(c4719me.h());
        q9.a(c4719me.k());
        this.d = c4719me.g();
        String strI = c4719me.i((String) null);
        this.e = strI != null ? Hl.a(strI) : null;
        this.g = c4719me.a(true);
        this.f = c4719me.b(0L);
        this.h = c4719me.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return hn.a((Map) this.e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.l.c.get(str2);
                }
                if (identifiersResult == null) {
                    S9 s9 = this.m.b;
                    if (!O90.a(str2, "appmetrica_lib_ssl_enabled") || (bool = s9.a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = s9.b;
                        String str3 = s9.c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new C7074sg();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !hn.a((Map) this.e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
