package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.b4 */
/* loaded from: classes2.dex */
public class C2644b4 {
    private final C2965o1 a;

    public C2644b4() {
        this(P0.i().j());
    }

    public C2820i5<AbstractC2795h5, Z3> a(Z3 z3) {
        return new C2820i5<>(new C2645b5(z3), z3);
    }

    public C2644b4(C2965o1 c2965o1) {
        this.a = c2965o1;
    }

    public Q2<Z3> a(Z3 z3, Si si) {
        Q2<Z3> q2 = new Q2<>(z3, new Yi(si));
        this.a.a(q2);
        return q2;
    }
}
