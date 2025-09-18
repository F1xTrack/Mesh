package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.C3793l;
import com.yandex.metrica.C3794m;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.EnumC2458c;
import com.yandex.metrica.InterfaceC3791j;
import com.yandex.metrica.impl.p022ob.C3297h;
import com.yandex.metrica.impl.p022ob.C3739y;
import com.yandex.metrica.impl.p022ob.C3765z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.s1 */
/* loaded from: classes2.dex */
public class C3585s1 extends AbstractC2691J implements InterfaceC2966U0 {

    /* renamed from: p */
    private final C3794m f24630p;

    /* renamed from: q */
    private final C2533Cg f24631q;

    /* renamed from: r */
    private final C3806y f24632r;

    /* renamed from: s */
    private final C2685Ii f24633s;

    /* renamed from: t */
    private C3297h f24634t;

    /* renamed from: u */
    private final C3112Zl f24635u;

    /* renamed from: v */
    private final C3765z f24636v;

    /* renamed from: w */
    private final AtomicBoolean f24637w;

    /* renamed from: x */
    private final C2570E3 f24638x;

    /* renamed from: y */
    private final C2898R7 f24639y;

    /* renamed from: z */
    private static final InterfaceC3660uo<String> f24629z = new C3582ro(new C3530po("Referral url"));

    /* renamed from: A */
    private static final Long f24628A = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: com.yandex.metrica.impl.ob.s1$a */
    public class a implements C3297h.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceExecutorC3607sn f24640a;

        /* renamed from: b */
        final /* synthetic */ C3455n1 f24641b;

        /* renamed from: c */
        final /* synthetic */ C2918S2 f24642c;

        /* renamed from: d */
        final /* synthetic */ C2918S2 f24643d;

        /* renamed from: com.yandex.metrica.impl.ob.s1$a$a, reason: collision with other inner class name */
        public class RunnableC7312a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C3227e7 f24645a;

            public RunnableC7312a(C3227e7 c3227e7) {
                this.f24645a = c3227e7;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3585s1.this.mo14375a(this.f24645a);
                if (a.this.f24641b.m16439a(this.f24645a.f23327a.f24250f)) {
                    a.this.f24642c.mo15106a().mo14375a(this.f24645a);
                }
                if (a.this.f24641b.m16440b(this.f24645a.f23327a.f24250f)) {
                    a.this.f24643d.mo15106a().mo14375a(this.f24645a);
                }
            }
        }

        public a(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3455n1 c3455n1, C2918S2 c2918s2, C2918S2 c2918s22) {
            this.f24640a = interfaceExecutorC3607sn;
            this.f24641b = c3455n1;
            this.f24642c = c2918s2;
            this.f24643d = c2918s22;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3297h.b
        /* renamed from: a */
        public void mo16024a() {
            C3227e7 c3227e7M14029a = C3585s1.this.f24638x.m14029a();
            ((C3581rn) this.f24640a).execute(new RunnableC7312a(c3227e7M14029a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$b */
    public class b implements InterfaceC3791j {
        public b() {
        }

        @Override // com.yandex.metrica.InterfaceC3791j
        /* renamed from: a */
        public void mo16715a() {
            C3585s1 c3585s1 = C3585s1.this;
            c3585s1.f21468i.m16444a(c3585s1.f21461b.m15167a());
        }

        @Override // com.yandex.metrica.InterfaceC3791j
        /* renamed from: b */
        public void mo16716b() {
            C3585s1 c3585s1 = C3585s1.this;
            c3585s1.f21468i.m16462b(c3585s1.f21461b.m15167a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$c */
    public static class c {
        /* renamed from: a */
        public C3112Zl m16717a(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2601F9 c2601f9, C3585s1 c3585s1, C2685Ii c2685Ii) {
            return new C3112Zl(context, c2601f9, c3585s1, interfaceExecutorC3607sn, c2685Ii.m14363d());
        }
    }

    public C3585s1(Context context, C2969U3 c2969u3, C3806y c3806y, C3456n2 c3456n2, C2898R7 c2898r7, C2685Ii c2685Ii, C2918S2 c2918s2, C2918S2 c2918s22, C2601F9 c2601f9, C2533Cg c2533Cg, C3065Y c3065y, C2717K0 c2717k0) {
        C3378k2 c3378k2 = new C3378k2(c2969u3, new CounterConfiguration(c3806y, EnumC2458c.MAIN), c3806y.userProfileID);
        if (c3806y.sessionTimeout == null) {
            TimeUnit.SECONDS.toMillis(10L);
        }
        this(context, c3806y, c3456n2, c2898r7, c3378k2, new C3794m(), c2533Cg, c2685Ii, new C3455n1(), c3065y.m15451j(), c2918s2, c2918s22, c2601f9, c3065y.m15445c(), c2717k0, new c(), new C3765z(), new C3731xh(), new C3705wh(c3806y.appVersion, null), new C3123a7(c2717k0), new C2599F7(), new C2474A7(), new C3643u7(), new C3591s7());
    }

    /* renamed from: h */
    private void m16713h() {
        this.f21468i.m16444a(this.f21461b.m15167a());
        C3794m c3794m = this.f24630p;
        b bVar = new b();
        long jLongValue = f24628A.longValue();
        synchronized (c3794m) {
            c3794m.f25474b.add(new C3793l(bVar, c3794m.f25473a, jLongValue));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14490a(boolean z) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: b */
    public void mo14491b(Activity activity) {
        if (this.f24636v.m17312a(activity, C3765z.a.PAUSED)) {
            m14386d(activity != null ? activity.getClass().getSimpleName() : null);
            C3794m c3794m = this.f24630p;
            synchronized (c3794m) {
                Iterator it = c3794m.f25474b.iterator();
                while (it.hasNext()) {
                    C3793l c3793l = (C3793l) it.next();
                    if (!c3793l.f25471d) {
                        c3793l.f25471d = true;
                        c3793l.f25468a.m16704a(c3793l.f25472e, c3793l.f25470c);
                    }
                }
            }
            if (activity != null) {
                this.f24635u.m15563a(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2691J, com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: c */
    public void mo14385c(String str, String str2) {
        super.mo14385c(str, str2);
        this.f24639y.m14973a(this.f21461b.f23900c.m14214a());
    }

    /* renamed from: g */
    public final void m16714g() {
        if (this.f24637w.compareAndSet(false, true)) {
            this.f24634t.m16023c();
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14488a(String str, boolean z) {
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("App opened via deeplink: " + m14389f(str));
        }
        this.f21468i.m16451a(C2692J0.m14396a("open", str, z, this.f21462c), this.f21461b);
    }

    public C3585s1(Context context, C3806y c3806y, C3456n2 c3456n2, C2898R7 c2898r7, C3378k2 c3378k2, C3794m c3794m, C2533Cg c2533Cg, C2685Ii c2685Ii, C3455n1 c3455n1, InterfaceC2664Hm interfaceC2664Hm, C2918S2 c2918s2, C2918S2 c2918s22, C2601F9 c2601f9, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2717K0 c2717k0, c cVar, C3765z c3765z, C3731xh c3731xh, C3705wh c3705wh, C3123a7 c3123a7, C2599F7 c2599f7, C2474A7 c2474a7, C3643u7 c3643u7, C3591s7 c3591s7) {
        super(context, c3456n2, c3378k2, c2717k0, interfaceC2664Hm, c3731xh.m17187a(c3456n2.m16463b(), c3806y.apiKey, true), c3705wh, c2599f7, c2474a7, c3643u7, c3591s7, c3123a7);
        this.f24637w = new AtomicBoolean(false);
        this.f24638x = new C2570E3();
        this.f21461b.m16253a(m16710a(c3806y));
        this.f24630p = c3794m;
        this.f24631q = c2533Cg;
        this.f24639y = c2898r7;
        this.f24632r = c3806y;
        this.f24636v = c3765z;
        C3112Zl c3112ZlM16717a = cVar.m16717a(context, interfaceExecutorC3607sn, c2601f9, this, c2685Ii);
        this.f24635u = c3112ZlM16717a;
        this.f24633s = c2685Ii;
        c2685Ii.m14356a(c3112ZlM16717a);
        m16712a(c3806y.nativeCrashReporting, this.f21461b);
        c2685Ii.m14360b();
        c2533Cg.m13969a();
        this.f24634t = m16711a(interfaceExecutorC3607sn, c3455n1, c2918s2, c2918s22);
        if (C3323i.m16067a(c3806y.f25548h)) {
            m16714g();
        }
        m16713h();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14487a(String str) {
        ((C3582ro) f24629z).mo14391a(str);
        this.f21468i.m16451a(C2692J0.m14396a("referral", str, false, this.f21462c), this.f21461b);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17366b("Referral URL received: " + m14389f(str));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: b */
    public void mo14493b(boolean z) {
        this.f21461b.m15168b().m13778k(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3372jm
    /* renamed from: b */
    public void mo14492b(JSONObject jSONObject) {
        C3456n2 c3456n2 = this.f21468i;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S(jSONObject.toString(), "view_tree", EnumC3377k1.EVENT_TYPE_VIEW_TREE.m16250b(), 0, c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14486a(C3739y.c cVar) {
        if (cVar == C3739y.c.WATCHING) {
            if (this.f21462c.m17370c()) {
                this.f21462c.m17366b("Enable activity auto tracking");
            }
        } else if (this.f21462c.m17370c()) {
            this.f21462c.m17368c("Could not enable activity auto tracking. " + cVar.f25276a);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14482a(Activity activity) {
        if (this.f24636v.m17312a(activity, C3765z.a.RESUMED)) {
            m14387e(activity != null ? activity.getClass().getSimpleName() : null);
            C3794m c3794m = this.f24630p;
            synchronized (c3794m) {
                Iterator it = c3794m.f25474b.iterator();
                while (it.hasNext()) {
                    C3793l c3793l = (C3793l) it.next();
                    if (c3793l.f25471d) {
                        c3793l.f25471d = false;
                        c3793l.f25468a.m16703a(c3793l.f25472e);
                        c3793l.f25469b.mo16716b();
                    }
                }
            }
            if (activity != null) {
                this.f24635u.m15565b(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14483a(Location location) {
        this.f21461b.m15168b().m13769b(location);
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Set location: %s", location);
        }
    }

    /* renamed from: a */
    private C3297h m16711a(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3455n1 c3455n1, C2918S2 c2918s2, C2918S2 c2918s22) {
        return new C3297h(new a(interfaceExecutorC3607sn, c3455n1, c2918s2, c2918s22));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3372jm
    /* renamed from: a */
    public void mo14489a(JSONObject jSONObject) {
        C3456n2 c3456n2 = this.f21468i;
        C2689Im c2689Im = this.f21462c;
        List<Integer> list = C2692J0.f21482i;
        c3456n2.m16451a(new C2915S(jSONObject.toString(), "view_tree", EnumC3377k1.EVENT_TYPE_RAW_VIEW_TREE.m16250b(), 0, c2689Im), this.f21461b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14484a(InterfaceC2838Ol interfaceC2838Ol, boolean z) {
        this.f24635u.m15564a(interfaceC2838Ol, z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2966U0
    /* renamed from: a */
    public void mo14485a(C3043X2 c3043x2) {
        c3043x2.m15412a(this.f21462c);
    }

    /* renamed from: a */
    private void m16712a(Boolean bool, C3378k2 c3378k2) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        this.f24639y.m14974a(bool.booleanValue(), c3378k2.m15168b().m13768a(), c3378k2.f23900c.m14214a());
        if (this.f21462c.m17370c()) {
            this.f21462c.m17363a("Set report native crashes enabled: %b", bool);
        }
    }

    /* renamed from: a */
    private C2856Pe m16710a(C3806y c3806y) {
        return new C2856Pe(c3806y.preloadInfo, this.f21462c, Boolean.FALSE.booleanValue());
    }
}
