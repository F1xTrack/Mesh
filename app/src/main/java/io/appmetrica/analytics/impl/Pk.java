package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class Pk implements Qk {
    public static final Map k = Collections.unmodifiableMap(new Mk());
    public final List a;
    public final Nh b;
    public final Xk c;
    public final Handler d;
    public PublicLogger e;
    public final Nk f;
    public final Object g;
    public final WeakHashMap h;
    public HashMap i;
    public boolean j;

    public Pk(Context context, Nh nh, C4719me c4719me, Handler handler) {
        this(nh, new Xk(context, c4719me), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.g) {
            try {
                Xk xk = this.c;
                xk.getClass();
                if (!hn.a((Map) map) && !hn.a(map, xk.e)) {
                    xk.e = new HashMap(map);
                    xk.g = true;
                    xk.c();
                }
                a(startupParamsCallback, list);
                if (this.c.a((List) list)) {
                    a(list, new Ok(this, startupParamsCallback), map);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Pk.b(android.os.Bundle):void");
    }

    public final A6 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final U9 e() {
        S9 s9;
        Xk xk = this.c;
        P9 p9 = xk.n;
        Q9 q9 = xk.m;
        synchronized (q9) {
            s9 = q9.b;
        }
        p9.getClass();
        Boolean bool = s9.a;
        return new U9();
    }

    public final long f() {
        return this.c.f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.g) {
            try {
                if (!this.j || this.c.b()) {
                    this.j = true;
                    a(this.a, this.f, this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Pk(Nh nh, Xk xk, Handler handler) {
        this.a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_device_id_hash", "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.g = new Object();
        this.h = new WeakHashMap();
        this.j = false;
        this.b = nh;
        this.c = xk;
        this.d = handler;
        this.f = new Nk(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    public final void a(List list, A6 a6, Map map) {
        B6 b6 = new B6(this.d, a6);
        Nh nh = this.b;
        nh.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Ua(b6, list, map));
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC4857s9.a;
        C4443b4 c4443b4 = new C4443b4("", "", 1536, 0, anonymousInstance);
        c4443b4.m = bundle;
        T4 t4 = nh.a;
        nh.a(Nh.a(c4443b4, t4), t4, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (hn.a((Map) map)) {
            return;
        }
        synchronized (this.g) {
            try {
                HashMap mapB = Hl.b(map);
                this.i = mapB;
                this.b.a(mapB);
                Xk xk = this.c;
                xk.getClass();
                if (!hn.a((Map) mapB) && !hn.a(mapB, xk.e)) {
                    xk.e = new HashMap(mapB);
                    xk.g = true;
                    xk.c();
                }
            } finally {
            }
        }
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Kk kk;
        if (this.h.containsKey(startupParamsCallback)) {
            List list = (List) this.h.get(startupParamsCallback);
            if (this.c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    kk = Kk.UNKNOWN;
                    if (i == 1) {
                        kk = Kk.NETWORK;
                    } else if (i == 2) {
                        kk = Kk.PARSE;
                    }
                } else {
                    kk = null;
                }
                if (kk == null) {
                    if (!this.c.a()) {
                        PublicLogger publicLogger = this.e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        kk = Kk.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(k, kk, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.h.remove(startupParamsCallback);
            if (this.h.isEmpty()) {
                C4562g0 c4562g0 = this.b.d;
                synchronized (c4562g0.f) {
                    c4562g0.c = false;
                    c4562g0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.g) {
            try {
                List list2 = this.c.d;
                if (hn.a((Collection) list)) {
                    if (!hn.a((Collection) list2)) {
                        Xk xk = this.c;
                        xk.d = null;
                        xk.i.a((List<String>) null);
                        this.b.a((List) null);
                    }
                } else if (!hn.a(list, list2)) {
                    Xk xk2 = this.c;
                    xk2.d = list;
                    xk2.i.a(list);
                    this.b.a(list);
                } else {
                    this.b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Xk xk = this.c;
        synchronized (xk) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) xk.b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, xk.c.a(identifiersResult));
                    }
                }
                xk.l.a(list, map);
                xk.m.a(list, map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(String str) {
        synchronized (this.g) {
            this.b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC4450bb.a(str);
        }
        return this.i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            C4562g0 c4562g0 = this.b.d;
            synchronized (c4562g0.f) {
                c4562g0.c = true;
                c4562g0.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        Xk xk = this.c;
        I i = xk.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) xk.b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) xk.b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) xk.b.get("appmetrica_yandex_adv_id");
        i.getClass();
        return new AdvIdentifiersResult(I.a(identifiersResult), I.a(identifiersResult2), I.a(identifiersResult3));
    }
}
