package com.yandex.metrica.impl.ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3126ud {
    private final C2852jd a;
    private final Pc b;
    private final Ad c;
    private final C3230yc d;

    public C3126ud(C3151vd c3151vd) {
        C3181wd c3181wd = new C3181wd(c3151vd.a.a);
        C3255zc c3255zc = c3151vd.a;
        this(c3151vd, c3181wd, new Ad(c3255zc.a, c3151vd.b, c3151vd.c, c3151vd.d, c3151vd.e, c3255zc.b), new C3230yc(c3151vd.c, c3151vd.d, c3151vd.e));
    }

    public void a() {
        this.c.a();
    }

    public Location b() {
        return this.a.b();
    }

    public void c() {
        this.a.a();
        this.b.b();
    }

    public void d() {
        this.a.c();
        this.b.d();
    }

    public void e() {
        this.a.d();
        this.b.e();
    }

    private C3126ud(C3151vd c3151vd, C3181wd c3181wd, Ad ad, C3230yc c3230yc) {
        this(c3151vd, c3181wd, C2877kd.a(c3151vd, ad, c3230yc, c3181wd.a()), ad, c3230yc);
    }

    public void a(Qi qi) {
        this.c.a(qi);
        this.a.a(qi);
    }

    public void a(Uc uc) {
        this.c.a(uc);
        this.d.a(uc);
        this.a.a(uc);
        this.b.a(uc);
    }

    private C3126ud(C3151vd c3151vd, C3181wd c3181wd, C2877kd c2877kd, Ad ad, C3230yc c3230yc) {
        this(c3151vd, c3181wd, c2877kd, new C3206xd(c3151vd.a.a, c3151vd.c, ad, c3230yc, c3151vd.b.d()), ad, c3230yc);
    }

    private C3126ud(C3151vd c3151vd, C3181wd c3181wd, C2877kd c2877kd, C3206xd c3206xd, Ad ad, C3230yc c3230yc) {
        this(c3151vd, new C2852jd(c2877kd, c3206xd), new Pc(Qc.a(c3151vd, ad, c3230yc, c3181wd.c(), c3181wd.b())), ad, c3230yc);
    }

    public C3126ud(C3151vd c3151vd, C2852jd c2852jd, Pc pc, Ad ad, C3230yc c3230yc) {
        this.a = c2852jd;
        this.b = pc;
        this.c = ad;
        this.d = c3230yc;
    }
}
