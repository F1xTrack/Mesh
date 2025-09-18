package io.appmetrica.analytics.impl;

import android.app.Activity;
import p000.C8125Pp1;
import p000.C8177Qp1;

/* renamed from: io.appmetrica.analytics.impl.Zj */
/* loaded from: classes2.dex */
public final class C4979Zj {

    /* renamed from: a */
    public final C5358p f31209a;

    /* renamed from: b */
    public final C5439s5 f31210b;

    /* renamed from: c */
    public final InterfaceC5308n f31211c;

    /* renamed from: d */
    public final InterfaceC5308n f31212d;

    /* renamed from: e */
    public final C5408r f31213e;

    /* renamed from: f */
    public final C5258l f31214f;

    /* renamed from: g */
    public boolean f31215g;

    public C4979Zj(C5358p c5358p, C5258l c5258l) {
        this(c5358p, c5258l, new C5439s5(), new C5408r());
    }

    /* renamed from: a */
    public final void m20091a(Activity activity, EnumC5283m enumC5283m) {
        synchronized (this) {
            try {
                if (this.f31215g) {
                    C5439s5 c5439s5 = this.f31210b;
                    C8177Qp1 c8177Qp1 = new C8177Qp1(this, activity, 0);
                    c5439s5.getClass();
                    C5388q4.m20928h().f32420c.m20407a().execute(new RunnableC5414r5(c5439s5, c8177Qp1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m20093b(Activity activity, EnumC5283m enumC5283m) {
        synchronized (this) {
            try {
                if (this.f31215g) {
                    C5439s5 c5439s5 = this.f31210b;
                    C8177Qp1 c8177Qp1 = new C8177Qp1(this, activity, 1);
                    c5439s5.getClass();
                    C5388q4.m20928h().f32420c.m20407a().execute(new RunnableC5414r5(c5439s5, c8177Qp1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C4979Zj(C5358p c5358p, C5258l c5258l, C5439s5 c5439s5, C5408r c5408r) {
        this.f31215g = false;
        this.f31209a = c5358p;
        this.f31214f = c5258l;
        this.f31210b = c5439s5;
        this.f31213e = c5408r;
        this.f31211c = new C8125Pp1(0, this);
        this.f31212d = new C8125Pp1(1, this);
    }

    /* renamed from: a */
    public final synchronized EnumC5333o m20089a() {
        try {
            if (!this.f31215g) {
                this.f31209a.m20894a(this.f31211c, EnumC5283m.RESUMED);
                this.f31209a.m20894a(this.f31212d, EnumC5283m.PAUSED);
                this.f31215g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31209a.f32368b;
    }

    /* renamed from: b */
    public final void m20092b(Activity activity, C4899Wb c4899Wb) {
        if (this.f31213e.m20986a(activity, EnumC5383q.PAUSED)) {
            c4899Wb.mo19408b(activity);
        }
    }

    /* renamed from: a */
    public final void m20090a(Activity activity, C4899Wb c4899Wb) {
        if (this.f31213e.m20986a(activity, EnumC5383q.RESUMED)) {
            c4899Wb.mo19402a(activity);
        }
    }
}
