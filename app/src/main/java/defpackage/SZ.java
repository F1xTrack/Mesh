package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class SZ implements InterfaceC0443Fl, InterfaceC6021n9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceFutureC0750Jj0 b;

    public /* synthetic */ SZ(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0, int i) {
        this.a = i;
        this.b = interfaceFutureC0750Jj0;
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((InterfaceC7477un) this.b.get()).a();
            default:
                return ((InterfaceC7477un) this.b.get()).b();
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 0:
                HG hg = new HG(1, c0365El);
                TJ tjA = QR1.a();
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = this.b;
                interfaceFutureC0750Jj0.d(hg, tjA);
                return "transformVoidFuture [" + interfaceFutureC0750Jj0 + "]";
            default:
                TJ tjA2 = QR1.a();
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj02 = this.b;
                AbstractC1500Sz1.n(false, interfaceFutureC0750Jj02, c0365El, tjA2);
                return "nonCancellationPropagating[" + interfaceFutureC0750Jj02 + "]";
        }
    }
}
