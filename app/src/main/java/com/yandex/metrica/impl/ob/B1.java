package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.Qi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class B1 implements InterfaceC3219y1 {
    private final C3220y2 A;
    private Qi a;
    private boolean b;
    private final Context c;
    private volatile com.yandex.metrica.i d;
    private final C2733ei e;
    private C2791h1 f;
    private final L0 g;
    private D4 h;
    private final M1 i;
    private Dd j;
    private I9 k;
    private C2742f2 l;
    private final O0 m;
    private final C2751fb n;
    private final F3 o;
    private G7 p;
    private final W6 q;
    private final C2847j8 r;
    private final E s;
    private final InterfaceExecutorC3086sn t;
    private final K1 u;
    private Um<String> v;
    private Um<File> w;
    private M7<String> x;
    private InterfaceExecutorC3086sn y;
    private C2767g2 z;

    public class a implements Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(File file) {
            B1.this.a(file);
        }
    }

    public B1(Context context, com.yandex.metrica.i iVar) {
        this(context, iVar, new J4(context));
    }

    public static void d(B1 b1) {
        Dd dd = b1.j;
        if (dd != null) {
            dd.a(b1);
        }
    }

    public static void e(B1 b1) {
        Dd dd = b1.j;
        if (dd != null) {
            dd.b(b1);
        }
    }

    public static void g(B1 b1) {
        if (b1.a != null) {
            P0.i().q().a(b1.a);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) throws NumberFormatException {
        this.i.b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i = Integer.parseInt(data.getQueryParameter("pid"));
                this.h.a(encodedAuthority, i, data.getQueryParameter("psid"));
                this.s.a(i);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void onConfigurationChanged(Configuration configuration) {
        C2990p1.a(this.c).b(configuration);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f.a();
        this.l.a(C2864k0.a(bundle), bundle);
    }

    private B1(Context context, com.yandex.metrica.i iVar, J4 j4) {
        this(context, iVar, new D4(context, j4), new M1(), new L0(), new O0(), new C2751fb(context), F3.a(), new C2733ei(context), P0.i().c(), P0.i().j().c(), C2847j8.a(), P0.i().s().f(), P0.i().s().b(), new K1(), P0.i().p());
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a() {
        P0.i().a().a();
        if (this.b) {
            C2990p1.a(this.c).b(this.c.getResources().getConfiguration());
        } else {
            this.k = P0.i().u();
            this.m.a(this.c);
            P0.i().z();
            Lm.c().d();
            this.j = new Dd(C2703dd.a(this.c), C2643b3.a(this.c), this.k);
            this.a = new Qi.b(this.c).a();
            P0.i().x().a(this.a);
            this.i.b(new F1(this));
            this.i.c(new G1(this));
            this.i.d(new H1(this));
            this.i.e(new I1(this));
            this.i.a(new J1(this));
            this.o.a(this, K3.class, J3.a(new D1(this)).a(new C1(this)).a());
            P0.i().t().a(this.c, this.a);
            this.f = new C2791h1(this.k, this.a.u(), new Nm(), new R2(), Oh.a());
            Qi qi = this.a;
            if (qi != null) {
                this.e.b(qi);
            }
            a(this.a);
            K1 k1 = this.u;
            Context context = this.c;
            D4 d4 = this.h;
            k1.getClass();
            this.l = new C2742f2(context, d4, P0.i().s().f(), new L0());
            YandexMetrica.getReporter(this.c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File fileA = this.g.a(this.c, "appmetrica_crashes");
            if (fileA != null) {
                K1 k12 = this.u;
                Um<File> um = this.w;
                k12.getClass();
                this.p = new G7(fileA, um);
                ((C3061rn) this.t).execute(new RunnableC2672c7(this.c, fileA, this.w));
                this.p.a();
            }
            if (U2.a(21)) {
                K1 k13 = this.u;
                C2742f2 c2742f2 = this.l;
                k13.getClass();
                this.x = new C2648b8(new C2698d8(c2742f2));
                this.v = new E1(this);
                if (this.r.b()) {
                    this.x.a();
                    ((C3061rn) this.y).a(new RunnableC2947n8(), 1L, TimeUnit.MINUTES);
                }
            }
            P0.i().g().a(this.a);
            this.b = true;
        }
        if (U2.a(21)) {
            this.q.a(this.v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        this.i.c(intent);
    }

    private Integer c(Bundle bundle) {
        U3 u3;
        bundle.setClassLoader(U3.class.getClassLoader());
        String str = U3.c;
        try {
            u3 = (U3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            u3 = null;
        }
        if (u3 == null) {
            return null;
        }
        return u3.g();
    }

    public static void b(B1 b1) {
        b1.e.b();
    }

    public B1(Context context, com.yandex.metrica.i iVar, D4 d4, M1 m1, L0 l0, O0 o0, C2751fb c2751fb, F3 f3, C2733ei c2733ei, E e, W6 w6, C2847j8 c2847j8, InterfaceExecutorC3086sn interfaceExecutorC3086sn, InterfaceExecutorC3086sn interfaceExecutorC3086sn2, K1 k1, C3220y2 c3220y2) {
        this.b = false;
        this.w = new a();
        this.c = context;
        this.d = iVar;
        this.h = d4;
        this.i = m1;
        this.g = l0;
        this.m = o0;
        this.n = c2751fb;
        this.o = f3;
        this.e = c2733ei;
        this.s = e;
        this.t = interfaceExecutorC3086sn;
        this.y = interfaceExecutorC3086sn2;
        this.u = k1;
        this.q = w6;
        this.r = c2847j8;
        this.z = new C2767g2(this, context);
        this.A = c3220y2;
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b() {
        if (U2.a(21)) {
            this.q.b(this.v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void b(Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.s.c(numC.intValue());
        }
    }

    private void b(Intent intent, int i) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null) {
                Bundle extras = intent.getExtras();
                T3 t3 = new T3(extras);
                if (!T3.a(t3, this.c)) {
                    C2864k0 c2864k0A = C2864k0.a(extras);
                    if (!((c2864k0A.a == null) | (EnumC2865k1.EVENT_TYPE_UNDEFINED.b() == c2864k0A.e))) {
                        try {
                            this.l.a(C4.a(t3), c2864k0A, new X3(t3));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        ((MetricaService) ((com.yandex.metrica.e) this.d).a).stopSelfResult(i);
    }

    public static void b(B1 b1, Qi qi) {
        Dd dd = b1.j;
        if (dd != null) {
            dd.a(qi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i) {
        b(intent, i);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent, int i, int i2) {
        b(intent, i2);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        this.i.a(intent);
    }

    public static void a(B1 b1, Qi qi) {
        b1.a = qi;
        C6 c6 = new C6(b1.c);
        ((C3061rn) b1.y).execute(new A1(b1, c6));
        Dd dd = b1.j;
        if (dd != null) {
            dd.a(qi);
        }
        b1.f.a(b1.a.u());
        b1.n.a(qi);
        b1.e.b(qi);
    }

    public static void a(B1 b1, Intent intent) {
        b1.e.a();
        b1.A.a(C3240ym.f(intent.getStringExtra("screen_size")));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    @Deprecated
    public void a(String str, int i, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.l.a(new C2864k0(str2, str, i, new Nm()), bundle);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(int i, Bundle bundle) {
        this.z.a(i, bundle);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.s.b(numC.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3219y1
    public void a(com.yandex.metrica.i iVar) {
        this.d = iVar;
    }

    public void a(File file) {
        this.l.a(file);
    }

    private void a(Qi qi) {
        Dd dd = this.j;
        if (dd != null) {
            dd.a(qi);
        }
    }
}
