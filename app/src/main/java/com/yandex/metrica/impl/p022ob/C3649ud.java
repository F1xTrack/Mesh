package com.yandex.metrica.impl.p022ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.ud */
/* loaded from: classes2.dex */
class C3649ud {

    /* renamed from: a */
    private final C3363jd f24907a;

    /* renamed from: b */
    private final C2854Pc f24908b;

    /* renamed from: c */
    private final C2480Ad f24909c;

    /* renamed from: d */
    private final C3752yc f24910d;

    public C3649ud(C3675vd c3675vd) {
        C3701wd c3701wd = new C3701wd(c3675vd.f25007a.f25415a);
        C3778zc c3778zc = c3675vd.f25007a;
        this(c3675vd, c3701wd, new C2480Ad(c3778zc.f25415a, c3675vd.f25008b, c3675vd.f25009c, c3675vd.f25010d, c3675vd.f25011e, c3778zc.f25416b), new C3752yc(c3675vd.f25009c, c3675vd.f25010d, c3675vd.f25011e));
    }

    /* renamed from: a */
    public void m16911a() {
        this.f24909c.mo13856a();
    }

    /* renamed from: b */
    public Location m16914b() {
        return this.f24907a.m16121b();
    }

    /* renamed from: c */
    public void m16915c() {
        this.f24907a.mo14192a();
        this.f24908b.m14772b();
    }

    /* renamed from: d */
    public void m16916d() {
        this.f24907a.m16122c();
        this.f24908b.m14773d();
    }

    /* renamed from: e */
    public void m16917e() {
        this.f24907a.m16123d();
        this.f24908b.m14774e();
    }

    private C3649ud(C3675vd c3675vd, C3701wd c3701wd, C2480Ad c2480Ad, C3752yc c3752yc) {
        this(c3675vd, c3701wd, C3389kd.m16267a(c3675vd, c2480Ad, c3752yc, c3701wd.m17128a()), c2480Ad, c3752yc);
    }

    /* renamed from: a */
    public void m16912a(C2885Qi c2885Qi) {
        this.f24909c.m13857a(c2885Qi);
        this.f24907a.m16119a(c2885Qi);
    }

    /* renamed from: a */
    public void m16913a(C2978Uc c2978Uc) {
        this.f24909c.m13858a(c2978Uc);
        this.f24910d.m17233a(c2978Uc);
        this.f24907a.m16120a(c2978Uc);
        this.f24908b.m14771a(c2978Uc);
    }

    private C3649ud(C3675vd c3675vd, C3701wd c3701wd, C3389kd c3389kd, C2480Ad c2480Ad, C3752yc c3752yc) {
        this(c3675vd, c3701wd, c3389kd, new C3727xd(c3675vd.f25007a.f25415a, c3675vd.f25009c, c2480Ad, c3752yc, c3675vd.f25008b.m14878d()), c2480Ad, c3752yc);
    }

    private C3649ud(C3675vd c3675vd, C3701wd c3701wd, C3389kd c3389kd, C3727xd c3727xd, C2480Ad c2480Ad, C3752yc c3752yc) {
        this(c3675vd, new C3363jd(c3389kd, c3727xd), new C2854Pc(C2879Qc.m14846a(c3675vd, c2480Ad, c3752yc, c3701wd.m17130c(), c3701wd.m17129b())), c2480Ad, c3752yc);
    }

    public C3649ud(C3675vd c3675vd, C3363jd c3363jd, C2854Pc c2854Pc, C2480Ad c2480Ad, C3752yc c3752yc) {
        this.f24907a = c3363jd;
        this.f24908b = c2854Pc;
        this.f24909c = c2480Ad;
        this.f24910d = c3752yc;
    }
}
