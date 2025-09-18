package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Sf implements Rk, Da {
    public final Context a;
    public final Z4 b;
    public final C4419a5 c;
    public final Cl d;
    public final Ma e;

    public Sf(Context context, Z4 z4, D4 d4, InterfaceC4591h5 interfaceC4591h5, C4419a5 c4419a5, Ik ik) {
        this.a = context;
        this.b = z4;
        this.c = c4419a5;
        Cl clA = ik.a(context, z4, d4.a);
        this.d = clA;
        this.e = interfaceC4591h5.a(context, z4, d4.b, clA);
        ik.a(z4, this);
    }

    public final Z4 a() {
        return this.b;
    }

    public final Context b() {
        return this.a;
    }

    public final void a(InterfaceC4876t4 interfaceC4876t4) {
        this.c.a.add(interfaceC4876t4);
    }

    public final void b(InterfaceC4876t4 interfaceC4876t4) {
        this.c.a.remove(interfaceC4876t4);
    }

    @Override // io.appmetrica.analytics.impl.Rk
    public final void a(C4583gl c4583gl) {
        this.e.a(c4583gl);
    }

    @Override // io.appmetrica.analytics.impl.Rk
    public final void a(Kk kk, C4583gl c4583gl) {
        ((C4567g5) this.e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void a(D4 d4) {
        this.d.a(d4.a);
        this.e.a(d4.b);
    }

    public Sf(Context context, Z4 z4, D4 d4, InterfaceC4591h5 interfaceC4591h5) {
        this(context, z4, d4, interfaceC4591h5, new C4419a5(), Ik.a());
    }

    public final void a(T5 t5, D4 d4) {
        if (!AbstractC4857s9.c.contains(Wa.a(t5.d))) {
            this.e.a(d4.b);
        }
        ((C4567g5) this.e).a(t5);
    }
}
