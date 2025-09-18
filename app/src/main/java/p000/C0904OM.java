package p000;

/* renamed from: OM */
/* loaded from: classes2.dex */
public final class C0904OM implements InterfaceC11861yw1 {

    /* renamed from: a */
    public final /* synthetic */ int f8387a = 0;

    /* renamed from: b */
    public final C7721Hv1 f8388b;

    /* renamed from: c */
    public final InterfaceC7713Hr1 f8389c;

    /* renamed from: d */
    public final InterfaceC10775qQ0 f8390d;

    /* renamed from: e */
    public final C0802Mk f8391e;

    /* renamed from: f */
    public final C8657Zv1 f8392f;

    /* renamed from: g */
    public final Object f8393g;

    /* renamed from: h */
    public boolean f8394h;

    /* renamed from: i */
    public final Object f8395i;

    public C0904OM(C7721Hv1 c7721Hv1, InterfaceC7713Hr1 interfaceC7713Hr1, C0802Mk c0802Mk, C7930Lw0 c7930Lw0, InterfaceC10775qQ0 interfaceC10775qQ0, C8657Zv1 c8657Zv1) {
        O90.m5968f(c7721Hv1, "syncWorkerScheduler");
        O90.m5968f(interfaceC7713Hr1, "updatePersistableConfigUseCase");
        O90.m5968f(c0802Mk, "sendShortSegmentsUseCase");
        O90.m5968f(c7930Lw0, "getDefaultConfigUseCase");
        O90.m5968f(interfaceC10775qQ0, "remoteConfigClientEventListener");
        O90.m5968f(c8657Zv1, "remoteConfigAnalytics");
        this.f8388b = c7721Hv1;
        this.f8389c = interfaceC7713Hr1;
        this.f8391e = c0802Mk;
        this.f8395i = c7930Lw0;
        this.f8390d = interfaceC10775qQ0;
        this.f8392f = c8657Zv1;
        this.f8393g = new Object();
    }

    @Override // p000.InterfaceC11861yw1
    /* renamed from: a */
    public final Q81 mo4072a() {
        switch (this.f8387a) {
            case 0:
                Q81 q81M2484a = F12.m2484a(new C9699i11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C4090g1(21, this)), C6228jI.f35021C, 3), AbstractC0336FK.m2578a()), new C6837sf(this, 1), 1));
                q81M2484a.m6585b(null, new C0841NM(this, 0));
                return q81M2484a;
            default:
                Q81 q81M2484a2 = F12.m2484a(new C9699i11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new S51(2, this)), C7427Ce1.f1552l, 3), AbstractC0336FK.m2578a()), new C10243mG0(this, 1), 1));
                q81M2484a2.m6585b(null, new C10100l81(this, 1));
                return q81M2484a2;
        }
    }

    @Override // p000.InterfaceC11861yw1
    /* renamed from: b */
    public final Q81 mo4073b() {
        switch (this.f8387a) {
            case 0:
                Q81 q81M2484a = F12.m2484a(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C4090g1(21, this)), C6228jI.f35021C, 3), AbstractC0336FK.m2578a()));
                q81M2484a.m6585b(null, new C0841NM(this, 1));
                return q81M2484a;
            default:
                Q81 q81M2484a2 = F12.m2484a(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new S51(2, this)), C7427Ce1.f1552l, 3), AbstractC0336FK.m2578a()));
                q81M2484a2.m6585b(null, new C10100l81(this, 0));
                return q81M2484a2;
        }
    }

    public C0904OM(C7721Hv1 c7721Hv1, InterfaceC7713Hr1 interfaceC7713Hr1, InterfaceC10775qQ0 interfaceC10775qQ0, C11357uz0 c11357uz0, C0802Mk c0802Mk, C8657Zv1 c8657Zv1) {
        O90.m5968f(c7721Hv1, "syncWorkerScheduler");
        O90.m5968f(interfaceC7713Hr1, "updatePersistableConfigUseCase");
        O90.m5968f(interfaceC10775qQ0, "remoteConfigClientEventListener");
        O90.m5968f(c11357uz0, "getSnapshotConfigUseCase");
        O90.m5968f(c0802Mk, "sendShortSegmentsUseCase");
        O90.m5968f(c8657Zv1, "remoteConfigAnalytics");
        this.f8388b = c7721Hv1;
        this.f8389c = interfaceC7713Hr1;
        this.f8390d = interfaceC10775qQ0;
        this.f8395i = c11357uz0;
        this.f8391e = c0802Mk;
        this.f8392f = c8657Zv1;
        this.f8393g = new Object();
    }
}
