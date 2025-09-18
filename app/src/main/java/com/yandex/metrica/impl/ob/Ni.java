package com.yandex.metrica.impl.ob;

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

/* loaded from: classes2.dex */
public class Ni {
    private final Set<String> a;
    private final Map<String, C2766g1> b;
    private List<String> c;
    private Map<String, String> d;
    private long e;
    private boolean f;
    private Il g;
    private Xa h;
    private long i;
    private final List<Jl> j;
    private final F9 k;
    private final C3056ri l;
    private final C3106ti m;
    private final C3186wi n;

    public Ni(Context context, F9 f9) {
        this(f9, new C2957ni(), new C3056ri(), Fj.a(context).a(context, new Ij(f9)), new C3106ti(), new C3186wi(), new C3161vi());
    }

    private void b(String str, C2766g1 c2766g1) {
        if (a(c2766g1)) {
            return;
        }
        this.b.put(str, c2766g1);
    }

    private void h() {
        this.k.i(this.b.get("yandex_mobile_metrica_uuid")).e(this.b.get("yandex_mobile_metrica_device_id")).d(this.b.get("appmetrica_device_id_hash")).a(this.b.get("yandex_mobile_metrica_get_ad_url")).b(this.b.get("yandex_mobile_metrica_report_ad_url")).h(this.e).h(this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).q(C3240ym.c(this.d)).a(this.g).a(this.h).f(this.b.get("yandex_mobile_metrica_google_adv_id")).g(this.b.get("yandex_mobile_metrica_huawei_oaid")).j(this.b.get("yandex_mobile_metrica_yandex_adv_id")).d(this.f).c(this.m.a()).g(this.i).a(this.n.a()).c();
    }

    public void a(Map<String, String> map) {
        if (U2.b(map) || U2.a(map, this.d)) {
            return;
        }
        this.d = new HashMap(map);
        this.f = true;
        h();
    }

    public String c() {
        C2766g1 c2766g1 = this.b.get("yandex_mobile_metrica_device_id");
        if (c2766g1 == null) {
            return null;
        }
        return c2766g1.a;
    }

    public Xa d() {
        return this.h;
    }

    public long e() {
        return this.e;
    }

    public Il f() {
        return this.g;
    }

    public String g() {
        C2766g1 c2766g1 = this.b.get("yandex_mobile_metrica_uuid");
        if (c2766g1 == null) {
            return null;
        }
        return c2766g1.a;
    }

    private boolean b(C2766g1 c2766g1) {
        return c2766g1 == null || TextUtils.isEmpty(c2766g1.a);
    }

    public Ni(F9 f9, C2957ni c2957ni, C3056ri c3056ri, Ej ej, C3106ti c3106ti, C3186wi c3186wi, C3161vi c3161vi) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new HashMap();
        this.j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.k = f9;
        this.l = c3056ri;
        this.m = c3106ti;
        this.n = c3186wi;
        a("yandex_mobile_metrica_uuid", ej.a());
        a("yandex_mobile_metrica_device_id", f9.k());
        a("appmetrica_device_id_hash", f9.j());
        a("yandex_mobile_metrica_get_ad_url", f9.e());
        a("yandex_mobile_metrica_report_ad_url", f9.f());
        b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, f9.q());
        a("yandex_mobile_metrica_google_adv_id", f9.n());
        a("yandex_mobile_metrica_huawei_oaid", f9.o());
        a("yandex_mobile_metrica_yandex_adv_id", f9.u());
        c3106ti.a(f9.i());
        c3186wi.a(f9.m());
        this.c = f9.h();
        String strJ = f9.j((String) null);
        this.d = strJ != null ? C3240ym.a(strJ) : null;
        this.f = f9.b(true);
        this.e = f9.d(0L);
        this.g = f9.s();
        this.h = f9.l();
        this.i = f9.p();
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Collection r0 = com.yandex.metrica.impl.ob.Oi.a(r7)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L27
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L29
        Le:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L29
            java.util.Set<java.lang.String> r4 = r6.a     // Catch: java.lang.Throwable -> L29
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
            long r4 = r6.i     // Catch: java.lang.Throwable -> L27
            boolean r1 = com.yandex.metrica.impl.ob.Oi.a(r4)     // Catch: java.lang.Throwable -> L27
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L27
            com.yandex.metrica.impl.ob.Il r4 = r6.g     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            boolean r4 = r4.a()     // Catch: java.lang.Throwable -> L40
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
            boolean r7 = r6.f     // Catch: java.lang.Throwable -> L27
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ni.b(java.util.List):boolean");
    }

    public boolean a() {
        C2766g1 c2766g1 = this.b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!a(c2766g1) && c2766g1.a.isEmpty()) {
            return U2.b(this.d);
        }
        return true;
    }

    private void a(String str, C2766g1 c2766g1) {
        if (b(c2766g1)) {
            return;
        }
        this.b.put(str, c2766g1);
    }

    private boolean a(C2766g1 c2766g1) {
        return c2766g1 == null || c2766g1.a == null;
    }

    public List<String> b() {
        return this.c;
    }

    public synchronized void a(List<String> list, Map<String, C2766g1> map) {
        try {
            for (String str : list) {
                C2766g1 c2766g1 = this.b.get(str);
                if (c2766g1 != null) {
                    map.put(str, c2766g1);
                }
            }
            this.m.a(list, map);
            this.n.a(list, map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean a(Collection<String> collection) {
        try {
            for (String str : collection) {
                C2766g1 c2766g1A = this.b.get(str);
                if (c2766g1A == null) {
                    c2766g1A = this.m.b().get(str);
                }
                if (c2766g1A == null) {
                    c2766g1A = this.n.a(str);
                }
                if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str)) {
                    if (this.f || a(c2766g1A) || (c2766g1A.a.isEmpty() && !U2.b(this.d))) {
                        return false;
                    }
                } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str)) {
                    if (c2766g1A == null) {
                        return false;
                    }
                } else if (b(c2766g1A)) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ni.a(android.os.Bundle):void");
    }

    public synchronized void a(Jl jl) {
        this.j.add(jl);
    }

    public void a(List<String> list) {
        this.c = list;
        this.k.b(list);
    }
}
