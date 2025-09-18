package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.C1518Tf1;
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4568g6 extends C4578gg {
    public final Context f;
    public final Pg g;
    public final Ub h;
    public final C4783p6 i;

    public C4568g6(Context context, C4562g0 c4562g0, InterfaceC4459bk interfaceC4459bk, Pg pg) {
        super(c4562g0, interfaceC4459bk, pg);
        this.f = context;
        this.g = pg;
        this.h = C4805q4.h().i();
        this.i = new C4783p6(context);
    }

    public final void a(Pg pg) {
        if (pg.a.g != 0) {
            this.i.a(pg);
            return;
        }
        Intent intentA = Cj.a(this.f);
        T5 t5 = pg.a;
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = 5890;
        intentA.putExtras(t5.d(pg.e.c()));
        try {
            this.f.startService(intentA);
        } catch (Throwable unused) {
            this.i.a(pg);
        }
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean c() {
        a(this.g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Rg, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C1518Tf1.a;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.h.a(AppMetricaModule.NAME)) {
                this.i.a(this.g);
            } else {
                this.a.c();
                this.c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
