package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4537f implements InterfaceC4876t4 {
    public final Context a;
    public final Sf b;

    public AbstractC4537f(Context context, Sf sf) {
        this.a = context.getApplicationContext();
        this.b = sf;
        sf.a(this);
        C4667ka.h().k().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4876t4
    public final void a(T5 t5, D4 d4) {
        b(t5, d4);
    }

    public final Sf b() {
        return this.b;
    }

    public abstract void b(T5 t5, D4 d4);

    public final Context c() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4876t4
    public final void a() {
        this.b.b(this);
        C4667ka.C.j().a(this);
    }
}
