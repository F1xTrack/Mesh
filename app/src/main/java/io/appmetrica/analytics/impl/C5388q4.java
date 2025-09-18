package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.q4 */
/* loaded from: classes2.dex */
public final class C5388q4 {

    /* renamed from: q */
    public static volatile C5388q4 f32417q;

    /* renamed from: a */
    public final C4851Ub f32418a;

    /* renamed from: b */
    public final C4439D7 f32419b;

    /* renamed from: c */
    public final C5138g4 f32420c;

    /* renamed from: d */
    public final C4506G1 f32421d;

    /* renamed from: e */
    public final C5358p f32422e;

    /* renamed from: f */
    public final C4979Zj f32423f;

    /* renamed from: g */
    public final C4558I5 f32424g;

    /* renamed from: h */
    public final C5258l f32425h;

    /* renamed from: i */
    public final C5231jm f32426i;

    /* renamed from: j */
    public C4948Yc f32427j;

    /* renamed from: k */
    public final C5184i0 f32428k;

    /* renamed from: l */
    public volatile C5313n4 f32429l;

    /* renamed from: m */
    public final C4419Cc f32430m;

    /* renamed from: n */
    public volatile C5298me f32431n;

    /* renamed from: o */
    public C5427ri f32432o;

    /* renamed from: p */
    public final C5334o0 f32433p;

    public C5388q4(C4851Ub c4851Ub, C5358p c5358p, C5138g4 c5138g4) {
        this(c4851Ub, c5358p, c5138g4, new C5258l(c5358p));
    }

    /* renamed from: h */
    public static C5388q4 m20928h() {
        if (f32417q == null) {
            synchronized (C5388q4.class) {
                try {
                    if (f32417q == null) {
                        f32417q = new C5388q4(new C4851Ub(), new C5358p(), new C5138g4());
                    }
                } finally {
                }
            }
        }
        return f32417q;
    }

    /* renamed from: a */
    public final C5358p m20930a() {
        return this.f32422e;
    }

    /* renamed from: b */
    public final C5184i0 m20931b() {
        return this.f32428k;
    }

    /* renamed from: c */
    public final C5334o0 m20933c() {
        return this.f32433p;
    }

    /* renamed from: d */
    public final C4506G1 m20934d() {
        return this.f32421d;
    }

    /* renamed from: e */
    public final C5138g4 m20935e() {
        return this.f32420c;
    }

    /* renamed from: f */
    public final C4558I5 m20936f() {
        return this.f32424g;
    }

    /* renamed from: g */
    public final C4439D7 m20937g() {
        return this.f32419b;
    }

    /* renamed from: i */
    public final C4851Ub m20938i() {
        return this.f32418a;
    }

    /* renamed from: j */
    public final C5313n4 m20939j() {
        C5313n4 c5313n4 = this.f32429l;
        if (c5313n4 == null) {
            synchronized (this) {
                try {
                    c5313n4 = this.f32429l;
                    if (c5313n4 == null) {
                        c5313n4 = new C5313n4();
                        this.f32429l = c5313n4;
                    }
                } finally {
                }
            }
        }
        return c5313n4;
    }

    /* renamed from: k */
    public final C4851Ub m20940k() {
        return this.f32418a;
    }

    /* renamed from: l */
    public final C4979Zj m20941l() {
        return this.f32423f;
    }

    public C5388q4(C4851Ub c4851Ub, C5358p c5358p, C5138g4 c5138g4, C5258l c5258l) {
        this(c4851Ub, new C4439D7(), c5138g4, c5258l, new C4506G1(), c5358p, new C4979Zj(c5358p, c5258l), new C4558I5(c5358p), new C5231jm(), new C5184i0());
    }

    /* renamed from: a */
    public final synchronized C4948Yc m20929a(Context context) {
        try {
            if (this.f32427j == null) {
                this.f32427j = new C4948Yc(context, new C5207in());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32427j;
    }

    /* renamed from: b */
    public final C5298me m20932b(Context context) {
        C5298me c5298me = this.f32431n;
        if (c5298me == null) {
            synchronized (this) {
                try {
                    c5298me = this.f32431n;
                    if (c5298me == null) {
                        c5298me = new C5298me(C4966Z6.m20064a(context).m20066a());
                        this.f32431n = c5298me;
                    }
                } finally {
                }
            }
        }
        return c5298me;
    }

    public C5388q4(C4851Ub c4851Ub, C4439D7 c4439d7, C5138g4 c5138g4, C5258l c5258l, C4506G1 c4506g1, C5358p c5358p, C4979Zj c4979Zj, C4558I5 c4558i5, C5231jm c5231jm, C5184i0 c5184i0) {
        this.f32430m = new C4419Cc();
        this.f32433p = new C5334o0();
        this.f32418a = c4851Ub;
        this.f32419b = c4439d7;
        this.f32420c = c5138g4;
        this.f32425h = c5258l;
        this.f32421d = c4506g1;
        this.f32422e = c5358p;
        this.f32423f = c4979Zj;
        this.f32424g = c4558i5;
        this.f32426i = c5231jm;
        this.f32428k = c5184i0;
    }
}
