package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
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
import p000.C6838sg;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.Xk */
/* loaded from: classes2.dex */
public final class C4932Xk {

    /* renamed from: a */
    public final HashSet f31063a;

    /* renamed from: b */
    public final HashMap f31064b;

    /* renamed from: c */
    public final C4860Uk f31065c;

    /* renamed from: d */
    public List f31066d;

    /* renamed from: e */
    public HashMap f31067e;

    /* renamed from: f */
    public long f31068f;

    /* renamed from: g */
    public boolean f31069g;

    /* renamed from: h */
    public long f31070h;

    /* renamed from: i */
    public final C5298me f31071i;

    /* renamed from: j */
    public final C4552I f31072j;

    /* renamed from: k */
    public final C4819T3 f31073k;

    /* renamed from: l */
    public final C5565x6 f31074l;

    /* renamed from: m */
    public final C4754Q9 f31075m;

    /* renamed from: n */
    public final C4730P9 f31076n;

    /* renamed from: o */
    public final C5282ln f31077o;

    public C4932Xk(Context context, C5298me c5298me) {
        this(c5298me, new C4552I(), new C4819T3(), C5388q4.m20928h().m20929a(context), new C5565x6(), new C4754Q9(), new C4730P9(), new C5282ln());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m20003a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.AbstractC5080dl.f31495a     // Catch: java.lang.Throwable -> L2a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2a
            java.util.Set r0 = p000.AbstractC7167xu.m25959E(r1, r0)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r8.m20002a(r0)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2a
        L12:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2a
            java.util.HashSet r4 = r8.f31063a     // Catch: java.lang.Throwable -> L2a
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
            long r4 = r8.f31070h     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.AbstractC5080dl.f31496b     // Catch: java.lang.Throwable -> L2a
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
            boolean r9 = r8.f31069g     // Catch: java.lang.Throwable -> L2a
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4932Xk.m20003a(java.util.List):boolean");
    }

    /* renamed from: b */
    public final void m20004b(IdentifiersResult identifiersResult) {
        if (m19999a(identifiersResult)) {
            return;
        }
        this.f31064b.put("appmetrica_clids", identifiersResult);
    }

    /* renamed from: c */
    public final void m20007c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C5282ln c5282ln = this.f31077o;
            String str = identifiersResult.f32948id;
            c5282ln.getClass();
            if (C5282ln.m20694a(str)) {
                this.f31064b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m20005b() {
        return m20003a(Arrays.asList("appmetrica_clids", "appmetrica_device_id_hash", StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    /* renamed from: c */
    public final void m20006c() {
        C4801S9 c4801s9;
        C5298me c5298meM20724d = this.f31071i.m20737i((IdentifiersResult) this.f31064b.get(StartupParamsCallback.APPMETRICA_UUID)).m20728e((IdentifiersResult) this.f31064b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).m20725d((IdentifiersResult) this.f31064b.get("appmetrica_device_id_hash")).m20713a((IdentifiersResult) this.f31064b.get("appmetrica_get_ad_url")).m20720b((IdentifiersResult) this.f31064b.get("appmetrica_report_ad_url")).m20727e(this.f31068f).m20734h((IdentifiersResult) this.f31064b.get("appmetrica_clids")).m20741j(AbstractC4550Hl.m19475a((Map) this.f31067e)).m20731f((IdentifiersResult) this.f31064b.get("appmetrica_google_adv_id")).m20732g((IdentifiersResult) this.f31064b.get("appmetrica_huawei_oaid")).m20740j((IdentifiersResult) this.f31064b.get("appmetrica_yandex_adv_id")).m20721b(this.f31069g).m20723c(this.f31074l.f32806d).m20724d(this.f31070h);
        C4754Q9 c4754q9 = this.f31075m;
        synchronized (c4754q9) {
            c4801s9 = c4754q9.f30659b;
        }
        c5298meM20724d.m20712a(c4801s9).m20875b();
    }

    public C4932Xk(C5298me c5298me, C4552I c4552i, C4819T3 c4819t3, C4948Yc c4948Yc, C5565x6 c5565x6, C4754Q9 c4754q9, C4730P9 c4730p9, C5282ln c5282ln) {
        HashSet hashSet = new HashSet();
        this.f31063a = hashSet;
        this.f31064b = new HashMap();
        this.f31065c = new C4860Uk();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f31071i = c5298me;
        this.f31072j = c4552i;
        this.f31073k = c4819t3;
        this.f31074l = c5565x6;
        this.f31075m = c4754q9;
        this.f31076n = c4730p9;
        this.f31077o = c5282ln;
        m20007c(c4948Yc.m20034a());
        m20000a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c5298me.m20742j());
        m20000a("appmetrica_device_id_hash", c5298me.m20738i());
        m20000a("appmetrica_get_ad_url", c5298me.m20726d());
        m20000a("appmetrica_report_ad_url", c5298me.m20729e());
        m20004b(c5298me.m20748o());
        m20000a("appmetrica_google_adv_id", c5298me.m20745l());
        m20000a("appmetrica_huawei_oaid", c5298me.m20746m());
        m20000a("appmetrica_yandex_adv_id", c5298me.m20751r());
        c5565x6.m21198a(c5298me.m20735h());
        c4754q9.m19742a(c5298me.m20743k());
        this.f31066d = c5298me.m20733g();
        String strM20739i = c5298me.m20739i((String) null);
        this.f31067e = strM20739i != null ? AbstractC4550Hl.m19476a(strM20739i) : null;
        this.f31069g = c5298me.m20718a(true);
        this.f31068f = c5298me.m20719b(0L);
        this.f31070h = c5298me.m20747n();
        m20006c();
    }

    /* renamed from: a */
    public final boolean m20001a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f31064b.get("appmetrica_clids");
        if (!m19999a(identifiersResult) && identifiersResult.f32948id.isEmpty()) {
            return AbstractC5182hn.m20514a((Map) this.f31067e);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m19999a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f32948id == null;
    }

    /* renamed from: a */
    public final void m20000a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f32948id)) {
            return;
        }
        this.f31064b.put(str, identifiersResult);
    }

    /* renamed from: a */
    public final synchronized boolean m20002a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f31064b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f31074l.f32805c.get(str2);
                }
                if (identifiersResult == null) {
                    C4801S9 c4801s9 = this.f31075m.f30659b;
                    if (!O90.m5963a(str2, "appmetrica_lib_ssl_enabled") || (bool = c4801s9.f30731a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c4801s9.f30732b;
                        String str3 = c4801s9.f30733c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new C6838sg();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f31069g || m19999a(identifiersResult) || (identifiersResult.f32948id.isEmpty() && !AbstractC5182hn.m20514a((Map) this.f31067e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f32948id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
