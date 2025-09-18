package p000;

/* loaded from: classes.dex */
public final class G81 implements InterfaceC1445Wy {

    /* renamed from: a */
    public final /* synthetic */ L21 f3599a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1445Wy f3600b;

    /* renamed from: c */
    public final /* synthetic */ ExecutorC9387fa0 f3601c;

    public G81(L21 l21, InterfaceC1445Wy interfaceC1445Wy, ExecutorC9387fa0 executorC9387fa0) {
        this.f3599a = l21;
        this.f3600b = interfaceC1445Wy;
        this.f3601c = executorC9387fa0;
    }

    @Override // p000.InterfaceC1445Wy
    /* renamed from: a */
    public final void mo2929a(R81 r81) {
        InterfaceC1445Wy interfaceC1445Wy = this.f3600b;
        ExecutorC9387fa0 executorC9387fa0 = this.f3601c;
        L21 l21 = this.f3599a;
        try {
            executorC9387fa0.execute(new RunnableC1192Sx(l21, interfaceC1445Wy, r81, 16));
        } catch (Exception e) {
            l21.m4874f(new C6838sg(e));
        }
    }
}
