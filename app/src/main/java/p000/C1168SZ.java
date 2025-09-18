package p000;

/* renamed from: SZ */
/* loaded from: classes.dex */
public final /* synthetic */ class C1168SZ implements InterfaceC0363Fl, InterfaceC6471n9 {

    /* renamed from: a */
    public final /* synthetic */ int f10854a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceFutureC7800Jj0 f10855b;

    public /* synthetic */ C1168SZ(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0, int i) {
        this.f10854a = i;
        this.f10855b = interfaceFutureC7800Jj0;
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        switch (this.f10854a) {
            case 2:
                return ((InterfaceC6971un) this.f10855b.get()).mo5104a();
            default:
                return ((InterfaceC6971un) this.f10855b.get()).mo5105b();
        }
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        switch (this.f10854a) {
            case 0:
                RunnableC0458HG runnableC0458HG = new RunnableC0458HG(1, c0300El);
                ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = this.f10855b;
                interfaceFutureC7800Jj0.mo2494d(runnableC0458HG, executorC1215TJM6703a);
                return "transformVoidFuture [" + interfaceFutureC7800Jj0 + "]";
            default:
                ExecutorC1215TJ executorC1215TJM6703a2 = QR1.m6703a();
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj02 = this.f10855b;
                AbstractC8301Sz1.m7491n(false, interfaceFutureC7800Jj02, c0300El, executorC1215TJM6703a2);
                return "nonCancellationPropagating[" + interfaceFutureC7800Jj02 + "]";
        }
    }
}
