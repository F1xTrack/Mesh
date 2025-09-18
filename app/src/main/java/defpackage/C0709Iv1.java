package defpackage;

/* renamed from: Iv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0709Iv1 implements InterfaceC8267yw1 {
    public final C0631Hv1 a;
    public final C1247Pt0 b;
    public final InterfaceC6646qQ0 c;
    public final C2034Zv1 d;
    public final C0985Mk e;
    public final Object f;
    public boolean g;

    public C0709Iv1(C0631Hv1 c0631Hv1, C1247Pt0 c1247Pt0, InterfaceC6646qQ0 interfaceC6646qQ0, C2034Zv1 c2034Zv1, C0985Mk c0985Mk) {
        O90.f(c0631Hv1, "syncWorkerScheduler");
        O90.f(c1247Pt0, "getActualConfigUseCase");
        O90.f(interfaceC6646qQ0, "remoteConfigClientEventListener");
        O90.f(c2034Zv1, "remoteConfigAnalytics");
        O90.f(c0985Mk, "sendShortSegmentsUseCase");
        this.a = c0631Hv1;
        this.b = c1247Pt0;
        this.c = interfaceC6646qQ0;
        this.d = c2034Zv1;
        this.e = c0985Mk;
        this.f = new Object();
    }

    @Override // defpackage.InterfaceC8267yw1
    public final Q81 a() {
        Q81 q81A = F12.a(new C4265i11(new C4265i11(new C3311d11(new S51(14, this)), C1404Rt1.l, 3), new C3291cv1(this, 1), 1));
        q81A.b(null, new C0241Cv1(this, 1));
        return q81A;
    }

    @Override // defpackage.InterfaceC8267yw1
    public final Q81 b() {
        Q81 q81A = F12.a(new C4265i11(new C3311d11(new S51(14, this)), C1404Rt1.l, 3));
        q81A.b(null, new C0241Cv1(this, 0));
        return q81A;
    }
}
