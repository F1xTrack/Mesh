package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class U5 extends H4 {
    public U5(String str, double d) {
        super(2, str, Double.valueOf(d), new C4668kb(), new G4(new Ab(new A4(100))));
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final void a(C4462bn c4462bn) {
        C4512dn c4512dn = c4462bn.d;
        c4512dn.c = ((Double) this.f).doubleValue() + c4512dn.c;
    }
}
