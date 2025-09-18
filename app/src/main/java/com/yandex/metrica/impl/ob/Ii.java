package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.ob.ResultReceiverC2939n0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class Ii implements Ki, InterfaceC2616a1 {
    static final Map<Hi, IParamsCallback.Reason> j = Collections.unmodifiableMap(new a());
    private final List<String> a;
    private final C2941n2 b;
    private final Ni c;
    private final Handler d;
    private Im e;
    private final ResultReceiverC2939n0.a f;
    private final Object g;
    private final Map<InterfaceC3236yi, List<String>> h;
    private Map<String, String> i;

    public class a extends HashMap<Hi, IParamsCallback.Reason> {
        public a() {
            put(Hi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(Hi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(Hi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    public class b implements ResultReceiverC2939n0.a {
        public b(Ii ii) {
        }

        @Override // com.yandex.metrica.impl.ob.ResultReceiverC2939n0.a
        public void a(int i, Bundle bundle) {
        }
    }

    public Ii(Context context, C2941n2 c2941n2, F9 f9, Handler handler) {
        this(c2941n2, new Ni(context, f9), handler);
    }

    private void f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry<InterfaceC3236yi, List<String>> entry : this.h.entrySet()) {
            List<String> value = entry.getValue();
            if (this.c.a((Collection<String>) value)) {
                weakHashMap.put(entry.getKey(), value);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC3236yi interfaceC3236yi = (InterfaceC3236yi) ((Map.Entry) it.next()).getKey();
            if (interfaceC3236yi != null) {
                a(interfaceC3236yi, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2616a1
    public long a() {
        return this.c.e();
    }

    public String b() {
        return this.c.c();
    }

    public Xa c() {
        return this.c.d();
    }

    public Il d() {
        return this.c.f();
    }

    public String e() {
        return this.c.g();
    }

    public void g() {
        boolean zB;
        synchronized (this.g) {
            try {
                Ni ni = this.c;
                synchronized (ni) {
                    zB = ni.b(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"));
                }
                if (zB) {
                    Map<String, String> map = this.i;
                    this.b.a(this.a, new ResultReceiverC2939n0(this.d, this.f), map);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ii(C2941n2 c2941n2, Ni ni, Handler handler) {
        this.a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.g = new Object();
        this.h = new WeakHashMap();
        this.b = c2941n2;
        this.c = ni;
        this.d = handler;
        this.f = new b(this);
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        C3032qi c3032qi = new C3032qi(iIdentifierCallback);
        synchronized (this.g) {
            try {
                this.c.a(map);
                if (this.h.isEmpty()) {
                    this.b.g();
                }
                this.h.put(c3032qi, list);
                if (this.c.b(list)) {
                    this.b.a(list, new ResultReceiverC2939n0(this.d, new Ji(this, c3032qi)), map);
                } else {
                    a(c3032qi, new Bundle());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str) {
        synchronized (this.g) {
            this.b.b(str);
        }
    }

    public void a(Bundle bundle, InterfaceC3236yi interfaceC3236yi) {
        synchronized (this.g) {
            try {
                this.c.a(bundle);
                f();
                f();
                if (interfaceC3236yi != null) {
                    a(interfaceC3236yi, bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Im im) {
        this.e = im;
    }

    public void a(List<String> list) {
        synchronized (this.g) {
            try {
                List<String> listB = this.c.b();
                if (U2.b(list)) {
                    if (!U2.b(listB)) {
                        this.c.a((List<String>) null);
                        this.b.a((List<String>) null);
                    }
                } else if (!U2.a(list, listB)) {
                    this.c.a(list);
                    this.b.a(list);
                } else {
                    this.b.a(listB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Map<String, String> map) {
        if (U2.b(map)) {
            return;
        }
        synchronized (this.g) {
            Map<String, String> mapI = C3240ym.i(map);
            this.i = mapI;
            this.b.a(mapI);
            this.c.a(mapI);
        }
    }

    public void a(String str) {
        synchronized (this.g) {
            this.b.a(str);
        }
    }

    public void a(Jl jl) {
        this.c.a(jl);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.yandex.metrica.impl.ob.InterfaceC3236yi r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 1
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r1 = r6.h
            boolean r1 = r1.containsKey(r7)
            if (r1 == 0) goto L99
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r1 = r6.h
            java.lang.Object r1 = r1.get(r7)
            java.util.List r1 = (java.util.List) r1
            com.yandex.metrica.impl.ob.Ni r2 = r6.c
            boolean r2 = r2.a(r1)
            r3 = 0
            if (r2 == 0) goto L2b
            if (r1 != 0) goto L1d
            goto L27
        L1d:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.yandex.metrica.impl.ob.Ni r8 = r6.c
            r8.a(r1, r3)
        L27:
            r7.onReceive(r3)
            goto L87
        L2b:
            java.lang.String r2 = "startup_error_key_code"
            boolean r4 = r8.containsKey(r2)
            if (r4 == 0) goto L45
            int r8 = r8.getInt(r2)
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.ob.Hi.UNKNOWN
            if (r8 == r0) goto L42
            r4 = 2
            if (r8 == r4) goto L3f
            goto L46
        L3f:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.ob.Hi.PARSE
            goto L46
        L42:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.ob.Hi.NETWORK
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 != 0) goto L65
            com.yandex.metrica.impl.ob.Ni r8 = r6.c
            boolean r8 = r8.a()
            if (r8 != 0) goto L63
            com.yandex.metrica.impl.ob.Im r8 = r6.e
            if (r8 == 0) goto L60
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.i
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "Clids error. Passed clids: %s, and clids from server are empty."
            r8.c(r4, r0)
        L60:
            com.yandex.metrica.IParamsCallback$Reason r8 = com.yandex.metrica.IParamsCallback.Reason.INCONSISTENT_CLIDS
            goto L66
        L63:
            com.yandex.metrica.impl.ob.Hi r2 = com.yandex.metrica.impl.ob.Hi.UNKNOWN
        L65:
            r8 = r3
        L66:
            if (r8 != 0) goto L77
            java.util.Map<com.yandex.metrica.impl.ob.Hi, com.yandex.metrica.IParamsCallback$Reason> r8 = com.yandex.metrica.impl.ob.Ii.j
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
            com.yandex.metrica.impl.ob.Ni r0 = r6.c
            r0.a(r1, r3)
        L84:
            r7.a(r8, r3)
        L87:
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r8 = r6.h
            r8.remove(r7)
            java.util.Map<com.yandex.metrica.impl.ob.yi, java.util.List<java.lang.String>> r7 = r6.h
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L99
            com.yandex.metrica.impl.ob.n2 r7 = r6.b
            r7.f()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ii.a(com.yandex.metrica.impl.ob.yi, android.os.Bundle):void");
    }
}
