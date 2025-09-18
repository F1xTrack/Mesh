package defpackage;

/* loaded from: classes2.dex */
public final class NI extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ PI f;
    public final /* synthetic */ RI g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NI(PI pi, RI ri, int i) {
        super(0);
        this.e = i;
        this.f = pi;
        this.g = ri;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return AbstractC7627vZ0.c(this.f.a.keySet(), this.g.o());
            default:
                return AbstractC7627vZ0.c(this.f.b.keySet(), this.g.p());
        }
    }
}
