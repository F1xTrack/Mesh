package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class H4 extends AbstractC4502dd {
    public final Object f;

    public H4(int i, String str, Object obj, on onVar, R2 r2) {
        super(i, str, onVar, r2);
        this.f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4502dd, io.appmetrica.analytics.impl.InterfaceC4437an
    public final void a(Zm zm) {
        if (f()) {
            R2 r2 = this.d;
            int i = this.b;
            C4462bn c4462bnA = r2.a(zm, (C4462bn) ((HashMap) zm.a.get(i)).get(this.a), this);
            if (c4462bnA != null) {
                a(c4462bnA);
            }
        }
    }

    public abstract void a(C4462bn c4462bn);

    public final Object g() {
        return this.f;
    }
}
