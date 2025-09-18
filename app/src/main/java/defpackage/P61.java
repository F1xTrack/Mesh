package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final /* synthetic */ class P61 implements InterfaceC6021n9 {
    public final /* synthetic */ R61 a;
    public final /* synthetic */ Q61 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ C0812Ke d;
    public final /* synthetic */ C0812Ke e;

    public /* synthetic */ P61(R61 r61, Q61 q61, int i, C0812Ke c0812Ke, C0812Ke c0812Ke2) {
        this.a = r61;
        this.b = q61;
        this.c = i;
        this.d = c0812Ke;
        this.e = c0812Ke2;
    }

    @Override // defpackage.InterfaceC6021n9
    public final InterfaceFutureC0750Jj0 apply(Object obj) {
        Q61 q61 = this.b;
        Surface surface = (Surface) obj;
        R61 r61 = this.a;
        r61.getClass();
        surface.getClass();
        try {
            q61.d();
            T61 t61 = new T61(surface, this.c, r61.g.a, this.d, this.e);
            t61.j.b.d(new M61(q61, 1), QR1.a());
            AbstractC3377dM1.i(q61.r == null, "Consumer can only be linked once.");
            q61.r = t61;
            return AbstractC1500Sz1.g(t61);
        } catch (C4123hH e) {
            return new F70(1, e);
        }
    }
}
