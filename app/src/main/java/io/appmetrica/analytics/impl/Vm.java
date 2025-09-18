package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Vm extends O4 {
    public final E6 b;

    public Vm(L4 l4, E6 e6) {
        super(l4);
        this.b = e6;
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final boolean a(T5 t5, I4 i4) {
        C4 c4 = i4.b.d.a;
        this.b.a(c4.i);
        Boolean bool = c4.b;
        if (Boolean.TRUE.equals(bool)) {
            C4667ka.C.j().a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            C4667ka.C.j().a(false);
        }
        return false;
    }
}
