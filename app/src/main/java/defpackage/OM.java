package defpackage;

/* loaded from: classes2.dex */
public final class OM implements InterfaceC8267yw1 {
    public final /* synthetic */ int a = 0;
    public final C0631Hv1 b;
    public final InterfaceC0619Hr1 c;
    public final InterfaceC6646qQ0 d;
    public final C0985Mk e;
    public final C2034Zv1 f;
    public final Object g;
    public boolean h;
    public final Object i;

    public OM(C0631Hv1 c0631Hv1, InterfaceC0619Hr1 interfaceC0619Hr1, C0985Mk c0985Mk, C0944Lw0 c0944Lw0, InterfaceC6646qQ0 interfaceC6646qQ0, C2034Zv1 c2034Zv1) {
        O90.f(c0631Hv1, "syncWorkerScheduler");
        O90.f(interfaceC0619Hr1, "updatePersistableConfigUseCase");
        O90.f(c0985Mk, "sendShortSegmentsUseCase");
        O90.f(c0944Lw0, "getDefaultConfigUseCase");
        O90.f(interfaceC6646qQ0, "remoteConfigClientEventListener");
        O90.f(c2034Zv1, "remoteConfigAnalytics");
        this.b = c0631Hv1;
        this.c = interfaceC0619Hr1;
        this.e = c0985Mk;
        this.i = c0944Lw0;
        this.d = interfaceC6646qQ0;
        this.f = c2034Zv1;
        this.g = new Object();
    }

    @Override // defpackage.InterfaceC8267yw1
    public final Q81 a() {
        switch (this.a) {
            case 0:
                Q81 q81A = F12.a(new C4265i11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C3881g1(21, this)), C5284jI.C, 3), FK.a()), new C7071sf(this, 1), 1));
                q81A.b(null, new NM(this, 0));
                return q81A;
            default:
                Q81 q81A2 = F12.a(new C4265i11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new S51(2, this)), C0190Ce1.l, 3), FK.a()), new C5852mG0(this, 1), 1));
                q81A2.b(null, new C5638l81(this, 1));
                return q81A2;
        }
    }

    @Override // defpackage.InterfaceC8267yw1
    public final Q81 b() {
        switch (this.a) {
            case 0:
                Q81 q81A = F12.a(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C3881g1(21, this)), C5284jI.C, 3), FK.a()));
                q81A.b(null, new NM(this, 1));
                return q81A;
            default:
                Q81 q81A2 = F12.a(AbstractC6653qS1.c(new C4265i11(new C3311d11(new S51(2, this)), C0190Ce1.l, 3), FK.a()));
                q81A2.b(null, new C5638l81(this, 0));
                return q81A2;
        }
    }

    public OM(C0631Hv1 c0631Hv1, InterfaceC0619Hr1 interfaceC0619Hr1, InterfaceC6646qQ0 interfaceC6646qQ0, C7514uz0 c7514uz0, C0985Mk c0985Mk, C2034Zv1 c2034Zv1) {
        O90.f(c0631Hv1, "syncWorkerScheduler");
        O90.f(interfaceC0619Hr1, "updatePersistableConfigUseCase");
        O90.f(interfaceC6646qQ0, "remoteConfigClientEventListener");
        O90.f(c7514uz0, "getSnapshotConfigUseCase");
        O90.f(c0985Mk, "sendShortSegmentsUseCase");
        O90.f(c2034Zv1, "remoteConfigAnalytics");
        this.b = c0631Hv1;
        this.c = interfaceC0619Hr1;
        this.d = interfaceC6646qQ0;
        this.i = c7514uz0;
        this.e = c0985Mk;
        this.f = c2034Zv1;
        this.g = new Object();
    }
}
