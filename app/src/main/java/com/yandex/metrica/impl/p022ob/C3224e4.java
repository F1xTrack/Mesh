package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2466A;
import io.appmetrica.analytics.impl.C4931Xj;
import io.appmetrica.analytics.impl.C5094ea;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.e4 */
/* loaded from: classes2.dex */
public class C3224e4 {

    /* renamed from: a */
    private final C3250f4 f23293a;

    /* renamed from: b */
    private final C3520pe f23294b;

    /* renamed from: c */
    private List<j> f23295c;

    /* renamed from: com.yandex.metrica.impl.ob.e4$b */
    public static class b {

        /* renamed from: a */
        private final C3250f4 f23296a;

        public b(C3250f4 c3250f4) {
            this.f23296a = c3250f4;
        }

        /* renamed from: a */
        public C3224e4 m15819a(C3520pe c3520pe) {
            return new C3224e4(this.f23296a, c3520pe);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$c */
    public static class c extends j {

        /* renamed from: b */
        private final C3624te f23297b;

        /* renamed from: c */
        private final C2626G9 f23298c;

        public c(C3250f4 c3250f4) {
            super(c3250f4);
            this.f23297b = new C3624te(c3250f4.m15908g(), c3250f4.m15906e().toString());
            this.f23298c = c3250f4.m15907f();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            C3746y6 c3746y6 = new C3746y6(this.f23298c, "background");
            if (!c3746y6.m17229h()) {
                long jM16855c = this.f23297b.m16855c(-1L);
                if (jM16855c != -1) {
                    c3746y6.m17223d(jM16855c);
                }
                long jM16850a = this.f23297b.m16850a(Long.MIN_VALUE);
                if (jM16850a != Long.MIN_VALUE) {
                    c3746y6.m17216a(jM16850a);
                }
                long jM16853b = this.f23297b.m16853b(0L);
                if (jM16853b != 0) {
                    c3746y6.m17221c(jM16853b);
                }
                long jM16856d = this.f23297b.m16856d(0L);
                if (jM16856d != 0) {
                    c3746y6.m17225e(jM16856d);
                }
                c3746y6.m17220b();
            }
            C3746y6 c3746y62 = new C3746y6(this.f23298c, C5094ea.f31575g);
            if (!c3746y62.m17229h()) {
                long jM16860g = this.f23297b.m16860g(-1L);
                if (-1 != jM16860g) {
                    c3746y62.m17223d(jM16860g);
                }
                boolean zBooleanValue = this.f23297b.m16852a(true).booleanValue();
                if (zBooleanValue) {
                    c3746y62.m17217a(zBooleanValue);
                }
                long jM16857e = this.f23297b.m16857e(Long.MIN_VALUE);
                if (jM16857e != Long.MIN_VALUE) {
                    c3746y62.m17216a(jM16857e);
                }
                long jM16858f = this.f23297b.m16858f(0L);
                if (jM16858f != 0) {
                    c3746y62.m17221c(jM16858f);
                }
                long jM16862h = this.f23297b.m16862h(0L);
                if (jM16862h != 0) {
                    c3746y62.m17225e(jM16862h);
                }
                c3746y62.m17220b();
            }
            C2466A.a aVarM16859f = this.f23297b.m16859f();
            if (aVarM16859f != null) {
                this.f23298c.m14164a(aVarM16859f);
            }
            String strM16854b = this.f23297b.m16854b((String) null);
            if (!TextUtils.isEmpty(strM16854b) && TextUtils.isEmpty(this.f23298c.m14183m())) {
                this.f23298c.m14178i(strM16854b);
            }
            long jM16864i = this.f23297b.m16864i(Long.MIN_VALUE);
            if (jM16864i != Long.MIN_VALUE && this.f23298c.m14166b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f23298c.m14167c(jM16864i);
            }
            this.f23297b.m16863h();
            this.f23298c.m14258c();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return this.f23297b.m16861g();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$d */
    public static class d extends k {
        public d(C3250f4 c3250f4, C3520pe c3520pe) {
            super(c3250f4, c3520pe);
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            m15823d().m16580a();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return m15822a() instanceof C3484o4;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$e */
    public static class e extends j {

        /* renamed from: b */
        private final C3546qe f23299b;

        /* renamed from: c */
        private final C2576E9 f23300c;

        public e(C3250f4 c3250f4, C3546qe c3546qe) {
            super(c3250f4);
            this.f23299b = c3546qe;
            this.f23300c = c3250f4.m15916o();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            if ("DONE".equals(this.f23299b.m16611c(null))) {
                this.f23300c.m14042i();
            }
            if ("DONE".equals(this.f23299b.m16613d(null))) {
                this.f23300c.m14043j();
            }
            this.f23299b.m16616h();
            this.f23299b.m16615g();
            this.f23299b.m16617i();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return "DONE".equals(this.f23299b.m16611c(null)) || "DONE".equals(this.f23299b.m16613d(null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$f */
    public static class f extends k {
        public f(C3250f4 c3250f4, C3520pe c3520pe) {
            super(c3250f4, c3520pe);
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            C3520pe c3520peM15823d = m15823d();
            if (m15822a() instanceof C3484o4) {
                c3520peM15823d.m16582b();
            } else {
                c3520peM15823d.m16583c();
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return m15822a().m15916o().m14038f(null) == null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$g */
    public static class g extends j {

        /* renamed from: b */
        private final C2676I9 f23301b;

        public g(C3250f4 c3250f4, C2676I9 c2676i9) {
            super(c3250f4);
            this.f23301b = c2676i9;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            if (this.f23301b.m14250a(new C3754ye("REFERRER_HANDLED", null).m17234a(), false)) {
                m15822a().m15907f().m14186p();
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$h */
    public static class h extends j {

        /* renamed from: c */
        @Deprecated
        static final C3754ye f23302c = new C3754ye(C4931Xj.f31054d, null);

        /* renamed from: d */
        @Deprecated
        static final C3754ye f23303d = new C3754ye(C4931Xj.f31056f, null);

        /* renamed from: e */
        @Deprecated
        static final C3754ye f23304e = new C3754ye(C4931Xj.f31057g, null);

        /* renamed from: f */
        @Deprecated
        static final C3754ye f23305f = new C3754ye(C4931Xj.f31058h, null);

        /* renamed from: g */
        @Deprecated
        static final C3754ye f23306g = new C3754ye(C4931Xj.f31059i, null);

        /* renamed from: h */
        @Deprecated
        static final C3754ye f23307h = new C3754ye("BG_SESSION_ID", null);

        /* renamed from: i */
        @Deprecated
        static final C3754ye f23308i = new C3754ye("BG_SESSION_SLEEP_START", null);

        /* renamed from: j */
        @Deprecated
        static final C3754ye f23309j = new C3754ye("BG_SESSION_COUNTER_ID", null);

        /* renamed from: k */
        @Deprecated
        static final C3754ye f23310k = new C3754ye("BG_SESSION_INIT_TIME", null);

        /* renamed from: l */
        @Deprecated
        static final C3754ye f23311l = new C3754ye("BG_SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* renamed from: b */
        private final C2626G9 f23312b;

        public h(C3250f4 c3250f4) {
            super(c3250f4);
            this.f23312b = c3250f4.m15907f();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            C2626G9 c2626g9 = this.f23312b;
            C3754ye c3754ye = f23308i;
            long jM14247a = c2626g9.m14247a(c3754ye.m17234a(), -2147483648L);
            if (jM14247a != -2147483648L) {
                C3746y6 c3746y6 = new C3746y6(this.f23312b, "background");
                if (!c3746y6.m17229h()) {
                    if (jM14247a != 0) {
                        c3746y6.m17225e(jM14247a);
                    }
                    long jM14247a2 = this.f23312b.m14247a(f23307h.m17234a(), -1L);
                    if (jM14247a2 != -1) {
                        c3746y6.m17223d(jM14247a2);
                    }
                    boolean zM14250a = this.f23312b.m14250a(f23311l.m17234a(), true);
                    if (zM14250a) {
                        c3746y6.m17217a(zM14250a);
                    }
                    long jM14247a3 = this.f23312b.m14247a(f23310k.m17234a(), Long.MIN_VALUE);
                    if (jM14247a3 != Long.MIN_VALUE) {
                        c3746y6.m17216a(jM14247a3);
                    }
                    long jM14247a4 = this.f23312b.m14247a(f23309j.m17234a(), 0L);
                    if (jM14247a4 != 0) {
                        c3746y6.m17221c(jM14247a4);
                    }
                    c3746y6.m17220b();
                }
            }
            C2626G9 c2626g92 = this.f23312b;
            C3754ye c3754ye2 = f23302c;
            long jM14247a5 = c2626g92.m14247a(c3754ye2.m17234a(), -2147483648L);
            if (jM14247a5 != -2147483648L) {
                C3746y6 c3746y62 = new C3746y6(this.f23312b, C5094ea.f31575g);
                if (!c3746y62.m17229h()) {
                    if (jM14247a5 != 0) {
                        c3746y62.m17225e(jM14247a5);
                    }
                    long jM14247a6 = this.f23312b.m14247a(f23303d.m17234a(), -1L);
                    if (-1 != jM14247a6) {
                        c3746y62.m17223d(jM14247a6);
                    }
                    boolean zM14250a2 = this.f23312b.m14250a(f23306g.m17234a(), true);
                    if (zM14250a2) {
                        c3746y62.m17217a(zM14250a2);
                    }
                    long jM14247a7 = this.f23312b.m14247a(f23305f.m17234a(), Long.MIN_VALUE);
                    if (jM14247a7 != Long.MIN_VALUE) {
                        c3746y62.m17216a(jM14247a7);
                    }
                    long jM14247a8 = this.f23312b.m14247a(f23304e.m17234a(), 0L);
                    if (jM14247a8 != 0) {
                        c3746y62.m17221c(jM14247a8);
                    }
                    c3746y62.m17220b();
                }
            }
            this.f23312b.m14261e(c3754ye2.m17234a());
            this.f23312b.m14261e(f23303d.m17234a());
            this.f23312b.m14261e(f23304e.m17234a());
            this.f23312b.m14261e(f23305f.m17234a());
            this.f23312b.m14261e(f23306g.m17234a());
            this.f23312b.m14261e(f23307h.m17234a());
            this.f23312b.m14261e(c3754ye.m17234a());
            this.f23312b.m14261e(f23309j.m17234a());
            this.f23312b.m14261e(f23310k.m17234a());
            this.f23312b.m14261e(f23311l.m17234a());
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$i */
    public static class i extends j {

        /* renamed from: b */
        private final C2576E9 f23313b;

        /* renamed from: c */
        private final C2626G9 f23314c;

        /* renamed from: d */
        private final C2675I8 f23315d;

        /* renamed from: e */
        private final String f23316e;

        /* renamed from: f */
        private final String f23317f;

        /* renamed from: g */
        private final String f23318g;

        /* renamed from: h */
        private final String f23319h;

        /* renamed from: i */
        private final String f23320i;

        public i(C3250f4 c3250f4) {
            super(c3250f4);
            this.f23316e = new C3754ye("LAST_REQUEST_ID").m17234a();
            this.f23317f = new C3754ye("NEXT_EVENT_GLOBAL_NUMBER").m17234a();
            this.f23318g = new C3754ye("CURRENT_SESSION_ID").m17234a();
            this.f23319h = new C3754ye("ATTRIBUTION_ID").m17234a();
            this.f23320i = new C3754ye("OPEN_ID").m17234a();
            this.f23313b = c3250f4.m15916o();
            this.f23314c = c3250f4.m15907f();
            this.f23315d = c3250f4.m15923w();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f23314c.m14260d()) {
                if (str.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(str.substring(21))), this.f23314c.m14246a(str, 0));
                        this.f23314c.m14261e(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f23315d.m14285a(this.f23313b.m14037e(), this.f23313b.m14039f(), this.f23314c.m14256b(this.f23316e) ? Integer.valueOf(this.f23314c.m14246a(this.f23316e, -1)) : null, this.f23314c.m14256b(this.f23317f) ? Integer.valueOf(this.f23314c.m14246a(this.f23317f, 0)) : null, this.f23314c.m14256b(this.f23318g) ? Long.valueOf(this.f23314c.m14247a(this.f23318g, -1L)) : null, this.f23314c.m14189s(), jSONObject, this.f23314c.m14256b(this.f23320i) ? Integer.valueOf(this.f23314c.m14246a(this.f23320i, 1)) : null, this.f23314c.m14256b(this.f23319h) ? Integer.valueOf(this.f23314c.m14246a(this.f23319h, 1)) : null, this.f23314c.m14179i());
            this.f23313b.m14040g().m14041h().m14258c();
            this.f23314c.m14188r().m14187q().m14261e(this.f23316e).m14261e(this.f23317f).m14261e(this.f23318g).m14261e(this.f23319h).m14261e(this.f23320i).m14258c();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$j */
    public static abstract class j {

        /* renamed from: a */
        private final C3250f4 f23321a;

        public j(C3250f4 c3250f4) {
            this.f23321a = c3250f4;
        }

        /* renamed from: a */
        public C3250f4 m15822a() {
            return this.f23321a;
        }

        /* renamed from: b */
        public abstract void mo15820b();

        /* renamed from: c */
        public abstract boolean mo15821c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$k */
    public static abstract class k extends j {

        /* renamed from: b */
        private C3520pe f23322b;

        public k(C3250f4 c3250f4, C3520pe c3520pe) {
            super(c3250f4);
            this.f23322b = c3520pe;
        }

        /* renamed from: d */
        public C3520pe m15823d() {
            return this.f23322b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$l */
    public static class l extends j {

        /* renamed from: b */
        private final C2576E9 f23323b;

        public l(C3250f4 c3250f4) {
            super(c3250f4);
            this.f23323b = c3250f4.m15916o();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: b */
        public void mo15820b() {
            this.f23323b.m14261e(new C3754ye("first_event_description_key", null).m17234a()).m14258c();
        }

        @Override // com.yandex.metrica.impl.p022ob.C3224e4.j
        /* renamed from: c */
        public boolean mo15821c() {
            return true;
        }
    }

    /* renamed from: b */
    private void m15817b() {
        LinkedList linkedList = new LinkedList();
        this.f23295c = linkedList;
        linkedList.add(new d(this.f23293a, this.f23294b));
        this.f23295c.add(new f(this.f23293a, this.f23294b));
        List<j> list = this.f23295c;
        C3250f4 c3250f4 = this.f23293a;
        list.add(new e(c3250f4, c3250f4.m15915n()));
        this.f23295c.add(new c(this.f23293a));
        this.f23295c.add(new h(this.f23293a));
        List<j> list2 = this.f23295c;
        C3250f4 c3250f42 = this.f23293a;
        list2.add(new g(c3250f42, c3250f42.m15920t()));
        this.f23295c.add(new l(this.f23293a));
        this.f23295c.add(new i(this.f23293a));
    }

    /* renamed from: a */
    public void m15818a() {
        if (C3520pe.f24448b.values().contains(this.f23293a.m15906e().m15700a())) {
            return;
        }
        for (j jVar : this.f23295c) {
            if (jVar.mo15821c()) {
                jVar.mo15820b();
            }
        }
    }

    private C3224e4(C3250f4 c3250f4, C3520pe c3520pe) {
        this.f23293a = c3250f4;
        this.f23294b = c3520pe;
        m15817b();
    }
}
