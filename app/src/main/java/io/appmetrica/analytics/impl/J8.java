package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes2.dex */
public final class J8 {
    public final String a;
    public String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final C4640j7 g;
    public final Wa h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final E8 o;
    public final EnumC4424aa p;
    public final EnumC4666k9 q;
    public final Boolean r;
    public final Integer s;
    public final byte[] t;

    public J8(ContentValues contentValues) {
        C4545f7 model = new C4569g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.a = model.a().j();
        this.b = model.a().p();
        this.c = model.c();
        this.d = model.b();
        this.e = model.a().k();
        this.f = model.d();
        this.g = model.a().i();
        this.h = model.e();
        this.i = model.a().d();
        this.j = model.a().f();
        this.k = model.a().o();
        this.l = model.a().c();
        this.m = model.a().b();
        this.n = model.a().m();
        E8 e8E = model.a().e();
        this.o = e8E == null ? E8.a(null) : e8E;
        EnumC4424aa enumC4424aaH = model.a().h();
        this.p = enumC4424aaH == null ? EnumC4424aa.a(null) : enumC4424aaH;
        this.q = model.a().n();
        this.r = model.a().a();
        this.s = model.a().l();
        this.t = model.a().g();
    }
}
