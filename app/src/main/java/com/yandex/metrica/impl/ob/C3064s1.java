package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.C2789h;
import com.yandex.metrica.impl.ob.C3217y;
import com.yandex.metrica.impl.ob.C3242z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3064s1 extends J implements U0 {
    private final com.yandex.metrica.m p;
    private final Cg q;
    private final com.yandex.metrica.y r;
    private final Ii s;
    private C2789h t;
    private final Zl u;
    private final C3242z v;
    private final AtomicBoolean w;
    private final E3 x;
    private final R7 y;
    private static final uo<String> z = new ro(new po("Referral url"));
    private static final Long A = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: com.yandex.metrica.impl.ob.s1$a */
    public class a implements C2789h.b {
        final /* synthetic */ InterfaceExecutorC3086sn a;
        final /* synthetic */ C2940n1 b;
        final /* synthetic */ S2 c;
        final /* synthetic */ S2 d;

        /* renamed from: com.yandex.metrica.impl.ob.s1$a$a, reason: collision with other inner class name */
        public class RunnableC0018a implements Runnable {
            final /* synthetic */ C2722e7 a;

            public RunnableC0018a(C2722e7 c2722e7) {
                this.a = c2722e7;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3064s1.this.a(this.a);
                if (a.this.b.a(this.a.a.f)) {
                    a.this.c.a().a(this.a);
                }
                if (a.this.b.b(this.a.a.f)) {
                    a.this.d.a().a(this.a);
                }
            }
        }

        public a(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2940n1 c2940n1, S2 s2, S2 s22) {
            this.a = interfaceExecutorC3086sn;
            this.b = c2940n1;
            this.c = s2;
            this.d = s22;
        }

        @Override // com.yandex.metrica.impl.ob.C2789h.b
        public void a() {
            C2722e7 c2722e7A = C3064s1.this.x.a();
            ((C3061rn) this.a).execute(new RunnableC0018a(c2722e7A));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$b */
    public class b implements com.yandex.metrica.j {
        public b() {
        }

        @Override // com.yandex.metrica.j
        public void a() {
            C3064s1 c3064s1 = C3064s1.this;
            c3064s1.i.a(c3064s1.b.a());
        }

        @Override // com.yandex.metrica.j
        public void b() {
            C3064s1 c3064s1 = C3064s1.this;
            c3064s1.i.b(c3064s1.b.a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$c */
    public static class c {
        public Zl a(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, F9 f9, C3064s1 c3064s1, Ii ii) {
            return new Zl(context, f9, c3064s1, interfaceExecutorC3086sn, ii.d());
        }
    }

    public C3064s1(Context context, U3 u3, com.yandex.metrica.y yVar, C2941n2 c2941n2, R7 r7, Ii ii, S2 s2, S2 s22, F9 f9, Cg cg, Y y, K0 k0) {
        C2866k2 c2866k2 = new C2866k2(u3, new CounterConfiguration(yVar, com.yandex.metrica.c.MAIN), yVar.userProfileID);
        if (yVar.sessionTimeout == null) {
            TimeUnit.SECONDS.toMillis(10L);
        }
        this(context, yVar, c2941n2, r7, c2866k2, new com.yandex.metrica.m(), cg, ii, new C2940n1(), y.j(), s2, s22, f9, y.c(), k0, new c(), new C3242z(), new C3210xh(), new C3185wh(yVar.appVersion, null), new C2622a7(k0), new F7(), new A7(), new C3120u7(), new C3070s7());
    }

    private void h() {
        this.i.a(this.b.a());
        com.yandex.metrica.m mVar = this.p;
        b bVar = new b();
        long jLongValue = A.longValue();
        synchronized (mVar) {
            mVar.b.add(new com.yandex.metrica.l(bVar, mVar.a, jLongValue));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(boolean z2) {
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void b(Activity activity) {
        if (this.v.a(activity, C3242z.a.PAUSED)) {
            d(activity != null ? activity.getClass().getSimpleName() : null);
            com.yandex.metrica.m mVar = this.p;
            synchronized (mVar) {
                Iterator it = mVar.b.iterator();
                while (it.hasNext()) {
                    com.yandex.metrica.l lVar = (com.yandex.metrica.l) it.next();
                    if (!lVar.d) {
                        lVar.d = true;
                        lVar.a.a(lVar.e, lVar.c);
                    }
                }
            }
            if (activity != null) {
                this.u.a(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.J, com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void c(String str, String str2) {
        super.c(str, str2);
        this.y.a(this.b.c.a());
    }

    public final void g() {
        if (this.w.compareAndSet(false, true)) {
            this.t.c();
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str, boolean z2) {
        if (this.c.c()) {
            this.c.b("App opened via deeplink: " + f(str));
        }
        this.i.a(J0.a("open", str, z2, this.c), this.b);
    }

    public C3064s1(Context context, com.yandex.metrica.y yVar, C2941n2 c2941n2, R7 r7, C2866k2 c2866k2, com.yandex.metrica.m mVar, Cg cg, Ii ii, C2940n1 c2940n1, Hm hm, S2 s2, S2 s22, F9 f9, InterfaceExecutorC3086sn interfaceExecutorC3086sn, K0 k0, c cVar, C3242z c3242z, C3210xh c3210xh, C3185wh c3185wh, C2622a7 c2622a7, F7 f7, A7 a7, C3120u7 c3120u7, C3070s7 c3070s7) {
        super(context, c2941n2, c2866k2, k0, hm, c3210xh.a(c2941n2.b(), yVar.apiKey, true), c3185wh, f7, a7, c3120u7, c3070s7, c2622a7);
        this.w = new AtomicBoolean(false);
        this.x = new E3();
        this.b.a(a(yVar));
        this.p = mVar;
        this.q = cg;
        this.y = r7;
        this.r = yVar;
        this.v = c3242z;
        Zl zlA = cVar.a(context, interfaceExecutorC3086sn, f9, this, ii);
        this.u = zlA;
        this.s = ii;
        ii.a(zlA);
        a(yVar.nativeCrashReporting, this.b);
        ii.b();
        cg.a();
        this.t = a(interfaceExecutorC3086sn, c2940n1, s2, s22);
        if (C2814i.a(yVar.h)) {
            g();
        }
        h();
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(String str) {
        ((ro) z).a(str);
        this.i.a(J0.a("referral", str, false, this.c), this.b);
        if (this.c.c()) {
            this.c.b("Referral URL received: " + f(str));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void b(boolean z2) {
        this.b.b().k(z2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2861jm
    public void b(JSONObject jSONObject) {
        C2941n2 c2941n2 = this.i;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S(jSONObject.toString(), "view_tree", EnumC2865k1.EVENT_TYPE_VIEW_TREE.b(), 0, im), this.b);
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(C3217y.c cVar) {
        if (cVar == C3217y.c.WATCHING) {
            if (this.c.c()) {
                this.c.b("Enable activity auto tracking");
            }
        } else if (this.c.c()) {
            this.c.c("Could not enable activity auto tracking. " + cVar.a);
        }
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Activity activity) {
        if (this.v.a(activity, C3242z.a.RESUMED)) {
            e(activity != null ? activity.getClass().getSimpleName() : null);
            com.yandex.metrica.m mVar = this.p;
            synchronized (mVar) {
                Iterator it = mVar.b.iterator();
                while (it.hasNext()) {
                    com.yandex.metrica.l lVar = (com.yandex.metrica.l) it.next();
                    if (lVar.d) {
                        lVar.d = false;
                        lVar.a.a(lVar.e);
                        lVar.b.b();
                    }
                }
            }
            if (activity != null) {
                this.u.b(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(Location location) {
        this.b.b().b(location);
        if (this.c.c()) {
            this.c.a("Set location: %s", location);
        }
    }

    private C2789h a(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2940n1 c2940n1, S2 s2, S2 s22) {
        return new C2789h(new a(interfaceExecutorC3086sn, c2940n1, s2, s22));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2861jm
    public void a(JSONObject jSONObject) {
        C2941n2 c2941n2 = this.i;
        Im im = this.c;
        List<Integer> list = J0.i;
        c2941n2.a(new S(jSONObject.toString(), "view_tree", EnumC2865k1.EVENT_TYPE_RAW_VIEW_TREE.b(), 0, im), this.b);
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(Ol ol, boolean z2) {
        this.u.a(ol, z2);
    }

    @Override // com.yandex.metrica.impl.ob.U0
    public void a(X2 x2) {
        x2.a(this.c);
    }

    private void a(Boolean bool, C2866k2 c2866k2) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        this.y.a(bool.booleanValue(), c2866k2.b().a(), c2866k2.c.a());
        if (this.c.c()) {
            this.c.a("Set report native crashes enabled: %b", bool);
        }
    }

    private Pe a(com.yandex.metrica.y yVar) {
        return new Pe(yVar.preloadInfo, this.c, Boolean.FALSE.booleanValue());
    }
}
