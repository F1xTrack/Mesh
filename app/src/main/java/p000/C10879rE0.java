package p000;

/* renamed from: rE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10879rE0 implements InterfaceC7552Ep0 {

    /* renamed from: a */
    public final InterfaceC1397WC f41390a;

    /* renamed from: b */
    public final C8450Vw0 f41391b;

    /* renamed from: c */
    public InterfaceC1154SL f41392c;

    /* renamed from: d */
    public C3979eG f41393d;

    /* renamed from: e */
    public final int f41394e;

    public C10879rE0(InterfaceC1397WC interfaceC1397WC) {
        this(interfaceC1397WC, new C7063wF());
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: a */
    public final InterfaceC7552Ep0 mo2426a(C8450Vw0 c8450Vw0) {
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: b */
    public final InterfaceC7552Ep0 mo2427b(C7408Bv0 c7408Bv0) {
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: c */
    public final InterfaceC7552Ep0 mo2428c(boolean z) {
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: d */
    public final AbstractC6758rg mo2429d(C10825qp0 c10825qp0) {
        c10825qp0.f41186b.getClass();
        return new C11007sE0(c10825qp0, this.f41390a, this.f41391b, this.f41392c.mo7363d(c10825qp0), this.f41393d, this.f41394e);
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: e */
    public final InterfaceC7552Ep0 mo2430e(InterfaceC1154SL interfaceC1154SL) {
        YN1.m9280e(interfaceC1154SL, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f41392c = interfaceC1154SL;
        return this;
    }

    @Override // p000.InterfaceC7552Ep0
    /* renamed from: f */
    public final InterfaceC7552Ep0 mo2431f(C3979eG c3979eG) {
        YN1.m9280e(c3979eG, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f41393d = c3979eG;
        return this;
    }

    public C10879rE0(InterfaceC1397WC interfaceC1397WC, C7063wF c7063wF) {
        C8450Vw0 c8450Vw0 = new C8450Vw0(4, c7063wF);
        C6540oF c6540oF = new C6540oF(0);
        C3979eG c3979eG = new C3979eG(-1, 0);
        this.f41390a = interfaceC1397WC;
        this.f41391b = c8450Vw0;
        this.f41392c = c6540oF;
        this.f41393d = c3979eG;
        this.f41394e = 1048576;
    }
}
