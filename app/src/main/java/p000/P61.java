package p000;

import android.view.Surface;

/* loaded from: classes.dex */
public final /* synthetic */ class P61 implements InterfaceC6471n9 {

    /* renamed from: a */
    public final /* synthetic */ R61 f8860a;

    /* renamed from: b */
    public final /* synthetic */ Q61 f8861b;

    /* renamed from: c */
    public final /* synthetic */ int f8862c;

    /* renamed from: d */
    public final /* synthetic */ C0671Ke f8863d;

    /* renamed from: e */
    public final /* synthetic */ C0671Ke f8864e;

    public /* synthetic */ P61(R61 r61, Q61 q61, int i, C0671Ke c0671Ke, C0671Ke c0671Ke2) {
        this.f8860a = r61;
        this.f8861b = q61;
        this.f8862c = i;
        this.f8863d = c0671Ke;
        this.f8864e = c0671Ke2;
    }

    @Override // p000.InterfaceC6471n9
    public final InterfaceFutureC7800Jj0 apply(Object obj) {
        Q61 q61 = this.f8861b;
        Surface surface = (Surface) obj;
        R61 r61 = this.f8860a;
        r61.getClass();
        surface.getClass();
        try {
            q61.m18993d();
            T61 t61 = new T61(surface, this.f8862c, r61.f10008g.f3839a, this.f8863d, this.f8864e);
            t61.f11165j.f4484b.mo2494d(new M61(q61, 1), QR1.m6703a());
            AbstractC9104dM1.m17550i(q61.f9483r == null, "Consumer can only be linked once.");
            q61.f9483r = t61;
            return AbstractC8301Sz1.m7484g(t61);
        } catch (C4169hH e) {
            return new F70(1, e);
        }
    }
}
