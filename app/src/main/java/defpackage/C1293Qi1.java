package defpackage;

/* renamed from: Qi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293Qi1 implements InterfaceC3296cx0 {
    public InterfaceC1930Yn a;
    public boolean b;

    @Override // defpackage.InterfaceC3296cx0
    public final void a(Object obj) {
        AbstractC3377dM1.i(DV1.c(), "SourceStreamRequirementObserver can be updated from main thread only");
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == zEquals) {
            return;
        }
        this.b = zEquals;
        InterfaceC1930Yn interfaceC1930Yn = this.a;
        if (interfaceC1930Yn == null) {
            AbstractC0759Jm0.f("VideoCapture");
        } else if (zEquals) {
            interfaceC1930Yn.P0();
        } else {
            interfaceC1930Yn.t();
        }
    }

    @Override // defpackage.InterfaceC3296cx0
    public final void onError(Throwable th) {
        AbstractC0759Jm0.f("VideoCapture");
    }
}
