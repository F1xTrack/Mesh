package defpackage;

/* loaded from: classes.dex */
public final class G81 implements InterfaceC1807Wy {
    public final /* synthetic */ L21 a;
    public final /* synthetic */ InterfaceC1807Wy b;
    public final /* synthetic */ ExecutorC3799fa0 c;

    public G81(L21 l21, InterfaceC1807Wy interfaceC1807Wy, ExecutorC3799fa0 executorC3799fa0) {
        this.a = l21;
        this.b = interfaceC1807Wy;
        this.c = executorC3799fa0;
    }

    @Override // defpackage.InterfaceC1807Wy
    public final void a(R81 r81) {
        InterfaceC1807Wy interfaceC1807Wy = this.b;
        ExecutorC3799fa0 executorC3799fa0 = this.c;
        L21 l21 = this.a;
        try {
            executorC3799fa0.execute(new RunnableC1492Sx(l21, interfaceC1807Wy, r81, 16));
        } catch (Exception e) {
            l21.f(new C7074sg(e));
        }
    }
}
