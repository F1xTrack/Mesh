package defpackage;

/* renamed from: h11 */
/* loaded from: classes2.dex */
public final class C4074h11 extends AbstractC2435c11 {
    public final /* synthetic */ int a = 2;
    public final AbstractC2435c11 b;
    public final Object c;

    public C4074h11(AbstractC2435c11 abstractC2435c11, AK ak) {
        O90.f(ak, "dispatcher");
        this.b = abstractC2435c11;
        this.c = ak;
    }

    @Override // defpackage.AbstractC2435c11
    public final void a(InterfaceC6187o11 interfaceC6187o11) {
        switch (this.a) {
            case 0:
                ((C4074h11) this.b).a(new C3883g11(interfaceC6187o11, this));
                break;
            case 1:
                ((C4074h11) this.b).a(new C3883g11(interfaceC6187o11, this, (byte) 0));
                break;
            default:
                ((AK) this.c).a(new C7726w5(this, 24, interfaceC6187o11));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4074h11(C4074h11 c4074h11, InterfaceC5908mZ interfaceC5908mZ) {
        this.b = c4074h11;
        this.c = (AbstractC1676Vg0) interfaceC5908mZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4074h11(C4074h11 c4074h11, InterfaceC6099nZ interfaceC6099nZ) {
        this.b = c4074h11;
        this.c = (AbstractC1676Vg0) interfaceC6099nZ;
    }
}
