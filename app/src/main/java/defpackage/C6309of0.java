package defpackage;

/* renamed from: of0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6309of0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC6500pf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6309of0(AbstractC6500pf0 abstractC6500pf0, int i) {
        super(0);
        this.e = i;
        this.f = abstractC6500pf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return W22.a(this.f, true);
            default:
                AbstractC6500pf0 abstractC6500pf0 = this.f;
                FE0 fe0C = abstractC6500pf0.u().p().c();
                return fe0C == null ? EZ1.c(abstractC6500pf0.u().p(), S20.b) : fe0C;
        }
    }
}
