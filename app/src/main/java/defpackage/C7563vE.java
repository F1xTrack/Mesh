package defpackage;

/* renamed from: vE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7563vE implements InterfaceC1373Rj0, InterfaceC0443Fl {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C7563vE(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        JG jg = (JG) this.c;
        jg.getClass();
        jg.b(new RunnableC3529eA(jg, 10, new C7447ud(this.a, this.b, c0365El)), new HG(0, c0365El));
        return "DefaultSurfaceProcessor#snapshot";
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        ((Z3) obj).p((Y3) this.c, this.a, this.b);
    }
}
