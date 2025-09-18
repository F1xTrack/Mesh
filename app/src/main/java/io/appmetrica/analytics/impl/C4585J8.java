package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* renamed from: io.appmetrica.analytics.impl.J8 */
/* loaded from: classes2.dex */
public final class C4585J8 {

    /* renamed from: a */
    public final String f30337a;

    /* renamed from: b */
    public String f30338b;

    /* renamed from: c */
    public final Long f30339c;

    /* renamed from: d */
    public final Long f30340d;

    /* renamed from: e */
    public final Long f30341e;

    /* renamed from: f */
    public final Long f30342f;

    /* renamed from: g */
    public final C5216j7 f30343g;

    /* renamed from: h */
    public final EnumC4898Wa f30344h;

    /* renamed from: i */
    public final Integer f30345i;

    /* renamed from: j */
    public final String f30346j;

    /* renamed from: k */
    public final Integer f30347k;

    /* renamed from: l */
    public final Integer f30348l;

    /* renamed from: m */
    public final String f30349m;

    /* renamed from: n */
    public final String f30350n;

    /* renamed from: o */
    public final EnumC4465E8 f30351o;

    /* renamed from: p */
    public final EnumC4994aa f30352p;

    /* renamed from: q */
    public final EnumC5243k9 f30353q;

    /* renamed from: r */
    public final Boolean f30354r;

    /* renamed from: s */
    public final Integer f30355s;

    /* renamed from: t */
    public final byte[] f30356t;

    public C4585J8(ContentValues contentValues) {
        C5116f7 model = new C5141g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f30337a = model.m20366a().m20317j();
        this.f30338b = model.m20366a().m20323p();
        this.f30339c = model.m20368c();
        this.f30340d = model.m20367b();
        this.f30341e = model.m20366a().m20318k();
        this.f30342f = model.m20369d();
        this.f30343g = model.m20366a().m20316i();
        this.f30344h = model.m20370e();
        this.f30345i = model.m20366a().m20311d();
        this.f30346j = model.m20366a().m20313f();
        this.f30347k = model.m20366a().m20322o();
        this.f30348l = model.m20366a().m20310c();
        this.f30349m = model.m20366a().m20309b();
        this.f30350n = model.m20366a().m20320m();
        EnumC4465E8 enumC4465E8M20312e = model.m20366a().m20312e();
        this.f30351o = enumC4465E8M20312e == null ? EnumC4465E8.m19340a(null) : enumC4465E8M20312e;
        EnumC4994aa enumC4994aaM20315h = model.m20366a().m20315h();
        this.f30352p = enumC4994aaM20315h == null ? EnumC4994aa.m20117a(null) : enumC4994aaM20315h;
        this.f30353q = model.m20366a().m20321n();
        this.f30354r = model.m20366a().m20308a();
        this.f30355s = model.m20366a().m20319l();
        this.f30356t = model.m20366a().m20314g();
    }
}
