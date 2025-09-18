package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.SystemClock;
import com.yandex.metrica.impl.p022ob.C2891R0;
import com.yandex.metrica.impl.p022ob.C3028Wc;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.Pc */
/* loaded from: classes2.dex */
public class C2854Pc {

    /* renamed from: a */
    private final C2879Qc f21936a;

    /* renamed from: b */
    private final C2903Rc f21937b;

    /* renamed from: c */
    private final C2814Nm f21938c;

    /* renamed from: d */
    private C2978Uc f21939d;

    /* renamed from: e */
    private final C2766M f21940e;

    /* renamed from: f */
    private final C3145b3 f21941f;

    /* renamed from: g */
    private final C2630Gd f21942g;

    /* renamed from: h */
    private final C2566E f21943h;

    /* renamed from: i */
    private boolean f21944i;

    /* renamed from: j */
    private final Runnable f21945j;

    /* renamed from: com.yandex.metrica.impl.ob.Pc$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2854Pc.this.m14772b();
            C2854Pc.this.m14770c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pc$b */
    public class b implements InterfaceC3035Wj {

        /* renamed from: a */
        final /* synthetic */ C2953Tc f21947a;

        public b(C2854Pc c2854Pc, C2953Tc c2953Tc) {
            this.f21947a = c2953Tc;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3035Wj
        /* renamed from: a */
        public void mo14775a(Collection<C3010Vj> collection) {
            this.f21947a.m15182a(C3762ym.m17275a(collection));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2854Pc(C2879Qc c2879Qc) {
        Context context = c2879Qc.f22006a.f25415a;
        C2978Uc c2978Uc = c2879Qc.f22010e;
        this(c2879Qc, new C2630Gd(context, c2978Uc == null ? null : c2978Uc.f22451m));
    }

    /* renamed from: c */
    public void m14770c() {
        C2978Uc c2978Uc = this.f21939d;
        if (c2978Uc != null) {
            long j = c2978Uc.f22446h;
            if (j > 0) {
                this.f21936a.f22006a.f25416b.m16704a(this.f21945j, j);
            }
        }
    }

    /* renamed from: b */
    public void m14772b() {
        C2953Tc c2953Tc = new C2953Tc();
        this.f21938c.getClass();
        c2953Tc.m15184b(System.currentTimeMillis());
        this.f21938c.getClass();
        c2953Tc.m15178a(SystemClock.elapsedRealtime());
        this.f21942g.m14194b();
        c2953Tc.m15185b(C3093Z2.m15525a(this.f21941f.m15672a().mo14757a()));
        this.f21936a.f22007b.mo15084a(new b(this, c2953Tc));
        c2953Tc.m15179a(this.f21940e.m14566b());
        c2953Tc.m15180a(C3028Wc.a.m15386a(this.f21943h.m14023c()));
        this.f21937b.m14996a(c2953Tc);
        this.f21936a.f22008c.mo13856a();
        this.f21936a.f22009d.m17232a();
    }

    /* renamed from: d */
    public void m14773d() {
        m14768a();
    }

    /* renamed from: e */
    public void m14774e() {
        this.f21936a.f22006a.f25416b.m16703a(this.f21945j);
    }

    /* renamed from: a */
    private void m14768a() {
        C2978Uc c2978Uc = this.f21939d;
        boolean z = c2978Uc != null && c2978Uc.f22447i;
        if (this.f21944i != z) {
            this.f21944i = z;
            if (z) {
                m14770c();
            } else {
                this.f21936a.f22006a.f25416b.m16703a(this.f21945j);
            }
        }
    }

    private C2854Pc(C2879Qc c2879Qc, C2630Gd c2630Gd) {
        this(c2879Qc, new C2903Rc(c2879Qc.f22006a.f25415a), new C2814Nm(), C2842P0.m14728i().m14734d(), C2842P0.m14728i().m14733c(), C3145b3.m15668a(c2879Qc.f22006a.f25415a), c2630Gd, new C2891R0.c());
    }

    /* renamed from: a */
    public void m14771a(C2978Uc c2978Uc) {
        this.f21939d = c2978Uc;
        this.f21942g.m14193a(c2978Uc == null ? null : c2978Uc.f22451m);
        m14768a();
    }

    public C2854Pc(C2879Qc c2879Qc, C2903Rc c2903Rc, C2814Nm c2814Nm, C2766M c2766m, C2566E c2566e, C3145b3 c3145b3, C2630Gd c2630Gd, C2891R0.c cVar) {
        this.f21945j = new a();
        this.f21936a = c2879Qc;
        this.f21937b = c2903Rc;
        this.f21938c = c2814Nm;
        this.f21939d = c2879Qc.f22010e;
        this.f21940e = c2766m;
        this.f21943h = c2566e;
        this.f21941f = c3145b3;
        this.f21942g = c2630Gd;
        c3145b3.m15672a().m14803a(cVar.m14965a(c2879Qc.f22006a.f25416b, c2630Gd, c3145b3.m15672a()));
    }
}
