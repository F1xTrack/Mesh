package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.A;
import io.appmetrica.analytics.impl.C4524ea;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2719e4 {
    private final C2744f4 a;
    private final C3003pe b;
    private List<j> c;

    /* renamed from: com.yandex.metrica.impl.ob.e4$b */
    public static class b {
        private final C2744f4 a;

        public b(C2744f4 c2744f4) {
            this.a = c2744f4;
        }

        public C2719e4 a(C3003pe c3003pe) {
            return new C2719e4(this.a, c3003pe);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$c */
    public static class c extends j {
        private final C3102te b;
        private final G9 c;

        public c(C2744f4 c2744f4) {
            super(c2744f4);
            this.b = new C3102te(c2744f4.g(), c2744f4.e().toString());
            this.c = c2744f4.f();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            C3224y6 c3224y6 = new C3224y6(this.c, "background");
            if (!c3224y6.h()) {
                long jC = this.b.c(-1L);
                if (jC != -1) {
                    c3224y6.d(jC);
                }
                long jA = this.b.a(Long.MIN_VALUE);
                if (jA != Long.MIN_VALUE) {
                    c3224y6.a(jA);
                }
                long jB = this.b.b(0L);
                if (jB != 0) {
                    c3224y6.c(jB);
                }
                long jD = this.b.d(0L);
                if (jD != 0) {
                    c3224y6.e(jD);
                }
                c3224y6.b();
            }
            C3224y6 c3224y62 = new C3224y6(this.c, C4524ea.g);
            if (!c3224y62.h()) {
                long jG = this.b.g(-1L);
                if (-1 != jG) {
                    c3224y62.d(jG);
                }
                boolean zBooleanValue = this.b.a(true).booleanValue();
                if (zBooleanValue) {
                    c3224y62.a(zBooleanValue);
                }
                long jE = this.b.e(Long.MIN_VALUE);
                if (jE != Long.MIN_VALUE) {
                    c3224y62.a(jE);
                }
                long jF = this.b.f(0L);
                if (jF != 0) {
                    c3224y62.c(jF);
                }
                long jH = this.b.h(0L);
                if (jH != 0) {
                    c3224y62.e(jH);
                }
                c3224y62.b();
            }
            A.a aVarF = this.b.f();
            if (aVarF != null) {
                this.c.a(aVarF);
            }
            String strB = this.b.b((String) null);
            if (!TextUtils.isEmpty(strB) && TextUtils.isEmpty(this.c.m())) {
                this.c.i(strB);
            }
            long jI = this.b.i(Long.MIN_VALUE);
            if (jI != Long.MIN_VALUE && this.c.b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.c.c(jI);
            }
            this.b.h();
            this.c.c();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return this.b.g();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$d */
    public static class d extends k {
        public d(C2744f4 c2744f4, C3003pe c3003pe) {
            super(c2744f4, c3003pe);
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            d().a();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return a() instanceof C2968o4;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$e */
    public static class e extends j {
        private final C3028qe b;
        private final E9 c;

        public e(C2744f4 c2744f4, C3028qe c3028qe) {
            super(c2744f4);
            this.b = c3028qe;
            this.c = c2744f4.o();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            if ("DONE".equals(this.b.c(null))) {
                this.c.i();
            }
            if ("DONE".equals(this.b.d(null))) {
                this.c.j();
            }
            this.b.h();
            this.b.g();
            this.b.i();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return "DONE".equals(this.b.c(null)) || "DONE".equals(this.b.d(null));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$f */
    public static class f extends k {
        public f(C2744f4 c2744f4, C3003pe c3003pe) {
            super(c2744f4, c3003pe);
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            C3003pe c3003peD = d();
            if (a() instanceof C2968o4) {
                c3003peD.b();
            } else {
                c3003peD.c();
            }
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return a().o().f(null) == null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$g */
    public static class g extends j {
        private final I9 b;

        public g(C2744f4 c2744f4, I9 i9) {
            super(c2744f4);
            this.b = i9;
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            if (this.b.a(new C3232ye("REFERRER_HANDLED", null).a(), false)) {
                a().f().p();
            }
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$h */
    public static class h extends j {

        @Deprecated
        static final C3232ye c = new C3232ye(io.appmetrica.analytics.impl.Xj.d, null);

        @Deprecated
        static final C3232ye d = new C3232ye(io.appmetrica.analytics.impl.Xj.f, null);

        @Deprecated
        static final C3232ye e = new C3232ye(io.appmetrica.analytics.impl.Xj.g, null);

        @Deprecated
        static final C3232ye f = new C3232ye(io.appmetrica.analytics.impl.Xj.h, null);

        @Deprecated
        static final C3232ye g = new C3232ye(io.appmetrica.analytics.impl.Xj.i, null);

        @Deprecated
        static final C3232ye h = new C3232ye("BG_SESSION_ID", null);

        @Deprecated
        static final C3232ye i = new C3232ye("BG_SESSION_SLEEP_START", null);

        @Deprecated
        static final C3232ye j = new C3232ye("BG_SESSION_COUNTER_ID", null);

        @Deprecated
        static final C3232ye k = new C3232ye("BG_SESSION_INIT_TIME", null);

        @Deprecated
        static final C3232ye l = new C3232ye("BG_SESSION_IS_ALIVE_REPORT_NEEDED", null);
        private final G9 b;

        public h(C2744f4 c2744f4) {
            super(c2744f4);
            this.b = c2744f4.f();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            G9 g9 = this.b;
            C3232ye c3232ye = i;
            long jA = g9.a(c3232ye.a(), -2147483648L);
            if (jA != -2147483648L) {
                C3224y6 c3224y6 = new C3224y6(this.b, "background");
                if (!c3224y6.h()) {
                    if (jA != 0) {
                        c3224y6.e(jA);
                    }
                    long jA2 = this.b.a(h.a(), -1L);
                    if (jA2 != -1) {
                        c3224y6.d(jA2);
                    }
                    boolean zA = this.b.a(l.a(), true);
                    if (zA) {
                        c3224y6.a(zA);
                    }
                    long jA3 = this.b.a(k.a(), Long.MIN_VALUE);
                    if (jA3 != Long.MIN_VALUE) {
                        c3224y6.a(jA3);
                    }
                    long jA4 = this.b.a(j.a(), 0L);
                    if (jA4 != 0) {
                        c3224y6.c(jA4);
                    }
                    c3224y6.b();
                }
            }
            G9 g92 = this.b;
            C3232ye c3232ye2 = c;
            long jA5 = g92.a(c3232ye2.a(), -2147483648L);
            if (jA5 != -2147483648L) {
                C3224y6 c3224y62 = new C3224y6(this.b, C4524ea.g);
                if (!c3224y62.h()) {
                    if (jA5 != 0) {
                        c3224y62.e(jA5);
                    }
                    long jA6 = this.b.a(d.a(), -1L);
                    if (-1 != jA6) {
                        c3224y62.d(jA6);
                    }
                    boolean zA2 = this.b.a(g.a(), true);
                    if (zA2) {
                        c3224y62.a(zA2);
                    }
                    long jA7 = this.b.a(f.a(), Long.MIN_VALUE);
                    if (jA7 != Long.MIN_VALUE) {
                        c3224y62.a(jA7);
                    }
                    long jA8 = this.b.a(e.a(), 0L);
                    if (jA8 != 0) {
                        c3224y62.c(jA8);
                    }
                    c3224y62.b();
                }
            }
            this.b.e(c3232ye2.a());
            this.b.e(d.a());
            this.b.e(e.a());
            this.b.e(f.a());
            this.b.e(g.a());
            this.b.e(h.a());
            this.b.e(c3232ye.a());
            this.b.e(j.a());
            this.b.e(k.a());
            this.b.e(l.a());
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$i */
    public static class i extends j {
        private final E9 b;
        private final G9 c;
        private final I8 d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;
        private final String i;

        public i(C2744f4 c2744f4) {
            super(c2744f4);
            this.e = new C3232ye("LAST_REQUEST_ID").a();
            this.f = new C3232ye("NEXT_EVENT_GLOBAL_NUMBER").a();
            this.g = new C3232ye("CURRENT_SESSION_ID").a();
            this.h = new C3232ye("ATTRIBUTION_ID").a();
            this.i = new C3232ye("OPEN_ID").a();
            this.b = c2744f4.o();
            this.c = c2744f4.f();
            this.d = c2744f4.w();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.c.d()) {
                if (str.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(str.substring(21))), this.c.a(str, 0));
                        this.c.e(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.d.a(this.b.e(), this.b.f(), this.c.b(this.e) ? Integer.valueOf(this.c.a(this.e, -1)) : null, this.c.b(this.f) ? Integer.valueOf(this.c.a(this.f, 0)) : null, this.c.b(this.g) ? Long.valueOf(this.c.a(this.g, -1L)) : null, this.c.s(), jSONObject, this.c.b(this.i) ? Integer.valueOf(this.c.a(this.i, 1)) : null, this.c.b(this.h) ? Integer.valueOf(this.c.a(this.h, 1)) : null, this.c.i());
            this.b.g().h().c();
            this.c.r().q().e(this.e).e(this.f).e(this.g).e(this.h).e(this.i).c();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$j */
    public static abstract class j {
        private final C2744f4 a;

        public j(C2744f4 c2744f4) {
            this.a = c2744f4;
        }

        public C2744f4 a() {
            return this.a;
        }

        public abstract void b();

        public abstract boolean c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$k */
    public static abstract class k extends j {
        private C3003pe b;

        public k(C2744f4 c2744f4, C3003pe c3003pe) {
            super(c2744f4);
            this.b = c3003pe;
        }

        public C3003pe d() {
            return this.b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e4$l */
    public static class l extends j {
        private final E9 b;

        public l(C2744f4 c2744f4) {
            super(c2744f4);
            this.b = c2744f4.o();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public void b() {
            this.b.e(new C3232ye("first_event_description_key", null).a()).c();
        }

        @Override // com.yandex.metrica.impl.ob.C2719e4.j
        public boolean c() {
            return true;
        }
    }

    private void b() {
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.add(new d(this.a, this.b));
        this.c.add(new f(this.a, this.b));
        List<j> list = this.c;
        C2744f4 c2744f4 = this.a;
        list.add(new e(c2744f4, c2744f4.n()));
        this.c.add(new c(this.a));
        this.c.add(new h(this.a));
        List<j> list2 = this.c;
        C2744f4 c2744f42 = this.a;
        list2.add(new g(c2744f42, c2744f42.t()));
        this.c.add(new l(this.a));
        this.c.add(new i(this.a));
    }

    public void a() {
        if (C3003pe.b.values().contains(this.a.e().a())) {
            return;
        }
        for (j jVar : this.c) {
            if (jVar.c()) {
                jVar.b();
            }
        }
    }

    private C2719e4(C2744f4 c2744f4, C3003pe c3003pe) {
        this.a = c2744f4;
        this.b = c3003pe;
        b();
    }
}
