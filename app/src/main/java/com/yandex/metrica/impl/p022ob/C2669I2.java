package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C3739y;
import com.yandex.metrica.impl.p022ob.C3765z;

/* renamed from: com.yandex.metrica.impl.ob.I2 */
/* loaded from: classes2.dex */
public class C2669I2 {

    /* renamed from: a */
    private final InterfaceC3016W0 f21389a;

    /* renamed from: b */
    private final C3739y f21390b;

    /* renamed from: c */
    private final C3554qm<C3585s1> f21391c;

    /* renamed from: d */
    private final C3739y.b f21392d;

    /* renamed from: e */
    private final C3739y.b f21393e;

    /* renamed from: f */
    private final C3765z f21394f;

    /* renamed from: g */
    private final C3713x f21395g;

    /* renamed from: com.yandex.metrica.impl.ob.I2$a */
    public class a implements C3739y.b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$a$a, reason: collision with other inner class name */
        public class C7300a implements InterfaceC3067Y1<C3585s1> {

            /* renamed from: a */
            final /* synthetic */ Activity f21397a;

            public C7300a(Activity activity) {
                this.f21397a = activity;
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC3067Y1
            /* renamed from: b */
            public void mo13945b(C3585s1 c3585s1) {
                C2669I2.m14275a(C2669I2.this, this.f21397a, c3585s1);
            }
        }

        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3739y.b
        /* renamed from: a */
        public void mo13943a(Activity activity, C3739y.a aVar) {
            C2669I2.this.f21391c.m16635a((InterfaceC3067Y1) new C7300a(activity));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.I2$b */
    public class b implements C3739y.b {

        /* renamed from: com.yandex.metrica.impl.ob.I2$b$a */
        public class a implements InterfaceC3067Y1<C3585s1> {

            /* renamed from: a */
            final /* synthetic */ Activity f21400a;

            public a(Activity activity) {
                this.f21400a = activity;
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC3067Y1
            /* renamed from: b */
            public void mo13945b(C3585s1 c3585s1) {
                C2669I2.m14276b(C2669I2.this, this.f21400a, c3585s1);
            }
        }

        public b() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C3739y.b
        /* renamed from: a */
        public void mo13943a(Activity activity, C3739y.a aVar) {
            C2669I2.this.f21391c.m16635a((InterfaceC3067Y1) new a(activity));
        }
    }

    public C2669I2(C3739y c3739y, InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3713x c3713x) {
        this(C2834Oh.m14711a(), c3739y, c3713x, new C3554qm(interfaceExecutorC3607sn), new C3765z());
    }

    /* renamed from: b */
    public void m14280b(Activity activity, InterfaceC2966U0 interfaceC2966U0) {
        if (activity != null) {
            this.f21395g.m17155a(activity);
        }
        if (this.f21394f.m17312a(activity, C3765z.a.RESUMED)) {
            interfaceC2966U0.mo14482a(activity);
        }
    }

    /* renamed from: a */
    public C3739y.c m14277a(boolean z) {
        this.f21390b.m17203a(this.f21392d, C3739y.a.RESUMED);
        this.f21390b.m17203a(this.f21393e, C3739y.a.PAUSED);
        C3739y.c cVarM17200a = this.f21390b.m17200a();
        if (cVarM17200a == C3739y.c.WATCHING) {
            this.f21389a.reportEvent(z ? "session_auto_tracking_listener_registered_auto" : "session_auto_tracking_listener_registered_manual");
        }
        return cVarM17200a;
    }

    public C2669I2(InterfaceC3016W0 interfaceC3016W0, C3739y c3739y, C3713x c3713x, C3554qm<C3585s1> c3554qm, C3765z c3765z) {
        this.f21390b = c3739y;
        this.f21389a = interfaceC3016W0;
        this.f21395g = c3713x;
        this.f21391c = c3554qm;
        this.f21394f = c3765z;
        this.f21392d = new a();
        this.f21393e = new b();
    }

    /* renamed from: b */
    public static void m14276b(C2669I2 c2669i2, Activity activity, InterfaceC2966U0 interfaceC2966U0) {
        if (c2669i2.f21394f.m17312a(activity, C3765z.a.PAUSED)) {
            ((C3585s1) interfaceC2966U0).mo14491b(activity);
        }
    }

    /* renamed from: a */
    public void m14278a(Activity activity, InterfaceC2966U0 interfaceC2966U0) {
        if (activity != null) {
            this.f21395g.m17155a(activity);
        }
        if (this.f21394f.m17312a(activity, C3765z.a.PAUSED)) {
            interfaceC2966U0.mo14491b(activity);
        }
    }

    /* renamed from: a */
    public void m14279a(C3585s1 c3585s1) {
        this.f21391c.m16636a((C3554qm<C3585s1>) c3585s1);
    }

    /* renamed from: a */
    public static void m14275a(C2669I2 c2669i2, Activity activity, InterfaceC2966U0 interfaceC2966U0) {
        if (c2669i2.f21394f.m17312a(activity, C3765z.a.RESUMED)) {
            ((C3585s1) interfaceC2966U0).mo14482a(activity);
        }
    }
}
