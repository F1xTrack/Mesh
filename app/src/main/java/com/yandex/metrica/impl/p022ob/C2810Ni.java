package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Ni */
/* loaded from: classes2.dex */
public class C2810Ni {

    /* renamed from: a */
    private final Set<String> f21813a;

    /* renamed from: b */
    private final Map<String, C3273g1> f21814b;

    /* renamed from: c */
    private List<String> f21815c;

    /* renamed from: d */
    private Map<String, String> f21816d;

    /* renamed from: e */
    private long f21817e;

    /* renamed from: f */
    private boolean f21818f;

    /* renamed from: g */
    private C2688Il f21819g;

    /* renamed from: h */
    private C3051Xa f21820h;

    /* renamed from: i */
    private long f21821i;

    /* renamed from: j */
    private final List<InterfaceC2713Jl> f21822j;

    /* renamed from: k */
    private final C2601F9 f21823k;

    /* renamed from: l */
    private final C3576ri f21824l;

    /* renamed from: m */
    private final C3628ti f21825m;

    /* renamed from: n */
    private final C3706wi f21826n;

    public C2810Ni(Context context, C2601F9 c2601f9) {
        this(c2601f9, new C3472ni(), new C3576ri(), C2611Fj.m14141a(context).m14142a(context, new C2686Ij(c2601f9)), new C3628ti(), new C3706wi(), new C3680vi());
    }

    /* renamed from: b */
    private void m14651b(String str, C3273g1 c3273g1) {
        if (m14650a(c3273g1)) {
            return;
        }
        this.f21814b.put(str, c3273g1);
    }

    /* renamed from: h */
    private void m14653h() {
        this.f21823k.m14100i(this.f21814b.get("yandex_mobile_metrica_uuid")).m14087e(this.f21814b.get("yandex_mobile_metrica_device_id")).m14084d(this.f21814b.get("appmetrica_device_id_hash")).m14071a(this.f21814b.get("yandex_mobile_metrica_get_ad_url")).m14077b(this.f21814b.get("yandex_mobile_metrica_report_ad_url")).m14097h(this.f21817e).m14098h(this.f21814b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).m14118q(C3762ym.m17295c(this.f21816d)).m14069a(this.f21819g).m14070a(this.f21820h).m14090f(this.f21814b.get("yandex_mobile_metrica_google_adv_id")).m14094g(this.f21814b.get("yandex_mobile_metrica_huawei_oaid")).m14103j(this.f21814b.get("yandex_mobile_metrica_yandex_adv_id")).m14085d(this.f21818f).m14081c(this.f21825m.m16867a()).m14093g(this.f21821i).m14072a(this.f21826n.m17145a()).m14258c();
    }

    /* renamed from: a */
    public void m14658a(Map<String, String> map) {
        if (C2968U2.m15250b(map) || C2968U2.m15245a(map, this.f21816d)) {
            return;
        }
        this.f21816d = new HashMap(map);
        this.f21818f = true;
        m14653h();
    }

    /* renamed from: c */
    public String m14663c() {
        C3273g1 c3273g1 = this.f21814b.get("yandex_mobile_metrica_device_id");
        if (c3273g1 == null) {
            return null;
        }
        return c3273g1.f23462a;
    }

    /* renamed from: d */
    public C3051Xa m14664d() {
        return this.f21820h;
    }

    /* renamed from: e */
    public long m14665e() {
        return this.f21817e;
    }

    /* renamed from: f */
    public C2688Il m14666f() {
        return this.f21819g;
    }

    /* renamed from: g */
    public String m14667g() {
        C3273g1 c3273g1 = this.f21814b.get("yandex_mobile_metrica_uuid");
        if (c3273g1 == null) {
            return null;
        }
        return c3273g1.f23462a;
    }

    /* renamed from: b */
    private boolean m14652b(C3273g1 c3273g1) {
        return c3273g1 == null || TextUtils.isEmpty(c3273g1.f23462a);
    }

    public C2810Ni(C2601F9 c2601f9, C3472ni c3472ni, C3576ri c3576ri, C2586Ej c2586Ej, C3628ti c3628ti, C3706wi c3706wi, C3680vi c3680vi) {
        HashSet hashSet = new HashSet();
        this.f21813a = hashSet;
        this.f21814b = new HashMap();
        this.f21822j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f21823k = c2601f9;
        this.f21824l = c3576ri;
        this.f21825m = c3628ti;
        this.f21826n = c3706wi;
        m14649a("yandex_mobile_metrica_uuid", c2586Ej.m14045a());
        m14649a("yandex_mobile_metrica_device_id", c2601f9.m14106k());
        m14649a("appmetrica_device_id_hash", c2601f9.m14104j());
        m14649a("yandex_mobile_metrica_get_ad_url", c2601f9.m14088e());
        m14649a("yandex_mobile_metrica_report_ad_url", c2601f9.m14091f());
        m14651b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, c2601f9.m14119q());
        m14649a("yandex_mobile_metrica_google_adv_id", c2601f9.m14113n());
        m14649a("yandex_mobile_metrica_huawei_oaid", c2601f9.m14115o());
        m14649a("yandex_mobile_metrica_yandex_adv_id", c2601f9.m14125u());
        c3628ti.m16868a(c2601f9.m14101i());
        c3706wi.m17146a(c2601f9.m14110m());
        this.f21815c = c2601f9.m14099h();
        String strM14105j = c2601f9.m14105j((String) null);
        this.f21816d = strM14105j != null ? C3762ym.m17274a(strM14105j) : null;
        this.f21818f = c2601f9.m14079b(true);
        this.f21817e = c2601f9.m14083d(0L);
        this.f21819g = c2601f9.m14123s();
        this.f21820h = c2601f9.m14108l();
        this.f21821i = c2601f9.m14116p();
        m14653h();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0050  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m14662b(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Collection r0 = com.yandex.metrica.impl.p022ob.C2835Oi.m14713a(r7)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r6.m14660a(r0)     // Catch: java.lang.Throwable -> L27
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L29
        Le:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L29
            java.util.Set<java.lang.String> r4 = r6.f21813a     // Catch: java.lang.Throwable -> L29
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            r7 = r3
            goto L2d
        L27:
            r7 = move-exception
            goto L57
        L29:
            r7 = move-exception
            goto L55
        L2b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            r7 = r2
        L2d:
            long r4 = r6.f21821i     // Catch: java.lang.Throwable -> L27
            boolean r1 = com.yandex.metrica.impl.p022ob.C2835Oi.m14714a(r4)     // Catch: java.lang.Throwable -> L27
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L27
            com.yandex.metrica.impl.ob.Il r4 = r6.f21819g     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            boolean r4 = r4.m14368a()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            r4 = r3
            goto L43
        L40:
            r7 = move-exception
            goto L53
        L42:
            r4 = r2
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L50
            if (r7 != 0) goto L50
            if (r1 != 0) goto L50
            boolean r7 = r6.f21818f     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L50
            if (r4 != 0) goto L51
        L50:
            r2 = r3
        L51:
            monitor-exit(r6)
            return r2
        L53:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            throw r7     // Catch: java.lang.Throwable -> L27
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            throw r7     // Catch: java.lang.Throwable -> L27
        L57:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2810Ni.m14662b(java.util.List):boolean");
    }

    /* renamed from: a */
    public boolean m14659a() {
        C3273g1 c3273g1 = this.f21814b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!m14650a(c3273g1) && c3273g1.f23462a.isEmpty()) {
            return C2968U2.m15250b(this.f21816d);
        }
        return true;
    }

    /* renamed from: a */
    private void m14649a(String str, C3273g1 c3273g1) {
        if (m14652b(c3273g1)) {
            return;
        }
        this.f21814b.put(str, c3273g1);
    }

    /* renamed from: a */
    private boolean m14650a(C3273g1 c3273g1) {
        return c3273g1 == null || c3273g1.f23462a == null;
    }

    /* renamed from: b */
    public List<String> m14661b() {
        return this.f21815c;
    }

    /* renamed from: a */
    public synchronized void m14657a(List<String> list, Map<String, C3273g1> map) {
        try {
            for (String str : list) {
                C3273g1 c3273g1 = this.f21814b.get(str);
                if (c3273g1 != null) {
                    map.put(str, c3273g1);
                }
            }
            this.f21825m.m16869a(list, map);
            this.f21826n.m17147a(list, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized boolean m14660a(Collection<String> collection) {
        try {
            for (String str : collection) {
                C3273g1 c3273g1M17144a = this.f21814b.get(str);
                if (c3273g1M17144a == null) {
                    c3273g1M17144a = this.f21825m.m16870b().get(str);
                }
                if (c3273g1M17144a == null) {
                    c3273g1M17144a = this.f21826n.m17144a(str);
                }
                if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str)) {
                    if (this.f21818f || m14650a(c3273g1M17144a) || (c3273g1M17144a.f23462a.isEmpty() && !C2968U2.m15250b(this.f21816d))) {
                        return false;
                    }
                } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str)) {
                    if (c3273g1M17144a == null) {
                        return false;
                    }
                } else if (m14652b(c3273g1M17144a)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00b0 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:138:0x008c, B:140:0x0096, B:142:0x009e, B:147:0x00a4, B:148:0x00a5, B:149:0x00a6, B:151:0x00b0, B:153:0x00b8, B:156:0x00bb, B:157:0x00bc, B:141:0x0097, B:152:0x00b1), top: B:203:0x008c, outer: #1, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bd A[Catch: all -> 0x0032, DONT_GENERATE, TRY_ENTER, TryCatch #1 {, blocks: (B:111:0x0001, B:112:0x0006, B:135:0x0078, B:136:0x0079, B:137:0x008b, B:158:0x00bd, B:159:0x00be, B:160:0x00c2, B:162:0x00c5, B:163:0x00c6, B:170:0x00e4, B:172:0x00ed, B:175:0x00f8, B:176:0x0106, B:188:0x0135, B:189:0x0136, B:192:0x0141, B:193:0x0142, B:173:0x00f2, B:166:0x00d4, B:168:0x00da, B:169:0x00e0, B:195:0x0144, B:196:0x0145, B:197:0x0146, B:198:0x0147, B:199:0x0148, B:200:0x0149, B:138:0x008c, B:140:0x0096, B:142:0x009e, B:147:0x00a4, B:148:0x00a5, B:149:0x00a6, B:151:0x00b0, B:153:0x00b8, B:156:0x00bb, B:157:0x00bc, B:141:0x0097, B:152:0x00b1, B:161:0x00c3, B:177:0x0107, B:179:0x010d, B:181:0x0113, B:182:0x011b, B:184:0x0121, B:187:0x012f, B:113:0x0007, B:115:0x001b, B:118:0x0023, B:120:0x0029, B:127:0x0037, B:129:0x0041, B:131:0x0048, B:133:0x0052, B:134:0x0057), top: B:204:0x0001, inners: #0, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m14654a(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2810Ni.m14654a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public synchronized void m14655a(InterfaceC2713Jl interfaceC2713Jl) {
        this.f21822j.add(interfaceC2713Jl);
    }

    /* renamed from: a */
    public void m14656a(List<String> list) {
        this.f21815c = list;
        this.f21823k.m14078b(list);
    }
}
