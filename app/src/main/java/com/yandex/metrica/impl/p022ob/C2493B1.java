package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.C2460e;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.InterfaceC2465i;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p022ob.C2885Qi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.B1 */
/* loaded from: classes2.dex */
public class C2493B1 implements InterfaceC3741y1 {

    /* renamed from: A */
    private final C3742y2 f20887A;

    /* renamed from: a */
    private C2885Qi f20888a;

    /* renamed from: b */
    private boolean f20889b;

    /* renamed from: c */
    private final Context f20890c;

    /* renamed from: d */
    private volatile InterfaceC2465i f20891d;

    /* renamed from: e */
    private final C3238ei f20892e;

    /* renamed from: f */
    private C3299h1 f20893f;

    /* renamed from: g */
    private final C2742L0 f20894g;

    /* renamed from: h */
    private C2546D4 f20895h;

    /* renamed from: i */
    private final C2768M1 f20896i;

    /* renamed from: j */
    private C2555Dd f20897j;

    /* renamed from: k */
    private C2676I9 f20898k;

    /* renamed from: l */
    private C3248f2 f20899l;

    /* renamed from: m */
    private final C2817O0 f20900m;

    /* renamed from: n */
    private final C3257fb f20901n;

    /* renamed from: o */
    private final C2595F3 f20902o;

    /* renamed from: p */
    private C2624G7 f20903p;

    /* renamed from: q */
    private final InterfaceC3022W6 f20904q;

    /* renamed from: r */
    private final C3358j8 f20905r;

    /* renamed from: s */
    private final C2566E f20906s;

    /* renamed from: t */
    private final InterfaceExecutorC3607sn f20907t;

    /* renamed from: u */
    private final C2718K1 f20908u;

    /* renamed from: v */
    private InterfaceC2988Um<String> f20909v;

    /* renamed from: w */
    private InterfaceC2988Um<File> f20910w;

    /* renamed from: x */
    private InterfaceC2774M7<String> f20911x;

    /* renamed from: y */
    private InterfaceExecutorC3607sn f20912y;

    /* renamed from: z */
    private C3274g2 f20913z;

    /* renamed from: com.yandex.metrica.impl.ob.B1$a */
    public class a implements InterfaceC2988Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(File file) {
            C2493B1.this.m13898a(file);
        }
    }

    public C2493B1(Context context, InterfaceC2465i interfaceC2465i) {
        this(context, interfaceC2465i, new C2696J4(context));
    }

    /* renamed from: d */
    public static void m13886d(C2493B1 c2493b1) {
        C2555Dd c2555Dd = c2493b1.f20897j;
        if (c2555Dd != null) {
            c2555Dd.m13995a(c2493b1);
        }
    }

    /* renamed from: e */
    public static void m13887e(C2493B1 c2493b1) {
        C2555Dd c2555Dd = c2493b1.f20897j;
        if (c2555Dd != null) {
            c2555Dd.m13997b(c2493b1);
        }
    }

    /* renamed from: g */
    public static void m13889g(C2493B1 c2493b1) {
        if (c2493b1.f20888a != null) {
            C2842P0.m14728i().m14746q().m14008a(c2493b1.f20888a);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: b */
    public void mo13901b(Intent intent) throws NumberFormatException {
        this.f20896i.mo13901b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i = Integer.parseInt(data.getQueryParameter("pid"));
                this.f20895h.m13981a(encodedAuthority, i, data.getQueryParameter("psid"));
                this.f20906s.m14020a(i);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    public void onConfigurationChanged(Configuration configuration) {
        C3507p1.m16548a(this.f20890c).m16552b(configuration);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f20893f.m16026a();
        this.f20899l.m15873a(C3376k0.m16208a(bundle), bundle);
    }

    private C2493B1(Context context, InterfaceC2465i interfaceC2465i, C2696J4 c2696j4) {
        this(context, interfaceC2465i, new C2546D4(context, c2696j4), new C2768M1(), new C2742L0(), new C2817O0(), new C3257fb(context), C2595F3.m14055a(), new C3238ei(context), C2842P0.m14728i().m14733c(), C2842P0.m14728i().m14739j().m16502c(), C3358j8.m16114a(), C2842P0.m14728i().m14748s().m17354f(), C2842P0.m14728i().m14748s().m17349b(), new C2718K1(), C2842P0.m14728i().m14745p());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13891a() {
        C2842P0.m14728i().m14729a().m17101a();
        if (this.f20889b) {
            C3507p1.m16548a(this.f20890c).m16552b(this.f20890c.getResources().getConfiguration());
        } else {
            this.f20898k = C2842P0.m14728i().m14750u();
            this.f20900m.m14684a(this.f20890c);
            C2842P0.m14728i().m14755z();
            C2764Lm.m14551c().m14554d();
            this.f20897j = new C2555Dd(C3207dd.m15750a(this.f20890c), C3145b3.m15668a(this.f20890c), this.f20898k);
            this.f20888a = new C2885Qi.b(this.f20890c).m14950a();
            C2842P0.m14728i().m14753x().m15541a(this.f20888a);
            this.f20896i.m14587b(new C2593F1(this));
            this.f20896i.m14588c(new C2618G1(this));
            this.f20896i.m14589d(new C2643H1(this));
            this.f20896i.m14590e(new C2668I1(this));
            this.f20896i.m14586a(new C2693J1(this));
            this.f20902o.m14059a(this, C2720K3.class, C2695J3.m14409a(new C2543D1(this)).m14412a(new C2518C1(this)).m14413a());
            C2842P0.m14728i().m14749t().m15840a(this.f20890c, this.f20888a);
            this.f20893f = new C3299h1(this.f20898k, this.f20888a.m14895u(), new C2814Nm(), new C2893R2(), C2834Oh.m14711a());
            C2885Qi c2885Qi = this.f20888a;
            if (c2885Qi != null) {
                this.f20892e.m15856b(c2885Qi);
            }
            m13880a(this.f20888a);
            C2718K1 c2718k1 = this.f20908u;
            Context context = this.f20890c;
            C2546D4 c2546d4 = this.f20895h;
            c2718k1.getClass();
            this.f20899l = new C3248f2(context, c2546d4, C2842P0.m14728i().m14748s().m17354f(), new C2742L0());
            YandexMetrica.getReporter(this.f20890c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File fileM14500a = this.f20894g.m14500a(this.f20890c, "appmetrica_crashes");
            if (fileM14500a != null) {
                C2718K1 c2718k12 = this.f20908u;
                InterfaceC2988Um<File> interfaceC2988Um = this.f20910w;
                c2718k12.getClass();
                this.f20903p = new C2624G7(fileM14500a, interfaceC2988Um);
                ((C3581rn) this.f20907t).execute(new RunnableC3175c7(this.f20890c, fileM14500a, this.f20910w));
                this.f20903p.m14161a();
            }
            if (C2968U2.m15243a(21)) {
                C2718K1 c2718k13 = this.f20908u;
                C3248f2 c3248f2 = this.f20899l;
                c2718k13.getClass();
                this.f20911x = new C3150b8(new C3202d8(c3248f2));
                this.f20909v = new C2568E1(this);
                if (this.f20905r.m16115b()) {
                    this.f20911x.mo14604a();
                    ((C3581rn) this.f20912y).m16705a(new RunnableC3462n8(), 1L, TimeUnit.MINUTES);
                }
            }
            C2842P0.m14728i().m14737g().m14766a(this.f20888a);
            this.f20889b = true;
        }
        if (C2968U2.m15243a(21)) {
            this.f20904q.mo15384a(this.f20909v);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: c */
    public void mo13903c(Intent intent) {
        this.f20896i.mo13903c(intent);
    }

    /* renamed from: c */
    private Integer m13885c(Bundle bundle) {
        C2969U3 c2969u3;
        bundle.setClassLoader(C2969U3.class.getClassLoader());
        String str = C2969U3.f22435c;
        try {
            c2969u3 = (C2969U3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            c2969u3 = null;
        }
        if (c2969u3 == null) {
            return null;
        }
        return c2969u3.m15265g();
    }

    /* renamed from: b */
    public static void m13882b(C2493B1 c2493b1) {
        c2493b1.f20892e.m15855b();
    }

    public C2493B1(Context context, InterfaceC2465i interfaceC2465i, C2546D4 c2546d4, C2768M1 c2768m1, C2742L0 c2742l0, C2817O0 c2817o0, C3257fb c3257fb, C2595F3 c2595f3, C3238ei c3238ei, C2566E c2566e, InterfaceC3022W6 interfaceC3022W6, C3358j8 c3358j8, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceExecutorC3607sn interfaceExecutorC3607sn2, C2718K1 c2718k1, C3742y2 c3742y2) {
        this.f20889b = false;
        this.f20910w = new a();
        this.f20890c = context;
        this.f20891d = interfaceC2465i;
        this.f20895h = c2546d4;
        this.f20896i = c2768m1;
        this.f20894g = c2742l0;
        this.f20900m = c2817o0;
        this.f20901n = c3257fb;
        this.f20902o = c2595f3;
        this.f20892e = c3238ei;
        this.f20906s = c2566e;
        this.f20907t = interfaceExecutorC3607sn;
        this.f20912y = interfaceExecutorC3607sn2;
        this.f20908u = c2718k1;
        this.f20904q = interfaceC3022W6;
        this.f20905r = c3358j8;
        this.f20913z = new C3274g2(this, context);
        this.f20887A = c3742y2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: b */
    public void mo13900b() {
        if (C2968U2.m15243a(21)) {
            this.f20904q.mo15385b(this.f20909v);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: b */
    public void mo13902b(Bundle bundle) {
        Integer numM13885c = m13885c(bundle);
        if (numM13885c != null) {
            this.f20906s.m14024c(numM13885c.intValue());
        }
    }

    /* renamed from: b */
    private void m13881b(Intent intent, int i) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null) {
                Bundle extras = intent.getExtras();
                C2944T3 c2944t3 = new C2944T3(extras);
                if (!C2944T3.m15166a(c2944t3, this.f20890c)) {
                    C3376k0 c3376k0M16208a = C3376k0.m16208a(extras);
                    if (!((c3376k0M16208a.f23827a == null) | (EnumC3377k1.EVENT_TYPE_UNDEFINED.m16250b() == c3376k0M16208a.f23831e))) {
                        try {
                            this.f20899l.m15871a(C2521C4.m13949a(c2944t3), c3376k0M16208a, new C3044X3(c2944t3));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        ((MetricaService) ((C2460e) this.f20891d).f20786a).stopSelfResult(i);
    }

    /* renamed from: b */
    public static void m13883b(C2493B1 c2493b1, C2885Qi c2885Qi) {
        C2555Dd c2555Dd = c2493b1.f20897j;
        if (c2555Dd != null) {
            c2555Dd.m13994a(c2885Qi);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13894a(Intent intent, int i) {
        m13881b(intent, i);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13895a(Intent intent, int i, int i2) {
        m13881b(intent, i2);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13893a(Intent intent) {
        this.f20896i.mo13893a(intent);
    }

    /* renamed from: a */
    public static void m13879a(C2493B1 c2493b1, C2885Qi c2885Qi) {
        c2493b1.f20888a = c2885Qi;
        C2523C6 c2523c6 = new C2523C6(c2493b1.f20890c);
        ((C3581rn) c2493b1.f20912y).execute(new RunnableC2468A1(c2493b1, c2523c6));
        C2555Dd c2555Dd = c2493b1.f20897j;
        if (c2555Dd != null) {
            c2555Dd.m13994a(c2885Qi);
        }
        c2493b1.f20893f.m16027a(c2493b1.f20888a.m14895u());
        c2493b1.f20901n.m15929a(c2885Qi);
        c2493b1.f20892e.m15856b(c2885Qi);
    }

    /* renamed from: a */
    public static void m13878a(C2493B1 c2493b1, Intent intent) {
        c2493b1.f20892e.m15852a();
        c2493b1.f20887A.m17211a(C3762ym.m17303f(intent.getStringExtra("screen_size")));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    @Deprecated
    /* renamed from: a */
    public void mo13899a(String str, int i, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f20899l.m15873a(new C3376k0(str2, str, i, new C2814Nm()), bundle);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13892a(int i, Bundle bundle) {
        this.f20913z.m15956a(i, bundle);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13896a(Bundle bundle) {
        Integer numM13885c = m13885c(bundle);
        if (numM13885c != null) {
            this.f20906s.m14022b(numM13885c.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3741y1
    /* renamed from: a */
    public void mo13897a(InterfaceC2465i interfaceC2465i) {
        this.f20891d = interfaceC2465i;
    }

    /* renamed from: a */
    public void m13898a(File file) {
        this.f20899l.m15874a(file);
    }

    /* renamed from: a */
    private void m13880a(C2885Qi c2885Qi) {
        C2555Dd c2555Dd = this.f20897j;
        if (c2555Dd != null) {
            c2555Dd.m13994a(c2885Qi);
        }
    }
}
