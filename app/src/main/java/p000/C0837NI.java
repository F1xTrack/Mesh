package p000;

/* renamed from: NI */
/* loaded from: classes2.dex */
public final class C0837NI extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f7719e;

    /* renamed from: f */
    public final /* synthetic */ C0963PI f7720f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC1088RI f7721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0837NI(C0963PI c0963pi, AbstractC1088RI abstractC1088RI, int i) {
        super(0);
        this.f7719e = i;
        this.f7720f = c0963pi;
        this.f7721g = abstractC1088RI;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f7719e) {
            case 0:
                return AbstractC11433vZ0.m25452c(this.f7720f.f8983a.keySet(), this.f7721g.mo2114o());
            default:
                return AbstractC11433vZ0.m25452c(this.f7720f.f8984b.keySet(), this.f7721g.mo2115p());
        }
    }
}
