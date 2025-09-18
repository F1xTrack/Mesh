package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p022ob.ResultReceiverC3454n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.metrica.impl.ob.Ii */
/* loaded from: classes2.dex */
public class C2685Ii implements InterfaceC2735Ki, InterfaceC3117a1 {

    /* renamed from: j */
    static final Map<EnumC2660Hi, IParamsCallback.Reason> f21435j = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private final List<String> f21436a;

    /* renamed from: b */
    private final C3456n2 f21437b;

    /* renamed from: c */
    private final C2810Ni f21438c;

    /* renamed from: d */
    private final Handler f21439d;

    /* renamed from: e */
    private C2689Im f21440e;

    /* renamed from: f */
    private final ResultReceiverC3454n0.a f21441f;

    /* renamed from: g */
    private final Object f21442g;

    /* renamed from: h */
    private final Map<InterfaceC3758yi, List<String>> f21443h;

    /* renamed from: i */
    private Map<String, String> f21444i;

    /* renamed from: com.yandex.metrica.impl.ob.Ii$a */
    public class a extends HashMap<EnumC2660Hi, IParamsCallback.Reason> {
        public a() {
            put(EnumC2660Hi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(EnumC2660Hi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(EnumC2660Hi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ii$b */
    public class b implements ResultReceiverC3454n0.a {
        public b(C2685Ii c2685Ii) {
        }

        @Override // com.yandex.metrica.impl.p022ob.ResultReceiverC3454n0.a
        /* renamed from: a */
        public void mo14366a(int i, Bundle bundle) {
        }
    }

    public C2685Ii(Context context, C3456n2 c3456n2, C2601F9 c2601f9, Handler handler) {
        this(c3456n2, new C2810Ni(context, c2601f9), handler);
    }

    /* renamed from: f */
    private void m14351f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry<InterfaceC3758yi, List<String>> entry : this.f21443h.entrySet()) {
            List<String> value = entry.getValue();
            if (this.f21438c.m14660a((Collection<String>) value)) {
                weakHashMap.put(entry.getKey(), value);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC3758yi interfaceC3758yi = (InterfaceC3758yi) ((Map.Entry) it.next()).getKey();
            if (interfaceC3758yi != null) {
                m14350a(interfaceC3758yi, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3117a1
    /* renamed from: a */
    public long mo14352a() {
        return this.f21438c.m14665e();
    }

    /* renamed from: b */
    public String m14360b() {
        return this.f21438c.m14663c();
    }

    /* renamed from: c */
    public C3051Xa m14362c() {
        return this.f21438c.m14664d();
    }

    /* renamed from: d */
    public C2688Il m14363d() {
        return this.f21438c.m14666f();
    }

    /* renamed from: e */
    public String m14364e() {
        return this.f21438c.m14667g();
    }

    /* renamed from: g */
    public void m14365g() {
        boolean zM14662b;
        synchronized (this.f21442g) {
            try {
                C2810Ni c2810Ni = this.f21438c;
                synchronized (c2810Ni) {
                    zM14662b = c2810Ni.m14662b(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"));
                }
                if (zM14662b) {
                    Map<String, String> map = this.f21444i;
                    this.f21437b.m16460a(this.f21436a, new ResultReceiverC3454n0(this.f21439d, this.f21441f), map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2685Ii(C3456n2 c3456n2, C2810Ni c2810Ni, Handler handler) {
        this.f21436a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.f21442g = new Object();
        this.f21443h = new WeakHashMap();
        this.f21437b = c3456n2;
        this.f21438c = c2810Ni;
        this.f21439d = handler;
        this.f21441f = new b(this);
    }

    /* renamed from: a */
    public void m14354a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        C3550qi c3550qi = new C3550qi(iIdentifierCallback);
        synchronized (this.f21442g) {
            try {
                this.f21438c.m14658a(map);
                if (this.f21443h.isEmpty()) {
                    this.f21437b.m16473g();
                }
                this.f21443h.put(c3550qi, list);
                if (this.f21438c.m14662b(list)) {
                    this.f21437b.m16460a(list, new ResultReceiverC3454n0(this.f21439d, new C2710Ji(this, c3550qi)), map);
                } else {
                    m14350a(c3550qi, new Bundle());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m14361b(String str) {
        synchronized (this.f21442g) {
            this.f21437b.m16466b(str);
        }
    }

    /* renamed from: a */
    public void m14353a(Bundle bundle, InterfaceC3758yi interfaceC3758yi) {
        synchronized (this.f21442g) {
            try {
                this.f21438c.m14654a(bundle);
                m14351f();
                m14351f();
                if (interfaceC3758yi != null) {
                    m14350a(interfaceC3758yi, bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m14355a(C2689Im c2689Im) {
        this.f21440e = c2689Im;
    }

    /* renamed from: a */
    public void m14358a(List<String> list) {
        synchronized (this.f21442g) {
            try {
                List<String> listM14661b = this.f21438c.m14661b();
                if (C2968U2.m15249b(list)) {
                    if (!C2968U2.m15249b(listM14661b)) {
                        this.f21438c.m14656a((List<String>) null);
                        this.f21437b.m16459a((List<String>) null);
                    }
                } else if (!C2968U2.m15245a(list, listM14661b)) {
                    this.f21438c.m14656a(list);
                    this.f21437b.m16459a(list);
                } else {
                    this.f21437b.m16459a(listM14661b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m14359a(Map<String, String> map) {
        if (C2968U2.m15250b(map)) {
            return;
        }
        synchronized (this.f21442g) {
            Map<String, String> mapM17307i = C3762ym.m17307i(map);
            this.f21444i = mapM17307i;
            this.f21437b.m16461a(mapM17307i);
            this.f21438c.m14658a(mapM17307i);
        }
    }

    /* renamed from: a */
    public void m14357a(String str) {
        synchronized (this.f21442g) {
            this.f21437b.m16456a(str);
        }
    }

    /* renamed from: a */
    public void m14356a(InterfaceC2713Jl interfaceC2713Jl) {
        this.f21438c.m14655a(interfaceC2713Jl);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14350a(com.yandex.metrica.impl.p022ob.InterfaceC3758yi r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 1
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r1 = r6.f21443h
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L99
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r1 = r6.f21443h
            java.lang.Object r1 = r1.get(r7)
            java.util.List r1 = (java.util.List) r1
            com.yandex.metrica.impl.ob.Ni r2 = r6.f21438c
            boolean r2 = r2.m14660a(r1)
            r3 = 0
            if (r2 == 0) goto L2b
            if (r1 != 0) goto L1d
            goto L27
        L1d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = r6.f21438c
            r8.m14657a(r1, r3)
        L27:
            r7.onReceive(r3)
            goto L87
        L2b:
            java.lang.String r2 = "startup_error_key_code"
            boolean r4 = r8.containsKey(r2)
            if (r4 == 0) goto L45
            int r8 = r8.getInt(r2)
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.p022ob.EnumC2660Hi.UNKNOWN
            if (r8 == r0) goto L42
            r4 = 2
            if (r8 == r4) goto L3f
            goto L46
        L3f:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.p022ob.EnumC2660Hi.PARSE
            goto L46
        L42:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.p022ob.EnumC2660Hi.NETWORK
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 != 0) goto L65
            com.yandex.metrica.impl.ob.Ni r8 = r6.f21438c
            boolean r8 = r8.m14659a()
            if (r8 != 0) goto L63
            com.yandex.metrica.impl.ob.Im r8 = r6.f21440e
            if (r8 == 0) goto L60
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f21444i
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.m17369c(r4, r0)
        L60:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L66
        L63:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.p022ob.EnumC2660Hi.UNKNOWN
        L65:
            r8 = r3
        L66:
            if (r8 != 0) goto L77
            java.util.Map<com.yandex.metrica.impl.ob.Hi, com.yandex.metrica.IParamsCallback$Reason> r8 = com.yandex.metrica.impl.p022ob.C2685Ii.f21435j
            com.yandex.metrica.IParamsCallback$Reason r0 = com.yandex.metrica.IParamsCallback.Reason.UNKNOWN
            java.lang.Object r8 = r8.get(r2)
            if (r8 != 0) goto L73
            goto L74
        L73:
            r0 = r8
        L74:
            r8 = r0
            com.yandex.metrica.IParamsCallback$Reason r8 = (com.yandex.metrica.IParamsCallback.Reason) r8
        L77:
            if (r1 != 0) goto L7a
            goto L84
        L7a:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.yandex.metrica.impl.ob.Ni r0 = r6.f21438c
            r0.m14657a(r1, r3)
        L84:
            r7.mo16630a(r8, r3)
        L87:
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r8 = r6.f21443h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r7 = r6.f21443h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L99
            com.yandex.metrica.impl.ob.n2 r7 = r6.f21437b
            r7.m16472f()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2685Ii.m14350a(com.yandex.metrica.impl.ob.yi, android.os.Bundle):void");
    }
}
