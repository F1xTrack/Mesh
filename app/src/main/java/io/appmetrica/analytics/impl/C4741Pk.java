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

/* renamed from: io.appmetrica.analytics.impl.Pk */
/* loaded from: classes2.dex */
public final class C4741Pk implements InterfaceC4765Qk {

    /* renamed from: k */
    public static final Map f30626k = Collections.unmodifiableMap(new C4669Mk());

    /* renamed from: a */
    public final List f30627a;

    /* renamed from: b */
    public final C4690Nh f30628b;

    /* renamed from: c */
    public final C4932Xk f30629c;

    /* renamed from: d */
    public final Handler f30630d;

    /* renamed from: e */
    public PublicLogger f30631e;

    /* renamed from: f */
    public final C4693Nk f30632f;

    /* renamed from: g */
    public final Object f30633g;

    /* renamed from: h */
    public final WeakHashMap f30634h;

    /* renamed from: i */
    public HashMap f30635i;

    /* renamed from: j */
    public boolean f30636j;

    public C4741Pk(Context context, C4690Nh c4690Nh, C5298me c5298me, Handler handler) {
        this(c4690Nh, new C4932Xk(context, c5298me), handler);
    }

    /* renamed from: a */
    public final void m19715a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f30633g) {
            try {
                C4932Xk c4932Xk = this.f30629c;
                c4932Xk.getClass();
                if (!AbstractC5182hn.m20514a((Map) map) && !AbstractC5182hn.m20512a(map, c4932Xk.f31067e)) {
                    c4932Xk.f31067e = new HashMap(map);
                    c4932Xk.f31069g = true;
                    c4932Xk.m20006c();
                }
                m19714a(startupParamsCallback, list);
                if (this.f30629c.m20003a((List) list)) {
                    m19718a(list, new C4717Ok(this, startupParamsCallback), map);
                } else {
                    m19713a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m19721b(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4741Pk.m19721b(android.os.Bundle):void");
    }

    /* renamed from: c */
    public final InterfaceC4363A6 m19725c() {
        return this.f30632f;
    }

    /* renamed from: d */
    public final String m19726d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f30629c.f31064b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f32948id;
    }

    /* renamed from: e */
    public final C4849U9 m19727e() {
        C4801S9 c4801s9;
        C4932Xk c4932Xk = this.f30629c;
        C4730P9 c4730p9 = c4932Xk.f31076n;
        C4754Q9 c4754q9 = c4932Xk.f31075m;
        synchronized (c4754q9) {
            c4801s9 = c4754q9.f30659b;
        }
        c4730p9.getClass();
        Boolean bool = c4801s9.f30731a;
        return new C4849U9();
    }

    /* renamed from: f */
    public final long m19728f() {
        return this.f30629c.f31068f;
    }

    /* renamed from: g */
    public final String m19729g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f30629c.f31064b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f32948id;
    }

    /* renamed from: h */
    public final void m19730h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f30634h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f30629c.m20002a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                m19713a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: i */
    public final void m19731i() {
        synchronized (this.f30633g) {
            try {
                if (!this.f30636j || this.f30629c.m20005b()) {
                    this.f30636j = true;
                    m19718a(this.f30627a, this.f30632f, this.f30635i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C4741Pk(C4690Nh c4690Nh, C4932Xk c4932Xk, Handler handler) {
        this.f30627a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_device_id_hash", "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f30633g = new Object();
        this.f30634h = new WeakHashMap();
        this.f30636j = false;
        this.f30628b = c4690Nh;
        this.f30629c = c4932Xk;
        this.f30630d = handler;
        this.f30632f = new C4693Nk(this);
    }

    /* renamed from: a */
    public final void m19712a(Bundle bundle) {
        m19722b(bundle, null);
    }

    /* renamed from: a */
    public final void m19716a(PublicLogger publicLogger) {
        this.f30631e = publicLogger;
    }

    /* renamed from: a */
    public final void m19718a(List list, InterfaceC4363A6 interfaceC4363A6, Map map) {
        ResultReceiverC4388B6 resultReceiverC4388B6 = new ResultReceiverC4388B6(this.f30630d, interfaceC4363A6);
        C4690Nh c4690Nh = this.f30628b;
        c4690Nh.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C4850Ua(resultReceiverC4388B6, list, map));
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC5443s9.f32553a;
        C5013b4 c5013b4 = new C5013b4("", "", 1536, 0, anonymousInstance);
        c5013b4.f30773m = bundle;
        C4820T4 c4820t4 = c4690Nh.f30522a;
        c4690Nh.m19663a(C4690Nh.m19660a(c5013b4, c4820t4), c4820t4, 1, null);
    }

    /* renamed from: a */
    public final void m19719a(Map<String, String> map) {
        if (AbstractC5182hn.m20514a((Map) map)) {
            return;
        }
        synchronized (this.f30633g) {
            try {
                HashMap mapM19478b = AbstractC4550Hl.m19478b(map);
                this.f30635i = mapM19478b;
                this.f30628b.m19665a(mapM19478b);
                C4932Xk c4932Xk = this.f30629c;
                c4932Xk.getClass();
                if (!AbstractC5182hn.m20514a((Map) mapM19478b) && !AbstractC5182hn.m20512a(mapM19478b, c4932Xk.f31067e)) {
                    c4932Xk.f31067e = new HashMap(mapM19478b);
                    c4932Xk.f31069g = true;
                    c4932Xk.m20006c();
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public final void m19717a(String str) {
        synchronized (this.f30633g) {
            this.f30628b.m19664a(str);
        }
    }

    /* renamed from: a */
    public final void m19713a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC4621Kk enumC4621Kk;
        if (this.f30634h.containsKey(startupParamsCallback)) {
            List list = (List) this.f30634h.get(startupParamsCallback);
            if (this.f30629c.m20002a((Collection) list)) {
                startupParamsCallback.onReceive(m19711a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    enumC4621Kk = EnumC4621Kk.UNKNOWN;
                    if (i == 1) {
                        enumC4621Kk = EnumC4621Kk.NETWORK;
                    } else if (i == 2) {
                        enumC4621Kk = EnumC4621Kk.PARSE;
                    }
                } else {
                    enumC4621Kk = null;
                }
                if (enumC4621Kk == null) {
                    if (!this.f30629c.m20001a()) {
                        PublicLogger publicLogger = this.f30631e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f30635i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        enumC4621Kk = EnumC4621Kk.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f30626k, enumC4621Kk, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, m19711a(list));
            }
            this.f30634h.remove(startupParamsCallback);
            if (this.f30634h.isEmpty()) {
                C5134g0 c5134g0 = this.f30628b.f30525d;
                synchronized (c5134g0.f31711f) {
                    c5134g0.f31708c = false;
                    c5134g0.m20404c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m19722b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f30633g) {
            try {
                m19721b(bundle);
                m19730h();
                if (startupParamsCallback != null) {
                    m19713a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m19724b(List<String> list) {
        synchronized (this.f30633g) {
            try {
                List list2 = this.f30629c.f31066d;
                if (AbstractC5182hn.m20513a((Collection) list)) {
                    if (!AbstractC5182hn.m20513a((Collection) list2)) {
                        C4932Xk c4932Xk = this.f30629c;
                        c4932Xk.f31066d = null;
                        c4932Xk.f31071i.m20715a((List<String>) null);
                        this.f30628b.m19666a((List) null);
                    }
                } else if (!AbstractC5182hn.m20512a(list, list2)) {
                    C4932Xk c4932Xk2 = this.f30629c;
                    c4932Xk2.f31066d = list;
                    c4932Xk2.f31071i.m20715a(list);
                    this.f30628b.m19666a(list);
                } else {
                    this.f30628b.m19666a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final StartupParamsCallback.Result m19711a(List list) {
        HashMap map = new HashMap();
        C4932Xk c4932Xk = this.f30629c;
        synchronized (c4932Xk) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c4932Xk.f31064b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, c4932Xk.f31065c.m19894a(identifiersResult));
                    }
                }
                c4932Xk.f31074l.m21199a(list, map);
                c4932Xk.f31075m.m19743a(list, map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    /* renamed from: b */
    public final void m19723b(String str) {
        synchronized (this.f30633g) {
            this.f30628b.m19667b(str);
        }
    }

    /* renamed from: b */
    public final Map<String, String> m19720b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f30629c.f31064b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f32948id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC5020bb.m20173a(str);
        }
        return this.f30635i;
    }

    /* renamed from: a */
    public final void m19714a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f30634h.isEmpty()) {
            C5134g0 c5134g0 = this.f30628b.f30525d;
            synchronized (c5134g0.f31711f) {
                c5134g0.f31708c = true;
                c5134g0.m20403b();
            }
        }
        this.f30634h.put(startupParamsCallback, list);
    }

    /* renamed from: a */
    public final AdvIdentifiersResult m19710a() {
        C4932Xk c4932Xk = this.f30629c;
        C4552I c4552i = c4932Xk.f31072j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c4932Xk.f31064b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c4932Xk.f31064b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c4932Xk.f31064b.get("appmetrica_yandex_adv_id");
        c4552i.getClass();
        return new AdvIdentifiersResult(C4552I.m19480a(identifiersResult), C4552I.m19480a(identifiersResult2), C4552I.m19480a(identifiersResult3));
    }
}
