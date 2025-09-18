package io.appmetrica.analytics.impl;

import android.app.Activity;
import defpackage.C1236Pp1;
import defpackage.C1314Qp1;

/* loaded from: classes2.dex */
public final class Zj {
    public final C4776p a;
    public final C4853s5 b;
    public final InterfaceC4728n c;
    public final InterfaceC4728n d;
    public final r e;
    public final C4680l f;
    public boolean g;

    public Zj(C4776p c4776p, C4680l c4680l) {
        this(c4776p, c4680l, new C4853s5(), new r());
    }

    public final void a(Activity activity, EnumC4704m enumC4704m) {
        synchronized (this) {
            try {
                if (this.g) {
                    C4853s5 c4853s5 = this.b;
                    C1314Qp1 c1314Qp1 = new C1314Qp1(this, activity, 0);
                    c4853s5.getClass();
                    C4805q4.h().c.a().execute(new RunnableC4829r5(c4853s5, c1314Qp1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, EnumC4704m enumC4704m) {
        synchronized (this) {
            try {
                if (this.g) {
                    C4853s5 c4853s5 = this.b;
                    C1314Qp1 c1314Qp1 = new C1314Qp1(this, activity, 1);
                    c4853s5.getClass();
                    C4805q4.h().c.a().execute(new RunnableC4829r5(c4853s5, c1314Qp1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Zj(C4776p c4776p, C4680l c4680l, C4853s5 c4853s5, r rVar) {
        this.g = false;
        this.a = c4776p;
        this.f = c4680l;
        this.b = c4853s5;
        this.e = rVar;
        this.c = new C1236Pp1(0, this);
        this.d = new C1236Pp1(1, this);
    }

    public final synchronized EnumC4752o a() {
        try {
            if (!this.g) {
                this.a.a(this.c, EnumC4704m.RESUMED);
                this.a.a(this.d, EnumC4704m.PAUSED);
                this.g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.b;
    }

    public final void b(Activity activity, Wb wb) {
        if (this.e.a(activity, EnumC4800q.PAUSED)) {
            wb.b(activity);
        }
    }

    public final void a(Activity activity, Wb wb) {
        if (this.e.a(activity, EnumC4800q.RESUMED)) {
            wb.a(activity);
        }
    }
}
