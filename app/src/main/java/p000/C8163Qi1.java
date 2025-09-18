package p000;

/* renamed from: Qi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8163Qi1 implements InterfaceC9049cx0 {

    /* renamed from: a */
    public InterfaceC1560Yn f9751a;

    /* renamed from: b */
    public boolean f9752b;

    @Override // p000.InterfaceC9049cx0
    /* renamed from: a */
    public final void mo2107a(Object obj) {
        AbstractC9104dM1.m17550i(DV1.m1718c(), "SourceStreamRequirementObserver can be updated from main thread only");
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.f9752b == zEquals) {
            return;
        }
        this.f9752b = zEquals;
        InterfaceC1560Yn interfaceC1560Yn = this.f9751a;
        if (interfaceC1560Yn == null) {
            AbstractC7806Jm0.m4412f("VideoCapture");
        } else if (zEquals) {
            interfaceC1560Yn.mo906P0();
        } else {
            interfaceC1560Yn.mo925t();
        }
    }

    @Override // p000.InterfaceC9049cx0
    public final void onError(Throwable th) {
        AbstractC7806Jm0.m4412f("VideoCapture");
    }
}
